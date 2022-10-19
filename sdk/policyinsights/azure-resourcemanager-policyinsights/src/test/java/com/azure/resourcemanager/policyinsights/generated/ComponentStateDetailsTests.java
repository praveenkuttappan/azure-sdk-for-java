// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.policyinsights.models.ComponentStateDetails;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ComponentStateDetailsTests {
    @Test
    public void testDeserialize() {
        ComponentStateDetails model =
            BinaryData
                .fromString(
                    "{\"id\":\"hvylwzbt\",\"type\":\"xujznbmpowu\",\"name\":\"rzqlveu\",\"timestamp\":\"2021-02-19T06:27:55Z\",\"complianceState\":\"j\",\"\":{}}")
                .toObject(ComponentStateDetails.class);
        Assertions.assertEquals("hvylwzbt", model.id());
        Assertions.assertEquals("xujznbmpowu", model.type());
        Assertions.assertEquals("rzqlveu", model.name());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-19T06:27:55Z"), model.timestamp());
        Assertions.assertEquals("j", model.complianceState());
    }

    @Test
    public void testSerialize() {
        ComponentStateDetails model =
            new ComponentStateDetails()
                .withId("hvylwzbt")
                .withType("xujznbmpowu")
                .withName("rzqlveu")
                .withTimestamp(OffsetDateTime.parse("2021-02-19T06:27:55Z"))
                .withComplianceState("j")
                .withAdditionalProperties(mapOf());
        model = BinaryData.fromObject(model).toObject(ComponentStateDetails.class);
        Assertions.assertEquals("hvylwzbt", model.id());
        Assertions.assertEquals("xujznbmpowu", model.type());
        Assertions.assertEquals("rzqlveu", model.name());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-19T06:27:55Z"), model.timestamp());
        Assertions.assertEquals("j", model.complianceState());
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