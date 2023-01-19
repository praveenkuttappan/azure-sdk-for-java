// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storageimportexport.generated;

/** Samples for Locations Get. */
public final class LocationsGetSamples {
    /*
     * x-ms-original-file: specification/storageimportexport/resource-manager/Microsoft.ImportExport/preview/2021-01-01/examples/GetLocation.json
     */
    /**
     * Sample code: Get locations.
     *
     * @param manager Entry point to StorageImportExportManager.
     */
    public static void getLocations(com.azure.resourcemanager.storageimportexport.StorageImportExportManager manager) {
        manager.locations().getWithResponse("West US", com.azure.core.util.Context.NONE);
    }
}
