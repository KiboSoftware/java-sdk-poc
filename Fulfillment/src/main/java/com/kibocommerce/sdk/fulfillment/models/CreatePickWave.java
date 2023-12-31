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
import com.kibocommerce.sdk.fulfillment.models.PickWaveBinRange;
import com.kibocommerce.sdk.fulfillment.models.PickWaveProductMatch;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
 * CreatePickWave
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreatePickWave implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ALLOW_EMPTY_WAVE = "allowEmptyWave";
  @SerializedName(SERIALIZED_NAME_ALLOW_EMPTY_WAVE)
  private Boolean allowEmptyWave;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Map<String, Object> attributes = null;

  public static final String SERIALIZED_NAME_BIN_RANGES = "binRanges";
  @SerializedName(SERIALIZED_NAME_BIN_RANGES)
  private List<PickWaveBinRange> binRanges = null;

  public static final String SERIALIZED_NAME_FULFILLABLE_SHIPMENTS_ONLY = "fulfillableShipmentsOnly";
  @SerializedName(SERIALIZED_NAME_FULFILLABLE_SHIPMENTS_ONLY)
  private Boolean fulfillableShipmentsOnly;

  public static final String SERIALIZED_NAME_FULFILLMENT_LOCATION_CODE = "fulfillmentLocationCode";
  @SerializedName(SERIALIZED_NAME_FULFILLMENT_LOCATION_CODE)
  private String fulfillmentLocationCode;

  public static final String SERIALIZED_NAME_INCLUDE_ZERO_INVENTORY = "includeZeroInventory";
  @SerializedName(SERIALIZED_NAME_INCLUDE_ZERO_INVENTORY)
  private Boolean includeZeroInventory;

  public static final String SERIALIZED_NAME_LOCK_WAVE = "lockWave";
  @SerializedName(SERIALIZED_NAME_LOCK_WAVE)
  private Boolean lockWave;

  public static final String SERIALIZED_NAME_MAX_SHIPMENTS = "maxShipments";
  @SerializedName(SERIALIZED_NAME_MAX_SHIPMENTS)
  private Integer maxShipments;

  /**
   * Gets or Sets pickWaveType
   */
  @JsonAdapter(PickWaveTypeEnum.Adapter.class)
  public enum PickWaveTypeEnum {
    MULTIPLE("MULTIPLE"),
    
    NORMAL("NORMAL"),
    
    SINGLE("SINGLE");

    private String value;

    PickWaveTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PickWaveTypeEnum fromValue(String value) {
      for (PickWaveTypeEnum b : PickWaveTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PickWaveTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PickWaveTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PickWaveTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PickWaveTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PICK_WAVE_TYPE = "pickWaveType";
  @SerializedName(SERIALIZED_NAME_PICK_WAVE_TYPE)
  private PickWaveTypeEnum pickWaveType;

  public static final String SERIALIZED_NAME_PRODUCTS = "products";
  @SerializedName(SERIALIZED_NAME_PRODUCTS)
  private List<PickWaveProductMatch> products = null;

  public static final String SERIALIZED_NAME_SHIPMENT_DATE_END = "shipmentDateEnd";
  @SerializedName(SERIALIZED_NAME_SHIPMENT_DATE_END)
  private OffsetDateTime shipmentDateEnd;

  public static final String SERIALIZED_NAME_SHIPMENT_DATE_START = "shipmentDateStart";
  @SerializedName(SERIALIZED_NAME_SHIPMENT_DATE_START)
  private OffsetDateTime shipmentDateStart;

  /**
   * Gets or Sets shipmentType
   */
  @JsonAdapter(ShipmentTypeEnum.Adapter.class)
  public enum ShipmentTypeEnum {
    BOPIS("BOPIS"),
    
    STH("STH");

    private String value;

    ShipmentTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ShipmentTypeEnum fromValue(String value) {
      for (ShipmentTypeEnum b : ShipmentTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ShipmentTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ShipmentTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ShipmentTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ShipmentTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SHIPMENT_TYPE = "shipmentType";
  @SerializedName(SERIALIZED_NAME_SHIPMENT_TYPE)
  private ShipmentTypeEnum shipmentType;

  /**
   * Gets or Sets shippingOption
   */
  @JsonAdapter(ShippingOptionEnum.Adapter.class)
  public enum ShippingOptionEnum {
    ALL("ALL"),
    
    EXPRESS_ONLY("EXPRESS_ONLY"),
    
    STANDARD_ONLY("STANDARD_ONLY");

    private String value;

    ShippingOptionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ShippingOptionEnum fromValue(String value) {
      for (ShippingOptionEnum b : ShippingOptionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ShippingOptionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ShippingOptionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ShippingOptionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ShippingOptionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SHIPPING_OPTION = "shippingOption";
  @SerializedName(SERIALIZED_NAME_SHIPPING_OPTION)
  private ShippingOptionEnum shippingOption;

  public CreatePickWave() {
  }

  public CreatePickWave allowEmptyWave(Boolean allowEmptyWave) {
    
    this.allowEmptyWave = allowEmptyWave;
    return this;
  }

   /**
   * Get allowEmptyWave
   * @return allowEmptyWave
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAllowEmptyWave() {
    return allowEmptyWave;
  }


  public void setAllowEmptyWave(Boolean allowEmptyWave) {
    this.allowEmptyWave = allowEmptyWave;
  }


  public CreatePickWave attributes(Map<String, Object> attributes) {
    
    this.attributes = attributes;
    return this;
  }

  public CreatePickWave putAttributesItem(String key, Object attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Object> getAttributes() {
    return attributes;
  }


  public void setAttributes(Map<String, Object> attributes) {
    this.attributes = attributes;
  }


  public CreatePickWave binRanges(List<PickWaveBinRange> binRanges) {
    
    this.binRanges = binRanges;
    return this;
  }

  public CreatePickWave addBinRangesItem(PickWaveBinRange binRangesItem) {
    if (this.binRanges == null) {
      this.binRanges = new ArrayList<>();
    }
    this.binRanges.add(binRangesItem);
    return this;
  }

   /**
   * Get binRanges
   * @return binRanges
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<PickWaveBinRange> getBinRanges() {
    return binRanges;
  }


  public void setBinRanges(List<PickWaveBinRange> binRanges) {
    this.binRanges = binRanges;
  }


  public CreatePickWave fulfillableShipmentsOnly(Boolean fulfillableShipmentsOnly) {
    
    this.fulfillableShipmentsOnly = fulfillableShipmentsOnly;
    return this;
  }

   /**
   * Get fulfillableShipmentsOnly
   * @return fulfillableShipmentsOnly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getFulfillableShipmentsOnly() {
    return fulfillableShipmentsOnly;
  }


  public void setFulfillableShipmentsOnly(Boolean fulfillableShipmentsOnly) {
    this.fulfillableShipmentsOnly = fulfillableShipmentsOnly;
  }


  public CreatePickWave fulfillmentLocationCode(String fulfillmentLocationCode) {
    
    this.fulfillmentLocationCode = fulfillmentLocationCode;
    return this;
  }

   /**
   * Get fulfillmentLocationCode
   * @return fulfillmentLocationCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getFulfillmentLocationCode() {
    return fulfillmentLocationCode;
  }


  public void setFulfillmentLocationCode(String fulfillmentLocationCode) {
    this.fulfillmentLocationCode = fulfillmentLocationCode;
  }


  public CreatePickWave includeZeroInventory(Boolean includeZeroInventory) {
    
    this.includeZeroInventory = includeZeroInventory;
    return this;
  }

   /**
   * Get includeZeroInventory
   * @return includeZeroInventory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIncludeZeroInventory() {
    return includeZeroInventory;
  }


  public void setIncludeZeroInventory(Boolean includeZeroInventory) {
    this.includeZeroInventory = includeZeroInventory;
  }


  public CreatePickWave lockWave(Boolean lockWave) {
    
    this.lockWave = lockWave;
    return this;
  }

   /**
   * Get lockWave
   * @return lockWave
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getLockWave() {
    return lockWave;
  }


  public void setLockWave(Boolean lockWave) {
    this.lockWave = lockWave;
  }


  public CreatePickWave maxShipments(Integer maxShipments) {
    
    this.maxShipments = maxShipments;
    return this;
  }

   /**
   * Get maxShipments
   * @return maxShipments
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getMaxShipments() {
    return maxShipments;
  }


  public void setMaxShipments(Integer maxShipments) {
    this.maxShipments = maxShipments;
  }


  public CreatePickWave pickWaveType(PickWaveTypeEnum pickWaveType) {
    
    this.pickWaveType = pickWaveType;
    return this;
  }

   /**
   * Get pickWaveType
   * @return pickWaveType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PickWaveTypeEnum getPickWaveType() {
    return pickWaveType;
  }


  public void setPickWaveType(PickWaveTypeEnum pickWaveType) {
    this.pickWaveType = pickWaveType;
  }


  public CreatePickWave products(List<PickWaveProductMatch> products) {
    
    this.products = products;
    return this;
  }

  public CreatePickWave addProductsItem(PickWaveProductMatch productsItem) {
    if (this.products == null) {
      this.products = new ArrayList<>();
    }
    this.products.add(productsItem);
    return this;
  }

   /**
   * Get products
   * @return products
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<PickWaveProductMatch> getProducts() {
    return products;
  }


  public void setProducts(List<PickWaveProductMatch> products) {
    this.products = products;
  }


  public CreatePickWave shipmentDateEnd(OffsetDateTime shipmentDateEnd) {
    
    this.shipmentDateEnd = shipmentDateEnd;
    return this;
  }

   /**
   * Get shipmentDateEnd
   * @return shipmentDateEnd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getShipmentDateEnd() {
    return shipmentDateEnd;
  }


  public void setShipmentDateEnd(OffsetDateTime shipmentDateEnd) {
    this.shipmentDateEnd = shipmentDateEnd;
  }


  public CreatePickWave shipmentDateStart(OffsetDateTime shipmentDateStart) {
    
    this.shipmentDateStart = shipmentDateStart;
    return this;
  }

   /**
   * Get shipmentDateStart
   * @return shipmentDateStart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getShipmentDateStart() {
    return shipmentDateStart;
  }


  public void setShipmentDateStart(OffsetDateTime shipmentDateStart) {
    this.shipmentDateStart = shipmentDateStart;
  }


  public CreatePickWave shipmentType(ShipmentTypeEnum shipmentType) {
    
    this.shipmentType = shipmentType;
    return this;
  }

   /**
   * Get shipmentType
   * @return shipmentType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ShipmentTypeEnum getShipmentType() {
    return shipmentType;
  }


  public void setShipmentType(ShipmentTypeEnum shipmentType) {
    this.shipmentType = shipmentType;
  }


  public CreatePickWave shippingOption(ShippingOptionEnum shippingOption) {
    
    this.shippingOption = shippingOption;
    return this;
  }

   /**
   * Get shippingOption
   * @return shippingOption
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ShippingOptionEnum getShippingOption() {
    return shippingOption;
  }


  public void setShippingOption(ShippingOptionEnum shippingOption) {
    this.shippingOption = shippingOption;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePickWave createPickWave = (CreatePickWave) o;
    return Objects.equals(this.allowEmptyWave, createPickWave.allowEmptyWave) &&
        Objects.equals(this.attributes, createPickWave.attributes) &&
        Objects.equals(this.binRanges, createPickWave.binRanges) &&
        Objects.equals(this.fulfillableShipmentsOnly, createPickWave.fulfillableShipmentsOnly) &&
        Objects.equals(this.fulfillmentLocationCode, createPickWave.fulfillmentLocationCode) &&
        Objects.equals(this.includeZeroInventory, createPickWave.includeZeroInventory) &&
        Objects.equals(this.lockWave, createPickWave.lockWave) &&
        Objects.equals(this.maxShipments, createPickWave.maxShipments) &&
        Objects.equals(this.pickWaveType, createPickWave.pickWaveType) &&
        Objects.equals(this.products, createPickWave.products) &&
        Objects.equals(this.shipmentDateEnd, createPickWave.shipmentDateEnd) &&
        Objects.equals(this.shipmentDateStart, createPickWave.shipmentDateStart) &&
        Objects.equals(this.shipmentType, createPickWave.shipmentType) &&
        Objects.equals(this.shippingOption, createPickWave.shippingOption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowEmptyWave, attributes, binRanges, fulfillableShipmentsOnly, fulfillmentLocationCode, includeZeroInventory, lockWave, maxShipments, pickWaveType, products, shipmentDateEnd, shipmentDateStart, shipmentType, shippingOption);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePickWave {\n");
    sb.append("    allowEmptyWave: ").append(toIndentedString(allowEmptyWave)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    binRanges: ").append(toIndentedString(binRanges)).append("\n");
    sb.append("    fulfillableShipmentsOnly: ").append(toIndentedString(fulfillableShipmentsOnly)).append("\n");
    sb.append("    fulfillmentLocationCode: ").append(toIndentedString(fulfillmentLocationCode)).append("\n");
    sb.append("    includeZeroInventory: ").append(toIndentedString(includeZeroInventory)).append("\n");
    sb.append("    lockWave: ").append(toIndentedString(lockWave)).append("\n");
    sb.append("    maxShipments: ").append(toIndentedString(maxShipments)).append("\n");
    sb.append("    pickWaveType: ").append(toIndentedString(pickWaveType)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
    sb.append("    shipmentDateEnd: ").append(toIndentedString(shipmentDateEnd)).append("\n");
    sb.append("    shipmentDateStart: ").append(toIndentedString(shipmentDateStart)).append("\n");
    sb.append("    shipmentType: ").append(toIndentedString(shipmentType)).append("\n");
    sb.append("    shippingOption: ").append(toIndentedString(shippingOption)).append("\n");
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
    openapiFields.add("allowEmptyWave");
    openapiFields.add("attributes");
    openapiFields.add("binRanges");
    openapiFields.add("fulfillableShipmentsOnly");
    openapiFields.add("fulfillmentLocationCode");
    openapiFields.add("includeZeroInventory");
    openapiFields.add("lockWave");
    openapiFields.add("maxShipments");
    openapiFields.add("pickWaveType");
    openapiFields.add("products");
    openapiFields.add("shipmentDateEnd");
    openapiFields.add("shipmentDateStart");
    openapiFields.add("shipmentType");
    openapiFields.add("shippingOption");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("fulfillmentLocationCode");
    openapiRequiredFields.add("maxShipments");
    openapiRequiredFields.add("shipmentType");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreatePickWave
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreatePickWave.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreatePickWave is not found in the empty JSON string", CreatePickWave.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!CreatePickWave.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreatePickWave` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreatePickWave.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("binRanges") != null && !jsonObj.get("binRanges").isJsonNull()) {
        JsonArray jsonArraybinRanges = jsonObj.getAsJsonArray("binRanges");
        if (jsonArraybinRanges != null) {
          // ensure the json data is an array
          if (!jsonObj.get("binRanges").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `binRanges` to be an array in the JSON string but got `%s`", jsonObj.get("binRanges").toString()));
          }

          // validate the optional field `binRanges` (array)
          for (int i = 0; i < jsonArraybinRanges.size(); i++) {
            PickWaveBinRange.validateJsonObject(jsonArraybinRanges.get(i).getAsJsonObject());
          };
        }
      }
      if (!jsonObj.get("fulfillmentLocationCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fulfillmentLocationCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fulfillmentLocationCode").toString()));
      }
      if ((jsonObj.get("pickWaveType") != null && !jsonObj.get("pickWaveType").isJsonNull()) && !jsonObj.get("pickWaveType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pickWaveType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pickWaveType").toString()));
      }
      if (jsonObj.get("products") != null && !jsonObj.get("products").isJsonNull()) {
        JsonArray jsonArrayproducts = jsonObj.getAsJsonArray("products");
        if (jsonArrayproducts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("products").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `products` to be an array in the JSON string but got `%s`", jsonObj.get("products").toString()));
          }

          // validate the optional field `products` (array)
          for (int i = 0; i < jsonArrayproducts.size(); i++) {
            PickWaveProductMatch.validateJsonObject(jsonArrayproducts.get(i).getAsJsonObject());
          };
        }
      }
      if (!jsonObj.get("shipmentType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shipmentType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shipmentType").toString()));
      }
      if ((jsonObj.get("shippingOption") != null && !jsonObj.get("shippingOption").isJsonNull()) && !jsonObj.get("shippingOption").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shippingOption` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shippingOption").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreatePickWave.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreatePickWave' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreatePickWave> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreatePickWave.class));

       return (TypeAdapter<T>) new TypeAdapter<CreatePickWave>() {
           @Override
           public void write(JsonWriter out, CreatePickWave value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreatePickWave read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreatePickWave given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreatePickWave
  * @throws IOException if the JSON string is invalid with respect to CreatePickWave
  */
  public static CreatePickWave fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreatePickWave.class);
  }

 /**
  * Convert an instance of CreatePickWave to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

