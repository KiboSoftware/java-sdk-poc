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
import com.kibocommerce.sdk.catalogadministration.models.CatalogAdminsProductOption;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProductOptionsApi
 */
@Disabled
public class ProductOptionsApiTest {

    private final ProductOptionsApi api = new ProductOptionsApi();

    /**
     * Add option
     *
     * Add option
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addOptionTest() throws ApiException {
        String productCode = null;
        CatalogAdminsProductOption catalogAdminsProductOption = null;
        CatalogAdminsProductOption response = api.addOption(productCode, catalogAdminsProductOption);
        // TODO: test validations
    }

    /**
     * Delete option
     *
     * Delete individual option
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteOptionTest() throws ApiException {
        String productCode = null;
        String attributeFQN = null;
        api.deleteOption(productCode, attributeFQN);
        // TODO: test validations
    }

    /**
     * Get option
     *
     * Get individual option
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getOptionTest() throws ApiException {
        String productCode = null;
        String attributeFQN = null;
        CatalogAdminsProductOption response = api.getOption(productCode, attributeFQN);
        // TODO: test validations
    }

    /**
     * Get options
     *
     * Get options for the product
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getOptionsTest() throws ApiException {
        String productCode = null;
        List<CatalogAdminsProductOption> response = api.getOptions(productCode);
        // TODO: test validations
    }

    /**
     * Update option
     *
     * Update individual option
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateOptionTest() throws ApiException {
        String productCode = null;
        String attributeFQN = null;
        CatalogAdminsProductOption catalogAdminsProductOption = null;
        CatalogAdminsProductOption response = api.updateOption(productCode, attributeFQN, catalogAdminsProductOption);
        // TODO: test validations
    }

}