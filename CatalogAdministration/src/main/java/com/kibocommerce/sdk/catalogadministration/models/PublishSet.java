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
 * PublishSet
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PublishSet implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_PRODUCT_COUNT = "productCount";
  @SerializedName(SERIALIZED_NAME_PRODUCT_COUNT)
  private Integer productCount;

  public static final String SERIALIZED_NAME_PRODUCT_CODES = "productCodes";
  @SerializedName(SERIALIZED_NAME_PRODUCT_CODES)
  private List<String> productCodes = null;

  public PublishSet() {
  }

  public PublishSet code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * The PublishSet unique identifier
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The PublishSet unique identifier")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public PublishSet productCount(Integer productCount) {
    
    this.productCount = productCount;
    return this;
  }

   /**
   * Number of product drafts that are included in the publish set
   * @return productCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of product drafts that are included in the publish set")

  public Integer getProductCount() {
    return productCount;
  }


  public void setProductCount(Integer productCount) {
    this.productCount = productCount;
  }


  public PublishSet productCodes(List<String> productCodes) {
    
    this.productCodes = productCodes;
    return this;
  }

  public PublishSet addProductCodesItem(String productCodesItem) {
    if (this.productCodes == null) {
      this.productCodes = new ArrayList<>();
    }
    this.productCodes.add(productCodesItem);
    return this;
  }

   /**
   * List of specific product codes that are included in the publish set
   * @return productCodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of specific product codes that are included in the publish set")

  public List<String> getProductCodes() {
    return productCodes;
  }


  public void setProductCodes(List<String> productCodes) {
    this.productCodes = productCodes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublishSet publishSet = (PublishSet) o;
    return Objects.equals(this.code, publishSet.code) &&
        Objects.equals(this.productCount, publishSet.productCount) &&
        Objects.equals(this.productCodes, publishSet.productCodes);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, productCount, productCodes);
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
    sb.append("class PublishSet {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    productCount: ").append(toIndentedString(productCount)).append("\n");
    sb.append("    productCodes: ").append(toIndentedString(productCodes)).append("\n");
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
    openapiFields.add("code");
    openapiFields.add("productCount");
    openapiFields.add("productCodes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PublishSet
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PublishSet.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PublishSet is not found in the empty JSON string", PublishSet.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!PublishSet.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PublishSet` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("code") != null && !jsonObj.get("code").isJsonNull()) && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("productCodes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `productCodes` to be an array in the JSON string but got `%s`", jsonObj.get("productCodes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PublishSet.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PublishSet' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PublishSet> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PublishSet.class));

       return (TypeAdapter<T>) new TypeAdapter<PublishSet>() {
           @Override
           public void write(JsonWriter out, PublishSet value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PublishSet read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PublishSet given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PublishSet
  * @throws IOException if the JSON string is invalid with respect to PublishSet
  */
  public static PublishSet fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PublishSet.class);
  }

 /**
  * Convert an instance of PublishSet to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

