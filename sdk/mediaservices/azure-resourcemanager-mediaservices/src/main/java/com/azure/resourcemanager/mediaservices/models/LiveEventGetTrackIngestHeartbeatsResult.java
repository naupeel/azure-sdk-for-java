// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.mediaservices.fluent.models.LiveEventTrackEventInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Get live event track ingest heart beats result. */
@Fluent
public final class LiveEventGetTrackIngestHeartbeatsResult {
    /*
     * The result of the get live event track events.
     */
    @JsonProperty(value = "value")
    private List<LiveEventTrackEventInner> value;

    /** Creates an instance of LiveEventGetTrackIngestHeartbeatsResult class. */
    public LiveEventGetTrackIngestHeartbeatsResult() {
    }

    /**
     * Get the value property: The result of the get live event track events.
     *
     * @return the value value.
     */
    public List<LiveEventTrackEventInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The result of the get live event track events.
     *
     * @param value the value value to set.
     * @return the LiveEventGetTrackIngestHeartbeatsResult object itself.
     */
    public LiveEventGetTrackIngestHeartbeatsResult withValue(List<LiveEventTrackEventInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}