/*
 * Kibo Catalog Runtime Services
 * OpenAPI Spec for Kibo Catalog Runtime Services
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.catalogstorefront.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kibocommerce.sdk.catalogstorefront.models.CatalogRuntimesAttributeVocabularyValueDisplayInfo;
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
 * Value of product property
 */
@ApiModel(description = "Value of product property")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CatalogRuntimesProductPropertyValue implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Object value = null;

  public static final String SERIALIZED_NAME_STRING_VALUE = "stringValue";
  @SerializedName(SERIALIZED_NAME_STRING_VALUE)
  private String stringValue;

  public static final String SERIALIZED_NAME_DISPLAY_INFO = "displayInfo";
  @SerializedName(SERIALIZED_NAME_DISPLAY_INFO)
  private CatalogRuntimesAttributeVocabularyValueDisplayInfo displayInfo;

  public CatalogRuntimesProductPropertyValue() {
  }

  public CatalogRuntimesProductPropertyValue value(Object value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getValue() {
    return value;
  }


  public void setValue(Object value) {
    this.value = value;
  }


  public CatalogRuntimesProductPropertyValue stringValue(String stringValue) {
    
    this.stringValue = stringValue;
    return this;
  }

   /**
   * Localized Value in the language of the locale code
   * @return stringValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Localized Value in the language of the locale code")

  public String getStringValue() {
    return stringValue;
  }


  public void setStringValue(String stringValue) {
    this.stringValue = stringValue;
  }


  public CatalogRuntimesProductPropertyValue displayInfo(CatalogRuntimesAttributeVocabularyValueDisplayInfo displayInfo) {
    
    this.displayInfo = displayInfo;
    return this;
  }

   /**
   * Get displayInfo
   * @return displayInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CatalogRuntimesAttributeVocabularyValueDisplayInfo getDisplayInfo() {
    return displayInfo;
  }


  public void setDisplayInfo(CatalogRuntimesAttributeVocabularyValueDisplayInfo displayInfo) {
    this.displayInfo = displayInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogRuntimesProductPropertyValue catalogRuntimesProductPropertyValue = (CatalogRuntimesProductPropertyValue) o;
    return Objects.equals(this.value, catalogRuntimesProductPropertyValue.value) &&
        Objects.equals(this.stringValue, catalogRuntimesProductPropertyValue.stringValue) &&
        Objects.equals(this.displayInfo, catalogRuntimesProductPropertyValue.displayInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, stringValue, displayInfo);
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
    sb.append("class CatalogRuntimesProductPropertyValue {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    stringValue: ").append(toIndentedString(stringValue)).append("\n");
    sb.append("    displayInfo: ").append(toIndentedString(displayInfo)).append("\n");
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
    openapiFields.add("value");
    openapiFields.add("stringValue");
    openapiFields.add("displayInfo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CatalogRuntimesProductPropertyValue
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CatalogRuntimesProductPropertyValue.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CatalogRuntimesProductPropertyValue is not found in the empty JSON string", CatalogRuntimesProductPropertyValue.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!CatalogRuntimesProductPropertyValue.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CatalogRuntimesProductPropertyValue` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("stringValue") != null && !jsonObj.get("stringValue").isJsonNull()) && !jsonObj.get("stringValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stringValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stringValue").toString()));
      }
      // validate the optional field `displayInfo`
      if (jsonObj.get("displayInfo") != null && !jsonObj.get("displayInfo").isJsonNull()) {
        CatalogRuntimesAttributeVocabularyValueDisplayInfo.validateJsonObject(jsonObj.getAsJsonObject("displayInfo"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CatalogRuntimesProductPropertyValue.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CatalogRuntimesProductPropertyValue' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CatalogRuntimesProductPropertyValue> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CatalogRuntimesProductPropertyValue.class));

       return (TypeAdapter<T>) new TypeAdapter<CatalogRuntimesProductPropertyValue>() {
           @Override
           public void write(JsonWriter out, CatalogRuntimesProductPropertyValue value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CatalogRuntimesProductPropertyValue read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CatalogRuntimesProductPropertyValue given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CatalogRuntimesProductPropertyValue
  * @throws IOException if the JSON string is invalid with respect to CatalogRuntimesProductPropertyValue
  */
  public static CatalogRuntimesProductPropertyValue fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CatalogRuntimesProductPropertyValue.class);
  }

 /**
  * Convert an instance of CatalogRuntimesProductPropertyValue to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

