/*
 * Kibo Catalog Admin Services
 * OpenAPI Spec for Kibo Catalog Admin Services
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.catalogadministration.api;

import com.kibocommerce.sdk.common.ApiException;
import com.kibocommerce.sdk.catalogadministration.models.AssignedDiscount;
import com.kibocommerce.sdk.catalogadministration.models.Coupon;
import com.kibocommerce.sdk.catalogadministration.models.CouponCollection;
import com.kibocommerce.sdk.catalogadministration.models.CouponSet;
import com.kibocommerce.sdk.catalogadministration.models.CouponSetCollection;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CouponSetsApi
 */
@Disabled
public class CouponSetsApiTest {

    private final CouponSetsApi api = new CouponSetsApi();

    /**
     * Add coupon set
     *
     * Adds a single CouponSet
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addCouponSetTest() throws ApiException {
        CouponSet couponSet = null;
        CouponSet response = api.addCouponSet(couponSet);
        // TODO: test validations
    }

    /**
     * Add coupons
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addCouponsTest() throws ApiException {
        String couponSetCode = null;
        List<Coupon> coupon = null;
        api.addCoupons(couponSetCode, coupon);
        // TODO: test validations
    }

    /**
     * Assign discount
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void assignDiscountTest() throws ApiException {
        String couponSetCode = null;
        AssignedDiscount assignedDiscount = null;
        api.assignDiscount(couponSetCode, assignedDiscount);
        // TODO: test validations
    }

    /**
     * Delete coupon
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteCouponTest() throws ApiException {
        String couponSetCode = null;
        String couponCode = null;
        api.deleteCoupon(couponSetCode, couponCode);
        // TODO: test validations
    }

    /**
     * Delete coupon set
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteCouponSetTest() throws ApiException {
        String couponSetCode = null;
        api.deleteCouponSet(couponSetCode);
        // TODO: test validations
    }

    /**
     * Delete coupons
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteCouponsTest() throws ApiException {
        String couponSetCode = null;
        List<String> requestBody = null;
        api.deleteCoupons(couponSetCode, requestBody);
        // TODO: test validations
    }

    /**
     * Get assigned discounts
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAssignedDiscountsTest() throws ApiException {
        String couponSetCode = null;
        List<AssignedDiscount> response = api.getAssignedDiscounts(couponSetCode);
        // TODO: test validations
    }

    /**
     * Get coupon
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCouponTest() throws ApiException {
        String couponSetCode = null;
        String couponCode = null;
        Boolean includeCounts = null;
        String responseGroups = null;
        Coupon response = api.getCoupon(couponSetCode, couponCode, includeCounts, responseGroups);
        // TODO: test validations
    }

    /**
     * Get coupon set
     *
     * Returns a single CouponSet
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCouponSetTest() throws ApiException {
        String couponSetCode = null;
        Boolean includeCounts = null;
        String responseGroups = null;
        CouponSet response = api.getCouponSet(couponSetCode, includeCounts, responseGroups);
        // TODO: test validations
    }

    /**
     * Get coupon sets
     *
     * Returns a paged collection of CouponSets
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCouponSetsTest() throws ApiException {
        Integer startIndex = null;
        Integer pageSize = null;
        String sortBy = null;
        String filter = null;
        Boolean includeCounts = null;
        String responseGroups = null;
        CouponSetCollection response = api.getCouponSets(startIndex, pageSize, sortBy, filter, includeCounts, responseGroups);
        // TODO: test validations
    }

    /**
     * Get coupons
     *
     * Returns a paged collection of Coupons
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCouponsTest() throws ApiException {
        String couponSetCode = null;
        Integer startIndex = null;
        Integer pageSize = null;
        String sortBy = null;
        String filter = null;
        Boolean includeCounts = null;
        String responseGroups = null;
        CouponCollection response = api.getCoupons(couponSetCode, startIndex, pageSize, sortBy, filter, includeCounts, responseGroups);
        // TODO: test validations
    }

    /**
     * Get unique coupon set code
     *
     * Returns a random 4 character code that is unique as a coupon set code.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUniqueCouponSetCodeTest() throws ApiException {
        String response = api.getUniqueCouponSetCode();
        // TODO: test validations
    }

    /**
     * UnAssign discount
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void unAssignDiscountTest() throws ApiException {
        String couponSetCode = null;
        Integer discountId = null;
        api.unAssignDiscount(couponSetCode, discountId);
        // TODO: test validations
    }

    /**
     * Update coupon set
     *
     * Update a CouponSet.     You can not update the Code or ID once the set is created.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateCouponSetTest() throws ApiException {
        String couponSetCode = null;
        CouponSet couponSet = null;
        CouponSet response = api.updateCouponSet(couponSetCode, couponSet);
        // TODO: test validations
    }

    /**
     * Validate unique coupon set code
     *
     *  Tests code for uniqueness and validity.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void validateUniqueCouponSetCodeTest() throws ApiException {
        String code = null;
        api.validateUniqueCouponSetCode(code);
        // TODO: test validations
    }

}
