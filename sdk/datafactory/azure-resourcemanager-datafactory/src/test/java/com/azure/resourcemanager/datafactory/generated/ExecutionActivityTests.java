// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ActivityDependency;
import com.azure.resourcemanager.datafactory.models.ActivityPolicy;
import com.azure.resourcemanager.datafactory.models.DependencyCondition;
import com.azure.resourcemanager.datafactory.models.ExecutionActivity;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.UserProperty;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ExecutionActivityTests {
    @Test
    public void testDeserialize() {
        ExecutionActivity model =
            BinaryData
                .fromString(
                    "{\"type\":\"Execution\",\"linkedServiceName\":{\"referenceName\":\"u\",\"parameters\":{}},\"policy\":{\"retryIntervalInSeconds\":130451955,\"secureInput\":true,\"secureOutput\":true,\"\":{}},\"name\":\"v\",\"description\":\"qqjwkrh\",\"dependsOn\":[{\"activity\":\"anojisgglmvokat\",\"dependencyConditions\":[\"Completed\",\"Skipped\",\"Skipped\",\"Failed\"],\"\":{}}],\"userProperties\":[{\"name\":\"bk\"},{\"name\":\"ehxsmzygdfwakws\"}],\"\":{}}")
                .toObject(ExecutionActivity.class);
        Assertions.assertEquals("v", model.name());
        Assertions.assertEquals("qqjwkrh", model.description());
        Assertions.assertEquals("anojisgglmvokat", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.COMPLETED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("bk", model.userProperties().get(0).name());
        Assertions.assertEquals("u", model.linkedServiceName().referenceName());
        Assertions.assertEquals(130451955, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(true, model.policy().secureInput());
        Assertions.assertEquals(true, model.policy().secureOutput());
    }

    @Test
    public void testSerialize() {
        ExecutionActivity model =
            new ExecutionActivity()
                .withName("v")
                .withDescription("qqjwkrh")
                .withDependsOn(
                    Arrays
                        .asList(
                            new ActivityDependency()
                                .withActivity("anojisgglmvokat")
                                .withDependencyConditions(
                                    Arrays
                                        .asList(
                                            DependencyCondition.COMPLETED,
                                            DependencyCondition.SKIPPED,
                                            DependencyCondition.SKIPPED,
                                            DependencyCondition.FAILED))
                                .withAdditionalProperties(mapOf())))
                .withUserProperties(
                    Arrays.asList(new UserProperty().withName("bk"), new UserProperty().withName("ehxsmzygdfwakws")))
                .withLinkedServiceName(new LinkedServiceReference().withReferenceName("u").withParameters(mapOf()))
                .withPolicy(
                    new ActivityPolicy()
                        .withRetryIntervalInSeconds(130451955)
                        .withSecureInput(true)
                        .withSecureOutput(true)
                        .withAdditionalProperties(mapOf()));
        model = BinaryData.fromObject(model).toObject(ExecutionActivity.class);
        Assertions.assertEquals("v", model.name());
        Assertions.assertEquals("qqjwkrh", model.description());
        Assertions.assertEquals("anojisgglmvokat", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.COMPLETED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("bk", model.userProperties().get(0).name());
        Assertions.assertEquals("u", model.linkedServiceName().referenceName());
        Assertions.assertEquals(130451955, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(true, model.policy().secureInput());
        Assertions.assertEquals(true, model.policy().secureOutput());
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