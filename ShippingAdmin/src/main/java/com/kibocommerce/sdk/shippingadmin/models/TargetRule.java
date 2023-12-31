/*
 * Kibo Shipping Admin Service
 * OpenAPI Spec for Kibo Shipping Admin Service
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.shippingadmin.models;

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
 * An object used to define a bool expression against a particular domain type
 */
@ApiModel(description = "An object used to define a bool expression against a particular domain type")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TargetRule implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  private String domain;

  public static final String SERIALIZED_NAME_EXPRESSION = "expression";
  @SerializedName(SERIALIZED_NAME_EXPRESSION)
  private String expression;

  public TargetRule() {
  }

  public TargetRule code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * The user defined code for this rule  &lt;remarks&gt;must be unique&lt;/remarks&gt;
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user defined code for this rule  <remarks>must be unique</remarks>")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public TargetRule description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of this rule
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of this rule")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public TargetRule domain(String domain) {
    
    this.domain = domain;
    return this;
  }

   /**
   * The domain of this rule  &lt;value&gt;Product&lt;/value&gt;&lt;value&gt;Order&lt;/value&gt;
   * @return domain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The domain of this rule  <value>Product</value><value>Order</value>")

  public String getDomain() {
    return domain;
  }


  public void setDomain(String domain) {
    this.domain = domain;
  }


  public TargetRule expression(String expression) {
    
    this.expression = expression;
    return this;
  }

   /**
   * the expression of this rule
   * @return expression
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the expression of this rule")

  public String getExpression() {
    return expression;
  }


  public void setExpression(String expression) {
    this.expression = expression;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetRule targetRule = (TargetRule) o;
    return Objects.equals(this.code, targetRule.code) &&
        Objects.equals(this.description, targetRule.description) &&
        Objects.equals(this.domain, targetRule.domain) &&
        Objects.equals(this.expression, targetRule.expression);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description, domain, expression);
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
    sb.append("class TargetRule {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("domain");
    openapiFields.add("expression");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TargetRule
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TargetRule.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TargetRule is not found in the empty JSON string", TargetRule.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!TargetRule.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TargetRule` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("code") != null && !jsonObj.get("code").isJsonNull()) && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("domain") != null && !jsonObj.get("domain").isJsonNull()) && !jsonObj.get("domain").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `domain` to be a primitive type in the JSON string but got `%s`", jsonObj.get("domain").toString()));
      }
      if ((jsonObj.get("expression") != null && !jsonObj.get("expression").isJsonNull()) && !jsonObj.get("expression").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expression` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expression").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TargetRule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TargetRule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TargetRule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TargetRule.class));

       return (TypeAdapter<T>) new TypeAdapter<TargetRule>() {
           @Override
           public void write(JsonWriter out, TargetRule value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TargetRule read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TargetRule given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TargetRule
  * @throws IOException if the JSON string is invalid with respect to TargetRule
  */
  public static TargetRule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TargetRule.class);
  }

 /**
  * Convert an instance of TargetRule to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

