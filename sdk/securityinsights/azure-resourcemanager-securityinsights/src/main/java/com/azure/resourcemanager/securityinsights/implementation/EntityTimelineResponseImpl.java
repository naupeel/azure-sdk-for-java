// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.implementation;

import com.azure.resourcemanager.securityinsights.fluent.models.EntityTimelineResponseInner;
import com.azure.resourcemanager.securityinsights.models.EntityTimelineItem;
import com.azure.resourcemanager.securityinsights.models.EntityTimelineResponse;
import com.azure.resourcemanager.securityinsights.models.TimelineResultsMetadata;
import java.util.Collections;
import java.util.List;

public final class EntityTimelineResponseImpl implements EntityTimelineResponse {
    private EntityTimelineResponseInner innerObject;

    private final com.azure.resourcemanager.securityinsights.SecurityInsightsManager serviceManager;

    EntityTimelineResponseImpl(EntityTimelineResponseInner innerObject,
        com.azure.resourcemanager.securityinsights.SecurityInsightsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public TimelineResultsMetadata metadata() {
        return this.innerModel().metadata();
    }

    public List<EntityTimelineItem> value() {
        List<EntityTimelineItem> inner = this.innerModel().value();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public EntityTimelineResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager() {
        return this.serviceManager;
    }
}
