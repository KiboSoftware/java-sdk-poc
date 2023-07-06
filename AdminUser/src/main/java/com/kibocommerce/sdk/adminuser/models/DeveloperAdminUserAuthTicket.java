/*
 * Kibo Admin User Service
 * OpenAPI Spec for Kibo Admin User Service
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.adminuser.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kibocommerce.sdk.adminuser.models.DeveloperAccount;
import com.kibocommerce.sdk.adminuser.models.UserProfile;
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
 * DeveloperAdminUserAuthTicket
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DeveloperAdminUserAuthTicket implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private UserProfile user;

  public static final String SERIALIZED_NAME_CREATED_ON = "createdOn";
  @SerializedName(SERIALIZED_NAME_CREATED_ON)
  private OffsetDateTime createdOn;

  public static final String SERIALIZED_NAME_JWT_ACCESS_TOKEN = "jwtAccessToken";
  @SerializedName(SERIALIZED_NAME_JWT_ACCESS_TOKEN)
  private String jwtAccessToken;

  public static final String SERIALIZED_NAME_ACCESS_TOKEN = "accessToken";
  @SerializedName(SERIALIZED_NAME_ACCESS_TOKEN)
  private String accessToken;

  public static final String SERIALIZED_NAME_ACCESS_TOKEN_EXPIRATION = "accessTokenExpiration";
  @SerializedName(SERIALIZED_NAME_ACCESS_TOKEN_EXPIRATION)
  private OffsetDateTime accessTokenExpiration;

  public static final String SERIALIZED_NAME_REFRESH_TOKEN = "refreshToken";
  @SerializedName(SERIALIZED_NAME_REFRESH_TOKEN)
  private String refreshToken;

  public static final String SERIALIZED_NAME_REFRESH_TOKEN_EXPIRATION = "refreshTokenExpiration";
  @SerializedName(SERIALIZED_NAME_REFRESH_TOKEN_EXPIRATION)
  private OffsetDateTime refreshTokenExpiration;

  public static final String SERIALIZED_NAME_ACCOUNT = "account";
  @SerializedName(SERIALIZED_NAME_ACCOUNT)
  private DeveloperAccount account;

  public static final String SERIALIZED_NAME_AVAILABLE_ACCOUNTS = "availableAccounts";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_ACCOUNTS)
  private List<DeveloperAccount> availableAccounts = null;

  public static final String SERIALIZED_NAME_GRANTED_BEHAVIORS = "grantedBehaviors";
  @SerializedName(SERIALIZED_NAME_GRANTED_BEHAVIORS)
  private List<Integer> grantedBehaviors = null;

  public DeveloperAdminUserAuthTicket() {
  }

  public DeveloperAdminUserAuthTicket user(UserProfile user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserProfile getUser() {
    return user;
  }


  public void setUser(UserProfile user) {
    this.user = user;
  }


  public DeveloperAdminUserAuthTicket createdOn(OffsetDateTime createdOn) {
    
    this.createdOn = createdOn;
    return this;
  }

   /**
   * Get createdOn
   * @return createdOn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }


  public void setCreatedOn(OffsetDateTime createdOn) {
    this.createdOn = createdOn;
  }


  public DeveloperAdminUserAuthTicket jwtAccessToken(String jwtAccessToken) {
    
    this.jwtAccessToken = jwtAccessToken;
    return this;
  }

   /**
   * Get jwtAccessToken
   * @return jwtAccessToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getJwtAccessToken() {
    return jwtAccessToken;
  }


  public void setJwtAccessToken(String jwtAccessToken) {
    this.jwtAccessToken = jwtAccessToken;
  }


  public DeveloperAdminUserAuthTicket accessToken(String accessToken) {
    
    this.accessToken = accessToken;
    return this;
  }

   /**
   * Get accessToken
   * @return accessToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAccessToken() {
    return accessToken;
  }


  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }


  public DeveloperAdminUserAuthTicket accessTokenExpiration(OffsetDateTime accessTokenExpiration) {
    
    this.accessTokenExpiration = accessTokenExpiration;
    return this;
  }

   /**
   * Get accessTokenExpiration
   * @return accessTokenExpiration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getAccessTokenExpiration() {
    return accessTokenExpiration;
  }


  public void setAccessTokenExpiration(OffsetDateTime accessTokenExpiration) {
    this.accessTokenExpiration = accessTokenExpiration;
  }


  public DeveloperAdminUserAuthTicket refreshToken(String refreshToken) {
    
    this.refreshToken = refreshToken;
    return this;
  }

   /**
   * Get refreshToken
   * @return refreshToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRefreshToken() {
    return refreshToken;
  }


  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }


  public DeveloperAdminUserAuthTicket refreshTokenExpiration(OffsetDateTime refreshTokenExpiration) {
    
    this.refreshTokenExpiration = refreshTokenExpiration;
    return this;
  }

   /**
   * Get refreshTokenExpiration
   * @return refreshTokenExpiration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getRefreshTokenExpiration() {
    return refreshTokenExpiration;
  }


  public void setRefreshTokenExpiration(OffsetDateTime refreshTokenExpiration) {
    this.refreshTokenExpiration = refreshTokenExpiration;
  }


  public DeveloperAdminUserAuthTicket account(DeveloperAccount account) {
    
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DeveloperAccount getAccount() {
    return account;
  }


  public void setAccount(DeveloperAccount account) {
    this.account = account;
  }


  public DeveloperAdminUserAuthTicket availableAccounts(List<DeveloperAccount> availableAccounts) {
    
    this.availableAccounts = availableAccounts;
    return this;
  }

  public DeveloperAdminUserAuthTicket addAvailableAccountsItem(DeveloperAccount availableAccountsItem) {
    if (this.availableAccounts == null) {
      this.availableAccounts = new ArrayList<>();
    }
    this.availableAccounts.add(availableAccountsItem);
    return this;
  }

   /**
   * Get availableAccounts
   * @return availableAccounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<DeveloperAccount> getAvailableAccounts() {
    return availableAccounts;
  }


  public void setAvailableAccounts(List<DeveloperAccount> availableAccounts) {
    this.availableAccounts = availableAccounts;
  }


  public DeveloperAdminUserAuthTicket grantedBehaviors(List<Integer> grantedBehaviors) {
    
    this.grantedBehaviors = grantedBehaviors;
    return this;
  }

  public DeveloperAdminUserAuthTicket addGrantedBehaviorsItem(Integer grantedBehaviorsItem) {
    if (this.grantedBehaviors == null) {
      this.grantedBehaviors = new ArrayList<>();
    }
    this.grantedBehaviors.add(grantedBehaviorsItem);
    return this;
  }

   /**
   * Get grantedBehaviors
   * @return grantedBehaviors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getGrantedBehaviors() {
    return grantedBehaviors;
  }


  public void setGrantedBehaviors(List<Integer> grantedBehaviors) {
    this.grantedBehaviors = grantedBehaviors;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeveloperAdminUserAuthTicket developerAdminUserAuthTicket = (DeveloperAdminUserAuthTicket) o;
    return Objects.equals(this.user, developerAdminUserAuthTicket.user) &&
        Objects.equals(this.createdOn, developerAdminUserAuthTicket.createdOn) &&
        Objects.equals(this.jwtAccessToken, developerAdminUserAuthTicket.jwtAccessToken) &&
        Objects.equals(this.accessToken, developerAdminUserAuthTicket.accessToken) &&
        Objects.equals(this.accessTokenExpiration, developerAdminUserAuthTicket.accessTokenExpiration) &&
        Objects.equals(this.refreshToken, developerAdminUserAuthTicket.refreshToken) &&
        Objects.equals(this.refreshTokenExpiration, developerAdminUserAuthTicket.refreshTokenExpiration) &&
        Objects.equals(this.account, developerAdminUserAuthTicket.account) &&
        Objects.equals(this.availableAccounts, developerAdminUserAuthTicket.availableAccounts) &&
        Objects.equals(this.grantedBehaviors, developerAdminUserAuthTicket.grantedBehaviors);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, createdOn, jwtAccessToken, accessToken, accessTokenExpiration, refreshToken, refreshTokenExpiration, account, availableAccounts, grantedBehaviors);
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
    sb.append("class DeveloperAdminUserAuthTicket {\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    jwtAccessToken: ").append(toIndentedString(jwtAccessToken)).append("\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    accessTokenExpiration: ").append(toIndentedString(accessTokenExpiration)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    refreshTokenExpiration: ").append(toIndentedString(refreshTokenExpiration)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    availableAccounts: ").append(toIndentedString(availableAccounts)).append("\n");
    sb.append("    grantedBehaviors: ").append(toIndentedString(grantedBehaviors)).append("\n");
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
    openapiFields.add("user");
    openapiFields.add("createdOn");
    openapiFields.add("jwtAccessToken");
    openapiFields.add("accessToken");
    openapiFields.add("accessTokenExpiration");
    openapiFields.add("refreshToken");
    openapiFields.add("refreshTokenExpiration");
    openapiFields.add("account");
    openapiFields.add("availableAccounts");
    openapiFields.add("grantedBehaviors");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DeveloperAdminUserAuthTicket
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DeveloperAdminUserAuthTicket.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeveloperAdminUserAuthTicket is not found in the empty JSON string", DeveloperAdminUserAuthTicket.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!DeveloperAdminUserAuthTicket.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DeveloperAdminUserAuthTicket` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      // validate the optional field `user`
      if (jsonObj.get("user") != null && !jsonObj.get("user").isJsonNull()) {
        UserProfile.validateJsonObject(jsonObj.getAsJsonObject("user"));
      }
      if ((jsonObj.get("jwtAccessToken") != null && !jsonObj.get("jwtAccessToken").isJsonNull()) && !jsonObj.get("jwtAccessToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `jwtAccessToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("jwtAccessToken").toString()));
      }
      if ((jsonObj.get("accessToken") != null && !jsonObj.get("accessToken").isJsonNull()) && !jsonObj.get("accessToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accessToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accessToken").toString()));
      }
      if ((jsonObj.get("refreshToken") != null && !jsonObj.get("refreshToken").isJsonNull()) && !jsonObj.get("refreshToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refreshToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refreshToken").toString()));
      }
      // validate the optional field `account`
      if (jsonObj.get("account") != null && !jsonObj.get("account").isJsonNull()) {
        DeveloperAccount.validateJsonObject(jsonObj.getAsJsonObject("account"));
      }
      if (jsonObj.get("availableAccounts") != null && !jsonObj.get("availableAccounts").isJsonNull()) {
        JsonArray jsonArrayavailableAccounts = jsonObj.getAsJsonArray("availableAccounts");
        if (jsonArrayavailableAccounts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("availableAccounts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `availableAccounts` to be an array in the JSON string but got `%s`", jsonObj.get("availableAccounts").toString()));
          }

          // validate the optional field `availableAccounts` (array)
          for (int i = 0; i < jsonArrayavailableAccounts.size(); i++) {
            DeveloperAccount.validateJsonObject(jsonArrayavailableAccounts.get(i).getAsJsonObject());
          };
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("grantedBehaviors").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `grantedBehaviors` to be an array in the JSON string but got `%s`", jsonObj.get("grantedBehaviors").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeveloperAdminUserAuthTicket.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeveloperAdminUserAuthTicket' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeveloperAdminUserAuthTicket> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeveloperAdminUserAuthTicket.class));

       return (TypeAdapter<T>) new TypeAdapter<DeveloperAdminUserAuthTicket>() {
           @Override
           public void write(JsonWriter out, DeveloperAdminUserAuthTicket value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DeveloperAdminUserAuthTicket read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DeveloperAdminUserAuthTicket given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DeveloperAdminUserAuthTicket
  * @throws IOException if the JSON string is invalid with respect to DeveloperAdminUserAuthTicket
  */
  public static DeveloperAdminUserAuthTicket fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeveloperAdminUserAuthTicket.class);
  }

 /**
  * Convert an instance of DeveloperAdminUserAuthTicket to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

