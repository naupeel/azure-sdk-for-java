// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagepool.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.storagepool.fluent.models.ResourceSkuInfoInner;
import com.azure.resourcemanager.storagepool.models.ResourceSkuListResult;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ResourceSkuListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ResourceSkuListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"apiVersion\":\"tehfiqscjeypvh\",\"resourceType\":\"rkgqhcjrefo\",\"capabilities\":[],\"locationInfo\":{\"location\":\"sle\",\"zones\":[],\"zoneDetails\":[]},\"name\":\"yqjpkcatt\",\"tier\":\"gjcrcczsqpjhvm\",\"restrictions\":[]},{\"apiVersion\":\"nysounqe\",\"resourceType\":\"noae\",\"capabilities\":[],\"locationInfo\":{\"location\":\"hltrpmopjmcmatuo\",\"zones\":[],\"zoneDetails\":[]},\"name\":\"uiuaodsfcpkvxodp\",\"tier\":\"zmyzydagf\",\"restrictions\":[]}],\"nextLink\":\"ezyiuokktwhrdxw\"}")
                .toObject(ResourceSkuListResult.class);
        Assertions.assertEquals("ezyiuokktwhrdxw", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ResourceSkuListResult model =
            new ResourceSkuListResult()
                .withValue(Arrays.asList(new ResourceSkuInfoInner(), new ResourceSkuInfoInner()))
                .withNextLink("ezyiuokktwhrdxw");
        model = BinaryData.fromObject(model).toObject(ResourceSkuListResult.class);
        Assertions.assertEquals("ezyiuokktwhrdxw", model.nextLink());
    }
}