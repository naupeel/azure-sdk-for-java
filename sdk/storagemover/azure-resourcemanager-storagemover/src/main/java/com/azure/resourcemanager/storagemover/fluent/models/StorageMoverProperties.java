// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagemover.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.storagemover.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The resource specific properties for the Storage Mover resource. */
@Fluent
public final class StorageMoverProperties {
    /*
     * A description for the Storage Mover.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The provisioning state of this resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /** Creates an instance of StorageMoverProperties class. */
    public StorageMoverProperties() {
    }

    /**
     * Get the description property: A description for the Storage Mover.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: A description for the Storage Mover.
     *
     * @param description the description value to set.
     * @return the StorageMoverProperties object itself.
     */
    public StorageMoverProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of this resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}