/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.apache.skywalking.oap.server.configuration.zookeeper.it;

import java.io.FileNotFoundException;
import java.io.Reader;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import lombok.extern.slf4j.Slf4j;
import org.apache.curator.RetryPolicy;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.apache.skywalking.oap.server.library.util.PropertyPlaceholderHelper;
import org.apache.skywalking.oap.server.library.module.ApplicationConfiguration;
import org.apache.skywalking.oap.server.library.module.ModuleManager;
import org.apache.skywalking.oap.server.library.util.CollectionUtils;
import org.apache.skywalking.oap.server.library.util.ResourceUtils;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.containers.wait.strategy.Wait;
import org.testcontainers.utility.DockerImageName;
import org.yaml.snakeyaml.Yaml;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

@Slf4j
public class ITZookeeperConfigurationTest {
    private final Yaml yaml = new Yaml();

    private MockZookeeperConfigurationProvider provider;

    @Rule
    public final GenericContainer<?> container =
        new GenericContainer<>(DockerImageName.parse("zookeeper:3.5"))
            .waitingFor(Wait.forLogMessage(".*binding to port.*", 1));

    private String zkAddress;

    @Before
    public void setUp() throws Exception {
        zkAddress = container.getHost() + ":" + container.getMappedPort(2181);
        System.setProperty("zk.address", zkAddress);

        final ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        loadConfig(applicationConfiguration);

        final ModuleManager moduleManager = new ModuleManager();
        moduleManager.init(applicationConfiguration);

        provider = (MockZookeeperConfigurationProvider) moduleManager.find(MockZookeeperConfigurationModule.NAME)
                                                                     .provider();

        assertNotNull(provider);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Test(timeout = 20000)
    public void shouldReadUpdated() throws Exception {
        String namespace = "/default";
        String key = "test-module.default.testKey";
        assertNull(provider.watcher.value());

        RetryPolicy retryPolicy = new ExponentialBackoffRetry(1000, 3);
        CuratorFramework client = CuratorFrameworkFactory.newClient(zkAddress, retryPolicy);
        client.start();
        log.info("per path: " + namespace + "/" + key);

        assertTrue(client.create().creatingParentsIfNeeded().forPath(namespace + "/" + key, "500".getBytes()) != null);

        log.info("data: " + new String(client.getData().forPath(namespace + "/" + key)));

        for (String v = provider.watcher.value(); v == null; v = provider.watcher.value()) {
        }

        assertTrue(client.delete().forPath(namespace + "/" + key) == null);

        for (String v = provider.watcher.value(); v != null; v = provider.watcher.value()) {
        }

        assertNull(provider.watcher.value());
    }

    @Test(timeout = 20000)
    public void shouldReadUpdated4GroupConfig() throws Exception {
        String namespace = "/default";
        String key = "test-module.default.testKeyGroup";
        assertEquals("{}", provider.groupWatcher.groupItems().toString());

        RetryPolicy retryPolicy = new ExponentialBackoffRetry(1000, 3);
        CuratorFramework client = CuratorFrameworkFactory.newClient(zkAddress, retryPolicy);
        client.start();
        log.info("per path: " + namespace + "/" + key);

        assertTrue(client.create().creatingParentsIfNeeded().forPath(namespace + "/" + key + "/item1", "100".getBytes()) != null);
        assertTrue(client.create().creatingParentsIfNeeded().forPath(namespace + "/" + key + "/item2", "200".getBytes()) != null);

        log.info("data: " + new String(client.getData().forPath(namespace + "/" + key + "/item1")));
        log.info("data: " + new String(client.getData().forPath(namespace + "/" + key + "/item2")));

        for (String v = provider.groupWatcher.groupItems().get("item1"); v == null; v = provider.groupWatcher.groupItems().get("item1")) {
        }
        for (String v = provider.groupWatcher.groupItems().get("item2"); v == null; v = provider.groupWatcher.groupItems().get("item2")) {
        }

        assertTrue(client.delete().forPath(namespace + "/" + key + "/item1") == null);
        assertTrue(client.delete().forPath(namespace + "/" + key + "/item2") == null);

        for (String v = provider.groupWatcher.groupItems().get("item1"); v != null; v = provider.groupWatcher.groupItems().get("item1")) {
        }
        for (String v = provider.groupWatcher.groupItems().get("item2"); v != null; v = provider.groupWatcher.groupItems().get("item2")) {
        }

        assertNull(provider.groupWatcher.groupItems().get("item1"));
        assertNull(provider.groupWatcher.groupItems().get("item2"));
    }

    @SuppressWarnings("unchecked")
    private void loadConfig(ApplicationConfiguration configuration) throws FileNotFoundException {
        log.warn("[CTEST][LOAD-PARAM] " + getStackTrace());

        Reader applicationReader = ResourceUtils.read("application.yml");
        Map<String, Map<String, Object>> first = yaml.loadAs(applicationReader, Map.class);
        log.warn("First output" + getAsFormattedJsonString(first));
        Reader applicationReader2 = ResourceUtils.read("application2.yml");
        Map<String, Map<String, Object>> second = yaml.loadAs(applicationReader2, Map.class);
        log.warn("Second output" + getAsFormattedJsonString(second));

        Map<String, Map<String, Object>> moduleConfig = deepMerge(first, second);
        log.warn("Final output" + getAsFormattedJsonString(moduleConfig));

        log.info("moduleConfig" + moduleConfig);
        
        if (CollectionUtils.isNotEmpty(moduleConfig)) {
            moduleConfig.forEach((moduleName, providerConfig) -> {
                if (providerConfig.size() > 0) {
                    ApplicationConfiguration.ModuleConfiguration moduleConfiguration = configuration.addModule(moduleName);
                    providerConfig.forEach((name, propertiesConfig) -> {
                        Properties properties = new Properties();
                        if (propertiesConfig != null) {
                            ((Map) propertiesConfig).forEach((key, value) -> {
                                properties.put(key, value);
                                final Object replaceValue = yaml.load(PropertyPlaceholderHelper.INSTANCE.replacePlaceholders(value + "", properties));
                                if (replaceValue != null) {
                                    properties.replace(key, replaceValue);
                                }
                            });
                        }
                        moduleConfiguration.addProviderConfiguration(name, properties);
                    });
                }
             });
        }
    }

    private static String getStackTrace() {
        String stacktrace = " ";
        for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
            stacktrace = stacktrace.concat(element.getClassName() + "\t");
        }
        return stacktrace;
    }

    public static String getAsFormattedJsonString(Object object)
    {
        ObjectMapper mapper = new ObjectMapper();
        try
        {
            return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(object);
        }
        catch (JsonProcessingException e)
        {
            e.printStackTrace();
        }
        return "";
    }

    private static Map deepMerge(Map original, Map newMap) {
        for (Object key : newMap.keySet()) {
            if (newMap.get(key) instanceof Map && original.get(key) instanceof Map) {
                Map originalChild = (Map) original.get(key);
                Map newChild = (Map) newMap.get(key);
                original.put(key, deepMerge(originalChild, newChild));
            } else if (newMap.get(key) instanceof List && original.get(key) instanceof List) {
                List originalChild = (List) original.get(key);
                List newChild = (List) newMap.get(key);
                for (Object each : newChild) {
                    if (!originalChild.contains(each)) {
                        originalChild.add(each);
                    }
                }
            } else {
                original.put(key, newMap.get(key));
            }
        }
        return original;
    }
}
