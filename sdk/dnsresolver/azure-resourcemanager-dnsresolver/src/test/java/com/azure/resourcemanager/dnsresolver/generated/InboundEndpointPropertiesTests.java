// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dnsresolver.generated;

import com.azure.core.management.SubResource;
import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dnsresolver.fluent.models.InboundEndpointProperties;
import com.azure.resourcemanager.dnsresolver.models.IpAllocationMethod;
import com.azure.resourcemanager.dnsresolver.models.IpConfiguration;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class InboundEndpointPropertiesTests {
    @Test
    public void testDeserialize() {
        InboundEndpointProperties model =
            BinaryData
                .fromString(
                    "{\"ipConfigurations\":[{\"subnet\":{\"id\":\"fwvuk\"},\"privateIpAddress\":\"audccsnhs\",\"privateIpAllocationMethod\":\"Dynamic\"}],\"provisioningState\":\"Creating\",\"resourceGuid\":\"hkryhtn\"}")
                .toObject(InboundEndpointProperties.class);
        Assertions.assertEquals("fwvuk", model.ipConfigurations().get(0).subnet().id());
        Assertions.assertEquals("audccsnhs", model.ipConfigurations().get(0).privateIpAddress());
        Assertions
            .assertEquals(IpAllocationMethod.DYNAMIC, model.ipConfigurations().get(0).privateIpAllocationMethod());
    }

    @Test
    public void testSerialize() {
        InboundEndpointProperties model =
            new InboundEndpointProperties()
                .withIpConfigurations(
                    Arrays
                        .asList(
                            new IpConfiguration()
                                .withSubnet(new SubResource().withId("fwvuk"))
                                .withPrivateIpAddress("audccsnhs")
                                .withPrivateIpAllocationMethod(IpAllocationMethod.DYNAMIC)));
        model = BinaryData.fromObject(model).toObject(InboundEndpointProperties.class);
        Assertions.assertEquals("fwvuk", model.ipConfigurations().get(0).subnet().id());
        Assertions.assertEquals("audccsnhs", model.ipConfigurations().get(0).privateIpAddress());
        Assertions
            .assertEquals(IpAllocationMethod.DYNAMIC, model.ipConfigurations().get(0).privateIpAllocationMethod());
    }
}