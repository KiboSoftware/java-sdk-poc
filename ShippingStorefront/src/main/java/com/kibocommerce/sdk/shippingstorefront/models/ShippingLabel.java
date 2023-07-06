/*
 * Kibo ShippingRuntime Service
 * OpenAPI Spec for Kibo ShippingRuntime Service
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.shippingstorefront.models;

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
 * ShippingLabel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ShippingLabel implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_IMAGE_FORMAT = "imageFormat";
  @SerializedName(SERIALIZED_NAME_IMAGE_FORMAT)
  private String imageFormat;

  public static final String SERIALIZED_NAME_IMAGE_DATA = "imageData";
  @SerializedName(SERIALIZED_NAME_IMAGE_DATA)
  private byte[] imageData;

  public static final String SERIALIZED_NAME_LABEL_URL = "labelUrl";
  @SerializedName(SERIALIZED_NAME_LABEL_URL)
  private String labelUrl;

  public ShippingLabel() {
  }

  public ShippingLabel imageFormat(String imageFormat) {
    
    this.imageFormat = imageFormat;
    return this;
  }

   /**
   * Get imageFormat
   * @return imageFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getImageFormat() {
    return imageFormat;
  }


  public void setImageFormat(String imageFormat) {
    this.imageFormat = imageFormat;
  }


  public ShippingLabel imageData(byte[] imageData) {
    
    this.imageData = imageData;
    return this;
  }

   /**
   * Get imageData
   * @return imageData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public byte[] getImageData() {
    return imageData;
  }


  public void setImageData(byte[] imageData) {
    this.imageData = imageData;
  }


  public ShippingLabel labelUrl(String labelUrl) {
    
    this.labelUrl = labelUrl;
    return this;
  }

   /**
   * Get labelUrl
   * @return labelUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLabelUrl() {
    return labelUrl;
  }


  public void setLabelUrl(String labelUrl) {
    this.labelUrl = labelUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShippingLabel shippingLabel = (ShippingLabel) o;
    return Objects.equals(this.imageFormat, shippingLabel.imageFormat) &&
        Arrays.equals(this.imageData, shippingLabel.imageData) &&
        Objects.equals(this.labelUrl, shippingLabel.labelUrl);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageFormat, Arrays.hashCode(imageData), labelUrl);
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
    sb.append("class ShippingLabel {\n");
    sb.append("    imageFormat: ").append(toIndentedString(imageFormat)).append("\n");
    sb.append("    imageData: ").append(toIndentedString(imageData)).append("\n");
    sb.append("    labelUrl: ").append(toIndentedString(labelUrl)).append("\n");
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
    openapiFields.add("imageFormat");
    openapiFields.add("imageData");
    openapiFields.add("labelUrl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ShippingLabel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ShippingLabel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ShippingLabel is not found in the empty JSON string", ShippingLabel.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!ShippingLabel.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ShippingLabel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("imageFormat") != null && !jsonObj.get("imageFormat").isJsonNull()) && !jsonObj.get("imageFormat").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `imageFormat` to be a primitive type in the JSON string but got `%s`", jsonObj.get("imageFormat").toString()));
      }
      if ((jsonObj.get("labelUrl") != null && !jsonObj.get("labelUrl").isJsonNull()) && !jsonObj.get("labelUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `labelUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("labelUrl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ShippingLabel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ShippingLabel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ShippingLabel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ShippingLabel.class));

       return (TypeAdapter<T>) new TypeAdapter<ShippingLabel>() {
           @Override
           public void write(JsonWriter out, ShippingLabel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ShippingLabel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ShippingLabel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ShippingLabel
  * @throws IOException if the JSON string is invalid with respect to ShippingLabel
  */
  public static ShippingLabel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ShippingLabel.class);
  }

 /**
  * Convert an instance of ShippingLabel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

