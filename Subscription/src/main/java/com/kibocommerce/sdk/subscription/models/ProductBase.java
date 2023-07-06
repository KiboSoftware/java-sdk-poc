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

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kibocommerce.sdk.subscription.models.CommerceRuntimePackageMeasurements;
import com.kibocommerce.sdk.subscription.models.ProductStock;
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
 * ProductBase
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ProductBase implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_PRODUCT_CODE = "productCode";
  @SerializedName(SERIALIZED_NAME_PRODUCT_CODE)
  private String productCode;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_GOODS_TYPE = "goodsType";
  @SerializedName(SERIALIZED_NAME_GOODS_TYPE)
  private String goodsType;

  public static final String SERIALIZED_NAME_IS_PACKAGED_STAND_ALONE = "isPackagedStandAlone";
  @SerializedName(SERIALIZED_NAME_IS_PACKAGED_STAND_ALONE)
  private Boolean isPackagedStandAlone;

  public static final String SERIALIZED_NAME_STOCK = "stock";
  @SerializedName(SERIALIZED_NAME_STOCK)
  private ProductStock stock;

  public static final String SERIALIZED_NAME_PRODUCT_RESERVATION_ID = "productReservationId";
  @SerializedName(SERIALIZED_NAME_PRODUCT_RESERVATION_ID)
  private Integer productReservationId;

  public static final String SERIALIZED_NAME_ALLOCATION_ID = "allocationId";
  @SerializedName(SERIALIZED_NAME_ALLOCATION_ID)
  private Integer allocationId;

  public static final String SERIALIZED_NAME_ALLOCATION_EXPIRATION = "allocationExpiration";
  @SerializedName(SERIALIZED_NAME_ALLOCATION_EXPIRATION)
  private OffsetDateTime allocationExpiration;

  public static final String SERIALIZED_NAME_MEASUREMENTS = "measurements";
  @SerializedName(SERIALIZED_NAME_MEASUREMENTS)
  private CommerceRuntimePackageMeasurements measurements;

  public static final String SERIALIZED_NAME_FULFILLMENT_STATUS = "fulfillmentStatus";
  @SerializedName(SERIALIZED_NAME_FULFILLMENT_STATUS)
  private String fulfillmentStatus;

  public ProductBase() {
  }

  public ProductBase productCode(String productCode) {
    
    this.productCode = productCode;
    return this;
  }

   /**
   * Merchant-created code that uniquely identifies the product.
   * @return productCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Merchant-created code that uniquely identifies the product.")

  public String getProductCode() {
    return productCode;
  }


  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }


  public ProductBase name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the product, this is the current value of the product&#39;s name in the language specified by LocaleCode.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the product, this is the current value of the product's name in the language specified by LocaleCode.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ProductBase description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Short description of the product in the language specified by LocaleCode.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Short description of the product in the language specified by LocaleCode.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ProductBase goodsType(String goodsType) {
    
    this.goodsType = goodsType;
    return this;
  }

   /**
   * Goods Type
   * @return goodsType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Goods Type")

  public String getGoodsType() {
    return goodsType;
  }


  public void setGoodsType(String goodsType) {
    this.goodsType = goodsType;
  }


  public ProductBase isPackagedStandAlone(Boolean isPackagedStandAlone) {
    
    this.isPackagedStandAlone = isPackagedStandAlone;
    return this;
  }

   /**
   * Indicates that this product ships by itself.
   * @return isPackagedStandAlone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates that this product ships by itself.")

  public Boolean getIsPackagedStandAlone() {
    return isPackagedStandAlone;
  }


  public void setIsPackagedStandAlone(Boolean isPackagedStandAlone) {
    this.isPackagedStandAlone = isPackagedStandAlone;
  }


  public ProductBase stock(ProductStock stock) {
    
    this.stock = stock;
    return this;
  }

   /**
   * Get stock
   * @return stock
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProductStock getStock() {
    return stock;
  }


  public void setStock(ProductStock stock) {
    this.stock = stock;
  }


  public ProductBase productReservationId(Integer productReservationId) {
    
    this.productReservationId = productReservationId;
    return this;
  }

   /**
   * Reservation ID associated with this product in the bundle.
   * @return productReservationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reservation ID associated with this product in the bundle.")

  public Integer getProductReservationId() {
    return productReservationId;
  }


  public void setProductReservationId(Integer productReservationId) {
    this.productReservationId = productReservationId;
  }


  public ProductBase allocationId(Integer allocationId) {
    
    this.allocationId = allocationId;
    return this;
  }

   /**
   * Allocation ID associated with this product on this order.
   * @return allocationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Allocation ID associated with this product on this order.")

  public Integer getAllocationId() {
    return allocationId;
  }


  public void setAllocationId(Integer allocationId) {
    this.allocationId = allocationId;
  }


  public ProductBase allocationExpiration(OffsetDateTime allocationExpiration) {
    
    this.allocationExpiration = allocationExpiration;
    return this;
  }

   /**
   * Allocation ID associated with this product on this order.
   * @return allocationExpiration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Allocation ID associated with this product on this order.")

  public OffsetDateTime getAllocationExpiration() {
    return allocationExpiration;
  }


  public void setAllocationExpiration(OffsetDateTime allocationExpiration) {
    this.allocationExpiration = allocationExpiration;
  }


  public ProductBase measurements(CommerceRuntimePackageMeasurements measurements) {
    
    this.measurements = measurements;
    return this;
  }

   /**
   * Get measurements
   * @return measurements
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CommerceRuntimePackageMeasurements getMeasurements() {
    return measurements;
  }


  public void setMeasurements(CommerceRuntimePackageMeasurements measurements) {
    this.measurements = measurements;
  }


  public ProductBase fulfillmentStatus(String fulfillmentStatus) {
    
    this.fulfillmentStatus = fulfillmentStatus;
    return this;
  }

   /**
   * Fulfillment status of the product.
   * @return fulfillmentStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Fulfillment status of the product.")

  public String getFulfillmentStatus() {
    return fulfillmentStatus;
  }


  public void setFulfillmentStatus(String fulfillmentStatus) {
    this.fulfillmentStatus = fulfillmentStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductBase productBase = (ProductBase) o;
    return Objects.equals(this.productCode, productBase.productCode) &&
        Objects.equals(this.name, productBase.name) &&
        Objects.equals(this.description, productBase.description) &&
        Objects.equals(this.goodsType, productBase.goodsType) &&
        Objects.equals(this.isPackagedStandAlone, productBase.isPackagedStandAlone) &&
        Objects.equals(this.stock, productBase.stock) &&
        Objects.equals(this.productReservationId, productBase.productReservationId) &&
        Objects.equals(this.allocationId, productBase.allocationId) &&
        Objects.equals(this.allocationExpiration, productBase.allocationExpiration) &&
        Objects.equals(this.measurements, productBase.measurements) &&
        Objects.equals(this.fulfillmentStatus, productBase.fulfillmentStatus);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(productCode, name, description, goodsType, isPackagedStandAlone, stock, productReservationId, allocationId, allocationExpiration, measurements, fulfillmentStatus);
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
    sb.append("class ProductBase {\n");
    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    goodsType: ").append(toIndentedString(goodsType)).append("\n");
    sb.append("    isPackagedStandAlone: ").append(toIndentedString(isPackagedStandAlone)).append("\n");
    sb.append("    stock: ").append(toIndentedString(stock)).append("\n");
    sb.append("    productReservationId: ").append(toIndentedString(productReservationId)).append("\n");
    sb.append("    allocationId: ").append(toIndentedString(allocationId)).append("\n");
    sb.append("    allocationExpiration: ").append(toIndentedString(allocationExpiration)).append("\n");
    sb.append("    measurements: ").append(toIndentedString(measurements)).append("\n");
    sb.append("    fulfillmentStatus: ").append(toIndentedString(fulfillmentStatus)).append("\n");
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
    openapiFields.add("productCode");
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("goodsType");
    openapiFields.add("isPackagedStandAlone");
    openapiFields.add("stock");
    openapiFields.add("productReservationId");
    openapiFields.add("allocationId");
    openapiFields.add("allocationExpiration");
    openapiFields.add("measurements");
    openapiFields.add("fulfillmentStatus");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProductBase
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ProductBase.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductBase is not found in the empty JSON string", ProductBase.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!ProductBase.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProductBase` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("productCode") != null && !jsonObj.get("productCode").isJsonNull()) && !jsonObj.get("productCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productCode").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("goodsType") != null && !jsonObj.get("goodsType").isJsonNull()) && !jsonObj.get("goodsType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `goodsType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("goodsType").toString()));
      }
      // validate the optional field `stock`
      if (jsonObj.get("stock") != null && !jsonObj.get("stock").isJsonNull()) {
        ProductStock.validateJsonObject(jsonObj.getAsJsonObject("stock"));
      }
      // validate the optional field `measurements`
      if (jsonObj.get("measurements") != null && !jsonObj.get("measurements").isJsonNull()) {
        CommerceRuntimePackageMeasurements.validateJsonObject(jsonObj.getAsJsonObject("measurements"));
      }
      if ((jsonObj.get("fulfillmentStatus") != null && !jsonObj.get("fulfillmentStatus").isJsonNull()) && !jsonObj.get("fulfillmentStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fulfillmentStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fulfillmentStatus").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductBase.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductBase' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductBase> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductBase.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductBase>() {
           @Override
           public void write(JsonWriter out, ProductBase value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductBase read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProductBase given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductBase
  * @throws IOException if the JSON string is invalid with respect to ProductBase
  */
  public static ProductBase fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductBase.class);
  }

 /**
  * Convert an instance of ProductBase to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

