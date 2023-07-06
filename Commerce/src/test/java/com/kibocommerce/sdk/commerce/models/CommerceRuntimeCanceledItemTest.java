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


package com.kibocommerce.sdk.commerce.models;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kibocommerce.sdk.commerce.models.AdminUserAuditInfo;
import com.kibocommerce.sdk.commerce.models.CommerceRuntimeCanceledReason;
import com.kibocommerce.sdk.commerce.models.CommerceRuntimeFulfillmentField;
import com.kibocommerce.sdk.commerce.models.CommerceRuntimeGiftCard;
import com.kibocommerce.sdk.commerce.models.CommerceRuntimePackageMeasurements;
import com.kibocommerce.sdk.commerce.models.CommerceRuntimeProductOption;
import com.kibocommerce.sdk.commerce.models.InventoryTags;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


/**
 * Model tests for CommerceRuntimeCanceledItem
 */
public class CommerceRuntimeCanceledItemTest {
    private final CommerceRuntimeCanceledItem model = new CommerceRuntimeCanceledItem();

    /**
     * Model tests for CommerceRuntimeCanceledItem
     */
    @Test
    public void testCommerceRuntimeCanceledItem() {
        // TODO: test CommerceRuntimeCanceledItem
    }

    /**
     * Test the property 'lineId'
     */
    @Test
    public void lineIdTest() {
        // TODO: test lineId
    }

    /**
     * Test the property 'originalOrderItemId'
     */
    @Test
    public void originalOrderItemIdTest() {
        // TODO: test originalOrderItemId
    }

    /**
     * Test the property 'parentId'
     */
    @Test
    public void parentIdTest() {
        // TODO: test parentId
    }

    /**
     * Test the property 'productCode'
     */
    @Test
    public void productCodeTest() {
        // TODO: test productCode
    }

    /**
     * Test the property 'variationProductCode'
     */
    @Test
    public void variationProductCodeTest() {
        // TODO: test variationProductCode
    }

    /**
     * Test the property 'optionAttributeFQN'
     */
    @Test
    public void optionAttributeFQNTest() {
        // TODO: test optionAttributeFQN
    }

    /**
     * Test the property 'name'
     */
    @Test
    public void nameTest() {
        // TODO: test name
    }

    /**
     * Test the property 'auditInfo'
     */
    @Test
    public void auditInfoTest() {
        // TODO: test auditInfo
    }

    /**
     * Test the property 'fulfillmentLocationCode'
     */
    @Test
    public void fulfillmentLocationCodeTest() {
        // TODO: test fulfillmentLocationCode
    }

    /**
     * Test the property 'imageUrl'
     */
    @Test
    public void imageUrlTest() {
        // TODO: test imageUrl
    }

    /**
     * Test the property 'isTaxable'
     */
    @Test
    public void isTaxableTest() {
        // TODO: test isTaxable
    }

    /**
     * Test the property 'quantity'
     */
    @Test
    public void quantityTest() {
        // TODO: test quantity
    }

    /**
     * Test the property 'unitPrice'
     */
    @Test
    public void unitPriceTest() {
        // TODO: test unitPrice
    }

    /**
     * Test the property 'actualPrice'
     */
    @Test
    public void actualPriceTest() {
        // TODO: test actualPrice
    }

    /**
     * Test the property 'overridePrice'
     */
    @Test
    public void overridePriceTest() {
        // TODO: test overridePrice
    }

    /**
     * Test the property 'itemDiscount'
     */
    @Test
    public void itemDiscountTest() {
        // TODO: test itemDiscount
    }

    /**
     * Test the property 'lineItemCost'
     */
    @Test
    public void lineItemCostTest() {
        // TODO: test lineItemCost
    }

    /**
     * Test the property 'itemTax'
     */
    @Test
    public void itemTaxTest() {
        // TODO: test itemTax
    }

    /**
     * Test the property 'shipping'
     */
    @Test
    public void shippingTest() {
        // TODO: test shipping
    }

    /**
     * Test the property 'shippingDiscount'
     */
    @Test
    public void shippingDiscountTest() {
        // TODO: test shippingDiscount
    }

    /**
     * Test the property 'shippingTax'
     */
    @Test
    public void shippingTaxTest() {
        // TODO: test shippingTax
    }

    /**
     * Test the property 'handling'
     */
    @Test
    public void handlingTest() {
        // TODO: test handling
    }

    /**
     * Test the property 'handlingDiscount'
     */
    @Test
    public void handlingDiscountTest() {
        // TODO: test handlingDiscount
    }

    /**
     * Test the property 'handlingTax'
     */
    @Test
    public void handlingTaxTest() {
        // TODO: test handlingTax
    }

    /**
     * Test the property 'duty'
     */
    @Test
    public void dutyTest() {
        // TODO: test duty
    }

    /**
     * Test the property 'isPackagedStandAlone'
     */
    @Test
    public void isPackagedStandAloneTest() {
        // TODO: test isPackagedStandAlone
    }

    /**
     * Test the property 'readyForPickupQuantity'
     */
    @Test
    public void readyForPickupQuantityTest() {
        // TODO: test readyForPickupQuantity
    }

