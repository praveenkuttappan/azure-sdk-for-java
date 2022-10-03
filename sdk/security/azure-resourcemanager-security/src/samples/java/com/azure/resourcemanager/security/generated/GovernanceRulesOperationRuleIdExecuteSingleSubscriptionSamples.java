// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.Context;

/** Samples for GovernanceRulesOperation RuleIdExecuteSingleSubscription. */
public final class GovernanceRulesOperationRuleIdExecuteSingleSubscriptionSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2022-01-01-preview/examples/GovernanceRules/PostGovernanceRule_example.json
     */
    /**
     * Sample code: Execute Governance rule.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void executeGovernanceRule(com.azure.resourcemanager.security.SecurityManager manager) {
        manager
            .governanceRulesOperations()
            .ruleIdExecuteSingleSubscription("ad9a8e26-29d9-4829-bb30-e597a58cdbb8", null, Context.NONE);
    }
}