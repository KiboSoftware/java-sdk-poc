/*
 * Kibo Shipping Admin Service
 * OpenAPI Spec for Kibo Shipping Admin Service
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.shippingadmin.api;

import com.kibocommerce.sdk.common.ApiException;
import com.kibocommerce.sdk.shippingadmin.models.TargetRule;
import com.kibocommerce.sdk.shippingadmin.models.TargetRuleCollection;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TargetRulesApi
 */
@Disabled
public class TargetRulesApiTest {

    private final TargetRulesApi api = new TargetRulesApi();

    /**
     * Create Target Rule
     *
     * Create Target Rule
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createTargetRuleTest() throws ApiException {
        TargetRule targetRule = null;
        TargetRule response = api.createTargetRule(targetRule);
        // TODO: test validations
    }

    /**
     * Delete Target Rule
     *
     * Delete Target Rule
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteTargetRuleTest() throws ApiException {
        String code = null;
        api.deleteTargetRule(code);
        // TODO: test validations
    }

    /**
     * Get Target Rule
     *
     * Get Target Rule
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTargetRuleTest() throws ApiException {
        String code = null;
        TargetRule response = api.getTargetRule(code);
        // TODO: test validations
    }

    /**
     * Retrieves a list of TargetRules according to any specified filter criteria and sort options
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTargetRulesTest() throws ApiException {
        Integer startIndex = null;
        Integer pageSize = null;
        String sortBy = null;
        String filter = null;
        TargetRuleCollection response = api.getTargetRules(startIndex, pageSize, sortBy, filter);
        // TODO: test validations
    }

    /**
     * Update Target Rule
     *
     * Update Target Rule
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateTargetRuleTest() throws ApiException {
        String code = null;
        TargetRule targetRule = null;
        TargetRule response = api.updateTargetRule(code, targetRule);
        // TODO: test validations
    }

    /**
     * Validate Target Rule
     *
     * Validate Target Rule
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void validateTargetRuleTest() throws ApiException {
        TargetRule targetRule = null;
        api.validateTargetRule(targetRule);
        // TODO: test validations
    }

}
