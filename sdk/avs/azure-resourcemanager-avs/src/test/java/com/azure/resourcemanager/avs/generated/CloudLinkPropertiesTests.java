// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.avs.fluent.models.CloudLinkProperties;
import org.junit.jupiter.api.Assertions;

public final class CloudLinkPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CloudLinkProperties model =
            BinaryData
                .fromString("{\"status\":\"Disconnected\",\"linkedCloud\":\"kfcktqum\"}")
                .toObject(CloudLinkProperties.class);
        Assertions.assertEquals("kfcktqum", model.linkedCloud());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CloudLinkProperties model = new CloudLinkProperties().withLinkedCloud("kfcktqum");
        model = BinaryData.fromObject(model).toObject(CloudLinkProperties.class);
        Assertions.assertEquals("kfcktqum", model.linkedCloud());
    }
}