/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_09_01.implementation;

import java.util.List;
import com.microsoft.azure.management.network.v2019_09_01.BastionHostIPConfiguration;
import com.microsoft.azure.management.network.v2019_09_01.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * Bastion Host resource.
 */
@JsonFlatten
@SkipParentValidation
public class BastionHostInner extends Resource {
    /**
     * IP configuration of the Bastion Host resource.
     */
    @JsonProperty(value = "properties.ipConfigurations")
    private List<BastionHostIPConfiguration> ipConfigurations;

    /**
     * FQDN for the endpoint on which bastion host is accessible.
     */
    @JsonProperty(value = "properties.dnsName")
    private String dnsName;

    /**
     * The provisioning state of the bastion host resource. Possible values
     * include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get iP configuration of the Bastion Host resource.
     *
     * @return the ipConfigurations value
     */
    public List<BastionHostIPConfiguration> ipConfigurations() {
        return this.ipConfigurations;
    }

    /**
     * Set iP configuration of the Bastion Host resource.
     *
     * @param ipConfigurations the ipConfigurations value to set
     * @return the BastionHostInner object itself.
     */
    public BastionHostInner withIpConfigurations(List<BastionHostIPConfiguration> ipConfigurations) {
        this.ipConfigurations = ipConfigurations;
        return this;
    }

    /**
     * Get fQDN for the endpoint on which bastion host is accessible.
     *
     * @return the dnsName value
     */
    public String dnsName() {
        return this.dnsName;
    }

    /**
     * Set fQDN for the endpoint on which bastion host is accessible.
     *
     * @param dnsName the dnsName value to set
     * @return the BastionHostInner object itself.
     */
    public BastionHostInner withDnsName(String dnsName) {
        this.dnsName = dnsName;
        return this;
    }

    /**
     * Get the provisioning state of the bastion host resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get resource ID.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set resource ID.
     *
     * @param id the id value to set
     * @return the BastionHostInner object itself.
     */
    public BastionHostInner withId(String id) {
        this.id = id;
        return this;
    }

}
