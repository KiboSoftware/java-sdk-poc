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
import com.kibocommerce.sdk.commerce.models.AlternateContact;
import com.kibocommerce.sdk.commerce.models.CheckoutGrouping;
import com.kibocommerce.sdk.commerce.models.CommerceRuntimeAppliedDiscount;
import com.kibocommerce.sdk.commerce.models.CommerceRuntimeDestination;
import com.kibocommerce.sdk.commerce.models.CommerceRuntimeOrderAttribute;
import com.kibocommerce.sdk.commerce.models.CommerceRuntimeOrderItem;
import com.kibocommerce.sdk.commerce.models.CommerceRuntimeShopperNotes;
import com.kibocommerce.sdk.commerce.models.CommerceRuntimeThresholdMessage;
import com.kibocommerce.sdk.commerce.models.InvalidCoupon;
import com.kibocommerce.sdk.commerce.models.Payment;
import com.kibocommerce.sdk.commerce.models.SuggestedDiscount;
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
 * Model tests for Checkout
 */
public class CheckoutTest {
    private final Checkout model = new Checkout();

    /**
     * Model tests for Checkout
     */
    @Test
    public void testCheckout() {
        // TODO: test Checkout
    }

    /**
     * Test the property 'id'
     */
    @Test
    public void idTest() {
        // TODO: test id
    }

    /**
     * Test the property 'siteId'
     */
    @Test
    public void siteIdTest() {
        // TODO: test siteId
    }

    /**
     * Test the property 'tenantId'
     */
    @Test
    public void tenantIdTest() {
        // TODO: test tenantId
    }

    /**
     * Test the property 'number'
     */
    @Test
    public void numberTest() {
        // TODO: test number
    }

    /**
     * Test the property 'originalCartId'
     */
    @Test
    public void originalCartIdTest() {
        // TODO: test originalCartId
    }

    /**
     * Test the property 'submittedDate'
     */
    @Test
    public void submittedDateTest() {
        // TODO: test submittedDate
    }

    /**
     * Test the property 'type'
     */
    @Test
    public void typeTest() {
        // TODO: test type
    }

    /**
     * Test the property 'items'
     */
    @Test
    public void itemsTest() {
        // TODO: test items
    }

    /**
     * Test the property 'groupings'
     */
    @Test
    public void groupingsTest() {
        // TODO: test groupings
    }

    /**
     * Test the property 'auditInfo'
     */
    @Test
    public void auditInfoTest() {
        // TODO: test auditInfo
    }

    /**
     * Test the property 'destinations'
     */
    @Test
    public void destinationsTest() {
        // TODO: test destinations
    }

    /**
     * Test the property 'payments'
     */
    @Test
    public void paymentsTest() {
        // TODO: test payments
    }

    /**
     * Test the property 'amountRemainingForPayment'
     */
    @Test
    public void amountRemainingForPaymentTest() {
        // TODO: test amountRemainingForPayment
    }

    /**
     * Test the property 'acceptsMarketing'
     */
    @Test
    public void acceptsMarketingTest() {
        // TODO: test acceptsMarketing
    }

    /**
     * Test the property 'customerAccountId'
     */
    @Test
    public void customerAccountIdTest() {
        // TODO: test customerAccountId
    }

    /**
     * Test the property 'email'
     */
    @Test
    public void emailTest() {
        // TODO: test email
    }

    /**
     * Test the property 'alternateContact'
     */
    @Test
    public void alternateContactTest() {
        // TODO: test alternateContact
    }

    /**
     * Test the property 'customerTaxId'
     */
    @Test
    public void customerTaxIdTest() {
        // TODO: test customerTaxId
    }

    /**
     * Test the property 'isTaxExempt'
     */
    @Test
    public void isTaxExemptTest() {
        // TODO: test isTaxExempt
    }

    /**
     * Test the property 'currencyCode'
     */
    @Test
    public void currencyCodeTest() {
        // TODO: test currencyCode
    }

    /**
     * Test the property 'priceListCode'
     */
    @Test
    public void priceListCodeTest() {
        // TODO: test priceListCode
    }

    /**
     * Test the property 'attributes'
     */
    @Test
    public void attributesTest() {
        // TODO: test attributes
    }

    /**
     * Test the property 'shopperNotes'
     */
    @Test
    public void shopperNotesTest() {
        // TODO: test shopperNotes
    }

