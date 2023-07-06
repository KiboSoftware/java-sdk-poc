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
 * CommerceRuntimeAddress
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CommerceRuntimeAddress implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ADDRESS1 = "address1";
  @SerializedName(SERIALIZED_NAME_ADDRESS1)
  private String address1;

  public static final String SERIALIZED_NAME_ADDRESS2 = "address2";
  @SerializedName(SERIALIZED_NAME_ADDRESS2)
  private String address2;

  public static final String SERIALIZED_NAME_ADDRESS3 = "address3";
  @SerializedName(SERIALIZED_NAME_ADDRESS3)
  private String address3;

  public static final String SERIALIZED_NAME_ADDRESS4 = "address4";
  @SerializedName(SERIALIZED_NAME_ADDRESS4)
  private String address4;

  public static final String SERIALIZED_NAME_CITY_OR_TOWN = "cityOrTown";
  @SerializedName(SERIALIZED_NAME_CITY_OR_TOWN)
  private String cityOrTown;

  public static final String SERIALIZED_NAME_STATE_OR_PROVINCE = "stateOrProvince";
  @SerializedName(SERIALIZED_NAME_STATE_OR_PROVINCE)
  private String stateOrProvince;

  public static final String SERIALIZED_NAME_POSTAL_OR_ZIP_CODE = "postalOrZipCode";
  @SerializedName(SERIALIZED_NAME_POSTAL_OR_ZIP_CODE)
  private String postalOrZipCode;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "countryCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public static final String SERIALIZED_NAME_ADDRESS_TYPE = "addressType";
  @SerializedName(SERIALIZED_NAME_ADDRESS_TYPE)
  private String addressType;

  public static final String SERIALIZED_NAME_IS_VALIDATED = "isValidated";
  @SerializedName(SERIALIZED_NAME_IS_VALIDATED)
  private Boolean isValidated;

  public CommerceRuntimeAddress() {
  }

  public CommerceRuntimeAddress address1(String address1) {
    
    this.address1 = address1;
    return this;
  }

   /**
   * Get address1
   * @return address1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAddress1() {
    return address1;
  }


  public void setAddress1(String address1) {
    this.address1 = address1;
  }


  public CommerceRuntimeAddress address2(String address2) {
    
    this.address2 = address2;
    return this;
  }

   /**
   * Get address2
   * @return address2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAddress2() {
    return address2;
  }


  public void setAddress2(String address2) {
    this.address2 = address2;
  }


  public CommerceRuntimeAddress address3(String address3) {
    
    this.address3 = address3;
    return this;
  }

   /**
   * Get address3
   * @return address3
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAddress3() {
    return address3;
  }


  public void setAddress3(String address3) {
    this.address3 = address3;
  }


  public CommerceRuntimeAddress address4(String address4) {
    
    this.address4 = address4;
    return this;
  }

   /**
   * Get address4
   * @return address4
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAddress4() {
    return address4;
  }


  public void setAddress4(String address4) {
    this.address4 = address4;
  }


  public CommerceRuntimeAddress cityOrTown(String cityOrTown) {
    
    this.cityOrTown = cityOrTown;
    return this;
  }

   /**
   * Get cityOrTown
   * @return cityOrTown
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCityOrTown() {
    return cityOrTown;
  }


  public void setCityOrTown(String cityOrTown) {
    this.cityOrTown = cityOrTown;
  }


  public CommerceRuntimeAddress stateOrProvince(String stateOrProvince) {
    
    this.stateOrProvince = stateOrProvince;
    return this;
  }

   /**
   * Get stateOrProvince
   * @return stateOrProvince
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStateOrProvince() {
    return stateOrProvince;
  }


  public void setStateOrProvince(String stateOrProvince) {
    this.stateOrProvince = stateOrProvince;
  }


  public CommerceRuntimeAddress postalOrZipCode(String postalOrZipCode) {
    
    this.postalOrZipCode = postalOrZipCode;
    return this;
  }

   /**
   * Get postalOrZipCode
   * @return postalOrZipCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPostalOrZipCode() {
    return postalOrZipCode;
  }


  public void setPostalOrZipCode(String postalOrZipCode) {
    this.postalOrZipCode = postalOrZipCode;
  }


  public CommerceRuntimeAddress countryCode(String countryCode) {
    
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


  public CommerceRuntimeAddress addressType(String addressType) {
    
    this.addressType = addressType;
    return this;
  }

   /**
   * Get addressType
   * @return addressType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAddressType() {
    return addressType;
  }


  public void setAddressType(String addressType) {
    this.addressType = addressType;
  }


  public CommerceRuntimeAddress isValidated(Boolean isValidated) {
    
    this.isValidated = isValidated;
    return this;
  }

   /**
   * Get isValidated
   * @return isValidated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsValidated() {
    return isValidated;
  }


  public void setIsValidated(Boolean isValidated) {
    this.isValidated = isValidated;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommerceRuntimeAddress commerceRuntimeAddress = (CommerceRuntimeAddress) o;
    return Objects.equals(this.address1, commerceRuntimeAddress.address1) &&
        Objects.equals(this.address2, commerceRuntimeAddress.address2) &&
        Objects.equals(this.address3, commerceRuntimeAddress.address3) &&
        Objects.equals(this.address4, commerceRuntimeAddress.address4) &&
        Objects.equals(this.cityOrTown, commerceRuntimeAddress.cityOrTown) &&
        Objects.equals(this.stateOrProvince, commerceRuntimeAddress.stateOrProvince) &&
        Objects.equals(this.postalOrZipCode, commerceRuntimeAddress.postalOrZipCode) &&
        Objects.equals(this.countryCode, commerceRuntimeAddress.countryCode) &&
        Objects.equals(this.addressType, commerceRuntimeAddress.addressType) &&
        Objects.equals(this.isValidated, commerceRuntimeAddress.isValidated);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(address1, address2, address3, address4, cityOrTown, stateOrProvince, postalOrZipCode, countryCode, addressType, isValidated);
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
    sb.append("class CommerceRuntimeAddress {\n");
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    address3: ").append(toIndentedString(address3)).append("\n");
    sb.append("    address4: ").append(toIndentedString(address4)).append("\n");
    sb.append("    cityOrTown: ").append(toIndentedString(cityOrTown)).append("\n");
    sb.append("    stateOrProvince: ").append(toIndentedString(stateOrProvince)).append("\n");
    sb.append("    postalOrZipCode: ").append(toIndentedString(postalOrZipCode)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
    sb.append("    isValidated: ").append(toIndentedString(isValidated)).append("\n");
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
    openapiFields.add("address1");
    openapiFields.add("address2");
    openapiFields.add("address3");
    openapiFields.add("address4");
    openapiFields.add("cityOrTown");
    openapiFields.add("stateOrProvince");
    openapiFields.add("postalOrZipCode");
    openapiFields.add("countryCode");
    openapiFields.add("addressType");
    openapiFields.add("isValidated");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CommerceRuntimeAddress
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CommerceRuntimeAddress.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CommerceRuntimeAddress is not found in the empty JSON string", CommerceRuntimeAddress.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!CommerceRuntimeAddress.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CommerceRuntimeAddress` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("address1") != null && !jsonObj.get("address1").isJsonNull()) && !jsonObj.get("address1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address1").toString()));
      }
      if ((jsonObj.get("address2") != null && !jsonObj.get("address2").isJsonNull()) && !jsonObj.get("address2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address2").toString()));
      }
      if ((jsonObj.get("address3") != null && !jsonObj.get("address3").isJsonNull()) && !jsonObj.get("address3").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address3` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address3").toString()));
      }
      if ((jsonObj.get("address4") != null && !jsonObj.get("address4").isJsonNull()) && !jsonObj.get("address4").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address4` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address4").toString()));
      }
      if ((jsonObj.get("cityOrTown") != null && !jsonObj.get("cityOrTown").isJsonNull()) && !jsonObj.get("cityOrTown").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cityOrTown` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cityOrTown").toString()));
      }
      if ((jsonObj.get("stateOrProvince") != null && !jsonObj.get("stateOrProvince").isJsonNull()) && !jsonObj.get("stateOrProvince").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stateOrProvince` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stateOrProvince").toString()));
      }
      if ((jsonObj.get("postalOrZipCode") != null && !jsonObj.get("postalOrZipCode").isJsonNull()) && !jsonObj.get("postalOrZipCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `postalOrZipCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("postalOrZipCode").toString()));
      }
      if ((jsonObj.get("countryCode") != null && !jsonObj.get("countryCode").isJsonNull()) && !jsonObj.get("countryCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `countryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("countryCode").toString()));
      }
      if ((jsonObj.get("addressType") != null && !jsonObj.get("addressType").isJsonNull()) && !jsonObj.get("addressType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `addressType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("addressType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CommerceRuntimeAddress.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CommerceRuntimeAddress' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CommerceRuntimeAddress> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CommerceRuntimeAddress.class));

       return (TypeAdapter<T>) new TypeAdapter<CommerceRuntimeAddress>() {
           @Override
           public void write(JsonWriter out, CommerceRuntimeAddress value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CommerceRuntimeAddress read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CommerceRuntimeAddress given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CommerceRuntimeAddress
  * @throws IOException if the JSON string is invalid with respect to CommerceRuntimeAddress
  */
  public static CommerceRuntimeAddress fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CommerceRuntimeAddress.class);
  }

 /**
  * Convert an instance of CommerceRuntimeAddress to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

