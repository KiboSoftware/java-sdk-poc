/*
 * Kibo ProductRuntime Service
 * OpenAPI Spec for Kibo ProductRuntime Service
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.solrschemamanager.api;

import com.kibocommerce.sdk.common.ApiException;
import com.kibocommerce.sdk.solrschemamanager.models.FieldTypeDefinitionRepositoryEntry;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FieldTypeDefinitionApi
 */
@Disabled
public class FieldTypeDefinitionApiTest {

    private final FieldTypeDefinitionApi api = new FieldTypeDefinitionApi();

    /**
     * Get Field Type Definitions
     *
     * Get Field Type Definitions
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFieldTypeDefinitionsTest() throws ApiException {
        String language = null;
        List<FieldTypeDefinitionRepositoryEntry> response = api.getFieldTypeDefinitions(language);
        // TODO: test validations
    }

}