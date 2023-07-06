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
import com.kibocommerce.sdk.commerce.models.Cart;
import com.kibocommerce.sdk.commerce.models.CartChangeMessageCollection;
import com.kibocommerce.sdk.commerce.models.CartItem;
import com.kibocommerce.sdk.commerce.models.CartItemCollection;
import com.kibocommerce.sdk.commerce.models.CartSummary;
import com.kibocommerce.sdk.commerce.models.ExtendedProperty;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CartApi
 */
@Disabled
public class CartApiTest {

    private final CartApi api = new CartApi();

    /**
     * Adds extended properties
     *
     * Add Extended Properties on the current cart. Store an arbitrary number of cart extended properties such as tracking strings, marketing sources, affiliates, sales personnel/data, and so on, on a per cart basis. Each cart may have none, one, or more than one entry in the extended properties collection, and all values in the extended properties collection are represented as strings. When you create an order from a cart, all extended properties are retained from the cart and copied to the order.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addExtendedPropertiesTest() throws ApiException {
        List<ExtendedProperty> extendedProperty = null;
        List<ExtendedProperty> response = api.addExtendedProperties(extendedProperty);
        // TODO: test validations
    }

    /**
     * Add Item To Cart
     *
     * Adds a product or other item to the cart of the current shopper.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addItemToCartTest() throws ApiException {
        String zipCode = null;
        CartItem cartItem = null;
        CartItem response = api.addItemToCart(zipCode, cartItem);
        // TODO: test validations
    }

    /**
     * Add Item To Cart By CartId
     *
     * \&quot;Adds a product or a cart item to the cart specified by the cart ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addItemToCartByCartIdTest() throws ApiException {
        String cartId = null;
        String zipCode = null;
        CartItem cartItem = null;
        CartItem response = api.addItemToCartByCartId(cartId, zipCode, cartItem);
        // TODO: test validations
    }

    /**
     * Add Items To Cart
     *
     * Adds multiple cart items to the cart of the current shopper.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addItemsToCartTest() throws ApiException {
        Boolean throwErrorOnInvalidItems = null;
        String zipCode = null;
        List<CartItem> cartItem = null;
        api.addItemsToCart(throwErrorOnInvalidItems, zipCode, cartItem);
        // TODO: test validations
    }

    /**
     * Add Items To Cart By CartId
     *
     * Adds multiple cart items to the cart specified by cartId.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addItemsToCartByCartIdTest() throws ApiException {
        String cartId = null;
        Boolean throwErrorOnInvalidItems = null;
        String zipCode = null;
        List<CartItem> cartItem = null;
        api.addItemsToCartByCartId(cartId, throwErrorOnInvalidItems, zipCode, cartItem);
        // TODO: test validations
    }

    /**
     * Apply Coupon
     *
     * Apply coupon to the cart.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void applyCouponTest() throws ApiException {
        String cartId = null;
        String couponCode = null;
        Cart response = api.applyCoupon(cartId, couponCode);
        // TODO: test validations
    }

    /**
     * Delete cart
     *
     * Deletes the cart by cart ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteCartTest() throws ApiException {
        String cartId = null;
        api.deleteCart(cartId);
        // TODO: test validations
    }

    /**
     * Delete Cart Item
     *
     * Removes a particular cart item from the cart of the current shopper.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteCartItemTest() throws ApiException {
        String cartItemId = null;
        api.deleteCartItem(cartItemId);
        // TODO: test validations
    }

    /**
     * Delete Cart Item By CartId
     *
     * Removes a particular cart item from the cart specified by cart item Id and cart Id.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteCartItemByCartIdTest() throws ApiException {
        String cartId = null;
        String cartItemId = null;
        api.deleteCartItemByCartId(cartId, cartItemId);
        // TODO: test validations
    }

    /**
     * Delete Current Cart
     *
     * eletes the cart of the current shopper.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteCurrentCartTest() throws ApiException {
        api.deleteCurrentCart();
        // TODO: test validations
    }

    /**
     * Delete extended properties.
     *
     * Delete extended properties on the current cart.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteExtendedPropertiesTest() throws ApiException {
        List<String> requestBody = null;
        api.deleteExtendedProperties(requestBody);
        // TODO: test validations
    }

    /**
     * Delete Extended Property
     *
     * Delete extended property on the current cart using the key.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteExtendedPropertyTest() throws ApiException {
        String key = null;
        api.deleteExtendedProperty(key);
        // TODO: test validations
    }

    /**
     * Delete User Cart
     *
     * Deletes the cart of the user by user ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteUserCartTest() throws ApiException {
        String userId = null;
        api.deleteUserCart(userId);
        // TODO: test validations
    }

    /**
     * Get Cart
     *
     * Retrieves the details of the cart specified by cart ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCartTest() throws ApiException {
        String cartId = null;
        Cart response = api.getCart(cartId);
        // TODO: test validations
    }

    /**
     * Get Cart Item
     *
     * Retrieves an individual cart item from the cart of the current shopper specified by its cart item Id.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCartItemTest() throws ApiException {
        String cartItemId = null;
        CartItem response = api.getCartItem(cartItemId);
        // TODO: test validations
    }

    /**
     * Get Cart Item By CartId
     *
     * Retrieves an individual cart item from the cart by cart Id and cart item Id.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCartItemByCartIdTest() throws ApiException {
        String cartId = null;
        String cartItemId = null;
        CartItem response = api.getCartItemByCartId(cartId, cartItemId);
        // TODO: test validations
    }

    /**
     * Get Cart Items
     *
     * Retrieves the details of each cart item such as the product name, stock count, unit price, discounts, quantity ordered and total price
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCartItemsTest() throws ApiException {
        CartItemCollection response = api.getCartItems();
        // TODO: test validations
    }

    /**
     * Get Cart Items By CartId
     *
     * Retrieves the details of each cart item such as the product name, stock count, unit price, discounts, quantity ordered and total price for the cart by cartId.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCartItemsByCartIdTest() throws ApiException {
        String cartId = null;
        CartItemCollection response = api.getCartItemsByCartId(cartId);
        // TODO: test validations
    }

    /**
     * Get Cart Summary
     *
     * Retrieves the number of items in the active cart, total cost of items in the cart and the cart expiration. (Anonymous shoppers cart expires in 14 days.)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCartSummaryTest() throws ApiException {
        CartSummary response = api.getCartSummary();
        // TODO: test validations
    }

    /**
     * Get Cart Summary By Cart Id
     *
     * Retrieves the number of items in the specified cart, total cost of items in the cart, and whether the cart has expired by cartId. All anonymous idle carts that do not proceed to checkout expire after 14 days.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCartSummaryByCartIdTest() throws ApiException {
        String cartId = null;
        CartSummary response = api.getCartSummaryByCartId(cartId);
        // TODO: test validations
    }

    /**
     * Get Extended Properties
     *
     * Get extended properties on a cart.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getExtendedPropertiesTest() throws ApiException {
        List<ExtendedProperty> response = api.getExtendedProperties();
        // TODO: test validations
    }

    /**
     * Get Messages
     *
     * Retrieves messages to and from the current shopper. These are messages supplied by the system to notify the shopper of price increases or decreases or product unavailability.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getMessagesTest() throws ApiException {
        CartChangeMessageCollection response = api.getMessages();
        // TODO: test validations
    }

    /**
     * Get Or Create Cart
     *
     * Retrieves a cart&#39;s contents for the current shopper.  If the shopper does not have an active cart on the site, one is created.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getOrCreateCartTest() throws ApiException {
        Cart response = api.getOrCreateCart();
        // TODO: test validations
    }

    /**
     * Get Or Create User Cart
     *
     * Get the current cart or create a new cart for the user specified by user ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getOrCreateUserCartTest() throws ApiException {
        String userId = null;
        Cart response = api.getOrCreateUserCart(userId);
        // TODO: test validations
    }

    /**
     * Get User Cart
     *
     * Retrieves the details of the user&#39;s cart from the user ID.Shoppers are not allowed to execute this call. If this ever changes, then auth logic will need to be added
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUserCartTest() throws ApiException {
        String userId = null;
        Cart response = api.getUserCart(userId);
        // TODO: test validations
    }

    /**
     * Get User Cart Summary
     *
     * Retrieves the number of items in the active cart, total cost of items in the cart and the cart expiration by userId. All anonymous idle carts that do not proceed to checkout expire after 14 days.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUserCartSummaryTest() throws ApiException {
        String userId = null;
        CartSummary response = api.getUserCartSummary(userId);
        // TODO: test validations
    }

    /**
     * Reject Suggested Discount
     *
     * Reject Suggested Discount
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void rejectSuggestedDiscountTest() throws ApiException {
        String cartId = null;
        Integer discountId = null;
        Cart response = api.rejectSuggestedDiscount(cartId, discountId);
        // TODO: test validations
    }

    /**
     * Remove All Cart Items
     *
     * Clears all the cart items from the cart of a current shopper.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeAllCartItemsTest() throws ApiException {
        Cart response = api.removeAllCartItems();
        // TODO: test validations
    }

    /**
     * Remove All Cart Items By CartId
     *
     * Clears all the cart items from the cart by the cartId.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeAllCartItemsByCartIdTest() throws ApiException {
        String cartId = null;
        Cart response = api.removeAllCartItemsByCartId(cartId);
        // TODO: test validations
    }

    /**
     * Remove All Messages
     *
     * Removes all messages associated with the cart of the current shopper.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeAllMessagesTest() throws ApiException {
        api.removeAllMessages();
        // TODO: test validations
    }

    /**
     * Remove Coupon
     *
     * Remove Coupon
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeCouponTest() throws ApiException {
        String cartId = null;
        String couponCode = null;
        Cart response = api.removeCoupon(cartId, couponCode);
        // TODO: test validations
    }

    /**
     * Remove Coupons
     *
     * Removes all coupons that had been previously applied to the cart.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeCouponsTest() throws ApiException {
        String cartId = null;
        Cart response = api.removeCoupons(cartId);
        // TODO: test validations
    }

    /**
     * Remove Message
     *
     * Removes a single message associated with the cart of the current shopper specified by messageId.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeMessageTest() throws ApiException {
        String messageId = null;
        api.removeMessage(messageId);
        // TODO: test validations
    }

    /**
     * Update Cart
     *
     * Updates the cart of the current shopper.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateCartTest() throws ApiException {
        Cart cart = null;
        Cart response = api.updateCart(cart);
        // TODO: test validations
    }

    /**
     * Update Cart By Cart Id
     *
     * Updates the cart specified by cart ID
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateCartByCartIdTest() throws ApiException {
        String cartId = null;
        Cart cart = null;
        Cart response = api.updateCartByCartId(cartId, cart);
        // TODO: test validations
    }

    /**
     * Update Cart Item
     *
     * Updates a particular cart item in the cart of the current shopper.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateCartItemTest() throws ApiException {
        String cartItemId = null;
        String zipCode = null;
        CartItem cartItem = null;
        CartItem response = api.updateCartItem(cartItemId, zipCode, cartItem);
        // TODO: test validations
    }

    /**
     * Update Cart Item By CartId
     *
     * Updates a particular cart item in the cart specified by card Id.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateCartItemByCartIdTest() throws ApiException {
        String cartId = null;
        String cartItemId = null;
        String zipCode = null;
        CartItem cartItem = null;
        CartItem response = api.updateCartItemByCartId(cartId, cartItemId, zipCode, cartItem);
        // TODO: test validations
    }

    /**
     * Update Cart Item Quantity
     *
     * Updates the quantity of an individual cart item in the cart of the current shopper.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateCartItemQuantityTest() throws ApiException {
        String cartItemId = null;
        Integer quantity = null;
        CartItem response = api.updateCartItemQuantity(cartItemId, quantity);
        // TODO: test validations
    }

    /**
     * Update Cart Item Quantity By CartId
     *
     * Updates the quantity of an individual cart item in the cart specified by cart Id.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateCartItemQuantityByCartIdTest() throws ApiException {
        String cartId = null;
        String cartItemId = null;
        Integer quantity = null;
        CartItem response = api.updateCartItemQuantityByCartId(cartId, cartItemId, quantity);
        // TODO: test validations
    }

    /**
     * Update Extended Properties
     *
     * Update extended properties on the current cart.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateExtendedPropertiesTest() throws ApiException {
        Boolean upsert = null;
        List<ExtendedProperty> extendedProperty = null;
        List<ExtendedProperty> response = api.updateExtendedProperties(upsert, extendedProperty);
        // TODO: test validations
    }

    /**
     * Update extended property
     *
     * Update extended property on the current cart using the key.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateExtendedPropertyTest() throws ApiException {
        String key = null;
        Boolean upsert = null;
        ExtendedProperty extendedProperty = null;
        ExtendedProperty response = api.updateExtendedProperty(key, upsert, extendedProperty);
        // TODO: test validations
    }

    /**
     * Update User Cart
     *
     * Updates the cart of the user specified by user ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateUserCartTest() throws ApiException {
        String userId = null;
        Cart cart = null;
        Cart response = api.updateUserCart(userId, cart);
        // TODO: test validations
    }

}