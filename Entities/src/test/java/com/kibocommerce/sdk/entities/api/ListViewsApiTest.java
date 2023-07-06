/*
 * Kibo MZDB Service
 * OpenAPI Spec for Kibo MZDB Service
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.entities.api;

import com.kibocommerce.sdk.common.ApiException;
import com.kibocommerce.sdk.entities.models.ListView;
import com.kibocommerce.sdk.entities.models.ListViewCollection;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ListViewsApi
 */
@Disabled
public class ListViewsApiTest {

    private final ListViewsApi api = new ListViewsApi();

    /**
     * Add ListView
     *
     * Create a new ListView definition for a specific EntityList for a specific tenant
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createEntityListViewTest() throws ApiException {
        String entityListFullName = null;
        ListView listView = null;
        ListView response = api.createEntityListView(entityListFullName, listView);
        // TODO: test validations
    }

    /**
     * Delete ListView
     *
     * Delete an existing ListView definition for a specific EntityList for a specific tenant
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteEntityListViewTest() throws ApiException {
        String entityListFullName = null;
        String viewName = null;
        api.deleteEntityListView(entityListFullName, viewName);
        // TODO: test validations
    }

    /**
     * Get ListView
     *
     * Returns a specific ListView definition for a specific EntityList for a specific tenant
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getEntityListViewTest() throws ApiException {
        String entityListFullName = null;
        String viewName = null;
        ListView response = api.getEntityListView(entityListFullName, viewName);
        // TODO: test validations
    }

    /**
     * Get  ListViews
     *
     * Get all of the defined ListViews for a specific EntityList for a specific tenant
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getEntityListViewsTest() throws ApiException {
        String entityListFullName = null;
        ListViewCollection response = api.getEntityListViews(entityListFullName);
        // TODO: test validations
    }

    /**
     * Update ListView
     *
     * Update an existing ListView definition for a specific EntityList for a specific tenant
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateEntityListViewTest() throws ApiException {
        String entityListFullName = null;
        String viewName = null;
        ListView listView = null;
        ListView response = api.updateEntityListView(entityListFullName, viewName, listView);
        // TODO: test validations
    }

}