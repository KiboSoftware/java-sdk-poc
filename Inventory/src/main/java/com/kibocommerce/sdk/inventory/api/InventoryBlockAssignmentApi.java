/*
 * Inventory
 * Swagger JSON for inventory apis
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.inventory.api;
import com.kibocommerce.sdk.common.*;

import com.kibocommerce.sdk.common.ApiCallback;
import com.kibocommerce.sdk.common.ApiClient;
import com.kibocommerce.sdk.common.ApiException;
import com.kibocommerce.sdk.common.ApiResponse;
import com.kibocommerce.sdk.common.Configuration;

import com.kibocommerce.sdk.common.Pair;
import com.kibocommerce.sdk.common.ProgressRequestBody;
import com.kibocommerce.sdk.common.ProgressResponseBody;

import com.kibocommerce.sdk.inventory.ServerConfiguration;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.kibocommerce.sdk.inventory.models.AllocateInventory500Response;
import com.kibocommerce.sdk.inventory.models.BaseResponse;
import com.kibocommerce.sdk.inventory.models.BlockAssignmentRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class InventoryBlockAssignmentApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;
    private static String localServerBaseTemplate = ServerConfiguration.defaultServerTemplate;
    private Map<String, String> localHeaders = new HashMap<String, String>();

    public InventoryBlockAssignmentApi() {
        this(Configuration.getDefaultApiClient());
    }

    public InventoryBlockAssignmentApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }
    public InventoryBlockAssignmentApi(KiboConfiguration configuration) {
        this(configuration.getServerForTemplate(localServerBaseTemplate),
            configuration.getClient(),
            configuration.getHeaders()
        );
    }
    public InventoryBlockAssignmentApi(String baseUrl, ApiClient apiClient, Map<String, String> headers) {
        this.localCustomBaseUrl = baseUrl;
        this.localVarApiClient = apiClient;
        this.localHeaders = headers;
    }
    public InventoryBlockAssignmentApi(Builder builder) {
        this.localCustomBaseUrl = builder.configuration.getServerForTemplate(localServerBaseTemplate);
        this.localVarApiClient = builder.configuration.getClient();
        this.localHeaders = builder.configuration.getHeaders();
    }
    public ApiClient getApiClient() {
        return localVarApiClient;
    }
    public Map<String, String> getHeaders(){
        return localHeaders;
    }
    public void setHeaders(Map<String, String> headers){
        this.localHeaders = headers;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for blockAssignment
     * @param xVolTenant Tenant ID (required)
     * @param blockAssignmentRequest Request to block assignment on the product (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call blockAssignmentCall(Integer xVolTenant, BlockAssignmentRequest blockAssignmentRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = blockAssignmentRequest;

        // create path and map variables
        String localVarPath = "/commerce/inventory/v5/inventory/blockAssignment";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>(localHeaders);
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (xVolTenant != null) {
            localVarHeaderParams.put("x-vol-tenant", localVarApiClient.parameterToString(xVolTenant));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth", "clientOauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call blockAssignmentValidateBeforeCall(Integer xVolTenant, BlockAssignmentRequest blockAssignmentRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'xVolTenant' is set
        if (xVolTenant == null) {
            throw new ApiException("Missing the required parameter 'xVolTenant' when calling blockAssignment(Async)");
        }
        
        // verify the required parameter 'blockAssignmentRequest' is set
        if (blockAssignmentRequest == null) {
            throw new ApiException("Missing the required parameter 'blockAssignmentRequest' when calling blockAssignment(Async)");
        }
        

        okhttp3.Call localVarCall = blockAssignmentCall(xVolTenant, blockAssignmentRequest, _callback);
        return localVarCall;

    }

    /**
     * Block Assignment
     * Setting the blockAssignment flag to true for the product based on the given request
     * @param xVolTenant Tenant ID (required)
     * @param blockAssignmentRequest Request to block assignment on the product (required)
     * @return BaseResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public BaseResponse blockAssignment(Integer xVolTenant, BlockAssignmentRequest blockAssignmentRequest) throws ApiException {
        ApiResponse<BaseResponse> localVarResp = blockAssignmentWithHttpInfo(xVolTenant, blockAssignmentRequest);
        return localVarResp.getData();
    }

    /**
     * Block Assignment
     * Setting the blockAssignment flag to true for the product based on the given request
     * @param xVolTenant Tenant ID (required)
     * @param blockAssignmentRequest Request to block assignment on the product (required)
     * @return ApiResponse&lt;BaseResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<BaseResponse> blockAssignmentWithHttpInfo(Integer xVolTenant, BlockAssignmentRequest blockAssignmentRequest) throws ApiException {
        okhttp3.Call localVarCall = blockAssignmentValidateBeforeCall(xVolTenant, blockAssignmentRequest, null);
        Type localVarReturnType = new TypeToken<BaseResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Block Assignment (asynchronously)
     * Setting the blockAssignment flag to true for the product based on the given request
     * @param xVolTenant Tenant ID (required)
     * @param blockAssignmentRequest Request to block assignment on the product (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call blockAssignmentAsync(Integer xVolTenant, BlockAssignmentRequest blockAssignmentRequest, final ApiCallback<BaseResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = blockAssignmentValidateBeforeCall(xVolTenant, blockAssignmentRequest, _callback);
        Type localVarReturnType = new TypeToken<BaseResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public static class Builder {
        private KiboConfiguration configuration;
        private Map<String, String> customHeaders;
        public Builder() {
        }
        public Builder withHeaders(Map<String, String> customHeaders) {
            this.customHeaders = customHeaders;
            return this;
        }
        public Builder withConfig(KiboConfiguration configuration) {
            this.configuration = configuration;
            return this;
        }
        public InventoryBlockAssignmentApi build() {
            return new InventoryBlockAssignmentApi(this);
        }
    }
    public static Builder builder() {

        return new Builder();
    }
}