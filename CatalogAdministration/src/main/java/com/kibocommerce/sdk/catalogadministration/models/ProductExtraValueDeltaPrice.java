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


package com.kibocommerce.sdk.catalogadministration.models;

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
 * How much a product option costs above the cost of the base product, if at all.
 */
@ApiModel(description = "How much a product option costs above the cost of the base product, if at all.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ProductExtraValueDeltaPrice implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currencyCode";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;

  public static final String SERIALIZED_NAME_DELTA_PRICE = "deltaPrice";
  @SerializedName(SERIALIZED_NAME_DELTA_PRICE)
  private Double deltaPrice;

  public ProductExtraValueDeltaPrice() {
  }

  public ProductExtraValueDeltaPrice currencyCode(String currencyCode) {
    
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Which currency to use.
   * @return currencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Which currency to use.")

  public String getCurrencyCode() {
    return currencyCode;
  }


  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  public ProductExtraValueDeltaPrice deltaPrice(Double deltaPrice) {
    
    this.deltaPrice = deltaPrice;
    return this;
  }

   /**
   * Amount of money saved when discounts are applied.
   * @return deltaPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Amount of money saved when discounts are applied.")

  public Double getDeltaPrice() {
    return deltaPrice;
  }


  public void setDeltaPrice(Double deltaPrice) {
    this.deltaPrice = deltaPrice;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductExtraValueDeltaPrice productExtraValueDeltaPrice = (ProductExtraValueDeltaPrice) o;
    return Objects.equals(this.currencyCode, productExtraValueDeltaPrice.currencyCode) &&
        Objects.equals(this.deltaPrice, productExtraValueDeltaPrice.deltaPrice);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCode, deltaPrice);
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
    sb.append("class ProductExtraValueDeltaPrice {\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    deltaPrice: ").append(toIndentedString(deltaPrice)).append("\n");
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
    openapiFields.add("currencyCode");
    openapiFields.add("deltaPrice");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProductExtraValueDeltaPrice
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ProductExtraValueDeltaPrice.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductExtraValueDeltaPrice is not found in the empty JSON string", ProductExtraValueDeltaPrice.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!ProductExtraValueDeltaPrice.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProductExtraValueDeltaPrice` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("currencyCode") != null && !jsonObj.get("currencyCode").isJsonNull()) && !jsonObj.get("currencyCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currencyCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currencyCode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductExtraValueDeltaPrice.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductExtraValueDeltaPrice' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductExtraValueDeltaPrice> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductExtraValueDeltaPrice.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductExtraValueDeltaPrice>() {
           @Override
           public void write(JsonWriter out, ProductExtraValueDeltaPrice value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductExtraValueDeltaPrice read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProductExtraValueDeltaPrice given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductExtraValueDeltaPrice
  * @throws IOException if the JSON string is invalid with respect to ProductExtraValueDeltaPrice
  */
  public static ProductExtraValueDeltaPrice fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductExtraValueDeltaPrice.class);
  }

 /**
  * Convert an instance of ProductExtraValueDeltaPrice to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

