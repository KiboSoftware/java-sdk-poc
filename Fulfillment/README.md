# fulfillment

Kibo Fulfillment Service
- API version: 1.0.0

OpenAPI Spec for Kibo Fulfillment Service


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
  <artifactId>fulfillment</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'fulfillment' jar has been published to maven central.
    mavenLocal()       // Needed if the 'fulfillment' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "com.kibocommerce:fulfillment:1.0.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/fulfillment-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.CustomerSurveyApi;

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

    CustomerSurveyApi apiInstance = new CustomerSurveyApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    CustomerSurvey customerSurvey = new CustomerSurvey(); // CustomerSurvey | 
    try {
      EntityModelOfCustomerSurvey result = apiInstance.createSurveyUsingPOST(shipmentNumber, customerSurvey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerSurveyApi#createSurveyUsingPOST");
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
*CustomerSurveyApi* | [**createSurveyUsingPOST**](docs/CustomerSurveyApi.md#createSurveyUsingPOST) | **POST** /commerce/shipments/{shipmentNumber}/surveys | Create Survey
*CustomerSurveyApi* | [**getSurveyUsingGET**](docs/CustomerSurveyApi.md#getSurveyUsingGET) | **GET** /commerce/shipments/surveys/{id} | Get Survey
*CustomerSurveyApi* | [**getSurveysUsingGET**](docs/CustomerSurveyApi.md#getSurveysUsingGET) | **GET** /commerce/shipments/{shipmentNumber}/surveys | Get Surveys
*FulfillmentApi* | [**getPublicSettingsUsingGET**](docs/FulfillmentApi.md#getPublicSettingsUsingGET) | **GET** /commerce/fulfillment/settings | Get Public Settings
*FulfillmentStorefrontApi* | [**getShipmentUsingGET1**](docs/FulfillmentStorefrontApi.md#getShipmentUsingGET1) | **GET** /commerce/fulfillment/storefront/shipments/{shipmentNumber} | Get Shipment
*FulfillmentStorefrontApi* | [**getShipmentsUsingGET1**](docs/FulfillmentStorefrontApi.md#getShipmentsUsingGET1) | **GET** /commerce/fulfillment/storefront/shipments | Get Shipments
*FulfillmentWorkflowApi* | [**getDefinitionImageUsingGET**](docs/FulfillmentWorkflowApi.md#getDefinitionImageUsingGET) | **GET** /commerce/processes/definitionImage/{containerIdOrAlias}/{processId} | Get Definition Image
*FulfillmentWorkflowApi* | [**getWorkflowProcessByShipmentTypeLocationCodeUsingGET**](docs/FulfillmentWorkflowApi.md#getWorkflowProcessByShipmentTypeLocationCodeUsingGET) | **GET** /commerce/processes/shipmentType/{shipmentType}/location/{locationCode} | Get Workflow Process by Shipment Type and Location Code
*FulfillmentWorkflowApi* | [**getWorkflowProcessByShipmentTypeLocationGroupCodeUsingGET**](docs/FulfillmentWorkflowApi.md#getWorkflowProcessByShipmentTypeLocationGroupCodeUsingGET) | **GET** /commerce/processes/shipmentType/{shipmentType}/locationGroup/{locationGroupCode} | Get Workflow Process by Shipment Type and Location Group Code
*FulfillmentWorkflowApi* | [**getWorkflowProcessByShipmentTypeUsingGET**](docs/FulfillmentWorkflowApi.md#getWorkflowProcessByShipmentTypeUsingGET) | **GET** /commerce/processes/shipmentType/{shipmentType} | Get Workflow Process by Shipment Type
*FulfillmentWorkflowApi* | [**getWorkflowProcessUsingGET**](docs/FulfillmentWorkflowApi.md#getWorkflowProcessUsingGET) | **GET** /commerce/processes/definitions/{containerIdOrAlias}/{processId} | Get Workflow Process
*FulfillmentWorkflowApi* | [**getWorkflowProcessesUsingGET**](docs/FulfillmentWorkflowApi.md#getWorkflowProcessesUsingGET) | **GET** /commerce/processes/definitions | Get Workflow Processes
*FutureShipmentApi* | [**createFutureShipmentsForItemsUsingPOST**](docs/FutureShipmentApi.md#createFutureShipmentsForItemsUsingPOST) | **POST** /commerce/shipments/{shipmentNumber}/futureItems | Create Future Shipments for Items
*FutureShipmentApi* | [**futureShipmentToReadyUsingPUT**](docs/FutureShipmentApi.md#futureShipmentToReadyUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/futureToReady | Future Shipment to Ready
*FutureShipmentApi* | [**updateFutureShipmentDateUsingPUT**](docs/FutureShipmentApi.md#updateFutureShipmentDateUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/futureUpdateDate | Update Future Shipment Date
*PickWaveApi* | [**closePickWaveUsingPUT**](docs/PickWaveApi.md#closePickWaveUsingPUT) | **PUT** /commerce/pickwaves/{pickWaveNumber}/closed | Close Pick Wave
*PickWaveApi* | [**createPickWaveUsingPOST**](docs/PickWaveApi.md#createPickWaveUsingPOST) | **POST** /commerce/pickwaves | Create Pick Wave
*PickWaveApi* | [**getOpenPickWavesUsingGET**](docs/PickWaveApi.md#getOpenPickWavesUsingGET) | **GET** /commerce/pickwaves/open/{fulfillmentLocationCode} | Get Open Pick Waves
*PickWaveApi* | [**getPickWaveDetailsUsingGET**](docs/PickWaveApi.md#getPickWaveDetailsUsingGET) | **GET** /commerce/pickwaves/{pickWaveNumber}/pickWaveDetails | Get Pick Wave Details
*PickWaveApi* | [**getPickWaveUsingGET**](docs/PickWaveApi.md#getPickWaveUsingGET) | **GET** /commerce/pickwaves/{pickWaveNumber} | Get Pick Wave
*PickWaveApi* | [**getShipmentsInPickWaveUsingGET**](docs/PickWaveApi.md#getShipmentsInPickWaveUsingGET) | **GET** /commerce/pickwaves/{pickWaveNumber}/shipments | Get Shipments in Pick Wave
*PickWaveApi* | [**renderOrderPickSheetsUsingGET**](docs/PickWaveApi.md#renderOrderPickSheetsUsingGET) | **GET** /commerce/pickwaves/{pickWaveNumber}/order-pick-sheets/html | Render Pick Wave Order Sheets
*PickWaveApi* | [**renderPickWaveUsingGET**](docs/PickWaveApi.md#renderPickWaveUsingGET) | **GET** /commerce/pickwaves/{pickWaveNumber}/rendition/html | Render Pick Wave
*RenditionApi* | [**renderOrderSummaryUsingGET**](docs/RenditionApi.md#renderOrderSummaryUsingGET) | **GET** /commerce/fulfillment/orders/{orderId}/summary/html | Render Order Summary
*RenditionApi* | [**renderReturnReceiptUsingGET**](docs/RenditionApi.md#renderReturnReceiptUsingGET) | **GET** /commerce/fulfillment/returns/{returnId}/receipt/html | Render Return Receipt
*ShipmentApi* | [**backorderItemsUpdateUsingPUT**](docs/ShipmentApi.md#backorderItemsUpdateUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/backorderedItems | Backorder Items Update
*ShipmentApi* | [**backorderItemsUsingPOST**](docs/ShipmentApi.md#backorderItemsUsingPOST) | **POST** /commerce/shipments/{shipmentNumber}/backorderedItems | Backorder Items
*ShipmentApi* | [**backorderShipmentUsingPOST**](docs/ShipmentApi.md#backorderShipmentUsingPOST) | **POST** /commerce/shipments/{shipmentNumber}/backordered | Backorder Shipment
*ShipmentApi* | [**cancelItemsUsingPUT**](docs/ShipmentApi.md#cancelItemsUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/canceledItems | Cancel Items
*ShipmentApi* | [**cancelShipmentUsingPUT**](docs/ShipmentApi.md#cancelShipmentUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/canceled | Cancel Shipment
*ShipmentApi* | [**cancelShipmentsUsingPUT**](docs/ShipmentApi.md#cancelShipmentsUsingPUT) | **PUT** /commerce/shipments/order/{orderId}/canceled | Cancel Shipments
*ShipmentApi* | [**customerAtCurbsideUsingPUT**](docs/ShipmentApi.md#customerAtCurbsideUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/customerAtCurbside | Customer At Curbside
*ShipmentApi* | [**customerAtStoreUsingPUT**](docs/ShipmentApi.md#customerAtStoreUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/customerAtStore | Customer At Store
*ShipmentApi* | [**customerCareItemsUsingPOST**](docs/ShipmentApi.md#customerCareItemsUsingPOST) | **POST** /commerce/shipments/{shipmentNumber}/customerCaredItems | Customer Care Items
*ShipmentApi* | [**customerCareShipmentUsingPUT**](docs/ShipmentApi.md#customerCareShipmentUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/customerCared | Customer Care Shipment
*ShipmentApi* | [**customerInTransitUsingPUT**](docs/ShipmentApi.md#customerInTransitUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/customerInTransit | Customer In Transit
*ShipmentApi* | [**deleteShipmentUsingDELETE**](docs/ShipmentApi.md#deleteShipmentUsingDELETE) | **DELETE** /commerce/shipments/{shipmentNumber} | Delete Shipment
*ShipmentApi* | [**deleteShipmentsOfOrderUsingDELETE**](docs/ShipmentApi.md#deleteShipmentsOfOrderUsingDELETE) | **DELETE** /commerce/shipments/order/{orderId} | Delete Shipments from Order
*ShipmentApi* | [**destinationUpdateUsingPUT**](docs/ShipmentApi.md#destinationUpdateUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/destination | Update Destination
*ShipmentApi* | [**executeUsingPUT**](docs/ShipmentApi.md#executeUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/tasks/{taskName}/completed | Complete Workflow Task
*ShipmentApi* | [**fulfillShipmentUsingPUT**](docs/ShipmentApi.md#fulfillShipmentUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/fulfilled | Fulfill Shipment
*ShipmentApi* | [**getLocationSummaryReportUsingGET**](docs/ShipmentApi.md#getLocationSummaryReportUsingGET) | **GET** /commerce/shipments/locationSummaryReport | Get Location Summary Report
*ShipmentApi* | [**getShipmentStepCountByShipmentTypeUsingGET**](docs/ShipmentApi.md#getShipmentStepCountByShipmentTypeUsingGET) | **GET** /commerce/shipments/countsByStep | Get Workflow Task Counts
*ShipmentApi* | [**getShipmentUsingGET**](docs/ShipmentApi.md#getShipmentUsingGET) | **GET** /commerce/shipments/{shipmentNumber} | Get Shipment
*ShipmentApi* | [**getShipmentsUsingGET**](docs/ShipmentApi.md#getShipmentsUsingGET) | **GET** /commerce/shipments | Get Shipments
*ShipmentApi* | [**getTasksUsingGET**](docs/ShipmentApi.md#getTasksUsingGET) | **GET** /commerce/shipments/{shipmentNumber}/tasks | Get Workflow Tasks
*ShipmentApi* | [**newShipmentUsingPOST**](docs/ShipmentApi.md#newShipmentUsingPOST) | **POST** /commerce/shipments | Create Shipment
*ShipmentApi* | [**newShipmentsUsingPOST**](docs/ShipmentApi.md#newShipmentsUsingPOST) | **POST** /commerce/shipments/bulk | Bulk Create Shipments
*ShipmentApi* | [**pickupItemsUsingPOST**](docs/ShipmentApi.md#pickupItemsUsingPOST) | **POST** /commerce/shipments/{shipmentNumber}/pickedUpItems | Pickup Items
*ShipmentApi* | [**reassignItemsUsingPUT**](docs/ShipmentApi.md#reassignItemsUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/reassignedItems | Reassign Items
*ShipmentApi* | [**reassignShipmentUsingPUT**](docs/ShipmentApi.md#reassignShipmentUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/reassigned | Reassign Shipment
*ShipmentApi* | [**receiveTransferUsingPUT**](docs/ShipmentApi.md#receiveTransferUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/received | Receive Transfer
*ShipmentApi* | [**refreshShipmentUsingPUT**](docs/ShipmentApi.md#refreshShipmentUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/refresh | Refresh Shipment
*ShipmentApi* | [**rejectItemsUsingPUT**](docs/ShipmentApi.md#rejectItemsUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/rejectedItems | Reject Items
*ShipmentApi* | [**rejectShipmentUsingPUT**](docs/ShipmentApi.md#rejectShipmentUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/rejected | Reject Shipment
*ShipmentApi* | [**renderOrderSummaryUsingGET1**](docs/ShipmentApi.md#renderOrderSummaryUsingGET1) | **GET** /commerce/shipments/{shipmentNumber}/order-summary/html | Render Order Summary by Shipment Number
*ShipmentApi* | [**renderPackingSlipUsingGET**](docs/ShipmentApi.md#renderPackingSlipUsingGET) | **GET** /commerce/shipments/{shipmentNumber}/rendition/html | Render Shipment Packing Slip
*ShipmentApi* | [**replaceShipmentUsingPUT**](docs/ShipmentApi.md#replaceShipmentUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber} | Update Shipment
*ShipmentApi* | [**resendItemEmailUsingPUT**](docs/ShipmentApi.md#resendItemEmailUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/items/{lineId}/email/resend | Resend Item Email
*ShipmentApi* | [**resendShipmentEmailUsingPUT**](docs/ShipmentApi.md#resendShipmentEmailUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/email/resend | Resend Shipment Email
*ShipmentApi* | [**retryFulfillingShipmentUsingPUT**](docs/ShipmentApi.md#retryFulfillingShipmentUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/retried | Retry Fulfilling Shipment
*ShipmentApi* | [**revertUsingPUT**](docs/ShipmentApi.md#revertUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/tasks/{taskName}/reverted | Revert Workflow Task
*ShipmentApi* | [**searchAndReceiveTransferUsingPUT**](docs/ShipmentApi.md#searchAndReceiveTransferUsingPUT) | **PUT** /commerce/shipments/received/{search} | Find and Receive Transfer
*ShipmentApi* | [**skipTaskUsingPUT**](docs/ShipmentApi.md#skipTaskUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/tasks/{taskName}/skipped | Skip Workflow Task
*ShipmentApi* | [**transferItemsUsingPUT**](docs/ShipmentApi.md#transferItemsUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/transferredItems | Transfer Items
*ShipmentApi* | [**transferShipmentUsingPUT**](docs/ShipmentApi.md#transferShipmentUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/transferred | Transfer Shipment
*ShipmentApi* | [**updateFulfillmentFieldsUsingPUT**](docs/ShipmentApi.md#updateFulfillmentFieldsUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/fulfillmentFields | Update Fulfillment Fields
*ShipmentApi* | [**updateGiftCardInfoUsingPUT**](docs/ShipmentApi.md#updateGiftCardInfoUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/giftCardInfo | Update Gift Card Info
*ShipmentApi* | [**workflowDefinitionImageUsingGET**](docs/ShipmentApi.md#workflowDefinitionImageUsingGET) | **GET** /commerce/shipments/{shipmentNumber}/workflow-definition-image | Get Workflow Definition Image
*ShipmentApi* | [**workflowInstanceImageUsingGET**](docs/ShipmentApi.md#workflowInstanceImageUsingGET) | **GET** /commerce/shipments/{shipmentNumber}/workflow-instance-image | Get Workflow Instance Image
*ShipmentAttributesApi* | [**deleteShipmentAttributeUsingDELETE**](docs/ShipmentAttributesApi.md#deleteShipmentAttributeUsingDELETE) | **DELETE** /commerce/shipments/{shipmentNumber}/attributes/{key} | Delete Shipment Attribute
*ShipmentAttributesApi* | [**getShipmentAttributeUsingGET**](docs/ShipmentAttributesApi.md#getShipmentAttributeUsingGET) | **GET** /commerce/shipments/{shipmentNumber}/attributes/{key} | Get Shipment Attribute
*ShipmentAttributesApi* | [**getShipmentAttributesUsingGET**](docs/ShipmentAttributesApi.md#getShipmentAttributesUsingGET) | **GET** /commerce/shipments/{shipmentNumber}/attributes | Get Shipment Attributes
*ShipmentAttributesApi* | [**setShipmentAttributeUsingPUT**](docs/ShipmentAttributesApi.md#setShipmentAttributeUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/attributes/{key} | Set Shipment Attribute
*ShipmentAttributesApi* | [**setShipmentAttributesUsingPUT**](docs/ShipmentAttributesApi.md#setShipmentAttributesUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/attributes | Set Shipment Attributes
*ShipmentContactApi* | [**deleteAlternateContactUsingDELETE**](docs/ShipmentContactApi.md#deleteAlternateContactUsingDELETE) | **DELETE** /commerce/shipments/{shipmentNumber}/alternateContact | Delete Alternate Contact
*ShipmentContactApi* | [**getAlternateContactUsingGET**](docs/ShipmentContactApi.md#getAlternateContactUsingGET) | **GET** /commerce/shipments/{shipmentNumber}/alternateContact | Get Alternate Contact
*ShipmentContactApi* | [**getCustomerContactUsingGET**](docs/ShipmentContactApi.md#getCustomerContactUsingGET) | **GET** /commerce/shipments/{shipmentNumber}/customerContact | Get Customer Contact
*ShipmentContactApi* | [**getDestinationContactUsingGET**](docs/ShipmentContactApi.md#getDestinationContactUsingGET) | **GET** /commerce/shipments/{shipmentNumber}/destinationContact | Get Destination Contact
*ShipmentContactApi* | [**updateAlternateContactUsingPUT**](docs/ShipmentContactApi.md#updateAlternateContactUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/alternateContact | Update Alternate Contact
*ShipmentContactApi* | [**updateCustomerContactUsingPUT**](docs/ShipmentContactApi.md#updateCustomerContactUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/customerContact | Update Customer Contact
*ShipmentContactApi* | [**updateDestinationContactUsingPUT**](docs/ShipmentContactApi.md#updateDestinationContactUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/destinationContact | Update Destination Contact
*ShipmentDataApi* | [**deleteShipmentDataByKeyUsingDELETE**](docs/ShipmentDataApi.md#deleteShipmentDataByKeyUsingDELETE) | **DELETE** /commerce/shipments/{shipmentNumber}/data/{key} | Delete Shipment Data by Key
*ShipmentDataApi* | [**deleteShipmentDataUsingDELETE**](docs/ShipmentDataApi.md#deleteShipmentDataUsingDELETE) | **DELETE** /commerce/shipments/{shipmentNumber}/data | Delete Shipment Data
*ShipmentDataApi* | [**deleteShipmentItemDataByKeyUsingDELETE**](docs/ShipmentDataApi.md#deleteShipmentItemDataByKeyUsingDELETE) | **DELETE** /commerce/shipments/{shipmentNumber}/items/{lineId}/data/{key} | Delete Shipment Item Data by Key
*ShipmentDataApi* | [**deleteShipmentItemDataUsingDELETE**](docs/ShipmentDataApi.md#deleteShipmentItemDataUsingDELETE) | **DELETE** /commerce/shipments/{shipmentNumber}/items/{lineId}/data | Delete Shipment Item Data
*ShipmentDataApi* | [**getShipmentDataUsingGET**](docs/ShipmentDataApi.md#getShipmentDataUsingGET) | **GET** /commerce/shipments/{shipmentNumber}/data | Get Shipment Data
*ShipmentDataApi* | [**getShipmentItemDataUsingGET**](docs/ShipmentDataApi.md#getShipmentItemDataUsingGET) | **GET** /commerce/shipments/{shipmentNumber}/items/{lineId}/data | Get Shipment Item Data
*ShipmentDataApi* | [**replaceShipmentDataUsingPUT**](docs/ShipmentDataApi.md#replaceShipmentDataUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/data | Replace Shipment Data
*ShipmentDataApi* | [**replaceShipmentItemDataUsingPUT**](docs/ShipmentDataApi.md#replaceShipmentItemDataUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/items/{lineId}/data | Replace Shipment Item Data
*ShipmentNotesApi* | [**deleteShipmentNoteUsingDELETE**](docs/ShipmentNotesApi.md#deleteShipmentNoteUsingDELETE) | **DELETE** /commerce/shipments/{shipmentNumber}/notes/{noteId} | Delete Shipment Note
*ShipmentNotesApi* | [**newShipmentNoteUsingPOST**](docs/ShipmentNotesApi.md#newShipmentNoteUsingPOST) | **POST** /commerce/shipments/{shipmentNumber}/notes | Create Shipment Note
*ShipmentNotesApi* | [**updateShipmentNoteUsingPUT**](docs/ShipmentNotesApi.md#updateShipmentNoteUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/notes/{noteId} | Update Shipment Note
*ShipmentPackagesApi* | [**deleteShipmentPackageUsingDELETE**](docs/ShipmentPackagesApi.md#deleteShipmentPackageUsingDELETE) | **DELETE** /commerce/shipments/{shipmentNumber}/packages/{packageId} | Delete Shipment Package
*ShipmentPackagesApi* | [**deleteShipmentPackagesUsingDELETE**](docs/ShipmentPackagesApi.md#deleteShipmentPackagesUsingDELETE) | **DELETE** /commerce/shipments/{shipmentNumber}/packages/bulk | Delete Shipment Packages
*ShipmentPackagesApi* | [**newPackageUsingPOST**](docs/ShipmentPackagesApi.md#newPackageUsingPOST) | **POST** /commerce/shipments/{shipmentNumber}/packages | Create Shipment Package
*ShipmentPackagesApi* | [**newPackagesUsingPOST**](docs/ShipmentPackagesApi.md#newPackagesUsingPOST) | **POST** /commerce/shipments/{shipmentNumber}/packages/bulk | Bulk Create Shipment Packages
*ShipmentPackagesApi* | [**updatePackageUsingPUT**](docs/ShipmentPackagesApi.md#updatePackageUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/packages/{packageId} | Update Shipment Package
*ShippingManifestApi* | [**createManifestUsingPOST**](docs/ShippingManifestApi.md#createManifestUsingPOST) | **POST** /commerce/fulfillment/shipping/manifests | Create Manifest
*ShippingManifestApi* | [**getEligibleShipmentsUsingGET**](docs/ShippingManifestApi.md#getEligibleShipmentsUsingGET) | **GET** /commerce/fulfillment/shipping/manifests/eligibleShipments | Get Eligible Shipments
*ShippingManifestApi* | [**getManifestUsingGET**](docs/ShippingManifestApi.md#getManifestUsingGET) | **GET** /commerce/fulfillment/shipping/manifests/{manifestId} | Get Manifest
*ShippingManifestApi* | [**getManifestsUsingGET**](docs/ShippingManifestApi.md#getManifestsUsingGET) | **GET** /commerce/fulfillment/shipping/manifests | Get Manifests
*ShippingNotificationApi* | [**handleCarrierNotificationUsingPOST**](docs/ShippingNotificationApi.md#handleCarrierNotificationUsingPOST) | **POST** /commerce/fulfillment/shipping/notifications/{carrier} | Handle Carrier Notification


## Documentation for Models

 - [AuditInfo0](docs/AuditInfo0.md)
 - [BackorderItem](docs/BackorderItem.md)
 - [BackorderItemUpdate](docs/BackorderItemUpdate.md)
 - [BackorderItemsRequest](docs/BackorderItemsRequest.md)
 - [BackorderItemsUpdateRequest](docs/BackorderItemsUpdateRequest.md)
 - [BackorderShipmentRequest](docs/BackorderShipmentRequest.md)
 - [BinShipmentProductQuantity](docs/BinShipmentProductQuantity.md)
 - [BpmVariable](docs/BpmVariable.md)
 - [CancelItem](docs/CancelItem.md)
 - [CancelItemsRequest](docs/CancelItemsRequest.md)
 - [CancelShipment](docs/CancelShipment.md)
 - [ClosePickWave](docs/ClosePickWave.md)
 - [CollectionModelOfEntityModelOfCustomerSurvey](docs/CollectionModelOfEntityModelOfCustomerSurvey.md)
 - [CollectionModelOfEntityModelOfShipment](docs/CollectionModelOfEntityModelOfShipment.md)
 - [CollectionModelOfLocationSummary](docs/CollectionModelOfLocationSummary.md)
 - [CollectionModelOfManifest](docs/CollectionModelOfManifest.md)
 - [CollectionModelOfPickWave](docs/CollectionModelOfPickWave.md)
 - [CollectionModelOfShipment](docs/CollectionModelOfShipment.md)
 - [CollectionModelOfTask](docs/CollectionModelOfTask.md)
 - [ContentGroup](docs/ContentGroup.md)
 - [CreatePickWave](docs/CreatePickWave.md)
 - [CustomerSurvey](docs/CustomerSurvey.md)
 - [CustomerSurveyEntry](docs/CustomerSurveyEntry.md)
 - [DashboardStep](docs/DashboardStep.md)
 - [EntityModelOfContact](docs/EntityModelOfContact.md)
 - [EntityModelOfCustomerSurvey](docs/EntityModelOfCustomerSurvey.md)
 - [EntityModelOfDashboardResponse](docs/EntityModelOfDashboardResponse.md)
 - [EntityModelOfManifest](docs/EntityModelOfManifest.md)
 - [EntityModelOfPickWave](docs/EntityModelOfPickWave.md)
 - [EntityModelOfPickWaveDetail](docs/EntityModelOfPickWaveDetail.md)
 - [EntityModelOfShipment](docs/EntityModelOfShipment.md)
 - [EntityModelOfWorkflowProcess](docs/EntityModelOfWorkflowProcess.md)
 - [EntityModelOfstring](docs/EntityModelOfstring.md)
 - [FulfillmentAddress](docs/FulfillmentAddress.md)
 - [FulfillmentAppeasementReason](docs/FulfillmentAppeasementReason.md)
 - [FulfillmentAuditInfo](docs/FulfillmentAuditInfo.md)
 - [FulfillmentCanceledItem](docs/FulfillmentCanceledItem.md)
 - [FulfillmentCanceledReason](docs/FulfillmentCanceledReason.md)
 - [FulfillmentChangeMessage](docs/FulfillmentChangeMessage.md)
 - [FulfillmentContact](docs/FulfillmentContact.md)
 - [FulfillmentCustomer](docs/FulfillmentCustomer.md)
 - [FulfillmentDestination](docs/FulfillmentDestination.md)
 - [FulfillmentFulfillmentField](docs/FulfillmentFulfillmentField.md)
 - [FulfillmentFulfillmentShopperNotes](docs/FulfillmentFulfillmentShopperNotes.md)
 - [FulfillmentGiftCard](docs/FulfillmentGiftCard.md)
 - [FulfillmentInventoryTag](docs/FulfillmentInventoryTag.md)
 - [FulfillmentItem](docs/FulfillmentItem.md)
 - [FulfillmentLink](docs/FulfillmentLink.md)
 - [FulfillmentManifestRequest](docs/FulfillmentManifestRequest.md)
 - [FulfillmentManifestShipment](docs/FulfillmentManifestShipment.md)
 - [FulfillmentMeasurement](docs/FulfillmentMeasurement.md)
 - [FulfillmentPackage](docs/FulfillmentPackage.md)
 - [FulfillmentPackageMeasurements](docs/FulfillmentPackageMeasurements.md)
 - [FulfillmentPhone](docs/FulfillmentPhone.md)
 - [FulfillmentPickupItem](docs/FulfillmentPickupItem.md)
 - [FulfillmentProductOption](docs/FulfillmentProductOption.md)
 - [FulfillmentShipment](docs/FulfillmentShipment.md)
 - [FulfillmentShipmentNote](docs/FulfillmentShipmentNote.md)
 - [FulfillmentShipmentStatusReason](docs/FulfillmentShipmentStatusReason.md)
 - [FulfillmentTaskInput](docs/FulfillmentTaskInput.md)
 - [FulfillmentTracking](docs/FulfillmentTracking.md)
 - [FulfillmentWorkflowState](docs/FulfillmentWorkflowState.md)
 - [FutureItem](docs/FutureItem.md)
 - [FutureItemsRequest](docs/FutureItemsRequest.md)
 - [FutureShipmentUpdateDateRequest](docs/FutureShipmentUpdateDateRequest.md)
 - [GiftCardInfoRequest](docs/GiftCardInfoRequest.md)
 - [HandleOption](docs/HandleOption.md)
 - [Links](docs/Links.md)
 - [LocationSummary](docs/LocationSummary.md)
 - [Manifest](docs/Manifest.md)
 - [ManifestRequestShipment](docs/ManifestRequestShipment.md)
 - [PackingSlipItemDetailDto](docs/PackingSlipItemDetailDto.md)
 - [PageMetadata](docs/PageMetadata.md)
 - [PagedModelOfEntityModelOfShipment](docs/PagedModelOfEntityModelOfShipment.md)
 - [PagedModelOfEntityModelOfWorkflowProcess](docs/PagedModelOfEntityModelOfWorkflowProcess.md)
 - [PickWave](docs/PickWave.md)
 - [PickWaveBinRange](docs/PickWaveBinRange.md)
 - [PickWaveContent](docs/PickWaveContent.md)
 - [PickWaveContent0](docs/PickWaveContent0.md)
 - [PickWaveProductMatch](docs/PickWaveProductMatch.md)
 - [PickupItemsRequest](docs/PickupItemsRequest.md)
 - [ProductOption0](docs/ProductOption0.md)
 - [ReassignItem](docs/ReassignItem.md)
 - [ReassignItemsRequest](docs/ReassignItemsRequest.md)
 - [ReassignShipment](docs/ReassignShipment.md)
 - [ReassignedItem](docs/ReassignedItem.md)
 - [ReassignedReason](docs/ReassignedReason.md)
 - [RejectItem](docs/RejectItem.md)
 - [RejectItemsRequest](docs/RejectItemsRequest.md)
 - [RejectShipment](docs/RejectShipment.md)
 - [RejectedItem](docs/RejectedItem.md)
 - [RejectedReason](docs/RejectedReason.md)
 - [ShipmentAttribute](docs/ShipmentAttribute.md)
 - [Task](docs/Task.md)
 - [TaskComplete](docs/TaskComplete.md)
 - [TaskDefinition](docs/TaskDefinition.md)
 - [TaskReason](docs/TaskReason.md)
 - [TransferItem](docs/TransferItem.md)
 - [TransferItemsRequest](docs/TransferItemsRequest.md)
 - [TransferShipment](docs/TransferShipment.md)
 - [TransferredItem](docs/TransferredItem.md)
 - [TransferredReason](docs/TransferredReason.md)
 - [UpdateContactRequest](docs/UpdateContactRequest.md)
 - [WorkflowProcessVariable](docs/WorkflowProcessVariable.md)


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


