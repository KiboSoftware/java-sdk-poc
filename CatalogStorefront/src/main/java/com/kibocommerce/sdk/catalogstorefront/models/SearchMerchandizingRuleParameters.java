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
import com.kibocommerce.sdk.catalogstorefront.models.CatalogRuntimesSearchMerchandizingRule;
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
 * SearchMerchandizingRuleParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SearchMerchandizingRuleParameters implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_PERSONALIZATION_USER_ID = "personalizationUserId";
  @SerializedName(SERIALIZED_NAME_PERSONALIZATION_USER_ID)
  private String personalizationUserId;

  public static final String SERIALIZED_NAME_QUERY = "query";
  @SerializedName(SERIALIZED_NAME_QUERY)
  private String query;

  public static final String SERIALIZED_NAME_CATEGORY_CODE = "categoryCode";
  @SerializedName(SERIALIZED_NAME_CATEGORY_CODE)
  private String categoryCode;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "pageSize";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize;

  public static final String SERIALIZED_NAME_START_INDEX = "startIndex";
  @SerializedName(SERIALIZED_NAME_START_INDEX)
  private Integer startIndex;

  public static final String SERIALIZED_NAME_SEARCH_MERCHANDIZING_RULE = "searchMerchandizingRule";
  @SerializedName(SERIALIZED_NAME_SEARCH_MERCHANDIZING_RULE)
  private CatalogRuntimesSearchMerchandizingRule searchMerchandizingRule;

  public SearchMerchandizingRuleParameters() {
  }

  public SearchMerchandizingRuleParameters personalizationUserId(String personalizationUserId) {
    
    this.personalizationUserId = personalizationUserId;
    return this;
  }

   /**
   * User specific personalization ID.  For Monetate users (AKA MID), it follows this format 2.x.y, where x and y are integers
   * @return personalizationUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "User specific personalization ID.  For Monetate users (AKA MID), it follows this format 2.x.y, where x and y are integers")

  public String getPersonalizationUserId() {
    return personalizationUserId;
  }


  public void setPersonalizationUserId(String personalizationUserId) {
    this.personalizationUserId = personalizationUserId;
  }


  public SearchMerchandizingRuleParameters query(String query) {
    
    this.query = query;
    return this;
  }

   /**
   * Get query
   * @return query
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getQuery() {
    return query;
  }


  public void setQuery(String query) {
    this.query = query;
  }


  public SearchMerchandizingRuleParameters categoryCode(String categoryCode) {
    
    this.categoryCode = categoryCode;
    return this;
  }

   /**
   * Get categoryCode
   * @return categoryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCategoryCode() {
    return categoryCode;
  }


  public void setCategoryCode(String categoryCode) {
    this.categoryCode = categoryCode;
  }


  public SearchMerchandizingRuleParameters pageSize(Integer pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPageSize() {
    return pageSize;
  }


  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  public SearchMerchandizingRuleParameters startIndex(Integer startIndex) {
    
    this.startIndex = startIndex;
    return this;
  }

   /**
   * Get startIndex
   * @return startIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getStartIndex() {
    return startIndex;
  }


  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }


  public SearchMerchandizingRuleParameters searchMerchandizingRule(CatalogRuntimesSearchMerchandizingRule searchMerchandizingRule) {
    
    this.searchMerchandizingRule = searchMerchandizingRule;
    return this;
  }

   /**
   * Get searchMerchandizingRule
   * @return searchMerchandizingRule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CatalogRuntimesSearchMerchandizingRule getSearchMerchandizingRule() {
    return searchMerchandizingRule;
  }


  public void setSearchMerchandizingRule(CatalogRuntimesSearchMerchandizingRule searchMerchandizingRule) {
    this.searchMerchandizingRule = searchMerchandizingRule;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchMerchandizingRuleParameters searchMerchandizingRuleParameters = (SearchMerchandizingRuleParameters) o;
    return Objects.equals(this.personalizationUserId, searchMerchandizingRuleParameters.personalizationUserId) &&
        Objects.equals(this.query, searchMerchandizingRuleParameters.query) &&
        Objects.equals(this.categoryCode, searchMerchandizingRuleParameters.categoryCode) &&
        Objects.equals(this.pageSize, searchMerchandizingRuleParameters.pageSize) &&
        Objects.equals(this.startIndex, searchMerchandizingRuleParameters.startIndex) &&
        Objects.equals(this.searchMerchandizingRule, searchMerchandizingRuleParameters.searchMerchandizingRule);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(personalizationUserId, query, categoryCode, pageSize, startIndex, searchMerchandizingRule);
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
    sb.append("class SearchMerchandizingRuleParameters {\n");
    sb.append("    personalizationUserId: ").append(toIndentedString(personalizationUserId)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    categoryCode: ").append(toIndentedString(categoryCode)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    searchMerchandizingRule: ").append(toIndentedString(searchMerchandizingRule)).append("\n");
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
    openapiFields.add("personalizationUserId");
    openapiFields.add("query");
    openapiFields.add("categoryCode");
    openapiFields.add("pageSize");
    openapiFields.add("startIndex");
    openapiFields.add("searchMerchandizingRule");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SearchMerchandizingRuleParameters
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SearchMerchandizingRuleParameters.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchMerchandizingRuleParameters is not found in the empty JSON string", SearchMerchandizingRuleParameters.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!SearchMerchandizingRuleParameters.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SearchMerchandizingRuleParameters` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("personalizationUserId") != null && !jsonObj.get("personalizationUserId").isJsonNull()) && !jsonObj.get("personalizationUserId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `personalizationUserId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("personalizationUserId").toString()));
      }
      if ((jsonObj.get("query") != null && !jsonObj.get("query").isJsonNull()) && !jsonObj.get("query").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `query` to be a primitive type in the JSON string but got `%s`", jsonObj.get("query").toString()));
      }
      if ((jsonObj.get("categoryCode") != null && !jsonObj.get("categoryCode").isJsonNull()) && !jsonObj.get("categoryCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `categoryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("categoryCode").toString()));
      }
      // validate the optional field `searchMerchandizingRule`
      if (jsonObj.get("searchMerchandizingRule") != null && !jsonObj.get("searchMerchandizingRule").isJsonNull()) {
        CatalogRuntimesSearchMerchandizingRule.validateJsonObject(jsonObj.getAsJsonObject("searchMerchandizingRule"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchMerchandizingRuleParameters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchMerchandizingRuleParameters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchMerchandizingRuleParameters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchMerchandizingRuleParameters.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchMerchandizingRuleParameters>() {
           @Override
           public void write(JsonWriter out, SearchMerchandizingRuleParameters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SearchMerchandizingRuleParameters read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SearchMerchandizingRuleParameters given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SearchMerchandizingRuleParameters
  * @throws IOException if the JSON string is invalid with respect to SearchMerchandizingRuleParameters
  */
  public static SearchMerchandizingRuleParameters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchMerchandizingRuleParameters.class);
  }

 /**
  * Convert an instance of SearchMerchandizingRuleParameters to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

