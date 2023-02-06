// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated;

/** Samples for StorageAccounts ListByDataBoxEdgeDevice. */
public final class StorageAccountsListByDataBoxEdgeDeviceSamples {
    /*
     * x-ms-original-file: specification/databoxedge/resource-manager/Microsoft.DataBoxEdge/stable/2019-08-01/examples/StorageAccountGetAllInDevice.json
     */
    /**
     * Sample code: StorageAccountGetAllInDevice.
     *
     * @param manager Entry point to DataBoxEdgeManager.
     */
    public static void storageAccountGetAllInDevice(com.azure.resourcemanager.databoxedge.DataBoxEdgeManager manager) {
        manager
            .storageAccounts()
            .listByDataBoxEdgeDevice("testedgedevice", "GroupForEdgeAutomation", com.azure.core.util.Context.NONE);
    }
}