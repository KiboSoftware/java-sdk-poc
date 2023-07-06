/*
 * Kibo MZDB Service
 * OpenAPI Spec for Kibo MZDB Service
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.entities.api;

import com.kibocommerce.sdk.common.ApiException;
import com.kibocommerce.sdk.entities.models.EntityContainer;
import com.kibocommerce.sdk.entities.models.EntityContainerCollection;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EntityContainersApi
 */
@Disabled
public class EntityContainersApiTest {

    private final EntityContainersApi api = new EntityContainersApi();

    /**
     * Get Entity Container
     *
     * Get a specific Entity Container from an  EntityList instance
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getEntityContainerTest() throws ApiException {
        String entityListFullName = null;
        String id = null;
        EntityContainer response = api.getEntityContainer(entityListFullName, id);
        // TODO: test validations
    }

    /**
     * Get Entity Containers
     *
     * Get a filtered collection of Entity Containers from an Entity List instance
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getEntityContainersTest() throws ApiException {
        String entityListFullName = null;
        Integer pageSize = null;
        Integer startIndex = null;
        String filter = null;
        String sortBy = null;
        EntityContainerCollection response = api.getEntityContainers(entityListFullName, pageSize, startIndex, filter, sortBy);
        // TODO: test validations
    }

    /**
     * Get  Entity View Container
     *
     * Get an Entity Container for a specific Entity in a ListView on an EntityList
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getViewEntityContainerTest() throws ApiException {
        String entityListFullName = null;
        String viewName = null;
        String entityId = null;
        EntityContainer response = api.getViewEntityContainer(entityListFullName, viewName, entityId);
        // TODO: test validations
    }

    /**
     * Get Entity View Containers
     *
     * Get a filtered collection of Entity Containers for a ListView on an EntityList
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getViewEntityContainersTest() throws ApiException {
        String entityListFullName = null;
        String viewName = null;
        Integer pageSize = null;
        Integer startIndex = null;
        String filter = null;
        EntityContainerCollection response = api.getViewEntityContainers(entityListFullName, viewName, pageSize, startIndex, filter);
        // TODO: test validations
    }

}