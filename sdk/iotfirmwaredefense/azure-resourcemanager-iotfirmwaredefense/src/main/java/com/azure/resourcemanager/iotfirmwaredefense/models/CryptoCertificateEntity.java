// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iotfirmwaredefense.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Information on an entity (distinguished name) in a cryptographic certificate. */
@Fluent
public final class CryptoCertificateEntity {
    /*
     * Common name of the certificate entity.
     */
    @JsonProperty(value = "commonName")
    private String commonName;

    /*
     * Organization of the certificate entity.
     */
    @JsonProperty(value = "organization")
    private String organization;

    /*
     * The organizational unit of the certificate entity.
     */
    @JsonProperty(value = "organizationalUnit")
    private String organizationalUnit;

    /*
     * Geographical state or province of the certificate entity.
     */
    @JsonProperty(value = "state")
    private String state;

    /*
     * Country code of the certificate entity.
     */
    @JsonProperty(value = "country")
    private String country;

    /** Creates an instance of CryptoCertificateEntity class. */
    public CryptoCertificateEntity() {
    }

    /**
     * Get the commonName property: Common name of the certificate entity.
     *
     * @return the commonName value.
     */
    public String commonName() {
        return this.commonName;
    }

    /**
     * Set the commonName property: Common name of the certificate entity.
     *
     * @param commonName the commonName value to set.
     * @return the CryptoCertificateEntity object itself.
     */
    public CryptoCertificateEntity withCommonName(String commonName) {
        this.commonName = commonName;
        return this;
    }

    /**
     * Get the organization property: Organization of the certificate entity.
     *
     * @return the organization value.
     */
    public String organization() {
        return this.organization;
    }

    /**
     * Set the organization property: Organization of the certificate entity.
     *
     * @param organization the organization value to set.
     * @return the CryptoCertificateEntity object itself.
     */
    public CryptoCertificateEntity withOrganization(String organization) {
        this.organization = organization;
        return this;
    }

    /**
     * Get the organizationalUnit property: The organizational unit of the certificate entity.
     *
     * @return the organizationalUnit value.
     */
    public String organizationalUnit() {
        return this.organizationalUnit;
    }

    /**
     * Set the organizationalUnit property: The organizational unit of the certificate entity.
     *
     * @param organizationalUnit the organizationalUnit value to set.
     * @return the CryptoCertificateEntity object itself.
     */
    public CryptoCertificateEntity withOrganizationalUnit(String organizationalUnit) {
        this.organizationalUnit = organizationalUnit;
        return this;
    }

    /**
     * Get the state property: Geographical state or province of the certificate entity.
     *
     * @return the state value.
     */
    public String state() {
        return this.state;
    }

    /**
     * Set the state property: Geographical state or province of the certificate entity.
     *
     * @param state the state value to set.
     * @return the CryptoCertificateEntity object itself.
     */
    public CryptoCertificateEntity withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Get the country property: Country code of the certificate entity.
     *
     * @return the country value.
     */
    public String country() {
        return this.country;
    }

    /**
     * Set the country property: Country code of the certificate entity.
     *
     * @param country the country value to set.
     * @return the CryptoCertificateEntity object itself.
     */
    public CryptoCertificateEntity withCountry(String country) {
        this.country = country;
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
