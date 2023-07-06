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
import com.kibocommerce.sdk.locationadmin.models.CommerceRuntimeAttribute;
import com.kibocommerce.sdk.locationadmin.models.CommerceRuntimeAttributeCollection;
import com.kibocommerce.sdk.locationadmin.models.CommerceRuntimeAttributeVocabularyValue;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LocationAttributeDefinitionsApi
 */
@Disabled
public class LocationAttributeDefinitionsApiTest {

    private final LocationAttributeDefinitionsApi api = new LocationAttributeDefinitionsApi();

    /**
     * Create Attribute
     *
     * Create Attribute
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createAttributeTest() throws ApiException {
        CommerceRuntimeAttribute commerceRuntimeAttribute = null;
        CommerceRuntimeAttribute response = api.createAttribute(commerceRuntimeAttribute);
        // TODO: test validations
    }

    /**
     * Get Attribute
     *
     * Get Attribute
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAttributeTest() throws ApiException {
        String attributeFQN = null;
        String responseGroups = null;
        CommerceRuntimeAttribute response = api.getAttribute(attributeFQN, responseGroups);
        // TODO: test validations
    }

    /**
     * Get Attribute Vocabulary Values
     *
     * Get Attribute Vocabulary Values
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAttributeVocabularyValuesTest() throws ApiException {
        String attributeFQN = null;
        String responseGroups = null;
        List<CommerceRuntimeAttributeVocabularyValue> response = api.getAttributeVocabularyValues(attributeFQN, responseGroups);
        // TODO: test validations
    }

    /**
     * Get Attributes
     *
     * Get Attributes
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAttributesTest() throws ApiException {
        Integer startIndex = null;
        Integer pageSize = null;
        String sortBy = null;
        String responseGroups = null;
        String filter = null;
        CommerceRuntimeAttributeCollection response = api.getAttributes(startIndex, pageSize, sortBy, responseGroups, filter);
        // TODO: test validations
    }

    /**
     * Update Attribute
     *
     * Update Attribute
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateAttributeTest() throws ApiException {
        String attributeFQN = null;
        CommerceRuntimeAttribute commerceRuntimeAttribute = null;
        CommerceRuntimeAttribute response = api.updateAttribute(attributeFQN, commerceRuntimeAttribute);
        // TODO: test validations
    }

}
