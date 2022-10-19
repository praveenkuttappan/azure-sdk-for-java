// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.phonenumbers.siprouting.models;

import com.azure.core.annotation.Immutable;

import java.util.List;

/** The SIP Routing error. */
@Immutable
public final class SipRoutingError {
    /*
     * The error code.
     */
    private final String code;

    /*
     * The error message.
     */
    private final String message;

    /*
     * The error target.
     */
    private final String target;

    /*
     * Further details about specific errors that led to this error.
     */
    private final List<SipRoutingError> details;

    /*
     * The inner error if any.
     */
    private final SipRoutingError innerError;

    /**
     * Constructs a new PhoneNumberError
     *
     * @param code The error code
     * @param message The message of the original error
     * @param target The target of the error
     * @param details Additional details
     * @param innerError The inner error
     */
    public SipRoutingError(String code, String message, String target, List<SipRoutingError> details, SipRoutingError innerError) {
        this.code = code;
        this.message = message;
        this.target = target;
        this.details = details;
        this.innerError = innerError;
    }

    /**
     * Get the code property: The error code.
     *
     * @return the code value.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Get the message property: The error message.
     *
     * @return the message value.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Get the target property: The error target.
     *
     * @return the target value.
     */
    public String getTarget() {
        return this.target;
    }

    /**
     * Get the details property: Further details about specific errors that led to this error.
     *
     * @return the details value.
     */
    public List<SipRoutingError> getDetails() {
        return this.details;
    }

    /**
     * Get the innerError property: The inner error if any.
     *
     * @return the innerError value.
     */
    public SipRoutingError getInnerError() {
        return this.innerError;
    }
}