// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.workloads.models.UpdateSapApplicationInstanceRequest;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class UpdateSapApplicationInstanceRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UpdateSapApplicationInstanceRequest model =
            BinaryData
                .fromString("{\"tags\":{\"i\":\"fwxosowzxcu\",\"ucww\":\"jooxdjebw\",\"bvmeuecivy\":\"vo\"}}")
                .toObject(UpdateSapApplicationInstanceRequest.class);
        Assertions.assertEquals("fwxosowzxcu", model.tags().get("i"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UpdateSapApplicationInstanceRequest model =
            new UpdateSapApplicationInstanceRequest()
                .withTags(mapOf("i", "fwxosowzxcu", "ucww", "jooxdjebw", "bvmeuecivy", "vo"));
        model = BinaryData.fromObject(model).toObject(UpdateSapApplicationInstanceRequest.class);
        Assertions.assertEquals("fwxosowzxcu", model.tags().get("i"));
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}