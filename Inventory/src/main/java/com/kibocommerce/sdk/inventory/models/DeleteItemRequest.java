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
public class DeleteItemRequest implements Serializable {
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

  public static final String SERIALIZED_NAME_PART_NUMBER = "partNumber";
  @SerializedName(SERIALIZED_NAME_PART_NUMBER)
  private String partNumber;

  public static final String SERIALIZED_NAME_UPC = "upc";
  @SerializedName(SERIALIZED_NAME_UPC)
  private String upc;

  public static final String SERIALIZED_NAME_SKU = "sku";
  @SerializedName(SERIALIZED_NAME_SKU)
  private String sku;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map<String, String> tags = null;

  public DeleteItemRequest() {
  }

  public DeleteItemRequest dryRun(Boolean dryRun) {
    
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


  public DeleteItemRequest explicit(Boolean explicit) {
    
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


  public DeleteItemRequest locationCodes(List<String> locationCodes) {
    
    this.locationCodes = locationCodes;
    return this;
  }

  public DeleteItemRequest addLocationCodesItem(String locationCodesItem) {
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


  public DeleteItemRequest allLocations(Boolean allLocations) {
    
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


  public DeleteItemRequest partNumber(String partNumber) {
    
    this.partNumber = partNumber;
    return this;
  }

   /**
   * The part number of the item to be deleted. Supports basic regex operators: .*+?^$[]
   * @return partNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The part number of the item to be deleted. Supports basic regex operators: .*+?^$[]")

  public String getPartNumber() {
    return partNumber;
  }


  public void setPartNumber(String partNumber) {
    this.partNumber = partNumber;
  }


  public DeleteItemRequest upc(String upc) {
    
    this.upc = upc;
    return this;
  }

   /**
   * The upc of the item to be deleted. Supports basic regex operators: .*+?^$[]
   * @return upc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The upc of the item to be deleted. Supports basic regex operators: .*+?^$[]")

  public String getUpc() {
    return upc;
  }


  public void setUpc(String upc) {
    this.upc = upc;
  }


  public DeleteItemRequest sku(String sku) {
    
    this.sku = sku;
    return this;
  }

   /**
   * The sku of the item to be deleted. Supports basic regex operators: .*+?^$[]
   * @return sku
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The sku of the item to be deleted. Supports basic regex operators: .*+?^$[]")

  public String getSku() {
    return sku;
  }


  public void setSku(String sku) {
    this.sku = sku;
  }


  public DeleteItemRequest tags(Map<String, String> tags) {
    
    this.tags = tags;
    return this;
  }

  public DeleteItemRequest putTagsItem(String key, String tagsItem) {
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
    DeleteItemRequest deleteItemRequest = (DeleteItemRequest) o;
    return Objects.equals(this.dryRun, deleteItemRequest.dryRun) &&
        Objects.equals(this.explicit, deleteItemRequest.explicit) &&
        Objects.equals(this.locationCodes, deleteItemRequest.locationCodes) &&
        Objects.equals(this.allLocations, deleteItemRequest.allLocations) &&
        Objects.equals(this.partNumber, deleteItemRequest.partNumber) &&
        Objects.equals(this.upc, deleteItemRequest.upc) &&
        Objects.equals(this.sku, deleteItemRequest.sku) &&
        Objects.equals(this.tags, deleteItemRequest.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dryRun, explicit, locationCodes, allLocations, partNumber, upc, sku, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteItemRequest {\n");
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("    explicit: ").append(toIndentedString(explicit)).append("\n");
    sb.append("    locationCodes: ").append(toIndentedString(locationCodes)).append("\n");
    sb.append("    allLocations: ").append(toIndentedString(allLocations)).append("\n");
    sb.append("    partNumber: ").append(toIndentedString(partNumber)).append("\n");
    sb.append("    upc: ").append(toIndentedString(upc)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
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
    openapiFields.add("partNumber");
    openapiFields.add("upc");
    openapiFields.add("sku");
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DeleteItemRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DeleteItemRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeleteItemRequest is not found in the empty JSON string", DeleteItemRequest.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!DeleteItemRequest.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DeleteItemRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      // ensure the json data is an array
      if (!jsonObj.get("locationCodes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `locationCodes` to be an array in the JSON string but got `%s`", jsonObj.get("locationCodes").toString()));
      }
      if ((jsonObj.get("partNumber") != null && !jsonObj.get("partNumber").isJsonNull()) && !jsonObj.get("partNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `partNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("partNumber").toString()));
      }
      if ((jsonObj.get("upc") != null && !jsonObj.get("upc").isJsonNull()) && !jsonObj.get("upc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `upc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("upc").toString()));
      }
      if ((jsonObj.get("sku") != null && !jsonObj.get("sku").isJsonNull()) && !jsonObj.get("sku").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sku` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sku").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeleteItemRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeleteItemRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeleteItemRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeleteItemRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<DeleteItemRequest>() {
           @Override
           public void write(JsonWriter out, DeleteItemRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DeleteItemRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DeleteItemRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DeleteItemRequest
  * @throws IOException if the JSON string is invalid with respect to DeleteItemRequest
  */
  public static DeleteItemRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeleteItemRequest.class);
  }

 /**
  * Convert an instance of DeleteItemRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

