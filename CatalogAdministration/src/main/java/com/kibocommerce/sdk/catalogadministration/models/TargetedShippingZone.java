/*
 * Kibo Catalog Admin Services
 * OpenAPI Spec for Kibo Catalog Admin Services
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.catalogadministration.models;

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
 * Shipping method that is eligible for free shipping. This is the shipping method that is defined with the Shipping  Settings resource.
 */
@ApiModel(description = "Shipping method that is eligible for free shipping. This is the shipping method that is defined with the Shipping  Settings resource.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TargetedShippingZone implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ZONE = "zone";
  @SerializedName(SERIALIZED_NAME_ZONE)
  private String zone;

  public TargetedShippingZone() {
  }

  public TargetedShippingZone zone(String zone) {
    
    this.zone = zone;
    return this;
  }

   /**
   * Indicates the shipping zone that this discount is valid for.  If zone is provided the  method selected must be valid for the zone and both populated in the order for the discount  to be valid.
   * @return zone
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Indicates the shipping zone that this discount is valid for.  If zone is provided the  method selected must be valid for the zone and both populated in the order for the discount  to be valid.")

  public String getZone() {
    return zone;
  }


  public void setZone(String zone) {
    this.zone = zone;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetedShippingZone targetedShippingZone = (TargetedShippingZone) o;
    return Objects.equals(this.zone, targetedShippingZone.zone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(zone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetedShippingZone {\n");
    sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
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
    openapiFields.add("zone");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("zone");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TargetedShippingZone
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TargetedShippingZone.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TargetedShippingZone is not found in the empty JSON string", TargetedShippingZone.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!TargetedShippingZone.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TargetedShippingZone` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TargetedShippingZone.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("zone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `zone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("zone").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TargetedShippingZone.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TargetedShippingZone' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TargetedShippingZone> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TargetedShippingZone.class));

       return (TypeAdapter<T>) new TypeAdapter<TargetedShippingZone>() {
           @Override
           public void write(JsonWriter out, TargetedShippingZone value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TargetedShippingZone read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TargetedShippingZone given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TargetedShippingZone
  * @throws IOException if the JSON string is invalid with respect to TargetedShippingZone
  */
  public static TargetedShippingZone fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TargetedShippingZone.class);
  }

 /**
  * Convert an instance of TargetedShippingZone to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
