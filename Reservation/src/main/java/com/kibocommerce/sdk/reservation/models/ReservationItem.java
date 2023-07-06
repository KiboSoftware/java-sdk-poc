/*
 * Kibo Reservation Web API
 * OpenAPI Spec for Kibo Reservation Web API
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.reservation.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kibocommerce.sdk.reservation.models.Allocati;
import com.kibocommerce.sdk.reservation.models.InventoryTags;
import com.kibocommerce.sdk.reservation.models.Produ;
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
 * ReservationItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ReservationItem implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_LINE_ID = "lineId";
  @SerializedName(SERIALIZED_NAME_LINE_ID)
  private Integer lineId;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ORDER_ITEM_ID = "orderItemId";
  @SerializedName(SERIALIZED_NAME_ORDER_ITEM_ID)
  private String orderItemId;

  public static final String SERIALIZED_NAME_PRODUCT = "product";
  @SerializedName(SERIALIZED_NAME_PRODUCT)
  private Produ product;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity;

  public static final String SERIALIZED_NAME_FULFILLMENT_LOCATION_CODE = "fulfillmentLocationCode";
  @SerializedName(SERIALIZED_NAME_FULFILLMENT_LOCATION_CODE)
  private String fulfillmentLocationCode;

  public static final String SERIALIZED_NAME_FULFILLMENT_METHOD = "fulfillmentMethod";
  @SerializedName(SERIALIZED_NAME_FULFILLMENT_METHOD)
  private String fulfillmentMethod;

  public static final String SERIALIZED_NAME_ALLOCATIONS = "allocations";
  @SerializedName(SERIALIZED_NAME_ALLOCATIONS)
  private List<Allocati> allocations = null;

  public static final String SERIALIZED_NAME_ALLOWS_BACK_ORDER = "allowsBackOrder";
  @SerializedName(SERIALIZED_NAME_ALLOWS_BACK_ORDER)
  private Boolean allowsBackOrder;

  public static final String SERIALIZED_NAME_ALLOCATION_STATUS = "allocationStatus";
  @SerializedName(SERIALIZED_NAME_ALLOCATION_STATUS)
  private String allocationStatus;

  public static final String SERIALIZED_NAME_INVENTORY_TAGS = "inventoryTags";
  @SerializedName(SERIALIZED_NAME_INVENTORY_TAGS)
  private List<InventoryTags> inventoryTags = null;

  public ReservationItem() {
  }

  public ReservationItem lineId(Integer lineId) {
    
    this.lineId = lineId;
    return this;
  }

   /**
   * Get lineId
   * @return lineId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLineId() {
    return lineId;
  }


  public void setLineId(Integer lineId) {
    this.lineId = lineId;
  }


  public ReservationItem id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ReservationItem orderItemId(String orderItemId) {
    
    this.orderItemId = orderItemId;
    return this;
  }

   /**
   * Get orderItemId
   * @return orderItemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOrderItemId() {
    return orderItemId;
  }


  public void setOrderItemId(String orderItemId) {
    this.orderItemId = orderItemId;
  }


  public ReservationItem product(Produ product) {
    
    this.product = product;
    return this;
  }

   /**
   * Get product
   * @return product
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Produ getProduct() {
    return product;
  }


  public void setProduct(Produ product) {
    this.product = product;
  }


  public ReservationItem quantity(Integer quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getQuantity() {
    return quantity;
  }


  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  public ReservationItem fulfillmentLocationCode(String fulfillmentLocationCode) {
    
    this.fulfillmentLocationCode = fulfillmentLocationCode;
    return this;
  }

   /**
   * Get fulfillmentLocationCode
   * @return fulfillmentLocationCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFulfillmentLocationCode() {
    return fulfillmentLocationCode;
  }


  public void setFulfillmentLocationCode(String fulfillmentLocationCode) {
    this.fulfillmentLocationCode = fulfillmentLocationCode;
  }


  public ReservationItem fulfillmentMethod(String fulfillmentMethod) {
    
    this.fulfillmentMethod = fulfillmentMethod;
    return this;
  }

   /**
   * Get fulfillmentMethod
   * @return fulfillmentMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFulfillmentMethod() {
    return fulfillmentMethod;
  }


  public void setFulfillmentMethod(String fulfillmentMethod) {
    this.fulfillmentMethod = fulfillmentMethod;
  }


  public ReservationItem allocations(List<Allocati> allocations) {
    
    this.allocations = allocations;
    return this;
  }

  public ReservationItem addAllocationsItem(Allocati allocationsItem) {
    if (this.allocations == null) {
      this.allocations = new ArrayList<>();
    }
    this.allocations.add(allocationsItem);
    return this;
  }

   /**
   * Get allocations
   * @return allocations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Allocati> getAllocations() {
    return allocations;
  }


  public void setAllocations(List<Allocati> allocations) {
    this.allocations = allocations;
  }


  public ReservationItem allowsBackOrder(Boolean allowsBackOrder) {
    
    this.allowsBackOrder = allowsBackOrder;
    return this;
  }

   /**
   * Get allowsBackOrder
   * @return allowsBackOrder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAllowsBackOrder() {
    return allowsBackOrder;
  }


  public void setAllowsBackOrder(Boolean allowsBackOrder) {
    this.allowsBackOrder = allowsBackOrder;
  }


  public ReservationItem allocationStatus(String allocationStatus) {
    
    this.allocationStatus = allocationStatus;
    return this;
  }

   /**
   * Get allocationStatus
   * @return allocationStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAllocationStatus() {
    return allocationStatus;
  }


  public void setAllocationStatus(String allocationStatus) {
    this.allocationStatus = allocationStatus;
  }


  public ReservationItem inventoryTags(List<InventoryTags> inventoryTags) {
    
    this.inventoryTags = inventoryTags;
    return this;
  }

  public ReservationItem addInventoryTagsItem(InventoryTags inventoryTagsItem) {
    if (this.inventoryTags == null) {
      this.inventoryTags = new ArrayList<>();
    }
    this.inventoryTags.add(inventoryTagsItem);
    return this;
  }

   /**
   * Get inventoryTags
   * @return inventoryTags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<InventoryTags> getInventoryTags() {
    return inventoryTags;
  }


  public void setInventoryTags(List<InventoryTags> inventoryTags) {
    this.inventoryTags = inventoryTags;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReservationItem reservationItem = (ReservationItem) o;
    return Objects.equals(this.lineId, reservationItem.lineId) &&
        Objects.equals(this.id, reservationItem.id) &&
        Objects.equals(this.orderItemId, reservationItem.orderItemId) &&
        Objects.equals(this.product, reservationItem.product) &&
        Objects.equals(this.quantity, reservationItem.quantity) &&
        Objects.equals(this.fulfillmentLocationCode, reservationItem.fulfillmentLocationCode) &&
        Objects.equals(this.fulfillmentMethod, reservationItem.fulfillmentMethod) &&
        Objects.equals(this.allocations, reservationItem.allocations) &&
        Objects.equals(this.allowsBackOrder, reservationItem.allowsBackOrder) &&
        Objects.equals(this.allocationStatus, reservationItem.allocationStatus) &&
        Objects.equals(this.inventoryTags, reservationItem.inventoryTags);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineId, id, orderItemId, product, quantity, fulfillmentLocationCode, fulfillmentMethod, allocations, allowsBackOrder, allocationStatus, inventoryTags);
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
    sb.append("class ReservationItem {\n");
    sb.append("    lineId: ").append(toIndentedString(lineId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    orderItemId: ").append(toIndentedString(orderItemId)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    fulfillmentLocationCode: ").append(toIndentedString(fulfillmentLocationCode)).append("\n");
    sb.append("    fulfillmentMethod: ").append(toIndentedString(fulfillmentMethod)).append("\n");
    sb.append("    allocations: ").append(toIndentedString(allocations)).append("\n");
    sb.append("    allowsBackOrder: ").append(toIndentedString(allowsBackOrder)).append("\n");
    sb.append("    allocationStatus: ").append(toIndentedString(allocationStatus)).append("\n");
    sb.append("    inventoryTags: ").append(toIndentedString(inventoryTags)).append("\n");
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
    openapiFields.add("lineId");
    openapiFields.add("id");
    openapiFields.add("orderItemId");
    openapiFields.add("product");
    openapiFields.add("quantity");
    openapiFields.add("fulfillmentLocationCode");
    openapiFields.add("fulfillmentMethod");
    openapiFields.add("allocations");
    openapiFields.add("allowsBackOrder");
    openapiFields.add("allocationStatus");
    openapiFields.add("inventoryTags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReservationItem
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ReservationItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReservationItem is not found in the empty JSON string", ReservationItem.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!ReservationItem.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReservationItem` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("orderItemId") != null && !jsonObj.get("orderItemId").isJsonNull()) && !jsonObj.get("orderItemId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orderItemId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orderItemId").toString()));
      }
      // validate the optional field `product`
      if (jsonObj.get("product") != null && !jsonObj.get("product").isJsonNull()) {
        Produ.validateJsonObject(jsonObj.getAsJsonObject("product"));
      }
      if ((jsonObj.get("fulfillmentLocationCode") != null && !jsonObj.get("fulfillmentLocationCode").isJsonNull()) && !jsonObj.get("fulfillmentLocationCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fulfillmentLocationCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fulfillmentLocationCode").toString()));
      }
      if ((jsonObj.get("fulfillmentMethod") != null && !jsonObj.get("fulfillmentMethod").isJsonNull()) && !jsonObj.get("fulfillmentMethod").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fulfillmentMethod` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fulfillmentMethod").toString()));
      }
      if (jsonObj.get("allocations") != null && !jsonObj.get("allocations").isJsonNull()) {
        JsonArray jsonArrayallocations = jsonObj.getAsJsonArray("allocations");
        if (jsonArrayallocations != null) {
          // ensure the json data is an array
          if (!jsonObj.get("allocations").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `allocations` to be an array in the JSON string but got `%s`", jsonObj.get("allocations").toString()));
          }

          // validate the optional field `allocations` (array)
          for (int i = 0; i < jsonArrayallocations.size(); i++) {
            Allocati.validateJsonObject(jsonArrayallocations.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("allocationStatus") != null && !jsonObj.get("allocationStatus").isJsonNull()) && !jsonObj.get("allocationStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `allocationStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("allocationStatus").toString()));
      }
      if (jsonObj.get("inventoryTags") != null && !jsonObj.get("inventoryTags").isJsonNull()) {
        JsonArray jsonArrayinventoryTags = jsonObj.getAsJsonArray("inventoryTags");
        if (jsonArrayinventoryTags != null) {
          // ensure the json data is an array
          if (!jsonObj.get("inventoryTags").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `inventoryTags` to be an array in the JSON string but got `%s`", jsonObj.get("inventoryTags").toString()));
          }

          // validate the optional field `inventoryTags` (array)
          for (int i = 0; i < jsonArrayinventoryTags.size(); i++) {
            InventoryTags.validateJsonObject(jsonArrayinventoryTags.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReservationItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReservationItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReservationItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReservationItem.class));

       return (TypeAdapter<T>) new TypeAdapter<ReservationItem>() {
           @Override
           public void write(JsonWriter out, ReservationItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReservationItem read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReservationItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReservationItem
  * @throws IOException if the JSON string is invalid with respect to ReservationItem
  */
  public static ReservationItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReservationItem.class);
  }

 /**
  * Convert an instance of ReservationItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
