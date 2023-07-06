/*
 * Kibo Shipping Admin Service
 * OpenAPI Spec for Kibo Shipping Admin Service
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.shippingadmin.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kibocommerce.sdk.shippingadmin.models.AppDevHttpContent;
import com.kibocommerce.sdk.shippingadmin.models.ShippingAdminHttpRequestMessage;
import com.kibocommerce.sdk.shippingadmin.models.ShippingAdminHttpStatusCode;
import com.kibocommerce.sdk.shippingadmin.models.StringStringIEnumerableKeyValuePair;
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
 * ShippingAdminHttpResponseMessage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ShippingAdminHttpResponseMessage implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private AppDevHttpContent content;

  public static final String SERIALIZED_NAME_STATUS_CODE = "statusCode";
  @SerializedName(SERIALIZED_NAME_STATUS_CODE)
  private ShippingAdminHttpStatusCode statusCode;

  public static final String SERIALIZED_NAME_REASON_PHRASE = "reasonPhrase";
  @SerializedName(SERIALIZED_NAME_REASON_PHRASE)
  private String reasonPhrase;

  public static final String SERIALIZED_NAME_HEADERS = "headers";
  @SerializedName(SERIALIZED_NAME_HEADERS)
  private List<StringStringIEnumerableKeyValuePair> headers = null;

  public static final String SERIALIZED_NAME_TRAILING_HEADERS = "trailingHeaders";
  @SerializedName(SERIALIZED_NAME_TRAILING_HEADERS)
  private List<StringStringIEnumerableKeyValuePair> trailingHeaders = null;

  public static final String SERIALIZED_NAME_REQUEST_MESSAGE = "requestMessage";
  @SerializedName(SERIALIZED_NAME_REQUEST_MESSAGE)
  private ShippingAdminHttpRequestMessage requestMessage;

  public static final String SERIALIZED_NAME_IS_SUCCESS_STATUS_CODE = "isSuccessStatusCode";
  @SerializedName(SERIALIZED_NAME_IS_SUCCESS_STATUS_CODE)
  private Boolean isSuccessStatusCode;

  public ShippingAdminHttpResponseMessage() {
  }

  
  public ShippingAdminHttpResponseMessage(
     List<StringStringIEnumerableKeyValuePair> headers, 
     List<StringStringIEnumerableKeyValuePair> trailingHeaders, 
     Boolean isSuccessStatusCode
  ) {
    this();
    this.headers = headers;
    this.trailingHeaders = trailingHeaders;
    this.isSuccessStatusCode = isSuccessStatusCode;
  }

  public ShippingAdminHttpResponseMessage version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  public ShippingAdminHttpResponseMessage content(AppDevHttpContent content) {
    
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AppDevHttpContent getContent() {
    return content;
  }


  public void setContent(AppDevHttpContent content) {
    this.content = content;
  }


  public ShippingAdminHttpResponseMessage statusCode(ShippingAdminHttpStatusCode statusCode) {
    
    this.statusCode = statusCode;
    return this;
  }

   /**
   * Get statusCode
   * @return statusCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ShippingAdminHttpStatusCode getStatusCode() {
    return statusCode;
  }


  public void setStatusCode(ShippingAdminHttpStatusCode statusCode) {
    this.statusCode = statusCode;
  }


  public ShippingAdminHttpResponseMessage reasonPhrase(String reasonPhrase) {
    
    this.reasonPhrase = reasonPhrase;
    return this;
  }

   /**
   * Get reasonPhrase
   * @return reasonPhrase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReasonPhrase() {
    return reasonPhrase;
  }


  public void setReasonPhrase(String reasonPhrase) {
    this.reasonPhrase = reasonPhrase;
  }


   /**
   * Get headers
   * @return headers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<StringStringIEnumerableKeyValuePair> getHeaders() {
    return headers;
  }




   /**
   * Get trailingHeaders
   * @return trailingHeaders
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<StringStringIEnumerableKeyValuePair> getTrailingHeaders() {
    return trailingHeaders;
  }




  public ShippingAdminHttpResponseMessage requestMessage(ShippingAdminHttpRequestMessage requestMessage) {
    
    this.requestMessage = requestMessage;
    return this;
  }

   /**
   * Get requestMessage
   * @return requestMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ShippingAdminHttpRequestMessage getRequestMessage() {
    return requestMessage;
  }


  public void setRequestMessage(ShippingAdminHttpRequestMessage requestMessage) {
    this.requestMessage = requestMessage;
  }


   /**
   * Get isSuccessStatusCode
   * @return isSuccessStatusCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsSuccessStatusCode() {
    return isSuccessStatusCode;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShippingAdminHttpResponseMessage shippingAdminHttpResponseMessage = (ShippingAdminHttpResponseMessage) o;
    return Objects.equals(this.version, shippingAdminHttpResponseMessage.version) &&
        Objects.equals(this.content, shippingAdminHttpResponseMessage.content) &&
        Objects.equals(this.statusCode, shippingAdminHttpResponseMessage.statusCode) &&
        Objects.equals(this.reasonPhrase, shippingAdminHttpResponseMessage.reasonPhrase) &&
        Objects.equals(this.headers, shippingAdminHttpResponseMessage.headers) &&
        Objects.equals(this.trailingHeaders, shippingAdminHttpResponseMessage.trailingHeaders) &&
        Objects.equals(this.requestMessage, shippingAdminHttpResponseMessage.requestMessage) &&
        Objects.equals(this.isSuccessStatusCode, shippingAdminHttpResponseMessage.isSuccessStatusCode);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, content, statusCode, reasonPhrase, headers, trailingHeaders, requestMessage, isSuccessStatusCode);
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
    sb.append("class ShippingAdminHttpResponseMessage {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    reasonPhrase: ").append(toIndentedString(reasonPhrase)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    trailingHeaders: ").append(toIndentedString(trailingHeaders)).append("\n");
    sb.append("    requestMessage: ").append(toIndentedString(requestMessage)).append("\n");
    sb.append("    isSuccessStatusCode: ").append(toIndentedString(isSuccessStatusCode)).append("\n");
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
    openapiFields.add("version");
    openapiFields.add("content");
    openapiFields.add("statusCode");
    openapiFields.add("reasonPhrase");
    openapiFields.add("headers");
    openapiFields.add("trailingHeaders");
    openapiFields.add("requestMessage");
    openapiFields.add("isSuccessStatusCode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ShippingAdminHttpResponseMessage
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ShippingAdminHttpResponseMessage.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ShippingAdminHttpResponseMessage is not found in the empty JSON string", ShippingAdminHttpResponseMessage.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!ShippingAdminHttpResponseMessage.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ShippingAdminHttpResponseMessage` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) && !jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
      // validate the optional field `content`
      if (jsonObj.get("content") != null && !jsonObj.get("content").isJsonNull()) {
        AppDevHttpContent.validateJsonObject(jsonObj.getAsJsonObject("content"));
      }
      if ((jsonObj.get("reasonPhrase") != null && !jsonObj.get("reasonPhrase").isJsonNull()) && !jsonObj.get("reasonPhrase").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reasonPhrase` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reasonPhrase").toString()));
      }
      if (jsonObj.get("headers") != null && !jsonObj.get("headers").isJsonNull()) {
        JsonArray jsonArrayheaders = jsonObj.getAsJsonArray("headers");
        if (jsonArrayheaders != null) {
          // ensure the json data is an array
          if (!jsonObj.get("headers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `headers` to be an array in the JSON string but got `%s`", jsonObj.get("headers").toString()));
          }

          // validate the optional field `headers` (array)
          for (int i = 0; i < jsonArrayheaders.size(); i++) {
            StringStringIEnumerableKeyValuePair.validateJsonObject(jsonArrayheaders.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("trailingHeaders") != null && !jsonObj.get("trailingHeaders").isJsonNull()) {
        JsonArray jsonArraytrailingHeaders = jsonObj.getAsJsonArray("trailingHeaders");
        if (jsonArraytrailingHeaders != null) {
          // ensure the json data is an array
          if (!jsonObj.get("trailingHeaders").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `trailingHeaders` to be an array in the JSON string but got `%s`", jsonObj.get("trailingHeaders").toString()));
          }

          // validate the optional field `trailingHeaders` (array)
          for (int i = 0; i < jsonArraytrailingHeaders.size(); i++) {
            StringStringIEnumerableKeyValuePair.validateJsonObject(jsonArraytrailingHeaders.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `requestMessage`
      if (jsonObj.get("requestMessage") != null && !jsonObj.get("requestMessage").isJsonNull()) {
        ShippingAdminHttpRequestMessage.validateJsonObject(jsonObj.getAsJsonObject("requestMessage"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ShippingAdminHttpResponseMessage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ShippingAdminHttpResponseMessage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ShippingAdminHttpResponseMessage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ShippingAdminHttpResponseMessage.class));

       return (TypeAdapter<T>) new TypeAdapter<ShippingAdminHttpResponseMessage>() {
           @Override
           public void write(JsonWriter out, ShippingAdminHttpResponseMessage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ShippingAdminHttpResponseMessage read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ShippingAdminHttpResponseMessage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ShippingAdminHttpResponseMessage
  * @throws IOException if the JSON string is invalid with respect to ShippingAdminHttpResponseMessage
  */
  public static ShippingAdminHttpResponseMessage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ShippingAdminHttpResponseMessage.class);
  }

 /**
  * Convert an instance of ShippingAdminHttpResponseMessage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
