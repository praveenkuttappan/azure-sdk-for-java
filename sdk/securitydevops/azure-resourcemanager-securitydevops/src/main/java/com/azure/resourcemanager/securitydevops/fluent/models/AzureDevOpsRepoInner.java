// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securitydevops.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.securitydevops.models.AzureDevOpsRepoProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Azure DevOps Repo Proxy Resource. */
@Fluent
public final class AzureDevOpsRepoInner extends ProxyResource {
    /*
     * AzureDevOps Repo properties.
     */
    @JsonProperty(value = "properties")
    private AzureDevOpsRepoProperties properties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of AzureDevOpsRepoInner class. */
    public AzureDevOpsRepoInner() {
    }

    /**
     * Get the properties property: AzureDevOps Repo properties.
     *
     * @return the properties value.
     */
    public AzureDevOpsRepoProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: AzureDevOps Repo properties.
     *
     * @param properties the properties value to set.
     * @return the AzureDevOpsRepoInner object itself.
     */
    public AzureDevOpsRepoInner withProperties(AzureDevOpsRepoProperties properties) {
        this.properties = properties;
        return this;
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
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}