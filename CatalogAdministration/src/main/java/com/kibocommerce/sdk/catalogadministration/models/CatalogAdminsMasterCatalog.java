/*
 * Kibo Catalog Admin Services
 * OpenAPI Spec for Kibo Catalog Admin Services
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.catalogadministration.models;

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
 * CatalogAdminsMasterCatalog
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CatalogAdminsMasterCatalog implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PRODUCT_PUBLISHING_MODE = "productPublishingMode";
  @SerializedName(SERIALIZED_NAME_PRODUCT_PUBLISHING_MODE)
  private String productPublishingMode;

  public static final String SERIALIZED_NAME_ENABLE_LIVE_EDIT = "enableLiveEdit";
  @SerializedName(SERIALIZED_NAME_ENABLE_LIVE_EDIT)
  private Boolean enableLiveEdit;

  public static final String SERIALIZED_NAME_IS_DELETED = "isDeleted";
  @SerializedName(SERIALIZED_NAME_IS_DELETED)
  private Boolean isDeleted;

  public CatalogAdminsMasterCatalog() {
  }

  public CatalogAdminsMasterCatalog id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * MasterCatalogId (readonly)
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MasterCatalogId (readonly)")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public CatalogAdminsMasterCatalog name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the MasterCatalog (readonly)
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the MasterCatalog (readonly)")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CatalogAdminsMasterCatalog productPublishingMode(String productPublishingMode) {
    
    this.productPublishingMode = productPublishingMode;
    return this;
  }

   /**
   * The product publishing mode of this MasterCatalog
   * @return productPublishingMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The product publishing mode of this MasterCatalog")

  public String getProductPublishingMode() {
    return productPublishingMode;
  }


  public void setProductPublishingMode(String productPublishingMode) {
    this.productPublishingMode = productPublishingMode;
  }


  public CatalogAdminsMasterCatalog enableLiveEdit(Boolean enableLiveEdit) {
    
    this.enableLiveEdit = enableLiveEdit;
    return this;
  }

   /**
   * If the publishingMode is Pending and LiveEditsEnabled &#x3D; true, DataViewMode live can be passed in the header and live products can be directly edited.
   * @return enableLiveEdit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If the publishingMode is Pending and LiveEditsEnabled = true, DataViewMode live can be passed in the header and live products can be directly edited.")

  public Boolean getEnableLiveEdit() {
    return enableLiveEdit;
  }


  public void setEnableLiveEdit(Boolean enableLiveEdit) {
    this.enableLiveEdit = enableLiveEdit;
  }


  public CatalogAdminsMasterCatalog isDeleted(Boolean isDeleted) {
    
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * Indicates whether the MasterCatalog has been deleted and should no longer be used
   * @return isDeleted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the MasterCatalog has been deleted and should no longer be used")

  public Boolean getIsDeleted() {
    return isDeleted;
  }


  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogAdminsMasterCatalog catalogAdminsMasterCatalog = (CatalogAdminsMasterCatalog) o;
    return Objects.equals(this.id, catalogAdminsMasterCatalog.id) &&
        Objects.equals(this.name, catalogAdminsMasterCatalog.name) &&
        Objects.equals(this.productPublishingMode, catalogAdminsMasterCatalog.productPublishingMode) &&
        Objects.equals(this.enableLiveEdit, catalogAdminsMasterCatalog.enableLiveEdit) &&
        Objects.equals(this.isDeleted, catalogAdminsMasterCatalog.isDeleted);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, productPublishingMode, enableLiveEdit, isDeleted);
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
    sb.append("class CatalogAdminsMasterCatalog {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    productPublishingMode: ").append(toIndentedString(productPublishingMode)).append("\n");
    sb.append("    enableLiveEdit: ").append(toIndentedString(enableLiveEdit)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("productPublishingMode");
    openapiFields.add("enableLiveEdit");
    openapiFields.add("isDeleted");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CatalogAdminsMasterCatalog
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CatalogAdminsMasterCatalog.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CatalogAdminsMasterCatalog is not found in the empty JSON string", CatalogAdminsMasterCatalog.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!CatalogAdminsMasterCatalog.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CatalogAdminsMasterCatalog` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("productPublishingMode") != null && !jsonObj.get("productPublishingMode").isJsonNull()) && !jsonObj.get("productPublishingMode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productPublishingMode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productPublishingMode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CatalogAdminsMasterCatalog.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CatalogAdminsMasterCatalog' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CatalogAdminsMasterCatalog> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CatalogAdminsMasterCatalog.class));

       return (TypeAdapter<T>) new TypeAdapter<CatalogAdminsMasterCatalog>() {
           @Override
           public void write(JsonWriter out, CatalogAdminsMasterCatalog value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CatalogAdminsMasterCatalog read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CatalogAdminsMasterCatalog given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CatalogAdminsMasterCatalog
  * @throws IOException if the JSON string is invalid with respect to CatalogAdminsMasterCatalog
  */
  public static CatalogAdminsMasterCatalog fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CatalogAdminsMasterCatalog.class);
  }

 /**
  * Convert an instance of CatalogAdminsMasterCatalog to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

