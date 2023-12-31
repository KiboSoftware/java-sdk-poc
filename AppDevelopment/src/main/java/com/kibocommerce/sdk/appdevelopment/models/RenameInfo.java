/*
 * Kibo AppDev Service
 * OpenAPI Spec for Kibo AppDev Service
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.appdevelopment.models;

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
 * RenameInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RenameInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_OLD_FULL_PATH = "oldFullPath";
  @SerializedName(SERIALIZED_NAME_OLD_FULL_PATH)
  private String oldFullPath;

  public static final String SERIALIZED_NAME_NEW_FULL_PATH = "newFullPath";
  @SerializedName(SERIALIZED_NAME_NEW_FULL_PATH)
  private String newFullPath;

  public RenameInfo() {
  }

  public RenameInfo oldFullPath(String oldFullPath) {
    
    this.oldFullPath = oldFullPath;
    return this;
  }

   /**
   * Get oldFullPath
   * @return oldFullPath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOldFullPath() {
    return oldFullPath;
  }


  public void setOldFullPath(String oldFullPath) {
    this.oldFullPath = oldFullPath;
  }


  public RenameInfo newFullPath(String newFullPath) {
    
    this.newFullPath = newFullPath;
    return this;
  }

   /**
   * Get newFullPath
   * @return newFullPath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNewFullPath() {
    return newFullPath;
  }


  public void setNewFullPath(String newFullPath) {
    this.newFullPath = newFullPath;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RenameInfo renameInfo = (RenameInfo) o;
    return Objects.equals(this.oldFullPath, renameInfo.oldFullPath) &&
        Objects.equals(this.newFullPath, renameInfo.newFullPath);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(oldFullPath, newFullPath);
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
    sb.append("class RenameInfo {\n");
    sb.append("    oldFullPath: ").append(toIndentedString(oldFullPath)).append("\n");
    sb.append("    newFullPath: ").append(toIndentedString(newFullPath)).append("\n");
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
    openapiFields.add("oldFullPath");
    openapiFields.add("newFullPath");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RenameInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RenameInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RenameInfo is not found in the empty JSON string", RenameInfo.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!RenameInfo.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RenameInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("oldFullPath") != null && !jsonObj.get("oldFullPath").isJsonNull()) && !jsonObj.get("oldFullPath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `oldFullPath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("oldFullPath").toString()));
      }
      if ((jsonObj.get("newFullPath") != null && !jsonObj.get("newFullPath").isJsonNull()) && !jsonObj.get("newFullPath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `newFullPath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("newFullPath").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RenameInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RenameInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RenameInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RenameInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<RenameInfo>() {
           @Override
           public void write(JsonWriter out, RenameInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RenameInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RenameInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RenameInfo
  * @throws IOException if the JSON string is invalid with respect to RenameInfo
  */
  public static RenameInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RenameInfo.class);
  }

 /**
  * Convert an instance of RenameInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

