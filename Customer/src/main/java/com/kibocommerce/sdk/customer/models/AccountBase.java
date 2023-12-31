/*
 * Kibo Customer Service
 * OpenAPI Spec for Kibo Customer Service
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.customer.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kibocommerce.sdk.customer.models.AdminUserAuditInfo;
import com.kibocommerce.sdk.customer.models.CommerceSummary;
import com.kibocommerce.sdk.customer.models.CustomerAttribute;
import com.kibocommerce.sdk.customer.models.CustomerContact;
import com.kibocommerce.sdk.customer.models.CustomerCustomerSegment;
import com.kibocommerce.sdk.customer.models.CustomerNote;
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
 * Customer account. Customers provide contact information, view order history, and set email preferences on their account.   Merchants can edit accounts to add internal notes or assign them to segments.
 */
@ApiModel(description = "Customer account. Customers provide contact information, view order history, and set email preferences on their account.   Merchants can edit accounts to add internal notes or assign them to segments.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AccountBase implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_CUSTOMER_SET = "customerSet";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_SET)
  private String customerSet;

  public static final String SERIALIZED_NAME_COMMERCE_SUMMARY = "commerceSummary";
  @SerializedName(SERIALIZED_NAME_COMMERCE_SUMMARY)
  private CommerceSummary commerceSummary;

  public static final String SERIALIZED_NAME_CONTACTS = "contacts";
  @SerializedName(SERIALIZED_NAME_CONTACTS)
  private List<CustomerContact> contacts = null;

  public static final String SERIALIZED_NAME_COMPANY_OR_ORGANIZATION = "companyOrOrganization";
  @SerializedName(SERIALIZED_NAME_COMPANY_OR_ORGANIZATION)
  private String companyOrOrganization;

  public static final String SERIALIZED_NAME_NOTES = "notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private List<CustomerNote> notes = null;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private List<CustomerAttribute> attributes = null;

  public static final String SERIALIZED_NAME_SEGMENTS = "segments";
  @SerializedName(SERIALIZED_NAME_SEGMENTS)
  private List<CustomerCustomerSegment> segments = null;

  public static final String SERIALIZED_NAME_TAX_EXEMPT = "taxExempt";
  @SerializedName(SERIALIZED_NAME_TAX_EXEMPT)
  private Boolean taxExempt;

  public static final String SERIALIZED_NAME_TAX_ID = "taxId";
  @SerializedName(SERIALIZED_NAME_TAX_ID)
  private String taxId;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "externalId";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  private String externalId;

  public static final String SERIALIZED_NAME_AUDIT_INFO = "auditInfo";
  @SerializedName(SERIALIZED_NAME_AUDIT_INFO)
  private AdminUserAuditInfo auditInfo;

  public static final String SERIALIZED_NAME_CUSTOMER_SINCE_DATE = "customerSinceDate";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_SINCE_DATE)
  private OffsetDateTime customerSinceDate;

  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "accountType";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private String accountType;

  public static final String SERIALIZED_NAME_MIGRATION_REQUIRED = "migrationRequired";
  @SerializedName(SERIALIZED_NAME_MIGRATION_REQUIRED)
  private Boolean migrationRequired;

  public AccountBase() {
  }

  public AccountBase id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the account, also known as a customer number.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier of the account, also known as a customer number.")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public AccountBase customerSet(String customerSet) {
    
    this.customerSet = customerSet;
    return this;
  }

   /**
   * Get customerSet
   * @return customerSet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCustomerSet() {
    return customerSet;
  }


  public void setCustomerSet(String customerSet) {
    this.customerSet = customerSet;
  }


  public AccountBase commerceSummary(CommerceSummary commerceSummary) {
    
    this.commerceSummary = commerceSummary;
    return this;
  }

   /**
   * Get commerceSummary
   * @return commerceSummary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CommerceSummary getCommerceSummary() {
    return commerceSummary;
  }


  public void setCommerceSummary(CommerceSummary commerceSummary) {
    this.commerceSummary = commerceSummary;
  }


  public AccountBase contacts(List<CustomerContact> contacts) {
    
    this.contacts = contacts;
    return this;
  }

  public AccountBase addContactsItem(CustomerContact contactsItem) {
    if (this.contacts == null) {
      this.contacts = new ArrayList<>();
    }
    this.contacts.add(contactsItem);
    return this;
  }

   /**
   * List of contacts for this account. A customer account can have multiple contacts for billing and shipping addresses.
   * @return contacts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of contacts for this account. A customer account can have multiple contacts for billing and shipping addresses.")

  public List<CustomerContact> getContacts() {
    return contacts;
  }


  public void setContacts(List<CustomerContact> contacts) {
    this.contacts = contacts;
  }


  public AccountBase companyOrOrganization(String companyOrOrganization) {
    
    this.companyOrOrganization = companyOrOrganization;
    return this;
  }

   /**
   * The company or organization name for an account.
   * @return companyOrOrganization
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The company or organization name for an account.")

  public String getCompanyOrOrganization() {
    return companyOrOrganization;
  }


  public void setCompanyOrOrganization(String companyOrOrganization) {
    this.companyOrOrganization = companyOrOrganization;
  }


  public AccountBase notes(List<CustomerNote> notes) {
    
    this.notes = notes;
    return this;
  }

  public AccountBase addNotesItem(CustomerNote notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

   /**
   * List of notes for the account. Merchants use these internal notes, for example, to make a note of a customer&#39;s interests or complaints.   Notes are available only from the merchant&#39;s view, customers cannot view these notes.
   * @return notes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of notes for the account. Merchants use these internal notes, for example, to make a note of a customer's interests or complaints.   Notes are available only from the merchant's view, customers cannot view these notes.")

  public List<CustomerNote> getNotes() {
    return notes;
  }


  public void setNotes(List<CustomerNote> notes) {
    this.notes = notes;
  }


  public AccountBase attributes(List<CustomerAttribute> attributes) {
    
    this.attributes = attributes;
    return this;
  }

  public AccountBase addAttributesItem(CustomerAttribute attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

   /**
   * List of attributes for the account.
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of attributes for the account.")

  public List<CustomerAttribute> getAttributes() {
    return attributes;
  }


  public void setAttributes(List<CustomerAttribute> attributes) {
    this.attributes = attributes;
  }


  public AccountBase segments(List<CustomerCustomerSegment> segments) {
    
    this.segments = segments;
    return this;
  }

  public AccountBase addSegmentsItem(CustomerCustomerSegment segmentsItem) {
    if (this.segments == null) {
      this.segments = new ArrayList<>();
    }
    this.segments.add(segmentsItem);
    return this;
  }

   /**
   * List of segments assigned to account. Merchants create segments, for example, to manage discounts or assign VIP status.   Then they assign the account to the segment. An account can belong to several segments or none at all.
   * @return segments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of segments assigned to account. Merchants create segments, for example, to manage discounts or assign VIP status.   Then they assign the account to the segment. An account can belong to several segments or none at all.")

  public List<CustomerCustomerSegment> getSegments() {
    return segments;
  }


  public void setSegments(List<CustomerCustomerSegment> segments) {
    this.segments = segments;
  }


  public AccountBase taxExempt(Boolean taxExempt) {
    
    this.taxExempt = taxExempt;
    return this;
  }

   /**
   * Get taxExempt
   * @return taxExempt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getTaxExempt() {
    return taxExempt;
  }


  public void setTaxExempt(Boolean taxExempt) {
    this.taxExempt = taxExempt;
  }


  public AccountBase taxId(String taxId) {
    
    this.taxId = taxId;
    return this;
  }

   /**
   * Get taxId
   * @return taxId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTaxId() {
    return taxId;
  }


  public void setTaxId(String taxId) {
    this.taxId = taxId;
  }


  public AccountBase externalId(String externalId) {
    
    this.externalId = externalId;
    return this;
  }

   /**
   * Get externalId
   * @return externalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExternalId() {
    return externalId;
  }


  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  public AccountBase auditInfo(AdminUserAuditInfo auditInfo) {
    
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


  public AccountBase customerSinceDate(OffsetDateTime customerSinceDate) {
    
    this.customerSinceDate = customerSinceDate;
    return this;
  }

   /**
   * Date when the customer account is created.
   * @return customerSinceDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date when the customer account is created.")

  public OffsetDateTime getCustomerSinceDate() {
    return customerSinceDate;
  }


  public void setCustomerSinceDate(OffsetDateTime customerSinceDate) {
    this.customerSinceDate = customerSinceDate;
  }


  public AccountBase accountType(String accountType) {
    
    this.accountType = accountType;
    return this;
  }

   /**
   * Type of account.
   * @return accountType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type of account.")

  public String getAccountType() {
    return accountType;
  }


  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }


  public AccountBase migrationRequired(Boolean migrationRequired) {
    
    this.migrationRequired = migrationRequired;
    return this;
  }

   /**
   * Indicates Subscription migration is required or not.
   * @return migrationRequired
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates Subscription migration is required or not.")

  public Boolean getMigrationRequired() {
    return migrationRequired;
  }


  public void setMigrationRequired(Boolean migrationRequired) {
    this.migrationRequired = migrationRequired;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountBase accountBase = (AccountBase) o;
    return Objects.equals(this.id, accountBase.id) &&
        Objects.equals(this.customerSet, accountBase.customerSet) &&
        Objects.equals(this.commerceSummary, accountBase.commerceSummary) &&
        Objects.equals(this.contacts, accountBase.contacts) &&
        Objects.equals(this.companyOrOrganization, accountBase.companyOrOrganization) &&
        Objects.equals(this.notes, accountBase.notes) &&
        Objects.equals(this.attributes, accountBase.attributes) &&
        Objects.equals(this.segments, accountBase.segments) &&
        Objects.equals(this.taxExempt, accountBase.taxExempt) &&
        Objects.equals(this.taxId, accountBase.taxId) &&
        Objects.equals(this.externalId, accountBase.externalId) &&
        Objects.equals(this.auditInfo, accountBase.auditInfo) &&
        Objects.equals(this.customerSinceDate, accountBase.customerSinceDate) &&
        Objects.equals(this.accountType, accountBase.accountType) &&
        Objects.equals(this.migrationRequired, accountBase.migrationRequired);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, customerSet, commerceSummary, contacts, companyOrOrganization, notes, attributes, segments, taxExempt, taxId, externalId, auditInfo, customerSinceDate, accountType, migrationRequired);
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
    sb.append("class AccountBase {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    customerSet: ").append(toIndentedString(customerSet)).append("\n");
    sb.append("    commerceSummary: ").append(toIndentedString(commerceSummary)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
    sb.append("    companyOrOrganization: ").append(toIndentedString(companyOrOrganization)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    segments: ").append(toIndentedString(segments)).append("\n");
    sb.append("    taxExempt: ").append(toIndentedString(taxExempt)).append("\n");
    sb.append("    taxId: ").append(toIndentedString(taxId)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    auditInfo: ").append(toIndentedString(auditInfo)).append("\n");
    sb.append("    customerSinceDate: ").append(toIndentedString(customerSinceDate)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    migrationRequired: ").append(toIndentedString(migrationRequired)).append("\n");
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
    openapiFields.add("customerSet");
    openapiFields.add("commerceSummary");
    openapiFields.add("contacts");
    openapiFields.add("companyOrOrganization");
    openapiFields.add("notes");
    openapiFields.add("attributes");
    openapiFields.add("segments");
    openapiFields.add("taxExempt");
    openapiFields.add("taxId");
    openapiFields.add("externalId");
    openapiFields.add("auditInfo");
    openapiFields.add("customerSinceDate");
    openapiFields.add("accountType");
    openapiFields.add("migrationRequired");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AccountBase
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AccountBase.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccountBase is not found in the empty JSON string", AccountBase.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!AccountBase.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AccountBase` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("customerSet") != null && !jsonObj.get("customerSet").isJsonNull()) && !jsonObj.get("customerSet").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerSet` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerSet").toString()));
      }
      // validate the optional field `commerceSummary`
      if (jsonObj.get("commerceSummary") != null && !jsonObj.get("commerceSummary").isJsonNull()) {
        CommerceSummary.validateJsonObject(jsonObj.getAsJsonObject("commerceSummary"));
      }
      if (jsonObj.get("contacts") != null && !jsonObj.get("contacts").isJsonNull()) {
        JsonArray jsonArraycontacts = jsonObj.getAsJsonArray("contacts");
        if (jsonArraycontacts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("contacts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `contacts` to be an array in the JSON string but got `%s`", jsonObj.get("contacts").toString()));
          }

          // validate the optional field `contacts` (array)
          for (int i = 0; i < jsonArraycontacts.size(); i++) {
            CustomerContact.validateJsonObject(jsonArraycontacts.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("companyOrOrganization") != null && !jsonObj.get("companyOrOrganization").isJsonNull()) && !jsonObj.get("companyOrOrganization").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `companyOrOrganization` to be a primitive type in the JSON string but got `%s`", jsonObj.get("companyOrOrganization").toString()));
      }
      if (jsonObj.get("notes") != null && !jsonObj.get("notes").isJsonNull()) {
        JsonArray jsonArraynotes = jsonObj.getAsJsonArray("notes");
        if (jsonArraynotes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("notes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `notes` to be an array in the JSON string but got `%s`", jsonObj.get("notes").toString()));
          }

          // validate the optional field `notes` (array)
          for (int i = 0; i < jsonArraynotes.size(); i++) {
            CustomerNote.validateJsonObject(jsonArraynotes.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("attributes") != null && !jsonObj.get("attributes").isJsonNull()) {
        JsonArray jsonArrayattributes = jsonObj.getAsJsonArray("attributes");
        if (jsonArrayattributes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("attributes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `attributes` to be an array in the JSON string but got `%s`", jsonObj.get("attributes").toString()));
          }

          // validate the optional field `attributes` (array)
          for (int i = 0; i < jsonArrayattributes.size(); i++) {
            CustomerAttribute.validateJsonObject(jsonArrayattributes.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("segments") != null && !jsonObj.get("segments").isJsonNull()) {
        JsonArray jsonArraysegments = jsonObj.getAsJsonArray("segments");
        if (jsonArraysegments != null) {
          // ensure the json data is an array
          if (!jsonObj.get("segments").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `segments` to be an array in the JSON string but got `%s`", jsonObj.get("segments").toString()));
          }

          // validate the optional field `segments` (array)
          for (int i = 0; i < jsonArraysegments.size(); i++) {
            CustomerCustomerSegment.validateJsonObject(jsonArraysegments.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("taxId") != null && !jsonObj.get("taxId").isJsonNull()) && !jsonObj.get("taxId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `taxId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("taxId").toString()));
      }
      if ((jsonObj.get("externalId") != null && !jsonObj.get("externalId").isJsonNull()) && !jsonObj.get("externalId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `externalId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("externalId").toString()));
      }
      // validate the optional field `auditInfo`
      if (jsonObj.get("auditInfo") != null && !jsonObj.get("auditInfo").isJsonNull()) {
        AdminUserAuditInfo.validateJsonObject(jsonObj.getAsJsonObject("auditInfo"));
      }
      if ((jsonObj.get("accountType") != null && !jsonObj.get("accountType").isJsonNull()) && !jsonObj.get("accountType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccountBase.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccountBase' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccountBase> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccountBase.class));

       return (TypeAdapter<T>) new TypeAdapter<AccountBase>() {
           @Override
           public void write(JsonWriter out, AccountBase value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AccountBase read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AccountBase given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccountBase
  * @throws IOException if the JSON string is invalid with respect to AccountBase
  */
  public static AccountBase fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccountBase.class);
  }

 /**
  * Convert an instance of AccountBase to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

