// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mariadb.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mariadb.models.TopQueryStatisticsResultList;

public final class TopQueryStatisticsResultListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TopQueryStatisticsResultList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"queryId\":\"eojnabc\",\"startTime\":\"2021-09-17T17:08:43Z\",\"endTime\":\"2021-11-20T16:21:10Z\",\"aggregationFunction\":\"psiebtfhvpes\",\"databaseNames\":[],\"queryExecutionCount\":6828337730937778205,\"metricName\":\"qmhjjdhtld\",\"metricDisplayName\":\"yzxuutkncw\",\"metricValue\":96.13681848110254,\"metricValueUnit\":\"lxotogtwrupq\"},\"id\":\"xvnmicykvceov\",\"name\":\"ilovnot\",\"type\":\"fj\"}],\"nextLink\":\"njbkcnxdhbttkph\"}")
                .toObject(TopQueryStatisticsResultList.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TopQueryStatisticsResultList model = new TopQueryStatisticsResultList();
        model = BinaryData.fromObject(model).toObject(TopQueryStatisticsResultList.class);
    }
}