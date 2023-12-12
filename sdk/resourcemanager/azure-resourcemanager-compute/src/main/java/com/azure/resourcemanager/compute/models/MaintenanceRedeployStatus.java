// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * Maintenance Operation Status.
 */
@Fluent
public final class MaintenanceRedeployStatus {
    /*
     * True, if customer is allowed to perform Maintenance.
     */
    @JsonProperty(value = "isCustomerInitiatedMaintenanceAllowed")
    private Boolean isCustomerInitiatedMaintenanceAllowed;

    /*
     * Start Time for the Pre Maintenance Window.
     */
    @JsonProperty(value = "preMaintenanceWindowStartTime")
    private OffsetDateTime preMaintenanceWindowStartTime;

    /*
     * End Time for the Pre Maintenance Window.
     */
    @JsonProperty(value = "preMaintenanceWindowEndTime")
    private OffsetDateTime preMaintenanceWindowEndTime;

    /*
     * Start Time for the Maintenance Window.
     */
    @JsonProperty(value = "maintenanceWindowStartTime")
    private OffsetDateTime maintenanceWindowStartTime;

    /*
     * End Time for the Maintenance Window.
     */
    @JsonProperty(value = "maintenanceWindowEndTime")
    private OffsetDateTime maintenanceWindowEndTime;

    /*
     * The Last Maintenance Operation Result Code.
     */
    @JsonProperty(value = "lastOperationResultCode")
    private MaintenanceOperationResultCodeTypes lastOperationResultCode;

    /*
     * Message returned for the last Maintenance Operation.
     */
    @JsonProperty(value = "lastOperationMessage")
    private String lastOperationMessage;

    /**
     * Creates an instance of MaintenanceRedeployStatus class.
     */
    public MaintenanceRedeployStatus() {
    }

    /**
     * Get the isCustomerInitiatedMaintenanceAllowed property: True, if customer is allowed to perform Maintenance.
     * 
     * @return the isCustomerInitiatedMaintenanceAllowed value.
     */
    public Boolean isCustomerInitiatedMaintenanceAllowed() {
        return this.isCustomerInitiatedMaintenanceAllowed;
    }

    /**
     * Set the isCustomerInitiatedMaintenanceAllowed property: True, if customer is allowed to perform Maintenance.
     * 
     * @param isCustomerInitiatedMaintenanceAllowed the isCustomerInitiatedMaintenanceAllowed value to set.
     * @return the MaintenanceRedeployStatus object itself.
     */
    public MaintenanceRedeployStatus
        withIsCustomerInitiatedMaintenanceAllowed(Boolean isCustomerInitiatedMaintenanceAllowed) {
        this.isCustomerInitiatedMaintenanceAllowed = isCustomerInitiatedMaintenanceAllowed;
        return this;
    }

    /**
     * Get the preMaintenanceWindowStartTime property: Start Time for the Pre Maintenance Window.
     * 
     * @return the preMaintenanceWindowStartTime value.
     */
    public OffsetDateTime preMaintenanceWindowStartTime() {
        return this.preMaintenanceWindowStartTime;
    }

    /**
     * Set the preMaintenanceWindowStartTime property: Start Time for the Pre Maintenance Window.
     * 
     * @param preMaintenanceWindowStartTime the preMaintenanceWindowStartTime value to set.
     * @return the MaintenanceRedeployStatus object itself.
     */
    public MaintenanceRedeployStatus withPreMaintenanceWindowStartTime(OffsetDateTime preMaintenanceWindowStartTime) {
        this.preMaintenanceWindowStartTime = preMaintenanceWindowStartTime;
        return this;
    }

    /**
     * Get the preMaintenanceWindowEndTime property: End Time for the Pre Maintenance Window.
     * 
     * @return the preMaintenanceWindowEndTime value.
     */
    public OffsetDateTime preMaintenanceWindowEndTime() {
        return this.preMaintenanceWindowEndTime;
    }

    /**
     * Set the preMaintenanceWindowEndTime property: End Time for the Pre Maintenance Window.
     * 
     * @param preMaintenanceWindowEndTime the preMaintenanceWindowEndTime value to set.
     * @return the MaintenanceRedeployStatus object itself.
     */
    public MaintenanceRedeployStatus withPreMaintenanceWindowEndTime(OffsetDateTime preMaintenanceWindowEndTime) {
        this.preMaintenanceWindowEndTime = preMaintenanceWindowEndTime;
        return this;
    }

    /**
     * Get the maintenanceWindowStartTime property: Start Time for the Maintenance Window.
     * 
     * @return the maintenanceWindowStartTime value.
     */
    public OffsetDateTime maintenanceWindowStartTime() {
        return this.maintenanceWindowStartTime;
    }

    /**
     * Set the maintenanceWindowStartTime property: Start Time for the Maintenance Window.
     * 
     * @param maintenanceWindowStartTime the maintenanceWindowStartTime value to set.
     * @return the MaintenanceRedeployStatus object itself.
     */
    public MaintenanceRedeployStatus withMaintenanceWindowStartTime(OffsetDateTime maintenanceWindowStartTime) {
        this.maintenanceWindowStartTime = maintenanceWindowStartTime;
        return this;
    }

    /**
     * Get the maintenanceWindowEndTime property: End Time for the Maintenance Window.
     * 
     * @return the maintenanceWindowEndTime value.
     */
    public OffsetDateTime maintenanceWindowEndTime() {
        return this.maintenanceWindowEndTime;
    }

    /**
     * Set the maintenanceWindowEndTime property: End Time for the Maintenance Window.
     * 
     * @param maintenanceWindowEndTime the maintenanceWindowEndTime value to set.
     * @return the MaintenanceRedeployStatus object itself.
     */
    public MaintenanceRedeployStatus withMaintenanceWindowEndTime(OffsetDateTime maintenanceWindowEndTime) {
        this.maintenanceWindowEndTime = maintenanceWindowEndTime;
        return this;
    }

    /**
     * Get the lastOperationResultCode property: The Last Maintenance Operation Result Code.
     * 
     * @return the lastOperationResultCode value.
     */
    public MaintenanceOperationResultCodeTypes lastOperationResultCode() {
        return this.lastOperationResultCode;
    }

    /**
     * Set the lastOperationResultCode property: The Last Maintenance Operation Result Code.
     * 
     * @param lastOperationResultCode the lastOperationResultCode value to set.
     * @return the MaintenanceRedeployStatus object itself.
     */
    public MaintenanceRedeployStatus
        withLastOperationResultCode(MaintenanceOperationResultCodeTypes lastOperationResultCode) {
        this.lastOperationResultCode = lastOperationResultCode;
        return this;
    }

    /**
     * Get the lastOperationMessage property: Message returned for the last Maintenance Operation.
     * 
     * @return the lastOperationMessage value.
     */
    public String lastOperationMessage() {
        return this.lastOperationMessage;
    }

    /**
     * Set the lastOperationMessage property: Message returned for the last Maintenance Operation.
     * 
     * @param lastOperationMessage the lastOperationMessage value to set.
     * @return the MaintenanceRedeployStatus object itself.
     */
    public MaintenanceRedeployStatus withLastOperationMessage(String lastOperationMessage) {
        this.lastOperationMessage = lastOperationMessage;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
