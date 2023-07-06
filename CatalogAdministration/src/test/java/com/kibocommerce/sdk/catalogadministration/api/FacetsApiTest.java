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
import com.kibocommerce.sdk.catalogadministration.models.CatalogAdminsFacet;
import com.kibocommerce.sdk.catalogadministration.models.FacetCollection;
import com.kibocommerce.sdk.catalogadministration.models.FacetSet;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FacetsApi
 */
@Disabled
public class FacetsApiTest {

    private final FacetsApi api = new FacetsApi();

    /**
     * Add facet
     *
     * Adds a new Facet to a category in a catalog.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addFacetTest() throws ApiException {
        CatalogAdminsFacet catalogAdminsFacet = null;
        CatalogAdminsFacet response = api.addFacet(catalogAdminsFacet);
        // TODO: test validations
    }

    /**
     * Delete facet
     *
     * Deletes the Facet definition from the store.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteFacetByIdTest() throws ApiException {
        Integer facetId = null;
        api.deleteFacetById(facetId);
        // TODO: test validations
    }

    /**
     * Get facet
     *
     * Retrieves the details of a Facet Definition
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFacetTest() throws ApiException {
        Integer facetId = null;
        Boolean validate = null;
        CatalogAdminsFacet response = api.getFacet(facetId, validate);
        // TODO: test validations
    }

    /**
     * Get facet category list
     *
     * Retrieves a list of configured, and optionally available, Facet Configurations for the specified category.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFacetCategoryListTest() throws ApiException {
        Integer categoryId = null;
        String categoryCode = null;
        Boolean includeAvailable = null;
        Boolean validate = null;
        FacetSet response = api.getFacetCategoryList(categoryId, categoryCode, includeAvailable, validate);
        // TODO: test validations
    }

    /**
     * Get facet category list (legacy)
     *
     * Retrieves a list of configured, and optionally available, Facet Configurations for the specified category.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFacetCategoryListLegacyTest() throws ApiException {
        Integer categoryId = null;
        Boolean includeAvailable = null;
        Boolean validate = null;
        FacetSet response = api.getFacetCategoryListLegacy(categoryId, includeAvailable, validate);
        // TODO: test validations
    }

    /**
     * Get facets
     *
     * Retrieves the list of Facet Definition
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFacetsTest() throws ApiException {
        FacetCollection response = api.getFacets();
        // TODO: test validations
    }

    /**
     * Update facet
     *
     * Modifies a Facet definition.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateFacetTest() throws ApiException {
        Integer facetId = null;
        CatalogAdminsFacet catalogAdminsFacet = null;
        CatalogAdminsFacet response = api.updateFacet(facetId, catalogAdminsFacet);
        // TODO: test validations
    }

    /**
     * Update facet
     *
     * Modifies a Facet definition.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateFacetSetTest() throws ApiException {
        Integer categoryId = null;
        String categoryCode = null;
        FacetSet facetSet = null;
        FacetSet response = api.updateFacetSet(categoryId, categoryCode, facetSet);
        // TODO: test validations
    }

}