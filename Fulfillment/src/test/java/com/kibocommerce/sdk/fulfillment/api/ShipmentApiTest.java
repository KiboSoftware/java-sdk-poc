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


package com.kibocommerce.sdk.fulfillment.api;

import com.kibocommerce.sdk.common.ApiException;
import com.kibocommerce.sdk.fulfillment.models.BackorderItemsRequest;
import com.kibocommerce.sdk.fulfillment.models.BackorderItemsUpdateRequest;
import com.kibocommerce.sdk.fulfillment.models.BackorderShipmentRequest;
import com.kibocommerce.sdk.fulfillment.models.CancelItemsRequest;
import com.kibocommerce.sdk.fulfillment.models.CancelShipment;
import com.kibocommerce.sdk.fulfillment.models.CollectionModelOfEntityModelOfShipment;
import com.kibocommerce.sdk.fulfillment.models.CollectionModelOfLocationSummary;
import com.kibocommerce.sdk.fulfillment.models.CollectionModelOfShipment;
import com.kibocommerce.sdk.fulfillment.models.CollectionModelOfTask;
import com.kibocommerce.sdk.fulfillment.models.EntityModelOfDashboardResponse;
import com.kibocommerce.sdk.fulfillment.models.EntityModelOfShipment;
import com.kibocommerce.sdk.fulfillment.models.EntityModelOfstring;
import com.kibocommerce.sdk.fulfillment.models.FulfillmentDestination;
import com.kibocommerce.sdk.fulfillment.models.FulfillmentItem;
import com.kibocommerce.sdk.fulfillment.models.FulfillmentShipment;
import com.kibocommerce.sdk.fulfillment.models.GiftCardInfoRequest;
import java.time.OffsetDateTime;
import com.kibocommerce.sdk.fulfillment.models.PagedModelOfEntityModelOfShipment;
import com.kibocommerce.sdk.fulfillment.models.PickupItemsRequest;
import com.kibocommerce.sdk.fulfillment.models.ReassignItemsRequest;
import com.kibocommerce.sdk.fulfillment.models.ReassignShipment;
import com.kibocommerce.sdk.fulfillment.models.RejectItemsRequest;
import com.kibocommerce.sdk.fulfillment.models.RejectShipment;
import com.kibocommerce.sdk.fulfillment.models.TaskComplete;
import com.kibocommerce.sdk.fulfillment.models.TransferItemsRequest;
import com.kibocommerce.sdk.fulfillment.models.TransferShipment;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ShipmentApi
 */
@Disabled
public class ShipmentApiTest {

    private final ShipmentApi api = new ShipmentApi();

