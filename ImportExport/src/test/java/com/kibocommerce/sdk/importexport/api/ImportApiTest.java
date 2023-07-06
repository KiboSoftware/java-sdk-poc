/*
 * Kibo MongoAdmin Service
 * OpenAPI Spec for Kibo MongoAdmin Service
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.importexport.api;

import com.kibocommerce.sdk.common.ApiException;
import com.kibocommerce.sdk.importexport.models.ImportJob;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ImportApi
 */
@Disabled
public class ImportApiTest {

    private final ImportApi api = new ImportApi();

    /**
     * List
     *
     * List
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void callListTest() throws ApiException {
        Integer startIndex = null;
        Integer pageSize = null;
        String filter = null;
        List<ImportJob> response = api.callList(startIndex, pageSize, filter);
        // TODO: test validations
    }

    /**
     * Create
     *
     * Create
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createTest() throws ApiException {
        ImportJob importJob = null;
        ImportJob response = api.create(importJob);
        // TODO: test validations
    }

    /**
     * Delete
     *
     * Delete
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteTest() throws ApiException {
        String id = null;
        api.delete(id);
        // TODO: test validations
    }

    /**
     * Get
     *
     * Get
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTest() throws ApiException {
        String id = null;
        ImportJob response = api.get(id);
        // TODO: test validations
    }

}
