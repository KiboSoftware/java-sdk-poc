/*
 * Kibo SubscriptionRuntime Service
 * OpenAPI Spec for Kibo SubscriptionRuntime Service
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.subscription.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kibocommerce.sdk.subscription.models.AdminUserAuditInfo;
import com.kibocommerce.sdk.subscription.models.GatewayGiftCard;
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
 * CommerceRuntimeCredit
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CommerceRuntimeCredit implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_PARENT_PAYMENT_ID = "parentPaymentId";
  @SerializedName(SERIALIZED_NAME_PARENT_PAYMENT_ID)
  private String parentPaymentId;

  public static final String SERIALIZED_NAME_PARENT_PAYMENT_INTERACTION_ID = "parentPaymentInteractionId";
  @SerializedName(SERIALIZED_NAME_PARENT_PAYMENT_INTERACTION_ID)
  private String parentPaymentInteractionId;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Double amount;

  public static final String SERIALIZED_NAME_GIFT_CARD = "giftCard";
  @SerializedName(SERIALIZED_NAME_GIFT_CARD)
  private GatewayGiftCard giftCard;

  public static final String SERIALIZED_NAME_AUDIT_INFO = "auditInfo";
  @SerializedName(SERIALIZED_NAME_AUDIT_INFO)
  private AdminUserAuditInfo auditInfo;

  public CommerceRuntimeCredit() {
  }

  public CommerceRuntimeCredit id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of this order transaction.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier of this order transaction.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public CommerceRuntimeCredit parentPaymentId(String parentPaymentId) {
    
    this.parentPaymentId = parentPaymentId;
    return this;
  }

   /**
   * The paymentid of the Parent Payment associated with this Credit (if applicable).
   * @return parentPaymentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The paymentid of the Parent Payment associated with this Credit (if applicable).")

  public String getParentPaymentId() {
    return parentPaymentId;
  }


  public void setParentPaymentId(String parentPaymentId) {
    this.parentPaymentId = parentPaymentId;
  }


  public CommerceRuntimeCredit parentPaymentInteractionId(String parentPaymentInteractionId) {
    
    this.parentPaymentInteractionId = parentPaymentInteractionId;
    return this;
  }

   /**
   * Get parentPaymentInteractionId
   * @return parentPaymentInteractionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getParentPaymentInteractionId() {
    return parentPaymentInteractionId;
  }


  public void setParentPaymentInteractionId(String parentPaymentInteractionId) {
    this.parentPaymentInteractionId = parentPaymentInteractionId;
  }


  public CommerceRuntimeCredit amount(Double amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Amount credited.
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Amount credited.")

  public Double getAmount() {
    return amount;
  }


  public void setAmount(Double amount) {
    this.amount = amount;
  }


  public CommerceRuntimeCredit giftCard(GatewayGiftCard giftCard) {
    
    this.giftCard = giftCard;
    return this;
  }

   /**
   * Get giftCard
   * @return giftCard
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GatewayGiftCard getGiftCard() {
    return giftCard;
  }


  public void setGiftCard(GatewayGiftCard giftCard) {
    this.giftCard = giftCard;
  }


  public CommerceRuntimeCredit auditInfo(AdminUserAuditInfo auditInfo) {
    
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
    CommerceRuntimeCredit commerceRuntimeCredit = (CommerceRuntimeCredit) o;
    return Objects.equals(this.id, commerceRuntimeCredit.id) &&
        Objects.equals(this.parentPaymentId, commerceRuntimeCredit.parentPaymentId) &&
        Objects.equals(this.parentPaymentInteractionId, commerceRuntimeCredit.parentPaymentInteractionId) &&
        Objects.equals(this.amount, commerceRuntimeCredit.amount) &&
        Objects.equals(this.giftCard, commerceRuntimeCredit.giftCard) &&
        Objects.equals(this.auditInfo, commerceRuntimeCredit.auditInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parentPaymentId, parentPaymentInteractionId, amount, giftCard, auditInfo);
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
    sb.append("class CommerceRuntimeCredit {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parentPaymentId: ").append(toIndentedString(parentPaymentId)).append("\n");
    sb.append("    parentPaymentInteractionId: ").append(toIndentedString(parentPaymentInteractionId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    giftCard: ").append(toIndentedString(giftCard)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("parentPaymentId");
    openapiFields.add("parentPaymentInteractionId");
    openapiFields.add("amount");
    openapiFields.add("giftCard");
    openapiFields.add("auditInfo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CommerceRuntimeCredit
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CommerceRuntimeCredit.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CommerceRuntimeCredit is not found in the empty JSON string", CommerceRuntimeCredit.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!CommerceRuntimeCredit.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CommerceRuntimeCredit` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("parentPaymentId") != null && !jsonObj.get("parentPaymentId").isJsonNull()) && !jsonObj.get("parentPaymentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parentPaymentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parentPaymentId").toString()));
      }
      if ((jsonObj.get("parentPaymentInteractionId") != null && !jsonObj.get("parentPaymentInteractionId").isJsonNull()) && !jsonObj.get("parentPaymentInteractionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parentPaymentInteractionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parentPaymentInteractionId").toString()));
      }
      // validate the optional field `giftCard`
      if (jsonObj.get("giftCard") != null && !jsonObj.get("giftCard").isJsonNull()) {
        GatewayGiftCard.validateJsonObject(jsonObj.getAsJsonObject("giftCard"));
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
       if (!CommerceRuntimeCredit.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CommerceRuntimeCredit' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CommerceRuntimeCredit> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CommerceRuntimeCredit.class));

       return (TypeAdapter<T>) new TypeAdapter<CommerceRuntimeCredit>() {
           @Override
           public void write(JsonWriter out, CommerceRuntimeCredit value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CommerceRuntimeCredit read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CommerceRuntimeCredit given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CommerceRuntimeCredit
  * @throws IOException if the JSON string is invalid with respect to CommerceRuntimeCredit
  */
  public static CommerceRuntimeCredit fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CommerceRuntimeCredit.class);
  }

 /**
  * Convert an instance of CommerceRuntimeCredit to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

