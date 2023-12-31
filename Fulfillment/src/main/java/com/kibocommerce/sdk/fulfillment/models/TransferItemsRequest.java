/*
 * Kibo Fulfillment Service
 * OpenAPI Spec for Kibo Fulfillment Service
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.fulfillment.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kibocommerce.sdk.fulfillment.models.TransferItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
 * TransferItemsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TransferItemsRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_IS_USER_ACTION = "isUserAction";
  @SerializedName(SERIALIZED_NAME_IS_USER_ACTION)
  private Boolean isUserAction;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<TransferItem> items = null;

  public TransferItemsRequest() {
  }

  public TransferItemsRequest isUserAction(Boolean isUserAction) {
    
    this.isUserAction = isUserAction;
    return this;
  }

   /**
   * Get isUserAction
   * @return isUserAction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsUserAction() {
    return isUserAction;
  }


  public void setIsUserAction(Boolean isUserAction) {
    this.isUserAction = isUserAction;
  }


  public TransferItemsRequest items(List<TransferItem> items) {
    
    this.items = items;
    return this;
  }

  public TransferItemsRequest addItemsItem(TransferItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TransferItem> getItems() {
    return items;
  }


  public void setItems(List<TransferItem> items) {
    this.items = items;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferItemsRequest transferItemsRequest = (TransferItemsRequest) o;
    return Objects.equals(this.isUserAction, transferItemsRequest.isUserAction) &&
        Objects.equals(this.items, transferItemsRequest.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isUserAction, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferItemsRequest {\n");
    sb.append("    isUserAction: ").append(toIndentedString(isUserAction)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
    openapiFields.add("isUserAction");
    openapiFields.add("items");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TransferItemsRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TransferItemsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TransferItemsRequest is not found in the empty JSON string", TransferItemsRequest.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!TransferItemsRequest.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TransferItemsRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if (jsonObj.get("items") != null && !jsonObj.get("items").isJsonNull()) {
        JsonArray jsonArrayitems = jsonObj.getAsJsonArray("items");
        if (jsonArrayitems != null) {
          // ensure the json data is an array
          if (!jsonObj.get("items").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `items` to be an array in the JSON string but got `%s`", jsonObj.get("items").toString()));
          }

          // validate the optional field `items` (array)
          for (int i = 0; i < jsonArrayitems.size(); i++) {
            TransferItem.validateJsonObject(jsonArrayitems.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TransferItemsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TransferItemsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TransferItemsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TransferItemsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<TransferItemsRequest>() {
           @Override
           public void write(JsonWriter out, TransferItemsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TransferItemsRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TransferItemsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TransferItemsRequest
  * @throws IOException if the JSON string is invalid with respect to TransferItemsRequest
  */
  public static TransferItemsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TransferItemsRequest.class);
  }

 /**
  * Convert an instance of TransferItemsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

