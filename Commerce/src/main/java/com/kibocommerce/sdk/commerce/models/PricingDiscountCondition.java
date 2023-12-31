/*
 * Kibo CommerceRuntime Service
 * OpenAPI Spec for Kibo CommerceRuntime Service
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.commerce.models;

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
import java.time.OffsetDateTime;
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
 * PricingDiscountCondition
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PricingDiscountCondition implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_REQUIRES_COUPON = "requiresCoupon";
  @SerializedName(SERIALIZED_NAME_REQUIRES_COUPON)
  private Boolean requiresCoupon;

  public static final String SERIALIZED_NAME_COUPON_CODE = "couponCode";
  @SerializedName(SERIALIZED_NAME_COUPON_CODE)
  private String couponCode;

  public static final String SERIALIZED_NAME_MINIMUM_QUANTITY_PRODUCTS_REQUIRED_IN_CATEGORIES = "minimumQuantityProductsRequiredInCategories";
  @SerializedName(SERIALIZED_NAME_MINIMUM_QUANTITY_PRODUCTS_REQUIRED_IN_CATEGORIES)
  private Integer minimumQuantityProductsRequiredInCategories;

  public static final String SERIALIZED_NAME_INCLUDED_CATEGORY_IDS = "includedCategoryIds";
  @SerializedName(SERIALIZED_NAME_INCLUDED_CATEGORY_IDS)
  private List<Integer> includedCategoryIds = null;

  public static final String SERIALIZED_NAME_EXCLUDED_CATEGORY_IDS = "excludedCategoryIds";
  @SerializedName(SERIALIZED_NAME_EXCLUDED_CATEGORY_IDS)
  private List<Integer> excludedCategoryIds = null;

  public static final String SERIALIZED_NAME_MINIMUM_QUANTITY_REQUIRED_PRODUCTS = "minimumQuantityRequiredProducts";
  @SerializedName(SERIALIZED_NAME_MINIMUM_QUANTITY_REQUIRED_PRODUCTS)
  private Integer minimumQuantityRequiredProducts;

  public static final String SERIALIZED_NAME_INCLUDED_PRODUCT_CODES = "includedProductCodes";
  @SerializedName(SERIALIZED_NAME_INCLUDED_PRODUCT_CODES)
  private List<String> includedProductCodes = null;

  public static final String SERIALIZED_NAME_EXCLUDED_PRODUCT_CODES = "excludedProductCodes";
  @SerializedName(SERIALIZED_NAME_EXCLUDED_PRODUCT_CODES)
  private List<String> excludedProductCodes = null;

  public static final String SERIALIZED_NAME_PAYMENT_WORKFLOWS = "paymentWorkflows";
  @SerializedName(SERIALIZED_NAME_PAYMENT_WORKFLOWS)
  private List<String> paymentWorkflows = null;

  public static final String SERIALIZED_NAME_CUSTOMER_SEGMENT_IDS = "customerSegmentIds";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_SEGMENT_IDS)
  private List<Integer> customerSegmentIds = null;

  public static final String SERIALIZED_NAME_MINIMUM_ORDER_AMOUNT = "minimumOrderAmount";
  @SerializedName(SERIALIZED_NAME_MINIMUM_ORDER_AMOUNT)
  private Double minimumOrderAmount;

  public static final String SERIALIZED_NAME_MAXIMUM_ORDER_AMOUNT = "maximumOrderAmount";
  @SerializedName(SERIALIZED_NAME_MAXIMUM_ORDER_AMOUNT)
  private Double maximumOrderAmount;

  public static final String SERIALIZED_NAME_MINIMUM_LIFETIME_VALUE_AMOUNT = "minimumLifetimeValueAmount";
  @SerializedName(SERIALIZED_NAME_MINIMUM_LIFETIME_VALUE_AMOUNT)
  private Double minimumLifetimeValueAmount;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_EXPIRATION_DATE = "expirationDate";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_DATE)
  private OffsetDateTime expirationDate;

  public static final String SERIALIZED_NAME_MINIMUM_CATEGORY_SUBTOTAL_BEFORE_DISCOUNTS = "minimumCategorySubtotalBeforeDiscounts";
  @SerializedName(SERIALIZED_NAME_MINIMUM_CATEGORY_SUBTOTAL_BEFORE_DISCOUNTS)
  private Double minimumCategorySubtotalBeforeDiscounts;

  public static final String SERIALIZED_NAME_MIN_DISTINCT_PRODUCTS_REQUIRED = "minDistinctProductsRequired";
  @SerializedName(SERIALIZED_NAME_MIN_DISTINCT_PRODUCTS_REQUIRED)
  private Integer minDistinctProductsRequired;

  public PricingDiscountCondition() {
  }

  public PricingDiscountCondition requiresCoupon(Boolean requiresCoupon) {
    
    this.requiresCoupon = requiresCoupon;
    return this;
  }

   /**
   * Get requiresCoupon
   * @return requiresCoupon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getRequiresCoupon() {
    return requiresCoupon;
  }


  public void setRequiresCoupon(Boolean requiresCoupon) {
    this.requiresCoupon = requiresCoupon;
  }


  public PricingDiscountCondition couponCode(String couponCode) {
    
    this.couponCode = couponCode;
    return this;
  }

   /**
   * Get couponCode
   * @return couponCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCouponCode() {
    return couponCode;
  }


  public void setCouponCode(String couponCode) {
    this.couponCode = couponCode;
  }


  public PricingDiscountCondition minimumQuantityProductsRequiredInCategories(Integer minimumQuantityProductsRequiredInCategories) {
    
    this.minimumQuantityProductsRequiredInCategories = minimumQuantityProductsRequiredInCategories;
    return this;
  }

   /**
   * Get minimumQuantityProductsRequiredInCategories
   * @return minimumQuantityProductsRequiredInCategories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMinimumQuantityProductsRequiredInCategories() {
    return minimumQuantityProductsRequiredInCategories;
  }


  public void setMinimumQuantityProductsRequiredInCategories(Integer minimumQuantityProductsRequiredInCategories) {
    this.minimumQuantityProductsRequiredInCategories = minimumQuantityProductsRequiredInCategories;
  }


  public PricingDiscountCondition includedCategoryIds(List<Integer> includedCategoryIds) {
    
    this.includedCategoryIds = includedCategoryIds;
    return this;
  }

  public PricingDiscountCondition addIncludedCategoryIdsItem(Integer includedCategoryIdsItem) {
    if (this.includedCategoryIds == null) {
      this.includedCategoryIds = new ArrayList<>();
    }
    this.includedCategoryIds.add(includedCategoryIdsItem);
    return this;
  }

   /**
   * Get includedCategoryIds
   * @return includedCategoryIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getIncludedCategoryIds() {
    return includedCategoryIds;
  }


  public void setIncludedCategoryIds(List<Integer> includedCategoryIds) {
    this.includedCategoryIds = includedCategoryIds;
  }


  public PricingDiscountCondition excludedCategoryIds(List<Integer> excludedCategoryIds) {
    
    this.excludedCategoryIds = excludedCategoryIds;
    return this;
  }

  public PricingDiscountCondition addExcludedCategoryIdsItem(Integer excludedCategoryIdsItem) {
    if (this.excludedCategoryIds == null) {
      this.excludedCategoryIds = new ArrayList<>();
    }
    this.excludedCategoryIds.add(excludedCategoryIdsItem);
    return this;
  }

   /**
   * Get excludedCategoryIds
   * @return excludedCategoryIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getExcludedCategoryIds() {
    return excludedCategoryIds;
  }


  public void setExcludedCategoryIds(List<Integer> excludedCategoryIds) {
    this.excludedCategoryIds = excludedCategoryIds;
  }


  public PricingDiscountCondition minimumQuantityRequiredProducts(Integer minimumQuantityRequiredProducts) {
    
    this.minimumQuantityRequiredProducts = minimumQuantityRequiredProducts;
    return this;
  }

   /**
   * Get minimumQuantityRequiredProducts
   * @return minimumQuantityRequiredProducts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMinimumQuantityRequiredProducts() {
    return minimumQuantityRequiredProducts;
  }


  public void setMinimumQuantityRequiredProducts(Integer minimumQuantityRequiredProducts) {
    this.minimumQuantityRequiredProducts = minimumQuantityRequiredProducts;
  }


  public PricingDiscountCondition includedProductCodes(List<String> includedProductCodes) {
    
    this.includedProductCodes = includedProductCodes;
    return this;
  }

  public PricingDiscountCondition addIncludedProductCodesItem(String includedProductCodesItem) {
    if (this.includedProductCodes == null) {
      this.includedProductCodes = new ArrayList<>();
    }
    this.includedProductCodes.add(includedProductCodesItem);
    return this;
  }

   /**
   * Get includedProductCodes
   * @return includedProductCodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getIncludedProductCodes() {
    return includedProductCodes;
  }


  public void setIncludedProductCodes(List<String> includedProductCodes) {
    this.includedProductCodes = includedProductCodes;
  }


  public PricingDiscountCondition excludedProductCodes(List<String> excludedProductCodes) {
    
    this.excludedProductCodes = excludedProductCodes;
    return this;
  }

  public PricingDiscountCondition addExcludedProductCodesItem(String excludedProductCodesItem) {
    if (this.excludedProductCodes == null) {
      this.excludedProductCodes = new ArrayList<>();
    }
    this.excludedProductCodes.add(excludedProductCodesItem);
    return this;
  }

   /**
   * Get excludedProductCodes
   * @return excludedProductCodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getExcludedProductCodes() {
    return excludedProductCodes;
  }


  public void setExcludedProductCodes(List<String> excludedProductCodes) {
    this.excludedProductCodes = excludedProductCodes;
  }


  public PricingDiscountCondition paymentWorkflows(List<String> paymentWorkflows) {
    
    this.paymentWorkflows = paymentWorkflows;
    return this;
  }

  public PricingDiscountCondition addPaymentWorkflowsItem(String paymentWorkflowsItem) {
    if (this.paymentWorkflows == null) {
      this.paymentWorkflows = new ArrayList<>();
    }
    this.paymentWorkflows.add(paymentWorkflowsItem);
    return this;
  }

   /**
   * Get paymentWorkflows
   * @return paymentWorkflows
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getPaymentWorkflows() {
    return paymentWorkflows;
  }


  public void setPaymentWorkflows(List<String> paymentWorkflows) {
    this.paymentWorkflows = paymentWorkflows;
  }


  public PricingDiscountCondition customerSegmentIds(List<Integer> customerSegmentIds) {
    
    this.customerSegmentIds = customerSegmentIds;
    return this;
  }

  public PricingDiscountCondition addCustomerSegmentIdsItem(Integer customerSegmentIdsItem) {
    if (this.customerSegmentIds == null) {
      this.customerSegmentIds = new ArrayList<>();
    }
    this.customerSegmentIds.add(customerSegmentIdsItem);
    return this;
  }

   /**
   * Get customerSegmentIds
   * @return customerSegmentIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getCustomerSegmentIds() {
    return customerSegmentIds;
  }


  public void setCustomerSegmentIds(List<Integer> customerSegmentIds) {
    this.customerSegmentIds = customerSegmentIds;
  }


  public PricingDiscountCondition minimumOrderAmount(Double minimumOrderAmount) {
    
    this.minimumOrderAmount = minimumOrderAmount;
    return this;
  }

   /**
   * Get minimumOrderAmount
   * @return minimumOrderAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getMinimumOrderAmount() {
    return minimumOrderAmount;
  }


  public void setMinimumOrderAmount(Double minimumOrderAmount) {
    this.minimumOrderAmount = minimumOrderAmount;
  }


  public PricingDiscountCondition maximumOrderAmount(Double maximumOrderAmount) {
    
    this.maximumOrderAmount = maximumOrderAmount;
    return this;
  }

   /**
   * Get maximumOrderAmount
   * @return maximumOrderAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getMaximumOrderAmount() {
    return maximumOrderAmount;
  }


  public void setMaximumOrderAmount(Double maximumOrderAmount) {
    this.maximumOrderAmount = maximumOrderAmount;
  }


  public PricingDiscountCondition minimumLifetimeValueAmount(Double minimumLifetimeValueAmount) {
    
    this.minimumLifetimeValueAmount = minimumLifetimeValueAmount;
    return this;
  }

   /**
   * Get minimumLifetimeValueAmount
   * @return minimumLifetimeValueAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getMinimumLifetimeValueAmount() {
    return minimumLifetimeValueAmount;
  }


  public void setMinimumLifetimeValueAmount(Double minimumLifetimeValueAmount) {
    this.minimumLifetimeValueAmount = minimumLifetimeValueAmount;
  }


  public PricingDiscountCondition startDate(OffsetDateTime startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public PricingDiscountCondition expirationDate(OffsetDateTime expirationDate) {
    
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * Get expirationDate
   * @return expirationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getExpirationDate() {
    return expirationDate;
  }


  public void setExpirationDate(OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
  }


  public PricingDiscountCondition minimumCategorySubtotalBeforeDiscounts(Double minimumCategorySubtotalBeforeDiscounts) {
    
    this.minimumCategorySubtotalBeforeDiscounts = minimumCategorySubtotalBeforeDiscounts;
    return this;
  }

   /**
   * Get minimumCategorySubtotalBeforeDiscounts
   * @return minimumCategorySubtotalBeforeDiscounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getMinimumCategorySubtotalBeforeDiscounts() {
    return minimumCategorySubtotalBeforeDiscounts;
  }


  public void setMinimumCategorySubtotalBeforeDiscounts(Double minimumCategorySubtotalBeforeDiscounts) {
    this.minimumCategorySubtotalBeforeDiscounts = minimumCategorySubtotalBeforeDiscounts;
  }


  public PricingDiscountCondition minDistinctProductsRequired(Integer minDistinctProductsRequired) {
    
    this.minDistinctProductsRequired = minDistinctProductsRequired;
    return this;
  }

   /**
   * Get minDistinctProductsRequired
   * @return minDistinctProductsRequired
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMinDistinctProductsRequired() {
    return minDistinctProductsRequired;
  }


  public void setMinDistinctProductsRequired(Integer minDistinctProductsRequired) {
    this.minDistinctProductsRequired = minDistinctProductsRequired;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PricingDiscountCondition pricingDiscountCondition = (PricingDiscountCondition) o;
    return Objects.equals(this.requiresCoupon, pricingDiscountCondition.requiresCoupon) &&
        Objects.equals(this.couponCode, pricingDiscountCondition.couponCode) &&
        Objects.equals(this.minimumQuantityProductsRequiredInCategories, pricingDiscountCondition.minimumQuantityProductsRequiredInCategories) &&
        Objects.equals(this.includedCategoryIds, pricingDiscountCondition.includedCategoryIds) &&
        Objects.equals(this.excludedCategoryIds, pricingDiscountCondition.excludedCategoryIds) &&
        Objects.equals(this.minimumQuantityRequiredProducts, pricingDiscountCondition.minimumQuantityRequiredProducts) &&
        Objects.equals(this.includedProductCodes, pricingDiscountCondition.includedProductCodes) &&
        Objects.equals(this.excludedProductCodes, pricingDiscountCondition.excludedProductCodes) &&
        Objects.equals(this.paymentWorkflows, pricingDiscountCondition.paymentWorkflows) &&
        Objects.equals(this.customerSegmentIds, pricingDiscountCondition.customerSegmentIds) &&
        Objects.equals(this.minimumOrderAmount, pricingDiscountCondition.minimumOrderAmount) &&
        Objects.equals(this.maximumOrderAmount, pricingDiscountCondition.maximumOrderAmount) &&
        Objects.equals(this.minimumLifetimeValueAmount, pricingDiscountCondition.minimumLifetimeValueAmount) &&
        Objects.equals(this.startDate, pricingDiscountCondition.startDate) &&
        Objects.equals(this.expirationDate, pricingDiscountCondition.expirationDate) &&
        Objects.equals(this.minimumCategorySubtotalBeforeDiscounts, pricingDiscountCondition.minimumCategorySubtotalBeforeDiscounts) &&
        Objects.equals(this.minDistinctProductsRequired, pricingDiscountCondition.minDistinctProductsRequired);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(requiresCoupon, couponCode, minimumQuantityProductsRequiredInCategories, includedCategoryIds, excludedCategoryIds, minimumQuantityRequiredProducts, includedProductCodes, excludedProductCodes, paymentWorkflows, customerSegmentIds, minimumOrderAmount, maximumOrderAmount, minimumLifetimeValueAmount, startDate, expirationDate, minimumCategorySubtotalBeforeDiscounts, minDistinctProductsRequired);
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
    sb.append("class PricingDiscountCondition {\n");
    sb.append("    requiresCoupon: ").append(toIndentedString(requiresCoupon)).append("\n");
    sb.append("    couponCode: ").append(toIndentedString(couponCode)).append("\n");
    sb.append("    minimumQuantityProductsRequiredInCategories: ").append(toIndentedString(minimumQuantityProductsRequiredInCategories)).append("\n");
    sb.append("    includedCategoryIds: ").append(toIndentedString(includedCategoryIds)).append("\n");
    sb.append("    excludedCategoryIds: ").append(toIndentedString(excludedCategoryIds)).append("\n");
    sb.append("    minimumQuantityRequiredProducts: ").append(toIndentedString(minimumQuantityRequiredProducts)).append("\n");
    sb.append("    includedProductCodes: ").append(toIndentedString(includedProductCodes)).append("\n");
    sb.append("    excludedProductCodes: ").append(toIndentedString(excludedProductCodes)).append("\n");
    sb.append("    paymentWorkflows: ").append(toIndentedString(paymentWorkflows)).append("\n");
    sb.append("    customerSegmentIds: ").append(toIndentedString(customerSegmentIds)).append("\n");
    sb.append("    minimumOrderAmount: ").append(toIndentedString(minimumOrderAmount)).append("\n");
    sb.append("    maximumOrderAmount: ").append(toIndentedString(maximumOrderAmount)).append("\n");
    sb.append("    minimumLifetimeValueAmount: ").append(toIndentedString(minimumLifetimeValueAmount)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    minimumCategorySubtotalBeforeDiscounts: ").append(toIndentedString(minimumCategorySubtotalBeforeDiscounts)).append("\n");
    sb.append("    minDistinctProductsRequired: ").append(toIndentedString(minDistinctProductsRequired)).append("\n");
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
    openapiFields.add("requiresCoupon");
    openapiFields.add("couponCode");
    openapiFields.add("minimumQuantityProductsRequiredInCategories");
    openapiFields.add("includedCategoryIds");
    openapiFields.add("excludedCategoryIds");
    openapiFields.add("minimumQuantityRequiredProducts");
    openapiFields.add("includedProductCodes");
    openapiFields.add("excludedProductCodes");
    openapiFields.add("paymentWorkflows");
    openapiFields.add("customerSegmentIds");
    openapiFields.add("minimumOrderAmount");
    openapiFields.add("maximumOrderAmount");
    openapiFields.add("minimumLifetimeValueAmount");
    openapiFields.add("startDate");
    openapiFields.add("expirationDate");
    openapiFields.add("minimumCategorySubtotalBeforeDiscounts");
    openapiFields.add("minDistinctProductsRequired");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PricingDiscountCondition
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PricingDiscountCondition.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PricingDiscountCondition is not found in the empty JSON string", PricingDiscountCondition.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!PricingDiscountCondition.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PricingDiscountCondition` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("couponCode") != null && !jsonObj.get("couponCode").isJsonNull()) && !jsonObj.get("couponCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `couponCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("couponCode").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("includedCategoryIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `includedCategoryIds` to be an array in the JSON string but got `%s`", jsonObj.get("includedCategoryIds").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("excludedCategoryIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `excludedCategoryIds` to be an array in the JSON string but got `%s`", jsonObj.get("excludedCategoryIds").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("includedProductCodes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `includedProductCodes` to be an array in the JSON string but got `%s`", jsonObj.get("includedProductCodes").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("excludedProductCodes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `excludedProductCodes` to be an array in the JSON string but got `%s`", jsonObj.get("excludedProductCodes").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("paymentWorkflows").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `paymentWorkflows` to be an array in the JSON string but got `%s`", jsonObj.get("paymentWorkflows").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("customerSegmentIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerSegmentIds` to be an array in the JSON string but got `%s`", jsonObj.get("customerSegmentIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PricingDiscountCondition.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PricingDiscountCondition' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PricingDiscountCondition> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PricingDiscountCondition.class));

       return (TypeAdapter<T>) new TypeAdapter<PricingDiscountCondition>() {
           @Override
           public void write(JsonWriter out, PricingDiscountCondition value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PricingDiscountCondition read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PricingDiscountCondition given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PricingDiscountCondition
  * @throws IOException if the JSON string is invalid with respect to PricingDiscountCondition
  */
  public static PricingDiscountCondition fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PricingDiscountCondition.class);
  }

 /**
  * Convert an instance of PricingDiscountCondition to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

