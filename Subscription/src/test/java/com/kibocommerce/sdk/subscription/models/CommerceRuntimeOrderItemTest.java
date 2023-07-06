/*
 * Kibo SubscriptionRuntime Service
 * OpenAPI Spec for Kibo SubscriptionRuntime Service
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.subscription.models;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kibocommerce.sdk.subscription.models.AdminUserAuditInfo;
import com.kibocommerce.sdk.subscription.models.CommerceRuntimeAppliedLineItemProductDiscount;
import com.kibocommerce.sdk.subscription.models.CommerceRuntimeAppliedLineItemShippingDiscount;
import com.kibocommerce.sdk.subscription.models.CommerceRuntimeProduct;
import com.kibocommerce.sdk.subscription.models.CommerceUnitPrice;
import com.kibocommerce.sdk.subscription.models.InventoryTags;
import com.kibocommerce.sdk.subscription.models.SubscriptionInfo;
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
 * Model tests for CommerceRuntimeOrderItem
 */
public class CommerceRuntimeOrderItemTest {
    private final CommerceRuntimeOrderItem model = new CommerceRuntimeOrderItem();

    /**
     * Model tests for CommerceRuntimeOrderItem
     */
    @Test
    public void testCommerceRuntimeOrderItem() {
        // TODO: test CommerceRuntimeOrderItem
    }

    /**
     * Test the property 'localeCode'
     */
    @Test
    public void localeCodeTest() {
        // TODO: test localeCode
    }

    /**
     * Test the property 'purchaseLocation'
     */
    @Test
    public void purchaseLocationTest() {
        // TODO: test purchaseLocation
    }

    /**
     * Test the property 'lineId'
     */
    @Test
    public void lineIdTest() {
        // TODO: test lineId
    }

    /**
     * Test the property 'product'
     */
    @Test
    public void productTest() {
        // TODO: test product
    }

    /**
     * Test the property 'quantity'
     */
    @Test
    public void quantityTest() {
        // TODO: test quantity
    }

    /**
     * Test the property 'isRecurring'
     */
    @Test
    public void isRecurringTest() {
        // TODO: test isRecurring
    }

    /**
     * Test the property 'isTaxable'
     */
    @Test
    public void isTaxableTest() {
        // TODO: test isTaxable
    }

    /**
     * Test the property 'subtotal'
     */
    @Test
    public void subtotalTest() {
        // TODO: test subtotal
    }

    /**
     * Test the property 'extendedTotal'
     */
    @Test
    public void extendedTotalTest() {
        // TODO: test extendedTotal
    }

    /**
     * Test the property 'taxableTotal'
     */
    @Test
    public void taxableTotalTest() {
        // TODO: test taxableTotal
    }

    /**
     * Test the property 'discountTotal'
     */
    @Test
    public void discountTotalTest() {
        // TODO: test discountTotal
    }

    /**
     * Test the property 'discountedTotal'
     */
    @Test
    public void discountedTotalTest() {
        // TODO: test discountedTotal
    }

    /**
     * Test the property 'itemTaxTotal'
     */
    @Test
    public void itemTaxTotalTest() {
        // TODO: test itemTaxTotal
    }

    /**
     * Test the property 'shippingTaxTotal'
     */
    @Test
    public void shippingTaxTotalTest() {
        // TODO: test shippingTaxTotal
    }

    /**
     * Test the property 'shippingTotal'
     */
    @Test
    public void shippingTotalTest() {
        // TODO: test shippingTotal
    }

    /**
     * Test the property 'handlingAmount'
     */
    @Test
    public void handlingAmountTest() {
        // TODO: test handlingAmount
    }

    /**
     * Test the property 'feeTotal'
     */
    @Test
    public void feeTotalTest() {
        // TODO: test feeTotal
    }

    /**
     * Test the property 'total'
     */
    @Test
    public void totalTest() {
        // TODO: test total
    }

    /**
     * Test the property 'unitPrice'
     */
    @Test
    public void unitPriceTest() {
        // TODO: test unitPrice
    }

    /**
     * Test the property 'productDiscount'
     */
    @Test
    public void productDiscountTest() {
        // TODO: test productDiscount
    }

    /**
     * Test the property 'productDiscounts'
     */
    @Test
    public void productDiscountsTest() {
        // TODO: test productDiscounts
    }

