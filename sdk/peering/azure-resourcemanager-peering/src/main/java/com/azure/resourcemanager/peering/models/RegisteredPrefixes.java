// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of RegisteredPrefixes.
 */
public interface RegisteredPrefixes {
    /**
     * Gets an existing registered prefix with the specified name under the given subscription, resource group and
     * peering.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param peeringName The name of the peering.
     * @param registeredPrefixName The name of the registered prefix.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an existing registered prefix with the specified name under the given subscription, resource group and
     * peering along with {@link Response}.
     */
    Response<PeeringRegisteredPrefix> getWithResponse(String resourceGroupName, String peeringName,
        String registeredPrefixName, Context context);

    /**
     * Gets an existing registered prefix with the specified name under the given subscription, resource group and
     * peering.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param peeringName The name of the peering.
     * @param registeredPrefixName The name of the registered prefix.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an existing registered prefix with the specified name under the given subscription, resource group and
     * peering.
     */
    PeeringRegisteredPrefix get(String resourceGroupName, String peeringName, String registeredPrefixName);

    /**
     * Deletes an existing registered prefix with the specified name under the given subscription, resource group and
     * peering.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param peeringName The name of the peering.
     * @param registeredPrefixName The name of the registered prefix.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteWithResponse(String resourceGroupName, String peeringName, String registeredPrefixName,
        Context context);

    /**
     * Deletes an existing registered prefix with the specified name under the given subscription, resource group and
     * peering.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param peeringName The name of the peering.
     * @param registeredPrefixName The name of the registered prefix.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String peeringName, String registeredPrefixName);

    /**
     * Lists all registered prefixes under the given subscription, resource group and peering.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param peeringName The name of the peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated list of peering registered prefixes as paginated response with {@link PagedIterable}.
     */
    PagedIterable<PeeringRegisteredPrefix> listByPeering(String resourceGroupName, String peeringName);

    /**
     * Lists all registered prefixes under the given subscription, resource group and peering.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param peeringName The name of the peering.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated list of peering registered prefixes as paginated response with {@link PagedIterable}.
     */
    PagedIterable<PeeringRegisteredPrefix> listByPeering(String resourceGroupName, String peeringName, Context context);

    /**
     * Gets an existing registered prefix with the specified name under the given subscription, resource group and
     * peering.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an existing registered prefix with the specified name under the given subscription, resource group and
     * peering along with {@link Response}.
     */
    PeeringRegisteredPrefix getById(String id);

    /**
     * Gets an existing registered prefix with the specified name under the given subscription, resource group and
     * peering.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an existing registered prefix with the specified name under the given subscription, resource group and
     * peering along with {@link Response}.
     */
    Response<PeeringRegisteredPrefix> getByIdWithResponse(String id, Context context);

    /**
     * Deletes an existing registered prefix with the specified name under the given subscription, resource group and
     * peering.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes an existing registered prefix with the specified name under the given subscription, resource group and
     * peering.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new PeeringRegisteredPrefix resource.
     * 
     * @param name resource name.
     * @return the first stage of the new PeeringRegisteredPrefix definition.
     */
    PeeringRegisteredPrefix.DefinitionStages.Blank define(String name);
}
