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

package org.apache.skywalking.oap.server.starter.config;

import org.apache.skywalking.oap.server.library.module.ApplicationConfiguration;
import static org.apache.skywalking.oap.server.library.module.ApplicationConfiguration.PropertiesWrapper;
import org.junit.Before;
import org.junit.Test;

import java.util.Properties;
import lombok.extern.slf4j.Slf4j;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

@Slf4j
public class ApplicationConfigLoaderTestCase {

    private ApplicationConfiguration applicationConfiguration;

    @Before
    public void setUp() throws ConfigFileNotFoundException {
        log.error("System.getProperty1 {}", System.getProperty("SW_STORAGE"));
        System.setProperty("SW_STORAGE", "mysql");
        log.error("System.getProperty2 {}", System.getProperty("SW_STORAGE"));
        System.setProperty("SW_RECEIVER_ZIPKIN", "default");
        System.setProperty("SW_DATA_SOURCE_PASSWORD", "!AI!3B");
        ApplicationConfigLoader configLoader = new ApplicationConfigLoader();
        applicationConfiguration = configLoader.load();
    }

    @Test
    public void testLoadConfig() {
        PropertiesWrapper providerConfig = applicationConfiguration.getModuleConfiguration("storage")
                                                            .getProviderConfiguration("mysql");
        assertThat(providerConfig.get("metadataQueryMaxSize"), is(5000));
        assertThat(providerConfig.get("properties"), instanceOf(Properties.class));
        Properties properties = (Properties) providerConfig.get("properties");
        assertThat(properties.get("jdbcUrl"), is("jdbc:mysql://localhost:3306/swtest?rewriteBatchedStatements=true"));
    }

    @Test
    public void testLoadStringTypeConfig() {
        PropertiesWrapper providerConfig = applicationConfiguration.getModuleConfiguration("receiver-zipkin")
                .getProviderConfiguration("default");
        String host = (String) providerConfig.get("restHost");
        assertEquals("0.0.0.0", host);
    }

    @Test
    public void testLoadIntegerTypeConfig() {
        PropertiesWrapper providerConfig = applicationConfiguration.getModuleConfiguration("receiver-zipkin")
                .getProviderConfiguration("default");
        Integer port = (Integer) providerConfig.get("restPort");
        assertEquals(Integer.valueOf(9411), port);
    }

    @Test
    public void testLoadBooleanTypeConfig() {
        PropertiesWrapper providerConfig = applicationConfiguration.getModuleConfiguration("core")
                .getProviderConfiguration("default");
        Boolean enableDataKeeperExecutor = (Boolean) providerConfig.get("enableDataKeeperExecutor");
        assertEquals(Boolean.TRUE, enableDataKeeperExecutor);
    }

    @Test
    public void testLoadSpecialStringTypeConfig() {
        PropertiesWrapper providerConfig = applicationConfiguration.getModuleConfiguration("storage")
                .getProviderConfiguration("mysql");
        Properties properties = (Properties) providerConfig.get("properties");
        String password = (String) properties.get("dataSource.password");
        assertEquals("!AI!3B", password);
    }

}
