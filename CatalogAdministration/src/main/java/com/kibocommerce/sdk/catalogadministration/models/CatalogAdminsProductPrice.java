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
import java.time.OffsetDateTime;
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
 * Price of the product and currency used.
 */
@ApiModel(description = "Price of the product and currency used.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CatalogAdminsProductPrice implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ISO_CURRENCY_CODE = "isoCurrencyCode";
  @SerializedName(SERIALIZED_NAME_ISO_CURRENCY_CODE)
  private String isoCurrencyCode;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Double price;

  public static final String SERIALIZED_NAME_SALE_PRICE = "salePrice";
  @SerializedName(SERIALIZED_NAME_SALE_PRICE)
  private Double salePrice;

  public static final String SERIALIZED_NAME_MSRP = "msrp";
  @SerializedName(SERIALIZED_NAME_MSRP)
  private Double msrp;

  public static final String SERIALIZED_NAME_MAP = "map";
  @SerializedName(SERIALIZED_NAME_MAP)
  private Double map;

  public static final String SERIALIZED_NAME_MAP_START_DATE = "mapStartDate";
  @SerializedName(SERIALIZED_NAME_MAP_START_DATE)
  private OffsetDateTime mapStartDate;

  public static final String SERIALIZED_NAME_MAP_END_DATE = "mapEndDate";
  @SerializedName(SERIALIZED_NAME_MAP_END_DATE)
  private OffsetDateTime mapEndDate;

  public static final String SERIALIZED_NAME_CREDIT_VALUE = "creditValue";
  @SerializedName(SERIALIZED_NAME_CREDIT_VALUE)
  private Double creditValue;

  public CatalogAdminsProductPrice() {
  }

  public CatalogAdminsProductPrice isoCurrencyCode(String isoCurrencyCode) {
    
    this.isoCurrencyCode = isoCurrencyCode;
    return this;
  }

   /**
   * Currency code.
   * @return isoCurrencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Currency code.")

  public String getIsoCurrencyCode() {
    return isoCurrencyCode;
  }


  public void setIsoCurrencyCode(String isoCurrencyCode) {
    this.isoCurrencyCode = isoCurrencyCode;
  }


  public CatalogAdminsProductPrice price(Double price) {
    
    this.price = price;
    return this;
  }

   /**
   * Price of the product. This is the price the merchant intends to sell the product if no sale price is present.
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Price of the product. This is the price the merchant intends to sell the product if no sale price is present.")

  public Double getPrice() {
    return price;
  }


  public void setPrice(Double price) {
    this.price = price;
  }


  public CatalogAdminsProductPrice salePrice(Double salePrice) {
    
    this.salePrice = salePrice;
    return this;
  }

   /**
   * Current sale price of the product. Sale price is a numeric (monetary) amount, not a percentage off.
   * @return salePrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Current sale price of the product. Sale price is a numeric (monetary) amount, not a percentage off.")

  public Double getSalePrice() {
    return salePrice;
  }


  public void setSalePrice(Double salePrice) {
    this.salePrice = salePrice;
  }


  public CatalogAdminsProductPrice msrp(Double msrp) {
    
    this.msrp = msrp;
    return this;
  }

   /**
   * Manufacturer Suggested Retail Price. +
   * @return msrp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Manufacturer Suggested Retail Price. +")

  public Double getMsrp() {
    return msrp;
  }


  public void setMsrp(Double msrp) {
    this.msrp = msrp;
  }


  public CatalogAdminsProductPrice map(Double map) {
    
    this.map = map;
    return this;
  }

   /**
   * Minimum Advertised Price
   * @return map
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Minimum Advertised Price")

  public Double getMap() {
    return map;
  }


  public void setMap(Double map) {
    this.map = map;
  }


  public CatalogAdminsProductPrice mapStartDate(OffsetDateTime mapStartDate) {
    
    this.mapStartDate = mapStartDate;
    return this;
  }

   /**
   * Minimum Advertised Price effective start date (null &#x3D; begining of time)
   * @return mapStartDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Minimum Advertised Price effective start date (null = begining of time)")

  public OffsetDateTime getMapStartDate() {
    return mapStartDate;
  }


  public void setMapStartDate(OffsetDateTime mapStartDate) {
    this.mapStartDate = mapStartDate;
  }


  public CatalogAdminsProductPrice mapEndDate(OffsetDateTime mapEndDate) {
    
    this.mapEndDate = mapEndDate;
    return this;
  }

   /**
   * Minimum Advertised Price effectivity end date (null &#x3D; forever)
   * @return mapEndDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Minimum Advertised Price effectivity end date (null = forever)")

  public OffsetDateTime getMapEndDate() {
    return mapEndDate;
  }


  public void setMapEndDate(OffsetDateTime mapEndDate) {
    this.mapEndDate = mapEndDate;
  }


  public CatalogAdminsProductPrice creditValue(Double creditValue) {
    
    this.creditValue = creditValue;
    return this;
  }

   /**
   * Credit amt of the product
   * @return creditValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Credit amt of the product")

  public Double getCreditValue() {
    return creditValue;
  }


  public void setCreditValue(Double creditValue) {
    this.creditValue = creditValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogAdminsProductPrice catalogAdminsProductPrice = (CatalogAdminsProductPrice) o;
    return Objects.equals(this.isoCurrencyCode, catalogAdminsProductPrice.isoCurrencyCode) &&
        Objects.equals(this.price, catalogAdminsProductPrice.price) &&
        Objects.equals(this.salePrice, catalogAdminsProductPrice.salePrice) &&
        Objects.equals(this.msrp, catalogAdminsProductPrice.msrp) &&
        Objects.equals(this.map, catalogAdminsProductPrice.map) &&
        Objects.equals(this.mapStartDate, catalogAdminsProductPrice.mapStartDate) &&
        Objects.equals(this.mapEndDate, catalogAdminsProductPrice.mapEndDate) &&
        Objects.equals(this.creditValue, catalogAdminsProductPrice.creditValue);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(isoCurrencyCode, price, salePrice, msrp, map, mapStartDate, mapEndDate, creditValue);
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
    sb.append("class CatalogAdminsProductPrice {\n");
    sb.append("    isoCurrencyCode: ").append(toIndentedString(isoCurrencyCode)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    salePrice: ").append(toIndentedString(salePrice)).append("\n");
    sb.append("    msrp: ").append(toIndentedString(msrp)).append("\n");
    sb.append("    map: ").append(toIndentedString(map)).append("\n");
    sb.append("    mapStartDate: ").append(toIndentedString(mapStartDate)).append("\n");
    sb.append("    mapEndDate: ").append(toIndentedString(mapEndDate)).append("\n");
    sb.append("    creditValue: ").append(toIndentedString(creditValue)).append("\n");
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
    openapiFields.add("isoCurrencyCode");
    openapiFields.add("price");
    openapiFields.add("salePrice");
    openapiFields.add("msrp");
    openapiFields.add("map");
    openapiFields.add("mapStartDate");
    openapiFields.add("mapEndDate");
    openapiFields.add("creditValue");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CatalogAdminsProductPrice
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CatalogAdminsProductPrice.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CatalogAdminsProductPrice is not found in the empty JSON string", CatalogAdminsProductPrice.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!CatalogAdminsProductPrice.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CatalogAdminsProductPrice` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("isoCurrencyCode") != null && !jsonObj.get("isoCurrencyCode").isJsonNull()) && !jsonObj.get("isoCurrencyCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `isoCurrencyCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("isoCurrencyCode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CatalogAdminsProductPrice.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CatalogAdminsProductPrice' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CatalogAdminsProductPrice> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CatalogAdminsProductPrice.class));

       return (TypeAdapter<T>) new TypeAdapter<CatalogAdminsProductPrice>() {
           @Override
           public void write(JsonWriter out, CatalogAdminsProductPrice value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CatalogAdminsProductPrice read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CatalogAdminsProductPrice given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CatalogAdminsProductPrice
  * @throws IOException if the JSON string is invalid with respect to CatalogAdminsProductPrice
  */
  public static CatalogAdminsProductPrice fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CatalogAdminsProductPrice.class);
  }

 /**
  * Convert an instance of CatalogAdminsProductPrice to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

