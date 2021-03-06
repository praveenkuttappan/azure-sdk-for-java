/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appplatform.v2020_07_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Test keys payload.
 */
public class TestKeysInner {
    /**
     * Primary key.
     */
    @JsonProperty(value = "primaryKey")
    private String primaryKey;

    /**
     * Secondary key.
     */
    @JsonProperty(value = "secondaryKey")
    private String secondaryKey;

    /**
     * Primary test endpoint.
     */
    @JsonProperty(value = "primaryTestEndpoint")
    private String primaryTestEndpoint;

    /**
     * Secondary test endpoint.
     */
    @JsonProperty(value = "secondaryTestEndpoint")
    private String secondaryTestEndpoint;

    /**
     * Indicates whether the test endpoint feature enabled or not.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /**
     * Get primary key.
     *
     * @return the primaryKey value
     */
    public String primaryKey() {
        return this.primaryKey;
    }

    /**
     * Set primary key.
     *
     * @param primaryKey the primaryKey value to set
     * @return the TestKeysInner object itself.
     */
    public TestKeysInner withPrimaryKey(String primaryKey) {
        this.primaryKey = primaryKey;
        return this;
    }

    /**
     * Get secondary key.
     *
     * @return the secondaryKey value
     */
    public String secondaryKey() {
        return this.secondaryKey;
    }

    /**
     * Set secondary key.
     *
     * @param secondaryKey the secondaryKey value to set
     * @return the TestKeysInner object itself.
     */
    public TestKeysInner withSecondaryKey(String secondaryKey) {
        this.secondaryKey = secondaryKey;
        return this;
    }

    /**
     * Get primary test endpoint.
     *
     * @return the primaryTestEndpoint value
     */
    public String primaryTestEndpoint() {
        return this.primaryTestEndpoint;
    }

    /**
     * Set primary test endpoint.
     *
     * @param primaryTestEndpoint the primaryTestEndpoint value to set
     * @return the TestKeysInner object itself.
     */
    public TestKeysInner withPrimaryTestEndpoint(String primaryTestEndpoint) {
        this.primaryTestEndpoint = primaryTestEndpoint;
        return this;
    }

    /**
     * Get secondary test endpoint.
     *
     * @return the secondaryTestEndpoint value
     */
    public String secondaryTestEndpoint() {
        return this.secondaryTestEndpoint;
    }

    /**
     * Set secondary test endpoint.
     *
     * @param secondaryTestEndpoint the secondaryTestEndpoint value to set
     * @return the TestKeysInner object itself.
     */
    public TestKeysInner withSecondaryTestEndpoint(String secondaryTestEndpoint) {
        this.secondaryTestEndpoint = secondaryTestEndpoint;
        return this;
    }

    /**
     * Get indicates whether the test endpoint feature enabled or not.
     *
     * @return the enabled value
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set indicates whether the test endpoint feature enabled or not.
     *
     * @param enabled the enabled value to set
     * @return the TestKeysInner object itself.
     */
    public TestKeysInner withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

}
