// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.generated;

import com.azure.resourcemanager.servicefabric.models.ServiceLoadMetricDescription;
import com.azure.resourcemanager.servicefabric.models.ServiceLoadMetricWeight;
import com.azure.resourcemanager.servicefabric.models.ServiceResource;
import com.azure.resourcemanager.servicefabric.models.StatelessServiceUpdateProperties;
import java.util.Arrays;

/** Samples for Services Update. */
public final class ServicesUpdateSamples {
    /*
     * x-ms-original-file: specification/servicefabric/resource-manager/Microsoft.ServiceFabric/stable/2021-06-01/examples/ServicePatchOperation_example.json
     */
    /**
     * Sample code: Patch a service.
     *
     * @param manager Entry point to ServiceFabricManager.
     */
    public static void patchAService(com.azure.resourcemanager.servicefabric.ServiceFabricManager manager) {
        ServiceResource resource =
            manager
                .services()
                .getWithResponse("resRg", "myCluster", "myApp", "myService", com.azure.core.util.Context.NONE)
                .getValue();
        resource
            .update()
            .withProperties(
                new StatelessServiceUpdateProperties()
                    .withServiceLoadMetrics(
                        Arrays
                            .asList(
                                new ServiceLoadMetricDescription()
                                    .withName("metric1")
                                    .withWeight(ServiceLoadMetricWeight.LOW))))
            .apply();
    }
}
