// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.share.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for FileLastWrittenMode. */
public enum FileLastWrittenMode {
    /** Enum value Now. */
    NOW("Now"),

    /** Enum value Preserve. */
    PRESERVE("Preserve");

    /** The actual serialized value for a FileLastWrittenMode instance. */
    private final String value;

    FileLastWrittenMode(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a FileLastWrittenMode instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed FileLastWrittenMode object, or null if unable to parse.
     */
    @JsonCreator
    public static FileLastWrittenMode fromString(String value) {
        if (value == null) {
            return null;
        }
        FileLastWrittenMode[] items = FileLastWrittenMode.values();
        for (FileLastWrittenMode item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /** {@inheritDoc} */
    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
