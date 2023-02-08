// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.implementation;

import com.azure.resourcemanager.providerhub.fluent.models.OperationsContentInner;
import com.azure.resourcemanager.providerhub.models.OperationActionType;
import com.azure.resourcemanager.providerhub.models.OperationOrigins;
import com.azure.resourcemanager.providerhub.models.OperationsContent;
import com.azure.resourcemanager.providerhub.models.OperationsDefinitionDisplay;

public final class OperationsContentImpl implements OperationsContent {
    private OperationsContentInner innerObject;

    private final com.azure.resourcemanager.providerhub.ProviderHubManager serviceManager;

    OperationsContentImpl(
        OperationsContentInner innerObject, com.azure.resourcemanager.providerhub.ProviderHubManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String namePropertiesName() {
        return this.innerModel().namePropertiesName();
    }

    public Boolean isDataAction() {
        return this.innerModel().isDataAction();
    }

    public OperationOrigins origin() {
        return this.innerModel().origin();
    }

    public OperationsDefinitionDisplay display() {
        return this.innerModel().display();
    }

    public OperationActionType actionType() {
        return this.innerModel().actionType();
    }

    public Object properties() {
        return this.innerModel().properties();
    }

    public OperationsContentInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.providerhub.ProviderHubManager manager() {
        return this.serviceManager;
    }
}