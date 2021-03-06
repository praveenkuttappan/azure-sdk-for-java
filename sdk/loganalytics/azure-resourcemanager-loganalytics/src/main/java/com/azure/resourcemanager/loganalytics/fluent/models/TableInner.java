// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Workspace data table definition. */
@JsonFlatten
@Fluent
public class TableInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TableInner.class);

    /*
     * The data table data retention in days, between 30 and 730. Setting this
     * property to null will default to the workspace retention.
     */
    @JsonProperty(value = "properties.retentionInDays")
    private Integer retentionInDays;

    /**
     * Get the retentionInDays property: The data table data retention in days, between 30 and 730. Setting this
     * property to null will default to the workspace retention.
     *
     * @return the retentionInDays value.
     */
    public Integer retentionInDays() {
        return this.retentionInDays;
    }

    /**
     * Set the retentionInDays property: The data table data retention in days, between 30 and 730. Setting this
     * property to null will default to the workspace retention.
     *
     * @param retentionInDays the retentionInDays value to set.
     * @return the TableInner object itself.
     */
    public TableInner withRetentionInDays(Integer retentionInDays) {
        this.retentionInDays = retentionInDays;
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
