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

package org.apache.skywalking.oap.server.storage.plugin.elasticsearch.base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.apache.skywalking.oap.server.core.Const;
import org.apache.skywalking.oap.server.core.analysis.FunctionCategory;
import org.apache.skywalking.oap.server.core.analysis.metrics.Metrics;
import org.apache.skywalking.oap.server.core.analysis.record.Record;
import org.apache.skywalking.oap.server.core.storage.model.Model;
import org.apache.skywalking.oap.server.core.storage.model.ModelColumn;
import org.apache.skywalking.oap.server.library.util.CollectionUtils;
import org.apache.skywalking.oap.server.library.util.StringUtil;

/**
 * The metrics data, that generated by OAL or MAL, would be partitioned to storage by the functions of the OAL or MAL.
 * And, the other record data would be insulated storage by themselves definitions.
 */
@Slf4j
public enum IndexController {
    INSTANCE;
    /**
     * Init in StorageModuleElasticsearchProvider.prepare() and the value from the config.
     */
    @Setter
    @Getter
    private boolean logicSharding = false;

    public String getTableName(Model model) {
        if (!logicSharding) {
            return isMetricModel(model) ? "metrics-all" :
                (isRecordModel(model) && !model.isSuperDataset() ? "records-all" : model.getName());
        }
        String aggFuncName = FunctionCategory.uniqueFunctionName(model.getStreamClass());
        return StringUtil.isNotBlank(aggFuncName) ? aggFuncName : model.getName();
    }

    /**
     * Generate the index doc ID. When a model is the aggregation storage mode, the logicTableName is a part of new ID
     * to avoid conflicts.
     */
    public String generateDocId(Model model, String originalID) {
        if (!logicSharding && isRecordModel(model) && !model.isSuperDataset()) {
            return this.generateDocId(model.getName(), originalID);
        }
        if (!isMetricModel(model)) {
            return originalID;
        }
        if (logicSharding && !isFunctionMetric(model)) {
            return originalID;
        }
        return this.generateDocId(model.getName(), originalID);
    }

    /**
     * Generate the index doc ID.
     */
    public String generateDocId(String logicTableName, String originalID) {
        return logicTableName + Const.ID_CONNECTOR + originalID;
    }

    /**
     * Check the mode of the Model definition.
     */
    public boolean isMetricModel(Model model) {
        return Metrics.class.isAssignableFrom(model.getStreamClass());
    }

    public boolean isRecordModel(Model model) {
        return Record.class.isAssignableFrom(model.getStreamClass());
    }

    public boolean isFunctionMetric(Model model) {
        return StringUtil.isNotBlank(FunctionCategory.uniqueFunctionName(model.getStreamClass()));
    }

    /**
     * There have two cases:
     * 1. When a model is the metric storage mode, a column named {@link LogicIndicesRegister#METRIC_TABLE_NAME} would be
     * appended to the physical index. The value of the column is the original table name in other storages, such as the
     * OAL name.
     *
     * 2. When a model is the record storage mode, it's not have the super dataset and the storage is not sharding,
     * a column named {@link LogicIndicesRegister#RECORD_TABLE_NAME} would be appended to the physical index.
     * The value of the column is the original table name in other storages.
     */
    public Map<String, Object> appendTableColumn(Model model, Map<String, Object> columns) {
        if (isMetricModel(model)) {
            columns.put(LogicIndicesRegister.METRIC_TABLE_NAME, model.getName());
        }
        if (!logicSharding && isRecordModel(model) && !model.isSuperDataset()) {
            columns.put(LogicIndicesRegister.RECORD_TABLE_NAME, model.getName());
        }
        return columns;
    }

    public static class LogicIndicesRegister {

        /**
         * The relations of the logic table and the physical table.
         */
        private static final Map<String, String> LOGIC_INDICES_CATALOG = new HashMap<>();

        private static final Map<String/*physical index name*/, Map<String/*column name*/, ModelColumn>> PHYSICAL_INDICES_COLUMNS = new HashMap<>();

