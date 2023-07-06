/*
 * Kibo SiteSettings Service
 * OpenAPI Spec for Kibo SiteSettings Service
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.settings.models;

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
 * ConfigurableShipmentRelease
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConfigurableShipmentRelease implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_IS_ENABLED = "isEnabled";
  @SerializedName(SERIALIZED_NAME_IS_ENABLED)
  private Boolean isEnabled;

  public static final String SERIALIZED_NAME_SHIPMENT_CREATION_OFFSET = "shipmentCreationOffset";
  @SerializedName(SERIALIZED_NAME_SHIPMENT_CREATION_OFFSET)
  private Integer shipmentCreationOffset;

  public static final String SERIALIZED_NAME_RESERVE_INVENTORY_ON_ORDER_PENDING_SHIPMENT = "reserveInventoryOnOrderPendingShipment";
  @SerializedName(SERIALIZED_NAME_RESERVE_INVENTORY_ON_ORDER_PENDING_SHIPMENT)
  private Boolean reserveInventoryOnOrderPendingShipment;

  public ConfigurableShipmentRelease() {
  }

  public ConfigurableShipmentRelease isEnabled(Boolean isEnabled) {
    
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * Get isEnabled
   * @return isEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsEnabled() {
    return isEnabled;
  }


  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }


  public ConfigurableShipmentRelease shipmentCreationOffset(Integer shipmentCreationOffset) {
    
    this.shipmentCreationOffset = shipmentCreationOffset;
    return this;
  }

   /**
   * Get shipmentCreationOffset
   * @return shipmentCreationOffset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getShipmentCreationOffset() {
    return shipmentCreationOffset;
  }


  public void setShipmentCreationOffset(Integer shipmentCreationOffset) {
    this.shipmentCreationOffset = shipmentCreationOffset;
  }


  public ConfigurableShipmentRelease reserveInventoryOnOrderPendingShipment(Boolean reserveInventoryOnOrderPendingShipment) {
    
    this.reserveInventoryOnOrderPendingShipment = reserveInventoryOnOrderPendingShipment;
    return this;
  }

   /**
   * Get reserveInventoryOnOrderPendingShipment
   * @return reserveInventoryOnOrderPendingShipment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getReserveInventoryOnOrderPendingShipment() {
    return reserveInventoryOnOrderPendingShipment;
  }


  public void setReserveInventoryOnOrderPendingShipment(Boolean reserveInventoryOnOrderPendingShipment) {
    this.reserveInventoryOnOrderPendingShipment = reserveInventoryOnOrderPendingShipment;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigurableShipmentRelease configurableShipmentRelease = (ConfigurableShipmentRelease) o;
    return Objects.equals(this.isEnabled, configurableShipmentRelease.isEnabled) &&
        Objects.equals(this.shipmentCreationOffset, configurableShipmentRelease.shipmentCreationOffset) &&
        Objects.equals(this.reserveInventoryOnOrderPendingShipment, configurableShipmentRelease.reserveInventoryOnOrderPendingShipment);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(isEnabled, shipmentCreationOffset, reserveInventoryOnOrderPendingShipment);
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
    sb.append("class ConfigurableShipmentRelease {\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    shipmentCreationOffset: ").append(toIndentedString(shipmentCreationOffset)).append("\n");
    sb.append("    reserveInventoryOnOrderPendingShipment: ").append(toIndentedString(reserveInventoryOnOrderPendingShipment)).append("\n");
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
    openapiFields.add("isEnabled");
    openapiFields.add("shipmentCreationOffset");
    openapiFields.add("reserveInventoryOnOrderPendingShipment");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ConfigurableShipmentRelease
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ConfigurableShipmentRelease.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConfigurableShipmentRelease is not found in the empty JSON string", ConfigurableShipmentRelease.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!ConfigurableShipmentRelease.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConfigurableShipmentRelease` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConfigurableShipmentRelease.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConfigurableShipmentRelease' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConfigurableShipmentRelease> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConfigurableShipmentRelease.class));

       return (TypeAdapter<T>) new TypeAdapter<ConfigurableShipmentRelease>() {
           @Override
           public void write(JsonWriter out, ConfigurableShipmentRelease value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConfigurableShipmentRelease read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ConfigurableShipmentRelease given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConfigurableShipmentRelease
  * @throws IOException if the JSON string is invalid with respect to ConfigurableShipmentRelease
  */
  public static ConfigurableShipmentRelease fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConfigurableShipmentRelease.class);
  }

 /**
  * Convert an instance of ConfigurableShipmentRelease to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