    /**
     * Test the property 'availableActions'
     */
    @Test
    public void availableActionsTest() {
        // TODO: test availableActions
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
     * Test the property 'channelCode'
     */
    @Test
    public void channelCodeTest() {
        // TODO: test channelCode
    }

    /**
     * Test the property 'locationCode'
     */
    @Test
    public void locationCodeTest() {
        // TODO: test locationCode
    }

    /**
     * Test the property 'ipAddress'
     */
    @Test
    public void ipAddressTest() {
        // TODO: test ipAddress
    }

    /**
     * Test the property 'sourceDevice'
     */
    @Test
    public void sourceDeviceTest() {
        // TODO: test sourceDevice
    }

    /**
     * Test the property 'visitId'
     */
    @Test
    public void visitIdTest() {
        // TODO: test visitId
    }

    /**
     * Test the property 'webSessionId'
     */
    @Test
    public void webSessionIdTest() {
        // TODO: test webSessionId
    }

    /**
     * Test the property 'customerInteractionType'
     */
    @Test
    public void customerInteractionTypeTest() {
        // TODO: test customerInteractionType
    }

    /**
     * Test the property 'orderDiscounts'
     */
    @Test
    public void orderDiscountsTest() {
        // TODO: test orderDiscounts
    }

    /**
     * Test the property 'couponCodes'
     */
    @Test
    public void couponCodesTest() {
        // TODO: test couponCodes
    }

    /**
     * Test the property 'invalidCoupons'
     */
    @Test
    public void invalidCouponsTest() {
        // TODO: test invalidCoupons
    }

    /**
     * Test the property 'suggestedDiscounts'
     */
    @Test
    public void suggestedDiscountsTest() {
        // TODO: test suggestedDiscounts
    }

    /**
     * Test the property 'discountThresholdMessages'
     */
    @Test
    public void discountThresholdMessagesTest() {
        // TODO: test discountThresholdMessages
    }

    /**
     * Test the property 'dutyTotal'
     */
    @Test
    public void dutyTotalTest() {
        // TODO: test dutyTotal
    }

    /**
     * Test the property 'feeTotal'
     */
    @Test
    public void feeTotalTest() {
        // TODO: test feeTotal
    }

    /**
     * Test the property 'subTotal'
     */
    @Test
    public void subTotalTest() {
        // TODO: test subTotal
    }

    /**
     * Test the property 'itemLevelProductDiscountTotal'
     */
    @Test
    public void itemLevelProductDiscountTotalTest() {
        // TODO: test itemLevelProductDiscountTotal
    }

    /**
     * Test the property 'orderLevelProductDiscountTotal'
     */
    @Test
    public void orderLevelProductDiscountTotalTest() {
        // TODO: test orderLevelProductDiscountTotal
    }

    /**
     * Test the property 'itemTaxTotal'
     */
    @Test
    public void itemTaxTotalTest() {
        // TODO: test itemTaxTotal
    }

    /**
     * Test the property 'itemTotal'
     */
    @Test
    public void itemTotalTest() {
        // TODO: test itemTotal
    }

    /**
     * Test the property 'shippingSubTotal'
     */
    @Test
    public void shippingSubTotalTest() {
        // TODO: test shippingSubTotal
    }

    /**
     * Test the property 'itemLevelShippingDiscountTotal'
     */
    @Test
    public void itemLevelShippingDiscountTotalTest() {
        // TODO: test itemLevelShippingDiscountTotal
    }

    /**
     * Test the property 'orderLevelShippingDiscountTotal'
     */
    @Test
    public void orderLevelShippingDiscountTotalTest() {
        // TODO: test orderLevelShippingDiscountTotal
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
     * Test the property 'handlingSubTotal'
     */
    @Test
    public void handlingSubTotalTest() {
        // TODO: test handlingSubTotal
    }

    /**
     * Test the property 'itemLevelHandlingDiscountTotal'
     */
    @Test
    public void itemLevelHandlingDiscountTotalTest() {
        // TODO: test itemLevelHandlingDiscountTotal
    }

    /**
     * Test the property 'orderLevelHandlingDiscountTotal'
     */
    @Test
    public void orderLevelHandlingDiscountTotalTest() {
        // TODO: test orderLevelHandlingDiscountTotal
    }

    /**
     * Test the property 'handlingTaxTotal'
     */
    @Test
    public void handlingTaxTotalTest() {
        // TODO: test handlingTaxTotal
    }

    /**
     * Test the property 'handlingTotal'
     */
    @Test
    public void handlingTotalTest() {
        // TODO: test handlingTotal
    }

    /**
     * Test the property 'total'
     */
    @Test
    public void totalTest() {
        // TODO: test total
    }

}
