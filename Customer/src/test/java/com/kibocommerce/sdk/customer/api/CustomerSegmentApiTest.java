/*
 * Kibo Customer Service
 * OpenAPI Spec for Kibo Customer Service
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.customer.api;

import com.kibocommerce.sdk.common.ApiException;
import com.kibocommerce.sdk.customer.models.CustomerCustomerSegment;
import com.kibocommerce.sdk.customer.models.CustomerSegmentCollection;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CustomerSegmentApi
 */
@Disabled
public class CustomerSegmentApiTest {

    private final CustomerSegmentApi api = new CustomerSegmentApi();

    /**
     * Adds Segment
     *
     * Creates a new segment. Merchants create segments of customers, for example,   to offer discounts to particular groups or assign VIP status to a set of customers.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addSegmentTest() throws ApiException {
        CustomerCustomerSegment customerCustomerSegment = null;
        CustomerCustomerSegment response = api.addSegment(customerCustomerSegment);
        // TODO: test validations
    }

    /**
     * Add Segments Accounts
     *
     * Adds segments to an account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addSegmentAccountsTest() throws ApiException {
        Integer id = null;
        List<Integer> requestBody = null;
        api.addSegmentAccounts(id, requestBody);
        // TODO: test validations
    }

    /**
     * Delete Segment
     *
     * Deletes a segement specified by its unique code. Note that the group is deleted in all accounts that contain this segment.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteSegmentTest() throws ApiException {
        Integer id = null;
        api.deleteSegment(id);
        // TODO: test validations
    }

    /**
     * Get Segment
     *
     * Retrieves a segment specified the segment Id.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSegmentTest() throws ApiException {
        Integer id = null;
        CustomerCustomerSegment response = api.getSegment(id);
        // TODO: test validations
    }

    /**
     * Get Segments
     *
     * Retrieves a list of all segments defined for the site according to any specified filter criteria and sort options.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSegmentsTest() throws ApiException {
        Integer startIndex = null;
        Integer pageSize = null;
        String sortBy = null;
        String filter = null;
        CustomerSegmentCollection response = api.getSegments(startIndex, pageSize, sortBy, filter);
        // TODO: test validations
    }

    /**
     * Remove Segment Account
     *
     * Removes single account from a segment.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeSegmentAccountTest() throws ApiException {
        Integer id = null;
        Integer accountId = null;
        api.removeSegmentAccount(id, accountId);
        // TODO: test validations
    }

    /**
     * Update Segment
     *
     * Update the code, name, or description of an existing segment.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateSegmentTest() throws ApiException {
        Integer id = null;
        CustomerCustomerSegment customerCustomerSegment = null;
        CustomerCustomerSegment response = api.updateSegment(id, customerCustomerSegment);
        // TODO: test validations
    }

}