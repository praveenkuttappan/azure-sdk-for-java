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

/** Azure Batch linked service. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureBatch")
@JsonFlatten
@Fluent
public class AzureBatchLinkedService extends LinkedService {
    /*
     * The Azure Batch account name. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.accountName", required = true)
    private Object accountName;

    /*
     * The Azure Batch account access key.
     */
    @JsonProperty(value = "typeProperties.accessKey")
    private SecretBase accessKey;

    /*
     * The Azure Batch URI. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.batchUri", required = true)
    private Object batchUri;

    /*
     * The Azure Batch pool name. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.poolName", required = true)
    private Object poolName;

    /*
     * The Azure Storage linked service reference.
     */
    @JsonProperty(value = "typeProperties.linkedServiceName", required = true)
    private LinkedServiceReference linkedServiceName;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /** Creates an instance of AzureBatchLinkedService class. */
    public AzureBatchLinkedService() {}

    /**
     * Get the accountName property: The Azure Batch account name. Type: string (or Expression with resultType string).
     *
     * @return the accountName value.
     */
    public Object getAccountName() {
        return this.accountName;
    }

    /**
     * Set the accountName property: The Azure Batch account name. Type: string (or Expression with resultType string).
     *
     * @param accountName the accountName value to set.
     * @return the AzureBatchLinkedService object itself.
     */
    public AzureBatchLinkedService setAccountName(Object accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * Get the accessKey property: The Azure Batch account access key.
     *
     * @return the accessKey value.
     */
    public SecretBase getAccessKey() {
        return this.accessKey;
    }

    /**
     * Set the accessKey property: The Azure Batch account access key.
     *
     * @param accessKey the accessKey value to set.
     * @return the AzureBatchLinkedService object itself.
     */
    public AzureBatchLinkedService setAccessKey(SecretBase accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    /**
     * Get the batchUri property: The Azure Batch URI. Type: string (or Expression with resultType string).
     *
     * @return the batchUri value.
     */
    public Object getBatchUri() {
        return this.batchUri;
    }

    /**
     * Set the batchUri property: The Azure Batch URI. Type: string (or Expression with resultType string).
     *
     * @param batchUri the batchUri value to set.
     * @return the AzureBatchLinkedService object itself.
     */
    public AzureBatchLinkedService setBatchUri(Object batchUri) {
        this.batchUri = batchUri;
        return this;
    }

    /**
     * Get the poolName property: The Azure Batch pool name. Type: string (or Expression with resultType string).
     *
     * @return the poolName value.
     */
    public Object getPoolName() {
        return this.poolName;
    }

    /**
     * Set the poolName property: The Azure Batch pool name. Type: string (or Expression with resultType string).
     *
     * @param poolName the poolName value to set.
     * @return the AzureBatchLinkedService object itself.
     */
    public AzureBatchLinkedService setPoolName(Object poolName) {
        this.poolName = poolName;
        return this;
    }

    /**
     * Get the linkedServiceName property: The Azure Storage linked service reference.
     *
     * @return the linkedServiceName value.
     */
    public LinkedServiceReference getLinkedServiceName() {
        return this.linkedServiceName;
    }

    /**
     * Set the linkedServiceName property: The Azure Storage linked service reference.
     *
     * @param linkedServiceName the linkedServiceName value to set.
     * @return the AzureBatchLinkedService object itself.
     */
    public AzureBatchLinkedService setLinkedServiceName(LinkedServiceReference linkedServiceName) {
        this.linkedServiceName = linkedServiceName;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value.
     */
    public Object getEncryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the AzureBatchLinkedService object itself.
     */
    public AzureBatchLinkedService setEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureBatchLinkedService setConnectVia(IntegrationRuntimeReference connectVia) {
        super.setConnectVia(connectVia);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureBatchLinkedService setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureBatchLinkedService setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureBatchLinkedService setAnnotations(List<Object> annotations) {
        super.setAnnotations(annotations);
        return this;
    }
}
