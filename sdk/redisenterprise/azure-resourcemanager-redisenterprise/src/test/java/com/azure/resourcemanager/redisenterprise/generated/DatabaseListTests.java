// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redisenterprise.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.redisenterprise.fluent.models.DatabaseInner;
import com.azure.resourcemanager.redisenterprise.models.ClusteringPolicy;
import com.azure.resourcemanager.redisenterprise.models.DatabaseList;
import com.azure.resourcemanager.redisenterprise.models.EvictionPolicy;
import com.azure.resourcemanager.redisenterprise.models.Protocol;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class DatabaseListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DatabaseList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"clientProtocol\":\"Encrypted\",\"port\":2146697807,\"provisioningState\":\"Deleting\",\"resourceState\":\"Disabling\",\"clusteringPolicy\":\"OSSCluster\",\"evictionPolicy\":\"VolatileLFU\",\"modules\":[]},\"id\":\"vddntwn\",\"name\":\"eic\",\"type\":\"twnpzaoqvuhrhcf\"},{\"properties\":{\"clientProtocol\":\"Encrypted\",\"port\":1519639894,\"provisioningState\":\"Failed\",\"resourceState\":\"Creating\",\"clusteringPolicy\":\"OSSCluster\",\"evictionPolicy\":\"AllKeysLFU\",\"modules\":[]},\"id\":\"icxm\",\"name\":\"ciwqvhk\",\"type\":\"ixuigdtopbobj\"}],\"nextLink\":\"hm\"}")
                .toObject(DatabaseList.class);
        Assertions.assertEquals(Protocol.ENCRYPTED, model.value().get(0).clientProtocol());
        Assertions.assertEquals(2146697807, model.value().get(0).port());
        Assertions.assertEquals(ClusteringPolicy.OSSCLUSTER, model.value().get(0).clusteringPolicy());
        Assertions.assertEquals(EvictionPolicy.VOLATILE_LFU, model.value().get(0).evictionPolicy());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DatabaseList model =
            new DatabaseList()
                .withValue(
                    Arrays
                        .asList(
                            new DatabaseInner()
                                .withClientProtocol(Protocol.ENCRYPTED)
                                .withPort(2146697807)
                                .withClusteringPolicy(ClusteringPolicy.OSSCLUSTER)
                                .withEvictionPolicy(EvictionPolicy.VOLATILE_LFU)
                                .withModules(Arrays.asList()),
                            new DatabaseInner()
                                .withClientProtocol(Protocol.ENCRYPTED)
                                .withPort(1519639894)
                                .withClusteringPolicy(ClusteringPolicy.OSSCLUSTER)
                                .withEvictionPolicy(EvictionPolicy.ALL_KEYS_LFU)
                                .withModules(Arrays.asList())));
        model = BinaryData.fromObject(model).toObject(DatabaseList.class);
        Assertions.assertEquals(Protocol.ENCRYPTED, model.value().get(0).clientProtocol());
        Assertions.assertEquals(2146697807, model.value().get(0).port());
        Assertions.assertEquals(ClusteringPolicy.OSSCLUSTER, model.value().get(0).clusteringPolicy());
        Assertions.assertEquals(EvictionPolicy.VOLATILE_LFU, model.value().get(0).evictionPolicy());
    }
}