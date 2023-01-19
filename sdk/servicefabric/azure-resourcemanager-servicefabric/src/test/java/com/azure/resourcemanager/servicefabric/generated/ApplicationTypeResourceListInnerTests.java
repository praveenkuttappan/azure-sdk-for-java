// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.servicefabric.fluent.models.ApplicationTypeResourceInner;
import com.azure.resourcemanager.servicefabric.fluent.models.ApplicationTypeResourceListInner;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ApplicationTypeResourceListInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ApplicationTypeResourceListInner model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"provisioningState\":\"ftutqxlngxlefgu\"},\"location\":\"xkrxdqmi\",\"tags\":{\"abhjybi\":\"hzrvqd\"},\"etag\":\"h\",\"id\":\"fbowskanyk\",\"name\":\"zlcuiywgqywgndrv\",\"type\":\"nhzgpphrcgyn\"},{\"properties\":{\"provisioningState\":\"pec\"},\"location\":\"m\",\"tags\":{\"zevgb\":\"ofsx\"},\"etag\":\"jqabcypmivkwlzuv\",\"id\":\"fwnfnb\",\"name\":\"cfionl\",\"type\":\"bxetqgtzxdpn\"},{\"properties\":{\"provisioningState\":\"qwxrjfeallnw\"},\"location\":\"bisnja\",\"tags\":{\"onq\":\"ngnzscxaqwoochc\",\"ea\":\"pkvlrxn\",\"enjbdlwtgrhp\":\"eipheoflokeyy\"},\"etag\":\"pj\",\"id\":\"asxazjpqyegualhb\",\"name\":\"xhejjzzvdud\",\"type\":\"wdslfhotwmcy\"},{\"properties\":{\"provisioningState\":\"lbjnpgacftadehx\"},\"location\":\"tyfsoppusuesn\",\"tags\":{\"avo\":\"ej\",\"vudwx\":\"xzdmohctb\"},\"etag\":\"dnvowg\",\"id\":\"jugwdkcglhsl\",\"name\":\"zj\",\"type\":\"yggdtjixh\"}],\"nextLink\":\"uofqwe\"}")
                .toObject(ApplicationTypeResourceListInner.class);
        Assertions.assertEquals("xkrxdqmi", model.value().get(0).location());
        Assertions.assertEquals("hzrvqd", model.value().get(0).tags().get("abhjybi"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ApplicationTypeResourceListInner model =
            new ApplicationTypeResourceListInner()
                .withValue(
                    Arrays
                        .asList(
                            new ApplicationTypeResourceInner()
                                .withLocation("xkrxdqmi")
                                .withTags(mapOf("abhjybi", "hzrvqd")),
                            new ApplicationTypeResourceInner().withLocation("m").withTags(mapOf("zevgb", "ofsx")),
                            new ApplicationTypeResourceInner()
                                .withLocation("bisnja")
                                .withTags(
                                    mapOf("onq", "ngnzscxaqwoochc", "ea", "pkvlrxn", "enjbdlwtgrhp", "eipheoflokeyy")),
                            new ApplicationTypeResourceInner()
                                .withLocation("tyfsoppusuesn")
                                .withTags(mapOf("avo", "ej", "vudwx", "xzdmohctb"))));
        model = BinaryData.fromObject(model).toObject(ApplicationTypeResourceListInner.class);
        Assertions.assertEquals("xkrxdqmi", model.value().get(0).location());
        Assertions.assertEquals("hzrvqd", model.value().get(0).tags().get("abhjybi"));
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
