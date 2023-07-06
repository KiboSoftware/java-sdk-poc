/*
 * Kibo CommerceRuntime Service
 * OpenAPI Spec for Kibo CommerceRuntime Service
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.commerce.api;

import com.kibocommerce.sdk.common.ApiException;
import com.kibocommerce.sdk.commerce.models.ChannelGroup;
import com.kibocommerce.sdk.commerce.models.ChannelGroupCollection;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ChannelGroupApi
 */
@Disabled
public class ChannelGroupApiTest {

    private final ChannelGroupApi api = new ChannelGroupApi();

    /**
     * Creates Channel Group.
     *
     * Creates a new channel group.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createChannelGroupTest() throws ApiException {
        ChannelGroup channelGroup = null;
        ChannelGroup response = api.createChannelGroup(channelGroup);
        // TODO: test validations
    }

    /**
     * Delete Channel Group
     *
     * Deletes a channel grop specified by group code.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteChannelGroupTest() throws ApiException {
        String code = null;
        api.deleteChannelGroup(code);
        // TODO: test validations
    }

    /**
     * Get Channel Group
     *
     * Retrieves the details of an channel group specified by the code.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getChannelGroupTest() throws ApiException {
        String code = null;
        ChannelGroup response = api.getChannelGroup(code);
        // TODO: test validations
    }

    /**
     * Get Channel Groups
     *
     * Retrieves a list of channel groups according to any specified filter criteria and sort options.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getChannelGroupsTest() throws ApiException {
        Integer startIndex = null;
        Integer pageSize = null;
        String sortBy = null;
        String filter = null;
        ChannelGroupCollection response = api.getChannelGroups(startIndex, pageSize, sortBy, filter);
        // TODO: test validations
    }

    /**
     * Updates Channel Group.
     *
     * Updates a specific channel group.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateChannelGroupTest() throws ApiException {
        String code = null;
        ChannelGroup channelGroup = null;
        ChannelGroup response = api.updateChannelGroup(code, channelGroup);
        // TODO: test validations
    }

}
