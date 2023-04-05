// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.translation.text.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Common properties of language script. */
@Immutable
public class CommonScriptModel {
    /*
     * Code identifying the script.
     */
    @JsonProperty(value = "code", required = true)
    private String code;

    /*
     * Display name of the script in the locale requested via Accept-Language header.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Display name of the language in the locale native for the language.
     */
    @JsonProperty(value = "nativeName", required = true)
    private String nativeName;

    /*
     * Directionality, which is rtl for right-to-left languages or ltr for left-to-right languages.
     */
    @JsonProperty(value = "dir", required = true)
    private String dir;

    /**
     * Creates an instance of CommonScriptModel class.
     *
     * @param code the code value to set.
     * @param name the name value to set.
     * @param nativeName the nativeName value to set.
     * @param dir the dir value to set.
     */
    @JsonCreator
    protected CommonScriptModel(
            @JsonProperty(value = "code", required = true) String code,
            @JsonProperty(value = "name", required = true) String name,
            @JsonProperty(value = "nativeName", required = true) String nativeName,
            @JsonProperty(value = "dir", required = true) String dir) {
        this.code = code;
        this.name = name;
        this.nativeName = nativeName;
        this.dir = dir;
    }

    /**
     * Get the code property: Code identifying the script.
     *
     * @return the code value.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Get the name property: Display name of the script in the locale requested via Accept-Language header.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the nativeName property: Display name of the language in the locale native for the language.
     *
     * @return the nativeName value.
     */
    public String getNativeName() {
        return this.nativeName;
    }

    /**
     * Get the dir property: Directionality, which is rtl for right-to-left languages or ltr for left-to-right
     * languages.
     *
     * @return the dir value.
     */
    public String getDir() {
        return this.dir;
    }
}
