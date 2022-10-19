// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.fluent.models.AuthConfigInner;
import com.azure.resourcemanager.appcontainers.models.AuthConfigCollection;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

public final class AuthConfigCollectionTests {
    @Test
    public void testDeserialize() {
        AuthConfigCollection model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{},\"id\":\"xpyb\",\"name\":\"zm\",\"type\":\"hmtzopbsphrup\"},{\"properties\":{},\"id\":\"jhphoyc\",\"name\":\"sx\",\"type\":\"obhdxbmtqioqjze\"},{\"properties\":{},\"id\":\"wnoi\",\"name\":\"hwlrx\",\"type\":\"bqsoqijg\"}],\"nextLink\":\"mbpazlobcufpdzn\"}")
                .toObject(AuthConfigCollection.class);
    }

    @Test
    public void testSerialize() {
        AuthConfigCollection model =
            new AuthConfigCollection()
                .withValue(Arrays.asList(new AuthConfigInner(), new AuthConfigInner(), new AuthConfigInner()));
        model = BinaryData.fromObject(model).toObject(AuthConfigCollection.class);
    }
}