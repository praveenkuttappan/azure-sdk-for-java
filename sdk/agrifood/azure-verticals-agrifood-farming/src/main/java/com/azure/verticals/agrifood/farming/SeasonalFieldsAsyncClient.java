// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.verticals.agrifood.farming;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.core.util.polling.PollerFlux;
import com.azure.verticals.agrifood.farming.implementation.SeasonalFieldsImpl;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous FarmBeatsClient type. */
@ServiceClient(builder = SeasonalFieldsClientBuilder.class, isAsync = true)
public final class SeasonalFieldsAsyncClient {
    @Generated private final SeasonalFieldsImpl serviceClient;

    /**
     * Initializes an instance of SeasonalFieldsAsyncClient class.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    SeasonalFieldsAsyncClient(SeasonalFieldsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Returns a paginated list of seasonal field resources under a particular party.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>farmIds</td><td>List&lt;String&gt;</td><td>No</td><td>Farm Ids of the resource. Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     *     <tr><td>fieldIds</td><td>List&lt;String&gt;</td><td>No</td><td>Field Ids of the resource. Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     *     <tr><td>seasonIds</td><td>List&lt;String&gt;</td><td>No</td><td>Season Ids of the resource. Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     *     <tr><td>cropProductIds</td><td>List&lt;String&gt;</td><td>No</td><td>CropProductIds of the resource. Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     *     <tr><td>cropIds</td><td>List&lt;String&gt;</td><td>No</td><td>Ids of the crop it belongs to. Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     *     <tr><td>ids</td><td>List&lt;String&gt;</td><td>No</td><td>Ids of the resource. Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     *     <tr><td>names</td><td>List&lt;String&gt;</td><td>No</td><td>Names of the resource. Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     *     <tr><td>propertyFilters</td><td>List&lt;String&gt;</td><td>No</td><td>Filters on key-value pairs within the Properties object.
     * eg. "{testKey} eq {testValue}". Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     *     <tr><td>statuses</td><td>List&lt;String&gt;</td><td>No</td><td>Statuses of the resource. Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     *     <tr><td>minCreatedDateTime</td><td>OffsetDateTime</td><td>No</td><td>Minimum creation date of resource (inclusive).</td></tr>
     *     <tr><td>maxCreatedDateTime</td><td>OffsetDateTime</td><td>No</td><td>Maximum creation date of resource (inclusive).</td></tr>
     *     <tr><td>minLastModifiedDateTime</td><td>OffsetDateTime</td><td>No</td><td>Minimum last modified date of resource (inclusive).</td></tr>
     *     <tr><td>maxLastModifiedDateTime</td><td>OffsetDateTime</td><td>No</td><td>Maximum last modified date of resource (inclusive).</td></tr>
     *     <tr><td>maxPageSize</td><td>Integer</td><td>No</td><td>Maximum number of items needed (inclusive).
     * Minimum = 10, Maximum = 1000, Default value = 50.</td></tr>
     *     <tr><td>skipToken</td><td>String</td><td>No</td><td>Skip token for getting next set of results.</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     partyId: String (Optional)
     *     farmId: String (Optional)
     *     fieldId: String (Optional)
     *     seasonId: String (Optional)
     *     cropProductIds (Optional): [
     *         String (Optional)
     *     ]
     *     cropId: String (Optional)
     *     id: String (Optional)
     *     eTag: String (Optional)
     *     status: String (Optional)
     *     createdDateTime: OffsetDateTime (Optional)
     *     modifiedDateTime: OffsetDateTime (Optional)
     *     source: String (Optional)
     *     name: String (Optional)
     *     description: String (Optional)
     *     createdBy: String (Optional)
     *     modifiedBy: String (Optional)
     *     properties (Optional): {
     *         String: Object (Optional)
     *     }
     * }
     * }</pre>
     *
     * @param partyId Id of the associated party.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return paged response contains list of requested objects and a URL link to get the next set of results as
     *     paginated response with {@link PagedFlux}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> listByPartyId(String partyId, RequestOptions requestOptions) {
        return this.serviceClient.listByPartyIdAsync(partyId, requestOptions);
    }

    /**
     * Gets a specified seasonal field resource under a particular party.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     partyId: String (Optional)
     *     farmId: String (Optional)
     *     fieldId: String (Optional)
     *     seasonId: String (Optional)
     *     cropProductIds (Optional): [
     *         String (Optional)
     *     ]
     *     cropId: String (Optional)
     *     id: String (Optional)
     *     eTag: String (Optional)
     *     status: String (Optional)
     *     createdDateTime: OffsetDateTime (Optional)
     *     modifiedDateTime: OffsetDateTime (Optional)
     *     source: String (Optional)
     *     name: String (Optional)
     *     description: String (Optional)
     *     createdBy: String (Optional)
     *     modifiedBy: String (Optional)
     *     properties (Optional): {
     *         String: Object (Optional)
     *     }
     * }
     * }</pre>
     *
     * @param partyId Id of the associated party.
     * @param seasonalFieldId Id of the seasonal field.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a specified seasonal field resource under a particular party along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getWithResponse(
            String partyId, String seasonalFieldId, RequestOptions requestOptions) {
        return this.serviceClient.getWithResponseAsync(partyId, seasonalFieldId, requestOptions);
    }

    /**
     * Creates or Updates a seasonal field resource under a particular party.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     partyId: String (Optional)
     *     farmId: String (Optional)
     *     fieldId: String (Optional)
     *     seasonId: String (Optional)
     *     cropProductIds (Optional): [
     *         String (Optional)
     *     ]
     *     cropId: String (Optional)
     *     id: String (Optional)
     *     eTag: String (Optional)
     *     status: String (Optional)
     *     createdDateTime: OffsetDateTime (Optional)
     *     modifiedDateTime: OffsetDateTime (Optional)
     *     source: String (Optional)
     *     name: String (Optional)
     *     description: String (Optional)
     *     createdBy: String (Optional)
     *     modifiedBy: String (Optional)
     *     properties (Optional): {
     *         String: Object (Optional)
     *     }
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     partyId: String (Optional)
     *     farmId: String (Optional)
     *     fieldId: String (Optional)
     *     seasonId: String (Optional)
     *     cropProductIds (Optional): [
     *         String (Optional)
     *     ]
     *     cropId: String (Optional)
     *     id: String (Optional)
     *     eTag: String (Optional)
     *     status: String (Optional)
     *     createdDateTime: OffsetDateTime (Optional)
     *     modifiedDateTime: OffsetDateTime (Optional)
     *     source: String (Optional)
     *     name: String (Optional)
     *     description: String (Optional)
     *     createdBy: String (Optional)
     *     modifiedBy: String (Optional)
     *     properties (Optional): {
     *         String: Object (Optional)
     *     }
     * }
     * }</pre>
     *
     * @param partyId Id of the associated party resource.
     * @param seasonalFieldId Id of the seasonal field resource.
     * @param seasonalField Seasonal field resource payload to create or update.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return schema of seasonal field resource along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> createOrUpdateWithResponse(
            String partyId, String seasonalFieldId, BinaryData seasonalField, RequestOptions requestOptions) {
        return this.serviceClient.createOrUpdateWithResponseAsync(
                partyId, seasonalFieldId, seasonalField, requestOptions);
    }

    /**
     * Deletes a specified seasonal-field resource under a particular party.
     *
     * @param partyId Id of the party.
     * @param seasonalFieldId Id of the seasonal field.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponse(
            String partyId, String seasonalFieldId, RequestOptions requestOptions) {
        return this.serviceClient.deleteWithResponseAsync(partyId, seasonalFieldId, requestOptions);
    }

    /**
     * Returns a paginated list of seasonal field resources across all parties.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>farmIds</td><td>List&lt;String&gt;</td><td>No</td><td>Farm Ids of the resource. Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     *     <tr><td>fieldIds</td><td>List&lt;String&gt;</td><td>No</td><td>Field Ids of the resource. Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     *     <tr><td>seasonIds</td><td>List&lt;String&gt;</td><td>No</td><td>Season Ids of the resource. Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     *     <tr><td>cropProductIds</td><td>List&lt;String&gt;</td><td>No</td><td>CropProductIds of the resource. Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     *     <tr><td>cropIds</td><td>List&lt;String&gt;</td><td>No</td><td>Ids of the crop it belongs to. Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     *     <tr><td>ids</td><td>List&lt;String&gt;</td><td>No</td><td>Ids of the resource. Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     *     <tr><td>names</td><td>List&lt;String&gt;</td><td>No</td><td>Names of the resource. Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     *     <tr><td>propertyFilters</td><td>List&lt;String&gt;</td><td>No</td><td>Filters on key-value pairs within the Properties object.
     * eg. "{testKey} eq {testValue}". Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     *     <tr><td>statuses</td><td>List&lt;String&gt;</td><td>No</td><td>Statuses of the resource. Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     *     <tr><td>minCreatedDateTime</td><td>OffsetDateTime</td><td>No</td><td>Minimum creation date of resource (inclusive).</td></tr>
     *     <tr><td>maxCreatedDateTime</td><td>OffsetDateTime</td><td>No</td><td>Maximum creation date of resource (inclusive).</td></tr>
     *     <tr><td>minLastModifiedDateTime</td><td>OffsetDateTime</td><td>No</td><td>Minimum last modified date of resource (inclusive).</td></tr>
     *     <tr><td>maxLastModifiedDateTime</td><td>OffsetDateTime</td><td>No</td><td>Maximum last modified date of resource (inclusive).</td></tr>
     *     <tr><td>maxPageSize</td><td>Integer</td><td>No</td><td>Maximum number of items needed (inclusive).
     * Minimum = 10, Maximum = 1000, Default value = 50.</td></tr>
     *     <tr><td>skipToken</td><td>String</td><td>No</td><td>Skip token for getting next set of results.</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     partyId: String (Optional)
     *     farmId: String (Optional)
     *     fieldId: String (Optional)
     *     seasonId: String (Optional)
     *     cropProductIds (Optional): [
     *         String (Optional)
     *     ]
     *     cropId: String (Optional)
     *     id: String (Optional)
     *     eTag: String (Optional)
     *     status: String (Optional)
     *     createdDateTime: OffsetDateTime (Optional)
     *     modifiedDateTime: OffsetDateTime (Optional)
     *     source: String (Optional)
     *     name: String (Optional)
     *     description: String (Optional)
     *     createdBy: String (Optional)
     *     modifiedBy: String (Optional)
     *     properties (Optional): {
     *         String: Object (Optional)
     *     }
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return paged response contains list of requested objects and a URL link to get the next set of results as
     *     paginated response with {@link PagedFlux}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> list(RequestOptions requestOptions) {
        return this.serviceClient.listAsync(requestOptions);
    }

    /**
     * Get cascade delete job for specified seasonal field.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     partyId: String (Required)
     *     resourceId: String (Required)
     *     resourceType: String (Required)
     *     id: String (Optional)
     *     status: String(Waiting/Running/Succeeded/Failed/Cancelled) (Optional)
     *     durationInSeconds: Double (Optional)
     *     message: String (Optional)
     *     errorCode: String (Optional)
     *     createdDateTime: OffsetDateTime (Optional)
     *     lastActionDateTime: OffsetDateTime (Optional)
     *     startTime: OffsetDateTime (Optional)
     *     endTime: OffsetDateTime (Optional)
     * }
     * }</pre>
     *
     * @param jobId Id of the job.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return cascade delete job for specified seasonal field along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getCascadeDeleteJobDetailsWithResponse(
            String jobId, RequestOptions requestOptions) {
        return this.serviceClient.getCascadeDeleteJobDetailsWithResponseAsync(jobId, requestOptions);
    }

    /**
     * Create a cascade delete job for specified seasonal field.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     partyId: String (Required)
     *     resourceId: String (Required)
     *     resourceType: String (Required)
     *     id: String (Optional)
     *     status: String(Waiting/Running/Succeeded/Failed/Cancelled) (Optional)
     *     durationInSeconds: Double (Optional)
     *     message: String (Optional)
     *     errorCode: String (Optional)
     *     createdDateTime: OffsetDateTime (Optional)
     *     lastActionDateTime: OffsetDateTime (Optional)
     *     startTime: OffsetDateTime (Optional)
     *     endTime: OffsetDateTime (Optional)
     * }
     * }</pre>
     *
     * @param jobId Job ID supplied by end user.
     * @param partyId ID of the associated party.
     * @param seasonalFieldId ID of the seasonalField to be deleted.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link PollerFlux} for polling of schema of cascade delete job.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<BinaryData, BinaryData> beginCreateCascadeDeleteJob(
            String jobId, String partyId, String seasonalFieldId, RequestOptions requestOptions) {
        return this.serviceClient.beginCreateCascadeDeleteJobAsync(jobId, partyId, seasonalFieldId, requestOptions);
    }
}
