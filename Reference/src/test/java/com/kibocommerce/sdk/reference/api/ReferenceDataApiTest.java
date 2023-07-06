/*
 * Kibo Reference Service
 * OpenAPI Spec for Kibo Reference Service
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.reference.api;

import com.kibocommerce.sdk.common.ApiException;
import com.kibocommerce.sdk.reference.models.AddressSchema;
import com.kibocommerce.sdk.reference.models.AddressSchemaCollection;
import com.kibocommerce.sdk.reference.models.Behavior;
import com.kibocommerce.sdk.reference.models.BehaviorCategory;
import com.kibocommerce.sdk.reference.models.BehaviorCategoryCollection;
import com.kibocommerce.sdk.reference.models.BehaviorCollection;
import com.kibocommerce.sdk.reference.models.ContentLocaleCollection;
import com.kibocommerce.sdk.reference.models.CountryCollection;
import com.kibocommerce.sdk.reference.models.CountryWithStatesCollection;
import com.kibocommerce.sdk.reference.models.CurrencyCollection;
import com.kibocommerce.sdk.reference.models.TimeZoneCollection;
import com.kibocommerce.sdk.reference.models.TopLevelDomainCollection;
import com.kibocommerce.sdk.reference.models.UnitOfMeasureCollection;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ReferenceDataApi
 */
@Disabled
public class ReferenceDataApiTest {

    private final ReferenceDataApi api = new ReferenceDataApi();

    /**
     * Get Address Schema
     *
     * Get Address Schema
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAddressSchemaTest() throws ApiException {
        String countryCode = null;
        AddressSchema response = api.getAddressSchema(countryCode);
        // TODO: test validations
    }

    /**
     * Get Address Schemas
     *
     * Get Address Schemas
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAddressSchemasTest() throws ApiException {
        AddressSchemaCollection response = api.getAddressSchemas();
        // TODO: test validations
    }

    /**
     * Retrieves the details of a behavior specified by its behavior ID
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getBehaviorTest() throws ApiException {
        Integer behaviorId = null;
        Behavior response = api.getBehavior(behaviorId);
        // TODO: test validations
    }

    /**
     * Retrieves a list of all behavior categories
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getBehaviorCategoriesTest() throws ApiException {
        BehaviorCategoryCollection response = api.getBehaviorCategories();
        // TODO: test validations
    }

    /**
     * Retrieves the details of a behavior specified by its behavior ID
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getBehaviorCategoryTest() throws ApiException {
        Integer categoryId = null;
        BehaviorCategory response = api.getBehaviorCategory(categoryId);
        // TODO: test validations
    }

    /**
     * Retrieves a list of all behaviors
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getBehaviorsTest() throws ApiException {
        String userType = null;
        BehaviorCollection response = api.getBehaviors(userType);
        // TODO: test validations
    }

    /**
     * Get the full list of Content Locales supported by the system
     *
     * Get the full list of Content Locales supported by the system
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getContentLocalesTest() throws ApiException {
        ContentLocaleCollection response = api.getContentLocales();
        // TODO: test validations
    }

    /**
     * Get the full list of Countries supported by the system
     *
     * Get the full list of Countries supported by the system
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCountriesTest() throws ApiException {
        CountryCollection response = api.getCountries();
        // TODO: test validations
    }

    /**
     * Get the full list of Countries supported by the system
     *
     * Get the full list of Countries supported by the system
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCountriesWithStatesTest() throws ApiException {
        CountryWithStatesCollection response = api.getCountriesWithStates();
        // TODO: test validations
    }

    /**
     * Get the full list of Currencies supported by the system
     *
     * Get the full list of Currencies supported by the system
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCurrenciesTest() throws ApiException {
        CurrencyCollection response = api.getCurrencies();
        // TODO: test validations
    }

    /**
     * Get the full list of TimeZones supported by the system
     *
     * Get the full list of TimeZones supported by the system
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTimeZonesTest() throws ApiException {
        TimeZoneCollection response = api.getTimeZones();
        // TODO: test validations
    }

    /**
     * Get a full list of the supported top level domains
     *
     * Get a full list of the supported top level domains
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTopLevelDomainsTest() throws ApiException {
        TopLevelDomainCollection response = api.getTopLevelDomains();
        // TODO: test validations
    }

    /**
     * Get a full list of the units of measure
     *
     * Get a full list of the units of measure
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUnitsOfMeasureTest() throws ApiException {
        String filter = null;
        UnitOfMeasureCollection response = api.getUnitsOfMeasure(filter);
        // TODO: test validations
    }

}
