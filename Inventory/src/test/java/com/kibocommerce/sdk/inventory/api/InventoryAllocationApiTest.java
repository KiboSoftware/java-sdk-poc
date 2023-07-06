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
import com.kibocommerce.sdk.inventory.models.AllocateInventory500Response;
import com.kibocommerce.sdk.inventory.models.AllocateInventoryRequest;
import com.kibocommerce.sdk.inventory.models.BaseResponse;
import com.kibocommerce.sdk.inventory.models.JobQueueResponse;
import com.kibocommerce.sdk.inventory.models.TransitionCartRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InventoryAllocationApi
 */
@Disabled
public class InventoryAllocationApiTest {

    private final InventoryAllocationApi api = new InventoryAllocationApi();

    /**
     * Allocate Inventory
     *
     * Allocates inventory based on the given request
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void allocateInventoryTest() throws ApiException {
        Integer xVolTenant = null;
        AllocateInventoryRequest allocateInventoryRequest = null;
        JobQueueResponse response = api.allocateInventory(xVolTenant, allocateInventoryRequest);
        // TODO: test validations
    }

    /**
     * Deallocate Inventory
     *
     * Deallocates inventory based on the given request
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deallocateInventoryTest() throws ApiException {
        Integer xVolTenant = null;
        AllocateInventoryRequest allocateInventoryRequest = null;
        BaseResponse response = api.deallocateInventory(xVolTenant, allocateInventoryRequest);
        // TODO: test validations
    }

    /**
     * Fulfill Inventory
     *
     * Fulfills inventory based on the given request
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void fulfillInventoryTest() throws ApiException {
        Integer xVolTenant = null;
        AllocateInventoryRequest allocateInventoryRequest = null;
        BaseResponse response = api.fulfillInventory(xVolTenant, allocateInventoryRequest);
        // TODO: test validations
    }

    /**
     * Transition Cart
     *
     * Transitions a cart allocation into a normal order/shipment allocation
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void transitionCartTest() throws ApiException {
        Integer xVolTenant = null;
        TransitionCartRequest transitionCartRequest = null;
        BaseResponse response = api.transitionCart(xVolTenant, transitionCartRequest);
        // TODO: test validations
    }

}
