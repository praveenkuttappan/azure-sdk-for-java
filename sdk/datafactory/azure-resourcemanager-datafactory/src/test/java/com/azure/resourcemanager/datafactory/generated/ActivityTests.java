// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.Activity;
import com.azure.resourcemanager.datafactory.models.ActivityDependency;
import com.azure.resourcemanager.datafactory.models.DependencyCondition;
import com.azure.resourcemanager.datafactory.models.UserProperty;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ActivityTests {
    @Test
    public void testDeserialize() {
        Activity model =
            BinaryData
                .fromString(
                    "{\"type\":\"Activity\",\"name\":\"gudivkrtswbxqz\",\"description\":\"zjf\",\"dependsOn\":[{\"activity\":\"j\",\"dependencyConditions\":[\"Failed\",\"Failed\"],\"\":{}},{\"activity\":\"e\",\"dependencyConditions\":[\"Succeeded\",\"Skipped\",\"Completed\"],\"\":{}}],\"userProperties\":[{\"name\":\"oqmcbxvwvxyslq\"},{\"name\":\"hsfxoblytkb\"},{\"name\":\"mpew\"},{\"name\":\"wfbkrvrns\"}],\"\":{}}")
                .toObject(Activity.class);
        Assertions.assertEquals("gudivkrtswbxqz", model.name());
        Assertions.assertEquals("zjf", model.description());
        Assertions.assertEquals("j", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.FAILED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("oqmcbxvwvxyslq", model.userProperties().get(0).name());
    }

    @Test
    public void testSerialize() {
        Activity model =
            new Activity()
                .withName("gudivkrtswbxqz")
                .withDescription("zjf")
                .withDependsOn(
                    Arrays
                        .asList(
                            new ActivityDependency()
                                .withActivity("j")
                                .withDependencyConditions(
                                    Arrays.asList(DependencyCondition.FAILED, DependencyCondition.FAILED))
                                .withAdditionalProperties(mapOf()),
                            new ActivityDependency()
                                .withActivity("e")
                                .withDependencyConditions(
                                    Arrays
                                        .asList(
                                            DependencyCondition.SUCCEEDED,
                                            DependencyCondition.SKIPPED,
                                            DependencyCondition.COMPLETED))
                                .withAdditionalProperties(mapOf())))
                .withUserProperties(
                    Arrays
                        .asList(
                            new UserProperty().withName("oqmcbxvwvxyslq"),
                            new UserProperty().withName("hsfxoblytkb"),
                            new UserProperty().withName("mpew"),
                            new UserProperty().withName("wfbkrvrns")))
                .withAdditionalProperties(mapOf("type", "Activity"));
        model = BinaryData.fromObject(model).toObject(Activity.class);
        Assertions.assertEquals("gudivkrtswbxqz", model.name());
        Assertions.assertEquals("zjf", model.description());
        Assertions.assertEquals("j", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.FAILED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("oqmcbxvwvxyslq", model.userProperties().get(0).name());
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