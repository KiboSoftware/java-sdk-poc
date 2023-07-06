/*
 * Kibo MongoAdmin Service
 * OpenAPI Spec for Kibo MongoAdmin Service
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.importexport.models;

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
 * DropLocation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DropLocation implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private String uri;

  public static final String SERIALIZED_NAME_LOCATION_TYPE = "locationType";
  @SerializedName(SERIALIZED_NAME_LOCATION_TYPE)
  private String locationType;

  public static final String SERIALIZED_NAME_FILE_NAME = "fileName";
  @SerializedName(SERIALIZED_NAME_FILE_NAME)
  private String fileName;

  public static final String SERIALIZED_NAME_FILE_TYPE = "fileType";
  @SerializedName(SERIALIZED_NAME_FILE_TYPE)
  private String fileType;

  public DropLocation() {
  }

  public DropLocation id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public DropLocation uri(String uri) {
    
    this.uri = uri;
    return this;
  }

   /**
   * Get uri
   * @return uri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUri() {
    return uri;
  }


  public void setUri(String uri) {
    this.uri = uri;
  }


  public DropLocation locationType(String locationType) {
    
    this.locationType = locationType;
    return this;
  }

   /**
   * Get locationType
   * @return locationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocationType() {
    return locationType;
  }


  public void setLocationType(String locationType) {
    this.locationType = locationType;
  }


  public DropLocation fileName(String fileName) {
    
    this.fileName = fileName;
    return this;
  }

   /**
   * Get fileName
   * @return fileName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFileName() {
    return fileName;
  }


  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  public DropLocation fileType(String fileType) {
    
    this.fileType = fileType;
    return this;
  }

   /**
   * Get fileType
   * @return fileType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFileType() {
    return fileType;
  }


  public void setFileType(String fileType) {
    this.fileType = fileType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DropLocation dropLocation = (DropLocation) o;
    return Objects.equals(this.id, dropLocation.id) &&
        Objects.equals(this.uri, dropLocation.uri) &&
        Objects.equals(this.locationType, dropLocation.locationType) &&
        Objects.equals(this.fileName, dropLocation.fileName) &&
        Objects.equals(this.fileType, dropLocation.fileType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, uri, locationType, fileName, fileType);
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
    sb.append("class DropLocation {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    locationType: ").append(toIndentedString(locationType)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("uri");
    openapiFields.add("locationType");
    openapiFields.add("fileName");
    openapiFields.add("fileType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DropLocation
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DropLocation.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DropLocation is not found in the empty JSON string", DropLocation.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!DropLocation.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DropLocation` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("uri") != null && !jsonObj.get("uri").isJsonNull()) && !jsonObj.get("uri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uri").toString()));
      }
      if ((jsonObj.get("locationType") != null && !jsonObj.get("locationType").isJsonNull()) && !jsonObj.get("locationType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locationType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locationType").toString()));
      }
      if ((jsonObj.get("fileName") != null && !jsonObj.get("fileName").isJsonNull()) && !jsonObj.get("fileName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fileName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fileName").toString()));
      }
      if ((jsonObj.get("fileType") != null && !jsonObj.get("fileType").isJsonNull()) && !jsonObj.get("fileType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fileType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fileType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DropLocation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DropLocation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DropLocation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DropLocation.class));

       return (TypeAdapter<T>) new TypeAdapter<DropLocation>() {
           @Override
           public void write(JsonWriter out, DropLocation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DropLocation read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DropLocation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DropLocation
  * @throws IOException if the JSON string is invalid with respect to DropLocation
  */
  public static DropLocation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DropLocation.class);
  }

 /**
  * Convert an instance of DropLocation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
