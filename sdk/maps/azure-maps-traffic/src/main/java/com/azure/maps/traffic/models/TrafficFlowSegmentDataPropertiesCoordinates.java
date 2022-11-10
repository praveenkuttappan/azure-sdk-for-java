// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.traffic.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.models.GeoPosition;
import com.azure.maps.traffic.implementation.models.LatLongPair;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Includes the coordinates describing the shape of the segment. Coordinates are shifted from the road depending on the
 * zoom level to support high quality visualization in every scale.
 */
@Immutable
public final class TrafficFlowSegmentDataPropertiesCoordinates {
    /*
     * Coordinate array
     */
    @JsonProperty(value = "coordinate", access = JsonProperty.Access.WRITE_ONLY)
    private List<LatLongPair> coordinates;

    /** Set default constructor to private */
    private TrafficFlowSegmentDataPropertiesCoordinates() {}

    /**
     * Return the coordinates
     *
     * @return Returns a list of {@link GeoPosition} coordinates.
     */
    public List<GeoPosition> getCoordinates() {
        return this.coordinates.stream()
                .map(item -> new GeoPosition(item.getLongitude(), item.getLatitude()))
                .collect(Collectors.toList());
    }
}