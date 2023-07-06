/*
 * Kibo Content Service
 * OpenAPI Spec for Kibo Content Service
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.content.api;

import com.kibocommerce.sdk.common.ApiException;
import com.kibocommerce.sdk.content.models.DocumentListType;
import com.kibocommerce.sdk.content.models.DocumentListTypeCollection;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DocumentListTypeApi
 */
@Disabled
public class DocumentListTypeApiTest {

    private final DocumentListTypeApi api = new DocumentListTypeApi();

    /**
     * Create Document List Type
     *
     * Create Document List Type
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createDocumentListTypeTest() throws ApiException {
        DocumentListType documentListType = null;
        DocumentListType response = api.createDocumentListType(documentListType);
        // TODO: test validations
    }

    /**
     * Get Document List Type
     *
     * Get Document List Type
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDocumentListTypeTest() throws ApiException {
        String documentListTypeFQN = null;
        DocumentListType response = api.getDocumentListType(documentListTypeFQN);
        // TODO: test validations
    }

    /**
     * Get Document List Types
     *
     * Get Document List Types
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDocumentListTypesTest() throws ApiException {
        Integer pageSize = null;
        Integer startIndex = null;
        DocumentListTypeCollection response = api.getDocumentListTypes(pageSize, startIndex);
        // TODO: test validations
    }

    /**
     * Update Document List Type
     *
     * Update Document List Type
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateDocumentListTypeTest() throws ApiException {
        String documentListTypeFQN = null;
        DocumentListType documentListType = null;
        DocumentListType response = api.updateDocumentListType(documentListTypeFQN, documentListType);
        // TODO: test validations
    }

}
