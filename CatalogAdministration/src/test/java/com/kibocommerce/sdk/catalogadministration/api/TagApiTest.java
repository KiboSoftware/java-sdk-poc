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
import com.kibocommerce.sdk.catalogadministration.models.CatalogAdminsTag;
import com.kibocommerce.sdk.catalogadministration.models.TagCollection;
import com.kibocommerce.sdk.catalogadministration.models.TagNodeTree;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TagApi
 */
@Disabled
public class TagApiTest {

    private final TagApi api = new TagApi();

    /**
     * Create tag
     *
     * Creates a tag.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createTagTest() throws ApiException {
        CatalogAdminsTag catalogAdminsTag = null;
        CatalogAdminsTag response = api.createTag(catalogAdminsTag);
        // TODO: test validations
    }

    /**
     * Delete tag
     *
     * Deletes a Tag specified by its tagCode.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteTagTest() throws ApiException {
        String tagCode = null;
        api.deleteTag(tagCode);
        // TODO: test validations
    }

    /**
     * Get tag collection as tag tree
     *
     * Retrieves the tag collection as tag tree for specified tagCode.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getNodeTreeTest() throws ApiException {
        String tagCode = null;
        TagNodeTree response = api.getNodeTree(tagCode);
        // TODO: test validations
    }

    /**
     * Get tag
     *
     * Retrieves the details of a single tag.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTagTest() throws ApiException {
        String tagCode = null;
        CatalogAdminsTag response = api.getTag(tagCode);
        // TODO: test validations
    }

    /**
     * Get tags
     *
     * Retrieves a list of tags.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTagsTest() throws ApiException {
        String path = null;
        Integer startIndex = null;
        Integer pageSize = null;
        String sortBy = null;
        String filter = null;
        String responseGroups = null;
        TagCollection response = api.getTags(path, startIndex, pageSize, sortBy, filter, responseGroups);
        // TODO: test validations
    }

    /**
     * Update tag
     *
     * Modifies a tag.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateTagTest() throws ApiException {
        String tagCode = null;
        CatalogAdminsTag catalogAdminsTag = null;
        CatalogAdminsTag response = api.updateTag(tagCode, catalogAdminsTag);
        // TODO: test validations
    }

}
