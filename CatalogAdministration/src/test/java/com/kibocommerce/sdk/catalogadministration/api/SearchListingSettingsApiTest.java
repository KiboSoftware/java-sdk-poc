/*
 * Kibo Catalog Admin Services
 * OpenAPI Spec for Kibo Catalog Admin Services
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.catalogadministration.api;

import com.kibocommerce.sdk.common.ApiException;
import com.kibocommerce.sdk.catalogadministration.models.ListingSettings;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SearchListingSettingsApi
 */
@Disabled
public class SearchListingSettingsApiTest {

    private final SearchListingSettingsApi api = new SearchListingSettingsApi();

    /**
     * Delete search listing settings
     *
     * Deletes the ListingSettings for a specific SearchSetting by name.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteListingSettingsTest() throws ApiException {
        String name = null;
        api.deleteListingSettings(name);
        // TODO: test validations
    }

    /**
     * Get search listing settings
     *
     * Get ListingSettings for a specific SearchSettings by name.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getListingSettingsTest() throws ApiException {
        String name = null;
        ListingSettings response = api.getListingSettings(name);
        // TODO: test validations
    }

    /**
     * Add/Update search listing settings
     *
     * Adds or Updates (Upsert) the ListingSettings for a specific SearchSetting by name.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateListingSettingsTest() throws ApiException {
        String name = null;
        ListingSettings listingSettings = null;
        ListingSettings response = api.updateListingSettings(name, listingSettings);
        // TODO: test validations
    }

}
