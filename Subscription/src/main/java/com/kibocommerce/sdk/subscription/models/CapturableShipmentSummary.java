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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
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
 * CapturableShipmentSummary
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CapturableShipmentSummary implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_SHIPMENT_NUMBER = "shipmentNumber";
  @SerializedName(SERIALIZED_NAME_SHIPMENT_NUMBER)
  private Integer shipmentNumber;

  public static final String SERIALIZED_NAME_SHIPMENT_TOTAL = "shipmentTotal";
  @SerializedName(SERIALIZED_NAME_SHIPMENT_TOTAL)
  private Double shipmentTotal;

  public static final String SERIALIZED_NAME_AMOUNT_APPLIED = "amountApplied";
  @SerializedName(SERIALIZED_NAME_AMOUNT_APPLIED)
  private Double amountApplied;

  public CapturableShipmentSummary() {
  }

  public CapturableShipmentSummary shipmentNumber(Integer shipmentNumber) {
    
    this.shipmentNumber = shipmentNumber;
    return this;
  }

   /**
   * The identifying number of the shipment affected by the payment action
   * @return shipmentNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The identifying number of the shipment affected by the payment action")

  public Integer getShipmentNumber() {
    return shipmentNumber;
  }


  public void setShipmentNumber(Integer shipmentNumber) {
    this.shipmentNumber = shipmentNumber;
  }


  public CapturableShipmentSummary shipmentTotal(Double shipmentTotal) {
    
    this.shipmentTotal = shipmentTotal;
    return this;
  }

   /**
   * The shipment&#39;s total when the payment action occurred
   * @return shipmentTotal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The shipment's total when the payment action occurred")

  public Double getShipmentTotal() {
    return shipmentTotal;
  }


  public void setShipmentTotal(Double shipmentTotal) {
    this.shipmentTotal = shipmentTotal;
  }


  public CapturableShipmentSummary amountApplied(Double amountApplied) {
    
    this.amountApplied = amountApplied;
    return this;
  }

   /**
   * The amount applied by the payment action
   * @return amountApplied
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The amount applied by the payment action")

  public Double getAmountApplied() {
    return amountApplied;
  }


  public void setAmountApplied(Double amountApplied) {
    this.amountApplied = amountApplied;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CapturableShipmentSummary capturableShipmentSummary = (CapturableShipmentSummary) o;
    return Objects.equals(this.shipmentNumber, capturableShipmentSummary.shipmentNumber) &&
        Objects.equals(this.shipmentTotal, capturableShipmentSummary.shipmentTotal) &&
        Objects.equals(this.amountApplied, capturableShipmentSummary.amountApplied);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipmentNumber, shipmentTotal, amountApplied);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CapturableShipmentSummary {\n");
    sb.append("    shipmentNumber: ").append(toIndentedString(shipmentNumber)).append("\n");
    sb.append("    shipmentTotal: ").append(toIndentedString(shipmentTotal)).append("\n");
    sb.append("    amountApplied: ").append(toIndentedString(amountApplied)).append("\n");
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
    openapiFields.add("shipmentNumber");
    openapiFields.add("shipmentTotal");
    openapiFields.add("amountApplied");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CapturableShipmentSummary
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CapturableShipmentSummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CapturableShipmentSummary is not found in the empty JSON string", CapturableShipmentSummary.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!CapturableShipmentSummary.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CapturableShipmentSummary` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CapturableShipmentSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CapturableShipmentSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CapturableShipmentSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CapturableShipmentSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<CapturableShipmentSummary>() {
           @Override
           public void write(JsonWriter out, CapturableShipmentSummary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CapturableShipmentSummary read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CapturableShipmentSummary given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CapturableShipmentSummary
  * @throws IOException if the JSON string is invalid with respect to CapturableShipmentSummary
  */
  public static CapturableShipmentSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CapturableShipmentSummary.class);
  }

 /**
  * Convert an instance of CapturableShipmentSummary to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

