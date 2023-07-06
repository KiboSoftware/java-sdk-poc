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
import com.kibocommerce.sdk.commerce.models.Wishlist;
import com.kibocommerce.sdk.commerce.models.WishlistCollection;
import com.kibocommerce.sdk.commerce.models.WishlistItem;
import com.kibocommerce.sdk.commerce.models.WishlistItemCollection;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WishlistApi
 */
@Disabled
public class WishlistApiTest {

    private final WishlistApi api = new WishlistApi();

    /**
     * Add Item To Wishlist
     *
     * Adds an item to the wishlist of the current shopper.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addItemToWishlistTest() throws ApiException {
        String wishlistId = null;
        WishlistItem wishlistItem = null;
        WishlistItem response = api.addItemToWishlist(wishlistId, wishlistItem);
        // TODO: test validations
    }

    /**
     * Create Wishlist
     *
     * Create wishlist.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createWishlistTest() throws ApiException {
        Wishlist wishlist = null;
        Wishlist response = api.createWishlist(wishlist);
        // TODO: test validations
    }

    /**
     * Deletes Wishlist
     *
     * Deletes a wishlist specified by wishlist Id.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteWishlistTest() throws ApiException {
        String wishlistId = null;
        api.deleteWishlist(wishlistId);
        // TODO: test validations
    }

    /**
     * Delete Wishlist Item
     *
     * Delete/remove wishlist item.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteWishlistItemTest() throws ApiException {
        String wishlistId = null;
        String wishlistItemId = null;
        api.deleteWishlistItem(wishlistId, wishlistItemId);
        // TODO: test validations
    }

    /**
     * Get Wishlist
     *
     * Retrieves the details of a wishlist specified by the wishlist ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getWishlistTest() throws ApiException {
        String wishlistId = null;
        Wishlist response = api.getWishlist(wishlistId);
        // TODO: test validations
    }

    /**
     * Get Wishlist By Name
     *
     * Retrieves wishlist by name.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getWishlistByNameTest() throws ApiException {
        Integer customerAccountId = null;
        String wishlistName = null;
        Wishlist response = api.getWishlistByName(customerAccountId, wishlistName);
        // TODO: test validations
    }

    /**
     * Get Wishlist Item
     *
     * Retrieves an individual wishlist item from a wishlist.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getWishlistItemTest() throws ApiException {
        String wishlistId = null;
        String wishlistItemId = null;
        WishlistItem response = api.getWishlistItem(wishlistId, wishlistItemId);
        // TODO: test validations
    }

    /**
     * Get Wishlist Items
     *
     * Returns a listing of wishlists.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getWishlistItemsTest() throws ApiException {
        String wishlistId = null;
        Integer startIndex = null;
        Integer pageSize = null;
        String sortBy = null;
        String filter = null;
        WishlistItemCollection response = api.getWishlistItems(wishlistId, startIndex, pageSize, sortBy, filter);
        // TODO: test validations
    }

    /**
     * Get Wishlist Items By WishlistName
     *
     * Returns a listing of wishlists.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getWishlistItemsByWishlistNameTest() throws ApiException {
        Integer customerAccountId = null;
        String wishlistName = null;
        Integer startIndex = null;
        Integer pageSize = null;
        String sortBy = null;
        String filter = null;
        WishlistItemCollection response = api.getWishlistItemsByWishlistName(customerAccountId, wishlistName, startIndex, pageSize, sortBy, filter);
        // TODO: test validations
    }

    /**
     * Get Wishlists
     *
     * Retrieves a list of wishlists according to any specified filter criteria and sort options.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getWishlistsTest() throws ApiException {
        Integer startIndex = null;
        Integer pageSize = null;
        String sortBy = null;
        String filter = null;
        String q = null;
        Integer qLimit = null;
        WishlistCollection response = api.getWishlists(startIndex, pageSize, sortBy, filter, q, qLimit);
        // TODO: test validations
    }

    /**
     * Remove All Wishlist Items
     *
     * Clears all items in the wishlist.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeAllWishlistItemsTest() throws ApiException {
        String wishlistId = null;
        Wishlist response = api.removeAllWishlistItems(wishlistId);
        // TODO: test validations
    }

    /**
     * Update Wishlist
     *
     * Updates a wishlist specified by wishlist Id.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateWishlistTest() throws ApiException {
        String wishlistId = null;
        Wishlist wishlist = null;
        Wishlist response = api.updateWishlist(wishlistId, wishlist);
        // TODO: test validations
    }

    /**
     * Update Wishlist Item
     *
     * Updates a wishlist item.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateWishlistItemTest() throws ApiException {
        String wishlistId = null;
        String wishlistItemId = null;
        WishlistItem wishlistItem = null;
        WishlistItem response = api.updateWishlistItem(wishlistId, wishlistItemId, wishlistItem);
        // TODO: test validations
    }

    /**
     * Update Wishlist Item Quantity
     *
     * Updates the quantity of an item in the wishlist.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateWishlistItemQuantityTest() throws ApiException {
        String wishlistId = null;
        String wishlistItemId = null;
        Integer quantity = null;
        WishlistItem response = api.updateWishlistItemQuantity(wishlistId, wishlistItemId, quantity);
        // TODO: test validations
    }

}
