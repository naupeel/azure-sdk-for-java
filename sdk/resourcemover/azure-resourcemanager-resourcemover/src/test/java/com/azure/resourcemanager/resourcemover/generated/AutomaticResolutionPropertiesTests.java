// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.resourcemover.models.AutomaticResolutionProperties;
import org.junit.jupiter.api.Assertions;

public final class AutomaticResolutionPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AutomaticResolutionProperties model =
            BinaryData.fromString("{\"moveResourceId\":\"hijco\"}").toObject(AutomaticResolutionProperties.class);
        Assertions.assertEquals("hijco", model.moveResourceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AutomaticResolutionProperties model = new AutomaticResolutionProperties().withMoveResourceId("hijco");
        model = BinaryData.fromObject(model).toObject(AutomaticResolutionProperties.class);
        Assertions.assertEquals("hijco", model.moveResourceId());
    }
}