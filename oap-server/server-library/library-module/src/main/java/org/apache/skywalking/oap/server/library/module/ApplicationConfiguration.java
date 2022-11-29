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

package org.apache.skywalking.oap.server.library.module;

import java.util.HashMap;
import java.util.Properties;
import lombok.extern.slf4j.Slf4j;

/**
 * Modulization configurations. The {@link ModuleManager} is going to start, lookup, start modules based on this.
 */
@Slf4j
public class ApplicationConfiguration {
    private HashMap<String, ModuleConfiguration> modules = new HashMap<>();

    public String[] moduleList() {
        return modules.keySet().toArray(new String[0]);
    }

    public ModuleConfiguration addModule(String moduleName) {
        log.warn("[CTEST][getModuleConfiguration] ###" + moduleName + "###" + getStackTrace());
        ModuleConfiguration newModule = new ModuleConfiguration();
        modules.put(moduleName, newModule);
        return newModule;
    }

    public boolean has(String moduleName) {
        return modules.containsKey(moduleName);
    }

    public ModuleConfiguration getModuleConfiguration(String name) {
        log.warn("[CTEST][getModuleConfiguration] ###" + name + "###" + getStackTrace());
        return modules.get(name);
    }

    private static String getStackTrace() {
        String stacktrace = " ";
        for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
            stacktrace = stacktrace.concat(element.getClassName() + "\t");
        }
        return stacktrace;
    }

    /**
     * The configurations about a certain module.
     */
    @Slf4j
    public static class ModuleConfiguration {
        private HashMap<String, ProviderConfiguration> providers = new HashMap<>();

        private ModuleConfiguration() {
        }

        public PropertiesWrapper getProviderConfiguration(String name) {
            log.warn("[CTEST][getProviderConfiguration] ###" + name + "### providers " + providers.get(name).getProperties() + getStackTrace());
            return providers.get(name).getProperties();
        }

        public boolean has(String name) {
            return providers.containsKey(name);
        }

        public ModuleConfiguration addProviderConfiguration(String name, Properties properties) {
            log.warn("[CTEST][getProviderConfiguration] ###" + name + "### providers " + properties + getStackTrace());
            ProviderConfiguration newProvider = new ProviderConfiguration(properties);
            providers.put(name, newProvider);
            return this;
        }
    }

    @Slf4j
    public static class PropertiesWrapper extends Properties {
        @Override
        public synchronized Object get(Object key) {
            log.info("[CTEST][PropertiesWrapper] ###" + key + "### test");
            return super.get(key);
        }

        @Override
        public String getProperty(String key) {
            log.info("[CTEST][PropertiesWrapper] ###" + key + "###");
            return super.getProperty(key);
        }

        @Override
        public synchronized java.lang.Object put(java.lang.Object key, java.lang.Object value) {
            log.info("[CTEST][PropertiesWrapper-reset] ###" + key + "### " + "***" + value + "***");
            return super.put(key, value);
        }
    }

    @Slf4j
    public static class SubPropertiesWrapper extends Properties {
        @Override
        public synchronized Object get(Object key) {
            log.info("[CTEST][SubPropertiesWrapper] ###" + key + "### test");
            return super.get(key);
        }

        @Override
        public String getProperty(String key) {
            log.info("[CTEST][SubPropertiesWrapper] ###" + key + "###");
            return super.getProperty(key);
        }

        @Override
        public synchronized java.lang.Object put(java.lang.Object key, java.lang.Object value) {
            log.info("[CTEST][SubPropertiesWrapper-reset] ###" + key + "### " + "***" + value + "***");
            return super.put(key, value);
        }
    }

    /**
     * The configuration about a certain provider of a module.
     */
    @Slf4j
    public static class ProviderConfiguration {
        private PropertiesWrapper propertiesWrapper;

        ProviderConfiguration(Properties properties) {
            PropertiesWrapper wrapper = new PropertiesWrapper();
            properties.forEach((k, v) -> {
                wrapper.put(k, v);
            });
            this.propertiesWrapper = wrapper;
        }

        private PropertiesWrapper getProperties() {
            return propertiesWrapper;
        }
    }
}
