// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.fluent.models.ScopeConnectionInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ScopeConnectionsClient. */
public interface ScopeConnectionsClient {
    /**
     * Creates or updates scope connection from Network Manager.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param scopeConnectionName Name for the cross-tenant connection.
     * @param parameters Scope connection to be created/updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Scope Connections resource along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<ScopeConnectionInner>> createOrUpdateWithResponseAsync(
        String resourceGroupName,
        String networkManagerName,
        String scopeConnectionName,
        ScopeConnectionInner parameters);

    /**
     * Creates or updates scope connection from Network Manager.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param scopeConnectionName Name for the cross-tenant connection.
     * @param parameters Scope connection to be created/updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Scope Connections resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ScopeConnectionInner> createOrUpdateAsync(
        String resourceGroupName,
        String networkManagerName,
        String scopeConnectionName,
        ScopeConnectionInner parameters);

    /**
     * Creates or updates scope connection from Network Manager.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param scopeConnectionName Name for the cross-tenant connection.
     * @param parameters Scope connection to be created/updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Scope Connections resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ScopeConnectionInner createOrUpdate(
        String resourceGroupName,
        String networkManagerName,
        String scopeConnectionName,
        ScopeConnectionInner parameters);

    /**
     * Creates or updates scope connection from Network Manager.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param scopeConnectionName Name for the cross-tenant connection.
     * @param parameters Scope connection to be created/updated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Scope Connections resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ScopeConnectionInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String networkManagerName,
        String scopeConnectionName,
        ScopeConnectionInner parameters,
        Context context);

    /**
     * Get specified scope connection created by this Network Manager.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param scopeConnectionName Name for the cross-tenant connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specified scope connection created by this Network Manager along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<ScopeConnectionInner>> getWithResponseAsync(
        String resourceGroupName, String networkManagerName, String scopeConnectionName);

    /**
     * Get specified scope connection created by this Network Manager.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param scopeConnectionName Name for the cross-tenant connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specified scope connection created by this Network Manager on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ScopeConnectionInner> getAsync(
        String resourceGroupName, String networkManagerName, String scopeConnectionName);

    /**
     * Get specified scope connection created by this Network Manager.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param scopeConnectionName Name for the cross-tenant connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specified scope connection created by this Network Manager.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ScopeConnectionInner get(String resourceGroupName, String networkManagerName, String scopeConnectionName);

    /**
     * Get specified scope connection created by this Network Manager.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param scopeConnectionName Name for the cross-tenant connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specified scope connection created by this Network Manager along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ScopeConnectionInner> getWithResponse(
        String resourceGroupName, String networkManagerName, String scopeConnectionName, Context context);

    /**
     * Delete the pending scope connection created by this network manager.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param scopeConnectionName Name for the cross-tenant connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Void>> deleteWithResponseAsync(
        String resourceGroupName, String networkManagerName, String scopeConnectionName);

    /**
     * Delete the pending scope connection created by this network manager.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param scopeConnectionName Name for the cross-tenant connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String networkManagerName, String scopeConnectionName);

    /**
     * Delete the pending scope connection created by this network manager.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param scopeConnectionName Name for the cross-tenant connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String networkManagerName, String scopeConnectionName);

    /**
     * Delete the pending scope connection created by this network manager.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param scopeConnectionName Name for the cross-tenant connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName, String networkManagerName, String scopeConnectionName, Context context);

    /**
     * List all scope connections created by this network manager.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param top An optional query parameter which specifies the maximum number of records to be returned by the
     *     server.
     * @param skipToken SkipToken is only used if a previous operation returned a partial result. If a previous response
     *     contains a nextLink element, the value of the nextLink element will include a skipToken parameter that
     *     specifies a starting point to use for subsequent calls.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of scope connections as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<ScopeConnectionInner> listAsync(
        String resourceGroupName, String networkManagerName, Integer top, String skipToken);

    /**
     * List all scope connections created by this network manager.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of scope connections as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<ScopeConnectionInner> listAsync(String resourceGroupName, String networkManagerName);

    /**
     * List all scope connections created by this network manager.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of scope connections as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ScopeConnectionInner> list(String resourceGroupName, String networkManagerName);

    /**
     * List all scope connections created by this network manager.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param top An optional query parameter which specifies the maximum number of records to be returned by the
     *     server.
     * @param skipToken SkipToken is only used if a previous operation returned a partial result. If a previous response
     *     contains a nextLink element, the value of the nextLink element will include a skipToken parameter that
     *     specifies a starting point to use for subsequent calls.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of scope connections as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ScopeConnectionInner> list(
        String resourceGroupName, String networkManagerName, Integer top, String skipToken, Context context);
}