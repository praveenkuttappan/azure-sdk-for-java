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

/** Linked service for CosmosDB (MongoDB API) data source. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("CosmosDbMongoDbApi")
@JsonFlatten
@Fluent
public class CosmosDbMongoDbApiLinkedService extends LinkedService {
    /*
     * The CosmosDB (MongoDB API) connection string. Type: string, SecureString or AzureKeyVaultSecretReference. Type:
     * string, SecureString or AzureKeyVaultSecretReference.
     */
    @JsonProperty(value = "typeProperties.connectionString", required = true)
    private Object connectionString;

    /*
     * The name of the CosmosDB (MongoDB API) database that you want to access. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.database", required = true)
    private Object database;

    /** Creates an instance of CosmosDbMongoDbApiLinkedService class. */
    public CosmosDbMongoDbApiLinkedService() {}

    /**
     * Get the connectionString property: The CosmosDB (MongoDB API) connection string. Type: string, SecureString or
     * AzureKeyVaultSecretReference. Type: string, SecureString or AzureKeyVaultSecretReference.
     *
     * @return the connectionString value.
     */
    public Object getConnectionString() {
        return this.connectionString;
    }

    /**
     * Set the connectionString property: The CosmosDB (MongoDB API) connection string. Type: string, SecureString or
     * AzureKeyVaultSecretReference. Type: string, SecureString or AzureKeyVaultSecretReference.
     *
     * @param connectionString the connectionString value to set.
     * @return the CosmosDbMongoDbApiLinkedService object itself.
     */
    public CosmosDbMongoDbApiLinkedService setConnectionString(Object connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Get the database property: The name of the CosmosDB (MongoDB API) database that you want to access. Type: string
     * (or Expression with resultType string).
     *
     * @return the database value.
     */
    public Object getDatabase() {
        return this.database;
    }

    /**
     * Set the database property: The name of the CosmosDB (MongoDB API) database that you want to access. Type: string
     * (or Expression with resultType string).
     *
     * @param database the database value to set.
     * @return the CosmosDbMongoDbApiLinkedService object itself.
     */
    public CosmosDbMongoDbApiLinkedService setDatabase(Object database) {
        this.database = database;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CosmosDbMongoDbApiLinkedService setConnectVia(IntegrationRuntimeReference connectVia) {
        super.setConnectVia(connectVia);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CosmosDbMongoDbApiLinkedService setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CosmosDbMongoDbApiLinkedService setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CosmosDbMongoDbApiLinkedService setAnnotations(List<Object> annotations) {
        super.setAnnotations(annotations);
        return this;
    }
}
