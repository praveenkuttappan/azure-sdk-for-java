// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.DatasetResourceInner;
import com.azure.resourcemanager.datafactory.models.Dataset;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DatasetResourceInnerTests {
    @Test
    public void testDeserialize() {
        DatasetResourceInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"type\":\"Dataset\",\"description\":\"vjtoqnermclfp\",\"linkedServiceName\":{\"referenceName\":\"oxuscrpabgyepsbj\",\"parameters\":{}},\"parameters\":{\"ywpmueefjzwfqkq\":{\"type\":\"SecureString\"},\"dsuyonobgla\":{\"type\":\"String\"},\"xtccmg\":{\"type\":\"String\"}},\"annotations\":[],\"folder\":{\"name\":\"tlmoyrx\"},\"\":{}},\"name\":\"dw\",\"type\":\"ntxhdzhlrqjbhck\",\"etag\":\"lhrxsbkyvpyc\",\"id\":\"uzbpzkafku\"}")
                .toObject(DatasetResourceInner.class);
        Assertions.assertEquals("uzbpzkafku", model.id());
        Assertions.assertEquals("vjtoqnermclfp", model.properties().description());
        Assertions.assertEquals("oxuscrpabgyepsbj", model.properties().linkedServiceName().referenceName());
        Assertions
            .assertEquals(ParameterType.SECURE_STRING, model.properties().parameters().get("ywpmueefjzwfqkq").type());
        Assertions.assertEquals("tlmoyrx", model.properties().folder().name());
    }

    @Test
    public void testSerialize() {
        DatasetResourceInner model =
            new DatasetResourceInner()
                .withId("uzbpzkafku")
                .withProperties(
                    new Dataset()
                        .withDescription("vjtoqnermclfp")
                        .withLinkedServiceName(
                            new LinkedServiceReference().withReferenceName("oxuscrpabgyepsbj").withParameters(mapOf()))
                        .withParameters(
                            mapOf(
                                "ywpmueefjzwfqkq",
                                new ParameterSpecification().withType(ParameterType.SECURE_STRING),
                                "dsuyonobgla",
                                new ParameterSpecification().withType(ParameterType.STRING),
                                "xtccmg",
                                new ParameterSpecification().withType(ParameterType.STRING)))
                        .withAnnotations(Arrays.asList())
                        .withFolder(new DatasetFolder().withName("tlmoyrx"))
                        .withAdditionalProperties(mapOf("type", "Dataset")));
        model = BinaryData.fromObject(model).toObject(DatasetResourceInner.class);
        Assertions.assertEquals("uzbpzkafku", model.id());
        Assertions.assertEquals("vjtoqnermclfp", model.properties().description());
        Assertions.assertEquals("oxuscrpabgyepsbj", model.properties().linkedServiceName().referenceName());
        Assertions
            .assertEquals(ParameterType.SECURE_STRING, model.properties().parameters().get("ywpmueefjzwfqkq").type());
        Assertions.assertEquals("tlmoyrx", model.properties().folder().name());
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