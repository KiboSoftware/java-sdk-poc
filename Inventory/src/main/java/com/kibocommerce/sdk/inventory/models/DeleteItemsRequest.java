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
import com.kibocommerce.sdk.inventory.models.InventoryItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
 * Request needed for deleting inventory
 */
@ApiModel(description = "Request needed for deleting inventory")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DeleteItemsRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DRY_RUN = "dryRun";
  @SerializedName(SERIALIZED_NAME_DRY_RUN)
  private Boolean dryRun;

  public static final String SERIALIZED_NAME_EXPLICIT = "explicit";
  @SerializedName(SERIALIZED_NAME_EXPLICIT)
  private Boolean explicit;

  public static final String SERIALIZED_NAME_LOCATION_CODES = "locationCodes";
  @SerializedName(SERIALIZED_NAME_LOCATION_CODES)
  private List<String> locationCodes = null;

  public static final String SERIALIZED_NAME_ALL_LOCATIONS = "allLocations";
  @SerializedName(SERIALIZED_NAME_ALL_LOCATIONS)
  private Boolean allLocations;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<InventoryItem> items = null;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map<String, String> tags = null;

  public DeleteItemsRequest() {
  }

  public DeleteItemsRequest dryRun(Boolean dryRun) {
    
    this.dryRun = dryRun;
    return this;
  }

   /**
   * Flag used to differentiate between a test and a non-test run.
   * @return dryRun
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Flag used to differentiate between a test and a non-test run.")

  public Boolean getDryRun() {
    return dryRun;
  }


  public void setDryRun(Boolean dryRun) {
    this.dryRun = dryRun;
  }


  public DeleteItemsRequest explicit(Boolean explicit) {
    
    this.explicit = explicit;
    return this;
  }

   /**
   * Flag used to request explicit inventory, location, pick wave, and audit information for each request item.
   * @return explicit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Flag used to request explicit inventory, location, pick wave, and audit information for each request item.")

  public Boolean getExplicit() {
    return explicit;
  }


  public void setExplicit(Boolean explicit) {
    this.explicit = explicit;
  }


  public DeleteItemsRequest locationCodes(List<String> locationCodes) {
    
    this.locationCodes = locationCodes;
    return this;
  }

  public DeleteItemsRequest addLocationCodesItem(String locationCodesItem) {
    if (this.locationCodes == null) {
      this.locationCodes = new ArrayList<>();
    }
    this.locationCodes.add(locationCodesItem);
    return this;
  }

   /**
   * An array of locationCodes to be considered for item-deletion purposes. Optional.     All locationCodes associated with the requesting tenant will be considered if no locationCodes are provided.
   * @return locationCodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of locationCodes to be considered for item-deletion purposes. Optional.     All locationCodes associated with the requesting tenant will be considered if no locationCodes are provided.")

  public List<String> getLocationCodes() {
    return locationCodes;
  }


  public void setLocationCodes(List<String> locationCodes) {
    this.locationCodes = locationCodes;
  }


  public DeleteItemsRequest allLocations(Boolean allLocations) {
    
    this.allLocations = allLocations;
    return this;
  }

   /**
   * Flag used to request deletion of inventory across all locations (overrides locationCodes).
   * @return allLocations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Flag used to request deletion of inventory across all locations (overrides locationCodes).")

  public Boolean getAllLocations() {
    return allLocations;
  }


  public void setAllLocations(Boolean allLocations) {
    this.allLocations = allLocations;
  }


  public DeleteItemsRequest items(List<InventoryItem> items) {
    
    this.items = items;
    return this;
  }

  public DeleteItemsRequest addItemsItem(InventoryItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * List of items to delete. Supports basic regex operators: .*+?^$[]
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of items to delete. Supports basic regex operators: .*+?^$[]")

  public List<InventoryItem> getItems() {
    return items;
  }


  public void setItems(List<InventoryItem> items) {
    this.items = items;
  }


  public DeleteItemsRequest tags(Map<String, String> tags) {
    
    this.tags = tags;
    return this;
  }

  public DeleteItemsRequest putTagsItem(String key, String tagsItem) {
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
    DeleteItemsRequest deleteItemsRequest = (DeleteItemsRequest) o;
    return Objects.equals(this.dryRun, deleteItemsRequest.dryRun) &&
        Objects.equals(this.explicit, deleteItemsRequest.explicit) &&
        Objects.equals(this.locationCodes, deleteItemsRequest.locationCodes) &&
        Objects.equals(this.allLocations, deleteItemsRequest.allLocations) &&
        Objects.equals(this.items, deleteItemsRequest.items) &&
        Objects.equals(this.tags, deleteItemsRequest.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dryRun, explicit, locationCodes, allLocations, items, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteItemsRequest {\n");
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("    explicit: ").append(toIndentedString(explicit)).append("\n");
    sb.append("    locationCodes: ").append(toIndentedString(locationCodes)).append("\n");
    sb.append("    allLocations: ").append(toIndentedString(allLocations)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
    openapiFields.add("dryRun");
    openapiFields.add("explicit");
    openapiFields.add("locationCodes");
    openapiFields.add("allLocations");
    openapiFields.add("items");
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DeleteItemsRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DeleteItemsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeleteItemsRequest is not found in the empty JSON string", DeleteItemsRequest.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!DeleteItemsRequest.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DeleteItemsRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      // ensure the json data is an array
      if (!jsonObj.get("locationCodes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `locationCodes` to be an array in the JSON string but got `%s`", jsonObj.get("locationCodes").toString()));
      }
      if (jsonObj.get("items") != null && !jsonObj.get("items").isJsonNull()) {
        JsonArray jsonArrayitems = jsonObj.getAsJsonArray("items");
        if (jsonArrayitems != null) {
          // ensure the json data is an array
          if (!jsonObj.get("items").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `items` to be an array in the JSON string but got `%s`", jsonObj.get("items").toString()));
          }

          // validate the optional field `items` (array)
          for (int i = 0; i < jsonArrayitems.size(); i++) {
            InventoryItem.validateJsonObject(jsonArrayitems.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeleteItemsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeleteItemsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeleteItemsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeleteItemsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<DeleteItemsRequest>() {
           @Override
           public void write(JsonWriter out, DeleteItemsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DeleteItemsRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DeleteItemsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DeleteItemsRequest
  * @throws IOException if the JSON string is invalid with respect to DeleteItemsRequest
  */
  public static DeleteItemsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeleteItemsRequest.class);
  }

 /**
  * Convert an instance of DeleteItemsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

