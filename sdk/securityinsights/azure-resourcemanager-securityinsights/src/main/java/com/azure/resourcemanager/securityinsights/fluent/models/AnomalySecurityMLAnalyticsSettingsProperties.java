// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.securityinsights.models.AttackTactic;
import com.azure.resourcemanager.securityinsights.models.SecurityMLAnalyticsSettingsDataSource;
import com.azure.resourcemanager.securityinsights.models.SettingsStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

/** AnomalySecurityMLAnalytics settings base property bag. */
@Fluent
public final class AnomalySecurityMLAnalyticsSettingsProperties {
    /*
     * The description of the SecurityMLAnalyticsSettings.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The display name for settings created by this SecurityMLAnalyticsSettings.
     */
    @JsonProperty(value = "displayName", required = true)
    private String displayName;

    /*
     * Determines whether this settings is enabled or disabled.
     */
    @JsonProperty(value = "enabled", required = true)
    private boolean enabled;

    /*
     * The last time that this SecurityMLAnalyticsSettings has been modified.
     */
    @JsonProperty(value = "lastModifiedUtc", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastModifiedUtc;

    /*
     * The required data sources for this SecurityMLAnalyticsSettings
     */
    @JsonProperty(value = "requiredDataConnectors")
    private List<SecurityMLAnalyticsSettingsDataSource> requiredDataConnectors;

    /*
     * The tactics of the SecurityMLAnalyticsSettings
     */
    @JsonProperty(value = "tactics")
    private List<AttackTactic> tactics;

    /*
     * The techniques of the SecurityMLAnalyticsSettings
     */
    @JsonProperty(value = "techniques")
    private List<String> techniques;

    /*
     * The anomaly version of the AnomalySecurityMLAnalyticsSettings.
     */
    @JsonProperty(value = "anomalyVersion", required = true)
    private String anomalyVersion;

    /*
     * The customizable observations of the AnomalySecurityMLAnalyticsSettings.
     */
    @JsonProperty(value = "customizableObservations")
    private Object customizableObservations;

    /*
     * The frequency that this SecurityMLAnalyticsSettings will be run.
     */
    @JsonProperty(value = "frequency", required = true)
    private Duration frequency;

    /*
     * The anomaly SecurityMLAnalyticsSettings status
     */
    @JsonProperty(value = "settingsStatus", required = true)
    private SettingsStatus settingsStatus;

    /*
     * Determines whether this anomaly security ml analytics settings is a default settings
     */
    @JsonProperty(value = "isDefaultSettings", required = true)
    private boolean isDefaultSettings;

    /*
     * The anomaly settings version of the Anomaly security ml analytics settings that dictates whether job version
     * gets updated or not.
     */
    @JsonProperty(value = "anomalySettingsVersion")
    private Integer anomalySettingsVersion;

    /*
     * The anomaly settings definition Id
     */
    @JsonProperty(value = "settingsDefinitionId")
    private UUID settingsDefinitionId;

    /**
     * Get the description property: The description of the SecurityMLAnalyticsSettings.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description of the SecurityMLAnalyticsSettings.
     *
     * @param description the description value to set.
     * @return the AnomalySecurityMLAnalyticsSettingsProperties object itself.
     */
    public AnomalySecurityMLAnalyticsSettingsProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the displayName property: The display name for settings created by this SecurityMLAnalyticsSettings.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The display name for settings created by this SecurityMLAnalyticsSettings.
     *
     * @param displayName the displayName value to set.
     * @return the AnomalySecurityMLAnalyticsSettingsProperties object itself.
     */
    public AnomalySecurityMLAnalyticsSettingsProperties withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the enabled property: Determines whether this settings is enabled or disabled.
     *
     * @return the enabled value.
     */
    public boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Determines whether this settings is enabled or disabled.
     *
     * @param enabled the enabled value to set.
     * @return the AnomalySecurityMLAnalyticsSettingsProperties object itself.
     */
    public AnomalySecurityMLAnalyticsSettingsProperties withEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the lastModifiedUtc property: The last time that this SecurityMLAnalyticsSettings has been modified.
     *
     * @return the lastModifiedUtc value.
     */
    public OffsetDateTime lastModifiedUtc() {
        return this.lastModifiedUtc;
    }

    /**
     * Get the requiredDataConnectors property: The required data sources for this SecurityMLAnalyticsSettings.
     *
     * @return the requiredDataConnectors value.
     */
    public List<SecurityMLAnalyticsSettingsDataSource> requiredDataConnectors() {
        return this.requiredDataConnectors;
    }

    /**
     * Set the requiredDataConnectors property: The required data sources for this SecurityMLAnalyticsSettings.
     *
     * @param requiredDataConnectors the requiredDataConnectors value to set.
     * @return the AnomalySecurityMLAnalyticsSettingsProperties object itself.
     */
    public AnomalySecurityMLAnalyticsSettingsProperties withRequiredDataConnectors(
        List<SecurityMLAnalyticsSettingsDataSource> requiredDataConnectors) {
        this.requiredDataConnectors = requiredDataConnectors;
        return this;
    }

    /**
     * Get the tactics property: The tactics of the SecurityMLAnalyticsSettings.
     *
     * @return the tactics value.
     */
    public List<AttackTactic> tactics() {
        return this.tactics;
    }

    /**
     * Set the tactics property: The tactics of the SecurityMLAnalyticsSettings.
     *
     * @param tactics the tactics value to set.
     * @return the AnomalySecurityMLAnalyticsSettingsProperties object itself.
     */
    public AnomalySecurityMLAnalyticsSettingsProperties withTactics(List<AttackTactic> tactics) {
        this.tactics = tactics;
        return this;
    }

    /**
     * Get the techniques property: The techniques of the SecurityMLAnalyticsSettings.
     *
     * @return the techniques value.
     */
    public List<String> techniques() {
        return this.techniques;
    }

    /**
     * Set the techniques property: The techniques of the SecurityMLAnalyticsSettings.
     *
     * @param techniques the techniques value to set.
     * @return the AnomalySecurityMLAnalyticsSettingsProperties object itself.
     */
    public AnomalySecurityMLAnalyticsSettingsProperties withTechniques(List<String> techniques) {
        this.techniques = techniques;
        return this;
    }

    /**
     * Get the anomalyVersion property: The anomaly version of the AnomalySecurityMLAnalyticsSettings.
     *
     * @return the anomalyVersion value.
     */
    public String anomalyVersion() {
        return this.anomalyVersion;
    }

    /**
     * Set the anomalyVersion property: The anomaly version of the AnomalySecurityMLAnalyticsSettings.
     *
     * @param anomalyVersion the anomalyVersion value to set.
     * @return the AnomalySecurityMLAnalyticsSettingsProperties object itself.
     */
    public AnomalySecurityMLAnalyticsSettingsProperties withAnomalyVersion(String anomalyVersion) {
        this.anomalyVersion = anomalyVersion;
        return this;
    }

    /**
     * Get the customizableObservations property: The customizable observations of the
     * AnomalySecurityMLAnalyticsSettings.
     *
     * @return the customizableObservations value.
     */
    public Object customizableObservations() {
        return this.customizableObservations;
    }

    /**
     * Set the customizableObservations property: The customizable observations of the
     * AnomalySecurityMLAnalyticsSettings.
     *
     * @param customizableObservations the customizableObservations value to set.
     * @return the AnomalySecurityMLAnalyticsSettingsProperties object itself.
     */
    public AnomalySecurityMLAnalyticsSettingsProperties withCustomizableObservations(Object customizableObservations) {
        this.customizableObservations = customizableObservations;
        return this;
    }

    /**
     * Get the frequency property: The frequency that this SecurityMLAnalyticsSettings will be run.
     *
     * @return the frequency value.
     */
    public Duration frequency() {
        return this.frequency;
    }

    /**
     * Set the frequency property: The frequency that this SecurityMLAnalyticsSettings will be run.
     *
     * @param frequency the frequency value to set.
     * @return the AnomalySecurityMLAnalyticsSettingsProperties object itself.
     */
    public AnomalySecurityMLAnalyticsSettingsProperties withFrequency(Duration frequency) {
        this.frequency = frequency;
        return this;
    }

    /**
     * Get the settingsStatus property: The anomaly SecurityMLAnalyticsSettings status.
     *
     * @return the settingsStatus value.
     */
    public SettingsStatus settingsStatus() {
        return this.settingsStatus;
    }

    /**
     * Set the settingsStatus property: The anomaly SecurityMLAnalyticsSettings status.
     *
     * @param settingsStatus the settingsStatus value to set.
     * @return the AnomalySecurityMLAnalyticsSettingsProperties object itself.
     */
    public AnomalySecurityMLAnalyticsSettingsProperties withSettingsStatus(SettingsStatus settingsStatus) {
        this.settingsStatus = settingsStatus;
        return this;
    }

    /**
     * Get the isDefaultSettings property: Determines whether this anomaly security ml analytics settings is a default
     * settings.
     *
     * @return the isDefaultSettings value.
     */
    public boolean isDefaultSettings() {
        return this.isDefaultSettings;
    }

    /**
     * Set the isDefaultSettings property: Determines whether this anomaly security ml analytics settings is a default
     * settings.
     *
     * @param isDefaultSettings the isDefaultSettings value to set.
     * @return the AnomalySecurityMLAnalyticsSettingsProperties object itself.
     */
    public AnomalySecurityMLAnalyticsSettingsProperties withIsDefaultSettings(boolean isDefaultSettings) {
        this.isDefaultSettings = isDefaultSettings;
        return this;
    }

    /**
     * Get the anomalySettingsVersion property: The anomaly settings version of the Anomaly security ml analytics
     * settings that dictates whether job version gets updated or not.
     *
     * @return the anomalySettingsVersion value.
     */
    public Integer anomalySettingsVersion() {
        return this.anomalySettingsVersion;
    }

    /**
     * Set the anomalySettingsVersion property: The anomaly settings version of the Anomaly security ml analytics
     * settings that dictates whether job version gets updated or not.
     *
     * @param anomalySettingsVersion the anomalySettingsVersion value to set.
     * @return the AnomalySecurityMLAnalyticsSettingsProperties object itself.
     */
    public AnomalySecurityMLAnalyticsSettingsProperties withAnomalySettingsVersion(Integer anomalySettingsVersion) {
        this.anomalySettingsVersion = anomalySettingsVersion;
        return this;
    }

    /**
     * Get the settingsDefinitionId property: The anomaly settings definition Id.
     *
     * @return the settingsDefinitionId value.
     */
    public UUID settingsDefinitionId() {
        return this.settingsDefinitionId;
    }

    /**
     * Set the settingsDefinitionId property: The anomaly settings definition Id.
     *
     * @param settingsDefinitionId the settingsDefinitionId value to set.
     * @return the AnomalySecurityMLAnalyticsSettingsProperties object itself.
     */
    public AnomalySecurityMLAnalyticsSettingsProperties withSettingsDefinitionId(UUID settingsDefinitionId) {
        this.settingsDefinitionId = settingsDefinitionId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (displayName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property displayName in model AnomalySecurityMLAnalyticsSettingsProperties"));
        }
        if (requiredDataConnectors() != null) {
            requiredDataConnectors().forEach(e -> e.validate());
        }
        if (anomalyVersion() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property anomalyVersion in model"
                            + " AnomalySecurityMLAnalyticsSettingsProperties"));
        }
        if (frequency() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property frequency in model AnomalySecurityMLAnalyticsSettingsProperties"));
        }
        if (settingsStatus() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property settingsStatus in model"
                            + " AnomalySecurityMLAnalyticsSettingsProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AnomalySecurityMLAnalyticsSettingsProperties.class);
}