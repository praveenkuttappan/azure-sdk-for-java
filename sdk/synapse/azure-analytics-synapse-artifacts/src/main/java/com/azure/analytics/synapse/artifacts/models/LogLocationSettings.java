// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Log location settings. */
@Fluent
public final class LogLocationSettings {
    /*
     * Log storage linked service reference.
     */
    @JsonProperty(value = "linkedServiceName", required = true)
    private LinkedServiceReference linkedServiceName;

    /*
     * The path to storage for storing detailed logs of activity execution. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "path")
    private Object path;

    /** Creates an instance of LogLocationSettings class. */
    public LogLocationSettings() {}

    /**
     * Get the linkedServiceName property: Log storage linked service reference.
     *
     * @return the linkedServiceName value.
     */
    public LinkedServiceReference getLinkedServiceName() {
        return this.linkedServiceName;
    }

    /**
     * Set the linkedServiceName property: Log storage linked service reference.
     *
     * @param linkedServiceName the linkedServiceName value to set.
     * @return the LogLocationSettings object itself.
     */
    public LogLocationSettings setLinkedServiceName(LinkedServiceReference linkedServiceName) {
        this.linkedServiceName = linkedServiceName;
        return this;
    }

    /**
     * Get the path property: The path to storage for storing detailed logs of activity execution. Type: string (or
     * Expression with resultType string).
     *
     * @return the path value.
     */
    public Object getPath() {
        return this.path;
    }

    /**
     * Set the path property: The path to storage for storing detailed logs of activity execution. Type: string (or
     * Expression with resultType string).
     *
     * @param path the path value to set.
     * @return the LogLocationSettings object itself.
     */
    public LogLocationSettings setPath(Object path) {
        this.path = path;
        return this;
    }
}