    /**
     * Test the property 'shippingDiscounts'
     */
    @Test
    public void shippingDiscountsTest() {
        // TODO: test shippingDiscounts
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
     * Test the property 'auditInfo'
     */
    @Test
    public void auditInfoTest() {
        // TODO: test auditInfo
    }

    /**
     * Test the property 'shippingAmountBeforeDiscountsAndAdjustments'
     */
    @Test
    public void shippingAmountBeforeDiscountsAndAdjustmentsTest() {
        // TODO: test shippingAmountBeforeDiscountsAndAdjustments
    }

    /**
     * Test the property 'weightedOrderAdjustment'
     */
    @Test
    public void weightedOrderAdjustmentTest() {
        // TODO: test weightedOrderAdjustment
    }

    /**
     * Test the property 'weightedOrderDiscount'
     */
    @Test
    public void weightedOrderDiscountTest() {
        // TODO: test weightedOrderDiscount
    }

    /**
     * Test the property 'adjustedLineItemSubtotal'
     */
    @Test
    public void adjustedLineItemSubtotalTest() {
        // TODO: test adjustedLineItemSubtotal
    }

    /**
     * Test the property 'totalWithoutWeightedShippingAndHandling'
     */
    @Test
    public void totalWithoutWeightedShippingAndHandlingTest() {
        // TODO: test totalWithoutWeightedShippingAndHandling
    }

    /**
     * Test the property 'weightedOrderTax'
     */
    @Test
    public void weightedOrderTaxTest() {
        // TODO: test weightedOrderTax
    }

    /**
     * Test the property 'weightedOrderShipping'
     */
    @Test
    public void weightedOrderShippingTest() {
        // TODO: test weightedOrderShipping
    }

    /**
     * Test the property 'weightedOrderShippingDiscount'
     */
    @Test
    public void weightedOrderShippingDiscountTest() {
        // TODO: test weightedOrderShippingDiscount
    }

    /**
     * Test the property 'weightedOrderShippingManualAdjustment'
     */
    @Test
    public void weightedOrderShippingManualAdjustmentTest() {
        // TODO: test weightedOrderShippingManualAdjustment
    }

    /**
     * Test the property 'weightedOrderShippingTax'
     */
    @Test
    public void weightedOrderShippingTaxTest() {
        // TODO: test weightedOrderShippingTax
    }

    /**
     * Test the property 'weightedOrderHandlingFee'
     */
    @Test
    public void weightedOrderHandlingFeeTest() {
        // TODO: test weightedOrderHandlingFee
    }

    /**
     * Test the property 'weightedOrderHandlingFeeTax'
     */
    @Test
    public void weightedOrderHandlingFeeTaxTest() {
        // TODO: test weightedOrderHandlingFeeTax
    }

    /**
     * Test the property 'weightedOrderHandlingFeeDiscount'
     */
    @Test
    public void weightedOrderHandlingFeeDiscountTest() {
        // TODO: test weightedOrderHandlingFeeDiscount
    }

    /**
     * Test the property 'weightedOrderDuty'
     */
    @Test
    public void weightedOrderDutyTest() {
        // TODO: test weightedOrderDuty
    }

    /**
     * Test the property 'totalWithWeightedShippingAndHandling'
     */
    @Test
    public void totalWithWeightedShippingAndHandlingTest() {
        // TODO: test totalWithWeightedShippingAndHandling
    }

    /**
     * Test the property 'weightedOrderHandlingAdjustment'
     */
    @Test
    public void weightedOrderHandlingAdjustmentTest() {
        // TODO: test weightedOrderHandlingAdjustment
    }

    /**
     * Test the property 'autoAddDiscountId'
     */
    @Test
    public void autoAddDiscountIdTest() {
        // TODO: test autoAddDiscountId
    }

    /**
     * Test the property 'isAssemblyRequired'
     */
    @Test
    public void isAssemblyRequiredTest() {
        // TODO: test isAssemblyRequired
    }

    /**
     * Test the property 'childItemIds'
     */
    @Test
    public void childItemIdsTest() {
        // TODO: test childItemIds
    }

    /**
     * Test the property 'parentItemId'
     */
    @Test
    public void parentItemIdTest() {
        // TODO: test parentItemId
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

}