    /**
     * Backorder Items Update
     *
     * When an item is in backorder, its expected release date can be modified to reflect any changes in inventory levels or manufacturing estimates. This should be kept up-to-date so that customer communications such as notification emails can accurately inform the customer about when their item is expected to be available or shipped.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void backorderItemsUpdateUsingPUTTest() throws ApiException {
        Integer shipmentNumber = null;
        String ifMatch = null;
        BackorderItemsUpdateRequest backorderItemsUpdateRequest = null;
        EntityModelOfShipment response = api.backorderItemsUpdateUsingPUT(shipmentNumber, ifMatch, backorderItemsUpdateRequest);
        // TODO: test validations
    }

    /**
     * Backorder Items
     *
     * If a shipment is accepted by a location but some items of the shipment are temporarily out of stock, those particular items can be placed on backorder. These items will be placed into a pending Backorder state until inventory is in stock, at which point they are “released” from backorder to continue with the fulfillment process. This will not backorder the entire shipment, only the particular items waiting for inventory.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void backorderItemsUsingPOSTTest() throws ApiException {
        Integer shipmentNumber = null;
        String ifMatch = null;
        BackorderItemsRequest backorderItemsRequest = null;
        EntityModelOfShipment response = api.backorderItemsUsingPOST(shipmentNumber, ifMatch, backorderItemsRequest);
        // TODO: test validations
    }

    /**
     * Backorder Shipment
     *
     * If a shipment is accepted by a location but the contents of the shipment are temporarily out of stock, the shipment can be placed on backorder. This means that the shipment will remain in the pending Backorder state while it waits for the inventory to be in stock, at which point it is “released” from backorder to continue with the fulfillment process.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void backorderShipmentUsingPOSTTest() throws ApiException {
        Integer shipmentNumber = null;
        String ifMatch = null;
        BackorderShipmentRequest backorderShipmentRequest = null;
        EntityModelOfShipment response = api.backorderShipmentUsingPOST(shipmentNumber, ifMatch, backorderShipmentRequest);
        // TODO: test validations
    }

    /**
     * Cancel Items
     *
     * Cancel Items
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void cancelItemsUsingPUTTest() throws ApiException {
        Integer shipmentNumber = null;
        String ifMatch = null;
        CancelItemsRequest cancelItemsRequest = null;
        EntityModelOfShipment response = api.cancelItemsUsingPUT(shipmentNumber, ifMatch, cancelItemsRequest);
        // TODO: test validations
    }

    /**
     * Cancel Shipment
     *
     * Cancel Shipment
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void cancelShipmentUsingPUTTest() throws ApiException {
        Integer shipmentNumber = null;
        String ifMatch = null;
        CancelShipment cancelShipment = null;
        EntityModelOfShipment response = api.cancelShipmentUsingPUT(shipmentNumber, ifMatch, cancelShipment);
        // TODO: test validations
    }

    /**
     * Cancel Shipments
     *
     * Cancel Shipments
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void cancelShipmentsUsingPUTTest() throws ApiException {
        String orderId = null;
        CancelShipment cancelShipment = null;
        CollectionModelOfShipment response = api.cancelShipmentsUsingPUT(orderId, cancelShipment);
        // TODO: test validations
    }

    /**
     * Customer At Curbside
     *
     * Indicate that a customer has arrived for curbside pickup of this shipment.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerAtCurbsideUsingPUTTest() throws ApiException {
        Integer shipmentNumber = null;
        String ifMatch = null;
        Map<String, Object> requestBody = null;
        EntityModelOfShipment response = api.customerAtCurbsideUsingPUT(shipmentNumber, ifMatch, requestBody);
        // TODO: test validations
    }

    /**
     * Customer At Store
     *
     * Indicate that the customer has arrived for store pickup of this shipment.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerAtStoreUsingPUTTest() throws ApiException {
        Integer shipmentNumber = null;
        String ifMatch = null;
        EntityModelOfShipment response = api.customerAtStoreUsingPUT(shipmentNumber, ifMatch);
        // TODO: test validations
    }

    /**
     * Customer Care Items
     *
     * Send items to Customer Care
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerCareItemsUsingPOSTTest() throws ApiException {
        Integer shipmentNumber = null;
        String ifMatch = null;
        RejectItemsRequest rejectItemsRequest = null;
        EntityModelOfShipment response = api.customerCareItemsUsingPOST(shipmentNumber, ifMatch, rejectItemsRequest);
        // TODO: test validations
    }

    /**
     * Customer Care Shipment
     *
     * Send a shipment to Customer Care
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerCareShipmentUsingPUTTest() throws ApiException {
        Integer shipmentNumber = null;
        String ifMatch = null;
        RejectShipment rejectShipment = null;
        EntityModelOfShipment response = api.customerCareShipmentUsingPUT(shipmentNumber, ifMatch, rejectShipment);
        // TODO: test validations
    }

    /**
     * Customer In Transit
     *
     * Indicate that a customer is on their way to the store for curbside delivery.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customerInTransitUsingPUTTest() throws ApiException {
        Integer shipmentNumber = null;
        String ifMatch = null;
        EntityModelOfShipment response = api.customerInTransitUsingPUT(shipmentNumber, ifMatch);
        // TODO: test validations
    }

    /**
     * Delete Shipment
     *
     * Delete Shipment
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteShipmentUsingDELETETest() throws ApiException {
        Integer shipmentNumber = null;
        String ifMatch = null;
        api.deleteShipmentUsingDELETE(shipmentNumber, ifMatch);
        // TODO: test validations
    }

    /**
     * Delete Shipments from Order
     *
     * Delete Shipments from Order
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteShipmentsOfOrderUsingDELETETest() throws ApiException {
        String orderId = null;
        api.deleteShipmentsOfOrderUsingDELETE(orderId);
        // TODO: test validations
    }

    /**
     * Update Destination
     *
     * Update Destination
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void destinationUpdateUsingPUTTest() throws ApiException {
        Integer shipmentNumber = null;
        String ifMatch = null;
        FulfillmentDestination fulfillmentDestination = null;
        EntityModelOfShipment response = api.destinationUpdateUsingPUT(shipmentNumber, ifMatch, fulfillmentDestination);
        // TODO: test validations
    }

    /**
     * Complete Workflow Task
     *
     * Complete Workflow Task
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void executeUsingPUTTest() throws ApiException {
        Integer shipmentNumber = null;
        String taskName = null;
        String ifMatch = null;
        TaskComplete taskComplete = null;
        EntityModelOfShipment response = api.executeUsingPUT(shipmentNumber, taskName, ifMatch, taskComplete);
        // TODO: test validations
    }

    /**
     * Fulfill Shipment
     *
     * Fulfill Shipment
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void fulfillShipmentUsingPUTTest() throws ApiException {
        Integer shipmentNumber = null;
        String ifMatch = null;
        EntityModelOfShipment response = api.fulfillShipmentUsingPUT(shipmentNumber, ifMatch);
        // TODO: test validations
    }

    /**
     * Get Location Summary Report
     *
     * Get Location Summary Report
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getLocationSummaryReportUsingGETTest() throws ApiException {
        String locationCodes = null;
        OffsetDateTime startDateTime = null;
        Boolean bypassSearchIndex = null;
        CollectionModelOfLocationSummary response = api.getLocationSummaryReportUsingGET(locationCodes, startDateTime, bypassSearchIndex);
        // TODO: test validations
    }

    /**
     * Get Workflow Task Counts
     *
     * Get Workflow Task Counts
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getShipmentStepCountByShipmentTypeUsingGETTest() throws ApiException {
        String shipmentType = null;
        String assignedLocations = null;
        EntityModelOfDashboardResponse response = api.getShipmentStepCountByShipmentTypeUsingGET(shipmentType, assignedLocations);
        // TODO: test validations
    }

    /**
     * Get Shipment
     *
     * Get shipment information. Note that the schema supports both assignedLocationCode and fulfillmentLocationCode fields at the shipment level. These fields are usually be the same, except when assignedLocationCode becomes the receiving location code after a transfer shipment is shipped.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getShipmentUsingGETTest() throws ApiException {
        Integer shipmentNumber = null;
        EntityModelOfShipment response = api.getShipmentUsingGET(shipmentNumber);
        // TODO: test validations
    }

    /**
     * Get Shipments
     *
     * A paged list of shipments is returned according to any specified filter criteria and sort options
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getShipmentsUsingGETTest() throws ApiException {
        Boolean bypassSearchIndex = null;
        String filter = null;
        Boolean isLate = null;
        Integer page = null;
        Integer pageSize = null;
        String quickSearch = null;
        String sort = null;
        String workflowTaskName = null;
        PagedModelOfEntityModelOfShipment response = api.getShipmentsUsingGET(bypassSearchIndex, filter, isLate, page, pageSize, quickSearch, sort, workflowTaskName);
        // TODO: test validations
    }

    /**
     * Get Workflow Tasks
     *
     * Get Workflow Tasks
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTasksUsingGETTest() throws ApiException {
        Integer shipmentNumber = null;
        CollectionModelOfTask response = api.getTasksUsingGET(shipmentNumber);
        // TODO: test validations
    }

    /**
     * Create Shipment
     *
     * Create Shipment
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void newShipmentUsingPOSTTest() throws ApiException {
        FulfillmentShipment fulfillmentShipment = null;
        EntityModelOfShipment response = api.newShipmentUsingPOST(fulfillmentShipment);
        // TODO: test validations
    }

    /**
     * Bulk Create Shipments
     *
     * Bulk Create Shipments
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void newShipmentsUsingPOSTTest() throws ApiException {
        List<FulfillmentShipment> fulfillmentShipment = null;
        CollectionModelOfEntityModelOfShipment response = api.newShipmentsUsingPOST(fulfillmentShipment);
        // TODO: test validations
    }

    /**
     * Pickup Items
     *
     * Individual items within a shipment can be marked as picked up in BOPIS (Buy Online Pickup in Store) shipments. This is particularly useful in cases such as partial pickup, in which the pickup location requested a transfer for some items that they did not have in stock but they allow the customer to pick up the items they have ready. In this event, the pickup shipment cannot go straight to the Fulfilled (“Complete”) step because it is still waiting on other items to be received. That partial quantity of items that are picked up early can be called out through this API.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void pickupItemsUsingPOSTTest() throws ApiException {
        Integer shipmentNumber = null;
        String ifMatch = null;
        PickupItemsRequest pickupItemsRequest = null;
        EntityModelOfShipment response = api.pickupItemsUsingPOST(shipmentNumber, ifMatch, pickupItemsRequest);
        // TODO: test validations
    }

    /**
     * Reassign Items
     *
     * Reassign particular items from a shipment while leaving the rest of the items at the original location. This is often referred to as “splitting the shipment.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reassignItemsUsingPUTTest() throws ApiException {
        Integer shipmentNumber = null;
        String ifMatch = null;
        ReassignItemsRequest reassignItemsRequest = null;
        EntityModelOfShipment response = api.reassignItemsUsingPUT(shipmentNumber, ifMatch, reassignItemsRequest);
        // TODO: test validations
    }

    /**
     * Reassign Shipment
     *
     * Reassign an entire shipment to a new fulfillment location, including all packages and items within it. Note that the blockAssignment field is not always necessary to provide in the request, as OMS defaults to “false” if it is not provided in the request. However, it must be provided in order to enable the assignment blocking when desired, such as if the reassignment was due to lack of inventory and similar shipments should not be assigned to this location until it has inventory back in stock.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reassignShipmentUsingPUTTest() throws ApiException {
        Integer shipmentNumber = null;
        String ifMatch = null;
        ReassignShipment reassignShipment = null;
        EntityModelOfShipment response = api.reassignShipmentUsingPUT(shipmentNumber, ifMatch, reassignShipment);
        // TODO: test validations
    }

    /**
     * Receive Transfer
     *
     * After a transfer shipment has been created and fulfilled by the second location, the original pickup location that requested those transfer items must indicate that they have received everything before they can progress in the BOPIS fulfillment flow. Once the location validates that they have received their transfers with this call, the shipment will leave the Wait For Transfer state and continue to Customer Pickup.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void receiveTransferUsingPUTTest() throws ApiException {
        Integer shipmentNumber = null;
        String ifMatch = null;
        EntityModelOfShipment response = api.receiveTransferUsingPUT(shipmentNumber, ifMatch);
        // TODO: test validations
    }

    /**
     * Refresh Shipment
     *
     * Refresh Shipment
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void refreshShipmentUsingPUTTest() throws ApiException {
        Integer shipmentNumber = null;
        Boolean shouldLog = null;
        String ifMatch = null;
        EntityModelOfShipment response = api.refreshShipmentUsingPUT(shipmentNumber, shouldLog, ifMatch);
        // TODO: test validations
    }

    /**
     * Reject Items
     *
     * Reject items in the shipment that are not available for fulfillment at this location. This will assign a new transfer shipment to an eligible location based on order routing rules.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void rejectItemsUsingPUTTest() throws ApiException {
        Integer shipmentNumber = null;
        String ifMatch = null;
        RejectItemsRequest rejectItemsRequest = null;
        EntityModelOfShipment response = api.rejectItemsUsingPUT(shipmentNumber, ifMatch, rejectItemsRequest);
        // TODO: test validations
    }

    /**
     * Reject Shipment
     *
     * Reject an entire shipment whose items are not available for fulfillment at this location. This will reassign the shipment to an eligible location based on order routing rules.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void rejectShipmentUsingPUTTest() throws ApiException {
        Integer shipmentNumber = null;
        String ifMatch = null;
        RejectShipment rejectShipment = null;
        EntityModelOfShipment response = api.rejectShipmentUsingPUT(shipmentNumber, ifMatch, rejectShipment);
        // TODO: test validations
    }

    /**
     * Render Order Summary by Shipment Number
     *
     * Render order summary by shipment number in HTML format for printing
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void renderOrderSummaryUsingGET1Test() throws ApiException {
        Integer shipmentNumber = null;
        EntityModelOfstring response = api.renderOrderSummaryUsingGET1(shipmentNumber);
        // TODO: test validations
    }

    /**
     * Render Shipment Packing Slip
     *
     * Render shipment packing slip in HTML format for printing
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void renderPackingSlipUsingGETTest() throws ApiException {
        Integer shipmentNumber = null;
        EntityModelOfstring response = api.renderPackingSlipUsingGET(shipmentNumber);
        // TODO: test validations
    }

    /**
     * Update Shipment
     *
     * Update Shipment
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void replaceShipmentUsingPUTTest() throws ApiException {
        Integer shipmentNumber = null;
        String updateFields = null;
        String ifMatch = null;
        FulfillmentShipment fulfillmentShipment = null;
        EntityModelOfShipment response = api.replaceShipmentUsingPUT(shipmentNumber, updateFields, ifMatch, fulfillmentShipment);
        // TODO: test validations
    }

    /**
     * Resend Item Email
     *
     * Resend Item Email
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void resendItemEmailUsingPUTTest() throws ApiException {
        Integer shipmentNumber = null;
        Integer lineId = null;
        String ifMatch = null;
        api.resendItemEmailUsingPUT(shipmentNumber, lineId, ifMatch);
        // TODO: test validations
    }

    /**
     * Resend Shipment Email
     *
     * Resend Shipment Email
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void resendShipmentEmailUsingPUTTest() throws ApiException {
        Integer shipmentNumber = null;
        String ifMatch = null;
        api.resendShipmentEmailUsingPUT(shipmentNumber, ifMatch);
        // TODO: test validations
    }

    /**
     * Retry Fulfilling Shipment
     *
     * Retry Fulfilling Shipment
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void retryFulfillingShipmentUsingPUTTest() throws ApiException {
        Integer shipmentNumber = null;
        String ifMatch = null;
        EntityModelOfShipment response = api.retryFulfillingShipmentUsingPUT(shipmentNumber, ifMatch);
        // TODO: test validations
    }

    /**
     * Revert Workflow Task
     *
     * Revert Workflow Task
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void revertUsingPUTTest() throws ApiException {
        Integer shipmentNumber = null;
        String taskName = null;
        String ifMatch = null;
        EntityModelOfShipment response = api.revertUsingPUT(shipmentNumber, taskName, ifMatch);
        // TODO: test validations
    }

    /**
     * Find and Receive Transfer
     *
     * Find and Receive Transfer
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchAndReceiveTransferUsingPUTTest() throws ApiException {
        String search = null;
        String ifMatch = null;
        EntityModelOfShipment response = api.searchAndReceiveTransferUsingPUT(search, ifMatch);
        // TODO: test validations
    }

    /**
     * Skip Workflow Task
     *
     * Skip Workflow Task
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void skipTaskUsingPUTTest() throws ApiException {
        Integer shipmentNumber = null;
        String taskName = null;
        String ifMatch = null;
        EntityModelOfShipment response = api.skipTaskUsingPUT(shipmentNumber, taskName, ifMatch);
        // TODO: test validations
    }

    /**
     * Transfer Items
     *
     * If a pickup location for a BOPIS (Buy Online Pickup in Store) shipment does not have all items available in stock, then they can request a transfer from another location. Submitting this transfer request will send the information about the unavailable items to a second location, who will then ship the items to the fulfiller so that the customer can pick them up at the original store location they selected when submitting their order. It is possible for only some items in the shipment to be needed as a transfer, as opposed to the entire shipment, so this API facilitates creating a transfer for those specific items and quantities.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void transferItemsUsingPUTTest() throws ApiException {
        Integer shipmentNumber = null;
        String ifMatch = null;
        TransferItemsRequest transferItemsRequest = null;
        EntityModelOfShipment response = api.transferItemsUsingPUT(shipmentNumber, ifMatch, transferItemsRequest);
        // TODO: test validations
    }

    /**
     * Transfer Shipment
     *
     * If a pickup location for a BOPIS (Buy Online Pickup in Store) shipment does not have all items available in stock, then they can request a transfer from another location. Submitting this transfer request will send the information about the shipment to a second location, who will then ship the items to the fulfiller so that the customer can pick them up at the original store location they selected when submitting their order.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void transferShipmentUsingPUTTest() throws ApiException {
        Integer shipmentNumber = null;
        String ifMatch = null;
        TransferShipment transferShipment = null;
        EntityModelOfShipment response = api.transferShipmentUsingPUT(shipmentNumber, ifMatch, transferShipment);
        // TODO: test validations
    }

    /**
     * Update Fulfillment Fields
     *
     * Update Fulfillment Fields
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateFulfillmentFieldsUsingPUTTest() throws ApiException {
        Integer shipmentNumber = null;
        String ifMatch = null;
        List<FulfillmentItem> fulfillmentItem = null;
        EntityModelOfShipment response = api.updateFulfillmentFieldsUsingPUT(shipmentNumber, ifMatch, fulfillmentItem);
        // TODO: test validations
    }

    /**
     * Update Gift Card Info
     *
     * Update Gift Card Info
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateGiftCardInfoUsingPUTTest() throws ApiException {
        Integer shipmentNumber = null;
        String ifMatch = null;
        GiftCardInfoRequest giftCardInfoRequest = null;
        EntityModelOfShipment response = api.updateGiftCardInfoUsingPUT(shipmentNumber, ifMatch, giftCardInfoRequest);
        // TODO: test validations
    }

    /**
     * Get Workflow Definition Image
     *
     * Get Workflow Definition Image
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workflowDefinitionImageUsingGETTest() throws ApiException {
        Integer shipmentNumber = null;
        String response = api.workflowDefinitionImageUsingGET(shipmentNumber);
        // TODO: test validations
    }

    /**
     * Get Workflow Instance Image
     *
     * Get Workflow Instance Image
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workflowInstanceImageUsingGETTest() throws ApiException {
        Integer shipmentNumber = null;
        String response = api.workflowInstanceImageUsingGET(shipmentNumber);
        // TODO: test validations
    }

}