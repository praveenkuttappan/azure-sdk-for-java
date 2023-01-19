// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storageimportexport.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.storageimportexport.fluent.models.JobResponseInner;
import com.azure.resourcemanager.storageimportexport.models.DeliveryPackageInformation;
import com.azure.resourcemanager.storageimportexport.models.DriveStatus;
import com.azure.resourcemanager.storageimportexport.models.IdentityDetails;
import com.azure.resourcemanager.storageimportexport.models.JobDetails;
import com.azure.resourcemanager.storageimportexport.models.JobResponse;
import com.azure.resourcemanager.storageimportexport.models.PutJobParameters;
import com.azure.resourcemanager.storageimportexport.models.ReturnAddress;
import com.azure.resourcemanager.storageimportexport.models.ReturnShipping;
import com.azure.resourcemanager.storageimportexport.models.UpdateJobParameters;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class JobResponseImpl implements JobResponse, JobResponse.Definition, JobResponse.Update {
    private JobResponseInner innerObject;

    private final com.azure.resourcemanager.storageimportexport.StorageImportExportManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public JobDetails properties() {
        return this.innerModel().properties();
    }

    public IdentityDetails identity() {
        return this.innerModel().identity();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public JobResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.storageimportexport.StorageImportExportManager manager() {
        return this.serviceManager;
    }

    private String jobName;

    private String resourceGroupName;

    private String createClientTenantId;

    private PutJobParameters createBody;

    private UpdateJobParameters updateBody;

    public JobResponseImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public JobResponse create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getJobs()
                .createWithResponse(jobName, resourceGroupName, createBody, createClientTenantId, Context.NONE)
                .getValue();
        return this;
    }

    public JobResponse create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getJobs()
                .createWithResponse(jobName, resourceGroupName, createBody, createClientTenantId, context)
                .getValue();
        return this;
    }

    JobResponseImpl(
        String name, com.azure.resourcemanager.storageimportexport.StorageImportExportManager serviceManager) {
        this.innerObject = new JobResponseInner();
        this.serviceManager = serviceManager;
        this.jobName = name;
        this.createClientTenantId = null;
        this.createBody = new PutJobParameters();
    }

    public JobResponseImpl update() {
        this.updateBody = new UpdateJobParameters();
        return this;
    }

    public JobResponse apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getJobs()
                .updateWithResponse(jobName, resourceGroupName, updateBody, Context.NONE)
                .getValue();
        return this;
    }

    public JobResponse apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getJobs()
                .updateWithResponse(jobName, resourceGroupName, updateBody, context)
                .getValue();
        return this;
    }

    JobResponseImpl(
        JobResponseInner innerObject,
        com.azure.resourcemanager.storageimportexport.StorageImportExportManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.jobName = Utils.getValueFromIdByName(innerObject.id(), "jobs");
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
    }

    public JobResponse refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getJobs()
                .getByResourceGroupWithResponse(resourceGroupName, jobName, Context.NONE)
                .getValue();
        return this;
    }

    public JobResponse refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getJobs()
                .getByResourceGroupWithResponse(resourceGroupName, jobName, context)
                .getValue();
        return this;
    }

    public JobResponseImpl withRegion(Region location) {
        this.createBody.withLocation(location.toString());
        return this;
    }

    public JobResponseImpl withRegion(String location) {
        this.createBody.withLocation(location);
        return this;
    }

    public JobResponseImpl withTags(Object tags) {
        if (isInCreateMode()) {
            this.createBody.withTags(tags);
            return this;
        } else {
            this.updateBody.withTags(tags);
            return this;
        }
    }

    public JobResponseImpl withProperties(JobDetails properties) {
        this.createBody.withProperties(properties);
        return this;
    }

    public JobResponseImpl withClientTenantId(String clientTenantId) {
        this.createClientTenantId = clientTenantId;
        return this;
    }

    public JobResponseImpl withCancelRequested(Boolean cancelRequested) {
        this.updateBody.withCancelRequested(cancelRequested);
        return this;
    }

    public JobResponseImpl withState(String state) {
        this.updateBody.withState(state);
        return this;
    }

    public JobResponseImpl withReturnAddress(ReturnAddress returnAddress) {
        this.updateBody.withReturnAddress(returnAddress);
        return this;
    }

    public JobResponseImpl withReturnShipping(ReturnShipping returnShipping) {
        this.updateBody.withReturnShipping(returnShipping);
        return this;
    }

    public JobResponseImpl withDeliveryPackage(DeliveryPackageInformation deliveryPackage) {
        this.updateBody.withDeliveryPackage(deliveryPackage);
        return this;
    }

    public JobResponseImpl withLogLevel(String logLevel) {
        this.updateBody.withLogLevel(logLevel);
        return this;
    }

    public JobResponseImpl withBackupDriveManifest(Boolean backupDriveManifest) {
        this.updateBody.withBackupDriveManifest(backupDriveManifest);
        return this;
    }

    public JobResponseImpl withDriveList(List<DriveStatus> driveList) {
        this.updateBody.withDriveList(driveList);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
