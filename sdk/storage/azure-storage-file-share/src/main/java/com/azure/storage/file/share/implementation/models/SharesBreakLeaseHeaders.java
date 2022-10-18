// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.share.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.http.HttpHeaders;
import com.azure.core.util.DateTimeRfc1123;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.time.OffsetDateTime;

/** The SharesBreakLeaseHeaders model. */
@JacksonXmlRootElement(localName = "null")
@Fluent
public final class SharesBreakLeaseHeaders {
    /*
     * The x-ms-version property.
     */
    @JsonProperty(value = "x-ms-version")
    private String xMsVersion;

    /*
     * The ETag property.
     */
    @JsonProperty(value = "ETag")
    private String eTag;

    /*
     * The x-ms-lease-time property.
     */
    @JsonProperty(value = "x-ms-lease-time")
    private Integer xMsLeaseTime;

    /*
     * The x-ms-lease-id property.
     */
    @JsonProperty(value = "x-ms-lease-id")
    private String xMsLeaseId;

    /*
     * The Last-Modified property.
     */
    @JsonProperty(value = "Last-Modified")
    private DateTimeRfc1123 lastModified;

    /*
     * The x-ms-request-id property.
     */
    @JsonProperty(value = "x-ms-request-id")
    private String xMsRequestId;

    /*
     * The x-ms-client-request-id property.
     */
    @JsonProperty(value = "x-ms-client-request-id")
    private String xMsClientRequestId;

    /*
     * The Date property.
     */
    @JsonProperty(value = "Date")
    private DateTimeRfc1123 date;

    // HttpHeaders containing the raw property values.
    /**
     * Creates an instance of SharesBreakLeaseHeaders class.
     *
     * @param rawHeaders The raw HttpHeaders that will be used to create the property values.
     */
    public SharesBreakLeaseHeaders(HttpHeaders rawHeaders) {
        this.xMsVersion = rawHeaders.getValue("x-ms-version");
        this.eTag = rawHeaders.getValue("ETag");
        String xMsLeaseTime = rawHeaders.getValue("x-ms-lease-time");
        if (xMsLeaseTime != null) {
            this.xMsLeaseTime = Integer.parseInt(xMsLeaseTime);
        }
        this.xMsLeaseId = rawHeaders.getValue("x-ms-lease-id");
        String lastModified = rawHeaders.getValue("Last-Modified");
        if (lastModified != null) {
            this.lastModified = new DateTimeRfc1123(lastModified);
        }
        this.xMsRequestId = rawHeaders.getValue("x-ms-request-id");
        this.xMsClientRequestId = rawHeaders.getValue("x-ms-client-request-id");
        String date = rawHeaders.getValue("Date");
        if (date != null) {
            this.date = new DateTimeRfc1123(date);
        }
    }

    /**
     * Get the xMsVersion property: The x-ms-version property.
     *
     * @return the xMsVersion value.
     */
    public String getXMsVersion() {
        return this.xMsVersion;
    }

    /**
     * Set the xMsVersion property: The x-ms-version property.
     *
     * @param xMsVersion the xMsVersion value to set.
     * @return the SharesBreakLeaseHeaders object itself.
     */
    public SharesBreakLeaseHeaders setXMsVersion(String xMsVersion) {
        this.xMsVersion = xMsVersion;
        return this;
    }

    /**
     * Get the eTag property: The ETag property.
     *
     * @return the eTag value.
     */
    public String getETag() {
        return this.eTag;
    }

    /**
     * Set the eTag property: The ETag property.
     *
     * @param eTag the eTag value to set.
     * @return the SharesBreakLeaseHeaders object itself.
     */
    public SharesBreakLeaseHeaders setETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get the xMsLeaseTime property: The x-ms-lease-time property.
     *
     * @return the xMsLeaseTime value.
     */
    public Integer getXMsLeaseTime() {
        return this.xMsLeaseTime;
    }

    /**
     * Set the xMsLeaseTime property: The x-ms-lease-time property.
     *
     * @param xMsLeaseTime the xMsLeaseTime value to set.
     * @return the SharesBreakLeaseHeaders object itself.
     */
    public SharesBreakLeaseHeaders setXMsLeaseTime(Integer xMsLeaseTime) {
        this.xMsLeaseTime = xMsLeaseTime;
        return this;
    }

    /**
     * Get the xMsLeaseId property: The x-ms-lease-id property.
     *
     * @return the xMsLeaseId value.
     */
    public String getXMsLeaseId() {
        return this.xMsLeaseId;
    }

    /**
     * Set the xMsLeaseId property: The x-ms-lease-id property.
     *
     * @param xMsLeaseId the xMsLeaseId value to set.
     * @return the SharesBreakLeaseHeaders object itself.
     */
    public SharesBreakLeaseHeaders setXMsLeaseId(String xMsLeaseId) {
        this.xMsLeaseId = xMsLeaseId;
        return this;
    }

    /**
     * Get the lastModified property: The Last-Modified property.
     *
     * @return the lastModified value.
     */
    public OffsetDateTime getLastModified() {
        if (this.lastModified == null) {
            return null;
        }
        return this.lastModified.getDateTime();
    }

    /**
     * Set the lastModified property: The Last-Modified property.
     *
     * @param lastModified the lastModified value to set.
     * @return the SharesBreakLeaseHeaders object itself.
     */
    public SharesBreakLeaseHeaders setLastModified(OffsetDateTime lastModified) {
        if (lastModified == null) {
            this.lastModified = null;
        } else {
            this.lastModified = new DateTimeRfc1123(lastModified);
        }
        return this;
    }

    /**
     * Get the xMsRequestId property: The x-ms-request-id property.
     *
     * @return the xMsRequestId value.
     */
    public String getXMsRequestId() {
        return this.xMsRequestId;
    }

    /**
     * Set the xMsRequestId property: The x-ms-request-id property.
     *
     * @param xMsRequestId the xMsRequestId value to set.
     * @return the SharesBreakLeaseHeaders object itself.
     */
    public SharesBreakLeaseHeaders setXMsRequestId(String xMsRequestId) {
        this.xMsRequestId = xMsRequestId;
        return this;
    }

    /**
     * Get the xMsClientRequestId property: The x-ms-client-request-id property.
     *
     * @return the xMsClientRequestId value.
     */
    public String getXMsClientRequestId() {
        return this.xMsClientRequestId;
    }

    /**
     * Set the xMsClientRequestId property: The x-ms-client-request-id property.
     *
     * @param xMsClientRequestId the xMsClientRequestId value to set.
     * @return the SharesBreakLeaseHeaders object itself.
     */
    public SharesBreakLeaseHeaders setXMsClientRequestId(String xMsClientRequestId) {
        this.xMsClientRequestId = xMsClientRequestId;
        return this;
    }

    /**
     * Get the date property: The Date property.
     *
     * @return the date value.
     */
    public OffsetDateTime getDate() {
        if (this.date == null) {
            return null;
        }
        return this.date.getDateTime();
    }

    /**
     * Set the date property: The Date property.
     *
     * @param date the date value to set.
     * @return the SharesBreakLeaseHeaders object itself.
     */
    public SharesBreakLeaseHeaders setDate(OffsetDateTime date) {
        if (date == null) {
            this.date = null;
        } else {
            this.date = new DateTimeRfc1123(date);
        }
        return this;
    }
}
