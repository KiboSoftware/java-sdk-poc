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
import com.kibocommerce.sdk.catalogadministration.models.AdminUserAuditInfo;
import com.kibocommerce.sdk.catalogadministration.models.FacetRangeQuery;
import com.kibocommerce.sdk.catalogadministration.models.FacetSource;
import com.kibocommerce.sdk.catalogadministration.models.FacetValidity;
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
 * The definition of a Facet
 */
@ApiModel(description = "The definition of a Facet")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CatalogAdminsFacet implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_FACET_ID = "facetId";
  @SerializedName(SERIALIZED_NAME_FACET_ID)
  private Integer facetId;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private FacetSource source;

  public static final String SERIALIZED_NAME_FACET_TYPE = "facetType";
  @SerializedName(SERIALIZED_NAME_FACET_TYPE)
  private String facetType;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private Integer order;

  public static final String SERIALIZED_NAME_CATEGORY_ID = "categoryId";
  @SerializedName(SERIALIZED_NAME_CATEGORY_ID)
  private Integer categoryId;

  public static final String SERIALIZED_NAME_CATEGORY_CODE = "categoryCode";
  @SerializedName(SERIALIZED_NAME_CATEGORY_CODE)
  private String categoryCode;

  public static final String SERIALIZED_NAME_VALUE_SORT_TYPE = "valueSortType";
  @SerializedName(SERIALIZED_NAME_VALUE_SORT_TYPE)
  private String valueSortType;

  public static final String SERIALIZED_NAME_OVERRIDE_FACET_ID = "overrideFacetId";
  @SerializedName(SERIALIZED_NAME_OVERRIDE_FACET_ID)
  private Integer overrideFacetId;

  public static final String SERIALIZED_NAME_IS_HIDDEN = "isHidden";
  @SerializedName(SERIALIZED_NAME_IS_HIDDEN)
  private Boolean isHidden;

  public static final String SERIALIZED_NAME_VALIDITY = "validity";
  @SerializedName(SERIALIZED_NAME_VALIDITY)
  private FacetValidity validity;

  public static final String SERIALIZED_NAME_RANGE_QUERIES = "rangeQueries";
  @SerializedName(SERIALIZED_NAME_RANGE_QUERIES)
  private List<FacetRangeQuery> rangeQueries = null;

  public static final String SERIALIZED_NAME_AUDIT_INFO = "auditInfo";
  @SerializedName(SERIALIZED_NAME_AUDIT_INFO)
  private AdminUserAuditInfo auditInfo;

  public CatalogAdminsFacet() {
  }

  public CatalogAdminsFacet facetId(Integer facetId) {
    
    this.facetId = facetId;
    return this;
  }

   /**
   * The unique identifier for the facet definition
   * @return facetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique identifier for the facet definition")

  public Integer getFacetId() {
    return facetId;
  }


  public void setFacetId(Integer facetId) {
    this.facetId = facetId;
  }


  public CatalogAdminsFacet source(FacetSource source) {
    
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FacetSource getSource() {
    return source;
  }


  public void setSource(FacetSource source) {
    this.source = source;
  }


  public CatalogAdminsFacet facetType(String facetType) {
    
    this.facetType = facetType;
    return this;
  }

   /**
   * The type of facet. Allowable values are: Value, RangeQuery   Must be a valid value for DataType defined in FacetTypeConst.
   * @return facetType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of facet. Allowable values are: Value, RangeQuery   Must be a valid value for DataType defined in FacetTypeConst.")

  public String getFacetType() {
    return facetType;
  }


  public void setFacetType(String facetType) {
    this.facetType = facetType;
  }


  public CatalogAdminsFacet order(Integer order) {
    
    this.order = order;
    return this;
  }

   /**
   * Used to order the display of the facets within a section
   * @return order
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Used to order the display of the facets within a section")

  public Integer getOrder() {
    return order;
  }


  public void setOrder(Integer order) {
    this.order = order;
  }


  public CatalogAdminsFacet categoryId(Integer categoryId) {
    
    this.categoryId = categoryId;
    return this;
  }

   /**
   * The category that the facet is being configured at
   * @return categoryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The category that the facet is being configured at")

  public Integer getCategoryId() {
    return categoryId;
  }


  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }


  public CatalogAdminsFacet categoryCode(String categoryCode) {
    
    this.categoryCode = categoryCode;
    return this;
  }

   /**
   * The category that the facet is being configured at
   * @return categoryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The category that the facet is being configured at")

  public String getCategoryCode() {
    return categoryCode;
  }


  public void setCategoryCode(String categoryCode) {
    this.categoryCode = categoryCode;
  }


  public CatalogAdminsFacet valueSortType(String valueSortType) {
    
    this.valueSortType = valueSortType;
    return this;
  }

   /**
   * Determines how the facet values will be sorted in the store.   Must be a valid value for DataType defined in FacetValueSortTypeConst.   Allowable values are: CountAscending, CountDescending, ValuesAscending, ValuesDescending, AttributeDefinition, AttributeDefinitionDescending.  The default if no value is specified will be CountDescending.
   * @return valueSortType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines how the facet values will be sorted in the store.   Must be a valid value for DataType defined in FacetValueSortTypeConst.   Allowable values are: CountAscending, CountDescending, ValuesAscending, ValuesDescending, AttributeDefinition, AttributeDefinitionDescending.  The default if no value is specified will be CountDescending.")

  public String getValueSortType() {
    return valueSortType;
  }


  public void setValueSortType(String valueSortType) {
    this.valueSortType = valueSortType;
  }


  public CatalogAdminsFacet overrideFacetId(Integer overrideFacetId) {
    
    this.overrideFacetId = overrideFacetId;
    return this;
  }

   /**
   * The ID of a parent category&#39;s facet being overriden
   * @return overrideFacetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of a parent category's facet being overriden")

  public Integer getOverrideFacetId() {
    return overrideFacetId;
  }


  public void setOverrideFacetId(Integer overrideFacetId) {
    this.overrideFacetId = overrideFacetId;
  }


  public CatalogAdminsFacet isHidden(Boolean isHidden) {
    
    this.isHidden = isHidden;
    return this;
  }

   /**
   * Indicates whether the facet is hidden for the given category
   * @return isHidden
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the facet is hidden for the given category")

  public Boolean getIsHidden() {
    return isHidden;
  }


  public void setIsHidden(Boolean isHidden) {
    this.isHidden = isHidden;
  }


  public CatalogAdminsFacet validity(FacetValidity validity) {
    
    this.validity = validity;
    return this;
  }

   /**
   * Get validity
   * @return validity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FacetValidity getValidity() {
    return validity;
  }


  public void setValidity(FacetValidity validity) {
    this.validity = validity;
  }


  public CatalogAdminsFacet rangeQueries(List<FacetRangeQuery> rangeQueries) {
    
    this.rangeQueries = rangeQueries;
    return this;
  }

  public CatalogAdminsFacet addRangeQueriesItem(FacetRangeQuery rangeQueriesItem) {
    if (this.rangeQueries == null) {
      this.rangeQueries = new ArrayList<>();
    }
    this.rangeQueries.add(rangeQueriesItem);
    return this;
  }

   /**
   * List of ranges if the Facet is of type Range
   * @return rangeQueries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of ranges if the Facet is of type Range")

  public List<FacetRangeQuery> getRangeQueries() {
    return rangeQueries;
  }


  public void setRangeQueries(List<FacetRangeQuery> rangeQueries) {
    this.rangeQueries = rangeQueries;
  }


  public CatalogAdminsFacet auditInfo(AdminUserAuditInfo auditInfo) {
    
    this.auditInfo = auditInfo;
    return this;
  }

   /**
   * Get auditInfo
   * @return auditInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AdminUserAuditInfo getAuditInfo() {
    return auditInfo;
  }


  public void setAuditInfo(AdminUserAuditInfo auditInfo) {
    this.auditInfo = auditInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogAdminsFacet catalogAdminsFacet = (CatalogAdminsFacet) o;
    return Objects.equals(this.facetId, catalogAdminsFacet.facetId) &&
        Objects.equals(this.source, catalogAdminsFacet.source) &&
        Objects.equals(this.facetType, catalogAdminsFacet.facetType) &&
        Objects.equals(this.order, catalogAdminsFacet.order) &&
        Objects.equals(this.categoryId, catalogAdminsFacet.categoryId) &&
        Objects.equals(this.categoryCode, catalogAdminsFacet.categoryCode) &&
        Objects.equals(this.valueSortType, catalogAdminsFacet.valueSortType) &&
        Objects.equals(this.overrideFacetId, catalogAdminsFacet.overrideFacetId) &&
        Objects.equals(this.isHidden, catalogAdminsFacet.isHidden) &&
        Objects.equals(this.validity, catalogAdminsFacet.validity) &&
        Objects.equals(this.rangeQueries, catalogAdminsFacet.rangeQueries) &&
        Objects.equals(this.auditInfo, catalogAdminsFacet.auditInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(facetId, source, facetType, order, categoryId, categoryCode, valueSortType, overrideFacetId, isHidden, validity, rangeQueries, auditInfo);
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
    sb.append("class CatalogAdminsFacet {\n");
    sb.append("    facetId: ").append(toIndentedString(facetId)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    facetType: ").append(toIndentedString(facetType)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    categoryCode: ").append(toIndentedString(categoryCode)).append("\n");
    sb.append("    valueSortType: ").append(toIndentedString(valueSortType)).append("\n");
    sb.append("    overrideFacetId: ").append(toIndentedString(overrideFacetId)).append("\n");
    sb.append("    isHidden: ").append(toIndentedString(isHidden)).append("\n");
    sb.append("    validity: ").append(toIndentedString(validity)).append("\n");
    sb.append("    rangeQueries: ").append(toIndentedString(rangeQueries)).append("\n");
    sb.append("    auditInfo: ").append(toIndentedString(auditInfo)).append("\n");
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
    openapiFields.add("facetId");
    openapiFields.add("source");
    openapiFields.add("facetType");
    openapiFields.add("order");
    openapiFields.add("categoryId");
    openapiFields.add("categoryCode");
    openapiFields.add("valueSortType");
    openapiFields.add("overrideFacetId");
    openapiFields.add("isHidden");
    openapiFields.add("validity");
    openapiFields.add("rangeQueries");
    openapiFields.add("auditInfo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CatalogAdminsFacet
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CatalogAdminsFacet.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CatalogAdminsFacet is not found in the empty JSON string", CatalogAdminsFacet.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!CatalogAdminsFacet.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CatalogAdminsFacet` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      // validate the optional field `source`
      if (jsonObj.get("source") != null && !jsonObj.get("source").isJsonNull()) {
        FacetSource.validateJsonObject(jsonObj.getAsJsonObject("source"));
      }
      if ((jsonObj.get("facetType") != null && !jsonObj.get("facetType").isJsonNull()) && !jsonObj.get("facetType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `facetType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("facetType").toString()));
      }
      if ((jsonObj.get("categoryCode") != null && !jsonObj.get("categoryCode").isJsonNull()) && !jsonObj.get("categoryCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `categoryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("categoryCode").toString()));
      }
      if ((jsonObj.get("valueSortType") != null && !jsonObj.get("valueSortType").isJsonNull()) && !jsonObj.get("valueSortType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `valueSortType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("valueSortType").toString()));
      }
      // validate the optional field `validity`
      if (jsonObj.get("validity") != null && !jsonObj.get("validity").isJsonNull()) {
        FacetValidity.validateJsonObject(jsonObj.getAsJsonObject("validity"));
      }
      if (jsonObj.get("rangeQueries") != null && !jsonObj.get("rangeQueries").isJsonNull()) {
        JsonArray jsonArrayrangeQueries = jsonObj.getAsJsonArray("rangeQueries");
        if (jsonArrayrangeQueries != null) {
          // ensure the json data is an array
          if (!jsonObj.get("rangeQueries").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `rangeQueries` to be an array in the JSON string but got `%s`", jsonObj.get("rangeQueries").toString()));
          }

          // validate the optional field `rangeQueries` (array)
          for (int i = 0; i < jsonArrayrangeQueries.size(); i++) {
            FacetRangeQuery.validateJsonObject(jsonArrayrangeQueries.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `auditInfo`
      if (jsonObj.get("auditInfo") != null && !jsonObj.get("auditInfo").isJsonNull()) {
        AdminUserAuditInfo.validateJsonObject(jsonObj.getAsJsonObject("auditInfo"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CatalogAdminsFacet.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CatalogAdminsFacet' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CatalogAdminsFacet> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CatalogAdminsFacet.class));

       return (TypeAdapter<T>) new TypeAdapter<CatalogAdminsFacet>() {
           @Override
           public void write(JsonWriter out, CatalogAdminsFacet value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CatalogAdminsFacet read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CatalogAdminsFacet given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CatalogAdminsFacet
  * @throws IOException if the JSON string is invalid with respect to CatalogAdminsFacet
  */
  public static CatalogAdminsFacet fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CatalogAdminsFacet.class);
  }

 /**
  * Convert an instance of CatalogAdminsFacet to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

