/*
 * Kibo MongoAdmin Service
 * OpenAPI Spec for Kibo MongoAdmin Service
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.importexport.api;

import com.kibocommerce.sdk.common.ApiException;
import com.kibocommerce.sdk.importexport.models.DropLocation;
import java.io.File;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FilesApi
 */
@Disabled
public class FilesApiTest {

    private final FilesApi api = new FilesApi();

    /**
     * Download
     *
     * Download
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void downloadTest() throws ApiException {
        String id = null;
        api.download(id);
        // TODO: test validations
    }

    /**
     * Get
     *
     * Get
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTest() throws ApiException {
        String id = null;
        DropLocation response = api.get(id);
        // TODO: test validations
    }

    /**
     * Get Public Link
     *
     * Get Public Link
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPublicLinkTest() throws ApiException {
        String id = null;
        Integer hourDuration = null;
        String response = api.getPublicLink(id, hourDuration);
        // TODO: test validations
    }

    /**
     * Upload
     *
     * Upload
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void uploadTest() throws ApiException {
        String fileType = null;
        String fileName = null;
        File body = null;
        DropLocation response = api.upload(fileType, fileName, body);
        // TODO: test validations
    }

}
