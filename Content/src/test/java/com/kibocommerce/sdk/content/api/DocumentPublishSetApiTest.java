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
import com.kibocommerce.sdk.content.models.AddOrDeletePublishItem;
import com.kibocommerce.sdk.content.models.DocumentDraftSummaryPagedCollection;
import com.kibocommerce.sdk.content.models.PublishSetSummaryPagedCollection;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DocumentPublishSetApi
 */
@Disabled
public class DocumentPublishSetApiTest {

    private final DocumentPublishSetApi api = new DocumentPublishSetApi();

    /**
     * Add Publish Set Items
     *
     * Adds a set of documents by id to a publish set.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addPublishSetItemsTest() throws ApiException {
        String code = null;
        List<AddOrDeletePublishItem> addOrDeletePublishItem = null;
        api.addPublishSetItems(code, addOrDeletePublishItem);
        // TODO: test validations
    }

    /**
     * Delete Publish Set
     *
     * Adds a set of documents by id to a publish set.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deletePublishSetTest() throws ApiException {
        String code = null;
        Boolean shouldDiscard = null;
        api.deletePublishSet(code, shouldDiscard);
        // TODO: test validations
    }

    /**
     * Get Publish Set Items
     *
     * Retrieve a paged collection of publish set Items.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPublishSetItemsTest() throws ApiException {
        String code = null;
        Integer pageSize = null;
        Integer startIndex = null;
        String sortBy = null;
        String filter = null;
        DocumentDraftSummaryPagedCollection response = api.getPublishSetItems(code, pageSize, startIndex, sortBy, filter);
        // TODO: test validations
    }

    /**
     * Get Publish Set
     *
     * Returns a List of current Publishing sets with counts of drafts in each.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPublishSetsTest() throws ApiException {
        Integer pageSize = null;
        Integer startIndex = null;
        PublishSetSummaryPagedCollection response = api.getPublishSets(pageSize, startIndex);
        // TODO: test validations
    }

}