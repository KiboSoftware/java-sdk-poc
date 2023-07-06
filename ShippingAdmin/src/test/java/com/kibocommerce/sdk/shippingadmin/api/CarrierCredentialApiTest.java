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
import com.kibocommerce.sdk.shippingadmin.models.CarrierCredential;
import com.kibocommerce.sdk.shippingadmin.models.CarrierCredentialCollection;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CarrierCredentialApi
 */
@Disabled
public class CarrierCredentialApiTest {

    private final CarrierCredentialApi api = new CarrierCredentialApi();

    /**
     * Creates a Mozu
     *
     * hippingAdmin.Contracts.Carriers.CarrierCredential.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createCarrierCredentialTest() throws ApiException {
        String carrierId = null;
        CarrierCredential carrierCredential = null;
        CarrierCredential response = api.createCarrierCredential(carrierId, carrierCredential);
        // TODO: test validations
    }

    /**
     * Deletes a Mozu
     *
     * hippingAdmin.Contracts.Carriers.CarrierCredential with the specified configuration.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteCarrierCredentialTest() throws ApiException {
        String carrierId = null;
        Integer siteId = null;
        String locationGroupCode = null;
        String locationCode = null;
        api.deleteCarrierCredential(carrierId, siteId, locationGroupCode, locationCode);
        // TODO: test validations
    }

    /**
     * Gets a Mozu
     *
     * hippingAdmin.Contracts.Carriers.CarrierCredential with the specified configuration.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCarrierCredentialTest() throws ApiException {
        String carrierId = null;
        Integer siteId = null;
        String locationGroupCode = null;
        String locationCode = null;
        CarrierCredential response = api.getCarrierCredential(carrierId, siteId, locationGroupCode, locationCode);
        // TODO: test validations
    }

    /**
     * Returns a &lt;see cref&#x3D;\&quot;T:Mozu
     *
     * hippingAdmin.Contracts.Carriers.CarrierCredentialCollection\&quot;&gt;collection&lt;/see&gt; of &lt;see cref&#x3D;\&quot;T:Mozu.ShippingAdmin.Contracts.Carriers.CarrierCredential\&quot;&gt;carrier credential&lt;/see&gt; with the specified filters and options.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCarrierCredentialsTest() throws ApiException {
        Integer startIndex = null;
        Integer pageSize = null;
        String sortBy = null;
        String filter = null;
        CarrierCredentialCollection response = api.getCarrierCredentials(startIndex, pageSize, sortBy, filter);
        // TODO: test validations
    }

    /**
     * Updates a Mozu
     *
     * hippingAdmin.Contracts.Carriers.CarrierCredential with the specified configuration.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateCarrierCredentialTest() throws ApiException {
        String carrierId = null;
        Integer siteId = null;
        String locationGroupCode = null;
        String locationCode = null;
        CarrierCredential carrierCredential = null;
        CarrierCredential response = api.updateCarrierCredential(carrierId, siteId, locationGroupCode, locationCode, carrierCredential);
        // TODO: test validations
    }

}