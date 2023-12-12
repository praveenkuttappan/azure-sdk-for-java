// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

/**
 * Samples for ProximityPlacementGroups GetByResourceGroup.
 */
public final class ProximityPlacementGroupsGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2023-09-01/examples/
     * proximityPlacementGroupExamples/ProximityPlacementGroup_Get.json
     */
    /**
     * Sample code: Get proximity placement groups.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getProximityPlacementGroups(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines().manager().serviceClient().getProximityPlacementGroups().getByResourceGroupWithResponse(
            "myResourceGroup", "myProximityPlacementGroup", null, com.azure.core.util.Context.NONE);
    }
}
