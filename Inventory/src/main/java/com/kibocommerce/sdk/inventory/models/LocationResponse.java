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
 * Location Response Object
 */
@ApiModel(description = "Location Response Object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LocationResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_LOCATION_I_D = "locationID";
  @SerializedName(SERIALIZED_NAME_LOCATION_I_D)
  private Integer locationID;

  public static final String SERIALIZED_NAME_TENANT_I_D = "tenantID";
  @SerializedName(SERIALIZED_NAME_TENANT_I_D)
  private Integer tenantID;

  public static final String SERIALIZED_NAME_LOCATION_CODE = "locationCode";
  @SerializedName(SERIALIZED_NAME_LOCATION_CODE)
  private String locationCode;

  public static final String SERIALIZED_NAME_EXPRESS = "express";
  @SerializedName(SERIALIZED_NAME_EXPRESS)
  private Boolean express;

  public static final String SERIALIZED_NAME_INCLUDE_IN_LOCATION_EXPORT = "includeInLocationExport";
  @SerializedName(SERIALIZED_NAME_INCLUDE_IN_LOCATION_EXPORT)
  private Boolean includeInLocationExport;

  public static final String SERIALIZED_NAME_INCLUDE_IN_AGGREGATE = "includeInAggregate";
  @SerializedName(SERIALIZED_NAME_INCLUDE_IN_AGGREGATE)
  private Boolean includeInAggregate;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_DIRECT_SHIP = "directShip";
  @SerializedName(SERIALIZED_NAME_DIRECT_SHIP)
  private Boolean directShip;

  public static final String SERIALIZED_NAME_PICKUP = "pickup";
  @SerializedName(SERIALIZED_NAME_PICKUP)
  private Boolean pickup;

  public static final String SERIALIZED_NAME_TRANSFER_ENABLED = "transferEnabled";
  @SerializedName(SERIALIZED_NAME_TRANSFER_ENABLED)
  private Boolean transferEnabled;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postalCode";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "countryCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public static final String SERIALIZED_NAME_LATITUDE = "latitude";
  @SerializedName(SERIALIZED_NAME_LATITUDE)
  private Float latitude = null;

  public static final String SERIALIZED_NAME_LONGITUDE = "longitude";
  @SerializedName(SERIALIZED_NAME_LONGITUDE)
  private Float longitude = null;

  public static final String SERIALIZED_NAME_LOCATION_NAME = "locationName";
  @SerializedName(SERIALIZED_NAME_LOCATION_NAME)
  private String locationName;

  public static final String SERIALIZED_NAME_WMS_ENABLED = "wmsEnabled";
  @SerializedName(SERIALIZED_NAME_WMS_ENABLED)
  private Boolean wmsEnabled;

  public static final String SERIALIZED_NAME_SUCCESS = "success";
  @SerializedName(SERIALIZED_NAME_SUCCESS)
  private Boolean success;

  public static final String SERIALIZED_NAME_MESSAGES = "messages";
  @SerializedName(SERIALIZED_NAME_MESSAGES)
  private List<String> messages = null;

  public static final String SERIALIZED_NAME_NUM_RESULTS = "numResults";
  @SerializedName(SERIALIZED_NAME_NUM_RESULTS)
  private Integer numResults;

  public LocationResponse() {
  }

  public LocationResponse locationID(Integer locationID) {
    
    this.locationID = locationID;
    return this;
  }

   /**
   * Internal Location ID
   * @return locationID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Internal Location ID")

  public Integer getLocationID() {
    return locationID;
  }


  public void setLocationID(Integer locationID) {
    this.locationID = locationID;
  }


  public LocationResponse tenantID(Integer tenantID) {
    
    this.tenantID = tenantID;
    return this;
  }

   /**
   * Tenant ID
   * @return tenantID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tenant ID")

  public Integer getTenantID() {
    return tenantID;
  }


  public void setTenantID(Integer tenantID) {
    this.tenantID = tenantID;
  }


  public LocationResponse locationCode(String locationCode) {
    
    this.locationCode = locationCode;
    return this;
  }

   /**
   * Location Code
   * @return locationCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Location Code")

  public String getLocationCode() {
    return locationCode;
  }


  public void setLocationCode(String locationCode) {
    this.locationCode = locationCode;
  }


  public LocationResponse express(Boolean express) {
    
    this.express = express;
    return this;
  }

   /**
   * Flag for whether the location is express enabled or not
   * @return express
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Flag for whether the location is express enabled or not")

  public Boolean getExpress() {
    return express;
  }


  public void setExpress(Boolean express) {
    this.express = express;
  }


  public LocationResponse includeInLocationExport(Boolean includeInLocationExport) {
    
    this.includeInLocationExport = includeInLocationExport;
    return this;
  }

   /**
   * Flag for whether the location is to be included in location exports
   * @return includeInLocationExport
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Flag for whether the location is to be included in location exports")

  public Boolean getIncludeInLocationExport() {
    return includeInLocationExport;
  }


  public void setIncludeInLocationExport(Boolean includeInLocationExport) {
    this.includeInLocationExport = includeInLocationExport;
  }


  public LocationResponse includeInAggregate(Boolean includeInAggregate) {
    
    this.includeInAggregate = includeInAggregate;
    return this;
  }

   /**
   * Flag for whether the location is to be included in aggregate exports
   * @return includeInAggregate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Flag for whether the location is to be included in aggregate exports")

  public Boolean getIncludeInAggregate() {
    return includeInAggregate;
  }


  public void setIncludeInAggregate(Boolean includeInAggregate) {
    this.includeInAggregate = includeInAggregate;
  }


  public LocationResponse active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Flag for whether the location is active
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Flag for whether the location is active")

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public LocationResponse directShip(Boolean directShip) {
    
    this.directShip = directShip;
    return this;
  }

   /**
   * Flag for whether the location allows Direct Ship (STH) orders
   * @return directShip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Flag for whether the location allows Direct Ship (STH) orders")

  public Boolean getDirectShip() {
    return directShip;
  }


  public void setDirectShip(Boolean directShip) {
    this.directShip = directShip;
  }


  public LocationResponse pickup(Boolean pickup) {
    
    this.pickup = pickup;
    return this;
  }

   /**
   * Flag for whether the location allows Pickup (BOPIS) orders
   * @return pickup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Flag for whether the location allows Pickup (BOPIS) orders")

  public Boolean getPickup() {
    return pickup;
  }


  public void setPickup(Boolean pickup) {
    this.pickup = pickup;
  }


  public LocationResponse transferEnabled(Boolean transferEnabled) {
    
    this.transferEnabled = transferEnabled;
    return this;
  }

   /**
   * Flag for whether the location allows Transfer orders
   * @return transferEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Flag for whether the location allows Transfer orders")

  public Boolean getTransferEnabled() {
    return transferEnabled;
  }


  public void setTransferEnabled(Boolean transferEnabled) {
    this.transferEnabled = transferEnabled;
  }


  public LocationResponse postalCode(String postalCode) {
    
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Postal Code
   * @return postalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Postal Code")

  public String getPostalCode() {
    return postalCode;
  }


  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public LocationResponse countryCode(String countryCode) {
    
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Country Code
   * @return countryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Country Code")

  public String getCountryCode() {
    return countryCode;
  }


  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public LocationResponse latitude(Float latitude) {
    
    this.latitude = latitude;
    return this;
  }

   /**
   * Latitude
   * @return latitude
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Latitude")

  public Float getLatitude() {
    return latitude;
  }


  public void setLatitude(Float latitude) {
    this.latitude = latitude;
  }


  public LocationResponse longitude(Float longitude) {
    
    this.longitude = longitude;
    return this;
  }

   /**
   * Longitude
   * @return longitude
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Longitude")

  public Float getLongitude() {
    return longitude;
  }


  public void setLongitude(Float longitude) {
    this.longitude = longitude;
  }


  public LocationResponse locationName(String locationName) {
    
    this.locationName = locationName;
    return this;
  }

   /**
   * Location Name
   * @return locationName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Location Name")

  public String getLocationName() {
    return locationName;
  }


  public void setLocationName(String locationName) {
    this.locationName = locationName;
  }


  public LocationResponse wmsEnabled(Boolean wmsEnabled) {
    
    this.wmsEnabled = wmsEnabled;
    return this;
  }

   /**
   * Flag for whether the location is WMS Enabled
   * @return wmsEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Flag for whether the location is WMS Enabled")

  public Boolean getWmsEnabled() {
    return wmsEnabled;
  }


  public void setWmsEnabled(Boolean wmsEnabled) {
    this.wmsEnabled = wmsEnabled;
  }


  public LocationResponse success(Boolean success) {
    
    this.success = success;
    return this;
  }

   /**
   * Flag for success
   * @return success
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Flag for success")

  public Boolean getSuccess() {
    return success;
  }


  public void setSuccess(Boolean success) {
    this.success = success;
  }


  public LocationResponse messages(List<String> messages) {
    
    this.messages = messages;
    return this;
  }

  public LocationResponse addMessagesItem(String messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<>();
    }
    this.messages.add(messagesItem);
    return this;
  }

   /**
   * List of messages
   * @return messages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of messages")

  public List<String> getMessages() {
    return messages;
  }


  public void setMessages(List<String> messages) {
    this.messages = messages;
  }


  public LocationResponse numResults(Integer numResults) {
    
    this.numResults = numResults;
    return this;
  }

   /**
   * Number of results
   * @return numResults
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of results")

  public Integer getNumResults() {
    return numResults;
  }


  public void setNumResults(Integer numResults) {
    this.numResults = numResults;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationResponse locationResponse = (LocationResponse) o;
    return Objects.equals(this.locationID, locationResponse.locationID) &&
        Objects.equals(this.tenantID, locationResponse.tenantID) &&
        Objects.equals(this.locationCode, locationResponse.locationCode) &&
        Objects.equals(this.express, locationResponse.express) &&
        Objects.equals(this.includeInLocationExport, locationResponse.includeInLocationExport) &&
        Objects.equals(this.includeInAggregate, locationResponse.includeInAggregate) &&
        Objects.equals(this.active, locationResponse.active) &&
        Objects.equals(this.directShip, locationResponse.directShip) &&
        Objects.equals(this.pickup, locationResponse.pickup) &&
        Objects.equals(this.transferEnabled, locationResponse.transferEnabled) &&
        Objects.equals(this.postalCode, locationResponse.postalCode) &&
        Objects.equals(this.countryCode, locationResponse.countryCode) &&
        Objects.equals(this.latitude, locationResponse.latitude) &&
        Objects.equals(this.longitude, locationResponse.longitude) &&
        Objects.equals(this.locationName, locationResponse.locationName) &&
        Objects.equals(this.wmsEnabled, locationResponse.wmsEnabled) &&
        Objects.equals(this.success, locationResponse.success) &&
        Objects.equals(this.messages, locationResponse.messages) &&
        Objects.equals(this.numResults, locationResponse.numResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationID, tenantID, locationCode, express, includeInLocationExport, includeInAggregate, active, directShip, pickup, transferEnabled, postalCode, countryCode, latitude, longitude, locationName, wmsEnabled, success, messages, numResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationResponse {\n");
    sb.append("    locationID: ").append(toIndentedString(locationID)).append("\n");
    sb.append("    tenantID: ").append(toIndentedString(tenantID)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    express: ").append(toIndentedString(express)).append("\n");
    sb.append("    includeInLocationExport: ").append(toIndentedString(includeInLocationExport)).append("\n");
    sb.append("    includeInAggregate: ").append(toIndentedString(includeInAggregate)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    directShip: ").append(toIndentedString(directShip)).append("\n");
    sb.append("    pickup: ").append(toIndentedString(pickup)).append("\n");
    sb.append("    transferEnabled: ").append(toIndentedString(transferEnabled)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
    sb.append("    wmsEnabled: ").append(toIndentedString(wmsEnabled)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    numResults: ").append(toIndentedString(numResults)).append("\n");
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
    openapiFields.add("locationID");
    openapiFields.add("tenantID");
    openapiFields.add("locationCode");
    openapiFields.add("express");
    openapiFields.add("includeInLocationExport");
    openapiFields.add("includeInAggregate");
    openapiFields.add("active");
    openapiFields.add("directShip");
    openapiFields.add("pickup");
    openapiFields.add("transferEnabled");
    openapiFields.add("postalCode");
    openapiFields.add("countryCode");
    openapiFields.add("latitude");
    openapiFields.add("longitude");
    openapiFields.add("locationName");
    openapiFields.add("wmsEnabled");
    openapiFields.add("success");
    openapiFields.add("messages");
    openapiFields.add("numResults");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LocationResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!LocationResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LocationResponse is not found in the empty JSON string", LocationResponse.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!LocationResponse.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LocationResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("locationCode") != null && !jsonObj.get("locationCode").isJsonNull()) && !jsonObj.get("locationCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locationCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locationCode").toString()));
      }
      if ((jsonObj.get("postalCode") != null && !jsonObj.get("postalCode").isJsonNull()) && !jsonObj.get("postalCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `postalCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("postalCode").toString()));
      }
      if ((jsonObj.get("countryCode") != null && !jsonObj.get("countryCode").isJsonNull()) && !jsonObj.get("countryCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `countryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("countryCode").toString()));
      }
      if ((jsonObj.get("locationName") != null && !jsonObj.get("locationName").isJsonNull()) && !jsonObj.get("locationName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locationName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locationName").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("messages").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `messages` to be an array in the JSON string but got `%s`", jsonObj.get("messages").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LocationResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LocationResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LocationResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LocationResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<LocationResponse>() {
           @Override
           public void write(JsonWriter out, LocationResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LocationResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LocationResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LocationResponse
  * @throws IOException if the JSON string is invalid with respect to LocationResponse
  */
  public static LocationResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LocationResponse.class);
  }

 /**
  * Convert an instance of LocationResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

