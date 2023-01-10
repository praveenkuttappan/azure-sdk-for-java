// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** Data Lake Analytics U-SQL activity. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("DataLakeAnalyticsU-SQL")
@JsonFlatten
@Fluent
public class DataLakeAnalyticsUsqlActivity extends ExecutionActivity {
    /*
     * Case-sensitive path to folder that contains the U-SQL script. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.scriptPath", required = true)
    private Object scriptPath;

    /*
     * Script linked service reference.
     */
    @JsonProperty(value = "typeProperties.scriptLinkedService", required = true)
    private LinkedServiceReference scriptLinkedService;

    /*
     * The maximum number of nodes simultaneously used to run the job. Default value is 1. Type: integer (or Expression
     * with resultType integer), minimum: 1.
     */
    @JsonProperty(value = "typeProperties.degreeOfParallelism")
    private Object degreeOfParallelism;

    /*
     * Determines which jobs out of all that are queued should be selected to run first. The lower the number, the
     * higher the priority. Default value is 1000. Type: integer (or Expression with resultType integer), minimum: 1.
     */
    @JsonProperty(value = "typeProperties.priority")
    private Object priority;

    /*
     * Parameters for U-SQL job request.
     */
    @JsonProperty(value = "typeProperties.parameters")
    private Map<String, Object> parameters;

    /*
     * Runtime version of the U-SQL engine to use. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.runtimeVersion")
    private Object runtimeVersion;

    /*
     * Compilation mode of U-SQL. Must be one of these values : Semantic, Full and SingleBox. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.compilationMode")
    private Object compilationMode;

    /** Creates an instance of DataLakeAnalyticsUsqlActivity class. */
    public DataLakeAnalyticsUsqlActivity() {}

    /**
     * Get the scriptPath property: Case-sensitive path to folder that contains the U-SQL script. Type: string (or
     * Expression with resultType string).
     *
     * @return the scriptPath value.
     */
    public Object getScriptPath() {
        return this.scriptPath;
    }

    /**
     * Set the scriptPath property: Case-sensitive path to folder that contains the U-SQL script. Type: string (or
     * Expression with resultType string).
     *
     * @param scriptPath the scriptPath value to set.
     * @return the DataLakeAnalyticsUsqlActivity object itself.
     */
    public DataLakeAnalyticsUsqlActivity setScriptPath(Object scriptPath) {
        this.scriptPath = scriptPath;
        return this;
    }

    /**
     * Get the scriptLinkedService property: Script linked service reference.
     *
     * @return the scriptLinkedService value.
     */
    public LinkedServiceReference getScriptLinkedService() {
        return this.scriptLinkedService;
    }

    /**
     * Set the scriptLinkedService property: Script linked service reference.
     *
     * @param scriptLinkedService the scriptLinkedService value to set.
     * @return the DataLakeAnalyticsUsqlActivity object itself.
     */
    public DataLakeAnalyticsUsqlActivity setScriptLinkedService(LinkedServiceReference scriptLinkedService) {
        this.scriptLinkedService = scriptLinkedService;
        return this;
    }

    /**
     * Get the degreeOfParallelism property: The maximum number of nodes simultaneously used to run the job. Default
     * value is 1. Type: integer (or Expression with resultType integer), minimum: 1.
     *
     * @return the degreeOfParallelism value.
     */
    public Object getDegreeOfParallelism() {
        return this.degreeOfParallelism;
    }

    /**
     * Set the degreeOfParallelism property: The maximum number of nodes simultaneously used to run the job. Default
     * value is 1. Type: integer (or Expression with resultType integer), minimum: 1.
     *
     * @param degreeOfParallelism the degreeOfParallelism value to set.
     * @return the DataLakeAnalyticsUsqlActivity object itself.
     */
    public DataLakeAnalyticsUsqlActivity setDegreeOfParallelism(Object degreeOfParallelism) {
        this.degreeOfParallelism = degreeOfParallelism;
        return this;
    }

    /**
     * Get the priority property: Determines which jobs out of all that are queued should be selected to run first. The
     * lower the number, the higher the priority. Default value is 1000. Type: integer (or Expression with resultType
     * integer), minimum: 1.
     *
     * @return the priority value.
     */
    public Object getPriority() {
        return this.priority;
    }

    /**
     * Set the priority property: Determines which jobs out of all that are queued should be selected to run first. The
     * lower the number, the higher the priority. Default value is 1000. Type: integer (or Expression with resultType
     * integer), minimum: 1.
     *
     * @param priority the priority value to set.
     * @return the DataLakeAnalyticsUsqlActivity object itself.
     */
    public DataLakeAnalyticsUsqlActivity setPriority(Object priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get the parameters property: Parameters for U-SQL job request.
     *
     * @return the parameters value.
     */
    public Map<String, Object> getParameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: Parameters for U-SQL job request.
     *
     * @param parameters the parameters value to set.
     * @return the DataLakeAnalyticsUsqlActivity object itself.
     */
    public DataLakeAnalyticsUsqlActivity setParameters(Map<String, Object> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get the runtimeVersion property: Runtime version of the U-SQL engine to use. Type: string (or Expression with
     * resultType string).
     *
     * @return the runtimeVersion value.
     */
    public Object getRuntimeVersion() {
        return this.runtimeVersion;
    }

    /**
     * Set the runtimeVersion property: Runtime version of the U-SQL engine to use. Type: string (or Expression with
     * resultType string).
     *
     * @param runtimeVersion the runtimeVersion value to set.
     * @return the DataLakeAnalyticsUsqlActivity object itself.
     */
    public DataLakeAnalyticsUsqlActivity setRuntimeVersion(Object runtimeVersion) {
        this.runtimeVersion = runtimeVersion;
        return this;
    }

    /**
     * Get the compilationMode property: Compilation mode of U-SQL. Must be one of these values : Semantic, Full and
     * SingleBox. Type: string (or Expression with resultType string).
     *
     * @return the compilationMode value.
     */
    public Object getCompilationMode() {
        return this.compilationMode;
    }

    /**
     * Set the compilationMode property: Compilation mode of U-SQL. Must be one of these values : Semantic, Full and
     * SingleBox. Type: string (or Expression with resultType string).
     *
     * @param compilationMode the compilationMode value to set.
     * @return the DataLakeAnalyticsUsqlActivity object itself.
     */
    public DataLakeAnalyticsUsqlActivity setCompilationMode(Object compilationMode) {
        this.compilationMode = compilationMode;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DataLakeAnalyticsUsqlActivity setLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.setLinkedServiceName(linkedServiceName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DataLakeAnalyticsUsqlActivity setPolicy(ActivityPolicy policy) {
        super.setPolicy(policy);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DataLakeAnalyticsUsqlActivity setName(String name) {
        super.setName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DataLakeAnalyticsUsqlActivity setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DataLakeAnalyticsUsqlActivity setDependsOn(List<ActivityDependency> dependsOn) {
        super.setDependsOn(dependsOn);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DataLakeAnalyticsUsqlActivity setUserProperties(List<UserProperty> userProperties) {
        super.setUserProperties(userProperties);
        return this;
    }
}
