/*
 * Kibo Reservation Web API
 * OpenAPI Spec for Kibo Reservation Web API
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.reservation.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kibocommerce.sdk.reservation.models.AuditInf;
import com.kibocommerce.sdk.reservation.models.ReservationItem;
import com.kibocommerce.sdk.reservation.models.ReservationWebAPIChangeMessage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * Reservati
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Reservati implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_SITE_ID = "siteId";
  @SerializedName(SERIALIZED_NAME_SITE_ID)
  private Integer siteId;

  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private Integer tenantId;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_CUSTOMER_ACCOUNT_ID = "customerAccountId";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ACCOUNT_ID)
  private Integer customerAccountId;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<ReservationItem> items = null;

  public static final String SERIALIZED_NAME_CART_ID = "cartId";
  @SerializedName(SERIALIZED_NAME_CART_ID)
  private String cartId;

  public static final String SERIALIZED_NAME_ORDER_ID = "orderId";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private String orderId;

  public static final String SERIALIZED_NAME_ORDER_NUMBER = "orderNumber";
  @SerializedName(SERIALIZED_NAME_ORDER_NUMBER)
  private Integer orderNumber;

  public static final String SERIALIZED_NAME_EXPIRATION_DATE_TIME = "expirationDateTime";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_DATE_TIME)
  private OffsetDateTime expirationDateTime;

  public static final String SERIALIZED_NAME_ZIP_CODE = "zipCode";
  @SerializedName(SERIALIZED_NAME_ZIP_CODE)
  private String zipCode;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_AUDIT_INFO = "auditInfo";
  @SerializedName(SERIALIZED_NAME_AUDIT_INFO)
  private AuditInf auditInfo;

  public static final String SERIALIZED_NAME_CHANGE_MESSAGES = "changeMessages";
  @SerializedName(SERIALIZED_NAME_CHANGE_MESSAGES)
  private List<ReservationWebAPIChangeMessage> changeMessages = null;

  public static final String SERIALIZED_NAME_RESERVATION_TYPE = "reservationType";
  @SerializedName(SERIALIZED_NAME_RESERVATION_TYPE)
  private String reservationType;

  public Reservati() {
  }

  public Reservati id(String id) {
    
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


  public Reservati siteId(Integer siteId) {
    
    this.siteId = siteId;
    return this;
  }

   /**
   * Get siteId
   * @return siteId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSiteId() {
    return siteId;
  }


  public void setSiteId(Integer siteId) {
    this.siteId = siteId;
  }


  public Reservati tenantId(Integer tenantId) {
    
    this.tenantId = tenantId;
    return this;
  }

   /**
   * Get tenantId
   * @return tenantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTenantId() {
    return tenantId;
  }


  public void setTenantId(Integer tenantId) {
    this.tenantId = tenantId;
  }


  public Reservati userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public Reservati customerAccountId(Integer customerAccountId) {
    
    this.customerAccountId = customerAccountId;
    return this;
  }

   /**
   * Get customerAccountId
   * @return customerAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCustomerAccountId() {
    return customerAccountId;
  }


  public void setCustomerAccountId(Integer customerAccountId) {
    this.customerAccountId = customerAccountId;
  }


  public Reservati items(List<ReservationItem> items) {
    
    this.items = items;
    return this;
  }

  public Reservati addItemsItem(ReservationItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ReservationItem> getItems() {
    return items;
  }


  public void setItems(List<ReservationItem> items) {
    this.items = items;
  }


  public Reservati cartId(String cartId) {
    
    this.cartId = cartId;
    return this;
  }

   /**
   * Get cartId
   * @return cartId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCartId() {
    return cartId;
  }


  public void setCartId(String cartId) {
    this.cartId = cartId;
  }


  public Reservati orderId(String orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * Get orderId
   * @return orderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOrderId() {
    return orderId;
  }


  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  public Reservati orderNumber(Integer orderNumber) {
    
    this.orderNumber = orderNumber;
    return this;
  }

   /**
   * Get orderNumber
   * @return orderNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getOrderNumber() {
    return orderNumber;
  }


  public void setOrderNumber(Integer orderNumber) {
    this.orderNumber = orderNumber;
  }


  public Reservati expirationDateTime(OffsetDateTime expirationDateTime) {
    
    this.expirationDateTime = expirationDateTime;
    return this;
  }

   /**
   * Get expirationDateTime
   * @return expirationDateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getExpirationDateTime() {
    return expirationDateTime;
  }


  public void setExpirationDateTime(OffsetDateTime expirationDateTime) {
    this.expirationDateTime = expirationDateTime;
  }


  public Reservati zipCode(String zipCode) {
    
    this.zipCode = zipCode;
    return this;
  }

   /**
   * Get zipCode
   * @return zipCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getZipCode() {
    return zipCode;
  }


  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }


  public Reservati status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public Reservati auditInfo(AuditInf auditInfo) {
    
    this.auditInfo = auditInfo;
    return this;
  }

   /**
   * Get auditInfo
   * @return auditInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AuditInf getAuditInfo() {
    return auditInfo;
  }


  public void setAuditInfo(AuditInf auditInfo) {
    this.auditInfo = auditInfo;
  }


  public Reservati changeMessages(List<ReservationWebAPIChangeMessage> changeMessages) {
    
    this.changeMessages = changeMessages;
    return this;
  }

  public Reservati addChangeMessagesItem(ReservationWebAPIChangeMessage changeMessagesItem) {
    if (this.changeMessages == null) {
      this.changeMessages = new ArrayList<>();
    }
    this.changeMessages.add(changeMessagesItem);
    return this;
  }

   /**
   * Get changeMessages
   * @return changeMessages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ReservationWebAPIChangeMessage> getChangeMessages() {
    return changeMessages;
  }


  public void setChangeMessages(List<ReservationWebAPIChangeMessage> changeMessages) {
    this.changeMessages = changeMessages;
  }


  public Reservati reservationType(String reservationType) {
    
    this.reservationType = reservationType;
    return this;
  }

   /**
   * Get reservationType
   * @return reservationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReservationType() {
    return reservationType;
  }


  public void setReservationType(String reservationType) {
    this.reservationType = reservationType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reservati reservati = (Reservati) o;
    return Objects.equals(this.id, reservati.id) &&
        Objects.equals(this.siteId, reservati.siteId) &&
        Objects.equals(this.tenantId, reservati.tenantId) &&
        Objects.equals(this.userId, reservati.userId) &&
        Objects.equals(this.customerAccountId, reservati.customerAccountId) &&
        Objects.equals(this.items, reservati.items) &&
        Objects.equals(this.cartId, reservati.cartId) &&
        Objects.equals(this.orderId, reservati.orderId) &&
        Objects.equals(this.orderNumber, reservati.orderNumber) &&
        Objects.equals(this.expirationDateTime, reservati.expirationDateTime) &&
        Objects.equals(this.zipCode, reservati.zipCode) &&
        Objects.equals(this.status, reservati.status) &&
        Objects.equals(this.auditInfo, reservati.auditInfo) &&
        Objects.equals(this.changeMessages, reservati.changeMessages) &&
        Objects.equals(this.reservationType, reservati.reservationType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, siteId, tenantId, userId, customerAccountId, items, cartId, orderId, orderNumber, expirationDateTime, zipCode, status, auditInfo, changeMessages, reservationType);
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
    sb.append("class Reservati {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    customerAccountId: ").append(toIndentedString(customerAccountId)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    cartId: ").append(toIndentedString(cartId)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    orderNumber: ").append(toIndentedString(orderNumber)).append("\n");
    sb.append("    expirationDateTime: ").append(toIndentedString(expirationDateTime)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    auditInfo: ").append(toIndentedString(auditInfo)).append("\n");
    sb.append("    changeMessages: ").append(toIndentedString(changeMessages)).append("\n");
    sb.append("    reservationType: ").append(toIndentedString(reservationType)).append("\n");
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
    openapiFields.add("siteId");
    openapiFields.add("tenantId");
    openapiFields.add("userId");
    openapiFields.add("customerAccountId");
    openapiFields.add("items");
    openapiFields.add("cartId");
    openapiFields.add("orderId");
    openapiFields.add("orderNumber");
    openapiFields.add("expirationDateTime");
    openapiFields.add("zipCode");
    openapiFields.add("status");
    openapiFields.add("auditInfo");
    openapiFields.add("changeMessages");
    openapiFields.add("reservationType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Reservati
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Reservati.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Reservati is not found in the empty JSON string", Reservati.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!Reservati.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Reservati` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("userId") != null && !jsonObj.get("userId").isJsonNull()) && !jsonObj.get("userId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userId").toString()));
      }
      if (jsonObj.get("items") != null && !jsonObj.get("items").isJsonNull()) {
        JsonArray jsonArrayitems = jsonObj.getAsJsonArray("items");
        if (jsonArrayitems != null) {
          // ensure the json data is an array
          if (!jsonObj.get("items").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `items` to be an array in the JSON string but got `%s`", jsonObj.get("items").toString()));
          }

          // validate the optional field `items` (array)
          for (int i = 0; i < jsonArrayitems.size(); i++) {
            ReservationItem.validateJsonObject(jsonArrayitems.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("cartId") != null && !jsonObj.get("cartId").isJsonNull()) && !jsonObj.get("cartId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cartId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cartId").toString()));
      }
      if ((jsonObj.get("orderId") != null && !jsonObj.get("orderId").isJsonNull()) && !jsonObj.get("orderId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orderId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orderId").toString()));
      }
      if ((jsonObj.get("zipCode") != null && !jsonObj.get("zipCode").isJsonNull()) && !jsonObj.get("zipCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `zipCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("zipCode").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `auditInfo`
      if (jsonObj.get("auditInfo") != null && !jsonObj.get("auditInfo").isJsonNull()) {
        AuditInf.validateJsonObject(jsonObj.getAsJsonObject("auditInfo"));
      }
      if (jsonObj.get("changeMessages") != null && !jsonObj.get("changeMessages").isJsonNull()) {
        JsonArray jsonArraychangeMessages = jsonObj.getAsJsonArray("changeMessages");
        if (jsonArraychangeMessages != null) {
          // ensure the json data is an array
          if (!jsonObj.get("changeMessages").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `changeMessages` to be an array in the JSON string but got `%s`", jsonObj.get("changeMessages").toString()));
          }

          // validate the optional field `changeMessages` (array)
          for (int i = 0; i < jsonArraychangeMessages.size(); i++) {
            ReservationWebAPIChangeMessage.validateJsonObject(jsonArraychangeMessages.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("reservationType") != null && !jsonObj.get("reservationType").isJsonNull()) && !jsonObj.get("reservationType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reservationType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reservationType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Reservati.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Reservati' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Reservati> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Reservati.class));

       return (TypeAdapter<T>) new TypeAdapter<Reservati>() {
           @Override
           public void write(JsonWriter out, Reservati value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Reservati read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Reservati given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Reservati
  * @throws IOException if the JSON string is invalid with respect to Reservati
  */
  public static Reservati fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Reservati.class);
  }

 /**
  * Convert an instance of Reservati to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

