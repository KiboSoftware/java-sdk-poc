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
import com.kibocommerce.sdk.pricingstorefront.models.OrderTaxContext;
import com.kibocommerce.sdk.pricingstorefront.models.TaxableOrder;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TaxRuntimeApi
 */
@Disabled
public class TaxRuntimeApiTest {

    private final TaxRuntimeApi api = new TaxRuntimeApi();

    /**
     * Estimate Taxes
     *
     * Estimate Taxes
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void estimateTaxesTest() throws ApiException {
        TaxableOrder taxableOrder = null;
        OrderTaxContext response = api.estimateTaxes(taxableOrder);
        // TODO: test validations
    }

}