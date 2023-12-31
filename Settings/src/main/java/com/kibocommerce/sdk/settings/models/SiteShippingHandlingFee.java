/*
 * Kibo SiteSettings Service
 * OpenAPI Spec for Kibo SiteSettings Service
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.settings.models;

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
 * The site setting that specifies the store&#39;s handling fees
 */
@ApiModel(description = "The site setting that specifies the store's handling fees")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SiteShippingHandlingFee implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Double amount;

  public SiteShippingHandlingFee() {
  }

  public SiteShippingHandlingFee amount(Double amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Site setting for the name that appears as the sender of the shipping origin.
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Site setting for the name that appears as the sender of the shipping origin.")

  public Double getAmount() {
    return amount;
  }


  public void setAmount(Double amount) {
    this.amount = amount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SiteShippingHandlingFee siteShippingHandlingFee = (SiteShippingHandlingFee) o;
    return Objects.equals(this.amount, siteShippingHandlingFee.amount);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount);
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
    sb.append("class SiteShippingHandlingFee {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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
    openapiFields.add("amount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SiteShippingHandlingFee
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SiteShippingHandlingFee.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SiteShippingHandlingFee is not found in the empty JSON string", SiteShippingHandlingFee.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!SiteShippingHandlingFee.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SiteShippingHandlingFee` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SiteShippingHandlingFee.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SiteShippingHandlingFee' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SiteShippingHandlingFee> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SiteShippingHandlingFee.class));

       return (TypeAdapter<T>) new TypeAdapter<SiteShippingHandlingFee>() {
           @Override
           public void write(JsonWriter out, SiteShippingHandlingFee value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SiteShippingHandlingFee read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SiteShippingHandlingFee given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SiteShippingHandlingFee
  * @throws IOException if the JSON string is invalid with respect to SiteShippingHandlingFee
  */
  public static SiteShippingHandlingFee fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SiteShippingHandlingFee.class);
  }

 /**
  * Convert an instance of SiteShippingHandlingFee to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

