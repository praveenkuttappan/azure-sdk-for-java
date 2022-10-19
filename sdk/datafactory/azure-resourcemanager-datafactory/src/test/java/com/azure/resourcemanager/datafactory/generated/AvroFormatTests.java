// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AvroFormat;
import org.junit.jupiter.api.Test;

public final class AvroFormatTests {
    @Test
    public void testDeserialize() {
        AvroFormat model = BinaryData.fromString("{\"type\":\"AvroFormat\",\"\":{}}").toObject(AvroFormat.class);
    }

    @Test
    public void testSerialize() {
        AvroFormat model = new AvroFormat();
        model = BinaryData.fromObject(model).toObject(AvroFormat.class);
    }
}