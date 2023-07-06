/*
 * Kibo ProductRuntime Service
 * OpenAPI Spec for Kibo ProductRuntime Service
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.solrschemamanager.api;

import com.kibocommerce.sdk.common.ApiException;
import com.kibocommerce.sdk.solrschemamanager.models.Suggester;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SuggestDefinitionApi
 */
@Disabled
public class SuggestDefinitionApiTest {

    private final SuggestDefinitionApi api = new SuggestDefinitionApi();

    /**
     * Downloads the suggest file for the site
     *
     * Downloads the suggest file for the site
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void downLoadSuggestTest() throws ApiException {
        String language = null;
        api.downLoadSuggest(language);
        // TODO: test validations
    }

    /**
     * Gets the suggester settings for the site
     *
     * Gets the suggester settings for the site
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSuggestSettingsTest() throws ApiException {
        String language = null;
        Suggester response = api.getSuggestSettings(language);
        // TODO: test validations
    }

    /**
     * Updates the suggester settings for the site
     *
     * Updates the suggester settings for the site
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateSuggestSettingsTest() throws ApiException {
        String language = null;
        Suggester suggester = null;
        Suggester response = api.updateSuggestSettings(language, suggester);
        // TODO: test validations
    }

    /**
     * Uploads a suggest file for the site in tab seperated format)
     *
     * Uploads a suggest file for the site in tab seperated format)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void uploadSuggestTest() throws ApiException {
        String language = null;
        List<String> response = api.uploadSuggest(language);
        // TODO: test validations
    }

}
