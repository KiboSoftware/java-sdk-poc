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
 * Used to update a user&#39;s forgotten password. Contains the user&#39;s email address, new password, and the confirmation code   that is required to update the password.
 */
@ApiModel(description = "Used to update a user's forgotten password. Contains the user's email address, new password, and the confirmation code   that is required to update the password.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConfirmationInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_USER_NAME = "userName";
  @SerializedName(SERIALIZED_NAME_USER_NAME)
  private String userName;

  public static final String SERIALIZED_NAME_CONFIRMATION_CODE = "confirmationCode";
  @SerializedName(SERIALIZED_NAME_CONFIRMATION_CODE)
  private String confirmationCode;

  public static final String SERIALIZED_NAME_NEW_PASSWORD = "newPassword";
  @SerializedName(SERIALIZED_NAME_NEW_PASSWORD)
  private String newPassword;

  public ConfirmationInfo() {
  }

  public ConfirmationInfo userName(String userName) {
    
    this.userName = userName;
    return this;
  }

   /**
   * UserName of the user who has requested a new password.
   * @return userName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "UserName of the user who has requested a new password.")

  public String getUserName() {
    return userName;
  }


  public void setUserName(String userName) {
    this.userName = userName;
  }


  public ConfirmationInfo confirmationCode(String confirmationCode) {
    
    this.confirmationCode = confirmationCode;
    return this;
  }

   /**
   * Confirmation code that a user supplies when requesting a new password.
   * @return confirmationCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Confirmation code that a user supplies when requesting a new password.")

  public String getConfirmationCode() {
    return confirmationCode;
  }


  public void setConfirmationCode(String confirmationCode) {
    this.confirmationCode = confirmationCode;
  }


  public ConfirmationInfo newPassword(String newPassword) {
    
    this.newPassword = newPassword;
    return this;
  }

   /**
   * The user&#39;s new password.
   * @return newPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user's new password.")

  public String getNewPassword() {
    return newPassword;
  }


  public void setNewPassword(String newPassword) {
    this.newPassword = newPassword;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfirmationInfo confirmationInfo = (ConfirmationInfo) o;
    return Objects.equals(this.userName, confirmationInfo.userName) &&
        Objects.equals(this.confirmationCode, confirmationInfo.confirmationCode) &&
        Objects.equals(this.newPassword, confirmationInfo.newPassword);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(userName, confirmationCode, newPassword);
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
    sb.append("class ConfirmationInfo {\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    confirmationCode: ").append(toIndentedString(confirmationCode)).append("\n");
    sb.append("    newPassword: ").append(toIndentedString(newPassword)).append("\n");
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
    openapiFields.add("userName");
    openapiFields.add("confirmationCode");
    openapiFields.add("newPassword");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ConfirmationInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ConfirmationInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConfirmationInfo is not found in the empty JSON string", ConfirmationInfo.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!ConfirmationInfo.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConfirmationInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("userName") != null && !jsonObj.get("userName").isJsonNull()) && !jsonObj.get("userName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userName").toString()));
      }
      if ((jsonObj.get("confirmationCode") != null && !jsonObj.get("confirmationCode").isJsonNull()) && !jsonObj.get("confirmationCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `confirmationCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("confirmationCode").toString()));
      }
      if ((jsonObj.get("newPassword") != null && !jsonObj.get("newPassword").isJsonNull()) && !jsonObj.get("newPassword").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `newPassword` to be a primitive type in the JSON string but got `%s`", jsonObj.get("newPassword").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConfirmationInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConfirmationInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConfirmationInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConfirmationInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ConfirmationInfo>() {
           @Override
           public void write(JsonWriter out, ConfirmationInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConfirmationInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ConfirmationInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConfirmationInfo
  * @throws IOException if the JSON string is invalid with respect to ConfirmationInfo
  */
  public static ConfirmationInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConfirmationInfo.class);
  }

 /**
  * Convert an instance of ConfirmationInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

