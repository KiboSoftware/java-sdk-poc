/*
 * Kibo Fulfillment Service
 * OpenAPI Spec for Kibo Fulfillment Service
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.fulfillment.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kibocommerce.sdk.fulfillment.models.FulfillmentAuditInfo;
import com.kibocommerce.sdk.fulfillment.models.ProductOption0;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
 * PickWaveContent0
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PickWaveContent0 implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ACTUAL_QUANTITY = "actualQuantity";
  @SerializedName(SERIALIZED_NAME_ACTUAL_QUANTITY)
  private Integer actualQuantity;

  public static final String SERIALIZED_NAME_AUDIT_INFO = "auditInfo";
  @SerializedName(SERIALIZED_NAME_AUDIT_INFO)
  private FulfillmentAuditInfo auditInfo;

  public static final String SERIALIZED_NAME_BIN_ID = "binId";
  @SerializedName(SERIALIZED_NAME_BIN_ID)
  private Integer binId;

  public static final String SERIALIZED_NAME_BIN_NAME = "binName";
  @SerializedName(SERIALIZED_NAME_BIN_NAME)
  private String binName;

  public static final String SERIALIZED_NAME_CONTENT_ID = "contentId";
  @SerializedName(SERIALIZED_NAME_CONTENT_ID)
  private String contentId;

  public static final String SERIALIZED_NAME_EXTERNAL_ORDER_ID = "externalOrderId";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ORDER_ID)
  private String externalOrderId;

  public static final String SERIALIZED_NAME_IMAGE_URL = "imageUrl";
  @SerializedName(SERIALIZED_NAME_IMAGE_URL)
  private String imageUrl;

  public static final String SERIALIZED_NAME_ITEM_LINE_ID = "itemLineId";
  @SerializedName(SERIALIZED_NAME_ITEM_LINE_ID)
  private Integer itemLineId;

  public static final String SERIALIZED_NAME_LOCATOR_NAME = "locatorName";
  @SerializedName(SERIALIZED_NAME_LOCATOR_NAME)
  private String locatorName;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OPTION_ATTRIBUTE_F_Q_N = "optionAttributeFQN";
  @SerializedName(SERIALIZED_NAME_OPTION_ATTRIBUTE_F_Q_N)
  private String optionAttributeFQN;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private List<ProductOption0> options = null;

  public static final String SERIALIZED_NAME_ORDER_NUMBER = "orderNumber";
  @SerializedName(SERIALIZED_NAME_ORDER_NUMBER)
  private Integer orderNumber;

  public static final String SERIALIZED_NAME_PART_NUMBER = "partNumber";
  @SerializedName(SERIALIZED_NAME_PART_NUMBER)
  private String partNumber;

  public static final String SERIALIZED_NAME_PRODUCT_CODE = "productCode";
  @SerializedName(SERIALIZED_NAME_PRODUCT_CODE)
  private String productCode;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity;

  public static final String SERIALIZED_NAME_SHIPMENT_NUMBER = "shipmentNumber";
  @SerializedName(SERIALIZED_NAME_SHIPMENT_NUMBER)
  private Integer shipmentNumber;

  public static final String SERIALIZED_NAME_SKU = "sku";
  @SerializedName(SERIALIZED_NAME_SKU)
  private String sku;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    IN_PROGRESS("IN_PROGRESS"),
    
    PICKED("PICKED"),
    
    REMOVED("REMOVED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_UPC = "upc";
  @SerializedName(SERIALIZED_NAME_UPC)
  private String upc;

  public static final String SERIALIZED_NAME_VARIATION_PRODUCT_CODE = "variationProductCode";
  @SerializedName(SERIALIZED_NAME_VARIATION_PRODUCT_CODE)
  private String variationProductCode;

  public PickWaveContent0() {
  }

  public PickWaveContent0 actualQuantity(Integer actualQuantity) {
    
    this.actualQuantity = actualQuantity;
    return this;
  }

   /**
   * Get actualQuantity
   * @return actualQuantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getActualQuantity() {
    return actualQuantity;
  }


  public void setActualQuantity(Integer actualQuantity) {
    this.actualQuantity = actualQuantity;
  }


  public PickWaveContent0 auditInfo(FulfillmentAuditInfo auditInfo) {
    
    this.auditInfo = auditInfo;
    return this;
  }

   /**
   * Get auditInfo
   * @return auditInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FulfillmentAuditInfo getAuditInfo() {
    return auditInfo;
  }


  public void setAuditInfo(FulfillmentAuditInfo auditInfo) {
    this.auditInfo = auditInfo;
  }


  public PickWaveContent0 binId(Integer binId) {
    
    this.binId = binId;
    return this;
  }

   /**
   * Get binId
   * @return binId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getBinId() {
    return binId;
  }


  public void setBinId(Integer binId) {
    this.binId = binId;
  }


  public PickWaveContent0 binName(String binName) {
    
    this.binName = binName;
    return this;
  }

   /**
   * Get binName
   * @return binName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBinName() {
    return binName;
  }


  public void setBinName(String binName) {
    this.binName = binName;
  }


  public PickWaveContent0 contentId(String contentId) {
    
    this.contentId = contentId;
    return this;
  }

   /**
   * Get contentId
   * @return contentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getContentId() {
    return contentId;
  }


  public void setContentId(String contentId) {
    this.contentId = contentId;
  }


  public PickWaveContent0 externalOrderId(String externalOrderId) {
    
    this.externalOrderId = externalOrderId;
    return this;
  }

   /**
   * Get externalOrderId
   * @return externalOrderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExternalOrderId() {
    return externalOrderId;
  }


  public void setExternalOrderId(String externalOrderId) {
    this.externalOrderId = externalOrderId;
  }


  public PickWaveContent0 imageUrl(String imageUrl) {
    
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * Get imageUrl
   * @return imageUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getImageUrl() {
    return imageUrl;
  }


  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  public PickWaveContent0 itemLineId(Integer itemLineId) {
    
    this.itemLineId = itemLineId;
    return this;
  }

   /**
   * Get itemLineId
   * @return itemLineId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getItemLineId() {
    return itemLineId;
  }


  public void setItemLineId(Integer itemLineId) {
    this.itemLineId = itemLineId;
  }


  public PickWaveContent0 locatorName(String locatorName) {
    
    this.locatorName = locatorName;
    return this;
  }

   /**
   * Get locatorName
   * @return locatorName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocatorName() {
    return locatorName;
  }


  public void setLocatorName(String locatorName) {
    this.locatorName = locatorName;
  }


  public PickWaveContent0 name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public PickWaveContent0 optionAttributeFQN(String optionAttributeFQN) {
    
    this.optionAttributeFQN = optionAttributeFQN;
    return this;
  }

   /**
   * Get optionAttributeFQN
   * @return optionAttributeFQN
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOptionAttributeFQN() {
    return optionAttributeFQN;
  }


  public void setOptionAttributeFQN(String optionAttributeFQN) {
    this.optionAttributeFQN = optionAttributeFQN;
  }


  public PickWaveContent0 options(List<ProductOption0> options) {
    
    this.options = options;
    return this;
  }

  public PickWaveContent0 addOptionsItem(ProductOption0 optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ProductOption0> getOptions() {
    return options;
  }


  public void setOptions(List<ProductOption0> options) {
    this.options = options;
  }


  public PickWaveContent0 orderNumber(Integer orderNumber) {
    
    this.orderNumber = orderNumber;
    return this;
  }

   /**
   * Get orderNumber
   * @return orderNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getOrderNumber() {
    return orderNumber;
  }


  public void setOrderNumber(Integer orderNumber) {
    this.orderNumber = orderNumber;
  }


  public PickWaveContent0 partNumber(String partNumber) {
    
    this.partNumber = partNumber;
    return this;
  }

   /**
   * Get partNumber
   * @return partNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPartNumber() {
    return partNumber;
  }


  public void setPartNumber(String partNumber) {
    this.partNumber = partNumber;
  }


  public PickWaveContent0 productCode(String productCode) {
    
    this.productCode = productCode;
    return this;
  }

   /**
   * Get productCode
   * @return productCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProductCode() {
    return productCode;
  }


  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }


  public PickWaveContent0 quantity(Integer quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getQuantity() {
    return quantity;
  }


  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  public PickWaveContent0 shipmentNumber(Integer shipmentNumber) {
    
    this.shipmentNumber = shipmentNumber;
    return this;
  }

   /**
   * Get shipmentNumber
   * @return shipmentNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getShipmentNumber() {
    return shipmentNumber;
  }


  public void setShipmentNumber(Integer shipmentNumber) {
    this.shipmentNumber = shipmentNumber;
  }


  public PickWaveContent0 sku(String sku) {
    
    this.sku = sku;
    return this;
  }

   /**
   * Get sku
   * @return sku
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSku() {
    return sku;
  }


  public void setSku(String sku) {
    this.sku = sku;
  }


  public PickWaveContent0 status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public PickWaveContent0 upc(String upc) {
    
    this.upc = upc;
    return this;
  }

   /**
   * Get upc
   * @return upc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUpc() {
    return upc;
  }


  public void setUpc(String upc) {
    this.upc = upc;
  }


  public PickWaveContent0 variationProductCode(String variationProductCode) {
    
    this.variationProductCode = variationProductCode;
    return this;
  }

   /**
   * Get variationProductCode
   * @return variationProductCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVariationProductCode() {
    return variationProductCode;
  }


  public void setVariationProductCode(String variationProductCode) {
    this.variationProductCode = variationProductCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PickWaveContent0 pickWaveContent0 = (PickWaveContent0) o;
    return Objects.equals(this.actualQuantity, pickWaveContent0.actualQuantity) &&
        Objects.equals(this.auditInfo, pickWaveContent0.auditInfo) &&
        Objects.equals(this.binId, pickWaveContent0.binId) &&
        Objects.equals(this.binName, pickWaveContent0.binName) &&
        Objects.equals(this.contentId, pickWaveContent0.contentId) &&
        Objects.equals(this.externalOrderId, pickWaveContent0.externalOrderId) &&
        Objects.equals(this.imageUrl, pickWaveContent0.imageUrl) &&
        Objects.equals(this.itemLineId, pickWaveContent0.itemLineId) &&
        Objects.equals(this.locatorName, pickWaveContent0.locatorName) &&
        Objects.equals(this.name, pickWaveContent0.name) &&
        Objects.equals(this.optionAttributeFQN, pickWaveContent0.optionAttributeFQN) &&
        Objects.equals(this.options, pickWaveContent0.options) &&
        Objects.equals(this.orderNumber, pickWaveContent0.orderNumber) &&
        Objects.equals(this.partNumber, pickWaveContent0.partNumber) &&
        Objects.equals(this.productCode, pickWaveContent0.productCode) &&
        Objects.equals(this.quantity, pickWaveContent0.quantity) &&
        Objects.equals(this.shipmentNumber, pickWaveContent0.shipmentNumber) &&
        Objects.equals(this.sku, pickWaveContent0.sku) &&
        Objects.equals(this.status, pickWaveContent0.status) &&
        Objects.equals(this.upc, pickWaveContent0.upc) &&
        Objects.equals(this.variationProductCode, pickWaveContent0.variationProductCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actualQuantity, auditInfo, binId, binName, contentId, externalOrderId, imageUrl, itemLineId, locatorName, name, optionAttributeFQN, options, orderNumber, partNumber, productCode, quantity, shipmentNumber, sku, status, upc, variationProductCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PickWaveContent0 {\n");
    sb.append("    actualQuantity: ").append(toIndentedString(actualQuantity)).append("\n");
    sb.append("    auditInfo: ").append(toIndentedString(auditInfo)).append("\n");
    sb.append("    binId: ").append(toIndentedString(binId)).append("\n");
    sb.append("    binName: ").append(toIndentedString(binName)).append("\n");
    sb.append("    contentId: ").append(toIndentedString(contentId)).append("\n");
    sb.append("    externalOrderId: ").append(toIndentedString(externalOrderId)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    itemLineId: ").append(toIndentedString(itemLineId)).append("\n");
    sb.append("    locatorName: ").append(toIndentedString(locatorName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    optionAttributeFQN: ").append(toIndentedString(optionAttributeFQN)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    orderNumber: ").append(toIndentedString(orderNumber)).append("\n");
    sb.append("    partNumber: ").append(toIndentedString(partNumber)).append("\n");
    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    shipmentNumber: ").append(toIndentedString(shipmentNumber)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    upc: ").append(toIndentedString(upc)).append("\n");
    sb.append("    variationProductCode: ").append(toIndentedString(variationProductCode)).append("\n");
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
    openapiFields.add("actualQuantity");
    openapiFields.add("auditInfo");
    openapiFields.add("binId");
    openapiFields.add("binName");
    openapiFields.add("contentId");
    openapiFields.add("externalOrderId");
    openapiFields.add("imageUrl");
    openapiFields.add("itemLineId");
    openapiFields.add("locatorName");
    openapiFields.add("name");
    openapiFields.add("optionAttributeFQN");
    openapiFields.add("options");
    openapiFields.add("orderNumber");
    openapiFields.add("partNumber");
    openapiFields.add("productCode");
    openapiFields.add("quantity");
    openapiFields.add("shipmentNumber");
    openapiFields.add("sku");
    openapiFields.add("status");
    openapiFields.add("upc");
    openapiFields.add("variationProductCode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PickWaveContent0
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PickWaveContent0.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PickWaveContent0 is not found in the empty JSON string", PickWaveContent0.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!PickWaveContent0.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PickWaveContent0` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      // validate the optional field `auditInfo`
      if (jsonObj.get("auditInfo") != null && !jsonObj.get("auditInfo").isJsonNull()) {
        FulfillmentAuditInfo.validateJsonObject(jsonObj.getAsJsonObject("auditInfo"));
      }
      if ((jsonObj.get("binName") != null && !jsonObj.get("binName").isJsonNull()) && !jsonObj.get("binName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `binName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("binName").toString()));
      }
      if ((jsonObj.get("contentId") != null && !jsonObj.get("contentId").isJsonNull()) && !jsonObj.get("contentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contentId").toString()));
      }
      if ((jsonObj.get("externalOrderId") != null && !jsonObj.get("externalOrderId").isJsonNull()) && !jsonObj.get("externalOrderId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `externalOrderId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("externalOrderId").toString()));
      }
      if ((jsonObj.get("imageUrl") != null && !jsonObj.get("imageUrl").isJsonNull()) && !jsonObj.get("imageUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `imageUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("imageUrl").toString()));
      }
      if ((jsonObj.get("locatorName") != null && !jsonObj.get("locatorName").isJsonNull()) && !jsonObj.get("locatorName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locatorName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locatorName").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("optionAttributeFQN") != null && !jsonObj.get("optionAttributeFQN").isJsonNull()) && !jsonObj.get("optionAttributeFQN").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `optionAttributeFQN` to be a primitive type in the JSON string but got `%s`", jsonObj.get("optionAttributeFQN").toString()));
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
            ProductOption0.validateJsonObject(jsonArrayoptions.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("partNumber") != null && !jsonObj.get("partNumber").isJsonNull()) && !jsonObj.get("partNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `partNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("partNumber").toString()));
      }
      if ((jsonObj.get("productCode") != null && !jsonObj.get("productCode").isJsonNull()) && !jsonObj.get("productCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productCode").toString()));
      }
      if ((jsonObj.get("sku") != null && !jsonObj.get("sku").isJsonNull()) && !jsonObj.get("sku").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sku` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sku").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("upc") != null && !jsonObj.get("upc").isJsonNull()) && !jsonObj.get("upc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `upc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("upc").toString()));
      }
      if ((jsonObj.get("variationProductCode") != null && !jsonObj.get("variationProductCode").isJsonNull()) && !jsonObj.get("variationProductCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `variationProductCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("variationProductCode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PickWaveContent0.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PickWaveContent0' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PickWaveContent0> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PickWaveContent0.class));

       return (TypeAdapter<T>) new TypeAdapter<PickWaveContent0>() {
           @Override
           public void write(JsonWriter out, PickWaveContent0 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PickWaveContent0 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PickWaveContent0 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PickWaveContent0
  * @throws IOException if the JSON string is invalid with respect to PickWaveContent0
  */
  public static PickWaveContent0 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PickWaveContent0.class);
  }

 /**
  * Convert an instance of PickWaveContent0 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
