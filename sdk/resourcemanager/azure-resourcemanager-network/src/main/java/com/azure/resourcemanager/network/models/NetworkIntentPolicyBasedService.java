// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Network intent policy based services. */
public final class NetworkIntentPolicyBasedService extends ExpandableStringEnum<NetworkIntentPolicyBasedService> {
    /** Static value None for NetworkIntentPolicyBasedService. */
    public static final NetworkIntentPolicyBasedService NONE = fromString("None");

    /** Static value All for NetworkIntentPolicyBasedService. */
    public static final NetworkIntentPolicyBasedService ALL = fromString("All");

    /**
     * Creates or finds a NetworkIntentPolicyBasedService from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding NetworkIntentPolicyBasedService.
     */
    @JsonCreator
    public static NetworkIntentPolicyBasedService fromString(String name) {
        return fromString(name, NetworkIntentPolicyBasedService.class);
    }

    /**
     * Gets known NetworkIntentPolicyBasedService values.
     *
     * @return known NetworkIntentPolicyBasedService values.
     */
    public static Collection<NetworkIntentPolicyBasedService> values() {
        return values(NetworkIntentPolicyBasedService.class);
    }
}