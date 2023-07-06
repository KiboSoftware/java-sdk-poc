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
import com.kibocommerce.sdk.catalogstorefront.models.CatalogRuntimesInventoryTag;
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
 * The inventory for a product at a specific Location
 */
@ApiModel(description = "The inventory for a product at a specific Location")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LocationInventoryQuery implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_LOCATION_CODES = "locationCodes";
  @SerializedName(SERIALIZED_NAME_LOCATION_CODES)
  private List<String> locationCodes = null;

  public static final String SERIALIZED_NAME_PRODUCT_CODES = "productCodes";
  @SerializedName(SERIALIZED_NAME_PRODUCT_CODES)
  private List<String> productCodes = null;

  public static final String SERIALIZED_NAME_INVENTORY_TAGS = "inventoryTags";
  @SerializedName(SERIALIZED_NAME_INVENTORY_TAGS)
  private List<CatalogRuntimesInventoryTag> inventoryTags = null;

  public static final String SERIALIZED_NAME_INCLUDE_FUTURE_INVENTORY = "includeFutureInventory";
  @SerializedName(SERIALIZED_NAME_INCLUDE_FUTURE_INVENTORY)
  private Boolean includeFutureInventory;

  public static final String SERIALIZED_NAME_FORCE_DEFAULTS_FOR_UNSPECIFIED_TAG_CATEGORIES = "forceDefaultsForUnspecifiedTagCategories";
  @SerializedName(SERIALIZED_NAME_FORCE_DEFAULTS_FOR_UNSPECIFIED_TAG_CATEGORIES)
  private Boolean forceDefaultsForUnspecifiedTagCategories;

  public LocationInventoryQuery() {
  }

  public LocationInventoryQuery locationCodes(List<String> locationCodes) {
    
    this.locationCodes = locationCodes;
    return this;
  }

  public LocationInventoryQuery addLocationCodesItem(String locationCodesItem) {
    if (this.locationCodes == null) {
      this.locationCodes = new ArrayList<>();
    }
    this.locationCodes.add(locationCodesItem);
    return this;
  }

   /**
   * Get locationCodes
   * @return locationCodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getLocationCodes() {
    return locationCodes;
  }


  public void setLocationCodes(List<String> locationCodes) {
    this.locationCodes = locationCodes;
  }


  public LocationInventoryQuery productCodes(List<String> productCodes) {
    
    this.productCodes = productCodes;
    return this;
  }

  public LocationInventoryQuery addProductCodesItem(String productCodesItem) {
    if (this.productCodes == null) {
      this.productCodes = new ArrayList<>();
    }
    this.productCodes.add(productCodesItem);
    return this;
  }

   /**
   * Get productCodes
   * @return productCodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getProductCodes() {
    return productCodes;
  }


  public void setProductCodes(List<String> productCodes) {
    this.productCodes = productCodes;
  }


  public LocationInventoryQuery inventoryTags(List<CatalogRuntimesInventoryTag> inventoryTags) {
    
    this.inventoryTags = inventoryTags;
    return this;
  }

  public LocationInventoryQuery addInventoryTagsItem(CatalogRuntimesInventoryTag inventoryTagsItem) {
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

  public List<CatalogRuntimesInventoryTag> getInventoryTags() {
    return inventoryTags;
  }


  public void setInventoryTags(List<CatalogRuntimesInventoryTag> inventoryTags) {
    this.inventoryTags = inventoryTags;
  }


  public LocationInventoryQuery includeFutureInventory(Boolean includeFutureInventory) {
    
    this.includeFutureInventory = includeFutureInventory;
    return this;
  }

   /**
   * Get includeFutureInventory
   * @return includeFutureInventory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIncludeFutureInventory() {
    return includeFutureInventory;
  }


  public void setIncludeFutureInventory(Boolean includeFutureInventory) {
    this.includeFutureInventory = includeFutureInventory;
  }


  public LocationInventoryQuery forceDefaultsForUnspecifiedTagCategories(Boolean forceDefaultsForUnspecifiedTagCategories) {
    
    this.forceDefaultsForUnspecifiedTagCategories = forceDefaultsForUnspecifiedTagCategories;
    return this;
  }

   /**
   * Get forceDefaultsForUnspecifiedTagCategories
   * @return forceDefaultsForUnspecifiedTagCategories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getForceDefaultsForUnspecifiedTagCategories() {
    return forceDefaultsForUnspecifiedTagCategories;
  }


  public void setForceDefaultsForUnspecifiedTagCategories(Boolean forceDefaultsForUnspecifiedTagCategories) {
    this.forceDefaultsForUnspecifiedTagCategories = forceDefaultsForUnspecifiedTagCategories;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationInventoryQuery locationInventoryQuery = (LocationInventoryQuery) o;
    return Objects.equals(this.locationCodes, locationInventoryQuery.locationCodes) &&
        Objects.equals(this.productCodes, locationInventoryQuery.productCodes) &&
        Objects.equals(this.inventoryTags, locationInventoryQuery.inventoryTags) &&
        Objects.equals(this.includeFutureInventory, locationInventoryQuery.includeFutureInventory) &&
        Objects.equals(this.forceDefaultsForUnspecifiedTagCategories, locationInventoryQuery.forceDefaultsForUnspecifiedTagCategories);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationCodes, productCodes, inventoryTags, includeFutureInventory, forceDefaultsForUnspecifiedTagCategories);
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
    sb.append("class LocationInventoryQuery {\n");
    sb.append("    locationCodes: ").append(toIndentedString(locationCodes)).append("\n");
    sb.append("    productCodes: ").append(toIndentedString(productCodes)).append("\n");
    sb.append("    inventoryTags: ").append(toIndentedString(inventoryTags)).append("\n");
    sb.append("    includeFutureInventory: ").append(toIndentedString(includeFutureInventory)).append("\n");
    sb.append("    forceDefaultsForUnspecifiedTagCategories: ").append(toIndentedString(forceDefaultsForUnspecifiedTagCategories)).append("\n");
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
    openapiFields.add("locationCodes");
    openapiFields.add("productCodes");
    openapiFields.add("inventoryTags");
    openapiFields.add("includeFutureInventory");
    openapiFields.add("forceDefaultsForUnspecifiedTagCategories");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LocationInventoryQuery
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!LocationInventoryQuery.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LocationInventoryQuery is not found in the empty JSON string", LocationInventoryQuery.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!LocationInventoryQuery.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LocationInventoryQuery` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      // ensure the json data is an array
      if (!jsonObj.get("locationCodes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `locationCodes` to be an array in the JSON string but got `%s`", jsonObj.get("locationCodes").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("productCodes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `productCodes` to be an array in the JSON string but got `%s`", jsonObj.get("productCodes").toString()));
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
            CatalogRuntimesInventoryTag.validateJsonObject(jsonArrayinventoryTags.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LocationInventoryQuery.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LocationInventoryQuery' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LocationInventoryQuery> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LocationInventoryQuery.class));

       return (TypeAdapter<T>) new TypeAdapter<LocationInventoryQuery>() {
           @Override
           public void write(JsonWriter out, LocationInventoryQuery value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LocationInventoryQuery read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LocationInventoryQuery given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LocationInventoryQuery
  * @throws IOException if the JSON string is invalid with respect to LocationInventoryQuery
  */
  public static LocationInventoryQuery fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LocationInventoryQuery.class);
  }

 /**
  * Convert an instance of LocationInventoryQuery to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

