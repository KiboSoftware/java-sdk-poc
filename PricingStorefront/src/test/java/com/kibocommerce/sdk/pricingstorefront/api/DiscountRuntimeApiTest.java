/*
 * Kibo PricingRuntime Service
 * OpenAPI Spec for Kibo PricingRuntime Service
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.pricingstorefront.api;

import com.kibocommerce.sdk.common.ApiException;
import com.kibocommerce.sdk.pricingstorefront.models.AutoAddDiscountTarget;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DiscountRuntimeApi
 */
@Disabled
public class DiscountRuntimeApiTest {

    private final DiscountRuntimeApi api = new DiscountRuntimeApi();

    /**
     * Get Auto Add Target
     *
     * Get Auto Add Target
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAutoAddTargetTest() throws ApiException {
        Integer discountId = null;
        AutoAddDiscountTarget response = api.getAutoAddTarget(discountId);
        // TODO: test validations
    }

}
