/*
 * Kibo SiteSettings Service
 * OpenAPI Spec for Kibo SiteSettings Service
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.settings.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kibocommerce.sdk.settings.models.AdminUserAuditInfo;
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
 * Subscription settings defined or this site
 */
@ApiModel(description = "Subscription settings defined or this site")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SubscriptionSettings implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CONTINUITY_ORDER_DATE_OFFSET = "continuityOrderDateOffset";
  @SerializedName(SERIALIZED_NAME_CONTINUITY_ORDER_DATE_OFFSET)
  private Integer continuityOrderDateOffset;

  public static final String SERIALIZED_NAME_PAUSE_SUBSCRIPTION_OFFSET = "pauseSubscriptionOffset";
  @SerializedName(SERIALIZED_NAME_PAUSE_SUBSCRIPTION_OFFSET)
  private Integer pauseSubscriptionOffset;

  public static final String SERIALIZED_NAME_NEXT_ORDER_DATE_OFFSET = "nextOrderDateOffset";
  @SerializedName(SERIALIZED_NAME_NEXT_ORDER_DATE_OFFSET)
  private Integer nextOrderDateOffset;

  public static final String SERIALIZED_NAME_SKIP_SUBSCRIPTION_OFFSET = "skipSubscriptionOffset";
  @SerializedName(SERIALIZED_NAME_SKIP_SUBSCRIPTION_OFFSET)
  private Integer skipSubscriptionOffset;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_ORDER_REMINDER_OFFSET = "subscriptionOrderReminderOffset";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_ORDER_REMINDER_OFFSET)
  private Integer subscriptionOrderReminderOffset;

  public static final String SERIALIZED_NAME_ORDER_NOW_RESET_NEXT_ORDER_DATE = "orderNowResetNextOrderDate";
  @SerializedName(SERIALIZED_NAME_ORDER_NOW_RESET_NEXT_ORDER_DATE)
  private Boolean orderNowResetNextOrderDate;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_PAUSE_LIMIT_REMINDER_OFFSET = "subscriptionPauseLimitReminderOffset";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_PAUSE_LIMIT_REMINDER_OFFSET)
  private Integer subscriptionPauseLimitReminderOffset;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_PAUSED_REMINDER_OFFSET = "subscriptionPausedReminderOffset";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_PAUSED_REMINDER_OFFSET)
  private Integer subscriptionPausedReminderOffset;

  public static final String SERIALIZED_NAME_AUDIT_INFO = "auditInfo";
  @SerializedName(SERIALIZED_NAME_AUDIT_INFO)
  private AdminUserAuditInfo auditInfo;

  public SubscriptionSettings() {
  }

  public SubscriptionSettings continuityOrderDateOffset(Integer continuityOrderDateOffset) {
    
    this.continuityOrderDateOffset = continuityOrderDateOffset;
    return this;
  }

   /**
   * Specifies the number of days before the next order date to create the continuity order.
   * @return continuityOrderDateOffset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the number of days before the next order date to create the continuity order.")

  public Integer getContinuityOrderDateOffset() {
    return continuityOrderDateOffset;
  }


  public void setContinuityOrderDateOffset(Integer continuityOrderDateOffset) {
    this.continuityOrderDateOffset = continuityOrderDateOffset;
  }


  public SubscriptionSettings pauseSubscriptionOffset(Integer pauseSubscriptionOffset) {
    
    this.pauseSubscriptionOffset = pauseSubscriptionOffset;
    return this;
  }

   /**
   * Specifies the number of continuity orders should be placed before activating the subscription.
   * @return pauseSubscriptionOffset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the number of continuity orders should be placed before activating the subscription.")

  public Integer getPauseSubscriptionOffset() {
    return pauseSubscriptionOffset;
  }


  public void setPauseSubscriptionOffset(Integer pauseSubscriptionOffset) {
    this.pauseSubscriptionOffset = pauseSubscriptionOffset;
  }


  public SubscriptionSettings nextOrderDateOffset(Integer nextOrderDateOffset) {
    
    this.nextOrderDateOffset = nextOrderDateOffset;
    return this;
  }

   /**
   * Specifies the number of days to update the next order date from existing next order date.
   * @return nextOrderDateOffset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the number of days to update the next order date from existing next order date.")

  public Integer getNextOrderDateOffset() {
    return nextOrderDateOffset;
  }


  public void setNextOrderDateOffset(Integer nextOrderDateOffset) {
    this.nextOrderDateOffset = nextOrderDateOffset;
  }


  public SubscriptionSettings skipSubscriptionOffset(Integer skipSubscriptionOffset) {
    
    this.skipSubscriptionOffset = skipSubscriptionOffset;
    return this;
  }

   /**
   * Specifies the number of times the subscription can be skipped
   * @return skipSubscriptionOffset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the number of times the subscription can be skipped")

  public Integer getSkipSubscriptionOffset() {
    return skipSubscriptionOffset;
  }


  public void setSkipSubscriptionOffset(Integer skipSubscriptionOffset) {
    this.skipSubscriptionOffset = skipSubscriptionOffset;
  }


  public SubscriptionSettings subscriptionOrderReminderOffset(Integer subscriptionOrderReminderOffset) {
    
    this.subscriptionOrderReminderOffset = subscriptionOrderReminderOffset;
    return this;
  }

   /**
   * Specifies the number of days to send subscription order reminder email before the next continuity order.
   * @return subscriptionOrderReminderOffset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the number of days to send subscription order reminder email before the next continuity order.")

  public Integer getSubscriptionOrderReminderOffset() {
    return subscriptionOrderReminderOffset;
  }


  public void setSubscriptionOrderReminderOffset(Integer subscriptionOrderReminderOffset) {
    this.subscriptionOrderReminderOffset = subscriptionOrderReminderOffset;
  }


  public SubscriptionSettings orderNowResetNextOrderDate(Boolean orderNowResetNextOrderDate) {
    
    this.orderNowResetNextOrderDate = orderNowResetNextOrderDate;
    return this;
  }

   /**
   * Specifies if order now action resets next order date
   * @return orderNowResetNextOrderDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies if order now action resets next order date")

  public Boolean getOrderNowResetNextOrderDate() {
    return orderNowResetNextOrderDate;
  }


  public void setOrderNowResetNextOrderDate(Boolean orderNowResetNextOrderDate) {
    this.orderNowResetNextOrderDate = orderNowResetNextOrderDate;
  }


  public SubscriptionSettings subscriptionPauseLimitReminderOffset(Integer subscriptionPauseLimitReminderOffset) {
    
    this.subscriptionPauseLimitReminderOffset = subscriptionPauseLimitReminderOffset;
    return this;
  }

   /**
   * Specifies the number of days prior to when we need to send a   \&quot;subscription pause limit reached reminder\&quot; email before the pause limit is reached.
   * @return subscriptionPauseLimitReminderOffset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the number of days prior to when we need to send a   \"subscription pause limit reached reminder\" email before the pause limit is reached.")

  public Integer getSubscriptionPauseLimitReminderOffset() {
    return subscriptionPauseLimitReminderOffset;
  }


  public void setSubscriptionPauseLimitReminderOffset(Integer subscriptionPauseLimitReminderOffset) {
    this.subscriptionPauseLimitReminderOffset = subscriptionPauseLimitReminderOffset;
  }


  public SubscriptionSettings subscriptionPausedReminderOffset(Integer subscriptionPausedReminderOffset) {
    
    this.subscriptionPausedReminderOffset = subscriptionPausedReminderOffset;
    return this;
  }

   /**
   * Specifies the number of days to send subscription paused reminder email.
   * @return subscriptionPausedReminderOffset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the number of days to send subscription paused reminder email.")

  public Integer getSubscriptionPausedReminderOffset() {
    return subscriptionPausedReminderOffset;
  }


  public void setSubscriptionPausedReminderOffset(Integer subscriptionPausedReminderOffset) {
    this.subscriptionPausedReminderOffset = subscriptionPausedReminderOffset;
  }


  public SubscriptionSettings auditInfo(AdminUserAuditInfo auditInfo) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionSettings subscriptionSettings = (SubscriptionSettings) o;
    return Objects.equals(this.continuityOrderDateOffset, subscriptionSettings.continuityOrderDateOffset) &&
        Objects.equals(this.pauseSubscriptionOffset, subscriptionSettings.pauseSubscriptionOffset) &&
        Objects.equals(this.nextOrderDateOffset, subscriptionSettings.nextOrderDateOffset) &&
        Objects.equals(this.skipSubscriptionOffset, subscriptionSettings.skipSubscriptionOffset) &&
        Objects.equals(this.subscriptionOrderReminderOffset, subscriptionSettings.subscriptionOrderReminderOffset) &&
        Objects.equals(this.orderNowResetNextOrderDate, subscriptionSettings.orderNowResetNextOrderDate) &&
        Objects.equals(this.subscriptionPauseLimitReminderOffset, subscriptionSettings.subscriptionPauseLimitReminderOffset) &&
        Objects.equals(this.subscriptionPausedReminderOffset, subscriptionSettings.subscriptionPausedReminderOffset) &&
        Objects.equals(this.auditInfo, subscriptionSettings.auditInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(continuityOrderDateOffset, pauseSubscriptionOffset, nextOrderDateOffset, skipSubscriptionOffset, subscriptionOrderReminderOffset, orderNowResetNextOrderDate, subscriptionPauseLimitReminderOffset, subscriptionPausedReminderOffset, auditInfo);
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
    sb.append("class SubscriptionSettings {\n");
    sb.append("    continuityOrderDateOffset: ").append(toIndentedString(continuityOrderDateOffset)).append("\n");
    sb.append("    pauseSubscriptionOffset: ").append(toIndentedString(pauseSubscriptionOffset)).append("\n");
    sb.append("    nextOrderDateOffset: ").append(toIndentedString(nextOrderDateOffset)).append("\n");
    sb.append("    skipSubscriptionOffset: ").append(toIndentedString(skipSubscriptionOffset)).append("\n");
    sb.append("    subscriptionOrderReminderOffset: ").append(toIndentedString(subscriptionOrderReminderOffset)).append("\n");
    sb.append("    orderNowResetNextOrderDate: ").append(toIndentedString(orderNowResetNextOrderDate)).append("\n");
    sb.append("    subscriptionPauseLimitReminderOffset: ").append(toIndentedString(subscriptionPauseLimitReminderOffset)).append("\n");
    sb.append("    subscriptionPausedReminderOffset: ").append(toIndentedString(subscriptionPausedReminderOffset)).append("\n");
    sb.append("    auditInfo: ").append(toIndentedString(auditInfo)).append("\n");
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
    openapiFields.add("continuityOrderDateOffset");
    openapiFields.add("pauseSubscriptionOffset");
    openapiFields.add("nextOrderDateOffset");
    openapiFields.add("skipSubscriptionOffset");
    openapiFields.add("subscriptionOrderReminderOffset");
    openapiFields.add("orderNowResetNextOrderDate");
    openapiFields.add("subscriptionPauseLimitReminderOffset");
    openapiFields.add("subscriptionPausedReminderOffset");
    openapiFields.add("auditInfo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SubscriptionSettings
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SubscriptionSettings.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SubscriptionSettings is not found in the empty JSON string", SubscriptionSettings.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!SubscriptionSettings.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SubscriptionSettings` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      // validate the optional field `auditInfo`
      if (jsonObj.get("auditInfo") != null && !jsonObj.get("auditInfo").isJsonNull()) {
        AdminUserAuditInfo.validateJsonObject(jsonObj.getAsJsonObject("auditInfo"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SubscriptionSettings.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SubscriptionSettings' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SubscriptionSettings> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SubscriptionSettings.class));

       return (TypeAdapter<T>) new TypeAdapter<SubscriptionSettings>() {
           @Override
           public void write(JsonWriter out, SubscriptionSettings value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SubscriptionSettings read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SubscriptionSettings given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SubscriptionSettings
  * @throws IOException if the JSON string is invalid with respect to SubscriptionSettings
  */
  public static SubscriptionSettings fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubscriptionSettings.class);
  }

 /**
  * Convert an instance of SubscriptionSettings to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