        private static final Map<String/*logic index name*/, Map<String/*column name*/, String/*alias*/>> LOGIC_INDICES_COLUMNS_ALIAS = new HashMap<>();

        /**
         * The metric table name in aggregation physical storage.
         */
        public static final String METRIC_TABLE_NAME = "metric_table";

        /**
         * The record table name in aggregation physical storage.
         */
        public static final String RECORD_TABLE_NAME = "record_table";

        public static String getPhysicalTableName(String logicName) {
            return Optional.ofNullable(LOGIC_INDICES_CATALOG.get(logicName)).orElse(logicName);
        }

        public static void registerRelation(Model model, String physicalName) {
            LOGIC_INDICES_CATALOG.put(model.getName(), physicalName);
            Map<String, ModelColumn> columns = PHYSICAL_INDICES_COLUMNS.computeIfAbsent(
                physicalName, v -> new HashMap<>());
            if (!IndexController.INSTANCE.logicSharding) {
                model.getColumns().forEach(modelColumn -> {
                    String columnName = modelColumn.getColumnName().getName();
                    String alias = modelColumn.getElasticSearchExtension().getColumnAlias();
                    if (alias != null) {
                        Map<String, String> aliasMap = LOGIC_INDICES_COLUMNS_ALIAS.computeIfAbsent(
                            model.getName(), v -> new HashMap<>());
                        aliasMap.put(modelColumn.getColumnName().getName(), alias);
                        columnName = alias;
                    }
                    if (columns.containsKey(columnName)) {
                        checkModelColumnConflicts(columns.get(columnName), modelColumn, physicalName);
                    } else {
                        columns.put(columnName, modelColumn);
                    }
                });
            } else {
                model.getColumns().forEach(modelColumn -> {
                    String columnName = modelColumn.getColumnName().getName();
                    if (columns.containsKey(columnName)) {
                        checkModelColumnConflicts(columns.get(columnName), modelColumn, physicalName);
                    } else {
                        columns.put(columnName, modelColumn);
                    }
                });
            }

        }

        public static boolean isPhysicalTable(String logicName) {
            return !getPhysicalTableName(logicName).equals(logicName);
        }

        public static List<ModelColumn> getPhysicalTableColumns(Model model) {
            String tableName = getPhysicalTableName(model.getName());
            return new ArrayList<>(PHYSICAL_INDICES_COLUMNS.get(tableName).values());
        }

        /**
         * Get real physical column name by logic name.
         * Warning: This is only used to solve the column has alias.
         */
        @Deprecated
        public static String getPhysicalColumnName(String modelName, String columnName) {
            if (IndexController.INSTANCE.logicSharding) {
                return columnName;
            }

            Map<String, String> aliasMap = LOGIC_INDICES_COLUMNS_ALIAS.get(modelName);
            if (CollectionUtils.isEmpty(aliasMap)) {
                return columnName;
            }

            return aliasMap.getOrDefault(columnName, columnName);
        }

        /**
         * Check the columns conflicts when they in one physical index
         */
        private static void checkModelColumnConflicts(ModelColumn mc1, ModelColumn mc2, String physicalName) {
            if (!(mc1.isIndexOnly() == mc2.isIndexOnly())) {
                throw new IllegalArgumentException(mc1.getColumnName() + " and " + mc2.getColumnName() + " isIndexOnly conflict in index: " + physicalName);
            }
            if (!(mc1.isStorageOnly() == mc2.isStorageOnly())) {
                throw new IllegalArgumentException(mc1.getColumnName() + " and " + mc2.getColumnName() + " isStorageOnly conflict in index: " + physicalName);
            }
            if (!mc1.getType().equals(mc2.getType())) {
                throw new IllegalArgumentException(mc1.getColumnName() + " and " + mc2.getColumnName() + " Class type conflict in index: " + physicalName);
            }
            if (!(mc1.getElasticSearchExtension().needMatchQuery() == mc2.getElasticSearchExtension().needMatchQuery())) {
                throw new IllegalArgumentException(mc1.getColumnName() + " and " + mc2.getColumnName() + " needMatchQuery conflict in index: " + physicalName);
            }
        }
    }
}