/*
 * Inventory
 * Swagger JSON for inventory apis
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.inventory.models;

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
import java.util.HashMap;
import java.util.Map;
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
 * InventoryAllocationResponse Object
 */
@ApiModel(description = "InventoryAllocationResponse Object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InventoryAllocationResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ORDER_ITEM_I_D = "orderItemID";
  @SerializedName(SERIALIZED_NAME_ORDER_ITEM_I_D)
  private Integer orderItemID;

  public static final String SERIALIZED_NAME_UPC = "upc";
  @SerializedName(SERIALIZED_NAME_UPC)
  private String upc;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity;

  public static final String SERIALIZED_NAME_FUTURE_DATE = "futureDate";
  @SerializedName(SERIALIZED_NAME_FUTURE_DATE)
  private OffsetDateTime futureDate = null;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map<String, String> tags = null;

  public InventoryAllocationResponse() {
  }

  public InventoryAllocationResponse orderItemID(Integer orderItemID) {
    
    this.orderItemID = orderItemID;
    return this;
  }

   /**
   * order item ID
   * @return orderItemID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "order item ID")

  public Integer getOrderItemID() {
    return orderItemID;
  }


  public void setOrderItemID(Integer orderItemID) {
    this.orderItemID = orderItemID;
  }


  public InventoryAllocationResponse upc(String upc) {
    
    this.upc = upc;
    return this;
  }

   /**
   * upc
   * @return upc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "upc")

  public String getUpc() {
    return upc;
  }


  public void setUpc(String upc) {
    this.upc = upc;
  }


  public InventoryAllocationResponse state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "state")

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public InventoryAllocationResponse quantity(Integer quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * quantity
   * @return quantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "quantity")

  public Integer getQuantity() {
    return quantity;
  }


  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  public InventoryAllocationResponse futureDate(OffsetDateTime futureDate) {
    
    this.futureDate = futureDate;
    return this;
  }

   /**
   * Future Date at which the inventory should be allocated against. Expected format &#39;2020-09-28T12:00:00-0500&#39;
   * @return futureDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Future Date at which the inventory should be allocated against. Expected format '2020-09-28T12:00:00-0500'")

  public OffsetDateTime getFutureDate() {
    return futureDate;
  }


  public void setFutureDate(OffsetDateTime futureDate) {
    this.futureDate = futureDate;
  }


  public InventoryAllocationResponse tags(Map<String, String> tags) {
    
    this.tags = tags;
    return this;
  }

  public InventoryAllocationResponse putTagsItem(String key, String tagsItem) {
    if (this.tags == null) {
      this.tags = new HashMap<>();
    }
    this.tags.put(key, tagsItem);
    return this;
  }

   /**
   * Associative Map of &lt;String, String&gt; for tagCategoryName &#x3D;&gt; tagName
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Associative Map of <String, String> for tagCategoryName => tagName")

  public Map<String, String> getTags() {
    return tags;
  }


  public void setTags(Map<String, String> tags) {
    this.tags = tags;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InventoryAllocationResponse inventoryAllocationResponse = (InventoryAllocationResponse) o;
    return Objects.equals(this.orderItemID, inventoryAllocationResponse.orderItemID) &&
        Objects.equals(this.upc, inventoryAllocationResponse.upc) &&
        Objects.equals(this.state, inventoryAllocationResponse.state) &&
        Objects.equals(this.quantity, inventoryAllocationResponse.quantity) &&
        Objects.equals(this.futureDate, inventoryAllocationResponse.futureDate) &&
        Objects.equals(this.tags, inventoryAllocationResponse.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderItemID, upc, state, quantity, futureDate, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InventoryAllocationResponse {\n");
    sb.append("    orderItemID: ").append(toIndentedString(orderItemID)).append("\n");
    sb.append("    upc: ").append(toIndentedString(upc)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    futureDate: ").append(toIndentedString(futureDate)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
    openapiFields.add("orderItemID");
    openapiFields.add("upc");
    openapiFields.add("state");
    openapiFields.add("quantity");
    openapiFields.add("futureDate");
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InventoryAllocationResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!InventoryAllocationResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InventoryAllocationResponse is not found in the empty JSON string", InventoryAllocationResponse.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!InventoryAllocationResponse.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InventoryAllocationResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("upc") != null && !jsonObj.get("upc").isJsonNull()) && !jsonObj.get("upc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `upc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("upc").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InventoryAllocationResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InventoryAllocationResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InventoryAllocationResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InventoryAllocationResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<InventoryAllocationResponse>() {
           @Override
           public void write(JsonWriter out, InventoryAllocationResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InventoryAllocationResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InventoryAllocationResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InventoryAllocationResponse
  * @throws IOException if the JSON string is invalid with respect to InventoryAllocationResponse
  */
  public static InventoryAllocationResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InventoryAllocationResponse.class);
  }

 /**
  * Convert an instance of InventoryAllocationResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

