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
import com.kibocommerce.sdk.adminuser.models.AdminUserAuditInfo;
import com.kibocommerce.sdk.adminuser.models.Behavior;
import com.kibocommerce.sdk.adminuser.models.Owner;
import com.kibocommerce.sdk.adminuser.models.Resource;
import com.kibocommerce.sdk.adminuser.models.UserScope;
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
 * Role
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Role implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_IS_SYSTEM_ROLE = "isSystemRole";
  @SerializedName(SERIALIZED_NAME_IS_SYSTEM_ROLE)
  private Boolean isSystemRole;

  public static final String SERIALIZED_NAME_BEHAVIORS = "behaviors";
  @SerializedName(SERIALIZED_NAME_BEHAVIORS)
  private List<Behavior> behaviors = null;

  public static final String SERIALIZED_NAME_RESOURCES = "resources";
  @SerializedName(SERIALIZED_NAME_RESOURCES)
  private List<Resource> resources = null;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_USER_SCOPE = "userScope";
  @SerializedName(SERIALIZED_NAME_USER_SCOPE)
  private UserScope userScope;

  public static final String SERIALIZED_NAME_OWNERS = "owners";
  @SerializedName(SERIALIZED_NAME_OWNERS)
  private List<Owner> owners = null;

  public static final String SERIALIZED_NAME_AUDIT_INFO = "auditInfo";
  @SerializedName(SERIALIZED_NAME_AUDIT_INFO)
  private AdminUserAuditInfo auditInfo;

  public Role() {
  }

  public Role name(String name) {
    
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


  public Role isSystemRole(Boolean isSystemRole) {
    
    this.isSystemRole = isSystemRole;
    return this;
  }

   /**
   * Get isSystemRole
   * @return isSystemRole
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsSystemRole() {
    return isSystemRole;
  }


  public void setIsSystemRole(Boolean isSystemRole) {
    this.isSystemRole = isSystemRole;
  }


  public Role behaviors(List<Behavior> behaviors) {
    
    this.behaviors = behaviors;
    return this;
  }

  public Role addBehaviorsItem(Behavior behaviorsItem) {
    if (this.behaviors == null) {
      this.behaviors = new ArrayList<>();
    }
    this.behaviors.add(behaviorsItem);
    return this;
  }

   /**
   * Get behaviors
   * @return behaviors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Behavior> getBehaviors() {
    return behaviors;
  }


  public void setBehaviors(List<Behavior> behaviors) {
    this.behaviors = behaviors;
  }


  public Role resources(List<Resource> resources) {
    
    this.resources = resources;
    return this;
  }

  public Role addResourcesItem(Resource resourcesItem) {
    if (this.resources == null) {
      this.resources = new ArrayList<>();
    }
    this.resources.add(resourcesItem);
    return this;
  }

   /**
   * Get resources
   * @return resources
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Resource> getResources() {
    return resources;
  }


  public void setResources(List<Resource> resources) {
    this.resources = resources;
  }


  public Role tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public Role addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public Role id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public Role userScope(UserScope userScope) {
    
    this.userScope = userScope;
    return this;
  }

   /**
   * Get userScope
   * @return userScope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserScope getUserScope() {
    return userScope;
  }


  public void setUserScope(UserScope userScope) {
    this.userScope = userScope;
  }


  public Role owners(List<Owner> owners) {
    
    this.owners = owners;
    return this;
  }

  public Role addOwnersItem(Owner ownersItem) {
    if (this.owners == null) {
      this.owners = new ArrayList<>();
    }
    this.owners.add(ownersItem);
    return this;
  }

   /**
   * Get owners
   * @return owners
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Owner> getOwners() {
    return owners;
  }


  public void setOwners(List<Owner> owners) {
    this.owners = owners;
  }


  public Role auditInfo(AdminUserAuditInfo auditInfo) {
    
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
    Role role = (Role) o;
    return Objects.equals(this.name, role.name) &&
        Objects.equals(this.isSystemRole, role.isSystemRole) &&
        Objects.equals(this.behaviors, role.behaviors) &&
        Objects.equals(this.resources, role.resources) &&
        Objects.equals(this.tags, role.tags) &&
        Objects.equals(this.id, role.id) &&
        Objects.equals(this.userScope, role.userScope) &&
        Objects.equals(this.owners, role.owners) &&
        Objects.equals(this.auditInfo, role.auditInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, isSystemRole, behaviors, resources, tags, id, userScope, owners, auditInfo);
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
    sb.append("class Role {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isSystemRole: ").append(toIndentedString(isSystemRole)).append("\n");
    sb.append("    behaviors: ").append(toIndentedString(behaviors)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userScope: ").append(toIndentedString(userScope)).append("\n");
    sb.append("    owners: ").append(toIndentedString(owners)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("isSystemRole");
    openapiFields.add("behaviors");
    openapiFields.add("resources");
    openapiFields.add("tags");
    openapiFields.add("id");
    openapiFields.add("userScope");
    openapiFields.add("owners");
    openapiFields.add("auditInfo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Role
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Role.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Role is not found in the empty JSON string", Role.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!Role.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Role` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("behaviors") != null && !jsonObj.get("behaviors").isJsonNull()) {
        JsonArray jsonArraybehaviors = jsonObj.getAsJsonArray("behaviors");
        if (jsonArraybehaviors != null) {
          // ensure the json data is an array
          if (!jsonObj.get("behaviors").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `behaviors` to be an array in the JSON string but got `%s`", jsonObj.get("behaviors").toString()));
          }

          // validate the optional field `behaviors` (array)
          for (int i = 0; i < jsonArraybehaviors.size(); i++) {
            Behavior.validateJsonObject(jsonArraybehaviors.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("resources") != null && !jsonObj.get("resources").isJsonNull()) {
        JsonArray jsonArrayresources = jsonObj.getAsJsonArray("resources");
        if (jsonArrayresources != null) {
          // ensure the json data is an array
          if (!jsonObj.get("resources").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `resources` to be an array in the JSON string but got `%s`", jsonObj.get("resources").toString()));
          }

          // validate the optional field `resources` (array)
          for (int i = 0; i < jsonArrayresources.size(); i++) {
            Resource.validateJsonObject(jsonArrayresources.get(i).getAsJsonObject());
          };
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
      // validate the optional field `userScope`
      if (jsonObj.get("userScope") != null && !jsonObj.get("userScope").isJsonNull()) {
        UserScope.validateJsonObject(jsonObj.getAsJsonObject("userScope"));
      }
      if (jsonObj.get("owners") != null && !jsonObj.get("owners").isJsonNull()) {
        JsonArray jsonArrayowners = jsonObj.getAsJsonArray("owners");
        if (jsonArrayowners != null) {
          // ensure the json data is an array
          if (!jsonObj.get("owners").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `owners` to be an array in the JSON string but got `%s`", jsonObj.get("owners").toString()));
          }

          // validate the optional field `owners` (array)
          for (int i = 0; i < jsonArrayowners.size(); i++) {
            Owner.validateJsonObject(jsonArrayowners.get(i).getAsJsonObject());
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
       if (!Role.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Role' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Role> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Role.class));

       return (TypeAdapter<T>) new TypeAdapter<Role>() {
           @Override
           public void write(JsonWriter out, Role value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Role read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Role given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Role
  * @throws IOException if the JSON string is invalid with respect to Role
  */
  public static Role fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Role.class);
  }

 /**
  * Convert an instance of Role to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
