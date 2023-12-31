/*
 * Kibo Customer Service
 * OpenAPI Spec for Kibo Customer Service
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.customer.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kibocommerce.sdk.customer.models.AdminUserAuditInfo;
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
 * Log entry for any change made to a Credit.    The system will generate all entries.  Contract is for display only.  All values are ReadOnly.
 */
@ApiModel(description = "Log entry for any change made to a Credit.    The system will generate all entries.  Contract is for display only.  All values are ReadOnly.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreditAuditEntry implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ACTIVITY_TYPE = "activityType";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_TYPE)
  private String activityType;

  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private String details;

  public static final String SERIALIZED_NAME_AUDIT_INFO = "auditInfo";
  @SerializedName(SERIALIZED_NAME_AUDIT_INFO)
  private AdminUserAuditInfo auditInfo;

  public static final String SERIALIZED_NAME_ACTIVITY_TYPE_ID = "activityTypeId";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_TYPE_ID)
  private Integer activityTypeId;

  public CreditAuditEntry() {
  }

  public CreditAuditEntry activityType(String activityType) {
    
    this.activityType = activityType;
    return this;
  }

   /**
   * Mozu.Customer.Contracts.Credit.CreditAuditEntry.CreditAuditActivityType
   * @return activityType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Mozu.Customer.Contracts.Credit.CreditAuditEntry.CreditAuditActivityType")

  public String getActivityType() {
    return activityType;
  }


  public void setActivityType(String activityType) {
    this.activityType = activityType;
  }


  public CreditAuditEntry details(String details) {
    
    this.details = details;
    return this;
  }

   /**
   * Detials of what was done
   * @return details
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Detials of what was done")

  public String getDetails() {
    return details;
  }


  public void setDetails(String details) {
    this.details = details;
  }


  public CreditAuditEntry auditInfo(AdminUserAuditInfo auditInfo) {
    
    this.auditInfo = auditInfo;
    return this;
  }

   /**
   * Get auditInfo
   * @return auditInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AdminUserAuditInfo getAuditInfo() {
    return auditInfo;
  }


  public void setAuditInfo(AdminUserAuditInfo auditInfo) {
    this.auditInfo = auditInfo;
  }


  public CreditAuditEntry activityTypeId(Integer activityTypeId) {
    
    this.activityTypeId = activityTypeId;
    return this;
  }

   /**
   * Get activityTypeId
   * @return activityTypeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getActivityTypeId() {
    return activityTypeId;
  }


  public void setActivityTypeId(Integer activityTypeId) {
    this.activityTypeId = activityTypeId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditAuditEntry creditAuditEntry = (CreditAuditEntry) o;
    return Objects.equals(this.activityType, creditAuditEntry.activityType) &&
        Objects.equals(this.details, creditAuditEntry.details) &&
        Objects.equals(this.auditInfo, creditAuditEntry.auditInfo) &&
        Objects.equals(this.activityTypeId, creditAuditEntry.activityTypeId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityType, details, auditInfo, activityTypeId);
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
    sb.append("class CreditAuditEntry {\n");
    sb.append("    activityType: ").append(toIndentedString(activityType)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    auditInfo: ").append(toIndentedString(auditInfo)).append("\n");
    sb.append("    activityTypeId: ").append(toIndentedString(activityTypeId)).append("\n");
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
    openapiFields.add("activityType");
    openapiFields.add("details");
    openapiFields.add("auditInfo");
    openapiFields.add("activityTypeId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreditAuditEntry
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreditAuditEntry.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreditAuditEntry is not found in the empty JSON string", CreditAuditEntry.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!CreditAuditEntry.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreditAuditEntry` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("activityType") != null && !jsonObj.get("activityType").isJsonNull()) && !jsonObj.get("activityType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `activityType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("activityType").toString()));
      }
      if ((jsonObj.get("details") != null && !jsonObj.get("details").isJsonNull()) && !jsonObj.get("details").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `details` to be a primitive type in the JSON string but got `%s`", jsonObj.get("details").toString()));
      }
      // validate the optional field `auditInfo`
      if (jsonObj.get("auditInfo") != null && !jsonObj.get("auditInfo").isJsonNull()) {
        AdminUserAuditInfo.validateJsonObject(jsonObj.getAsJsonObject("auditInfo"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreditAuditEntry.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreditAuditEntry' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreditAuditEntry> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreditAuditEntry.class));

       return (TypeAdapter<T>) new TypeAdapter<CreditAuditEntry>() {
           @Override
           public void write(JsonWriter out, CreditAuditEntry value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreditAuditEntry read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreditAuditEntry given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreditAuditEntry
  * @throws IOException if the JSON string is invalid with respect to CreditAuditEntry
  */
  public static CreditAuditEntry fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreditAuditEntry.class);
  }

 /**
  * Convert an instance of CreditAuditEntry to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

