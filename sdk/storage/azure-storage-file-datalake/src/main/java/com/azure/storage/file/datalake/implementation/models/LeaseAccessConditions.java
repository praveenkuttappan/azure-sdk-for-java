// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.datalake.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/** Parameter group. */
@JacksonXmlRootElement(localName = "LeaseAccessConditions")
@Fluent
public final class LeaseAccessConditions {
    /*
     * If specified, the operation only succeeds if the resource's lease is active and matches this ID.
     */
    @JsonProperty(value = "leaseId")
    private String leaseId;

    /** Creates an instance of LeaseAccessConditions class. */
    public LeaseAccessConditions() {}

    /**
     * Get the leaseId property: If specified, the operation only succeeds if the resource's lease is active and matches
     * this ID.
     *
     * @return the leaseId value.
     */
    public String getLeaseId() {
        return this.leaseId;
    }

    /**
     * Set the leaseId property: If specified, the operation only succeeds if the resource's lease is active and matches
     * this ID.
     *
     * @param leaseId the leaseId value to set.
     * @return the LeaseAccessConditions object itself.
     */
    public LeaseAccessConditions setLeaseId(String leaseId) {
        this.leaseId = leaseId;
        return this;
    }
}
