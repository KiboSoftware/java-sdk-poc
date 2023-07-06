/*
 * Api Documentation
 * Api Documentation
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.orderrouting.api;

import com.kibocommerce.sdk.common.ApiException;
import com.kibocommerce.sdk.orderrouting.models.AbstractFilter;
import com.kibocommerce.sdk.orderrouting.models.CustomDataListFilter;
import com.kibocommerce.sdk.orderrouting.models.CustomDataValueFilter;
import com.kibocommerce.sdk.orderrouting.models.LocationCriteriaSetFilter;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OrderRoutingFilterApi
 */
@Disabled
public class OrderRoutingFilterApiTest {

    private final OrderRoutingFilterApi api = new OrderRoutingFilterApi();

    /**
     * deleteFilter
     *
     * deleteFilter
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteFilterUsingDELETETest() throws ApiException {
        Integer filterID = null;
        Integer xVolSite = null;
        Integer xVolTenant = null;
        api.deleteFilterUsingDELETE(filterID, xVolSite, xVolTenant);
        // TODO: test validations
    }

    /**
     * getFilter
     *
     * getFilter
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFilterUsingGETTest() throws ApiException {
        Integer filterID = null;
        Integer xVolSite = null;
        Integer xVolTenant = null;
        AbstractFilter response = api.getFilterUsingGET(filterID, xVolSite, xVolTenant);
        // TODO: test validations
    }

    /**
     * saveCriteriaSetFilter
     *
     * saveCriteriaSetFilter
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void saveCriteriaSetFilterUsingPOSTTest() throws ApiException {
        Integer xVolSite = null;
        Integer xVolTenant = null;
        LocationCriteriaSetFilter loc = null;
        AbstractFilter response = api.saveCriteriaSetFilterUsingPOST(xVolSite, xVolTenant, loc);
        // TODO: test validations
    }

    /**
     * saveCustomDataListFilter
     *
     * saveCustomDataListFilter
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void saveCustomDataListFilterUsingPOSTTest() throws ApiException {
        Integer xVolSite = null;
        Integer xVolTenant = null;
        CustomDataListFilter filter = null;
        AbstractFilter response = api.saveCustomDataListFilterUsingPOST(xVolSite, xVolTenant, filter);
        // TODO: test validations
    }

    /**
     * saveCustomDataValueFilter
     *
     * saveCustomDataValueFilter
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void saveCustomDataValueFilterUsingPOSTTest() throws ApiException {
        Integer xVolSite = null;
        Integer xVolTenant = null;
        CustomDataValueFilter customDataValueFilter = null;
        AbstractFilter response = api.saveCustomDataValueFilterUsingPOST(xVolSite, xVolTenant, customDataValueFilter);
        // TODO: test validations
    }

    /**
     * testFilter
     *
     * testFilter
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void testFilterUsingGETTest() throws ApiException {
        Integer xVolSite = null;
        Integer xVolTenant = null;
        AbstractFilter response = api.testFilterUsingGET(xVolSite, xVolTenant);
        // TODO: test validations
    }

    /**
     * testSetFilter
     *
     * testSetFilter
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void testSetFilterUsingGETTest() throws ApiException {
        Integer xVolSite = null;
        Integer xVolTenant = null;
        AbstractFilter response = api.testSetFilterUsingGET(xVolSite, xVolTenant);
        // TODO: test validations
    }

}