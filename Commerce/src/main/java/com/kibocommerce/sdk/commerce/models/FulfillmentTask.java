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
import com.kibocommerce.sdk.commerce.models.CommerceRuntimeLink;
import com.kibocommerce.sdk.commerce.models.CommerceRuntimeTaskInput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
 * FulfillmentTask
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FulfillmentTask implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Map<String, CommerceRuntimeLink> links = null;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Map<String, Object> attributes = null;

  public static final String SERIALIZED_NAME_COMPLETED = "completed";
  @SerializedName(SERIALIZED_NAME_COMPLETED)
  private Boolean completed;

  public static final String SERIALIZED_NAME_COMPLETED_DATE = "completedDate";
  @SerializedName(SERIALIZED_NAME_COMPLETED_DATE)
  private OffsetDateTime completedDate;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_INPUTS = "inputs";
  @SerializedName(SERIALIZED_NAME_INPUTS)
  private List<CommerceRuntimeTaskInput> inputs = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SKIPPABLE = "skippable";
  @SerializedName(SERIALIZED_NAME_SKIPPABLE)
  private Boolean skippable;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public static final String SERIALIZED_NAME_TASK_ID = "taskId";
  @SerializedName(SERIALIZED_NAME_TASK_ID)
  private String taskId;

  public FulfillmentTask() {
  }

  public FulfillmentTask links(Map<String, CommerceRuntimeLink> links) {
    
    this.links = links;
    return this;
  }

  public FulfillmentTask putLinksItem(String key, CommerceRuntimeLink linksItem) {
    if (this.links == null) {
      this.links = new HashMap<>();
    }
    this.links.put(key, linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, CommerceRuntimeLink> getLinks() {
    return links;
  }


  public void setLinks(Map<String, CommerceRuntimeLink> links) {
    this.links = links;
  }


  public FulfillmentTask active(Boolean active) {
    
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


  public FulfillmentTask attributes(Map<String, Object> attributes) {
    
    this.attributes = attributes;
    return this;
  }

  public FulfillmentTask putAttributesItem(String key, Object attributesItem) {
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


  public FulfillmentTask completed(Boolean completed) {
    
    this.completed = completed;
    return this;
  }

   /**
   * Get completed
   * @return completed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCompleted() {
    return completed;
  }


  public void setCompleted(Boolean completed) {
    this.completed = completed;
  }


  public FulfillmentTask completedDate(OffsetDateTime completedDate) {
    
    this.completedDate = completedDate;
    return this;
  }

   /**
   * Get completedDate
   * @return completedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCompletedDate() {
    return completedDate;
  }


  public void setCompletedDate(OffsetDateTime completedDate) {
    this.completedDate = completedDate;
  }


  public FulfillmentTask description(String description) {
    
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


  public FulfillmentTask inputs(List<CommerceRuntimeTaskInput> inputs) {
    
    this.inputs = inputs;
    return this;
  }

  public FulfillmentTask addInputsItem(CommerceRuntimeTaskInput inputsItem) {
    if (this.inputs == null) {
      this.inputs = new ArrayList<>();
    }
    this.inputs.add(inputsItem);
    return this;
  }

   /**
   * Get inputs
   * @return inputs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CommerceRuntimeTaskInput> getInputs() {
    return inputs;
  }


  public void setInputs(List<CommerceRuntimeTaskInput> inputs) {
    this.inputs = inputs;
  }


  public FulfillmentTask name(String name) {
    
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


  public FulfillmentTask skippable(Boolean skippable) {
    
    this.skippable = skippable;
    return this;
  }

   /**
   * Get skippable
   * @return skippable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSkippable() {
    return skippable;
  }


  public void setSkippable(Boolean skippable) {
    this.skippable = skippable;
  }


  public FulfillmentTask subject(String subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * Get subject
   * @return subject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubject() {
    return subject;
  }


  public void setSubject(String subject) {
    this.subject = subject;
  }


  public FulfillmentTask taskId(String taskId) {
    
    this.taskId = taskId;
    return this;
  }

   /**
   * Get taskId
   * @return taskId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTaskId() {
    return taskId;
  }


  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FulfillmentTask fulfillmentTask = (FulfillmentTask) o;
    return Objects.equals(this.links, fulfillmentTask.links) &&
        Objects.equals(this.active, fulfillmentTask.active) &&
        Objects.equals(this.attributes, fulfillmentTask.attributes) &&
        Objects.equals(this.completed, fulfillmentTask.completed) &&
        Objects.equals(this.completedDate, fulfillmentTask.completedDate) &&
        Objects.equals(this.description, fulfillmentTask.description) &&
        Objects.equals(this.inputs, fulfillmentTask.inputs) &&
        Objects.equals(this.name, fulfillmentTask.name) &&
        Objects.equals(this.skippable, fulfillmentTask.skippable) &&
        Objects.equals(this.subject, fulfillmentTask.subject) &&
        Objects.equals(this.taskId, fulfillmentTask.taskId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, active, attributes, completed, completedDate, description, inputs, name, skippable, subject, taskId);
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
    sb.append("class FulfillmentTask {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
    sb.append("    completedDate: ").append(toIndentedString(completedDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    skippable: ").append(toIndentedString(skippable)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
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
    openapiFields.add("links");
    openapiFields.add("active");
    openapiFields.add("attributes");
    openapiFields.add("completed");
    openapiFields.add("completedDate");
    openapiFields.add("description");
    openapiFields.add("inputs");
    openapiFields.add("name");
    openapiFields.add("skippable");
    openapiFields.add("subject");
    openapiFields.add("taskId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FulfillmentTask
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FulfillmentTask.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FulfillmentTask is not found in the empty JSON string", FulfillmentTask.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!FulfillmentTask.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FulfillmentTask` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (jsonObj.get("inputs") != null && !jsonObj.get("inputs").isJsonNull()) {
        JsonArray jsonArrayinputs = jsonObj.getAsJsonArray("inputs");
        if (jsonArrayinputs != null) {
          // ensure the json data is an array
          if (!jsonObj.get("inputs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `inputs` to be an array in the JSON string but got `%s`", jsonObj.get("inputs").toString()));
          }

          // validate the optional field `inputs` (array)
          for (int i = 0; i < jsonArrayinputs.size(); i++) {
            CommerceRuntimeTaskInput.validateJsonObject(jsonArrayinputs.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("subject") != null && !jsonObj.get("subject").isJsonNull()) && !jsonObj.get("subject").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subject` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subject").toString()));
      }
      if ((jsonObj.get("taskId") != null && !jsonObj.get("taskId").isJsonNull()) && !jsonObj.get("taskId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `taskId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("taskId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FulfillmentTask.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FulfillmentTask' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FulfillmentTask> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FulfillmentTask.class));

       return (TypeAdapter<T>) new TypeAdapter<FulfillmentTask>() {
           @Override
           public void write(JsonWriter out, FulfillmentTask value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FulfillmentTask read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FulfillmentTask given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FulfillmentTask
  * @throws IOException if the JSON string is invalid with respect to FulfillmentTask
  */
  public static FulfillmentTask fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FulfillmentTask.class);
  }

 /**
  * Convert an instance of FulfillmentTask to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

