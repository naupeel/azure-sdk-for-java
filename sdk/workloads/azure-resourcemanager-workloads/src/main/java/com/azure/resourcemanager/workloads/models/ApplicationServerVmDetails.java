// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The Application Server VM Details. */
@Immutable
public final class ApplicationServerVmDetails {
    /*
     * Defines the type of application server VM.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private ApplicationServerVirtualMachineType type;

    /*
     * The virtualMachineId property.
     */
    @JsonProperty(value = "virtualMachineId", access = JsonProperty.Access.WRITE_ONLY)
    private String virtualMachineId;

    /*
     * Storage details of all the Storage Accounts attached to the App Virtual Machine. For e.g. NFS on AFS Shared
     * Storage.
     */
    @JsonProperty(value = "storageDetails", access = JsonProperty.Access.WRITE_ONLY)
    private List<StorageInformation> storageDetails;

    /** Creates an instance of ApplicationServerVmDetails class. */
    public ApplicationServerVmDetails() {
    }

    /**
     * Get the type property: Defines the type of application server VM.
     *
     * @return the type value.
     */
    public ApplicationServerVirtualMachineType type() {
        return this.type;
    }

    /**
     * Get the virtualMachineId property: The virtualMachineId property.
     *
     * @return the virtualMachineId value.
     */
    public String virtualMachineId() {
        return this.virtualMachineId;
    }

    /**
     * Get the storageDetails property: Storage details of all the Storage Accounts attached to the App Virtual Machine.
     * For e.g. NFS on AFS Shared Storage.
     *
     * @return the storageDetails value.
     */
    public List<StorageInformation> storageDetails() {
        return this.storageDetails;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (storageDetails() != null) {
            storageDetails().forEach(e -> e.validate());
        }
    }
}