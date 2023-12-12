// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

/**
 * Samples for VirtualMachines Delete.
 */
public final class VirtualMachinesDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2023-09-01/examples/
     * virtualMachineExamples/VirtualMachine_Delete_Force.json
     */
    /**
     * Sample code: Force delete a VM.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void forceDeleteAVM(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines().manager().serviceClient().getVirtualMachines().delete("myResourceGroup", "myVM", true,
            com.azure.core.util.Context.NONE);
    }
}
