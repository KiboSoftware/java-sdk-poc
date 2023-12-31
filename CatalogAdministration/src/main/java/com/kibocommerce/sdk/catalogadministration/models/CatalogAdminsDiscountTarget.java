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
import com.kibocommerce.sdk.catalogadministration.models.TargetedCategory;
import com.kibocommerce.sdk.catalogadministration.models.TargetedProduct;
import com.kibocommerce.sdk.catalogadministration.models.TargetedShippingMethod;
import com.kibocommerce.sdk.catalogadministration.models.TargetedShippingZone;
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
 * What to discount. Specifies the type of discount (percentage off, monetary amount, or free shipping) and which products, categories, or shipping methods are eligible for the discount.  Can also specify the minimum amount that the order must total for the discount to apply.
 */
@ApiModel(description = "What to discount. Specifies the type of discount (percentage off, monetary amount, or free shipping) and which products, categories, or shipping methods are eligible for the discount.  Can also specify the minimum amount that the order must total for the discount to apply.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CatalogAdminsDiscountTarget implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_INCLUDE_ALL_PRODUCTS = "includeAllProducts";
  @SerializedName(SERIALIZED_NAME_INCLUDE_ALL_PRODUCTS)
  private Boolean includeAllProducts;

  public static final String SERIALIZED_NAME_INCLUDED_CATEGORIES_OPERATOR = "includedCategoriesOperator";
  @SerializedName(SERIALIZED_NAME_INCLUDED_CATEGORIES_OPERATOR)
  private String includedCategoriesOperator;

  public static final String SERIALIZED_NAME_CATEGORIES = "categories";
  @SerializedName(SERIALIZED_NAME_CATEGORIES)
  private List<TargetedCategory> categories = null;

  public static final String SERIALIZED_NAME_EXCLUDED_CATEGORIES_OPERATOR = "excludedCategoriesOperator";
  @SerializedName(SERIALIZED_NAME_EXCLUDED_CATEGORIES_OPERATOR)
  private String excludedCategoriesOperator;

  public static final String SERIALIZED_NAME_EXCLUDED_CATEGORIES = "excludedCategories";
  @SerializedName(SERIALIZED_NAME_EXCLUDED_CATEGORIES)
  private List<TargetedCategory> excludedCategories = null;

  public static final String SERIALIZED_NAME_PRODUCTS = "products";
  @SerializedName(SERIALIZED_NAME_PRODUCTS)
  private List<TargetedProduct> products = null;

  public static final String SERIALIZED_NAME_EXCLUDED_PRODUCTS = "excludedProducts";
  @SerializedName(SERIALIZED_NAME_EXCLUDED_PRODUCTS)
  private List<TargetedProduct> excludedProducts = null;

  public static final String SERIALIZED_NAME_EXCLUDE_ITEMS_WITH_EXISTING_SHIPPING_DISCOUNTS = "excludeItemsWithExistingShippingDiscounts";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_ITEMS_WITH_EXISTING_SHIPPING_DISCOUNTS)
  private Boolean excludeItemsWithExistingShippingDiscounts;

  public static final String SERIALIZED_NAME_EXCLUDE_ITEMS_WITH_EXISTING_PRODUCT_DISCOUNTS = "excludeItemsWithExistingProductDiscounts";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_ITEMS_WITH_EXISTING_PRODUCT_DISCOUNTS)
  private Boolean excludeItemsWithExistingProductDiscounts;

  public static final String SERIALIZED_NAME_SHIPPING_METHODS = "shippingMethods";
  @SerializedName(SERIALIZED_NAME_SHIPPING_METHODS)
  private List<TargetedShippingMethod> shippingMethods = null;

  public static final String SERIALIZED_NAME_SHIPPING_ZONES = "shippingZones";
  @SerializedName(SERIALIZED_NAME_SHIPPING_ZONES)
  private List<TargetedShippingZone> shippingZones = null;

  public static final String SERIALIZED_NAME_DO_NOT_APPLY_TO_HANDLING_FEES = "doNotApplyToHandlingFees";
  @SerializedName(SERIALIZED_NAME_DO_NOT_APPLY_TO_HANDLING_FEES)
  private Boolean doNotApplyToHandlingFees;

  public static final String SERIALIZED_NAME_MAXIMUM_QUANTITY_PER_REDEMPTION = "maximumQuantityPerRedemption";
  @SerializedName(SERIALIZED_NAME_MAXIMUM_QUANTITY_PER_REDEMPTION)
  private Integer maximumQuantityPerRedemption;

  public static final String SERIALIZED_NAME_APPLIES_TO_LEAST_EXPENSIVE_PRODUCTS_FIRST = "appliesToLeastExpensiveProductsFirst";
  @SerializedName(SERIALIZED_NAME_APPLIES_TO_LEAST_EXPENSIVE_PRODUCTS_FIRST)
  private Boolean appliesToLeastExpensiveProductsFirst;

  public CatalogAdminsDiscountTarget() {
  }

  public CatalogAdminsDiscountTarget type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   *     Type of target to which the discount applies. Possible values: &lt;pre&gt;Product&lt;/pre&gt; or &lt;pre&gt;Shipping&lt;/pre&gt;.   If this is a &lt;pre&gt;Product&lt;/pre&gt; type, you can specify which products or categories that the discount applies to.      If this is a &lt;pre&gt;Shipping&lt;/pre&gt; type then you must specify which shipping methods apply.
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "    Type of target to which the discount applies. Possible values: <pre>Product</pre> or <pre>Shipping</pre>.   If this is a <pre>Product</pre> type, you can specify which products or categories that the discount applies to.      If this is a <pre>Shipping</pre> type then you must specify which shipping methods apply.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public CatalogAdminsDiscountTarget includeAllProducts(Boolean includeAllProducts) {
    
    this.includeAllProducts = includeAllProducts;
    return this;
  }

   /**
   * If yes, the discount applies to all products sold on the storefront.
   * @return includeAllProducts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If yes, the discount applies to all products sold on the storefront.")

  public Boolean getIncludeAllProducts() {
    return includeAllProducts;
  }


  public void setIncludeAllProducts(Boolean includeAllProducts) {
    this.includeAllProducts = includeAllProducts;
  }


  public CatalogAdminsDiscountTarget includedCategoriesOperator(String includedCategoriesOperator) {
    
    this.includedCategoriesOperator = includedCategoriesOperator;
    return this;
  }

   /**
   * Applies to Included categories  When Any, the target product can belong to any specified category.  When All, the target product must belong to all specified categories.  Defaults to Any
   * @return includedCategoriesOperator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Applies to Included categories  When Any, the target product can belong to any specified category.  When All, the target product must belong to all specified categories.  Defaults to Any")

  public String getIncludedCategoriesOperator() {
    return includedCategoriesOperator;
  }


  public void setIncludedCategoriesOperator(String includedCategoriesOperator) {
    this.includedCategoriesOperator = includedCategoriesOperator;
  }


  public CatalogAdminsDiscountTarget categories(List<TargetedCategory> categories) {
    
    this.categories = categories;
    return this;
  }

  public CatalogAdminsDiscountTarget addCategoriesItem(TargetedCategory categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * List of categories to discount. When a discount applies to a category, all products in the category are discounted.
   * @return categories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of categories to discount. When a discount applies to a category, all products in the category are discounted.")

  public List<TargetedCategory> getCategories() {
    return categories;
  }


  public void setCategories(List<TargetedCategory> categories) {
    this.categories = categories;
  }


  public CatalogAdminsDiscountTarget excludedCategoriesOperator(String excludedCategoriesOperator) {
    
    this.excludedCategoriesOperator = excludedCategoriesOperator;
    return this;
  }

   /**
   * Applies to Included categories  Defaults to Any
   * @return excludedCategoriesOperator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Applies to Included categories  Defaults to Any")

  public String getExcludedCategoriesOperator() {
    return excludedCategoriesOperator;
  }


  public void setExcludedCategoriesOperator(String excludedCategoriesOperator) {
    this.excludedCategoriesOperator = excludedCategoriesOperator;
  }


  public CatalogAdminsDiscountTarget excludedCategories(List<TargetedCategory> excludedCategories) {
    
    this.excludedCategories = excludedCategories;
    return this;
  }

  public CatalogAdminsDiscountTarget addExcludedCategoriesItem(TargetedCategory excludedCategoriesItem) {
    if (this.excludedCategories == null) {
      this.excludedCategories = new ArrayList<>();
    }
    this.excludedCategories.add(excludedCategoriesItem);
    return this;
  }

   /**
   * List of categories to exclude from the discount. Useful to exclude specific child categories.
   * @return excludedCategories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of categories to exclude from the discount. Useful to exclude specific child categories.")

  public List<TargetedCategory> getExcludedCategories() {
    return excludedCategories;
  }


  public void setExcludedCategories(List<TargetedCategory> excludedCategories) {
    this.excludedCategories = excludedCategories;
  }


  public CatalogAdminsDiscountTarget products(List<TargetedProduct> products) {
    
    this.products = products;
    return this;
  }

  public CatalogAdminsDiscountTarget addProductsItem(TargetedProduct productsItem) {
    if (this.products == null) {
      this.products = new ArrayList<>();
    }
    this.products.add(productsItem);
    return this;
  }

   /**
   * List of products that are eligible for the discount.
   * @return products
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of products that are eligible for the discount.")

  public List<TargetedProduct> getProducts() {
    return products;
  }


  public void setProducts(List<TargetedProduct> products) {
    this.products = products;
  }


  public CatalogAdminsDiscountTarget excludedProducts(List<TargetedProduct> excludedProducts) {
    
    this.excludedProducts = excludedProducts;
    return this;
  }

  public CatalogAdminsDiscountTarget addExcludedProductsItem(TargetedProduct excludedProductsItem) {
    if (this.excludedProducts == null) {
      this.excludedProducts = new ArrayList<>();
    }
    this.excludedProducts.add(excludedProductsItem);
    return this;
  }

   /**
   * List of products that are excluded from the discount.
   * @return excludedProducts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of products that are excluded from the discount.")

  public List<TargetedProduct> getExcludedProducts() {
    return excludedProducts;
  }


  public void setExcludedProducts(List<TargetedProduct> excludedProducts) {
    this.excludedProducts = excludedProducts;
  }


  public CatalogAdminsDiscountTarget excludeItemsWithExistingShippingDiscounts(Boolean excludeItemsWithExistingShippingDiscounts) {
    
    this.excludeItemsWithExistingShippingDiscounts = excludeItemsWithExistingShippingDiscounts;
    return this;
  }

   /**
   * Prevents order scoped discounts from layering over items that already have a shipping discount with the   same type.
   * @return excludeItemsWithExistingShippingDiscounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Prevents order scoped discounts from layering over items that already have a shipping discount with the   same type.")

  public Boolean getExcludeItemsWithExistingShippingDiscounts() {
    return excludeItemsWithExistingShippingDiscounts;
  }


  public void setExcludeItemsWithExistingShippingDiscounts(Boolean excludeItemsWithExistingShippingDiscounts) {
    this.excludeItemsWithExistingShippingDiscounts = excludeItemsWithExistingShippingDiscounts;
  }


  public CatalogAdminsDiscountTarget excludeItemsWithExistingProductDiscounts(Boolean excludeItemsWithExistingProductDiscounts) {
    
    this.excludeItemsWithExistingProductDiscounts = excludeItemsWithExistingProductDiscounts;
    return this;
  }

   /**
   * Prevents order scoped discounts from layering over items that already have a product discount with the   same type.
   * @return excludeItemsWithExistingProductDiscounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Prevents order scoped discounts from layering over items that already have a product discount with the   same type.")

  public Boolean getExcludeItemsWithExistingProductDiscounts() {
    return excludeItemsWithExistingProductDiscounts;
  }


  public void setExcludeItemsWithExistingProductDiscounts(Boolean excludeItemsWithExistingProductDiscounts) {
    this.excludeItemsWithExistingProductDiscounts = excludeItemsWithExistingProductDiscounts;
  }


  public CatalogAdminsDiscountTarget shippingMethods(List<TargetedShippingMethod> shippingMethods) {
    
    this.shippingMethods = shippingMethods;
    return this;
  }

  public CatalogAdminsDiscountTarget addShippingMethodsItem(TargetedShippingMethod shippingMethodsItem) {
    if (this.shippingMethods == null) {
      this.shippingMethods = new ArrayList<>();
    }
    this.shippingMethods.add(shippingMethodsItem);
    return this;
  }

   /**
   * Shipping method that is eligible for shipping discounts. This is a shipping method defined in Shipping Settings.
   * @return shippingMethods
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Shipping method that is eligible for shipping discounts. This is a shipping method defined in Shipping Settings.")

  public List<TargetedShippingMethod> getShippingMethods() {
    return shippingMethods;
  }


  public void setShippingMethods(List<TargetedShippingMethod> shippingMethods) {
    this.shippingMethods = shippingMethods;
  }


  public CatalogAdminsDiscountTarget shippingZones(List<TargetedShippingZone> shippingZones) {
    
    this.shippingZones = shippingZones;
    return this;
  }

  public CatalogAdminsDiscountTarget addShippingZonesItem(TargetedShippingZone shippingZonesItem) {
    if (this.shippingZones == null) {
      this.shippingZones = new ArrayList<>();
    }
    this.shippingZones.add(shippingZonesItem);
    return this;
  }

   /**
   * Shipping Zones that are applicable for this discount
   * @return shippingZones
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Shipping Zones that are applicable for this discount")

  public List<TargetedShippingZone> getShippingZones() {
    return shippingZones;
  }


  public void setShippingZones(List<TargetedShippingZone> shippingZones) {
    this.shippingZones = shippingZones;
  }


  public CatalogAdminsDiscountTarget doNotApplyToHandlingFees(Boolean doNotApplyToHandlingFees) {
    
    this.doNotApplyToHandlingFees = doNotApplyToHandlingFees;
    return this;
  }

   /**
   * Prevents the discount from being applied to handling fees
   * @return doNotApplyToHandlingFees
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Prevents the discount from being applied to handling fees")

  public Boolean getDoNotApplyToHandlingFees() {
    return doNotApplyToHandlingFees;
  }


  public void setDoNotApplyToHandlingFees(Boolean doNotApplyToHandlingFees) {
    this.doNotApplyToHandlingFees = doNotApplyToHandlingFees;
  }


  public CatalogAdminsDiscountTarget maximumQuantityPerRedemption(Integer maximumQuantityPerRedemption) {
    
    this.maximumQuantityPerRedemption = maximumQuantityPerRedemption;
    return this;
  }

   /**
   * When a condition is specified, this property limits the number of items that can be targeted per discount redemption with an order.  if multiple redemptions are allowed per order then multiples of this value would be allowed in multiples of the associated   condition.  If no condition is specified then this value is not used.    If null and condition exists, then defaults to 1.
   * @return maximumQuantityPerRedemption
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When a condition is specified, this property limits the number of items that can be targeted per discount redemption with an order.  if multiple redemptions are allowed per order then multiples of this value would be allowed in multiples of the associated   condition.  If no condition is specified then this value is not used.    If null and condition exists, then defaults to 1.")

  public Integer getMaximumQuantityPerRedemption() {
    return maximumQuantityPerRedemption;
  }


  public void setMaximumQuantityPerRedemption(Integer maximumQuantityPerRedemption) {
    this.maximumQuantityPerRedemption = maximumQuantityPerRedemption;
  }


  public CatalogAdminsDiscountTarget appliesToLeastExpensiveProductsFirst(Boolean appliesToLeastExpensiveProductsFirst) {
    
    this.appliesToLeastExpensiveProductsFirst = appliesToLeastExpensiveProductsFirst;
    return this;
  }

   /**
   * Determines which way the discount is optimized.  Consumers favor(default - false/null) or tenants favor (when this is set to true)  Applies to discounts where target is not a specific product or list of products.    May also impact behavior of Buy X Get Y so that X is the most expensive items and Y the least expensive.
   * @return appliesToLeastExpensiveProductsFirst
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines which way the discount is optimized.  Consumers favor(default - false/null) or tenants favor (when this is set to true)  Applies to discounts where target is not a specific product or list of products.    May also impact behavior of Buy X Get Y so that X is the most expensive items and Y the least expensive.")

  public Boolean getAppliesToLeastExpensiveProductsFirst() {
    return appliesToLeastExpensiveProductsFirst;
  }


  public void setAppliesToLeastExpensiveProductsFirst(Boolean appliesToLeastExpensiveProductsFirst) {
    this.appliesToLeastExpensiveProductsFirst = appliesToLeastExpensiveProductsFirst;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogAdminsDiscountTarget catalogAdminsDiscountTarget = (CatalogAdminsDiscountTarget) o;
    return Objects.equals(this.type, catalogAdminsDiscountTarget.type) &&
        Objects.equals(this.includeAllProducts, catalogAdminsDiscountTarget.includeAllProducts) &&
        Objects.equals(this.includedCategoriesOperator, catalogAdminsDiscountTarget.includedCategoriesOperator) &&
        Objects.equals(this.categories, catalogAdminsDiscountTarget.categories) &&
        Objects.equals(this.excludedCategoriesOperator, catalogAdminsDiscountTarget.excludedCategoriesOperator) &&
        Objects.equals(this.excludedCategories, catalogAdminsDiscountTarget.excludedCategories) &&
        Objects.equals(this.products, catalogAdminsDiscountTarget.products) &&
        Objects.equals(this.excludedProducts, catalogAdminsDiscountTarget.excludedProducts) &&
        Objects.equals(this.excludeItemsWithExistingShippingDiscounts, catalogAdminsDiscountTarget.excludeItemsWithExistingShippingDiscounts) &&
        Objects.equals(this.excludeItemsWithExistingProductDiscounts, catalogAdminsDiscountTarget.excludeItemsWithExistingProductDiscounts) &&
        Objects.equals(this.shippingMethods, catalogAdminsDiscountTarget.shippingMethods) &&
        Objects.equals(this.shippingZones, catalogAdminsDiscountTarget.shippingZones) &&
        Objects.equals(this.doNotApplyToHandlingFees, catalogAdminsDiscountTarget.doNotApplyToHandlingFees) &&
        Objects.equals(this.maximumQuantityPerRedemption, catalogAdminsDiscountTarget.maximumQuantityPerRedemption) &&
        Objects.equals(this.appliesToLeastExpensiveProductsFirst, catalogAdminsDiscountTarget.appliesToLeastExpensiveProductsFirst);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, includeAllProducts, includedCategoriesOperator, categories, excludedCategoriesOperator, excludedCategories, products, excludedProducts, excludeItemsWithExistingShippingDiscounts, excludeItemsWithExistingProductDiscounts, shippingMethods, shippingZones, doNotApplyToHandlingFees, maximumQuantityPerRedemption, appliesToLeastExpensiveProductsFirst);
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
    sb.append("class CatalogAdminsDiscountTarget {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    includeAllProducts: ").append(toIndentedString(includeAllProducts)).append("\n");
    sb.append("    includedCategoriesOperator: ").append(toIndentedString(includedCategoriesOperator)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    excludedCategoriesOperator: ").append(toIndentedString(excludedCategoriesOperator)).append("\n");
    sb.append("    excludedCategories: ").append(toIndentedString(excludedCategories)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
    sb.append("    excludedProducts: ").append(toIndentedString(excludedProducts)).append("\n");
    sb.append("    excludeItemsWithExistingShippingDiscounts: ").append(toIndentedString(excludeItemsWithExistingShippingDiscounts)).append("\n");
    sb.append("    excludeItemsWithExistingProductDiscounts: ").append(toIndentedString(excludeItemsWithExistingProductDiscounts)).append("\n");
    sb.append("    shippingMethods: ").append(toIndentedString(shippingMethods)).append("\n");
    sb.append("    shippingZones: ").append(toIndentedString(shippingZones)).append("\n");
    sb.append("    doNotApplyToHandlingFees: ").append(toIndentedString(doNotApplyToHandlingFees)).append("\n");
    sb.append("    maximumQuantityPerRedemption: ").append(toIndentedString(maximumQuantityPerRedemption)).append("\n");
    sb.append("    appliesToLeastExpensiveProductsFirst: ").append(toIndentedString(appliesToLeastExpensiveProductsFirst)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("includeAllProducts");
    openapiFields.add("includedCategoriesOperator");
    openapiFields.add("categories");
    openapiFields.add("excludedCategoriesOperator");
    openapiFields.add("excludedCategories");
    openapiFields.add("products");
    openapiFields.add("excludedProducts");
    openapiFields.add("excludeItemsWithExistingShippingDiscounts");
    openapiFields.add("excludeItemsWithExistingProductDiscounts");
    openapiFields.add("shippingMethods");
    openapiFields.add("shippingZones");
    openapiFields.add("doNotApplyToHandlingFees");
    openapiFields.add("maximumQuantityPerRedemption");
    openapiFields.add("appliesToLeastExpensiveProductsFirst");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CatalogAdminsDiscountTarget
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CatalogAdminsDiscountTarget.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CatalogAdminsDiscountTarget is not found in the empty JSON string", CatalogAdminsDiscountTarget.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!CatalogAdminsDiscountTarget.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CatalogAdminsDiscountTarget` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CatalogAdminsDiscountTarget.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("includedCategoriesOperator") != null && !jsonObj.get("includedCategoriesOperator").isJsonNull()) && !jsonObj.get("includedCategoriesOperator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `includedCategoriesOperator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("includedCategoriesOperator").toString()));
      }
      if (jsonObj.get("categories") != null && !jsonObj.get("categories").isJsonNull()) {
        JsonArray jsonArraycategories = jsonObj.getAsJsonArray("categories");
        if (jsonArraycategories != null) {
          // ensure the json data is an array
          if (!jsonObj.get("categories").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `categories` to be an array in the JSON string but got `%s`", jsonObj.get("categories").toString()));
          }

          // validate the optional field `categories` (array)
          for (int i = 0; i < jsonArraycategories.size(); i++) {
            TargetedCategory.validateJsonObject(jsonArraycategories.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("excludedCategoriesOperator") != null && !jsonObj.get("excludedCategoriesOperator").isJsonNull()) && !jsonObj.get("excludedCategoriesOperator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `excludedCategoriesOperator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("excludedCategoriesOperator").toString()));
      }
      if (jsonObj.get("excludedCategories") != null && !jsonObj.get("excludedCategories").isJsonNull()) {
        JsonArray jsonArrayexcludedCategories = jsonObj.getAsJsonArray("excludedCategories");
        if (jsonArrayexcludedCategories != null) {
          // ensure the json data is an array
          if (!jsonObj.get("excludedCategories").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `excludedCategories` to be an array in the JSON string but got `%s`", jsonObj.get("excludedCategories").toString()));
          }

          // validate the optional field `excludedCategories` (array)
          for (int i = 0; i < jsonArrayexcludedCategories.size(); i++) {
            TargetedCategory.validateJsonObject(jsonArrayexcludedCategories.get(i).getAsJsonObject());
          };
        }
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
            TargetedProduct.validateJsonObject(jsonArrayproducts.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("excludedProducts") != null && !jsonObj.get("excludedProducts").isJsonNull()) {
        JsonArray jsonArrayexcludedProducts = jsonObj.getAsJsonArray("excludedProducts");
        if (jsonArrayexcludedProducts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("excludedProducts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `excludedProducts` to be an array in the JSON string but got `%s`", jsonObj.get("excludedProducts").toString()));
          }

          // validate the optional field `excludedProducts` (array)
          for (int i = 0; i < jsonArrayexcludedProducts.size(); i++) {
            TargetedProduct.validateJsonObject(jsonArrayexcludedProducts.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("shippingMethods") != null && !jsonObj.get("shippingMethods").isJsonNull()) {
        JsonArray jsonArrayshippingMethods = jsonObj.getAsJsonArray("shippingMethods");
        if (jsonArrayshippingMethods != null) {
          // ensure the json data is an array
          if (!jsonObj.get("shippingMethods").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `shippingMethods` to be an array in the JSON string but got `%s`", jsonObj.get("shippingMethods").toString()));
          }

          // validate the optional field `shippingMethods` (array)
          for (int i = 0; i < jsonArrayshippingMethods.size(); i++) {
            TargetedShippingMethod.validateJsonObject(jsonArrayshippingMethods.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("shippingZones") != null && !jsonObj.get("shippingZones").isJsonNull()) {
        JsonArray jsonArrayshippingZones = jsonObj.getAsJsonArray("shippingZones");
        if (jsonArrayshippingZones != null) {
          // ensure the json data is an array
          if (!jsonObj.get("shippingZones").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `shippingZones` to be an array in the JSON string but got `%s`", jsonObj.get("shippingZones").toString()));
          }

          // validate the optional field `shippingZones` (array)
          for (int i = 0; i < jsonArrayshippingZones.size(); i++) {
            TargetedShippingZone.validateJsonObject(jsonArrayshippingZones.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CatalogAdminsDiscountTarget.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CatalogAdminsDiscountTarget' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CatalogAdminsDiscountTarget> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CatalogAdminsDiscountTarget.class));

       return (TypeAdapter<T>) new TypeAdapter<CatalogAdminsDiscountTarget>() {
           @Override
           public void write(JsonWriter out, CatalogAdminsDiscountTarget value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CatalogAdminsDiscountTarget read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CatalogAdminsDiscountTarget given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CatalogAdminsDiscountTarget
  * @throws IOException if the JSON string is invalid with respect to CatalogAdminsDiscountTarget
  */
  public static CatalogAdminsDiscountTarget fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CatalogAdminsDiscountTarget.class);
  }

 /**
  * Convert an instance of CatalogAdminsDiscountTarget to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

