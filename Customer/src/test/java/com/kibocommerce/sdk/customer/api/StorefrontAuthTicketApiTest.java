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
import com.kibocommerce.sdk.customer.models.CustomerAuthTicket;
import com.kibocommerce.sdk.customer.models.CustomerUserAuthInfo;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StorefrontAuthTicketApi
 */
@Disabled
public class StorefrontAuthTicketApiTest {

    private final StorefrontAuthTicketApi api = new StorefrontAuthTicketApi();

    /**
     * Create Anonymous Shopper Auth Ticket
     *
     * Authenticates anonymous shopper for the site.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createAnonymousShopperAuthTicketTest() throws ApiException {
        CustomerAuthTicket response = api.createAnonymousShopperAuthTicket();
        // TODO: test validations
    }

    /**
     * Create User Auth Ticket
     *
     * Authenticates a user for a particular site given a set of user credentials.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createUserAuthTicketTest() throws ApiException {
        CustomerUserAuthInfo customerUserAuthInfo = null;
        CustomerAuthTicket response = api.createUserAuthTicket(customerUserAuthInfo);
        // TODO: test validations
    }

    /**
     * Refresh User Auth Ticket
     *
     * Refreshes a user&#39;s authentication.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void refreshUserAuthTicketTest() throws ApiException {
        String refreshToken = null;
        CustomerAuthTicket response = api.refreshUserAuthTicket(refreshToken);
        // TODO: test validations
    }

}
