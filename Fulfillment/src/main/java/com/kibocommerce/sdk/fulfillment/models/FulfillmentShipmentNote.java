/*
 * Kibo Fulfillment Service
 * OpenAPI Spec for Kibo Fulfillment Service
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.fulfillment.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kibocommerce.sdk.fulfillment.models.FulfillmentAuditInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
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
 * FulfillmentShipmentNote
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FulfillmentShipmentNote implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Map<String, Object> attributes = null;

  public static final String SERIALIZED_NAME_AUDIT_INFO = "auditInfo";
  @SerializedName(SERIALIZED_NAME_AUDIT_INFO)
  private FulfillmentAuditInfo auditInfo;

  public static final String SERIALIZED_NAME_NOTE_ID = "noteId";
  @SerializedName(SERIALIZED_NAME_NOTE_ID)
  private String noteId;

  public static final String SERIALIZED_NAME_NOTE_TEXT = "noteText";
  @SerializedName(SERIALIZED_NAME_NOTE_TEXT)
  private String noteText;

  public static final String SERIALIZED_NAME_ROLE = "role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private String role;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public FulfillmentShipmentNote() {
  }

  public FulfillmentShipmentNote attributes(Map<String, Object> attributes) {
    
    this.attributes = attributes;
    return this;
  }

  public FulfillmentShipmentNote putAttributesItem(String key, Object attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Object> getAttributes() {
    return attributes;
  }


  public void setAttributes(Map<String, Object> attributes) {
    this.attributes = attributes;
  }


  public FulfillmentShipmentNote auditInfo(FulfillmentAuditInfo auditInfo) {
    
    this.auditInfo = auditInfo;
    return this;
  }

   /**
   * Get auditInfo
   * @return auditInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FulfillmentAuditInfo getAuditInfo() {
    return auditInfo;
  }


  public void setAuditInfo(FulfillmentAuditInfo auditInfo) {
    this.auditInfo = auditInfo;
  }


  public FulfillmentShipmentNote noteId(String noteId) {
    
    this.noteId = noteId;
    return this;
  }

   /**
   * Get noteId
   * @return noteId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNoteId() {
    return noteId;
  }


  public void setNoteId(String noteId) {
    this.noteId = noteId;
  }


  public FulfillmentShipmentNote noteText(String noteText) {
    
    this.noteText = noteText;
    return this;
  }

   /**
   * Get noteText
   * @return noteText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNoteText() {
    return noteText;
  }


  public void setNoteText(String noteText) {
    this.noteText = noteText;
  }


  public FulfillmentShipmentNote role(String role) {
    
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRole() {
    return role;
  }


  public void setRole(String role) {
    this.role = role;
  }


  public FulfillmentShipmentNote username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FulfillmentShipmentNote fulfillmentShipmentNote = (FulfillmentShipmentNote) o;
    return Objects.equals(this.attributes, fulfillmentShipmentNote.attributes) &&
        Objects.equals(this.auditInfo, fulfillmentShipmentNote.auditInfo) &&
        Objects.equals(this.noteId, fulfillmentShipmentNote.noteId) &&
        Objects.equals(this.noteText, fulfillmentShipmentNote.noteText) &&
        Objects.equals(this.role, fulfillmentShipmentNote.role) &&
        Objects.equals(this.username, fulfillmentShipmentNote.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, auditInfo, noteId, noteText, role, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FulfillmentShipmentNote {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    auditInfo: ").append(toIndentedString(auditInfo)).append("\n");
    sb.append("    noteId: ").append(toIndentedString(noteId)).append("\n");
    sb.append("    noteText: ").append(toIndentedString(noteText)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
    openapiFields.add("attributes");
    openapiFields.add("auditInfo");
    openapiFields.add("noteId");
    openapiFields.add("noteText");
    openapiFields.add("role");
    openapiFields.add("username");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FulfillmentShipmentNote
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FulfillmentShipmentNote.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FulfillmentShipmentNote is not found in the empty JSON string", FulfillmentShipmentNote.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!FulfillmentShipmentNote.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FulfillmentShipmentNote` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      // validate the optional field `auditInfo`
      if (jsonObj.get("auditInfo") != null && !jsonObj.get("auditInfo").isJsonNull()) {
        FulfillmentAuditInfo.validateJsonObject(jsonObj.getAsJsonObject("auditInfo"));
      }
      if ((jsonObj.get("noteId") != null && !jsonObj.get("noteId").isJsonNull()) && !jsonObj.get("noteId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `noteId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("noteId").toString()));
      }
      if ((jsonObj.get("noteText") != null && !jsonObj.get("noteText").isJsonNull()) && !jsonObj.get("noteText").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `noteText` to be a primitive type in the JSON string but got `%s`", jsonObj.get("noteText").toString()));
      }
      if ((jsonObj.get("role") != null && !jsonObj.get("role").isJsonNull()) && !jsonObj.get("role").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `role` to be a primitive type in the JSON string but got `%s`", jsonObj.get("role").toString()));
      }
      if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()) && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FulfillmentShipmentNote.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FulfillmentShipmentNote' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FulfillmentShipmentNote> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FulfillmentShipmentNote.class));

       return (TypeAdapter<T>) new TypeAdapter<FulfillmentShipmentNote>() {
           @Override
           public void write(JsonWriter out, FulfillmentShipmentNote value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FulfillmentShipmentNote read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FulfillmentShipmentNote given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FulfillmentShipmentNote
  * @throws IOException if the JSON string is invalid with respect to FulfillmentShipmentNote
  */
  public static FulfillmentShipmentNote fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FulfillmentShipmentNote.class);
  }

 /**
  * Convert an instance of FulfillmentShipmentNote to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
