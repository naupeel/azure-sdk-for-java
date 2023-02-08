// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.workloads.models.SingleServerRecommendationResult;
import org.junit.jupiter.api.Assertions;

public final class SingleServerRecommendationResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SingleServerRecommendationResult model =
            BinaryData
                .fromString("{\"deploymentType\":\"SingleServer\",\"vmSku\":\"crkvcikhnv\"}")
                .toObject(SingleServerRecommendationResult.class);
        Assertions.assertEquals("crkvcikhnv", model.vmSku());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SingleServerRecommendationResult model = new SingleServerRecommendationResult().withVmSku("crkvcikhnv");
        model = BinaryData.fromObject(model).toObject(SingleServerRecommendationResult.class);
        Assertions.assertEquals("crkvcikhnv", model.vmSku());
    }
}