// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.devcenter.models.DomainJoinType;
import com.azure.resourcemanager.devcenter.models.HealthCheckStatus;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Represents an attached NetworkConnection. */
@Fluent
public final class AttachedNetworkConnectionInner extends ProxyResource {
    /*
     * Attached NetworkConnection properties.
     */
    @JsonProperty(value = "properties")
    private AttachedNetworkConnectionProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the innerProperties property: Attached NetworkConnection properties.
     *
     * @return the innerProperties value.
     */
    private AttachedNetworkConnectionProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the networkConnectionId property: The resource ID of the NetworkConnection you want to attach.
     *
     * @return the networkConnectionId value.
     */
    public String networkConnectionId() {
        return this.innerProperties() == null ? null : this.innerProperties().networkConnectionId();
    }

    /**
     * Set the networkConnectionId property: The resource ID of the NetworkConnection you want to attach.
     *
     * @param networkConnectionId the networkConnectionId value to set.
     * @return the AttachedNetworkConnectionInner object itself.
     */
    public AttachedNetworkConnectionInner withNetworkConnectionId(String networkConnectionId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AttachedNetworkConnectionProperties();
        }
        this.innerProperties().withNetworkConnectionId(networkConnectionId);
        return this;
    }

    /**
     * Get the networkConnectionLocation property: The geo-location where the NetworkConnection resource specified in
     * 'networkConnectionResourceId' property lives.
     *
     * @return the networkConnectionLocation value.
     */
    public String networkConnectionLocation() {
        return this.innerProperties() == null ? null : this.innerProperties().networkConnectionLocation();
    }

    /**
     * Get the healthCheckStatus property: Health check status values.
     *
     * @return the healthCheckStatus value.
     */
    public HealthCheckStatus healthCheckStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().healthCheckStatus();
    }

    /**
     * Get the domainJoinType property: AAD Join type of the network. This is populated based on the referenced Network
     * Connection.
     *
     * @return the domainJoinType value.
     */
    public DomainJoinType domainJoinType() {
        return this.innerProperties() == null ? null : this.innerProperties().domainJoinType();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}