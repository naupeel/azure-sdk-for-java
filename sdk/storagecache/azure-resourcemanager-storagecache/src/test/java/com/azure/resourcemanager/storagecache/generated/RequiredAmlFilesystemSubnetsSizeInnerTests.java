// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.storagecache.fluent.models.RequiredAmlFilesystemSubnetsSizeInner;
import org.junit.jupiter.api.Assertions;

public final class RequiredAmlFilesystemSubnetsSizeInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RequiredAmlFilesystemSubnetsSizeInner model =
            BinaryData
                .fromString("{\"filesystemSubnetSize\":370806274}")
                .toObject(RequiredAmlFilesystemSubnetsSizeInner.class);
        Assertions.assertEquals(370806274, model.filesystemSubnetSize());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RequiredAmlFilesystemSubnetsSizeInner model =
            new RequiredAmlFilesystemSubnetsSizeInner().withFilesystemSubnetSize(370806274);
        model = BinaryData.fromObject(model).toObject(RequiredAmlFilesystemSubnetsSizeInner.class);
        Assertions.assertEquals(370806274, model.filesystemSubnetSize());
    }
}