// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.servicefabric.models.ApplicationDeltaHealthPolicy;
import com.azure.resourcemanager.servicefabric.models.ClusterUpgradeDeltaHealthPolicy;
import com.azure.resourcemanager.servicefabric.models.ServiceTypeDeltaHealthPolicy;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ClusterUpgradeDeltaHealthPolicyTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClusterUpgradeDeltaHealthPolicy model =
            BinaryData
                .fromString(
                    "{\"maxPercentDeltaUnhealthyNodes\":1676988315,\"maxPercentUpgradeDomainDeltaUnhealthyNodes\":354282788,\"maxPercentDeltaUnhealthyApplications\":180815183,\"applicationDeltaHealthPolicies\":{\"lxofpdvhpfxxypin\":{\"defaultServiceTypeDeltaHealthPolicy\":{\"maxPercentDeltaUnhealthyServices\":1432370634},\"serviceTypeDeltaHealthPolicies\":{}},\"uybbkpodep\":{\"defaultServiceTypeDeltaHealthPolicy\":{\"maxPercentDeltaUnhealthyServices\":1257825373},\"serviceTypeDeltaHealthPolicies\":{}}}}")
                .toObject(ClusterUpgradeDeltaHealthPolicy.class);
        Assertions.assertEquals(1676988315, model.maxPercentDeltaUnhealthyNodes());
        Assertions.assertEquals(354282788, model.maxPercentUpgradeDomainDeltaUnhealthyNodes());
        Assertions.assertEquals(180815183, model.maxPercentDeltaUnhealthyApplications());
        Assertions
            .assertEquals(
                1432370634,
                model
                    .applicationDeltaHealthPolicies()
                    .get("lxofpdvhpfxxypin")
                    .defaultServiceTypeDeltaHealthPolicy()
                    .maxPercentDeltaUnhealthyServices());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClusterUpgradeDeltaHealthPolicy model =
            new ClusterUpgradeDeltaHealthPolicy()
                .withMaxPercentDeltaUnhealthyNodes(1676988315)
                .withMaxPercentUpgradeDomainDeltaUnhealthyNodes(354282788)
                .withMaxPercentDeltaUnhealthyApplications(180815183)
                .withApplicationDeltaHealthPolicies(
                    mapOf(
                        "lxofpdvhpfxxypin",
                        new ApplicationDeltaHealthPolicy()
                            .withDefaultServiceTypeDeltaHealthPolicy(
                                new ServiceTypeDeltaHealthPolicy().withMaxPercentDeltaUnhealthyServices(1432370634))
                            .withServiceTypeDeltaHealthPolicies(mapOf()),
                        "uybbkpodep",
                        new ApplicationDeltaHealthPolicy()
                            .withDefaultServiceTypeDeltaHealthPolicy(
                                new ServiceTypeDeltaHealthPolicy().withMaxPercentDeltaUnhealthyServices(1257825373))
                            .withServiceTypeDeltaHealthPolicies(mapOf())));
        model = BinaryData.fromObject(model).toObject(ClusterUpgradeDeltaHealthPolicy.class);
        Assertions.assertEquals(1676988315, model.maxPercentDeltaUnhealthyNodes());
        Assertions.assertEquals(354282788, model.maxPercentUpgradeDomainDeltaUnhealthyNodes());
        Assertions.assertEquals(180815183, model.maxPercentDeltaUnhealthyApplications());
        Assertions
            .assertEquals(
                1432370634,
                model
                    .applicationDeltaHealthPolicies()
                    .get("lxofpdvhpfxxypin")
                    .defaultServiceTypeDeltaHealthPolicy()
                    .maxPercentDeltaUnhealthyServices());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
