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
import com.kibocommerce.sdk.catalogstorefront.models.CatalogRuntimesProductPrice;
import com.kibocommerce.sdk.catalogstorefront.models.ProductImage;
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
 * ProductSubstitution
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ProductSubstitution implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_PRODUCT_CODE = "productCode";
  @SerializedName(SERIALIZED_NAME_PRODUCT_CODE)
  private String productCode;

  public static final String SERIALIZED_NAME_BASE_PRODUCT_CODE = "baseProductCode";
  @SerializedName(SERIALIZED_NAME_BASE_PRODUCT_CODE)
  private String baseProductCode;

  public static final String SERIALIZED_NAME_PRODUCT_NAME = "productName";
  @SerializedName(SERIALIZED_NAME_PRODUCT_NAME)
  private String productName;

  public static final String SERIALIZED_NAME_PRODUCT_USAGE = "productUsage";
  @SerializedName(SERIALIZED_NAME_PRODUCT_USAGE)
  private String productUsage;

  public static final String SERIALIZED_NAME_UPC = "upc";
  @SerializedName(SERIALIZED_NAME_UPC)
  private String upc;

  public static final String SERIALIZED_NAME_MFG_PART_NUMBER = "mfgPartNumber";
  @SerializedName(SERIALIZED_NAME_MFG_PART_NUMBER)
  private String mfgPartNumber;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private CatalogRuntimesProductPrice price;

  public static final String SERIALIZED_NAME_PRODUCT_IMAGES = "productImages";
  @SerializedName(SERIALIZED_NAME_PRODUCT_IMAGES)
  private List<ProductImage> productImages = null;

  public ProductSubstitution() {
  }

  public ProductSubstitution productCode(String productCode) {
    
    this.productCode = productCode;
    return this;
  }

   /**
   * Merchant-created code associated with the product, for example, a SKU.
   * @return productCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Merchant-created code associated with the product, for example, a SKU.")

  public String getProductCode() {
    return productCode;
  }


  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }


  public ProductSubstitution baseProductCode(String baseProductCode) {
    
    this.baseProductCode = baseProductCode;
    return this;
  }

   /**
   * When a configurable product has IsPurchasable&#x3D;true on a GetProduct, this property will be populated for submission to cart.
   * @return baseProductCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When a configurable product has IsPurchasable=true on a GetProduct, this property will be populated for submission to cart.")

  public String getBaseProductCode() {
    return baseProductCode;
  }


  public void setBaseProductCode(String baseProductCode) {
    this.baseProductCode = baseProductCode;
  }


  public ProductSubstitution productName(String productName) {
    
    this.productName = productName;
    return this;
  }

   /**
   * Get productName
   * @return productName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProductName() {
    return productName;
  }


  public void setProductName(String productName) {
    this.productName = productName;
  }


  public ProductSubstitution productUsage(String productUsage) {
    
    this.productUsage = productUsage;
    return this;
  }

   /**
   * The UsageType of this product (Standard, Configurable, Bundle, Component, Collection)
   * @return productUsage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The UsageType of this product (Standard, Configurable, Bundle, Component, Collection)")

  public String getProductUsage() {
    return productUsage;
  }


  public void setProductUsage(String productUsage) {
    this.productUsage = productUsage;
  }


  public ProductSubstitution upc(String upc) {
    
    this.upc = upc;
    return this;
  }

   /**
   * UPC code of the products (populated for configurable products).
   * @return upc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "UPC code of the products (populated for configurable products).")

  public String getUpc() {
    return upc;
  }


  public void setUpc(String upc) {
    this.upc = upc;
  }


  public ProductSubstitution mfgPartNumber(String mfgPartNumber) {
    
    this.mfgPartNumber = mfgPartNumber;
    return this;
  }

   /**
   * Manufacturer part number.
   * @return mfgPartNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Manufacturer part number.")

  public String getMfgPartNumber() {
    return mfgPartNumber;
  }


  public void setMfgPartNumber(String mfgPartNumber) {
    this.mfgPartNumber = mfgPartNumber;
  }


  public ProductSubstitution price(CatalogRuntimesProductPrice price) {
    
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CatalogRuntimesProductPrice getPrice() {
    return price;
  }


  public void setPrice(CatalogRuntimesProductPrice price) {
    this.price = price;
  }


  public ProductSubstitution productImages(List<ProductImage> productImages) {
    
    this.productImages = productImages;
    return this;
  }

  public ProductSubstitution addProductImagesItem(ProductImage productImagesItem) {
    if (this.productImages == null) {
      this.productImages = new ArrayList<>();
    }
    this.productImages.add(productImagesItem);
    return this;
  }

   /**
   * Get productImages
   * @return productImages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ProductImage> getProductImages() {
    return productImages;
  }


  public void setProductImages(List<ProductImage> productImages) {
    this.productImages = productImages;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductSubstitution productSubstitution = (ProductSubstitution) o;
    return Objects.equals(this.productCode, productSubstitution.productCode) &&
        Objects.equals(this.baseProductCode, productSubstitution.baseProductCode) &&
        Objects.equals(this.productName, productSubstitution.productName) &&
        Objects.equals(this.productUsage, productSubstitution.productUsage) &&
        Objects.equals(this.upc, productSubstitution.upc) &&
        Objects.equals(this.mfgPartNumber, productSubstitution.mfgPartNumber) &&
        Objects.equals(this.price, productSubstitution.price) &&
        Objects.equals(this.productImages, productSubstitution.productImages);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(productCode, baseProductCode, productName, productUsage, upc, mfgPartNumber, price, productImages);
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
    sb.append("class ProductSubstitution {\n");
    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
    sb.append("    baseProductCode: ").append(toIndentedString(baseProductCode)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    productUsage: ").append(toIndentedString(productUsage)).append("\n");
    sb.append("    upc: ").append(toIndentedString(upc)).append("\n");
    sb.append("    mfgPartNumber: ").append(toIndentedString(mfgPartNumber)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    productImages: ").append(toIndentedString(productImages)).append("\n");
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
    openapiFields.add("baseProductCode");
    openapiFields.add("productName");
    openapiFields.add("productUsage");
    openapiFields.add("upc");
    openapiFields.add("mfgPartNumber");
    openapiFields.add("price");
    openapiFields.add("productImages");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProductSubstitution
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ProductSubstitution.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductSubstitution is not found in the empty JSON string", ProductSubstitution.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!ProductSubstitution.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProductSubstitution` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("productCode") != null && !jsonObj.get("productCode").isJsonNull()) && !jsonObj.get("productCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productCode").toString()));
      }
      if ((jsonObj.get("baseProductCode") != null && !jsonObj.get("baseProductCode").isJsonNull()) && !jsonObj.get("baseProductCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `baseProductCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("baseProductCode").toString()));
      }
      if ((jsonObj.get("productName") != null && !jsonObj.get("productName").isJsonNull()) && !jsonObj.get("productName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productName").toString()));
      }
      if ((jsonObj.get("productUsage") != null && !jsonObj.get("productUsage").isJsonNull()) && !jsonObj.get("productUsage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productUsage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productUsage").toString()));
      }
      if ((jsonObj.get("upc") != null && !jsonObj.get("upc").isJsonNull()) && !jsonObj.get("upc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `upc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("upc").toString()));
      }
      if ((jsonObj.get("mfgPartNumber") != null && !jsonObj.get("mfgPartNumber").isJsonNull()) && !jsonObj.get("mfgPartNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mfgPartNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mfgPartNumber").toString()));
      }
      // validate the optional field `price`
      if (jsonObj.get("price") != null && !jsonObj.get("price").isJsonNull()) {
        CatalogRuntimesProductPrice.validateJsonObject(jsonObj.getAsJsonObject("price"));
      }
      if (jsonObj.get("productImages") != null && !jsonObj.get("productImages").isJsonNull()) {
        JsonArray jsonArrayproductImages = jsonObj.getAsJsonArray("productImages");
        if (jsonArrayproductImages != null) {
          // ensure the json data is an array
          if (!jsonObj.get("productImages").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `productImages` to be an array in the JSON string but got `%s`", jsonObj.get("productImages").toString()));
          }

          // validate the optional field `productImages` (array)
          for (int i = 0; i < jsonArrayproductImages.size(); i++) {
            ProductImage.validateJsonObject(jsonArrayproductImages.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductSubstitution.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductSubstitution' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductSubstitution> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductSubstitution.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductSubstitution>() {
           @Override
           public void write(JsonWriter out, ProductSubstitution value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductSubstitution read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProductSubstitution given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductSubstitution
  * @throws IOException if the JSON string is invalid with respect to ProductSubstitution
  */
  public static ProductSubstitution fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductSubstitution.class);
  }

 /**
  * Convert an instance of ProductSubstitution to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
