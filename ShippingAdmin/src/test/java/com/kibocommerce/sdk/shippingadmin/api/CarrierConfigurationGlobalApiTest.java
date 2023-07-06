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
import com.kibocommerce.sdk.shippingadmin.models.ServiceType;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CarrierConfigurationGlobalApi
 */
@Disabled
public class CarrierConfigurationGlobalApiTest {

    private final CarrierConfigurationGlobalApi api = new CarrierConfigurationGlobalApi();

    /**
     * Used for retrieving the available service types for the Mozu Default Application carriers
     *
     * Used for retrieving the available service types for the Mozu Default Application carriers
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllServiceTypesTest() throws ApiException {
        String localeCode = null;
        List<ServiceType> response = api.getAllServiceTypes(localeCode);
        // TODO: test validations
    }

    /**
     * Used for retrieving the available service types for the Mozu Default Application carriers
     *
     * Used for retrieving the available service types for the Mozu Default Application carriers
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCarrierServiceTypesTest() throws ApiException {
        String carrierId = null;
        String localeCode = null;
        List<ServiceType> response = api.getCarrierServiceTypes(carrierId, localeCode);
        // TODO: test validations
    }

}