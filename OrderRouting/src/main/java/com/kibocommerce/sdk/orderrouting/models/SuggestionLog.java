/*
 * Api Documentation
 * Api Documentation
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.orderrouting.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kibocommerce.sdk.orderrouting.models.SuggestionEvent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * SuggestionLog
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SuggestionLog implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_CREATOR_USERNAME = "creatorUsername";
  @SerializedName(SERIALIZED_NAME_CREATOR_USERNAME)
  private String creatorUsername;

  public static final String SERIALIZED_NAME_ENVIRONMENT_I_D = "environmentID";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT_I_D)
  private Integer environmentID;

  public static final String SERIALIZED_NAME_EVENTS = "events";
  @SerializedName(SERIALIZED_NAME_EVENTS)
  private List<SuggestionEvent> events = null;

  public static final String SERIALIZED_NAME_EXTERNAL_RESPONSE_I_D = "externalResponseID";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_RESPONSE_I_D)
  private String externalResponseID;

  public static final String SERIALIZED_NAME_ORDER_I_D = "orderID";
  @SerializedName(SERIALIZED_NAME_ORDER_I_D)
  private Integer orderID;

  public static final String SERIALIZED_NAME_PATH_STRING = "pathString";
  @SerializedName(SERIALIZED_NAME_PATH_STRING)
  private String pathString;

  public static final String SERIALIZED_NAME_PERSISTED = "persisted";
  @SerializedName(SERIALIZED_NAME_PERSISTED)
  private Boolean persisted;

  public static final String SERIALIZED_NAME_SITE_I_D = "siteID";
  @SerializedName(SERIALIZED_NAME_SITE_I_D)
  private Integer siteID;

  public static final String SERIALIZED_NAME_SUGGESTION_I_D = "suggestionID";
  @SerializedName(SERIALIZED_NAME_SUGGESTION_I_D)
  private Integer suggestionID;

  public static final String SERIALIZED_NAME_TENANT_I_D = "tenantID";
  @SerializedName(SERIALIZED_NAME_TENANT_I_D)
  private Integer tenantID;

  public static final String SERIALIZED_NAME_UPDATED = "updated";
  @SerializedName(SERIALIZED_NAME_UPDATED)
  private OffsetDateTime updated;

  public static final String SERIALIZED_NAME_UPDATER_USERNAME = "updaterUsername";
  @SerializedName(SERIALIZED_NAME_UPDATER_USERNAME)
  private String updaterUsername;

  public SuggestionLog() {
  }

  public SuggestionLog created(OffsetDateTime created) {
    
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreated() {
    return created;
  }


  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public SuggestionLog creatorUsername(String creatorUsername) {
    
    this.creatorUsername = creatorUsername;
    return this;
  }

   /**
   * Get creatorUsername
   * @return creatorUsername
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCreatorUsername() {
    return creatorUsername;
  }


  public void setCreatorUsername(String creatorUsername) {
    this.creatorUsername = creatorUsername;
  }


  public SuggestionLog environmentID(Integer environmentID) {
    
    this.environmentID = environmentID;
    return this;
  }

   /**
   * Get environmentID
   * @return environmentID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getEnvironmentID() {
    return environmentID;
  }


  public void setEnvironmentID(Integer environmentID) {
    this.environmentID = environmentID;
  }


  public SuggestionLog events(List<SuggestionEvent> events) {
    
    this.events = events;
    return this;
  }

  public SuggestionLog addEventsItem(SuggestionEvent eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>();
    }
    this.events.add(eventsItem);
    return this;
  }

   /**
   * Get events
   * @return events
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SuggestionEvent> getEvents() {
    return events;
  }


  public void setEvents(List<SuggestionEvent> events) {
    this.events = events;
  }


  public SuggestionLog externalResponseID(String externalResponseID) {
    
    this.externalResponseID = externalResponseID;
    return this;
  }

   /**
   * Get externalResponseID
   * @return externalResponseID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExternalResponseID() {
    return externalResponseID;
  }


  public void setExternalResponseID(String externalResponseID) {
    this.externalResponseID = externalResponseID;
  }


  public SuggestionLog orderID(Integer orderID) {
    
    this.orderID = orderID;
    return this;
  }

   /**
   * Get orderID
   * @return orderID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getOrderID() {
    return orderID;
  }


  public void setOrderID(Integer orderID) {
    this.orderID = orderID;
  }


  public SuggestionLog pathString(String pathString) {
    
    this.pathString = pathString;
    return this;
  }

   /**
   * Get pathString
   * @return pathString
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPathString() {
    return pathString;
  }


  public void setPathString(String pathString) {
    this.pathString = pathString;
  }


  public SuggestionLog persisted(Boolean persisted) {
    
    this.persisted = persisted;
    return this;
  }

   /**
   * Get persisted
   * @return persisted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getPersisted() {
    return persisted;
  }


  public void setPersisted(Boolean persisted) {
    this.persisted = persisted;
  }


  public SuggestionLog siteID(Integer siteID) {
    
    this.siteID = siteID;
    return this;
  }

   /**
   * Get siteID
   * @return siteID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSiteID() {
    return siteID;
  }


  public void setSiteID(Integer siteID) {
    this.siteID = siteID;
  }


  public SuggestionLog suggestionID(Integer suggestionID) {
    
    this.suggestionID = suggestionID;
    return this;
  }

   /**
   * Get suggestionID
   * @return suggestionID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSuggestionID() {
    return suggestionID;
  }


  public void setSuggestionID(Integer suggestionID) {
    this.suggestionID = suggestionID;
  }


  public SuggestionLog tenantID(Integer tenantID) {
    
    this.tenantID = tenantID;
    return this;
  }

   /**
   * Get tenantID
   * @return tenantID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTenantID() {
    return tenantID;
  }


  public void setTenantID(Integer tenantID) {
    this.tenantID = tenantID;
  }


  public SuggestionLog updated(OffsetDateTime updated) {
    
    this.updated = updated;
    return this;
  }

   /**
   * Get updated
   * @return updated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getUpdated() {
    return updated;
  }


  public void setUpdated(OffsetDateTime updated) {
    this.updated = updated;
  }


  public SuggestionLog updaterUsername(String updaterUsername) {
    
    this.updaterUsername = updaterUsername;
    return this;
  }

   /**
   * Get updaterUsername
   * @return updaterUsername
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUpdaterUsername() {
    return updaterUsername;
  }


  public void setUpdaterUsername(String updaterUsername) {
    this.updaterUsername = updaterUsername;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuggestionLog suggestionLog = (SuggestionLog) o;
    return Objects.equals(this.created, suggestionLog.created) &&
        Objects.equals(this.creatorUsername, suggestionLog.creatorUsername) &&
        Objects.equals(this.environmentID, suggestionLog.environmentID) &&
        Objects.equals(this.events, suggestionLog.events) &&
        Objects.equals(this.externalResponseID, suggestionLog.externalResponseID) &&
        Objects.equals(this.orderID, suggestionLog.orderID) &&
        Objects.equals(this.pathString, suggestionLog.pathString) &&
        Objects.equals(this.persisted, suggestionLog.persisted) &&
        Objects.equals(this.siteID, suggestionLog.siteID) &&
        Objects.equals(this.suggestionID, suggestionLog.suggestionID) &&
        Objects.equals(this.tenantID, suggestionLog.tenantID) &&
        Objects.equals(this.updated, suggestionLog.updated) &&
        Objects.equals(this.updaterUsername, suggestionLog.updaterUsername);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, creatorUsername, environmentID, events, externalResponseID, orderID, pathString, persisted, siteID, suggestionID, tenantID, updated, updaterUsername);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuggestionLog {\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    creatorUsername: ").append(toIndentedString(creatorUsername)).append("\n");
    sb.append("    environmentID: ").append(toIndentedString(environmentID)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    externalResponseID: ").append(toIndentedString(externalResponseID)).append("\n");
    sb.append("    orderID: ").append(toIndentedString(orderID)).append("\n");
    sb.append("    pathString: ").append(toIndentedString(pathString)).append("\n");
    sb.append("    persisted: ").append(toIndentedString(persisted)).append("\n");
    sb.append("    siteID: ").append(toIndentedString(siteID)).append("\n");
    sb.append("    suggestionID: ").append(toIndentedString(suggestionID)).append("\n");
    sb.append("    tenantID: ").append(toIndentedString(tenantID)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    updaterUsername: ").append(toIndentedString(updaterUsername)).append("\n");
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
    openapiFields.add("created");
    openapiFields.add("creatorUsername");
    openapiFields.add("environmentID");
    openapiFields.add("events");
    openapiFields.add("externalResponseID");
    openapiFields.add("orderID");
    openapiFields.add("pathString");
    openapiFields.add("persisted");
    openapiFields.add("siteID");
    openapiFields.add("suggestionID");
    openapiFields.add("tenantID");
    openapiFields.add("updated");
    openapiFields.add("updaterUsername");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SuggestionLog
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SuggestionLog.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SuggestionLog is not found in the empty JSON string", SuggestionLog.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!SuggestionLog.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SuggestionLog` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("creatorUsername") != null && !jsonObj.get("creatorUsername").isJsonNull()) && !jsonObj.get("creatorUsername").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `creatorUsername` to be a primitive type in the JSON string but got `%s`", jsonObj.get("creatorUsername").toString()));
      }
      if (jsonObj.get("events") != null && !jsonObj.get("events").isJsonNull()) {
        JsonArray jsonArrayevents = jsonObj.getAsJsonArray("events");
        if (jsonArrayevents != null) {
          // ensure the json data is an array
          if (!jsonObj.get("events").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `events` to be an array in the JSON string but got `%s`", jsonObj.get("events").toString()));
          }

          // validate the optional field `events` (array)
          for (int i = 0; i < jsonArrayevents.size(); i++) {
            SuggestionEvent.validateJsonObject(jsonArrayevents.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("externalResponseID") != null && !jsonObj.get("externalResponseID").isJsonNull()) && !jsonObj.get("externalResponseID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `externalResponseID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("externalResponseID").toString()));
      }
      if ((jsonObj.get("pathString") != null && !jsonObj.get("pathString").isJsonNull()) && !jsonObj.get("pathString").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pathString` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pathString").toString()));
      }
      if ((jsonObj.get("updaterUsername") != null && !jsonObj.get("updaterUsername").isJsonNull()) && !jsonObj.get("updaterUsername").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updaterUsername` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updaterUsername").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SuggestionLog.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SuggestionLog' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SuggestionLog> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SuggestionLog.class));

       return (TypeAdapter<T>) new TypeAdapter<SuggestionLog>() {
           @Override
           public void write(JsonWriter out, SuggestionLog value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SuggestionLog read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SuggestionLog given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SuggestionLog
  * @throws IOException if the JSON string is invalid with respect to SuggestionLog
  */
  public static SuggestionLog fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SuggestionLog.class);
  }

 /**
  * Convert an instance of SuggestionLog to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

