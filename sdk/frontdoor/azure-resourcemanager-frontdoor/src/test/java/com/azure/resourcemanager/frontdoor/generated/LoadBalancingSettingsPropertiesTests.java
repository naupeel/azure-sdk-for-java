// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.frontdoor.fluent.models.LoadBalancingSettingsProperties;
import org.junit.jupiter.api.Assertions;

public final class LoadBalancingSettingsPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LoadBalancingSettingsProperties model =
            BinaryData
                .fromString(
                    "{\"resourceState\":\"Disabling\",\"sampleSize\":1631223460,\"successfulSamplesRequired\":520152641,\"additionalLatencyMilliseconds\":508782992}")
                .toObject(LoadBalancingSettingsProperties.class);
        Assertions.assertEquals(1631223460, model.sampleSize());
        Assertions.assertEquals(520152641, model.successfulSamplesRequired());
        Assertions.assertEquals(508782992, model.additionalLatencyMilliseconds());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LoadBalancingSettingsProperties model =
            new LoadBalancingSettingsProperties()
                .withSampleSize(1631223460)
                .withSuccessfulSamplesRequired(520152641)
                .withAdditionalLatencyMilliseconds(508782992);
        model = BinaryData.fromObject(model).toObject(LoadBalancingSettingsProperties.class);
        Assertions.assertEquals(1631223460, model.sampleSize());
        Assertions.assertEquals(520152641, model.successfulSamplesRequired());
        Assertions.assertEquals(508782992, model.additionalLatencyMilliseconds());
    }
}