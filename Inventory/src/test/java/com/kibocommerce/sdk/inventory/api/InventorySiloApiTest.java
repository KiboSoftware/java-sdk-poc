/*
 * Inventory
 * Swagger JSON for inventory apis
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.inventory.api;

import com.kibocommerce.sdk.common.ApiException;
import com.kibocommerce.sdk.inventory.models.TenantSiloConfigModel;
import com.kibocommerce.sdk.inventory.models.UpdateTenantSiloConfigRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InventorySiloApi
 */
@Disabled
public class InventorySiloApiTest {

    private final InventorySiloApi api = new InventorySiloApi();

    /**
     * Update Tenant Silo Config
     *
     * Updates tenant silo config
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateTenantSiloConfigTest() throws ApiException {
        Integer xVolTenant = null;
        UpdateTenantSiloConfigRequest updateTenantSiloConfigRequest = null;
        TenantSiloConfigModel response = api.updateTenantSiloConfig(xVolTenant, updateTenantSiloConfigRequest);
        // TODO: test validations
    }

}