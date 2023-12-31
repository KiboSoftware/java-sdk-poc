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
import com.kibocommerce.sdk.orderrouting.models.AbstractFilter;
import com.kibocommerce.sdk.orderrouting.models.FulfillmentLimit;
import com.kibocommerce.sdk.orderrouting.models.GroupAfterAction;
import com.kibocommerce.sdk.orderrouting.models.LocationSort;
import com.kibocommerce.sdk.orderrouting.models.RankedLocation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * ApiDocumentationLocationGroup
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ApiDocumentationLocationGroup implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_AFTER_ACTION_NONE = "afterActionNone";
  @SerializedName(SERIALIZED_NAME_AFTER_ACTION_NONE)
  private GroupAfterAction afterActionNone;

  public static final String SERIALIZED_NAME_AFTER_ACTION_PARTIAL = "afterActionPartial";
  @SerializedName(SERIALIZED_NAME_AFTER_ACTION_PARTIAL)
  private GroupAfterAction afterActionPartial;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_CREATOR_USERNAME = "creatorUsername";
  @SerializedName(SERIALIZED_NAME_CREATOR_USERNAME)
  private String creatorUsername;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ENVIRONMENT_I_D = "environmentID";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT_I_D)
  private Integer environmentID;

  public static final String SERIALIZED_NAME_EXCLUDED_LOCATIONS_FROM_DEFAULT_GROUP = "excludedLocationsFromDefaultGroup";
  @SerializedName(SERIALIZED_NAME_EXCLUDED_LOCATIONS_FROM_DEFAULT_GROUP)
  private List<Integer> excludedLocationsFromDefaultGroup = null;

  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private List<AbstractFilter> filters = null;

  public static final String SERIALIZED_NAME_FULFILLMENT_LIMIT = "fulfillmentLimit";
  @SerializedName(SERIALIZED_NAME_FULFILLMENT_LIMIT)
  private FulfillmentLimit fulfillmentLimit;

  public static final String SERIALIZED_NAME_GROUP_I_D = "groupID";
  @SerializedName(SERIALIZED_NAME_GROUP_I_D)
  private Integer groupID;

  public static final String SERIALIZED_NAME_IS_DEFAULT_GROUP = "isDefaultGroup";
  @SerializedName(SERIALIZED_NAME_IS_DEFAULT_GROUP)
  private Boolean isDefaultGroup;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PATH_STRING = "pathString";
  @SerializedName(SERIALIZED_NAME_PATH_STRING)
  private String pathString;

  public static final String SERIALIZED_NAME_PERSISTED = "persisted";
  @SerializedName(SERIALIZED_NAME_PERSISTED)
  private Boolean persisted;

  public static final String SERIALIZED_NAME_RANK = "rank";
  @SerializedName(SERIALIZED_NAME_RANK)
  private Integer rank;

  public static final String SERIALIZED_NAME_RANKED_LOCATIONS = "rankedLocations";
  @SerializedName(SERIALIZED_NAME_RANKED_LOCATIONS)
  private List<RankedLocation> rankedLocations = null;

  public static final String SERIALIZED_NAME_SITE_I_D = "siteID";
  @SerializedName(SERIALIZED_NAME_SITE_I_D)
  private Integer siteID;

  public static final String SERIALIZED_NAME_SORTS = "sorts";
  @SerializedName(SERIALIZED_NAME_SORTS)
  private List<LocationSort> sorts = null;

  public static final String SERIALIZED_NAME_TENANT_I_D = "tenantID";
  @SerializedName(SERIALIZED_NAME_TENANT_I_D)
  private Integer tenantID;

  public static final String SERIALIZED_NAME_UPDATED = "updated";
  @SerializedName(SERIALIZED_NAME_UPDATED)
  private OffsetDateTime updated;

  public static final String SERIALIZED_NAME_UPDATER_USERNAME = "updaterUsername";
  @SerializedName(SERIALIZED_NAME_UPDATER_USERNAME)
  private String updaterUsername;

  public static final String SERIALIZED_NAME_USE_RETAILER_EXCLUSION_LIST = "useRetailerExclusionList";
  @SerializedName(SERIALIZED_NAME_USE_RETAILER_EXCLUSION_LIST)
  private Boolean useRetailerExclusionList;

  public ApiDocumentationLocationGroup() {
  }

  public ApiDocumentationLocationGroup active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public ApiDocumentationLocationGroup afterActionNone(GroupAfterAction afterActionNone) {
    
    this.afterActionNone = afterActionNone;
    return this;
  }

   /**
   * Get afterActionNone
   * @return afterActionNone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GroupAfterAction getAfterActionNone() {
    return afterActionNone;
  }


  public void setAfterActionNone(GroupAfterAction afterActionNone) {
    this.afterActionNone = afterActionNone;
  }


  public ApiDocumentationLocationGroup afterActionPartial(GroupAfterAction afterActionPartial) {
    
    this.afterActionPartial = afterActionPartial;
    return this;
  }

   /**
   * Get afterActionPartial
   * @return afterActionPartial
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GroupAfterAction getAfterActionPartial() {
    return afterActionPartial;
  }


  public void setAfterActionPartial(GroupAfterAction afterActionPartial) {
    this.afterActionPartial = afterActionPartial;
  }


  public ApiDocumentationLocationGroup created(OffsetDateTime created) {
    
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreated() {
    return created;
  }


  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public ApiDocumentationLocationGroup creatorUsername(String creatorUsername) {
    
    this.creatorUsername = creatorUsername;
    return this;
  }

   /**
   * Get creatorUsername
   * @return creatorUsername
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCreatorUsername() {
    return creatorUsername;
  }


  public void setCreatorUsername(String creatorUsername) {
    this.creatorUsername = creatorUsername;
  }


  public ApiDocumentationLocationGroup description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ApiDocumentationLocationGroup environmentID(Integer environmentID) {
    
    this.environmentID = environmentID;
    return this;
  }

   /**
   * Get environmentID
   * @return environmentID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getEnvironmentID() {
    return environmentID;
  }


  public void setEnvironmentID(Integer environmentID) {
    this.environmentID = environmentID;
  }


  public ApiDocumentationLocationGroup excludedLocationsFromDefaultGroup(List<Integer> excludedLocationsFromDefaultGroup) {
    
    this.excludedLocationsFromDefaultGroup = excludedLocationsFromDefaultGroup;
    return this;
  }

  public ApiDocumentationLocationGroup addExcludedLocationsFromDefaultGroupItem(Integer excludedLocationsFromDefaultGroupItem) {
    if (this.excludedLocationsFromDefaultGroup == null) {
      this.excludedLocationsFromDefaultGroup = new ArrayList<>();
    }
    this.excludedLocationsFromDefaultGroup.add(excludedLocationsFromDefaultGroupItem);
    return this;
  }

   /**
   * Get excludedLocationsFromDefaultGroup
   * @return excludedLocationsFromDefaultGroup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getExcludedLocationsFromDefaultGroup() {
    return excludedLocationsFromDefaultGroup;
  }


  public void setExcludedLocationsFromDefaultGroup(List<Integer> excludedLocationsFromDefaultGroup) {
    this.excludedLocationsFromDefaultGroup = excludedLocationsFromDefaultGroup;
  }


  public ApiDocumentationLocationGroup filters(List<AbstractFilter> filters) {
    
    this.filters = filters;
    return this;
  }

  public ApiDocumentationLocationGroup addFiltersItem(AbstractFilter filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<>();
    }
    this.filters.add(filtersItem);
    return this;
  }

   /**
   * Get filters
   * @return filters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AbstractFilter> getFilters() {
    return filters;
  }


  public void setFilters(List<AbstractFilter> filters) {
    this.filters = filters;
  }


  public ApiDocumentationLocationGroup fulfillmentLimit(FulfillmentLimit fulfillmentLimit) {
    
    this.fulfillmentLimit = fulfillmentLimit;
    return this;
  }

   /**
   * Get fulfillmentLimit
   * @return fulfillmentLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FulfillmentLimit getFulfillmentLimit() {
    return fulfillmentLimit;
  }


  public void setFulfillmentLimit(FulfillmentLimit fulfillmentLimit) {
    this.fulfillmentLimit = fulfillmentLimit;
  }


  public ApiDocumentationLocationGroup groupID(Integer groupID) {
    
    this.groupID = groupID;
    return this;
  }

   /**
   * Get groupID
   * @return groupID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getGroupID() {
    return groupID;
  }


  public void setGroupID(Integer groupID) {
    this.groupID = groupID;
  }


  public ApiDocumentationLocationGroup isDefaultGroup(Boolean isDefaultGroup) {
    
    this.isDefaultGroup = isDefaultGroup;
    return this;
  }

   /**
   * Get isDefaultGroup
   * @return isDefaultGroup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsDefaultGroup() {
    return isDefaultGroup;
  }


  public void setIsDefaultGroup(Boolean isDefaultGroup) {
    this.isDefaultGroup = isDefaultGroup;
  }


  public ApiDocumentationLocationGroup name(String name) {
    
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


  public ApiDocumentationLocationGroup pathString(String pathString) {
    
    this.pathString = pathString;
    return this;
  }

   /**
   * Get pathString
   * @return pathString
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPathString() {
    return pathString;
  }


  public void setPathString(String pathString) {
    this.pathString = pathString;
  }


  public ApiDocumentationLocationGroup persisted(Boolean persisted) {
    
    this.persisted = persisted;
    return this;
  }

   /**
   * Get persisted
   * @return persisted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getPersisted() {
    return persisted;
  }


  public void setPersisted(Boolean persisted) {
    this.persisted = persisted;
  }


  public ApiDocumentationLocationGroup rank(Integer rank) {
    
    this.rank = rank;
    return this;
  }

   /**
   * Get rank
   * @return rank
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getRank() {
    return rank;
  }


  public void setRank(Integer rank) {
    this.rank = rank;
  }


  public ApiDocumentationLocationGroup rankedLocations(List<RankedLocation> rankedLocations) {
    
    this.rankedLocations = rankedLocations;
    return this;
  }

  public ApiDocumentationLocationGroup addRankedLocationsItem(RankedLocation rankedLocationsItem) {
    if (this.rankedLocations == null) {
      this.rankedLocations = new ArrayList<>();
    }
    this.rankedLocations.add(rankedLocationsItem);
    return this;
  }

   /**
   * Get rankedLocations
   * @return rankedLocations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<RankedLocation> getRankedLocations() {
    return rankedLocations;
  }


  public void setRankedLocations(List<RankedLocation> rankedLocations) {
    this.rankedLocations = rankedLocations;
  }


  public ApiDocumentationLocationGroup siteID(Integer siteID) {
    
    this.siteID = siteID;
    return this;
  }

   /**
   * Get siteID
   * @return siteID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSiteID() {
    return siteID;
  }


  public void setSiteID(Integer siteID) {
    this.siteID = siteID;
  }


  public ApiDocumentationLocationGroup sorts(List<LocationSort> sorts) {
    
    this.sorts = sorts;
    return this;
  }

  public ApiDocumentationLocationGroup addSortsItem(LocationSort sortsItem) {
    if (this.sorts == null) {
      this.sorts = new ArrayList<>();
    }
    this.sorts.add(sortsItem);
    return this;
  }

   /**
   * Get sorts
   * @return sorts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<LocationSort> getSorts() {
    return sorts;
  }


  public void setSorts(List<LocationSort> sorts) {
    this.sorts = sorts;
  }


  public ApiDocumentationLocationGroup tenantID(Integer tenantID) {
    
    this.tenantID = tenantID;
    return this;
  }

   /**
   * Get tenantID
   * @return tenantID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTenantID() {
    return tenantID;
  }


  public void setTenantID(Integer tenantID) {
    this.tenantID = tenantID;
  }


  public ApiDocumentationLocationGroup updated(OffsetDateTime updated) {
    
    this.updated = updated;
    return this;
  }

   /**
   * Get updated
   * @return updated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getUpdated() {
    return updated;
  }


  public void setUpdated(OffsetDateTime updated) {
    this.updated = updated;
  }


  public ApiDocumentationLocationGroup updaterUsername(String updaterUsername) {
    
    this.updaterUsername = updaterUsername;
    return this;
  }

   /**
   * Get updaterUsername
   * @return updaterUsername
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUpdaterUsername() {
    return updaterUsername;
  }


  public void setUpdaterUsername(String updaterUsername) {
    this.updaterUsername = updaterUsername;
  }


  public ApiDocumentationLocationGroup useRetailerExclusionList(Boolean useRetailerExclusionList) {
    
    this.useRetailerExclusionList = useRetailerExclusionList;
    return this;
  }

   /**
   * Get useRetailerExclusionList
   * @return useRetailerExclusionList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getUseRetailerExclusionList() {
    return useRetailerExclusionList;
  }


  public void setUseRetailerExclusionList(Boolean useRetailerExclusionList) {
    this.useRetailerExclusionList = useRetailerExclusionList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiDocumentationLocationGroup apiDocumentationLocationGroup = (ApiDocumentationLocationGroup) o;
    return Objects.equals(this.active, apiDocumentationLocationGroup.active) &&
        Objects.equals(this.afterActionNone, apiDocumentationLocationGroup.afterActionNone) &&
        Objects.equals(this.afterActionPartial, apiDocumentationLocationGroup.afterActionPartial) &&
        Objects.equals(this.created, apiDocumentationLocationGroup.created) &&
        Objects.equals(this.creatorUsername, apiDocumentationLocationGroup.creatorUsername) &&
        Objects.equals(this.description, apiDocumentationLocationGroup.description) &&
        Objects.equals(this.environmentID, apiDocumentationLocationGroup.environmentID) &&
        Objects.equals(this.excludedLocationsFromDefaultGroup, apiDocumentationLocationGroup.excludedLocationsFromDefaultGroup) &&
        Objects.equals(this.filters, apiDocumentationLocationGroup.filters) &&
        Objects.equals(this.fulfillmentLimit, apiDocumentationLocationGroup.fulfillmentLimit) &&
        Objects.equals(this.groupID, apiDocumentationLocationGroup.groupID) &&
        Objects.equals(this.isDefaultGroup, apiDocumentationLocationGroup.isDefaultGroup) &&
        Objects.equals(this.name, apiDocumentationLocationGroup.name) &&
        Objects.equals(this.pathString, apiDocumentationLocationGroup.pathString) &&
        Objects.equals(this.persisted, apiDocumentationLocationGroup.persisted) &&
        Objects.equals(this.rank, apiDocumentationLocationGroup.rank) &&
        Objects.equals(this.rankedLocations, apiDocumentationLocationGroup.rankedLocations) &&
        Objects.equals(this.siteID, apiDocumentationLocationGroup.siteID) &&
        Objects.equals(this.sorts, apiDocumentationLocationGroup.sorts) &&
        Objects.equals(this.tenantID, apiDocumentationLocationGroup.tenantID) &&
        Objects.equals(this.updated, apiDocumentationLocationGroup.updated) &&
        Objects.equals(this.updaterUsername, apiDocumentationLocationGroup.updaterUsername) &&
        Objects.equals(this.useRetailerExclusionList, apiDocumentationLocationGroup.useRetailerExclusionList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, afterActionNone, afterActionPartial, created, creatorUsername, description, environmentID, excludedLocationsFromDefaultGroup, filters, fulfillmentLimit, groupID, isDefaultGroup, name, pathString, persisted, rank, rankedLocations, siteID, sorts, tenantID, updated, updaterUsername, useRetailerExclusionList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiDocumentationLocationGroup {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    afterActionNone: ").append(toIndentedString(afterActionNone)).append("\n");
    sb.append("    afterActionPartial: ").append(toIndentedString(afterActionPartial)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    creatorUsername: ").append(toIndentedString(creatorUsername)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    environmentID: ").append(toIndentedString(environmentID)).append("\n");
    sb.append("    excludedLocationsFromDefaultGroup: ").append(toIndentedString(excludedLocationsFromDefaultGroup)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    fulfillmentLimit: ").append(toIndentedString(fulfillmentLimit)).append("\n");
    sb.append("    groupID: ").append(toIndentedString(groupID)).append("\n");
    sb.append("    isDefaultGroup: ").append(toIndentedString(isDefaultGroup)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pathString: ").append(toIndentedString(pathString)).append("\n");
    sb.append("    persisted: ").append(toIndentedString(persisted)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
    sb.append("    rankedLocations: ").append(toIndentedString(rankedLocations)).append("\n");
    sb.append("    siteID: ").append(toIndentedString(siteID)).append("\n");
    sb.append("    sorts: ").append(toIndentedString(sorts)).append("\n");
    sb.append("    tenantID: ").append(toIndentedString(tenantID)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    updaterUsername: ").append(toIndentedString(updaterUsername)).append("\n");
    sb.append("    useRetailerExclusionList: ").append(toIndentedString(useRetailerExclusionList)).append("\n");
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
    openapiFields.add("active");
    openapiFields.add("afterActionNone");
    openapiFields.add("afterActionPartial");
    openapiFields.add("created");
    openapiFields.add("creatorUsername");
    openapiFields.add("description");
    openapiFields.add("environmentID");
    openapiFields.add("excludedLocationsFromDefaultGroup");
    openapiFields.add("filters");
    openapiFields.add("fulfillmentLimit");
    openapiFields.add("groupID");
    openapiFields.add("isDefaultGroup");
    openapiFields.add("name");
    openapiFields.add("pathString");
    openapiFields.add("persisted");
    openapiFields.add("rank");
    openapiFields.add("rankedLocations");
    openapiFields.add("siteID");
    openapiFields.add("sorts");
    openapiFields.add("tenantID");
    openapiFields.add("updated");
    openapiFields.add("updaterUsername");
    openapiFields.add("useRetailerExclusionList");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ApiDocumentationLocationGroup
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ApiDocumentationLocationGroup.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiDocumentationLocationGroup is not found in the empty JSON string", ApiDocumentationLocationGroup.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!ApiDocumentationLocationGroup.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiDocumentationLocationGroup` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      // validate the optional field `afterActionNone`
      if (jsonObj.get("afterActionNone") != null && !jsonObj.get("afterActionNone").isJsonNull()) {
        GroupAfterAction.validateJsonObject(jsonObj.getAsJsonObject("afterActionNone"));
      }
      // validate the optional field `afterActionPartial`
      if (jsonObj.get("afterActionPartial") != null && !jsonObj.get("afterActionPartial").isJsonNull()) {
        GroupAfterAction.validateJsonObject(jsonObj.getAsJsonObject("afterActionPartial"));
      }
      if ((jsonObj.get("creatorUsername") != null && !jsonObj.get("creatorUsername").isJsonNull()) && !jsonObj.get("creatorUsername").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `creatorUsername` to be a primitive type in the JSON string but got `%s`", jsonObj.get("creatorUsername").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("excludedLocationsFromDefaultGroup").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `excludedLocationsFromDefaultGroup` to be an array in the JSON string but got `%s`", jsonObj.get("excludedLocationsFromDefaultGroup").toString()));
      }
      if (jsonObj.get("filters") != null && !jsonObj.get("filters").isJsonNull()) {
        JsonArray jsonArrayfilters = jsonObj.getAsJsonArray("filters");
        if (jsonArrayfilters != null) {
          // ensure the json data is an array
          if (!jsonObj.get("filters").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `filters` to be an array in the JSON string but got `%s`", jsonObj.get("filters").toString()));
          }

          // validate the optional field `filters` (array)
          for (int i = 0; i < jsonArrayfilters.size(); i++) {
            AbstractFilter.validateJsonObject(jsonArrayfilters.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `fulfillmentLimit`
      if (jsonObj.get("fulfillmentLimit") != null && !jsonObj.get("fulfillmentLimit").isJsonNull()) {
        FulfillmentLimit.validateJsonObject(jsonObj.getAsJsonObject("fulfillmentLimit"));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("pathString") != null && !jsonObj.get("pathString").isJsonNull()) && !jsonObj.get("pathString").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pathString` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pathString").toString()));
      }
      if (jsonObj.get("rankedLocations") != null && !jsonObj.get("rankedLocations").isJsonNull()) {
        JsonArray jsonArrayrankedLocations = jsonObj.getAsJsonArray("rankedLocations");
        if (jsonArrayrankedLocations != null) {
          // ensure the json data is an array
          if (!jsonObj.get("rankedLocations").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `rankedLocations` to be an array in the JSON string but got `%s`", jsonObj.get("rankedLocations").toString()));
          }

          // validate the optional field `rankedLocations` (array)
          for (int i = 0; i < jsonArrayrankedLocations.size(); i++) {
            RankedLocation.validateJsonObject(jsonArrayrankedLocations.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("sorts") != null && !jsonObj.get("sorts").isJsonNull()) {
        JsonArray jsonArraysorts = jsonObj.getAsJsonArray("sorts");
        if (jsonArraysorts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("sorts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `sorts` to be an array in the JSON string but got `%s`", jsonObj.get("sorts").toString()));
          }

          // validate the optional field `sorts` (array)
          for (int i = 0; i < jsonArraysorts.size(); i++) {
            LocationSort.validateJsonObject(jsonArraysorts.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("updaterUsername") != null && !jsonObj.get("updaterUsername").isJsonNull()) && !jsonObj.get("updaterUsername").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updaterUsername` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updaterUsername").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiDocumentationLocationGroup.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiDocumentationLocationGroup' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiDocumentationLocationGroup> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiDocumentationLocationGroup.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiDocumentationLocationGroup>() {
           @Override
           public void write(JsonWriter out, ApiDocumentationLocationGroup value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiDocumentationLocationGroup read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApiDocumentationLocationGroup given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApiDocumentationLocationGroup
  * @throws IOException if the JSON string is invalid with respect to ApiDocumentationLocationGroup
  */
  public static ApiDocumentationLocationGroup fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiDocumentationLocationGroup.class);
  }

 /**
  * Convert an instance of ApiDocumentationLocationGroup to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

