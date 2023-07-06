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
import com.kibocommerce.sdk.shippingadmin.models.CarrierCredentialSetValue;
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
 * Stores a set of &lt;see cref&#x3D;\&quot;T:Mozu.ShippingAdmin.Contracts.Carriers.CarrierCredentialSetValue\&quot;&gt;carrier credential key-value pairs&lt;/see&gt;.  Sets are stored at the tenant level and referenced by a Mozu.ShippingAdmin.Contracts.Carriers.CarrierCredential.
 */
@ApiModel(description = "Stores a set of <see cref=\"T:Mozu.ShippingAdmin.Contracts.Carriers.CarrierCredentialSetValue\">carrier credential key-value pairs</see>.  Sets are stored at the tenant level and referenced by a Mozu.ShippingAdmin.Contracts.Carriers.CarrierCredential.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CarrierCredentialSet implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CARRIER_ID = "carrierId";
  @SerializedName(SERIALIZED_NAME_CARRIER_ID)
  private String carrierId;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  private List<CarrierCredentialSetValue> values = null;

  public static final String SERIALIZED_NAME_INTEGRATION_ID = "integrationId";
  @SerializedName(SERIALIZED_NAME_INTEGRATION_ID)
  private String integrationId;

  public static final String SERIALIZED_NAME_AUDIT_INFO = "auditInfo";
  @SerializedName(SERIALIZED_NAME_AUDIT_INFO)
  private AdminUserAuditInfo auditInfo;

  public CarrierCredentialSet() {
  }

  public CarrierCredentialSet carrierId(String carrierId) {
    
    this.carrierId = carrierId;
    return this;
  }

   /**
   * The Carrier ID associated with this credential set.  Usually the short name of a carrier (e.g., \&quot;FedEx\&quot;).
   * @return carrierId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Carrier ID associated with this credential set.  Usually the short name of a carrier (e.g., \"FedEx\").")

  public String getCarrierId() {
    return carrierId;
  }


  public void setCarrierId(String carrierId) {
    this.carrierId = carrierId;
  }


  public CarrierCredentialSet code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * A unique code identifying this credential set.  The code is only guaranteed to be unique at the tenant and carrier level.
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique code identifying this credential set.  The code is only guaranteed to be unique at the tenant and carrier level.")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public CarrierCredentialSet name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * A name (i.e., nickname) for this credential set.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A name (i.e., nickname) for this credential set.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CarrierCredentialSet values(List<CarrierCredentialSetValue> values) {
    
    this.values = values;
    return this;
  }

  public CarrierCredentialSet addValuesItem(CarrierCredentialSetValue valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * A collection of values contained in this credential set.
   * @return values
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A collection of values contained in this credential set.")

  public List<CarrierCredentialSetValue> getValues() {
    return values;
  }


  public void setValues(List<CarrierCredentialSetValue> values) {
    this.values = values;
  }


  public CarrierCredentialSet integrationId(String integrationId) {
    
    this.integrationId = integrationId;
    return this;
  }

   /**
   * Specifies the ID returned from an integration.
   * @return integrationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the ID returned from an integration.")

  public String getIntegrationId() {
    return integrationId;
  }


  public void setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
  }


  public CarrierCredentialSet auditInfo(AdminUserAuditInfo auditInfo) {
    
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
    CarrierCredentialSet carrierCredentialSet = (CarrierCredentialSet) o;
    return Objects.equals(this.carrierId, carrierCredentialSet.carrierId) &&
        Objects.equals(this.code, carrierCredentialSet.code) &&
        Objects.equals(this.name, carrierCredentialSet.name) &&
        Objects.equals(this.values, carrierCredentialSet.values) &&
        Objects.equals(this.integrationId, carrierCredentialSet.integrationId) &&
        Objects.equals(this.auditInfo, carrierCredentialSet.auditInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(carrierId, code, name, values, integrationId, auditInfo);
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
    sb.append("class CarrierCredentialSet {\n");
    sb.append("    carrierId: ").append(toIndentedString(carrierId)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
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
    openapiFields.add("carrierId");
    openapiFields.add("code");
    openapiFields.add("name");
    openapiFields.add("values");
    openapiFields.add("integrationId");
    openapiFields.add("auditInfo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CarrierCredentialSet
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CarrierCredentialSet.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CarrierCredentialSet is not found in the empty JSON string", CarrierCredentialSet.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!CarrierCredentialSet.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CarrierCredentialSet` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("carrierId") != null && !jsonObj.get("carrierId").isJsonNull()) && !jsonObj.get("carrierId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `carrierId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("carrierId").toString()));
      }
      if ((jsonObj.get("code") != null && !jsonObj.get("code").isJsonNull()) && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("values") != null && !jsonObj.get("values").isJsonNull()) {
        JsonArray jsonArrayvalues = jsonObj.getAsJsonArray("values");
        if (jsonArrayvalues != null) {
          // ensure the json data is an array
          if (!jsonObj.get("values").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `values` to be an array in the JSON string but got `%s`", jsonObj.get("values").toString()));
          }

          // validate the optional field `values` (array)
          for (int i = 0; i < jsonArrayvalues.size(); i++) {
            CarrierCredentialSetValue.validateJsonObject(jsonArrayvalues.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("integrationId") != null && !jsonObj.get("integrationId").isJsonNull()) && !jsonObj.get("integrationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `integrationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("integrationId").toString()));
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
       if (!CarrierCredentialSet.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CarrierCredentialSet' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CarrierCredentialSet> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CarrierCredentialSet.class));

       return (TypeAdapter<T>) new TypeAdapter<CarrierCredentialSet>() {
           @Override
           public void write(JsonWriter out, CarrierCredentialSet value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CarrierCredentialSet read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CarrierCredentialSet given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CarrierCredentialSet
  * @throws IOException if the JSON string is invalid with respect to CarrierCredentialSet
  */
  public static CarrierCredentialSet fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CarrierCredentialSet.class);
  }

 /**
  * Convert an instance of CarrierCredentialSet to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

