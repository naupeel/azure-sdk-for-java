// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The CanaryTrafficRegionRolloutConfiguration model. */
@Fluent
public class CanaryTrafficRegionRolloutConfiguration {
    /*
     * The skipRegions property.
     */
    @JsonProperty(value = "skipRegions")
    private List<String> skipRegions;

    /*
     * The regions property.
     */
    @JsonProperty(value = "regions")
    private List<String> regions;

    /** Creates an instance of CanaryTrafficRegionRolloutConfiguration class. */
    public CanaryTrafficRegionRolloutConfiguration() {
    }

    /**
     * Get the skipRegions property: The skipRegions property.
     *
     * @return the skipRegions value.
     */
    public List<String> skipRegions() {
        return this.skipRegions;
    }

    /**
     * Set the skipRegions property: The skipRegions property.
     *
     * @param skipRegions the skipRegions value to set.
     * @return the CanaryTrafficRegionRolloutConfiguration object itself.
     */
    public CanaryTrafficRegionRolloutConfiguration withSkipRegions(List<String> skipRegions) {
        this.skipRegions = skipRegions;
        return this;
    }

    /**
     * Get the regions property: The regions property.
     *
     * @return the regions value.
     */
    public List<String> regions() {
        return this.regions;
    }

    /**
     * Set the regions property: The regions property.
     *
     * @param regions the regions value to set.
     * @return the CanaryTrafficRegionRolloutConfiguration object itself.
     */
    public CanaryTrafficRegionRolloutConfiguration withRegions(List<String> regions) {
        this.regions = regions;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}