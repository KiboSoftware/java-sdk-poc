/*
 * Kibo CommerceRuntime Service
 * OpenAPI Spec for Kibo CommerceRuntime Service
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.commerce.models;

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
 * CommerceRuntimeCanceledReason
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CommerceRuntimeCanceledReason implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_REASON_CODE = "reasonCode";
  @SerializedName(SERIALIZED_NAME_REASON_CODE)
  private String reasonCode;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_MORE_INFO = "moreInfo";
  @SerializedName(SERIALIZED_NAME_MORE_INFO)
  private String moreInfo;

  public CommerceRuntimeCanceledReason() {
  }

  public CommerceRuntimeCanceledReason reasonCode(String reasonCode) {
    
    this.reasonCode = reasonCode;
    return this;
  }

   /**
   * Get reasonCode
   * @return reasonCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReasonCode() {
    return reasonCode;
  }


  public void setReasonCode(String reasonCode) {
    this.reasonCode = reasonCode;
  }


  public CommerceRuntimeCanceledReason description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public CommerceRuntimeCanceledReason moreInfo(String moreInfo) {
    
    this.moreInfo = moreInfo;
    return this;
  }

   /**
   * Get moreInfo
   * @return moreInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMoreInfo() {
    return moreInfo;
  }


  public void setMoreInfo(String moreInfo) {
    this.moreInfo = moreInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommerceRuntimeCanceledReason commerceRuntimeCanceledReason = (CommerceRuntimeCanceledReason) o;
    return Objects.equals(this.reasonCode, commerceRuntimeCanceledReason.reasonCode) &&
        Objects.equals(this.description, commerceRuntimeCanceledReason.description) &&
        Objects.equals(this.moreInfo, commerceRuntimeCanceledReason.moreInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(reasonCode, description, moreInfo);
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
    sb.append("class CommerceRuntimeCanceledReason {\n");
    sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    moreInfo: ").append(toIndentedString(moreInfo)).append("\n");
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
    openapiFields.add("reasonCode");
    openapiFields.add("description");
    openapiFields.add("moreInfo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CommerceRuntimeCanceledReason
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CommerceRuntimeCanceledReason.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CommerceRuntimeCanceledReason is not found in the empty JSON string", CommerceRuntimeCanceledReason.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!CommerceRuntimeCanceledReason.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CommerceRuntimeCanceledReason` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("reasonCode") != null && !jsonObj.get("reasonCode").isJsonNull()) && !jsonObj.get("reasonCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reasonCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reasonCode").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("moreInfo") != null && !jsonObj.get("moreInfo").isJsonNull()) && !jsonObj.get("moreInfo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `moreInfo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("moreInfo").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CommerceRuntimeCanceledReason.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CommerceRuntimeCanceledReason' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CommerceRuntimeCanceledReason> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CommerceRuntimeCanceledReason.class));

       return (TypeAdapter<T>) new TypeAdapter<CommerceRuntimeCanceledReason>() {
           @Override
           public void write(JsonWriter out, CommerceRuntimeCanceledReason value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CommerceRuntimeCanceledReason read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CommerceRuntimeCanceledReason given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CommerceRuntimeCanceledReason
  * @throws IOException if the JSON string is invalid with respect to CommerceRuntimeCanceledReason
  */
  public static CommerceRuntimeCanceledReason fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CommerceRuntimeCanceledReason.class);
  }

 /**
  * Convert an instance of CommerceRuntimeCanceledReason to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

