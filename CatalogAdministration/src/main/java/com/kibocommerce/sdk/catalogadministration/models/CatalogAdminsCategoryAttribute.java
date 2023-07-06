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
 * CatalogAdminsCategoryAttribute
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CatalogAdminsCategoryAttribute implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_FULLY_QUALIFIED_NAME = "fullyQualifiedName";
  @SerializedName(SERIALIZED_NAME_FULLY_QUALIFIED_NAME)
  private String fullyQualifiedName;

  public static final String SERIALIZED_NAME_ATTRIBUTE_DEFINITION_ID = "attributeDefinitionId";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_DEFINITION_ID)
  private Integer attributeDefinitionId;

  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  private List<Object> values = null;

  public CatalogAdminsCategoryAttribute() {
  }

  public CatalogAdminsCategoryAttribute fullyQualifiedName(String fullyQualifiedName) {
    
    this.fullyQualifiedName = fullyQualifiedName;
    return this;
  }

   /**
   * Get fullyQualifiedName
   * @return fullyQualifiedName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFullyQualifiedName() {
    return fullyQualifiedName;
  }


  public void setFullyQualifiedName(String fullyQualifiedName) {
    this.fullyQualifiedName = fullyQualifiedName;
  }


  public CatalogAdminsCategoryAttribute attributeDefinitionId(Integer attributeDefinitionId) {
    
    this.attributeDefinitionId = attributeDefinitionId;
    return this;
  }

   /**
   * Get attributeDefinitionId
   * @return attributeDefinitionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAttributeDefinitionId() {
    return attributeDefinitionId;
  }


  public void setAttributeDefinitionId(Integer attributeDefinitionId) {
    this.attributeDefinitionId = attributeDefinitionId;
  }


  public CatalogAdminsCategoryAttribute values(List<Object> values) {
    
    this.values = values;
    return this;
  }

  public CatalogAdminsCategoryAttribute addValuesItem(Object valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Get values
   * @return values
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Object> getValues() {
    return values;
  }


  public void setValues(List<Object> values) {
    this.values = values;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogAdminsCategoryAttribute catalogAdminsCategoryAttribute = (CatalogAdminsCategoryAttribute) o;
    return Objects.equals(this.fullyQualifiedName, catalogAdminsCategoryAttribute.fullyQualifiedName) &&
        Objects.equals(this.attributeDefinitionId, catalogAdminsCategoryAttribute.attributeDefinitionId) &&
        Objects.equals(this.values, catalogAdminsCategoryAttribute.values);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullyQualifiedName, attributeDefinitionId, values);
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
    sb.append("class CatalogAdminsCategoryAttribute {\n");
    sb.append("    fullyQualifiedName: ").append(toIndentedString(fullyQualifiedName)).append("\n");
    sb.append("    attributeDefinitionId: ").append(toIndentedString(attributeDefinitionId)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
    openapiFields.add("fullyQualifiedName");
    openapiFields.add("attributeDefinitionId");
    openapiFields.add("values");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CatalogAdminsCategoryAttribute
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CatalogAdminsCategoryAttribute.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CatalogAdminsCategoryAttribute is not found in the empty JSON string", CatalogAdminsCategoryAttribute.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!CatalogAdminsCategoryAttribute.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CatalogAdminsCategoryAttribute` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("fullyQualifiedName") != null && !jsonObj.get("fullyQualifiedName").isJsonNull()) && !jsonObj.get("fullyQualifiedName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fullyQualifiedName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fullyQualifiedName").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("values").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `values` to be an array in the JSON string but got `%s`", jsonObj.get("values").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CatalogAdminsCategoryAttribute.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CatalogAdminsCategoryAttribute' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CatalogAdminsCategoryAttribute> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CatalogAdminsCategoryAttribute.class));

       return (TypeAdapter<T>) new TypeAdapter<CatalogAdminsCategoryAttribute>() {
           @Override
           public void write(JsonWriter out, CatalogAdminsCategoryAttribute value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CatalogAdminsCategoryAttribute read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CatalogAdminsCategoryAttribute given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CatalogAdminsCategoryAttribute
  * @throws IOException if the JSON string is invalid with respect to CatalogAdminsCategoryAttribute
  */
  public static CatalogAdminsCategoryAttribute fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CatalogAdminsCategoryAttribute.class);
  }

 /**
  * Convert an instance of CatalogAdminsCategoryAttribute to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

