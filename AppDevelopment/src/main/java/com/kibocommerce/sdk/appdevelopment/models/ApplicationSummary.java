/*
 * Kibo AppDev Service
 * OpenAPI Spec for Kibo AppDev Service
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.appdevelopment.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kibocommerce.sdk.appdevelopment.models.AppVersion;
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
 * ApplicationSummary
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ApplicationSummary implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_PARENT_NAME = "parentName";
  @SerializedName(SERIALIZED_NAME_PARENT_NAME)
  private String parentName;

  public static final String SERIALIZED_NAME_APPLICATION_ID = "applicationId";
  @SerializedName(SERIALIZED_NAME_APPLICATION_ID)
  private Integer applicationId;

  public static final String SERIALIZED_NAME_APPLICATION_TYPE_ID = "applicationTypeId";
  @SerializedName(SERIALIZED_NAME_APPLICATION_TYPE_ID)
  private Integer applicationTypeId;

  public static final String SERIALIZED_NAME_RELEASE_PACKAGE_ID = "releasePackageId";
  @SerializedName(SERIALIZED_NAME_RELEASE_PACKAGE_ID)
  private Integer releasePackageId;

  public static final String SERIALIZED_NAME_RELEASE_PACKAGE_NAME = "releasePackageName";
  @SerializedName(SERIALIZED_NAME_RELEASE_PACKAGE_NAME)
  private String releasePackageName;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_APPLICATION_NAMESPACE = "applicationNamespace";
  @SerializedName(SERIALIZED_NAME_APPLICATION_NAMESPACE)
  private String applicationNamespace;

  public static final String SERIALIZED_NAME_APPLICATION_VERSION = "applicationVersion";
  @SerializedName(SERIALIZED_NAME_APPLICATION_VERSION)
  private AppVersion applicationVersion;

  public static final String SERIALIZED_NAME_APPLICATION_STATUS_ID = "applicationStatusId";
  @SerializedName(SERIALIZED_NAME_APPLICATION_STATUS_ID)
  private Integer applicationStatusId;

  public static final String SERIALIZED_NAME_APP_ID = "appId";
  @SerializedName(SERIALIZED_NAME_APP_ID)
  private String appId;

  public static final String SERIALIZED_NAME_APPLICATION_STATUS_NAME = "applicationStatusName";
  @SerializedName(SERIALIZED_NAME_APPLICATION_STATUS_NAME)
  private String applicationStatusName;

  public static final String SERIALIZED_NAME_HAS_VERSIONS = "hasVersions";
  @SerializedName(SERIALIZED_NAME_HAS_VERSIONS)
  private Boolean hasVersions;

  public static final String SERIALIZED_NAME_APP_SCHEME_VERSION = "appSchemeVersion";
  @SerializedName(SERIALIZED_NAME_APP_SCHEME_VERSION)
  private Integer appSchemeVersion;

  public static final String SERIALIZED_NAME_APP_KEY = "appKey";
  @SerializedName(SERIALIZED_NAME_APP_KEY)
  private String appKey;

  public static final String SERIALIZED_NAME_PARENT_APP_KEY = "parentAppKey";
  @SerializedName(SERIALIZED_NAME_PARENT_APP_KEY)
  private String parentAppKey;

  public static final String SERIALIZED_NAME_UPDATE_PARENT_APP_KEY = "updateParentAppKey";
  @SerializedName(SERIALIZED_NAME_UPDATE_PARENT_APP_KEY)
  private String updateParentAppKey;

  public static final String SERIALIZED_NAME_UPDATE_AVAILABLE = "updateAvailable";
  @SerializedName(SERIALIZED_NAME_UPDATE_AVAILABLE)
  private Boolean updateAvailable;

  public ApplicationSummary() {
  }

  public ApplicationSummary parentName(String parentName) {
    
    this.parentName = parentName;
    return this;
  }

   /**
   * 
   * @return parentName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getParentName() {
    return parentName;
  }


  public void setParentName(String parentName) {
    this.parentName = parentName;
  }


  public ApplicationSummary applicationId(Integer applicationId) {
    
    this.applicationId = applicationId;
    return this;
  }

   /**
   * 
   * @return applicationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getApplicationId() {
    return applicationId;
  }


  public void setApplicationId(Integer applicationId) {
    this.applicationId = applicationId;
  }


  public ApplicationSummary applicationTypeId(Integer applicationTypeId) {
    
    this.applicationTypeId = applicationTypeId;
    return this;
  }

   /**
   * 
   * @return applicationTypeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getApplicationTypeId() {
    return applicationTypeId;
  }


  public void setApplicationTypeId(Integer applicationTypeId) {
    this.applicationTypeId = applicationTypeId;
  }


  public ApplicationSummary releasePackageId(Integer releasePackageId) {
    
    this.releasePackageId = releasePackageId;
    return this;
  }

   /**
   * 
   * @return releasePackageId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getReleasePackageId() {
    return releasePackageId;
  }


  public void setReleasePackageId(Integer releasePackageId) {
    this.releasePackageId = releasePackageId;
  }


  public ApplicationSummary releasePackageName(String releasePackageName) {
    
    this.releasePackageName = releasePackageName;
    return this;
  }

   /**
   * 
   * @return releasePackageName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReleasePackageName() {
    return releasePackageName;
  }


  public void setReleasePackageName(String releasePackageName) {
    this.releasePackageName = releasePackageName;
  }


  public ApplicationSummary name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 
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


  public ApplicationSummary applicationNamespace(String applicationNamespace) {
    
    this.applicationNamespace = applicationNamespace;
    return this;
  }

   /**
   * 
   * @return applicationNamespace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getApplicationNamespace() {
    return applicationNamespace;
  }


  public void setApplicationNamespace(String applicationNamespace) {
    this.applicationNamespace = applicationNamespace;
  }


  public ApplicationSummary applicationVersion(AppVersion applicationVersion) {
    
    this.applicationVersion = applicationVersion;
    return this;
  }

   /**
   * Get applicationVersion
   * @return applicationVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AppVersion getApplicationVersion() {
    return applicationVersion;
  }


  public void setApplicationVersion(AppVersion applicationVersion) {
    this.applicationVersion = applicationVersion;
  }


  public ApplicationSummary applicationStatusId(Integer applicationStatusId) {
    
    this.applicationStatusId = applicationStatusId;
    return this;
  }

   /**
   * 
   * @return applicationStatusId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getApplicationStatusId() {
    return applicationStatusId;
  }


  public void setApplicationStatusId(Integer applicationStatusId) {
    this.applicationStatusId = applicationStatusId;
  }


  public ApplicationSummary appId(String appId) {
    
    this.appId = appId;
    return this;
  }

   /**
   * 
   * @return appId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAppId() {
    return appId;
  }


  public void setAppId(String appId) {
    this.appId = appId;
  }


  public ApplicationSummary applicationStatusName(String applicationStatusName) {
    
    this.applicationStatusName = applicationStatusName;
    return this;
  }

   /**
   * 
   * @return applicationStatusName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getApplicationStatusName() {
    return applicationStatusName;
  }


  public void setApplicationStatusName(String applicationStatusName) {
    this.applicationStatusName = applicationStatusName;
  }


  public ApplicationSummary hasVersions(Boolean hasVersions) {
    
    this.hasVersions = hasVersions;
    return this;
  }

   /**
   * 
   * @return hasVersions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getHasVersions() {
    return hasVersions;
  }


  public void setHasVersions(Boolean hasVersions) {
    this.hasVersions = hasVersions;
  }


  public ApplicationSummary appSchemeVersion(Integer appSchemeVersion) {
    
    this.appSchemeVersion = appSchemeVersion;
    return this;
  }

   /**
   * 
   * @return appSchemeVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAppSchemeVersion() {
    return appSchemeVersion;
  }


  public void setAppSchemeVersion(Integer appSchemeVersion) {
    this.appSchemeVersion = appSchemeVersion;
  }


  public ApplicationSummary appKey(String appKey) {
    
    this.appKey = appKey;
    return this;
  }

   /**
   * The AppKey is a runtime type.
   * @return appKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The AppKey is a runtime type.")

  public String getAppKey() {
    return appKey;
  }


  public void setAppKey(String appKey) {
    this.appKey = appKey;
  }


  public ApplicationSummary parentAppKey(String parentAppKey) {
    
    this.parentAppKey = parentAppKey;
    return this;
  }

   /**
   * The AppKey is a runtime type.  This only applies for themes that inherit from another theme.
   * @return parentAppKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The AppKey is a runtime type.  This only applies for themes that inherit from another theme.")

  public String getParentAppKey() {
    return parentAppKey;
  }


  public void setParentAppKey(String parentAppKey) {
    this.parentAppKey = parentAppKey;
  }


  public ApplicationSummary updateParentAppKey(String updateParentAppKey) {
    
    this.updateParentAppKey = updateParentAppKey;
    return this;
  }

   /**
   * The AppKey is a runtime type.  This only applies for themes that inherit from another theme.  It shows the most current update available.
   * @return updateParentAppKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The AppKey is a runtime type.  This only applies for themes that inherit from another theme.  It shows the most current update available.")

  public String getUpdateParentAppKey() {
    return updateParentAppKey;
  }


  public void setUpdateParentAppKey(String updateParentAppKey) {
    this.updateParentAppKey = updateParentAppKey;
  }


  public ApplicationSummary updateAvailable(Boolean updateAvailable) {
    
    this.updateAvailable = updateAvailable;
    return this;
  }

   /**
   * 
   * @return updateAvailable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getUpdateAvailable() {
    return updateAvailable;
  }


  public void setUpdateAvailable(Boolean updateAvailable) {
    this.updateAvailable = updateAvailable;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationSummary applicationSummary = (ApplicationSummary) o;
    return Objects.equals(this.parentName, applicationSummary.parentName) &&
        Objects.equals(this.applicationId, applicationSummary.applicationId) &&
        Objects.equals(this.applicationTypeId, applicationSummary.applicationTypeId) &&
        Objects.equals(this.releasePackageId, applicationSummary.releasePackageId) &&
        Objects.equals(this.releasePackageName, applicationSummary.releasePackageName) &&
        Objects.equals(this.name, applicationSummary.name) &&
        Objects.equals(this.applicationNamespace, applicationSummary.applicationNamespace) &&
        Objects.equals(this.applicationVersion, applicationSummary.applicationVersion) &&
        Objects.equals(this.applicationStatusId, applicationSummary.applicationStatusId) &&
        Objects.equals(this.appId, applicationSummary.appId) &&
        Objects.equals(this.applicationStatusName, applicationSummary.applicationStatusName) &&
        Objects.equals(this.hasVersions, applicationSummary.hasVersions) &&
        Objects.equals(this.appSchemeVersion, applicationSummary.appSchemeVersion) &&
        Objects.equals(this.appKey, applicationSummary.appKey) &&
        Objects.equals(this.parentAppKey, applicationSummary.parentAppKey) &&
        Objects.equals(this.updateParentAppKey, applicationSummary.updateParentAppKey) &&
        Objects.equals(this.updateAvailable, applicationSummary.updateAvailable);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(parentName, applicationId, applicationTypeId, releasePackageId, releasePackageName, name, applicationNamespace, applicationVersion, applicationStatusId, appId, applicationStatusName, hasVersions, appSchemeVersion, appKey, parentAppKey, updateParentAppKey, updateAvailable);
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
    sb.append("class ApplicationSummary {\n");
    sb.append("    parentName: ").append(toIndentedString(parentName)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    applicationTypeId: ").append(toIndentedString(applicationTypeId)).append("\n");
    sb.append("    releasePackageId: ").append(toIndentedString(releasePackageId)).append("\n");
    sb.append("    releasePackageName: ").append(toIndentedString(releasePackageName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    applicationNamespace: ").append(toIndentedString(applicationNamespace)).append("\n");
    sb.append("    applicationVersion: ").append(toIndentedString(applicationVersion)).append("\n");
    sb.append("    applicationStatusId: ").append(toIndentedString(applicationStatusId)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    applicationStatusName: ").append(toIndentedString(applicationStatusName)).append("\n");
    sb.append("    hasVersions: ").append(toIndentedString(hasVersions)).append("\n");
    sb.append("    appSchemeVersion: ").append(toIndentedString(appSchemeVersion)).append("\n");
    sb.append("    appKey: ").append(toIndentedString(appKey)).append("\n");
    sb.append("    parentAppKey: ").append(toIndentedString(parentAppKey)).append("\n");
    sb.append("    updateParentAppKey: ").append(toIndentedString(updateParentAppKey)).append("\n");
    sb.append("    updateAvailable: ").append(toIndentedString(updateAvailable)).append("\n");
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
    openapiFields.add("parentName");
    openapiFields.add("applicationId");
    openapiFields.add("applicationTypeId");
    openapiFields.add("releasePackageId");
    openapiFields.add("releasePackageName");
    openapiFields.add("name");
    openapiFields.add("applicationNamespace");
    openapiFields.add("applicationVersion");
    openapiFields.add("applicationStatusId");
    openapiFields.add("appId");
    openapiFields.add("applicationStatusName");
    openapiFields.add("hasVersions");
    openapiFields.add("appSchemeVersion");
    openapiFields.add("appKey");
    openapiFields.add("parentAppKey");
    openapiFields.add("updateParentAppKey");
    openapiFields.add("updateAvailable");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ApplicationSummary
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ApplicationSummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApplicationSummary is not found in the empty JSON string", ApplicationSummary.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!ApplicationSummary.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApplicationSummary` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("parentName") != null && !jsonObj.get("parentName").isJsonNull()) && !jsonObj.get("parentName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parentName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parentName").toString()));
      }
      if ((jsonObj.get("releasePackageName") != null && !jsonObj.get("releasePackageName").isJsonNull()) && !jsonObj.get("releasePackageName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `releasePackageName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("releasePackageName").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("applicationNamespace") != null && !jsonObj.get("applicationNamespace").isJsonNull()) && !jsonObj.get("applicationNamespace").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `applicationNamespace` to be a primitive type in the JSON string but got `%s`", jsonObj.get("applicationNamespace").toString()));
      }
      // validate the optional field `applicationVersion`
      if (jsonObj.get("applicationVersion") != null && !jsonObj.get("applicationVersion").isJsonNull()) {
        AppVersion.validateJsonObject(jsonObj.getAsJsonObject("applicationVersion"));
      }
      if ((jsonObj.get("appId") != null && !jsonObj.get("appId").isJsonNull()) && !jsonObj.get("appId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `appId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("appId").toString()));
      }
      if ((jsonObj.get("applicationStatusName") != null && !jsonObj.get("applicationStatusName").isJsonNull()) && !jsonObj.get("applicationStatusName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `applicationStatusName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("applicationStatusName").toString()));
      }
      if ((jsonObj.get("appKey") != null && !jsonObj.get("appKey").isJsonNull()) && !jsonObj.get("appKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `appKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("appKey").toString()));
      }
      if ((jsonObj.get("parentAppKey") != null && !jsonObj.get("parentAppKey").isJsonNull()) && !jsonObj.get("parentAppKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parentAppKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parentAppKey").toString()));
      }
      if ((jsonObj.get("updateParentAppKey") != null && !jsonObj.get("updateParentAppKey").isJsonNull()) && !jsonObj.get("updateParentAppKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updateParentAppKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updateParentAppKey").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApplicationSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApplicationSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApplicationSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApplicationSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<ApplicationSummary>() {
           @Override
           public void write(JsonWriter out, ApplicationSummary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApplicationSummary read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApplicationSummary given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApplicationSummary
  * @throws IOException if the JSON string is invalid with respect to ApplicationSummary
  */
  public static ApplicationSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApplicationSummary.class);
  }

 /**
  * Convert an instance of ApplicationSummary to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

