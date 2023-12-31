/*
 * Kibo Content Service
 * OpenAPI Spec for Kibo Content Service
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.content.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kibocommerce.sdk.content.models.ViewField;
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
 * A view provides GET access to documents within the documentList the view belongs to. The view can designate which document fields are returned (projection) and  a security model for providing GET access independent of the documentList&#39;s security model.
 */
@ApiModel(description = "A view provides GET access to documents within the documentList the view belongs to. The view can designate which document fields are returned (projection) and  a security model for providing GET access independent of the documentList's security model.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class View implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_USAGES = "usages";
  @SerializedName(SERIALIZED_NAME_USAGES)
  private List<String> usages = null;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata = null;

  public static final String SERIALIZED_NAME_IS_VISIBLE_IN_STOREFRONT = "isVisibleInStorefront";
  @SerializedName(SERIALIZED_NAME_IS_VISIBLE_IN_STOREFRONT)
  private Boolean isVisibleInStorefront;

  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private String filter;

  public static final String SERIALIZED_NAME_INCLUDE_INACTIVE_MODE = "includeInactiveMode";
  @SerializedName(SERIALIZED_NAME_INCLUDE_INACTIVE_MODE)
  private String includeInactiveMode;

  public static final String SERIALIZED_NAME_IS_ADMIN_DEFAULT = "isAdminDefault";
  @SerializedName(SERIALIZED_NAME_IS_ADMIN_DEFAULT)
  private Boolean isAdminDefault;

  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private List<ViewField> fields = null;

  public View() {
  }

  public View name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * A view is addressed via its name, which is unique within the documentList or documentListType in which it is defined.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A view is addressed via its name, which is unique within the documentList or documentListType in which it is defined.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public View usages(List<String> usages) {
    
    this.usages = usages;
    return this;
  }

  public View addUsagesItem(String usagesItem) {
    if (this.usages == null) {
      this.usages = new ArrayList<>();
    }
    this.usages.add(usagesItem);
    return this;
  }

   /**
   * tbd
   * @return usages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "tbd")

  public List<String> getUsages() {
    return usages;
  }


  public void setUsages(List<String> usages) {
    this.usages = usages;
  }


  public View metadata(Object metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * The metadata field allows arbitrary data to be stored on the view.
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The metadata field allows arbitrary data to be stored on the view.")

  public Object getMetadata() {
    return metadata;
  }


  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  public View isVisibleInStorefront(Boolean isVisibleInStorefront) {
    
    this.isVisibleInStorefront = isVisibleInStorefront;
    return this;
  }

   /**
   * The isVisibleInStorefront field indicates whether documents in the view can be accessed from the Mozu storefront application. If true, the storefront application and storefront client application (javascript tier)   can GET documents from the view.
   * @return isVisibleInStorefront
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The isVisibleInStorefront field indicates whether documents in the view can be accessed from the Mozu storefront application. If true, the storefront application and storefront client application (javascript tier)   can GET documents from the view.")

  public Boolean getIsVisibleInStorefront() {
    return isVisibleInStorefront;
  }


  public void setIsVisibleInStorefront(Boolean isVisibleInStorefront) {
    this.isVisibleInStorefront = isVisibleInStorefront;
  }


  public View filter(String filter) {
    
    this.filter = filter;
    return this;
  }

   /**
   * Filter criteria to apply automatically when documents from this view are accessed, using the standard Mozu filter syntax. Only documents matching the filter criteria will be returned.   Any filter provided by an operation is combined with the view filter.
   * @return filter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter criteria to apply automatically when documents from this view are accessed, using the standard Mozu filter syntax. Only documents matching the filter criteria will be returned.   Any filter provided by an operation is combined with the view filter.")

  public String getFilter() {
    return filter;
  }


  public void setFilter(String filter) {
    this.filter = filter;
  }


  public View includeInactiveMode(String includeInactiveMode) {
    
    this.includeInactiveMode = includeInactiveMode;
    return this;
  }

   /**
   * If view documents are requested with includeInactive&#x3D;true, then this controls which documents return. If includeInactive is not provided or set to false, then only active documents return.  If not set, or set to \&quot;all\&quot;, then all documents return.  If set to \&quot;active\&quot;, then only documents within the active date range and documents with no active date range are returned.  If set to \&quot;scheduled\&quot;, then only documents with an active date range in the future are returned.  If set to \&quot;activeOrScheduled\&quot;, then only documents that are active or documents with an active date range in the future are returned.  If set to \&quot;ended\&quot;, then only documents with an active date range in the past are returned.
   * @return includeInactiveMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If view documents are requested with includeInactive=true, then this controls which documents return. If includeInactive is not provided or set to false, then only active documents return.  If not set, or set to \"all\", then all documents return.  If set to \"active\", then only documents within the active date range and documents with no active date range are returned.  If set to \"scheduled\", then only documents with an active date range in the future are returned.  If set to \"activeOrScheduled\", then only documents that are active or documents with an active date range in the future are returned.  If set to \"ended\", then only documents with an active date range in the past are returned.")

  public String getIncludeInactiveMode() {
    return includeInactiveMode;
  }


  public void setIncludeInactiveMode(String includeInactiveMode) {
    this.includeInactiveMode = includeInactiveMode;
  }


  public View isAdminDefault(Boolean isAdminDefault) {
    
    this.isAdminDefault = isAdminDefault;
    return this;
  }

   /**
   * Get isAdminDefault
   * @return isAdminDefault
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsAdminDefault() {
    return isAdminDefault;
  }


  public void setIsAdminDefault(Boolean isAdminDefault) {
    this.isAdminDefault = isAdminDefault;
  }


  public View fields(List<ViewField> fields) {
    
    this.fields = fields;
    return this;
  }

  public View addFieldsItem(ViewField fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * Designation of which document fields are returned (projection) when GETing documents from the view.
   * @return fields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Designation of which document fields are returned (projection) when GETing documents from the view.")

  public List<ViewField> getFields() {
    return fields;
  }


  public void setFields(List<ViewField> fields) {
    this.fields = fields;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    View view = (View) o;
    return Objects.equals(this.name, view.name) &&
        Objects.equals(this.usages, view.usages) &&
        Objects.equals(this.metadata, view.metadata) &&
        Objects.equals(this.isVisibleInStorefront, view.isVisibleInStorefront) &&
        Objects.equals(this.filter, view.filter) &&
        Objects.equals(this.includeInactiveMode, view.includeInactiveMode) &&
        Objects.equals(this.isAdminDefault, view.isAdminDefault) &&
        Objects.equals(this.fields, view.fields);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, usages, metadata, isVisibleInStorefront, filter, includeInactiveMode, isAdminDefault, fields);
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
    sb.append("class View {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    usages: ").append(toIndentedString(usages)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    isVisibleInStorefront: ").append(toIndentedString(isVisibleInStorefront)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    includeInactiveMode: ").append(toIndentedString(includeInactiveMode)).append("\n");
    sb.append("    isAdminDefault: ").append(toIndentedString(isAdminDefault)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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
    openapiFields.add("usages");
    openapiFields.add("metadata");
    openapiFields.add("isVisibleInStorefront");
    openapiFields.add("filter");
    openapiFields.add("includeInactiveMode");
    openapiFields.add("isAdminDefault");
    openapiFields.add("fields");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to View
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!View.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in View is not found in the empty JSON string", View.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!View.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `View` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("usages").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `usages` to be an array in the JSON string but got `%s`", jsonObj.get("usages").toString()));
      }
      if ((jsonObj.get("filter") != null && !jsonObj.get("filter").isJsonNull()) && !jsonObj.get("filter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `filter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filter").toString()));
      }
      if ((jsonObj.get("includeInactiveMode") != null && !jsonObj.get("includeInactiveMode").isJsonNull()) && !jsonObj.get("includeInactiveMode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `includeInactiveMode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("includeInactiveMode").toString()));
      }
      if (jsonObj.get("fields") != null && !jsonObj.get("fields").isJsonNull()) {
        JsonArray jsonArrayfields = jsonObj.getAsJsonArray("fields");
        if (jsonArrayfields != null) {
          // ensure the json data is an array
          if (!jsonObj.get("fields").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `fields` to be an array in the JSON string but got `%s`", jsonObj.get("fields").toString()));
          }

          // validate the optional field `fields` (array)
          for (int i = 0; i < jsonArrayfields.size(); i++) {
            ViewField.validateJsonObject(jsonArrayfields.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!View.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'View' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<View> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(View.class));

       return (TypeAdapter<T>) new TypeAdapter<View>() {
           @Override
           public void write(JsonWriter out, View value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public View read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of View given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of View
  * @throws IOException if the JSON string is invalid with respect to View
  */
  public static View fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, View.class);
  }

 /**
  * Convert an instance of View to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

