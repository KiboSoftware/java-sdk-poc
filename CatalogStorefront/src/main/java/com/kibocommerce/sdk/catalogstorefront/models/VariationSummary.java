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
import com.kibocommerce.sdk.catalogstorefront.models.CatalogRuntimesProductInventoryInfo;
import com.kibocommerce.sdk.catalogstorefront.models.VariationOption;
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
 * Details of a product, including its product code, name, description, options (if any), and current state--whether the product can be purchased given the options selected currently.
 */
@ApiModel(description = "Details of a product, including its product code, name, description, options (if any), and current state--whether the product can be purchased given the options selected currently.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VariationSummary implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_PRODUCT_CODE = "productCode";
  @SerializedName(SERIALIZED_NAME_PRODUCT_CODE)
  private String productCode;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private List<VariationOption> options = null;

  public static final String SERIALIZED_NAME_INVENTORY_INFO = "inventoryInfo";
  @SerializedName(SERIALIZED_NAME_INVENTORY_INFO)
  private CatalogRuntimesProductInventoryInfo inventoryInfo;

  public VariationSummary() {
  }

  public VariationSummary productCode(String productCode) {
    
    this.productCode = productCode;
    return this;
  }

   /**
   * Merchant-created code associated with the variation product, for example, a SKU.
   * @return productCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Merchant-created code associated with the variation product, for example, a SKU.")

  public String getProductCode() {
    return productCode;
  }


  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }


  public VariationSummary options(List<VariationOption> options) {
    
    this.options = options;
    return this;
  }

  public VariationSummary addOptionsItem(VariationOption optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * The combination of options that resolve to this variation product
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The combination of options that resolve to this variation product")

  public List<VariationOption> getOptions() {
    return options;
  }


  public void setOptions(List<VariationOption> options) {
    this.options = options;
  }


  public VariationSummary inventoryInfo(CatalogRuntimesProductInventoryInfo inventoryInfo) {
    
    this.inventoryInfo = inventoryInfo;
    return this;
  }

   /**
   * Get inventoryInfo
   * @return inventoryInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CatalogRuntimesProductInventoryInfo getInventoryInfo() {
    return inventoryInfo;
  }


  public void setInventoryInfo(CatalogRuntimesProductInventoryInfo inventoryInfo) {
    this.inventoryInfo = inventoryInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariationSummary variationSummary = (VariationSummary) o;
    return Objects.equals(this.productCode, variationSummary.productCode) &&
        Objects.equals(this.options, variationSummary.options) &&
        Objects.equals(this.inventoryInfo, variationSummary.inventoryInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(productCode, options, inventoryInfo);
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
    sb.append("class VariationSummary {\n");
    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    inventoryInfo: ").append(toIndentedString(inventoryInfo)).append("\n");
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
    openapiFields.add("productCode");
    openapiFields.add("options");
    openapiFields.add("inventoryInfo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VariationSummary
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!VariationSummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VariationSummary is not found in the empty JSON string", VariationSummary.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!VariationSummary.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VariationSummary` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("productCode") != null && !jsonObj.get("productCode").isJsonNull()) && !jsonObj.get("productCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productCode").toString()));
      }
      if (jsonObj.get("options") != null && !jsonObj.get("options").isJsonNull()) {
        JsonArray jsonArrayoptions = jsonObj.getAsJsonArray("options");
        if (jsonArrayoptions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("options").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `options` to be an array in the JSON string but got `%s`", jsonObj.get("options").toString()));
          }

          // validate the optional field `options` (array)
          for (int i = 0; i < jsonArrayoptions.size(); i++) {
            VariationOption.validateJsonObject(jsonArrayoptions.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `inventoryInfo`
      if (jsonObj.get("inventoryInfo") != null && !jsonObj.get("inventoryInfo").isJsonNull()) {
        CatalogRuntimesProductInventoryInfo.validateJsonObject(jsonObj.getAsJsonObject("inventoryInfo"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VariationSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VariationSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VariationSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VariationSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<VariationSummary>() {
           @Override
           public void write(JsonWriter out, VariationSummary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VariationSummary read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VariationSummary given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VariationSummary
  * @throws IOException if the JSON string is invalid with respect to VariationSummary
  */
  public static VariationSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VariationSummary.class);
  }

 /**
  * Convert an instance of VariationSummary to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

