/*
 * Kibo Location Storefront Service
 * OpenAPI Spec for Kibo Location Storefront Service
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.locationstorefront.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kibocommerce.sdk.locationstorefront.models.AdminUserAuditInfo;
import com.kibocommerce.sdk.locationstorefront.models.CommerceRuntimeAttributeLocalizedContent;
import com.kibocommerce.sdk.locationstorefront.models.CommerceRuntimeAttributeMetadataItem;
import com.kibocommerce.sdk.locationstorefront.models.CommerceRuntimeAttributeValidation;
import com.kibocommerce.sdk.locationstorefront.models.CommerceRuntimeAttributeVocabularyValue;
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
 * CommerceRuntimeAttribute
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CommerceRuntimeAttribute implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_ADMIN_NAME = "adminName";
  @SerializedName(SERIALIZED_NAME_ADMIN_NAME)
  private String adminName;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_ATTRIBUTE_CODE = "attributeCode";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_CODE)
  private String attributeCode;

  public static final String SERIALIZED_NAME_INPUT_TYPE = "inputType";
  @SerializedName(SERIALIZED_NAME_INPUT_TYPE)
  private String inputType;

  public static final String SERIALIZED_NAME_VALUE_TYPE = "valueType";
  @SerializedName(SERIALIZED_NAME_VALUE_TYPE)
  private String valueType;

  public static final String SERIALIZED_NAME_DATA_TYPE = "dataType";
  @SerializedName(SERIALIZED_NAME_DATA_TYPE)
  private String dataType;

  public static final String SERIALIZED_NAME_ATTRIBUTE_METADATA = "attributeMetadata";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_METADATA)
  private List<CommerceRuntimeAttributeMetadataItem> attributeMetadata = null;

  public static final String SERIALIZED_NAME_ATTRIBUTE_F_Q_N = "attributeFQN";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_F_Q_N)
  private String attributeFQN;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private CommerceRuntimeAttributeLocalizedContent content;

  public static final String SERIALIZED_NAME_VALIDATION = "validation";
  @SerializedName(SERIALIZED_NAME_VALIDATION)
  private CommerceRuntimeAttributeValidation validation;

  public static final String SERIALIZED_NAME_VOCABULARY_VALUES = "vocabularyValues";
  @SerializedName(SERIALIZED_NAME_VOCABULARY_VALUES)
  private List<CommerceRuntimeAttributeVocabularyValue> vocabularyValues = null;

  public static final String SERIALIZED_NAME_AUDIT_INFO = "auditInfo";
  @SerializedName(SERIALIZED_NAME_AUDIT_INFO)
  private AdminUserAuditInfo auditInfo;

  public static final String SERIALIZED_NAME_IS_ACTIVE = "isActive";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive;

  public static final String SERIALIZED_NAME_IS_REQUIRED = "isRequired";
  @SerializedName(SERIALIZED_NAME_IS_REQUIRED)
  private Boolean isRequired;

  public static final String SERIALIZED_NAME_IS_READ_ONLY = "isReadOnly";
  @SerializedName(SERIALIZED_NAME_IS_READ_ONLY)
  private Boolean isReadOnly;

  public static final String SERIALIZED_NAME_IS_MULTI_VALUED = "isMultiValued";
  @SerializedName(SERIALIZED_NAME_IS_MULTI_VALUED)
  private Boolean isMultiValued;

  public static final String SERIALIZED_NAME_IS_VISIBLE = "isVisible";
  @SerializedName(SERIALIZED_NAME_IS_VISIBLE)
  private Boolean isVisible;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private Integer order;

  public static final String SERIALIZED_NAME_DISPLAY_GROUP = "displayGroup";
  @SerializedName(SERIALIZED_NAME_DISPLAY_GROUP)
  private String displayGroup;

  public static final String SERIALIZED_NAME_AVAILABLE_FOR_ORDER_ROUTING = "availableForOrderRouting";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_FOR_ORDER_ROUTING)
  private Boolean availableForOrderRouting;

  public CommerceRuntimeAttribute() {
  }

  public CommerceRuntimeAttribute id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public CommerceRuntimeAttribute adminName(String adminName) {
    
    this.adminName = adminName;
    return this;
  }

   /**
   * Get adminName
   * @return adminName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAdminName() {
    return adminName;
  }


  public void setAdminName(String adminName) {
    this.adminName = adminName;
  }


  public CommerceRuntimeAttribute namespace(String namespace) {
    
    this.namespace = namespace;
    return this;
  }

   /**
   * Get namespace
   * @return namespace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNamespace() {
    return namespace;
  }


  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  public CommerceRuntimeAttribute attributeCode(String attributeCode) {
    
    this.attributeCode = attributeCode;
    return this;
  }

   /**
   * Get attributeCode
   * @return attributeCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getAttributeCode() {
    return attributeCode;
  }


  public void setAttributeCode(String attributeCode) {
    this.attributeCode = attributeCode;
  }


  public CommerceRuntimeAttribute inputType(String inputType) {
    
    this.inputType = inputType;
    return this;
  }

   /**
   * Get inputType
   * @return inputType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getInputType() {
    return inputType;
  }


  public void setInputType(String inputType) {
    this.inputType = inputType;
  }


  public CommerceRuntimeAttribute valueType(String valueType) {
    
    this.valueType = valueType;
    return this;
  }

   /**
   * Get valueType
   * @return valueType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getValueType() {
    return valueType;
  }


  public void setValueType(String valueType) {
    this.valueType = valueType;
  }


  public CommerceRuntimeAttribute dataType(String dataType) {
    
    this.dataType = dataType;
    return this;
  }

   /**
   * Get dataType
   * @return dataType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDataType() {
    return dataType;
  }


  public void setDataType(String dataType) {
    this.dataType = dataType;
  }


  public CommerceRuntimeAttribute attributeMetadata(List<CommerceRuntimeAttributeMetadataItem> attributeMetadata) {
    
    this.attributeMetadata = attributeMetadata;
    return this;
  }

  public CommerceRuntimeAttribute addAttributeMetadataItem(CommerceRuntimeAttributeMetadataItem attributeMetadataItem) {
    if (this.attributeMetadata == null) {
      this.attributeMetadata = new ArrayList<>();
    }
    this.attributeMetadata.add(attributeMetadataItem);
    return this;
  }

   /**
   * Get attributeMetadata
   * @return attributeMetadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CommerceRuntimeAttributeMetadataItem> getAttributeMetadata() {
    return attributeMetadata;
  }


  public void setAttributeMetadata(List<CommerceRuntimeAttributeMetadataItem> attributeMetadata) {
    this.attributeMetadata = attributeMetadata;
  }


  public CommerceRuntimeAttribute attributeFQN(String attributeFQN) {
    
    this.attributeFQN = attributeFQN;
    return this;
  }

   /**
   * Get attributeFQN
   * @return attributeFQN
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAttributeFQN() {
    return attributeFQN;
  }


  public void setAttributeFQN(String attributeFQN) {
    this.attributeFQN = attributeFQN;
  }


  public CommerceRuntimeAttribute content(CommerceRuntimeAttributeLocalizedContent content) {
    
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CommerceRuntimeAttributeLocalizedContent getContent() {
    return content;
  }


  public void setContent(CommerceRuntimeAttributeLocalizedContent content) {
    this.content = content;
  }


  public CommerceRuntimeAttribute validation(CommerceRuntimeAttributeValidation validation) {
    
    this.validation = validation;
    return this;
  }

   /**
   * Get validation
   * @return validation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CommerceRuntimeAttributeValidation getValidation() {
    return validation;
  }


  public void setValidation(CommerceRuntimeAttributeValidation validation) {
    this.validation = validation;
  }


  public CommerceRuntimeAttribute vocabularyValues(List<CommerceRuntimeAttributeVocabularyValue> vocabularyValues) {
    
    this.vocabularyValues = vocabularyValues;
    return this;
  }

  public CommerceRuntimeAttribute addVocabularyValuesItem(CommerceRuntimeAttributeVocabularyValue vocabularyValuesItem) {
    if (this.vocabularyValues == null) {
      this.vocabularyValues = new ArrayList<>();
    }
    this.vocabularyValues.add(vocabularyValuesItem);
    return this;
  }

   /**
   * Get vocabularyValues
   * @return vocabularyValues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CommerceRuntimeAttributeVocabularyValue> getVocabularyValues() {
    return vocabularyValues;
  }


  public void setVocabularyValues(List<CommerceRuntimeAttributeVocabularyValue> vocabularyValues) {
    this.vocabularyValues = vocabularyValues;
  }


  public CommerceRuntimeAttribute auditInfo(AdminUserAuditInfo auditInfo) {
    
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


  public CommerceRuntimeAttribute isActive(Boolean isActive) {
    
    this.isActive = isActive;
    return this;
  }

   /**
   * Get isActive
   * @return isActive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsActive() {
    return isActive;
  }


  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  public CommerceRuntimeAttribute isRequired(Boolean isRequired) {
    
    this.isRequired = isRequired;
    return this;
  }

   /**
   * Get isRequired
   * @return isRequired
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsRequired() {
    return isRequired;
  }


  public void setIsRequired(Boolean isRequired) {
    this.isRequired = isRequired;
  }


  public CommerceRuntimeAttribute isReadOnly(Boolean isReadOnly) {
    
    this.isReadOnly = isReadOnly;
    return this;
  }

   /**
   * Get isReadOnly
   * @return isReadOnly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsReadOnly() {
    return isReadOnly;
  }


  public void setIsReadOnly(Boolean isReadOnly) {
    this.isReadOnly = isReadOnly;
  }


  public CommerceRuntimeAttribute isMultiValued(Boolean isMultiValued) {
    
    this.isMultiValued = isMultiValued;
    return this;
  }

   /**
   * Get isMultiValued
   * @return isMultiValued
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsMultiValued() {
    return isMultiValued;
  }


  public void setIsMultiValued(Boolean isMultiValued) {
    this.isMultiValued = isMultiValued;
  }


  public CommerceRuntimeAttribute isVisible(Boolean isVisible) {
    
    this.isVisible = isVisible;
    return this;
  }

   /**
   * Get isVisible
   * @return isVisible
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsVisible() {
    return isVisible;
  }


  public void setIsVisible(Boolean isVisible) {
    this.isVisible = isVisible;
  }


  public CommerceRuntimeAttribute order(Integer order) {
    
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getOrder() {
    return order;
  }


  public void setOrder(Integer order) {
    this.order = order;
  }


  public CommerceRuntimeAttribute displayGroup(String displayGroup) {
    
    this.displayGroup = displayGroup;
    return this;
  }

   /**
   * Get displayGroup
   * @return displayGroup
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDisplayGroup() {
    return displayGroup;
  }


  public void setDisplayGroup(String displayGroup) {
    this.displayGroup = displayGroup;
  }


  public CommerceRuntimeAttribute availableForOrderRouting(Boolean availableForOrderRouting) {
    
    this.availableForOrderRouting = availableForOrderRouting;
    return this;
  }

   /**
   * Get availableForOrderRouting
   * @return availableForOrderRouting
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAvailableForOrderRouting() {
    return availableForOrderRouting;
  }


  public void setAvailableForOrderRouting(Boolean availableForOrderRouting) {
    this.availableForOrderRouting = availableForOrderRouting;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommerceRuntimeAttribute commerceRuntimeAttribute = (CommerceRuntimeAttribute) o;
    return Objects.equals(this.id, commerceRuntimeAttribute.id) &&
        Objects.equals(this.adminName, commerceRuntimeAttribute.adminName) &&
        Objects.equals(this.namespace, commerceRuntimeAttribute.namespace) &&
        Objects.equals(this.attributeCode, commerceRuntimeAttribute.attributeCode) &&
        Objects.equals(this.inputType, commerceRuntimeAttribute.inputType) &&
        Objects.equals(this.valueType, commerceRuntimeAttribute.valueType) &&
        Objects.equals(this.dataType, commerceRuntimeAttribute.dataType) &&
        Objects.equals(this.attributeMetadata, commerceRuntimeAttribute.attributeMetadata) &&
        Objects.equals(this.attributeFQN, commerceRuntimeAttribute.attributeFQN) &&
        Objects.equals(this.content, commerceRuntimeAttribute.content) &&
        Objects.equals(this.validation, commerceRuntimeAttribute.validation) &&
        Objects.equals(this.vocabularyValues, commerceRuntimeAttribute.vocabularyValues) &&
        Objects.equals(this.auditInfo, commerceRuntimeAttribute.auditInfo) &&
        Objects.equals(this.isActive, commerceRuntimeAttribute.isActive) &&
        Objects.equals(this.isRequired, commerceRuntimeAttribute.isRequired) &&
        Objects.equals(this.isReadOnly, commerceRuntimeAttribute.isReadOnly) &&
        Objects.equals(this.isMultiValued, commerceRuntimeAttribute.isMultiValued) &&
        Objects.equals(this.isVisible, commerceRuntimeAttribute.isVisible) &&
        Objects.equals(this.order, commerceRuntimeAttribute.order) &&
        Objects.equals(this.displayGroup, commerceRuntimeAttribute.displayGroup) &&
        Objects.equals(this.availableForOrderRouting, commerceRuntimeAttribute.availableForOrderRouting);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, adminName, namespace, attributeCode, inputType, valueType, dataType, attributeMetadata, attributeFQN, content, validation, vocabularyValues, auditInfo, isActive, isRequired, isReadOnly, isMultiValued, isVisible, order, displayGroup, availableForOrderRouting);
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
    sb.append("class CommerceRuntimeAttribute {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    adminName: ").append(toIndentedString(adminName)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    attributeCode: ").append(toIndentedString(attributeCode)).append("\n");
    sb.append("    inputType: ").append(toIndentedString(inputType)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    attributeMetadata: ").append(toIndentedString(attributeMetadata)).append("\n");
    sb.append("    attributeFQN: ").append(toIndentedString(attributeFQN)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    validation: ").append(toIndentedString(validation)).append("\n");
    sb.append("    vocabularyValues: ").append(toIndentedString(vocabularyValues)).append("\n");
    sb.append("    auditInfo: ").append(toIndentedString(auditInfo)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    isRequired: ").append(toIndentedString(isRequired)).append("\n");
    sb.append("    isReadOnly: ").append(toIndentedString(isReadOnly)).append("\n");
    sb.append("    isMultiValued: ").append(toIndentedString(isMultiValued)).append("\n");
    sb.append("    isVisible: ").append(toIndentedString(isVisible)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    displayGroup: ").append(toIndentedString(displayGroup)).append("\n");
    sb.append("    availableForOrderRouting: ").append(toIndentedString(availableForOrderRouting)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("adminName");
    openapiFields.add("namespace");
    openapiFields.add("attributeCode");
    openapiFields.add("inputType");
    openapiFields.add("valueType");
    openapiFields.add("dataType");
    openapiFields.add("attributeMetadata");
    openapiFields.add("attributeFQN");
    openapiFields.add("content");
    openapiFields.add("validation");
    openapiFields.add("vocabularyValues");
    openapiFields.add("auditInfo");
    openapiFields.add("isActive");
    openapiFields.add("isRequired");
    openapiFields.add("isReadOnly");
    openapiFields.add("isMultiValued");
    openapiFields.add("isVisible");
    openapiFields.add("order");
    openapiFields.add("displayGroup");
    openapiFields.add("availableForOrderRouting");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("attributeCode");
    openapiRequiredFields.add("valueType");
    openapiRequiredFields.add("displayGroup");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CommerceRuntimeAttribute
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CommerceRuntimeAttribute.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CommerceRuntimeAttribute is not found in the empty JSON string", CommerceRuntimeAttribute.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!CommerceRuntimeAttribute.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CommerceRuntimeAttribute` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CommerceRuntimeAttribute.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("adminName") != null && !jsonObj.get("adminName").isJsonNull()) && !jsonObj.get("adminName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `adminName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("adminName").toString()));
      }
      if ((jsonObj.get("namespace") != null && !jsonObj.get("namespace").isJsonNull()) && !jsonObj.get("namespace").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `namespace` to be a primitive type in the JSON string but got `%s`", jsonObj.get("namespace").toString()));
      }
      if (!jsonObj.get("attributeCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `attributeCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("attributeCode").toString()));
      }
      if ((jsonObj.get("inputType") != null && !jsonObj.get("inputType").isJsonNull()) && !jsonObj.get("inputType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `inputType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("inputType").toString()));
      }
      if (!jsonObj.get("valueType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `valueType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("valueType").toString()));
      }
      if ((jsonObj.get("dataType") != null && !jsonObj.get("dataType").isJsonNull()) && !jsonObj.get("dataType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dataType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dataType").toString()));
      }
      if (jsonObj.get("attributeMetadata") != null && !jsonObj.get("attributeMetadata").isJsonNull()) {
        JsonArray jsonArrayattributeMetadata = jsonObj.getAsJsonArray("attributeMetadata");
        if (jsonArrayattributeMetadata != null) {
          // ensure the json data is an array
          if (!jsonObj.get("attributeMetadata").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `attributeMetadata` to be an array in the JSON string but got `%s`", jsonObj.get("attributeMetadata").toString()));
          }

          // validate the optional field `attributeMetadata` (array)
          for (int i = 0; i < jsonArrayattributeMetadata.size(); i++) {
            CommerceRuntimeAttributeMetadataItem.validateJsonObject(jsonArrayattributeMetadata.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("attributeFQN") != null && !jsonObj.get("attributeFQN").isJsonNull()) && !jsonObj.get("attributeFQN").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `attributeFQN` to be a primitive type in the JSON string but got `%s`", jsonObj.get("attributeFQN").toString()));
      }
      // validate the optional field `content`
      if (jsonObj.get("content") != null && !jsonObj.get("content").isJsonNull()) {
        CommerceRuntimeAttributeLocalizedContent.validateJsonObject(jsonObj.getAsJsonObject("content"));
      }
      // validate the optional field `validation`
      if (jsonObj.get("validation") != null && !jsonObj.get("validation").isJsonNull()) {
        CommerceRuntimeAttributeValidation.validateJsonObject(jsonObj.getAsJsonObject("validation"));
      }
      if (jsonObj.get("vocabularyValues") != null && !jsonObj.get("vocabularyValues").isJsonNull()) {
        JsonArray jsonArrayvocabularyValues = jsonObj.getAsJsonArray("vocabularyValues");
        if (jsonArrayvocabularyValues != null) {
          // ensure the json data is an array
          if (!jsonObj.get("vocabularyValues").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `vocabularyValues` to be an array in the JSON string but got `%s`", jsonObj.get("vocabularyValues").toString()));
          }

          // validate the optional field `vocabularyValues` (array)
          for (int i = 0; i < jsonArrayvocabularyValues.size(); i++) {
            CommerceRuntimeAttributeVocabularyValue.validateJsonObject(jsonArrayvocabularyValues.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `auditInfo`
      if (jsonObj.get("auditInfo") != null && !jsonObj.get("auditInfo").isJsonNull()) {
        AdminUserAuditInfo.validateJsonObject(jsonObj.getAsJsonObject("auditInfo"));
      }
      if (!jsonObj.get("displayGroup").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayGroup` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayGroup").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CommerceRuntimeAttribute.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CommerceRuntimeAttribute' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CommerceRuntimeAttribute> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CommerceRuntimeAttribute.class));

       return (TypeAdapter<T>) new TypeAdapter<CommerceRuntimeAttribute>() {
           @Override
           public void write(JsonWriter out, CommerceRuntimeAttribute value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CommerceRuntimeAttribute read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CommerceRuntimeAttribute given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CommerceRuntimeAttribute
  * @throws IOException if the JSON string is invalid with respect to CommerceRuntimeAttribute
  */
  public static CommerceRuntimeAttribute fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CommerceRuntimeAttribute.class);
  }

 /**
  * Convert an instance of CommerceRuntimeAttribute to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

