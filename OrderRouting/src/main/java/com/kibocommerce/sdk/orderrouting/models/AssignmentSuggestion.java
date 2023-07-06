/*
 * Api Documentation
 * Api Documentation
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.orderrouting.models;

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
 * AssignmentSuggestion
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AssignmentSuggestion implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_FUTURE_DATE = "futureDate";
  @SerializedName(SERIALIZED_NAME_FUTURE_DATE)
  private OffsetDateTime futureDate;

  public static final String SERIALIZED_NAME_FUTURE_DATE_STRING = "futureDateString";
  @SerializedName(SERIALIZED_NAME_FUTURE_DATE_STRING)
  private String futureDateString;

  public static final String SERIALIZED_NAME_LOCATION_CODE = "locationCode";
  @SerializedName(SERIALIZED_NAME_LOCATION_CODE)
  private String locationCode;

  public static final String SERIALIZED_NAME_LOCATION_I_D = "locationID";
  @SerializedName(SERIALIZED_NAME_LOCATION_I_D)
  private Integer locationID;

  public static final String SERIALIZED_NAME_ORDER_ITEM_I_D = "orderItemID";
  @SerializedName(SERIALIZED_NAME_ORDER_ITEM_I_D)
  private Integer orderItemID;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity;

  /**
   * Gets or Sets route
   */
  @JsonAdapter(RouteEnum.Adapter.class)
  public enum RouteEnum {
    DIRECTSHIP("DIRECTSHIP"),
    
    TRANSFER("TRANSFER"),
    
    STH_CONSOLIDATED("STH_CONSOLIDATED");

    private String value;

    RouteEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RouteEnum fromValue(String value) {
      for (RouteEnum b : RouteEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RouteEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RouteEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RouteEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RouteEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ROUTE = "route";
  @SerializedName(SERIALIZED_NAME_ROUTE)
  private RouteEnum route;

  public AssignmentSuggestion() {
  }

  public AssignmentSuggestion futureDate(OffsetDateTime futureDate) {
    
    this.futureDate = futureDate;
    return this;
  }

   /**
   * Get futureDate
   * @return futureDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getFutureDate() {
    return futureDate;
  }


  public void setFutureDate(OffsetDateTime futureDate) {
    this.futureDate = futureDate;
  }


  public AssignmentSuggestion futureDateString(String futureDateString) {
    
    this.futureDateString = futureDateString;
    return this;
  }

   /**
   * Get futureDateString
   * @return futureDateString
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFutureDateString() {
    return futureDateString;
  }


  public void setFutureDateString(String futureDateString) {
    this.futureDateString = futureDateString;
  }


  public AssignmentSuggestion locationCode(String locationCode) {
    
    this.locationCode = locationCode;
    return this;
  }

   /**
   * Get locationCode
   * @return locationCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocationCode() {
    return locationCode;
  }


  public void setLocationCode(String locationCode) {
    this.locationCode = locationCode;
  }


  public AssignmentSuggestion locationID(Integer locationID) {
    
    this.locationID = locationID;
    return this;
  }

   /**
   * Get locationID
   * @return locationID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLocationID() {
    return locationID;
  }


  public void setLocationID(Integer locationID) {
    this.locationID = locationID;
  }


  public AssignmentSuggestion orderItemID(Integer orderItemID) {
    
    this.orderItemID = orderItemID;
    return this;
  }

   /**
   * Get orderItemID
   * @return orderItemID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getOrderItemID() {
    return orderItemID;
  }


  public void setOrderItemID(Integer orderItemID) {
    this.orderItemID = orderItemID;
  }


  public AssignmentSuggestion quantity(Integer quantity) {
    
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


  public AssignmentSuggestion route(RouteEnum route) {
    
    this.route = route;
    return this;
  }

   /**
   * Get route
   * @return route
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RouteEnum getRoute() {
    return route;
  }


  public void setRoute(RouteEnum route) {
    this.route = route;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssignmentSuggestion assignmentSuggestion = (AssignmentSuggestion) o;
    return Objects.equals(this.futureDate, assignmentSuggestion.futureDate) &&
        Objects.equals(this.futureDateString, assignmentSuggestion.futureDateString) &&
        Objects.equals(this.locationCode, assignmentSuggestion.locationCode) &&
        Objects.equals(this.locationID, assignmentSuggestion.locationID) &&
        Objects.equals(this.orderItemID, assignmentSuggestion.orderItemID) &&
        Objects.equals(this.quantity, assignmentSuggestion.quantity) &&
        Objects.equals(this.route, assignmentSuggestion.route);
  }

  @Override
  public int hashCode() {
    return Objects.hash(futureDate, futureDateString, locationCode, locationID, orderItemID, quantity, route);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssignmentSuggestion {\n");
    sb.append("    futureDate: ").append(toIndentedString(futureDate)).append("\n");
    sb.append("    futureDateString: ").append(toIndentedString(futureDateString)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    locationID: ").append(toIndentedString(locationID)).append("\n");
    sb.append("    orderItemID: ").append(toIndentedString(orderItemID)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    route: ").append(toIndentedString(route)).append("\n");
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
    openapiFields.add("futureDate");
    openapiFields.add("futureDateString");
    openapiFields.add("locationCode");
    openapiFields.add("locationID");
    openapiFields.add("orderItemID");
    openapiFields.add("quantity");
    openapiFields.add("route");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AssignmentSuggestion
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AssignmentSuggestion.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AssignmentSuggestion is not found in the empty JSON string", AssignmentSuggestion.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!AssignmentSuggestion.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AssignmentSuggestion` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("futureDateString") != null && !jsonObj.get("futureDateString").isJsonNull()) && !jsonObj.get("futureDateString").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `futureDateString` to be a primitive type in the JSON string but got `%s`", jsonObj.get("futureDateString").toString()));
      }
      if ((jsonObj.get("locationCode") != null && !jsonObj.get("locationCode").isJsonNull()) && !jsonObj.get("locationCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locationCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locationCode").toString()));
      }
      if ((jsonObj.get("route") != null && !jsonObj.get("route").isJsonNull()) && !jsonObj.get("route").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `route` to be a primitive type in the JSON string but got `%s`", jsonObj.get("route").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AssignmentSuggestion.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AssignmentSuggestion' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AssignmentSuggestion> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AssignmentSuggestion.class));

       return (TypeAdapter<T>) new TypeAdapter<AssignmentSuggestion>() {
           @Override
           public void write(JsonWriter out, AssignmentSuggestion value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AssignmentSuggestion read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AssignmentSuggestion given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AssignmentSuggestion
  * @throws IOException if the JSON string is invalid with respect to AssignmentSuggestion
  */
  public static AssignmentSuggestion fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AssignmentSuggestion.class);
  }

 /**
  * Convert an instance of AssignmentSuggestion to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

