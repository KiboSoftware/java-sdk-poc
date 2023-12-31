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


import com.kibocommerce.sdk.inventory.models.BaseResponse;
import com.kibocommerce.sdk.inventory.models.DeletedCountResponse;
import com.kibocommerce.sdk.inventory.models.TagCategory;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class InventoryTagCategoryApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;
    private static String localServerBaseTemplate = ServerConfiguration.defaultServerTemplate;
    private Map<String, String> localHeaders = new HashMap<String, String>();

    public InventoryTagCategoryApi() {
        this(Configuration.getDefaultApiClient());
    }

    public InventoryTagCategoryApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }
    public InventoryTagCategoryApi(KiboConfiguration configuration) {
        this(configuration.getServerForTemplate(localServerBaseTemplate),
            configuration.getClient(),
            configuration.getHeaders()
        );
    }
    public InventoryTagCategoryApi(String baseUrl, ApiClient apiClient, Map<String, String> headers) {
        this.localCustomBaseUrl = baseUrl;
        this.localVarApiClient = apiClient;
        this.localHeaders = headers;
    }
    public InventoryTagCategoryApi(Builder builder) {
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
     * Build call for deleteTagCategory
     * @param xVolTenant Tenant ID (required)
     * @param tagCategoryName Tag Category Name (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Tag category Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteTagCategoryCall(Integer xVolTenant, String tagCategoryName, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/commerce/inventory/v1/tagCategory/{tag_category_name}";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>(localHeaders);
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (tagCategoryName != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("tagCategoryName", tagCategoryName));
        }

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
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth", "clientOauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteTagCategoryValidateBeforeCall(Integer xVolTenant, String tagCategoryName, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'xVolTenant' is set
        if (xVolTenant == null) {
            throw new ApiException("Missing the required parameter 'xVolTenant' when calling deleteTagCategory(Async)");
        }
        
        // verify the required parameter 'tagCategoryName' is set
        if (tagCategoryName == null) {
            throw new ApiException("Missing the required parameter 'tagCategoryName' when calling deleteTagCategory(Async)");
        }
        

        okhttp3.Call localVarCall = deleteTagCategoryCall(xVolTenant, tagCategoryName, _callback);
        return localVarCall;

    }

    /**
     * Delete Tag Category
     * Delete a Tag category
     * @param xVolTenant Tenant ID (required)
     * @param tagCategoryName Tag Category Name (required)
     * @return DeletedCountResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Tag category Not Found </td><td>  -  </td></tr>
     </table>
     */
    public DeletedCountResponse deleteTagCategory(Integer xVolTenant, String tagCategoryName) throws ApiException {
        ApiResponse<DeletedCountResponse> localVarResp = deleteTagCategoryWithHttpInfo(xVolTenant, tagCategoryName);
        return localVarResp.getData();
    }

    /**
     * Delete Tag Category
     * Delete a Tag category
     * @param xVolTenant Tenant ID (required)
     * @param tagCategoryName Tag Category Name (required)
     * @return ApiResponse&lt;DeletedCountResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Tag category Not Found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DeletedCountResponse> deleteTagCategoryWithHttpInfo(Integer xVolTenant, String tagCategoryName) throws ApiException {
        okhttp3.Call localVarCall = deleteTagCategoryValidateBeforeCall(xVolTenant, tagCategoryName, null);
        Type localVarReturnType = new TypeToken<DeletedCountResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Delete Tag Category (asynchronously)
     * Delete a Tag category
     * @param xVolTenant Tenant ID (required)
     * @param tagCategoryName Tag Category Name (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Tag category Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteTagCategoryAsync(Integer xVolTenant, String tagCategoryName, final ApiCallback<DeletedCountResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteTagCategoryValidateBeforeCall(xVolTenant, tagCategoryName, _callback);
        Type localVarReturnType = new TypeToken<DeletedCountResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getTagCategory
     * @param xVolTenant Tenant ID (required)
     * @param tagCategoryName Tag Category Name (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Tag Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getTagCategoryCall(Integer xVolTenant, String tagCategoryName, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/commerce/inventory/v1/tagCategory/{tag_category_name}";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>(localHeaders);
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (tagCategoryName != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("tagCategoryName", tagCategoryName));
        }

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
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth", "clientOauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getTagCategoryValidateBeforeCall(Integer xVolTenant, String tagCategoryName, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'xVolTenant' is set
        if (xVolTenant == null) {
            throw new ApiException("Missing the required parameter 'xVolTenant' when calling getTagCategory(Async)");
        }
        
        // verify the required parameter 'tagCategoryName' is set
        if (tagCategoryName == null) {
            throw new ApiException("Missing the required parameter 'tagCategoryName' when calling getTagCategory(Async)");
        }
        

        okhttp3.Call localVarCall = getTagCategoryCall(xVolTenant, tagCategoryName, _callback);
        return localVarCall;

    }

    /**
     * Get Tag Category
     * Get a tag category
     * @param xVolTenant Tenant ID (required)
     * @param tagCategoryName Tag Category Name (required)
     * @return TagCategory
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Tag Not Found </td><td>  -  </td></tr>
     </table>
     */
    public TagCategory getTagCategory(Integer xVolTenant, String tagCategoryName) throws ApiException {
        ApiResponse<TagCategory> localVarResp = getTagCategoryWithHttpInfo(xVolTenant, tagCategoryName);
        return localVarResp.getData();
    }

    /**
     * Get Tag Category
     * Get a tag category
     * @param xVolTenant Tenant ID (required)
     * @param tagCategoryName Tag Category Name (required)
     * @return ApiResponse&lt;TagCategory&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Tag Not Found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TagCategory> getTagCategoryWithHttpInfo(Integer xVolTenant, String tagCategoryName) throws ApiException {
        okhttp3.Call localVarCall = getTagCategoryValidateBeforeCall(xVolTenant, tagCategoryName, null);
        Type localVarReturnType = new TypeToken<TagCategory>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Tag Category (asynchronously)
     * Get a tag category
     * @param xVolTenant Tenant ID (required)
     * @param tagCategoryName Tag Category Name (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Tag Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getTagCategoryAsync(Integer xVolTenant, String tagCategoryName, final ApiCallback<TagCategory> _callback) throws ApiException {

        okhttp3.Call localVarCall = getTagCategoryValidateBeforeCall(xVolTenant, tagCategoryName, _callback);
        Type localVarReturnType = new TypeToken<TagCategory>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getTagCategoryAll
     * @param xVolTenant Tenant ID (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Tag Categories Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getTagCategoryAllCall(Integer xVolTenant, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/commerce/inventory/v1/tagCategory";

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
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth", "clientOauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getTagCategoryAllValidateBeforeCall(Integer xVolTenant, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'xVolTenant' is set
        if (xVolTenant == null) {
            throw new ApiException("Missing the required parameter 'xVolTenant' when calling getTagCategoryAll(Async)");
        }
        

        okhttp3.Call localVarCall = getTagCategoryAllCall(xVolTenant, _callback);
        return localVarCall;

    }

    /**
     * Get Tag Category All
     * Get all tag categories for a tenant
     * @param xVolTenant Tenant ID (required)
     * @return List&lt;TagCategory&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Tag Categories Not Found </td><td>  -  </td></tr>
     </table>
     */
    public List<TagCategory> getTagCategoryAll(Integer xVolTenant) throws ApiException {
        ApiResponse<List<TagCategory>> localVarResp = getTagCategoryAllWithHttpInfo(xVolTenant);
        return localVarResp.getData();
    }

    /**
     * Get Tag Category All
     * Get all tag categories for a tenant
     * @param xVolTenant Tenant ID (required)
     * @return ApiResponse&lt;List&lt;TagCategory&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Tag Categories Not Found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<TagCategory>> getTagCategoryAllWithHttpInfo(Integer xVolTenant) throws ApiException {
        okhttp3.Call localVarCall = getTagCategoryAllValidateBeforeCall(xVolTenant, null);
        Type localVarReturnType = new TypeToken<List<TagCategory>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Tag Category All (asynchronously)
     * Get all tag categories for a tenant
     * @param xVolTenant Tenant ID (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Tag Categories Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getTagCategoryAllAsync(Integer xVolTenant, final ApiCallback<List<TagCategory>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getTagCategoryAllValidateBeforeCall(xVolTenant, _callback);
        Type localVarReturnType = new TypeToken<List<TagCategory>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateTagCategory
     * @param xVolTenant Tenant ID (required)
     * @param tagCategoryName Tag Category Name (required)
     * @param tagCategory Request create or modify Tag Categories (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateTagCategoryCall(Integer xVolTenant, String tagCategoryName, TagCategory tagCategory, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = tagCategory;

        // create path and map variables
        String localVarPath = "/commerce/inventory/v1/tagCategory/{tag_category_name}";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>(localHeaders);
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (tagCategoryName != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("tagCategoryName", tagCategoryName));
        }

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
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateTagCategoryValidateBeforeCall(Integer xVolTenant, String tagCategoryName, TagCategory tagCategory, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'xVolTenant' is set
        if (xVolTenant == null) {
            throw new ApiException("Missing the required parameter 'xVolTenant' when calling updateTagCategory(Async)");
        }
        
        // verify the required parameter 'tagCategoryName' is set
        if (tagCategoryName == null) {
            throw new ApiException("Missing the required parameter 'tagCategoryName' when calling updateTagCategory(Async)");
        }
        
        // verify the required parameter 'tagCategory' is set
        if (tagCategory == null) {
            throw new ApiException("Missing the required parameter 'tagCategory' when calling updateTagCategory(Async)");
        }
        

        okhttp3.Call localVarCall = updateTagCategoryCall(xVolTenant, tagCategoryName, tagCategory, _callback);
        return localVarCall;

    }

    /**
     * Update Tag Category
     * Update the designated tag category
     * @param xVolTenant Tenant ID (required)
     * @param tagCategoryName Tag Category Name (required)
     * @param tagCategory Request create or modify Tag Categories (required)
     * @return TagCategory
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public TagCategory updateTagCategory(Integer xVolTenant, String tagCategoryName, TagCategory tagCategory) throws ApiException {
        ApiResponse<TagCategory> localVarResp = updateTagCategoryWithHttpInfo(xVolTenant, tagCategoryName, tagCategory);
        return localVarResp.getData();
    }

    /**
     * Update Tag Category
     * Update the designated tag category
     * @param xVolTenant Tenant ID (required)
     * @param tagCategoryName Tag Category Name (required)
     * @param tagCategory Request create or modify Tag Categories (required)
     * @return ApiResponse&lt;TagCategory&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TagCategory> updateTagCategoryWithHttpInfo(Integer xVolTenant, String tagCategoryName, TagCategory tagCategory) throws ApiException {
        okhttp3.Call localVarCall = updateTagCategoryValidateBeforeCall(xVolTenant, tagCategoryName, tagCategory, null);
        Type localVarReturnType = new TypeToken<TagCategory>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update Tag Category (asynchronously)
     * Update the designated tag category
     * @param xVolTenant Tenant ID (required)
     * @param tagCategoryName Tag Category Name (required)
     * @param tagCategory Request create or modify Tag Categories (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateTagCategoryAsync(Integer xVolTenant, String tagCategoryName, TagCategory tagCategory, final ApiCallback<TagCategory> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateTagCategoryValidateBeforeCall(xVolTenant, tagCategoryName, tagCategory, _callback);
        Type localVarReturnType = new TypeToken<TagCategory>(){}.getType();
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
        public InventoryTagCategoryApi build() {
            return new InventoryTagCategoryApi(this);
        }
    }
    public static Builder builder() {

        return new Builder();
    }
}
