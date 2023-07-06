/*
 * Kibo Catalog Runtime Services
 * OpenAPI Spec for Kibo Catalog Runtime Services
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.catalogstorefront.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kibocommerce.sdk.catalogstorefront.models.CatalogRuntimesDiscount;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
 * Discount applied to the product.
 */
@ApiModel(description = "Discount applied to the product.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CatalogRuntimesAppliedDiscount implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_COUPON_CODE = "couponCode";
  @SerializedName(SERIALIZED_NAME_COUPON_CODE)
  private String couponCode;

  public static final String SERIALIZED_NAME_DISCOUNT = "discount";
  @SerializedName(SERIALIZED_NAME_DISCOUNT)
  private CatalogRuntimesDiscount discount;

  public static final String SERIALIZED_NAME_DISCOUNTS = "discounts";
  @SerializedName(SERIALIZED_NAME_DISCOUNTS)
  private List<CatalogRuntimesDiscount> discounts = null;

  public static final String SERIALIZED_NAME_IMPACT = "impact";
  @SerializedName(SERIALIZED_NAME_IMPACT)
  private Double impact;

  public CatalogRuntimesAppliedDiscount() {
  }

  public CatalogRuntimesAppliedDiscount couponCode(String couponCode) {
    
    this.couponCode = couponCode;
    return this;
  }

   /**
   * If the discount is a coupon, code associated with the coupon.
   * @return couponCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If the discount is a coupon, code associated with the coupon.")

  public String getCouponCode() {
    return couponCode;
  }


  public void setCouponCode(String couponCode) {
    this.couponCode = couponCode;
  }


  public CatalogRuntimesAppliedDiscount discount(CatalogRuntimesDiscount discount) {
    
    this.discount = discount;
    return this;
  }

   /**
   * Get discount
   * @return discount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CatalogRuntimesDiscount getDiscount() {
    return discount;
  }


  public void setDiscount(CatalogRuntimesDiscount discount) {
    this.discount = discount;
  }


  public CatalogRuntimesAppliedDiscount discounts(List<CatalogRuntimesDiscount> discounts) {
    
    this.discounts = discounts;
    return this;
  }

  public CatalogRuntimesAppliedDiscount addDiscountsItem(CatalogRuntimesDiscount discountsItem) {
    if (this.discounts == null) {
      this.discounts = new ArrayList<>();
    }
    this.discounts.add(discountsItem);
    return this;
  }

   /**
   * Discount name and expiration date.
   * @return discounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Discount name and expiration date.")

  public List<CatalogRuntimesDiscount> getDiscounts() {
    return discounts;
  }


  public void setDiscounts(List<CatalogRuntimesDiscount> discounts) {
    this.discounts = discounts;
  }


  public CatalogRuntimesAppliedDiscount impact(Double impact) {
    
    this.impact = impact;
    return this;
  }

   /**
   * The new calculated price of the product. That is, the product price minus the discount amount.
   * @return impact
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The new calculated price of the product. That is, the product price minus the discount amount.")

  public Double getImpact() {
    return impact;
  }


  public void setImpact(Double impact) {
    this.impact = impact;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogRuntimesAppliedDiscount catalogRuntimesAppliedDiscount = (CatalogRuntimesAppliedDiscount) o;
    return Objects.equals(this.couponCode, catalogRuntimesAppliedDiscount.couponCode) &&
        Objects.equals(this.discount, catalogRuntimesAppliedDiscount.discount) &&
        Objects.equals(this.discounts, catalogRuntimesAppliedDiscount.discounts) &&
        Objects.equals(this.impact, catalogRuntimesAppliedDiscount.impact);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(couponCode, discount, discounts, impact);
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
    sb.append("class CatalogRuntimesAppliedDiscount {\n");
    sb.append("    couponCode: ").append(toIndentedString(couponCode)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    discounts: ").append(toIndentedString(discounts)).append("\n");
    sb.append("    impact: ").append(toIndentedString(impact)).append("\n");
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
    openapiFields.add("couponCode");
    openapiFields.add("discount");
    openapiFields.add("discounts");
    openapiFields.add("impact");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CatalogRuntimesAppliedDiscount
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CatalogRuntimesAppliedDiscount.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CatalogRuntimesAppliedDiscount is not found in the empty JSON string", CatalogRuntimesAppliedDiscount.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!CatalogRuntimesAppliedDiscount.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CatalogRuntimesAppliedDiscount` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("couponCode") != null && !jsonObj.get("couponCode").isJsonNull()) && !jsonObj.get("couponCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `couponCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("couponCode").toString()));
      }
      // validate the optional field `discount`
      if (jsonObj.get("discount") != null && !jsonObj.get("discount").isJsonNull()) {
        CatalogRuntimesDiscount.validateJsonObject(jsonObj.getAsJsonObject("discount"));
      }
      if (jsonObj.get("discounts") != null && !jsonObj.get("discounts").isJsonNull()) {
        JsonArray jsonArraydiscounts = jsonObj.getAsJsonArray("discounts");
        if (jsonArraydiscounts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("discounts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `discounts` to be an array in the JSON string but got `%s`", jsonObj.get("discounts").toString()));
          }

          // validate the optional field `discounts` (array)
          for (int i = 0; i < jsonArraydiscounts.size(); i++) {
            CatalogRuntimesDiscount.validateJsonObject(jsonArraydiscounts.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CatalogRuntimesAppliedDiscount.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CatalogRuntimesAppliedDiscount' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CatalogRuntimesAppliedDiscount> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CatalogRuntimesAppliedDiscount.class));

       return (TypeAdapter<T>) new TypeAdapter<CatalogRuntimesAppliedDiscount>() {
           @Override
           public void write(JsonWriter out, CatalogRuntimesAppliedDiscount value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CatalogRuntimesAppliedDiscount read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CatalogRuntimesAppliedDiscount given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CatalogRuntimesAppliedDiscount
  * @throws IOException if the JSON string is invalid with respect to CatalogRuntimesAppliedDiscount
  */
  public static CatalogRuntimesAppliedDiscount fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CatalogRuntimesAppliedDiscount.class);
  }

 /**
  * Convert an instance of CatalogRuntimesAppliedDiscount to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

