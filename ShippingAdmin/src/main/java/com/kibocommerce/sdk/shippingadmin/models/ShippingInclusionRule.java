/*
 * Kibo Shipping Admin Service
 * OpenAPI Spec for Kibo Shipping Admin Service
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.shippingadmin.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kibocommerce.sdk.shippingadmin.models.AdminUserAuditInfo;
import com.kibocommerce.sdk.shippingadmin.models.ServiceType;
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
 * An object to bind service types to shipping target rules and/or product target rules
 */
@ApiModel(description = "An object to bind service types to shipping target rules and/or product target rules")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ShippingInclusionRule implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_SEQUENCE = "sequence";
  @SerializedName(SERIALIZED_NAME_SEQUENCE)
  private Integer sequence;

  public static final String SERIALIZED_NAME_SHIPPING_TARGET_RULE_CODES = "shippingTargetRuleCodes";
  @SerializedName(SERIALIZED_NAME_SHIPPING_TARGET_RULE_CODES)
  private List<String> shippingTargetRuleCodes = null;

  public static final String SERIALIZED_NAME_PRODUCT_TARGET_RULE_CODES = "productTargetRuleCodes";
  @SerializedName(SERIALIZED_NAME_PRODUCT_TARGET_RULE_CODES)
  private List<String> productTargetRuleCodes = null;

  public static final String SERIALIZED_NAME_SERVICE_TYPES = "serviceTypes";
  @SerializedName(SERIALIZED_NAME_SERVICE_TYPES)
  private List<ServiceType> serviceTypes = null;

  public static final String SERIALIZED_NAME_AUDIT_INFO = "auditInfo";
  @SerializedName(SERIALIZED_NAME_AUDIT_INFO)
  private AdminUserAuditInfo auditInfo;

  public ShippingInclusionRule() {
  }

  public ShippingInclusionRule id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The system generated id of this shipping inclusion rule
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The system generated id of this shipping inclusion rule")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ShippingInclusionRule sequence(Integer sequence) {
    
    this.sequence = sequence;
    return this;
  }

   /**
   * The sequence in which this rule is preferred over others
   * @return sequence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The sequence in which this rule is preferred over others")

  public Integer getSequence() {
    return sequence;
  }


  public void setSequence(Integer sequence) {
    this.sequence = sequence;
  }


  public ShippingInclusionRule shippingTargetRuleCodes(List<String> shippingTargetRuleCodes) {
    
    this.shippingTargetRuleCodes = shippingTargetRuleCodes;
    return this;
  }

  public ShippingInclusionRule addShippingTargetRuleCodesItem(String shippingTargetRuleCodesItem) {
    if (this.shippingTargetRuleCodes == null) {
      this.shippingTargetRuleCodes = new ArrayList<>();
    }
    this.shippingTargetRuleCodes.add(shippingTargetRuleCodesItem);
    return this;
  }

   /**
   * The shipping target rule codes associated with this rule  &lt;remarks&gt;leave empty or null to denote all destinations&lt;/remarks&gt;
   * @return shippingTargetRuleCodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The shipping target rule codes associated with this rule  <remarks>leave empty or null to denote all destinations</remarks>")

  public List<String> getShippingTargetRuleCodes() {
    return shippingTargetRuleCodes;
  }


  public void setShippingTargetRuleCodes(List<String> shippingTargetRuleCodes) {
    this.shippingTargetRuleCodes = shippingTargetRuleCodes;
  }


  public ShippingInclusionRule productTargetRuleCodes(List<String> productTargetRuleCodes) {
    
    this.productTargetRuleCodes = productTargetRuleCodes;
    return this;
  }

  public ShippingInclusionRule addProductTargetRuleCodesItem(String productTargetRuleCodesItem) {
    if (this.productTargetRuleCodes == null) {
      this.productTargetRuleCodes = new ArrayList<>();
    }
    this.productTargetRuleCodes.add(productTargetRuleCodesItem);
    return this;
  }

   /**
   * the product target rule codes associated with this rule  &lt;remarks&gt;leave empty or null to denote all products&lt;/remarks&gt;
   * @return productTargetRuleCodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the product target rule codes associated with this rule  <remarks>leave empty or null to denote all products</remarks>")

  public List<String> getProductTargetRuleCodes() {
    return productTargetRuleCodes;
  }


  public void setProductTargetRuleCodes(List<String> productTargetRuleCodes) {
    this.productTargetRuleCodes = productTargetRuleCodes;
  }


  public ShippingInclusionRule serviceTypes(List<ServiceType> serviceTypes) {
    
    this.serviceTypes = serviceTypes;
    return this;
  }

  public ShippingInclusionRule addServiceTypesItem(ServiceType serviceTypesItem) {
    if (this.serviceTypes == null) {
      this.serviceTypes = new ArrayList<>();
    }
    this.serviceTypes.add(serviceTypesItem);
    return this;
  }

   /**
   * the servicetypes associated with this rule  &lt;remarks&gt;leave empty or null to denote all carriers and subsequent service types&lt;/remarks&gt;
   * @return serviceTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the servicetypes associated with this rule  <remarks>leave empty or null to denote all carriers and subsequent service types</remarks>")

  public List<ServiceType> getServiceTypes() {
    return serviceTypes;
  }


  public void setServiceTypes(List<ServiceType> serviceTypes) {
    this.serviceTypes = serviceTypes;
  }


  public ShippingInclusionRule auditInfo(AdminUserAuditInfo auditInfo) {
    
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
    ShippingInclusionRule shippingInclusionRule = (ShippingInclusionRule) o;
    return Objects.equals(this.id, shippingInclusionRule.id) &&
        Objects.equals(this.sequence, shippingInclusionRule.sequence) &&
        Objects.equals(this.shippingTargetRuleCodes, shippingInclusionRule.shippingTargetRuleCodes) &&
        Objects.equals(this.productTargetRuleCodes, shippingInclusionRule.productTargetRuleCodes) &&
        Objects.equals(this.serviceTypes, shippingInclusionRule.serviceTypes) &&
        Objects.equals(this.auditInfo, shippingInclusionRule.auditInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, sequence, shippingTargetRuleCodes, productTargetRuleCodes, serviceTypes, auditInfo);
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
    sb.append("class ShippingInclusionRule {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
    sb.append("    shippingTargetRuleCodes: ").append(toIndentedString(shippingTargetRuleCodes)).append("\n");
    sb.append("    productTargetRuleCodes: ").append(toIndentedString(productTargetRuleCodes)).append("\n");
    sb.append("    serviceTypes: ").append(toIndentedString(serviceTypes)).append("\n");
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
    openapiFields.add("sequence");
    openapiFields.add("shippingTargetRuleCodes");
    openapiFields.add("productTargetRuleCodes");
    openapiFields.add("serviceTypes");
    openapiFields.add("auditInfo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ShippingInclusionRule
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ShippingInclusionRule.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ShippingInclusionRule is not found in the empty JSON string", ShippingInclusionRule.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!ShippingInclusionRule.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ShippingInclusionRule` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("shippingTargetRuleCodes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `shippingTargetRuleCodes` to be an array in the JSON string but got `%s`", jsonObj.get("shippingTargetRuleCodes").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("productTargetRuleCodes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `productTargetRuleCodes` to be an array in the JSON string but got `%s`", jsonObj.get("productTargetRuleCodes").toString()));
      }
      if (jsonObj.get("serviceTypes") != null && !jsonObj.get("serviceTypes").isJsonNull()) {
        JsonArray jsonArrayserviceTypes = jsonObj.getAsJsonArray("serviceTypes");
        if (jsonArrayserviceTypes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("serviceTypes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `serviceTypes` to be an array in the JSON string but got `%s`", jsonObj.get("serviceTypes").toString()));
          }

          // validate the optional field `serviceTypes` (array)
          for (int i = 0; i < jsonArrayserviceTypes.size(); i++) {
            ServiceType.validateJsonObject(jsonArrayserviceTypes.get(i).getAsJsonObject());
          };
        }
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
       if (!ShippingInclusionRule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ShippingInclusionRule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ShippingInclusionRule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ShippingInclusionRule.class));

       return (TypeAdapter<T>) new TypeAdapter<ShippingInclusionRule>() {
           @Override
           public void write(JsonWriter out, ShippingInclusionRule value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ShippingInclusionRule read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ShippingInclusionRule given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ShippingInclusionRule
  * @throws IOException if the JSON string is invalid with respect to ShippingInclusionRule
  */
  public static ShippingInclusionRule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ShippingInclusionRule.class);
  }

 /**
  * Convert an instance of ShippingInclusionRule to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

