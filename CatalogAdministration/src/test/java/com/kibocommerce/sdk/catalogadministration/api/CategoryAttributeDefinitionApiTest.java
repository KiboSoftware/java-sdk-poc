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
import com.kibocommerce.sdk.catalogadministration.models.ExtensibleAttribute;
import com.kibocommerce.sdk.catalogadministration.models.ExtensibleAttributeCollection;
import com.kibocommerce.sdk.catalogadministration.models.ExtensibleAttributeVocabularyValue;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CategoryAttributeDefinitionApi
 */
@Disabled
public class CategoryAttributeDefinitionApiTest {

    private final CategoryAttributeDefinitionApi api = new CategoryAttributeDefinitionApi();

    /**
     * Create Attribute
     *
     * Create Attribute
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createAttributeTest() throws ApiException {
        ExtensibleAttribute extensibleAttribute = null;
        ExtensibleAttribute response = api.createAttribute(extensibleAttribute);
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
        ExtensibleAttribute response = api.getAttribute(attributeFQN, responseGroups);
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
        List<ExtensibleAttributeVocabularyValue> response = api.getAttributeVocabularyValues(attributeFQN, responseGroups);
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
        ExtensibleAttributeCollection response = api.getAttributes(startIndex, pageSize, sortBy, responseGroups, filter);
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
        ExtensibleAttribute extensibleAttribute = null;
        ExtensibleAttribute response = api.updateAttribute(attributeFQN, extensibleAttribute);
        // TODO: test validations
    }

}
