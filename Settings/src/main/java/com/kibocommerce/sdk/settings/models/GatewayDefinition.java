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
import com.kibocommerce.sdk.settings.models.GatewayCredentialFieldDefinition;
import com.kibocommerce.sdk.settings.models.PreAuthorizeDefinition;
import com.kibocommerce.sdk.settings.models.SupportedCard;
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
 * GatewayDefinition
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GatewayDefinition implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "countryCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PROD_SERVICE_U_R_L = "prodServiceURL";
  @SerializedName(SERIALIZED_NAME_PROD_SERVICE_U_R_L)
  private String prodServiceURL;

  public static final String SERIALIZED_NAME_TEST_SERVICE_U_R_L = "testServiceURL";
  @SerializedName(SERIALIZED_NAME_TEST_SERVICE_U_R_L)
  private String testServiceURL;

  public static final String SERIALIZED_NAME_INTEGRATION_IMPL_TYPE_NAME = "integrationImplTypeName";
  @SerializedName(SERIALIZED_NAME_INTEGRATION_IMPL_TYPE_NAME)
  private String integrationImplTypeName;

  public static final String SERIALIZED_NAME_SUPPORTED_CARDS = "supportedCards";
  @SerializedName(SERIALIZED_NAME_SUPPORTED_CARDS)
  private List<SupportedCard> supportedCards = null;

  public static final String SERIALIZED_NAME_FEATURES = "features";
  @SerializedName(SERIALIZED_NAME_FEATURES)
  private List<String> features = null;

  public static final String SERIALIZED_NAME_CREDENTIAL_DEFINITIONS = "credentialDefinitions";
  @SerializedName(SERIALIZED_NAME_CREDENTIAL_DEFINITIONS)
  private List<GatewayCredentialFieldDefinition> credentialDefinitions = null;

  public static final String SERIALIZED_NAME_PRE_AUTHORIZE_DEFINITION = "preAuthorizeDefinition";
  @SerializedName(SERIALIZED_NAME_PRE_AUTHORIZE_DEFINITION)
  private PreAuthorizeDefinition preAuthorizeDefinition;

  public static final String SERIALIZED_NAME_ADMINISTATION_UI = "administationUi";
  @SerializedName(SERIALIZED_NAME_ADMINISTATION_UI)
  private List<Object> administationUi = null;

  public GatewayDefinition() {
  }

  public GatewayDefinition id(String id) {
    
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


  public GatewayDefinition countryCode(String countryCode) {
    
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Get countryCode
   * @return countryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCountryCode() {
    return countryCode;
  }


  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public GatewayDefinition name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public GatewayDefinition prodServiceURL(String prodServiceURL) {
    
    this.prodServiceURL = prodServiceURL;
    return this;
  }

   /**
   * Get prodServiceURL
   * @return prodServiceURL
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProdServiceURL() {
    return prodServiceURL;
  }


  public void setProdServiceURL(String prodServiceURL) {
    this.prodServiceURL = prodServiceURL;
  }


  public GatewayDefinition testServiceURL(String testServiceURL) {
    
    this.testServiceURL = testServiceURL;
    return this;
  }

   /**
   * Get testServiceURL
   * @return testServiceURL
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTestServiceURL() {
    return testServiceURL;
  }


  public void setTestServiceURL(String testServiceURL) {
    this.testServiceURL = testServiceURL;
  }


  public GatewayDefinition integrationImplTypeName(String integrationImplTypeName) {
    
    this.integrationImplTypeName = integrationImplTypeName;
    return this;
  }

   /**
   * Get integrationImplTypeName
   * @return integrationImplTypeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIntegrationImplTypeName() {
    return integrationImplTypeName;
  }


  public void setIntegrationImplTypeName(String integrationImplTypeName) {
    this.integrationImplTypeName = integrationImplTypeName;
  }


  public GatewayDefinition supportedCards(List<SupportedCard> supportedCards) {
    
    this.supportedCards = supportedCards;
    return this;
  }

  public GatewayDefinition addSupportedCardsItem(SupportedCard supportedCardsItem) {
    if (this.supportedCards == null) {
      this.supportedCards = new ArrayList<>();
    }
    this.supportedCards.add(supportedCardsItem);
    return this;
  }

   /**
   * Get supportedCards
   * @return supportedCards
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SupportedCard> getSupportedCards() {
    return supportedCards;
  }


  public void setSupportedCards(List<SupportedCard> supportedCards) {
    this.supportedCards = supportedCards;
  }


  public GatewayDefinition features(List<String> features) {
    
    this.features = features;
    return this;
  }

  public GatewayDefinition addFeaturesItem(String featuresItem) {
    if (this.features == null) {
      this.features = new ArrayList<>();
    }
    this.features.add(featuresItem);
    return this;
  }

   /**
   * Get features
   * @return features
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getFeatures() {
    return features;
  }


  public void setFeatures(List<String> features) {
    this.features = features;
  }


  public GatewayDefinition credentialDefinitions(List<GatewayCredentialFieldDefinition> credentialDefinitions) {
    
    this.credentialDefinitions = credentialDefinitions;
    return this;
  }

  public GatewayDefinition addCredentialDefinitionsItem(GatewayCredentialFieldDefinition credentialDefinitionsItem) {
    if (this.credentialDefinitions == null) {
      this.credentialDefinitions = new ArrayList<>();
    }
    this.credentialDefinitions.add(credentialDefinitionsItem);
    return this;
  }

   /**
   * Get credentialDefinitions
   * @return credentialDefinitions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GatewayCredentialFieldDefinition> getCredentialDefinitions() {
    return credentialDefinitions;
  }


  public void setCredentialDefinitions(List<GatewayCredentialFieldDefinition> credentialDefinitions) {
    this.credentialDefinitions = credentialDefinitions;
  }


  public GatewayDefinition preAuthorizeDefinition(PreAuthorizeDefinition preAuthorizeDefinition) {
    
    this.preAuthorizeDefinition = preAuthorizeDefinition;
    return this;
  }

   /**
   * Get preAuthorizeDefinition
   * @return preAuthorizeDefinition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PreAuthorizeDefinition getPreAuthorizeDefinition() {
    return preAuthorizeDefinition;
  }


  public void setPreAuthorizeDefinition(PreAuthorizeDefinition preAuthorizeDefinition) {
    this.preAuthorizeDefinition = preAuthorizeDefinition;
  }


  public GatewayDefinition administationUi(List<Object> administationUi) {
    
    this.administationUi = administationUi;
    return this;
  }

  public GatewayDefinition addAdministationUiItem(Object administationUiItem) {
    if (this.administationUi == null) {
      this.administationUi = new ArrayList<>();
    }
    this.administationUi.add(administationUiItem);
    return this;
  }

   /**
   * Get administationUi
   * @return administationUi
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Object> getAdministationUi() {
    return administationUi;
  }


  public void setAdministationUi(List<Object> administationUi) {
    this.administationUi = administationUi;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GatewayDefinition gatewayDefinition = (GatewayDefinition) o;
    return Objects.equals(this.id, gatewayDefinition.id) &&
        Objects.equals(this.countryCode, gatewayDefinition.countryCode) &&
        Objects.equals(this.name, gatewayDefinition.name) &&
        Objects.equals(this.prodServiceURL, gatewayDefinition.prodServiceURL) &&
        Objects.equals(this.testServiceURL, gatewayDefinition.testServiceURL) &&
        Objects.equals(this.integrationImplTypeName, gatewayDefinition.integrationImplTypeName) &&
        Objects.equals(this.supportedCards, gatewayDefinition.supportedCards) &&
        Objects.equals(this.features, gatewayDefinition.features) &&
        Objects.equals(this.credentialDefinitions, gatewayDefinition.credentialDefinitions) &&
        Objects.equals(this.preAuthorizeDefinition, gatewayDefinition.preAuthorizeDefinition) &&
        Objects.equals(this.administationUi, gatewayDefinition.administationUi);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, countryCode, name, prodServiceURL, testServiceURL, integrationImplTypeName, supportedCards, features, credentialDefinitions, preAuthorizeDefinition, administationUi);
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
    sb.append("class GatewayDefinition {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    prodServiceURL: ").append(toIndentedString(prodServiceURL)).append("\n");
    sb.append("    testServiceURL: ").append(toIndentedString(testServiceURL)).append("\n");
    sb.append("    integrationImplTypeName: ").append(toIndentedString(integrationImplTypeName)).append("\n");
    sb.append("    supportedCards: ").append(toIndentedString(supportedCards)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    credentialDefinitions: ").append(toIndentedString(credentialDefinitions)).append("\n");
    sb.append("    preAuthorizeDefinition: ").append(toIndentedString(preAuthorizeDefinition)).append("\n");
    sb.append("    administationUi: ").append(toIndentedString(administationUi)).append("\n");
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
    openapiFields.add("countryCode");
    openapiFields.add("name");
    openapiFields.add("prodServiceURL");
    openapiFields.add("testServiceURL");
    openapiFields.add("integrationImplTypeName");
    openapiFields.add("supportedCards");
    openapiFields.add("features");
    openapiFields.add("credentialDefinitions");
    openapiFields.add("preAuthorizeDefinition");
    openapiFields.add("administationUi");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GatewayDefinition
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GatewayDefinition.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GatewayDefinition is not found in the empty JSON string", GatewayDefinition.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!GatewayDefinition.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GatewayDefinition` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("countryCode") != null && !jsonObj.get("countryCode").isJsonNull()) && !jsonObj.get("countryCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `countryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("countryCode").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("prodServiceURL") != null && !jsonObj.get("prodServiceURL").isJsonNull()) && !jsonObj.get("prodServiceURL").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `prodServiceURL` to be a primitive type in the JSON string but got `%s`", jsonObj.get("prodServiceURL").toString()));
      }
      if ((jsonObj.get("testServiceURL") != null && !jsonObj.get("testServiceURL").isJsonNull()) && !jsonObj.get("testServiceURL").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `testServiceURL` to be a primitive type in the JSON string but got `%s`", jsonObj.get("testServiceURL").toString()));
      }
      if ((jsonObj.get("integrationImplTypeName") != null && !jsonObj.get("integrationImplTypeName").isJsonNull()) && !jsonObj.get("integrationImplTypeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `integrationImplTypeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("integrationImplTypeName").toString()));
      }
      if (jsonObj.get("supportedCards") != null && !jsonObj.get("supportedCards").isJsonNull()) {
        JsonArray jsonArraysupportedCards = jsonObj.getAsJsonArray("supportedCards");
        if (jsonArraysupportedCards != null) {
          // ensure the json data is an array
          if (!jsonObj.get("supportedCards").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `supportedCards` to be an array in the JSON string but got `%s`", jsonObj.get("supportedCards").toString()));
          }

          // validate the optional field `supportedCards` (array)
          for (int i = 0; i < jsonArraysupportedCards.size(); i++) {
            SupportedCard.validateJsonObject(jsonArraysupportedCards.get(i).getAsJsonObject());
          };
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("features").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `features` to be an array in the JSON string but got `%s`", jsonObj.get("features").toString()));
      }
      if (jsonObj.get("credentialDefinitions") != null && !jsonObj.get("credentialDefinitions").isJsonNull()) {
        JsonArray jsonArraycredentialDefinitions = jsonObj.getAsJsonArray("credentialDefinitions");
        if (jsonArraycredentialDefinitions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("credentialDefinitions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `credentialDefinitions` to be an array in the JSON string but got `%s`", jsonObj.get("credentialDefinitions").toString()));
          }

          // validate the optional field `credentialDefinitions` (array)
          for (int i = 0; i < jsonArraycredentialDefinitions.size(); i++) {
            GatewayCredentialFieldDefinition.validateJsonObject(jsonArraycredentialDefinitions.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `preAuthorizeDefinition`
      if (jsonObj.get("preAuthorizeDefinition") != null && !jsonObj.get("preAuthorizeDefinition").isJsonNull()) {
        PreAuthorizeDefinition.validateJsonObject(jsonObj.getAsJsonObject("preAuthorizeDefinition"));
      }
      // ensure the json data is an array
      if (!jsonObj.get("administationUi").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `administationUi` to be an array in the JSON string but got `%s`", jsonObj.get("administationUi").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GatewayDefinition.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GatewayDefinition' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GatewayDefinition> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GatewayDefinition.class));

       return (TypeAdapter<T>) new TypeAdapter<GatewayDefinition>() {
           @Override
           public void write(JsonWriter out, GatewayDefinition value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GatewayDefinition read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GatewayDefinition given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GatewayDefinition
  * @throws IOException if the JSON string is invalid with respect to GatewayDefinition
  */
  public static GatewayDefinition fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GatewayDefinition.class);
  }

 /**
  * Convert an instance of GatewayDefinition to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