    /**
     * Test the property 'backorderReleaseDate'
     */
    @Test
    public void backorderReleaseDateTest() {
        // TODO: test backorderReleaseDate
    }

    /**
     * Test the property 'measurements'
     */
    @Test
    public void measurementsTest() {
        // TODO: test measurements
    }

    /**
     * Test the property 'options'
     */
    @Test
    public void optionsTest() {
        // TODO: test options
    }

    /**
     * Test the property 'data'
     */
    @Test
    public void dataTest() {
        // TODO: test data
    }

    /**
     * Test the property 'taxData'
     */
    @Test
    public void taxDataTest() {
        // TODO: test taxData
    }

    /**
     * Test the property 'weightedShipmentAdjustment'
     */
    @Test
    public void weightedShipmentAdjustmentTest() {
        // TODO: test weightedShipmentAdjustment
    }

    /**
     * Test the property 'weightedLineItemTaxAdjustment'
     */
    @Test
    public void weightedLineItemTaxAdjustmentTest() {
        // TODO: test weightedLineItemTaxAdjustment
    }

    /**
     * Test the property 'weightedShippingAdjustment'
     */
    @Test
    public void weightedShippingAdjustmentTest() {
        // TODO: test weightedShippingAdjustment
    }

    /**
     * Test the property 'weightedShippingTaxAdjustment'
     */
    @Test
    public void weightedShippingTaxAdjustmentTest() {
        // TODO: test weightedShippingTaxAdjustment
    }

    /**
     * Test the property 'weightedHandlingAdjustment'
     */
    @Test
    public void weightedHandlingAdjustmentTest() {
        // TODO: test weightedHandlingAdjustment
    }

    /**
     * Test the property 'weightedHandlingTaxAdjustment'
     */
    @Test
    public void weightedHandlingTaxAdjustmentTest() {
        // TODO: test weightedHandlingTaxAdjustment
    }

    /**
     * Test the property 'weightedDutyAdjustment'
     */
    @Test
    public void weightedDutyAdjustmentTest() {
        // TODO: test weightedDutyAdjustment
    }

    /**
     * Test the property 'taxableShipping'
     */
    @Test
    public void taxableShippingTest() {
        // TODO: test taxableShipping
    }

    /**
     * Test the property 'taxableLineItemCost'
     */
    @Test
    public void taxableLineItemCostTest() {
        // TODO: test taxableLineItemCost
    }

    /**
     * Test the property 'taxableHandling'
     */
    @Test
    public void taxableHandlingTest() {
        // TODO: test taxableHandling
    }

    /**
     * Test the property 'fulfillmentFields'
     */
    @Test
    public void fulfillmentFieldsTest() {
        // TODO: test fulfillmentFields
    }

    /**
     * Test the property 'isAssemblyRequired'
     */
    @Test
    public void isAssemblyRequiredTest() {
        // TODO: test isAssemblyRequired
    }

    /**
     * Test the property 'parentItemId'
     */
    @Test
    public void parentItemIdTest() {
        // TODO: test parentItemId
    }

    /**
     * Test the property 'childItemIds'
     */
    @Test
    public void childItemIdsTest() {
        // TODO: test childItemIds
    }

    /**
     * Test the property 'giftCards'
     */
    @Test
    public void giftCardsTest() {
        // TODO: test giftCards
    }

    /**
     * Test the property 'locatorName'
     */
    @Test
    public void locatorNameTest() {
        // TODO: test locatorName
    }

    /**
     * Test the property 'inventoryTags'
     */
    @Test
    public void inventoryTagsTest() {
        // TODO: test inventoryTags
    }

    /**
     * Test the property 'lineItemAdjustment'
     */
    @Test
    public void lineItemAdjustmentTest() {
        // TODO: test lineItemAdjustment
    }

    /**
     * Test the property 'isReservedInventory'
     */
    @Test
    public void isReservedInventoryTest() {
        // TODO: test isReservedInventory
    }

    /**
     * Test the property 'cartItemId'
     */
    @Test
    public void cartItemIdTest() {
        // TODO: test cartItemId
    }

    /**
     * Test the property 'sku'
     */
    @Test
    public void skuTest() {
        // TODO: test sku
    }

    /**
     * Test the property 'partNumber'
     */
    @Test
    public void partNumberTest() {
        // TODO: test partNumber
    }

    /**
     * Test the property 'upc'
     */
    @Test
    public void upcTest() {
        // TODO: test upc
    }

    /**
     * Test the property 'isSubstitutable'
     */
    @Test
    public void isSubstitutableTest() {
        // TODO: test isSubstitutable
    }

    /**
     * Test the property 'originalLineId'
     */
    @Test
    public void originalLineIdTest() {
        // TODO: test originalLineId
    }

    /**
     * Test the property 'originalQuantity'
     */
    @Test
    public void originalQuantityTest() {
        // TODO: test originalQuantity
    }

    /**
     * Test the property 'substituteQuantity'
     */
    @Test
    public void substituteQuantityTest() {
        // TODO: test substituteQuantity
    }

}
