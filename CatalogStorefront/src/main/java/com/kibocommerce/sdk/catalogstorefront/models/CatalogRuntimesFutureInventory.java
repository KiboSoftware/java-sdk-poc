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
 * The future inventory for a product at a specific Location
 */
@ApiModel(description = "The future inventory for a product at a specific Location")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CatalogRuntimesFutureInventory implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_FUTURE_INVENTORY_I_D = "futureInventoryID";
  @SerializedName(SERIALIZED_NAME_FUTURE_INVENTORY_I_D)
  private Integer futureInventoryID;

  public static final String SERIALIZED_NAME_ONHAND = "onhand";
  @SerializedName(SERIALIZED_NAME_ONHAND)
  private Integer onhand;

  public static final String SERIALIZED_NAME_AVAILABLE = "available";
  @SerializedName(SERIALIZED_NAME_AVAILABLE)
  private Integer available;

  public static final String SERIALIZED_NAME_ALLOCATED = "allocated";
  @SerializedName(SERIALIZED_NAME_ALLOCATED)
  private Integer allocated;

  public static final String SERIALIZED_NAME_PENDING = "pending";
  @SerializedName(SERIALIZED_NAME_PENDING)
  private Integer pending;

  public static final String SERIALIZED_NAME_DELIVERY_DATE = "deliveryDate";
  @SerializedName(SERIALIZED_NAME_DELIVERY_DATE)
  private OffsetDateTime deliveryDate;

  public static final String SERIALIZED_NAME_CREATE_DATE = "createDate";
  @SerializedName(SERIALIZED_NAME_CREATE_DATE)
  private OffsetDateTime createDate;

  public CatalogRuntimesFutureInventory() {
  }

  public CatalogRuntimesFutureInventory futureInventoryID(Integer futureInventoryID) {
    
    this.futureInventoryID = futureInventoryID;
    return this;
  }

   /**
   * Get futureInventoryID
   * @return futureInventoryID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getFutureInventoryID() {
    return futureInventoryID;
  }


  public void setFutureInventoryID(Integer futureInventoryID) {
    this.futureInventoryID = futureInventoryID;
  }


  public CatalogRuntimesFutureInventory onhand(Integer onhand) {
    
    this.onhand = onhand;
    return this;
  }

   /**
   * Get onhand
   * @return onhand
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getOnhand() {
    return onhand;
  }


  public void setOnhand(Integer onhand) {
    this.onhand = onhand;
  }


  public CatalogRuntimesFutureInventory available(Integer available) {
    
    this.available = available;
    return this;
  }

   /**
   * Get available
   * @return available
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAvailable() {
    return available;
  }


  public void setAvailable(Integer available) {
    this.available = available;
  }


  public CatalogRuntimesFutureInventory allocated(Integer allocated) {
    
    this.allocated = allocated;
    return this;
  }

   /**
   * Get allocated
   * @return allocated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAllocated() {
    return allocated;
  }


  public void setAllocated(Integer allocated) {
    this.allocated = allocated;
  }


  public CatalogRuntimesFutureInventory pending(Integer pending) {
    
    this.pending = pending;
    return this;
  }

   /**
   * Get pending
   * @return pending
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPending() {
    return pending;
  }


  public void setPending(Integer pending) {
    this.pending = pending;
  }


  public CatalogRuntimesFutureInventory deliveryDate(OffsetDateTime deliveryDate) {
    
    this.deliveryDate = deliveryDate;
    return this;
  }

   /**
   * Get deliveryDate
   * @return deliveryDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getDeliveryDate() {
    return deliveryDate;
  }


  public void setDeliveryDate(OffsetDateTime deliveryDate) {
    this.deliveryDate = deliveryDate;
  }


  public CatalogRuntimesFutureInventory createDate(OffsetDateTime createDate) {
    
    this.createDate = createDate;
    return this;
  }

   /**
   * Get createDate
   * @return createDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreateDate() {
    return createDate;
  }


  public void setCreateDate(OffsetDateTime createDate) {
    this.createDate = createDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogRuntimesFutureInventory catalogRuntimesFutureInventory = (CatalogRuntimesFutureInventory) o;
    return Objects.equals(this.futureInventoryID, catalogRuntimesFutureInventory.futureInventoryID) &&
        Objects.equals(this.onhand, catalogRuntimesFutureInventory.onhand) &&
        Objects.equals(this.available, catalogRuntimesFutureInventory.available) &&
        Objects.equals(this.allocated, catalogRuntimesFutureInventory.allocated) &&
        Objects.equals(this.pending, catalogRuntimesFutureInventory.pending) &&
        Objects.equals(this.deliveryDate, catalogRuntimesFutureInventory.deliveryDate) &&
        Objects.equals(this.createDate, catalogRuntimesFutureInventory.createDate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(futureInventoryID, onhand, available, allocated, pending, deliveryDate, createDate);
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
    sb.append("class CatalogRuntimesFutureInventory {\n");
    sb.append("    futureInventoryID: ").append(toIndentedString(futureInventoryID)).append("\n");
    sb.append("    onhand: ").append(toIndentedString(onhand)).append("\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    allocated: ").append(toIndentedString(allocated)).append("\n");
    sb.append("    pending: ").append(toIndentedString(pending)).append("\n");
    sb.append("    deliveryDate: ").append(toIndentedString(deliveryDate)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
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
    openapiFields.add("futureInventoryID");
    openapiFields.add("onhand");
    openapiFields.add("available");
    openapiFields.add("allocated");
    openapiFields.add("pending");
    openapiFields.add("deliveryDate");
    openapiFields.add("createDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CatalogRuntimesFutureInventory
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CatalogRuntimesFutureInventory.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CatalogRuntimesFutureInventory is not found in the empty JSON string", CatalogRuntimesFutureInventory.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!CatalogRuntimesFutureInventory.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CatalogRuntimesFutureInventory` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CatalogRuntimesFutureInventory.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CatalogRuntimesFutureInventory' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CatalogRuntimesFutureInventory> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CatalogRuntimesFutureInventory.class));

       return (TypeAdapter<T>) new TypeAdapter<CatalogRuntimesFutureInventory>() {
           @Override
           public void write(JsonWriter out, CatalogRuntimesFutureInventory value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CatalogRuntimesFutureInventory read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CatalogRuntimesFutureInventory given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CatalogRuntimesFutureInventory
  * @throws IOException if the JSON string is invalid with respect to CatalogRuntimesFutureInventory
  */
  public static CatalogRuntimesFutureInventory fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CatalogRuntimesFutureInventory.class);
  }

 /**
  * Convert an instance of CatalogRuntimesFutureInventory to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
