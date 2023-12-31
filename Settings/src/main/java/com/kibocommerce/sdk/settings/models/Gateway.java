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
import com.kibocommerce.sdk.settings.models.GatewayAccount;
import com.kibocommerce.sdk.settings.models.GatewayDefinition;
import com.kibocommerce.sdk.settings.models.SiteGatewaySupportedCard;
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
 * Gateway
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Gateway implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_GATEWAY_DEFINITION = "gatewayDefinition";
  @SerializedName(SERIALIZED_NAME_GATEWAY_DEFINITION)
  private GatewayDefinition gatewayDefinition;

  public static final String SERIALIZED_NAME_ARE_GATEWAY_CREDENTIAL_FIELDS_SET = "areGatewayCredentialFieldsSet";
  @SerializedName(SERIALIZED_NAME_ARE_GATEWAY_CREDENTIAL_FIELDS_SET)
  private Boolean areGatewayCredentialFieldsSet;

  public static final String SERIALIZED_NAME_GATEWAY_ACCOUNT = "gatewayAccount";
  @SerializedName(SERIALIZED_NAME_GATEWAY_ACCOUNT)
  private GatewayAccount gatewayAccount;

  public static final String SERIALIZED_NAME_SUPPORTED_CARDS = "supportedCards";
  @SerializedName(SERIALIZED_NAME_SUPPORTED_CARDS)
  private List<String> supportedCards = null;

  public static final String SERIALIZED_NAME_SITE_GATEWAY_SUPPORTED_CARDS = "siteGatewaySupportedCards";
  @SerializedName(SERIALIZED_NAME_SITE_GATEWAY_SUPPORTED_CARDS)
  private List<SiteGatewaySupportedCard> siteGatewaySupportedCards = null;

  public Gateway() {
  }

  public Gateway gatewayDefinition(GatewayDefinition gatewayDefinition) {
    
    this.gatewayDefinition = gatewayDefinition;
    return this;
  }

   /**
   * Get gatewayDefinition
   * @return gatewayDefinition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GatewayDefinition getGatewayDefinition() {
    return gatewayDefinition;
  }


  public void setGatewayDefinition(GatewayDefinition gatewayDefinition) {
    this.gatewayDefinition = gatewayDefinition;
  }


  public Gateway areGatewayCredentialFieldsSet(Boolean areGatewayCredentialFieldsSet) {
    
    this.areGatewayCredentialFieldsSet = areGatewayCredentialFieldsSet;
    return this;
  }

   /**
   * Returns true if Gateway CredentialsField is set. For security purposes, Gateway subresource CredentialFields will not be returned.
   * @return areGatewayCredentialFieldsSet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Returns true if Gateway CredentialsField is set. For security purposes, Gateway subresource CredentialFields will not be returned.")

  public Boolean getAreGatewayCredentialFieldsSet() {
    return areGatewayCredentialFieldsSet;
  }


  public void setAreGatewayCredentialFieldsSet(Boolean areGatewayCredentialFieldsSet) {
    this.areGatewayCredentialFieldsSet = areGatewayCredentialFieldsSet;
  }


  public Gateway gatewayAccount(GatewayAccount gatewayAccount) {
    
    this.gatewayAccount = gatewayAccount;
    return this;
  }

   /**
   * Get gatewayAccount
   * @return gatewayAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GatewayAccount getGatewayAccount() {
    return gatewayAccount;
  }


  public void setGatewayAccount(GatewayAccount gatewayAccount) {
    this.gatewayAccount = gatewayAccount;
  }


  public Gateway supportedCards(List<String> supportedCards) {
    
    this.supportedCards = supportedCards;
    return this;
  }

  public Gateway addSupportedCardsItem(String supportedCardsItem) {
    if (this.supportedCards == null) {
      this.supportedCards = new ArrayList<>();
    }
    this.supportedCards.add(supportedCardsItem);
    return this;
  }

   /**
   * Which credit cards the Merchant supports
   * @return supportedCards
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Which credit cards the Merchant supports")

  public List<String> getSupportedCards() {
    return supportedCards;
  }


  public void setSupportedCards(List<String> supportedCards) {
    this.supportedCards = supportedCards;
  }


  public Gateway siteGatewaySupportedCards(List<SiteGatewaySupportedCard> siteGatewaySupportedCards) {
    
    this.siteGatewaySupportedCards = siteGatewaySupportedCards;
    return this;
  }

  public Gateway addSiteGatewaySupportedCardsItem(SiteGatewaySupportedCard siteGatewaySupportedCardsItem) {
    if (this.siteGatewaySupportedCards == null) {
      this.siteGatewaySupportedCards = new ArrayList<>();
    }
    this.siteGatewaySupportedCards.add(siteGatewaySupportedCardsItem);
    return this;
  }

   /**
   * Which credit cards the Merchant supports
   * @return siteGatewaySupportedCards
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Which credit cards the Merchant supports")

  public List<SiteGatewaySupportedCard> getSiteGatewaySupportedCards() {
    return siteGatewaySupportedCards;
  }


  public void setSiteGatewaySupportedCards(List<SiteGatewaySupportedCard> siteGatewaySupportedCards) {
    this.siteGatewaySupportedCards = siteGatewaySupportedCards;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Gateway gateway = (Gateway) o;
    return Objects.equals(this.gatewayDefinition, gateway.gatewayDefinition) &&
        Objects.equals(this.areGatewayCredentialFieldsSet, gateway.areGatewayCredentialFieldsSet) &&
        Objects.equals(this.gatewayAccount, gateway.gatewayAccount) &&
        Objects.equals(this.supportedCards, gateway.supportedCards) &&
        Objects.equals(this.siteGatewaySupportedCards, gateway.siteGatewaySupportedCards);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(gatewayDefinition, areGatewayCredentialFieldsSet, gatewayAccount, supportedCards, siteGatewaySupportedCards);
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
    sb.append("class Gateway {\n");
    sb.append("    gatewayDefinition: ").append(toIndentedString(gatewayDefinition)).append("\n");
    sb.append("    areGatewayCredentialFieldsSet: ").append(toIndentedString(areGatewayCredentialFieldsSet)).append("\n");
    sb.append("    gatewayAccount: ").append(toIndentedString(gatewayAccount)).append("\n");
    sb.append("    supportedCards: ").append(toIndentedString(supportedCards)).append("\n");
    sb.append("    siteGatewaySupportedCards: ").append(toIndentedString(siteGatewaySupportedCards)).append("\n");
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
    openapiFields.add("gatewayDefinition");
    openapiFields.add("areGatewayCredentialFieldsSet");
    openapiFields.add("gatewayAccount");
    openapiFields.add("supportedCards");
    openapiFields.add("siteGatewaySupportedCards");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Gateway
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Gateway.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Gateway is not found in the empty JSON string", Gateway.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!Gateway.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Gateway` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      // validate the optional field `gatewayDefinition`
      if (jsonObj.get("gatewayDefinition") != null && !jsonObj.get("gatewayDefinition").isJsonNull()) {
        GatewayDefinition.validateJsonObject(jsonObj.getAsJsonObject("gatewayDefinition"));
      }
      // validate the optional field `gatewayAccount`
      if (jsonObj.get("gatewayAccount") != null && !jsonObj.get("gatewayAccount").isJsonNull()) {
        GatewayAccount.validateJsonObject(jsonObj.getAsJsonObject("gatewayAccount"));
      }
      // ensure the json data is an array
      if (!jsonObj.get("supportedCards").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `supportedCards` to be an array in the JSON string but got `%s`", jsonObj.get("supportedCards").toString()));
      }
      if (jsonObj.get("siteGatewaySupportedCards") != null && !jsonObj.get("siteGatewaySupportedCards").isJsonNull()) {
        JsonArray jsonArraysiteGatewaySupportedCards = jsonObj.getAsJsonArray("siteGatewaySupportedCards");
        if (jsonArraysiteGatewaySupportedCards != null) {
          // ensure the json data is an array
          if (!jsonObj.get("siteGatewaySupportedCards").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `siteGatewaySupportedCards` to be an array in the JSON string but got `%s`", jsonObj.get("siteGatewaySupportedCards").toString()));
          }

          // validate the optional field `siteGatewaySupportedCards` (array)
          for (int i = 0; i < jsonArraysiteGatewaySupportedCards.size(); i++) {
            SiteGatewaySupportedCard.validateJsonObject(jsonArraysiteGatewaySupportedCards.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Gateway.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Gateway' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Gateway> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Gateway.class));

       return (TypeAdapter<T>) new TypeAdapter<Gateway>() {
           @Override
           public void write(JsonWriter out, Gateway value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Gateway read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Gateway given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Gateway
  * @throws IOException if the JSON string is invalid with respect to Gateway
  */
  public static Gateway fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Gateway.class);
  }

 /**
  * Convert an instance of Gateway to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

