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

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.kibocommerce.sdk.common.JSON;

/**
 * Cart summary, which is the number of items in the active cart, total cost of items in the cart, and whether the cart has expired.
 */
@ApiModel(description = "Cart summary, which is the number of items in the active cart, total cost of items in the cart, and whether the cart has expired.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CartSummary implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ITEM_COUNT = "itemCount";
  @SerializedName(SERIALIZED_NAME_ITEM_COUNT)
  private Integer itemCount;

  public static final String SERIALIZED_NAME_TOTAL_QUANTITY = "totalQuantity";
  @SerializedName(SERIALIZED_NAME_TOTAL_QUANTITY)
  private Integer totalQuantity;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Double total;

  public static final String SERIALIZED_NAME_IS_EXPIRED = "isExpired";
  @SerializedName(SERIALIZED_NAME_IS_EXPIRED)
  private Boolean isExpired;

  public static final String SERIALIZED_NAME_HAS_ACTIVE_CART = "hasActiveCart";
  @SerializedName(SERIALIZED_NAME_HAS_ACTIVE_CART)
  private Boolean hasActiveCart;

  public CartSummary() {
  }

  public CartSummary itemCount(Integer itemCount) {
    
    this.itemCount = itemCount;
    return this;
  }

   /**
   * Number of items in the active cart.
   * @return itemCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of items in the active cart.")

  public Integer getItemCount() {
    return itemCount;
  }


  public void setItemCount(Integer itemCount) {
    this.itemCount = itemCount;
  }


  public CartSummary totalQuantity(Integer totalQuantity) {
    
    this.totalQuantity = totalQuantity;
    return this;
  }

   /**
   * Total quantity of all items in the cart
   * @return totalQuantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total quantity of all items in the cart")

  public Integer getTotalQuantity() {
    return totalQuantity;
  }


  public void setTotalQuantity(Integer totalQuantity) {
    this.totalQuantity = totalQuantity;
  }


  public CartSummary total(Double total) {
    
    this.total = total;
    return this;
  }

   /**
   * Total cost of items in the active cart.
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total cost of items in the active cart.")

  public Double getTotal() {
    return total;
  }


  public void setTotal(Double total) {
    this.total = total;
  }


  public CartSummary isExpired(Boolean isExpired) {
    
    this.isExpired = isExpired;
    return this;
  }

   /**
   * If true, the cart has reached its expiration date (Cart.ExpirationDate) and considered abandoned.   Carts of anonymous shoppers expire after 14 days of inactivity.
   * @return isExpired
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If true, the cart has reached its expiration date (Cart.ExpirationDate) and considered abandoned.   Carts of anonymous shoppers expire after 14 days of inactivity.")

  public Boolean getIsExpired() {
    return isExpired;
  }


  public void setIsExpired(Boolean isExpired) {
    this.isExpired = isExpired;
  }


  public CartSummary hasActiveCart(Boolean hasActiveCart) {
    
    this.hasActiveCart = hasActiveCart;
    return this;
  }

   /**
   * If true, the cart is active. A shopper has added an item to a cart.
   * @return hasActiveCart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If true, the cart is active. A shopper has added an item to a cart.")

  public Boolean getHasActiveCart() {
    return hasActiveCart;
  }


  public void setHasActiveCart(Boolean hasActiveCart) {
    this.hasActiveCart = hasActiveCart;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartSummary cartSummary = (CartSummary) o;
    return Objects.equals(this.itemCount, cartSummary.itemCount) &&
        Objects.equals(this.totalQuantity, cartSummary.totalQuantity) &&
        Objects.equals(this.total, cartSummary.total) &&
        Objects.equals(this.isExpired, cartSummary.isExpired) &&
        Objects.equals(this.hasActiveCart, cartSummary.hasActiveCart);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemCount, totalQuantity, total, isExpired, hasActiveCart);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartSummary {\n");
    sb.append("    itemCount: ").append(toIndentedString(itemCount)).append("\n");
    sb.append("    totalQuantity: ").append(toIndentedString(totalQuantity)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    isExpired: ").append(toIndentedString(isExpired)).append("\n");
    sb.append("    hasActiveCart: ").append(toIndentedString(hasActiveCart)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("itemCount");
    openapiFields.add("totalQuantity");
    openapiFields.add("total");
    openapiFields.add("isExpired");
    openapiFields.add("hasActiveCart");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CartSummary
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CartSummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CartSummary is not found in the empty JSON string", CartSummary.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!CartSummary.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CartSummary` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CartSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CartSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CartSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CartSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<CartSummary>() {
           @Override
           public void write(JsonWriter out, CartSummary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CartSummary read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CartSummary given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CartSummary
  * @throws IOException if the JSON string is invalid with respect to CartSummary
  */
  public static CartSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CartSummary.class);
  }

 /**
  * Convert an instance of CartSummary to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

