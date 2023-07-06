/*
 * Kibo Location Admin Service
 * OpenAPI Spec for Kibo Location Admin Service
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.locationadmin.api;

import com.kibocommerce.sdk.common.ApiException;
import com.kibocommerce.sdk.locationadmin.models.LocationGroupCollection;
import com.kibocommerce.sdk.locationadmin.models.LocationLocationGroup;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LocationGroupApi
 */
@Disabled
public class LocationGroupApiTest {

    private final LocationGroupApi api = new LocationGroupApi();

    /**
     * Add Location Group
     *
     * Add a location group.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addLocationGroupTest() throws ApiException {
        LocationLocationGroup locationLocationGroup = null;
        LocationLocationGroup response = api.addLocationGroup(locationLocationGroup);
        // TODO: test validations
    }

    /**
     * Delete Location Group
     *
     * Deletes a location group specified by location group code.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteLocationGroupTest() throws ApiException {
        String locationGroupCode = null;
        api.deleteLocationGroup(locationGroupCode);
        // TODO: test validations
    }

    /**
     * Get Location Group
     *
     * Gets a location group by code.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getLocationGroupTest() throws ApiException {
        String locationGroupCode = null;
        LocationLocationGroup response = api.getLocationGroup(locationGroupCode);
        // TODO: test validations
    }

    /**
     * Get Location Groups
     *
     * Gets a collection of location groups.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getLocationGroupsTest() throws ApiException {
        Integer startIndex = null;
        Integer pageSize = null;
        String sortBy = null;
        String filter = null;
        LocationGroupCollection response = api.getLocationGroups(startIndex, pageSize, sortBy, filter);
        // TODO: test validations
    }

    /**
     * Update Location Group
     *
     * Update an existing location group.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateLocationGroupTest() throws ApiException {
        String locationGroupCode = null;
        LocationLocationGroup locationLocationGroup = null;
        LocationLocationGroup response = api.updateLocationGroup(locationGroupCode, locationLocationGroup);
        // TODO: test validations
    }

}
