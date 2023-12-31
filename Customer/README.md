# customer

Kibo Customer Service
- API version: 1.0.0

OpenAPI Spec for Kibo Customer Service


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.kibocommerce</groupId>
  <artifactId>customer</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'customer' jar has been published to maven central.
    mavenLocal()       // Needed if the 'customer' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "com.kibocommerce:customer:1.0.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/customer-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.AddressValidationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    AddressValidationApi apiInstance = new AddressValidationApi(defaultClient);
    AddressValidationRequest addressValidationRequest = new AddressValidationRequest(); // AddressValidationRequest | 
    try {
      AddressValidationResponse result = apiInstance.validateAddress(addressValidationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AddressValidationApi#validateAddress");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://https:/api*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AddressValidationApi* | [**validateAddress**](docs/AddressValidationApi.md#validateAddress) | **POST** /commerce/customer/addressvalidation | Validate Address
*B2BAccountApi* | [**addAccount**](docs/B2BAccountApi.md#addAccount) | **POST** /commerce/customer/b2baccounts | Add Account
*B2BAccountApi* | [**addB2BAccountAttribute**](docs/B2BAccountApi.md#addB2BAccountAttribute) | **POST** /commerce/customer/b2baccounts/{accountId}/attributes | Add B2B Account tAttribute
*B2BAccountApi* | [**addSalesRepToB2BAccount**](docs/B2BAccountApi.md#addSalesRepToB2BAccount) | **POST** /commerce/customer/b2baccounts/{accountId}/salesrep/{userId} | Add Sales Rep To B2B Account
*B2BAccountApi* | [**addSalesRepsToB2BAccount**](docs/B2BAccountApi.md#addSalesRepsToB2BAccount) | **POST** /commerce/customer/b2baccounts/{accountId}/addsalesreps | Add Sales Reps To B2B Account
*B2BAccountApi* | [**addUser**](docs/B2BAccountApi.md#addUser) | **POST** /commerce/customer/b2baccounts/{accountId}/user | Add User
*B2BAccountApi* | [**addUserRoleAsync**](docs/B2BAccountApi.md#addUserRoleAsync) | **POST** /commerce/customer/b2baccounts/{accountId}/user/{userId}/roles/{roleId} | Add User Role Async
*B2BAccountApi* | [**changeParentAccount**](docs/B2BAccountApi.md#changeParentAccount) | **POST** /commerce/customer/b2baccounts/{accountId}/changeparent/{parentAccountId} | Change Parent Account
*B2BAccountApi* | [**deleteB2BAccountAttribute**](docs/B2BAccountApi.md#deleteB2BAccountAttribute) | **DELETE** /commerce/customer/b2baccounts/{accountId}/attributes/{attributeFQN} | Delete B2B Account Attribute
*B2BAccountApi* | [**getAccountsForSalesRep**](docs/B2BAccountApi.md#getAccountsForSalesRep) | **GET** /commerce/customer/b2baccounts/salesrep/{userId} | Get Accounts For Sales Rep
*B2BAccountApi* | [**getB2BAccount**](docs/B2BAccountApi.md#getB2BAccount) | **GET** /commerce/customer/b2baccounts/{accountId} | Get B2B Account
*B2BAccountApi* | [**getB2BAccountAttribute**](docs/B2BAccountApi.md#getB2BAccountAttribute) | **GET** /commerce/customer/b2baccounts/{accountId}/attributes/{attributeFQN} | Get B2B Account Attribute
*B2BAccountApi* | [**getB2BAccountAttributes**](docs/B2BAccountApi.md#getB2BAccountAttributes) | **GET** /commerce/customer/b2baccounts/{accountId}/attributes | Get B2B Account Attributes
*B2BAccountApi* | [**getB2BAccountHierarchy**](docs/B2BAccountApi.md#getB2BAccountHierarchy) | **GET** /commerce/customer/b2baccounts/{accountId}/hierarchy | Get B2B Account Hierarchy
*B2BAccountApi* | [**getB2BAccounts**](docs/B2BAccountApi.md#getB2BAccounts) | **GET** /commerce/customer/b2baccounts | Get B2B Accounts
*B2BAccountApi* | [**getUserRolesAsync**](docs/B2BAccountApi.md#getUserRolesAsync) | **GET** /commerce/customer/b2baccounts/{accountId}/user/{userId}/roles | Get User Roles Async
*B2BAccountApi* | [**getUsersAsync**](docs/B2BAccountApi.md#getUsersAsync) | **GET** /commerce/customer/b2baccounts/{accountId}/users | Get Users Async
*B2BAccountApi* | [**removeSalesRepFromB2BAccount**](docs/B2BAccountApi.md#removeSalesRepFromB2BAccount) | **DELETE** /commerce/customer/b2baccounts/{accountId}/salesrep/{userId} | Remove Sales Rep From B2B Account
*B2BAccountApi* | [**removeUser**](docs/B2BAccountApi.md#removeUser) | **PUT** /commerce/customer/b2baccounts/{accountId}/user/{userId}/remove | Remove User
*B2BAccountApi* | [**removeUserRoleAsync**](docs/B2BAccountApi.md#removeUserRoleAsync) | **DELETE** /commerce/customer/b2baccounts/{accountId}/user/{userId}/roles/{roleId} | Remove User Role Async
*B2BAccountApi* | [**updateAccount**](docs/B2BAccountApi.md#updateAccount) | **PUT** /commerce/customer/b2baccounts/{accountId} | Update Account
*B2BAccountApi* | [**updateB2BAccountAttribute**](docs/B2BAccountApi.md#updateB2BAccountAttribute) | **PUT** /commerce/customer/b2baccounts/{accountId}/attributes/{attributeFQN} | Update B2B Account Attribute
*B2BAccountApi* | [**updateB2BAccountStatus**](docs/B2BAccountApi.md#updateB2BAccountStatus) | **PUT** /commerce/customer/b2baccounts/{accountId}/status/{actionName} | Update B2B Account Status
*B2BAccountApi* | [**updateSalesRepsOnB2BAccount**](docs/B2BAccountApi.md#updateSalesRepsOnB2BAccount) | **PUT** /commerce/customer/b2baccounts/{accountId}/salesrep | Update Sales Reps On B2B Account
*B2BAccountApi* | [**updateUser**](docs/B2BAccountApi.md#updateUser) | **PUT** /commerce/customer/b2baccounts/{accountId}/user/{userId} | Update User
*B2BAccountApi* | [**upgradeAccountsToB2B**](docs/B2BAccountApi.md#upgradeAccountsToB2B) | **PUT** /commerce/customer/b2baccounts/upgradeaccounts | Upgrade B2C Accounts To B2B
*B2BContactApi* | [**getB2BContacts**](docs/B2BContactApi.md#getB2BContacts) | **GET** /commerce/customer/b2bcontacts | Get B2B Contacts
*CreditApi* | [**addCredit**](docs/CreditApi.md#addCredit) | **POST** /commerce/customer/credits | Add Credit
*CreditApi* | [**addTransaction**](docs/CreditApi.md#addTransaction) | **POST** /commerce/customer/credits/{code}/transactions | Add Transaction
*CreditApi* | [**associateCreditToShopper**](docs/CreditApi.md#associateCreditToShopper) | **PUT** /commerce/customer/credits/{code}/associate-to-shopper | Associate Credit To Shopper
*CreditApi* | [**deleteCredit**](docs/CreditApi.md#deleteCredit) | **DELETE** /commerce/customer/credits/{code} | Delete credit
*CreditApi* | [**getAuditEntries**](docs/CreditApi.md#getAuditEntries) | **GET** /commerce/customer/credits/{code}/auditentries | Get Audit Entries
*CreditApi* | [**getCredit**](docs/CreditApi.md#getCredit) | **GET** /commerce/customer/credits/{code} | Get credit
*CreditApi* | [**getCredits**](docs/CreditApi.md#getCredits) | **GET** /commerce/customer/credits | Get Credits
*CreditApi* | [**getTransactions**](docs/CreditApi.md#getTransactions) | **GET** /commerce/customer/credits/{code}/transactions | Get Transactions
*CreditApi* | [**resendCreditCreatedEmail**](docs/CreditApi.md#resendCreditCreatedEmail) | **PUT** /commerce/customer/credits/{code}/Resend-Email | Resend Credit Created Email
*CreditApi* | [**updateCredit**](docs/CreditApi.md#updateCredit) | **PUT** /commerce/customer/credits/{code} | Update Credit
*CustomerAccountApi* | [**addAccount**](docs/CustomerAccountApi.md#addAccount) | **POST** /commerce/customer/accounts | Add Account
*CustomerAccountApi* | [**addAccountAndLogin**](docs/CustomerAccountApi.md#addAccountAndLogin) | **POST** /commerce/customer/accounts/Add-Account-And-Login | Add Account And Login
*CustomerAccountApi* | [**addAccountAttribute**](docs/CustomerAccountApi.md#addAccountAttribute) | **POST** /commerce/customer/accounts/{accountId}/attributes | Add Account Attribute
*CustomerAccountApi* | [**addAccountCard**](docs/CustomerAccountApi.md#addAccountCard) | **POST** /commerce/customer/accounts/{accountId}/cards | Add Account Card
*CustomerAccountApi* | [**addAccountContact**](docs/CustomerAccountApi.md#addAccountContact) | **POST** /commerce/customer/accounts/{accountId}/contacts | Add Account Contact
*CustomerAccountApi* | [**addAccountContactList**](docs/CustomerAccountApi.md#addAccountContactList) | **PUT** /commerce/customer/accounts/{accountId}/contacts | Add Account Contact List
*CustomerAccountApi* | [**addAccountNote**](docs/CustomerAccountApi.md#addAccountNote) | **POST** /commerce/customer/accounts/{accountId}/notes | Add Account Note
*CustomerAccountApi* | [**addAccounts**](docs/CustomerAccountApi.md#addAccounts) | **POST** /commerce/customer/accounts/Bulk | Add Accounts
*CustomerAccountApi* | [**addLoginToExistingCustomer**](docs/CustomerAccountApi.md#addLoginToExistingCustomer) | **POST** /commerce/customer/accounts/{accountId}/Create-Login | Add Login To Existing Customer
*CustomerAccountApi* | [**addTransaction**](docs/CustomerAccountApi.md#addTransaction) | **POST** /commerce/customer/accounts/{accountId}/transactions | Add Transaction
*CustomerAccountApi* | [**changePassword**](docs/CustomerAccountApi.md#changePassword) | **POST** /commerce/customer/accounts/{accountId}/Change-Password | Change Password
*CustomerAccountApi* | [**changePasswords**](docs/CustomerAccountApi.md#changePasswords) | **POST** /commerce/customer/accounts/Change-Passwords | Change Passwords
*CustomerAccountApi* | [**createCustomerPurchaseOrderAccount**](docs/CustomerAccountApi.md#createCustomerPurchaseOrderAccount) | **POST** /commerce/customer/accounts/{accountId}/purchaseOrderAccount | Create Customer Purchase Order Account
*CustomerAccountApi* | [**createPurchaseOrderTransaction**](docs/CustomerAccountApi.md#createPurchaseOrderTransaction) | **POST** /commerce/customer/accounts/{accountId}/PurchaseOrderTransaction | Create Purchase Order Transaction
*CustomerAccountApi* | [**deleteAccount**](docs/CustomerAccountApi.md#deleteAccount) | **DELETE** /commerce/customer/accounts/{accountId} | Delete Account
*CustomerAccountApi* | [**deleteAccountAttribute**](docs/CustomerAccountApi.md#deleteAccountAttribute) | **DELETE** /commerce/customer/accounts/{accountId}/attributes/{attributeFQN} | Delete Account Attribute
*CustomerAccountApi* | [**deleteAccountCard**](docs/CustomerAccountApi.md#deleteAccountCard) | **DELETE** /commerce/customer/accounts/{accountId}/cards/{cardId} | Delete Account Card
*CustomerAccountApi* | [**deleteAccountContact**](docs/CustomerAccountApi.md#deleteAccountContact) | **DELETE** /commerce/customer/accounts/{accountId}/contacts/{contactId} | Delete Account Contact
*CustomerAccountApi* | [**deleteAccountNote**](docs/CustomerAccountApi.md#deleteAccountNote) | **DELETE** /commerce/customer/accounts/{accountId}/notes/{noteId} | Delete Account Note
*CustomerAccountApi* | [**getAccount**](docs/CustomerAccountApi.md#getAccount) | **GET** /commerce/customer/accounts/{accountId} | Get Account
*CustomerAccountApi* | [**getAccountAttribute**](docs/CustomerAccountApi.md#getAccountAttribute) | **GET** /commerce/customer/accounts/{accountId}/attributes/{attributeFQN} | Get Account Attribute
*CustomerAccountApi* | [**getAccountAttributes**](docs/CustomerAccountApi.md#getAccountAttributes) | **GET** /commerce/customer/accounts/{accountId}/attributes | Get Account Attributes
*CustomerAccountApi* | [**getAccountAuditLog**](docs/CustomerAccountApi.md#getAccountAuditLog) | **GET** /commerce/customer/accounts/{accountId}/AuditLog/Entries | Get Account Audit Log
*CustomerAccountApi* | [**getAccountCard**](docs/CustomerAccountApi.md#getAccountCard) | **GET** /commerce/customer/accounts/{accountId}/cards/{cardId} | Get Account Card
*CustomerAccountApi* | [**getAccountCards**](docs/CustomerAccountApi.md#getAccountCards) | **GET** /commerce/customer/accounts/{accountId}/cards | Get Account Cards
*CustomerAccountApi* | [**getAccountContact**](docs/CustomerAccountApi.md#getAccountContact) | **GET** /commerce/customer/accounts/{accountId}/contacts/{contactId} | Get Account Contact
*CustomerAccountApi* | [**getAccountContacts**](docs/CustomerAccountApi.md#getAccountContacts) | **GET** /commerce/customer/accounts/{accountId}/contacts | Get Account Contacts
*CustomerAccountApi* | [**getAccountNote**](docs/CustomerAccountApi.md#getAccountNote) | **GET** /commerce/customer/accounts/{accountId}/notes/{noteId} | Get Account Note
*CustomerAccountApi* | [**getAccountNotes**](docs/CustomerAccountApi.md#getAccountNotes) | **GET** /commerce/customer/accounts/{accountId}/notes | Get Account Notes
*CustomerAccountApi* | [**getAccountSegments**](docs/CustomerAccountApi.md#getAccountSegments) | **GET** /commerce/customer/accounts/{accountId}/segments | Get Account Segments
*CustomerAccountApi* | [**getAccounts**](docs/CustomerAccountApi.md#getAccounts) | **GET** /commerce/customer/accounts | Get Accounts
*CustomerAccountApi* | [**getCurrentAccount**](docs/CustomerAccountApi.md#getCurrentAccount) | **GET** /commerce/customer/accounts/current | Retrieves the details of a the current logged in customer account
*CustomerAccountApi* | [**getCustomerPurchaseOrderAccount**](docs/CustomerAccountApi.md#getCustomerPurchaseOrderAccount) | **GET** /commerce/customer/accounts/{accountId}/purchaseOrderAccount | Gets a customer&#39;s purchase order account.
*CustomerAccountApi* | [**getCustomerPurchaseOrderTransactions**](docs/CustomerAccountApi.md#getCustomerPurchaseOrderTransactions) | **GET** /commerce/customer/accounts/{accountId}/PurchaseOrderTransaction | Get Customer Purchase Order Transactions
*CustomerAccountApi* | [**getCustomersPurchaseOrderAccounts**](docs/CustomerAccountApi.md#getCustomersPurchaseOrderAccounts) | **POST** /commerce/customer/accounts/purchaseOrderAccounts | Get Customers Purchase Order Accounts
*CustomerAccountApi* | [**getLoginState**](docs/CustomerAccountApi.md#getLoginState) | **GET** /commerce/customer/accounts/{accountId}/loginstate | Get Login State
*CustomerAccountApi* | [**getLoginStateByEmailAddress**](docs/CustomerAccountApi.md#getLoginStateByEmailAddress) | **POST** /commerce/customer/accounts/loginstatebyemailaddress | Get Login State By Email Address
*CustomerAccountApi* | [**getLoginStateByUserName**](docs/CustomerAccountApi.md#getLoginStateByUserName) | **POST** /commerce/customer/accounts/loginstatebyusername | Get Login State By UserName
*CustomerAccountApi* | [**getTransactions**](docs/CustomerAccountApi.md#getTransactions) | **GET** /commerce/customer/accounts/{accountId}/transactions | Get Transactions
*CustomerAccountApi* | [**recomputeCustomerLifetimeValue**](docs/CustomerAccountApi.md#recomputeCustomerLifetimeValue) | **POST** /commerce/customer/accounts/{accountId}/recomputelifetimevalue | Recompute Customer Lifetime Value
*CustomerAccountApi* | [**removeTransaction**](docs/CustomerAccountApi.md#removeTransaction) | **DELETE** /commerce/customer/accounts/{accountId}/transactions/{transactionId} | Remove Transaction
*CustomerAccountApi* | [**resetPassword**](docs/CustomerAccountApi.md#resetPassword) | **POST** /commerce/customer/accounts/Reset-Password | Reset Password
*CustomerAccountApi* | [**setLoginLocked**](docs/CustomerAccountApi.md#setLoginLocked) | **POST** /commerce/customer/accounts/{accountId}/Set-Login-Locked | Set Login Locked
*CustomerAccountApi* | [**setPasswordChangeRequired**](docs/CustomerAccountApi.md#setPasswordChangeRequired) | **POST** /commerce/customer/accounts/{accountId}/Set-Password-Change-Required | Set Password Change Required
*CustomerAccountApi* | [**updateAccount**](docs/CustomerAccountApi.md#updateAccount) | **PUT** /commerce/customer/accounts/{accountId} | Update Account
*CustomerAccountApi* | [**updateAccountAttribute**](docs/CustomerAccountApi.md#updateAccountAttribute) | **PUT** /commerce/customer/accounts/{accountId}/attributes/{attributeFQN} | Update Account Attribute
*CustomerAccountApi* | [**updateAccountCard**](docs/CustomerAccountApi.md#updateAccountCard) | **PUT** /commerce/customer/accounts/{accountId}/cards/{cardId} | Update Account Card
*CustomerAccountApi* | [**updateAccountContact**](docs/CustomerAccountApi.md#updateAccountContact) | **PUT** /commerce/customer/accounts/{accountId}/contacts/{contactId} | Update Account Contact
*CustomerAccountApi* | [**updateAccountNote**](docs/CustomerAccountApi.md#updateAccountNote) | **PUT** /commerce/customer/accounts/{accountId}/notes/{noteId} | Update Account Note
*CustomerAccountApi* | [**updateCustomerPurchaseOrderAccount**](docs/CustomerAccountApi.md#updateCustomerPurchaseOrderAccount) | **PUT** /commerce/customer/accounts/{accountId}/purchaseOrderAccount | Update Customer Purchase Order Account
*CustomerAccountApi* | [**updateForgottenPassword**](docs/CustomerAccountApi.md#updateForgottenPassword) | **POST** /commerce/customer/accounts/Update-Forgotten-Password | Update Forgotten Password
*CustomerAccountAttributeDefinitionsApi* | [**createAttribute**](docs/CustomerAccountAttributeDefinitionsApi.md#createAttribute) | **POST** /commerce/customer/accountattributedefinition/attributes | Create Attribute
*CustomerAccountAttributeDefinitionsApi* | [**getAttribute**](docs/CustomerAccountAttributeDefinitionsApi.md#getAttribute) | **GET** /commerce/customer/accountattributedefinition/attributes/{attributeFQN} | Get Attribute
*CustomerAccountAttributeDefinitionsApi* | [**getAttributeVocabularyValues**](docs/CustomerAccountAttributeDefinitionsApi.md#getAttributeVocabularyValues) | **GET** /commerce/customer/accountattributedefinition/attributes/{attributeFQN}/VocabularyValues | Get Attribute Vocabulary Values
*CustomerAccountAttributeDefinitionsApi* | [**getAttributes**](docs/CustomerAccountAttributeDefinitionsApi.md#getAttributes) | **GET** /commerce/customer/accountattributedefinition/attributes | Get Attributes
*CustomerAccountAttributeDefinitionsApi* | [**updateAttribute**](docs/CustomerAccountAttributeDefinitionsApi.md#updateAttribute) | **PUT** /commerce/customer/accountattributedefinition/attributes/{attributeFQN} | Update Attribute
*CustomerAttributeDefinitionApi* | [**createAttribute**](docs/CustomerAttributeDefinitionApi.md#createAttribute) | **POST** /commerce/customer/attributedefinition/attributes | Create Attribute
*CustomerAttributeDefinitionApi* | [**getAttribute**](docs/CustomerAttributeDefinitionApi.md#getAttribute) | **GET** /commerce/customer/attributedefinition/attributes/{attributeFQN} | Get Attribute
*CustomerAttributeDefinitionApi* | [**getAttributeVocabularyValues**](docs/CustomerAttributeDefinitionApi.md#getAttributeVocabularyValues) | **GET** /commerce/customer/attributedefinition/attributes/{attributeFQN}/VocabularyValues | Get Attribute Vocabulary Values
*CustomerAttributeDefinitionApi* | [**getAttributes**](docs/CustomerAttributeDefinitionApi.md#getAttributes) | **GET** /commerce/customer/attributedefinition/attributes | Get Attributes
*CustomerAttributeDefinitionApi* | [**updateAttribute**](docs/CustomerAttributeDefinitionApi.md#updateAttribute) | **PUT** /commerce/customer/attributedefinition/attributes/{attributeFQN} | Update Attribute
*CustomerSegmentApi* | [**addSegment**](docs/CustomerSegmentApi.md#addSegment) | **POST** /commerce/customer/segments | Adds Segment
*CustomerSegmentApi* | [**addSegmentAccounts**](docs/CustomerSegmentApi.md#addSegmentAccounts) | **POST** /commerce/customer/segments/{id}/accounts | Add Segments Accounts
*CustomerSegmentApi* | [**deleteSegment**](docs/CustomerSegmentApi.md#deleteSegment) | **DELETE** /commerce/customer/segments/{id} | Delete Segment
*CustomerSegmentApi* | [**getSegment**](docs/CustomerSegmentApi.md#getSegment) | **GET** /commerce/customer/segments/{id} | Get Segment
*CustomerSegmentApi* | [**getSegments**](docs/CustomerSegmentApi.md#getSegments) | **GET** /commerce/customer/segments | Get Segments
*CustomerSegmentApi* | [**removeSegmentAccount**](docs/CustomerSegmentApi.md#removeSegmentAccount) | **DELETE** /commerce/customer/segments/{id}/accounts/{accountId} | Remove Segment Account
*CustomerSegmentApi* | [**updateSegment**](docs/CustomerSegmentApi.md#updateSegment) | **PUT** /commerce/customer/segments/{id} | Update Segment
*CustomerSetApi* | [**getCustomerSet**](docs/CustomerSetApi.md#getCustomerSet) | **GET** /commerce/customer/customerSets/{code} | Get Customer Set
*CustomerSetApi* | [**getCustomerSets**](docs/CustomerSetApi.md#getCustomerSets) | **GET** /commerce/customer/customerSets | Get Customer Sets
*CustomerVisitApi* | [**addVisit**](docs/CustomerVisitApi.md#addVisit) | **POST** /commerce/customer/visits | Add Visit
*CustomerVisitApi* | [**getVisit**](docs/CustomerVisitApi.md#getVisit) | **GET** /commerce/customer/visits/{visitId} | Get Visit
*CustomerVisitApi* | [**getVisits**](docs/CustomerVisitApi.md#getVisits) | **GET** /commerce/customer/visits | Get Visits
*CustomerVisitApi* | [**updateVisit**](docs/CustomerVisitApi.md#updateVisit) | **PUT** /commerce/customer/visits/{visitId} | Updates Visit
*InStockNotificationSubscriptionApi* | [**addInStockNotificationSubscription**](docs/InStockNotificationSubscriptionApi.md#addInStockNotificationSubscription) | **POST** /commerce/instocknotifications | Add In Stock Notification Subscription
*InStockNotificationSubscriptionApi* | [**deleteInStockNotificationSubscription**](docs/InStockNotificationSubscriptionApi.md#deleteInStockNotificationSubscription) | **DELETE** /commerce/instocknotifications/{id} | Delete In Stock Notification Subscription
*InStockNotificationSubscriptionApi* | [**getInStockNotificationSubscription**](docs/InStockNotificationSubscriptionApi.md#getInStockNotificationSubscription) | **GET** /commerce/instocknotifications/{id} | Get In Stock Notification Subscription
*InStockNotificationSubscriptionApi* | [**getInStockNotificationSubscriptions**](docs/InStockNotificationSubscriptionApi.md#getInStockNotificationSubscriptions) | **GET** /commerce/instocknotifications | Get In Stock Notification Subscriptions
*StorefrontAuthTicketApi* | [**createAnonymousShopperAuthTicket**](docs/StorefrontAuthTicketApi.md#createAnonymousShopperAuthTicket) | **GET** /commerce/customer/authtickets/anonymousshopper | Create Anonymous Shopper Auth Ticket
*StorefrontAuthTicketApi* | [**createUserAuthTicket**](docs/StorefrontAuthTicketApi.md#createUserAuthTicket) | **POST** /commerce/customer/authtickets | Create User Auth Ticket
*StorefrontAuthTicketApi* | [**refreshUserAuthTicket**](docs/StorefrontAuthTicketApi.md#refreshUserAuthTicket) | **PUT** /commerce/customer/authtickets/refresh | Refresh User Auth Ticket


## Documentation for Models

 - [AccountBase](docs/AccountBase.md)
 - [AccountHierarchyNode](docs/AccountHierarchyNode.md)
 - [AccountPasswordInfo](docs/AccountPasswordInfo.md)
 - [AccountPasswordInfoCollection](docs/AccountPasswordInfoCollection.md)
 - [AccountSalesRep](docs/AccountSalesRep.md)
 - [AddressValidationRequest](docs/AddressValidationRequest.md)
 - [AddressValidationResponse](docs/AddressValidationResponse.md)
 - [AdminUserAuditInfo](docs/AdminUserAuditInfo.md)
 - [AttributeValueLocalizedContent](docs/AttributeValueLocalizedContent.md)
 - [B2BAccount](docs/B2BAccount.md)
 - [B2BAccountCollection](docs/B2BAccountCollection.md)
 - [B2BAccountHierarchyResult](docs/B2BAccountHierarchyResult.md)
 - [B2BUser](docs/B2BUser.md)
 - [B2BUserAndAuthInfo](docs/B2BUserAndAuthInfo.md)
 - [B2BUserCollection](docs/B2BUserCollection.md)
 - [Card](docs/Card.md)
 - [CardCollection](docs/CardCollection.md)
 - [ChangePasswordResult](docs/ChangePasswordResult.md)
 - [ChangePasswordResultCollection](docs/ChangePasswordResultCollection.md)
 - [CommerceRuntimeAddress](docs/CommerceRuntimeAddress.md)
 - [CommerceRuntimeAttribute](docs/CommerceRuntimeAttribute.md)
 - [CommerceRuntimeAttributeCollection](docs/CommerceRuntimeAttributeCollection.md)
 - [CommerceRuntimeAttributeLocalizedContent](docs/CommerceRuntimeAttributeLocalizedContent.md)
 - [CommerceRuntimeAttributeMetadataItem](docs/CommerceRuntimeAttributeMetadataItem.md)
 - [CommerceRuntimeAttributeValidation](docs/CommerceRuntimeAttributeValidation.md)
 - [CommerceRuntimeAttributeVocabularyValue](docs/CommerceRuntimeAttributeVocabularyValue.md)
 - [CommerceRuntimePhone](docs/CommerceRuntimePhone.md)
 - [CommerceSummary](docs/CommerceSummary.md)
 - [ConfirmationInfo](docs/ConfirmationInfo.md)
 - [ContactType](docs/ContactType.md)
 - [CreditAuditEntry](docs/CreditAuditEntry.md)
 - [CreditAuditEntryCollection](docs/CreditAuditEntryCollection.md)
 - [CreditCollection](docs/CreditCollection.md)
 - [CreditTransaction](docs/CreditTransaction.md)
 - [CreditTransactionCollection](docs/CreditTransactionCollection.md)
 - [CurrencyAmount](docs/CurrencyAmount.md)
 - [CustomerAccount](docs/CustomerAccount.md)
 - [CustomerAccountAndAuthInfo](docs/CustomerAccountAndAuthInfo.md)
 - [CustomerAccountCollection](docs/CustomerAccountCollection.md)
 - [CustomerAttribute](docs/CustomerAttribute.md)
 - [CustomerAttributeCollection](docs/CustomerAttributeCollection.md)
 - [CustomerAuditEntry](docs/CustomerAuditEntry.md)
 - [CustomerAuditEntryCollection](docs/CustomerAuditEntryCollection.md)
 - [CustomerAuthTicket](docs/CustomerAuthTicket.md)
 - [CustomerContact](docs/CustomerContact.md)
 - [CustomerContactCollection](docs/CustomerContactCollection.md)
 - [CustomerCredit](docs/CustomerCredit.md)
 - [CustomerCustomerSegment](docs/CustomerCustomerSegment.md)
 - [CustomerLoginInfo](docs/CustomerLoginInfo.md)
 - [CustomerNote](docs/CustomerNote.md)
 - [CustomerNoteCollection](docs/CustomerNoteCollection.md)
 - [CustomerPasswordInfo](docs/CustomerPasswordInfo.md)
 - [CustomerPurchaseOrderAccount](docs/CustomerPurchaseOrderAccount.md)
 - [CustomerPurchaseOrderAccountCollection](docs/CustomerPurchaseOrderAccountCollection.md)
 - [CustomerPurchaseOrderPaymentTerm](docs/CustomerPurchaseOrderPaymentTerm.md)
 - [CustomerResetPasswordInfo](docs/CustomerResetPasswordInfo.md)
 - [CustomerSegmentCollection](docs/CustomerSegmentCollection.md)
 - [CustomerSet](docs/CustomerSet.md)
 - [CustomerSetAggregateInfo](docs/CustomerSetAggregateInfo.md)
 - [CustomerSetCollection](docs/CustomerSetCollection.md)
 - [CustomerSetSite](docs/CustomerSetSite.md)
 - [CustomerUserAuthInfo](docs/CustomerUserAuthInfo.md)
 - [CustomerUserRoleCollection](docs/CustomerUserRoleCollection.md)
 - [ExtendedCustomerContact](docs/ExtendedCustomerContact.md)
 - [ExtendedCustomerContactCollection](docs/ExtendedCustomerContactCollection.md)
 - [InStockNotificationSubscription](docs/InStockNotificationSubscription.md)
 - [InStockNotificationSubscriptionCollection](docs/InStockNotificationSubscriptionCollection.md)
 - [LoginState](docs/LoginState.md)
 - [PurchaseOrderTransaction](docs/PurchaseOrderTransaction.md)
 - [PurchaseOrderTransactionCollection](docs/PurchaseOrderTransactionCollection.md)
 - [Resource](docs/Resource.md)
 - [Transaction](docs/Transaction.md)
 - [UpgradeToB2BAccountError](docs/UpgradeToB2BAccountError.md)
 - [UpgradeToB2BAccountResponse](docs/UpgradeToB2BAccountResponse.md)
 - [UserRole](docs/UserRole.md)
 - [UserScope](docs/UserScope.md)
 - [Visit](docs/Visit.md)
 - [VisitCollection](docs/VisitCollection.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### bearerAuth

- **Type**: HTTP basic authentication

### clientOauth2

- **Type**: OAuth
- **Flow**: application
- **Authorization URL**: 
- **Scopes**: N/A


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



