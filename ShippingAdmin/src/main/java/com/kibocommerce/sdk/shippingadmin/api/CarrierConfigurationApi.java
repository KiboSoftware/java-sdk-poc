/*
 * Kibo Shipping Admin Service
 * OpenAPI Spec for Kibo Shipping Admin Service
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.shippingadmin.api;
import com.kibocommerce.sdk.common.*;

import com.kibocommerce.sdk.common.ApiCallback;
import com.kibocommerce.sdk.common.ApiClient;
import com.kibocommerce.sdk.common.ApiException;
import com.kibocommerce.sdk.common.ApiResponse;
import com.kibocommerce.sdk.common.Configuration;

import com.kibocommerce.sdk.common.Pair;
import com.kibocommerce.sdk.common.ProgressRequestBody;
import com.kibocommerce.sdk.common.ProgressResponseBody;

import com.kibocommerce.sdk.shippingadmin.ServerConfiguration;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.kibocommerce.sdk.shippingadmin.models.CarrierConfiguration;
import com.kibocommerce.sdk.shippingadmin.models.CarrierConfigurationCollection;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class CarrierConfigurationApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;
    private static String localServerBaseTemplate = ServerConfiguration.defaultServerTemplate;
    private Map<String, String> localHeaders = new HashMap<String, String>();

    public CarrierConfigurationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CarrierConfigurationApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }
    public CarrierConfigurationApi(KiboConfiguration configuration) {
        this(configuration.getServerForTemplate(localServerBaseTemplate),
            configuration.getClient(),
            configuration.getHeaders()
        );
    }
    public CarrierConfigurationApi(String baseUrl, ApiClient apiClient, Map<String, String> headers) {
        this.localCustomBaseUrl = baseUrl;
        this.localVarApiClient = apiClient;
        this.localHeaders = headers;
    }
    public CarrierConfigurationApi(Builder builder) {
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
     * Build call for createConfiguration
     * @param carrierId  (required)
     * @param carrierConfiguration  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createConfigurationCall(String carrierId, CarrierConfiguration carrierConfiguration, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = carrierConfiguration;

        // create path and map variables
        String localVarPath = "/commerce/shipping/admin/carriers/{carrierId}"
            .replaceAll("\\{" + "carrierId" + "\\}", localVarApiClient.escapeString(carrierId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>(localHeaders);
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "text/json", "text/plain"
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
    private okhttp3.Call createConfigurationValidateBeforeCall(String carrierId, CarrierConfiguration carrierConfiguration, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'carrierId' is set
        if (carrierId == null) {
            throw new ApiException("Missing the required parameter 'carrierId' when calling createConfiguration(Async)");
        }
        

        okhttp3.Call localVarCall = createConfigurationCall(carrierId, carrierConfiguration, _callback);
        return localVarCall;

    }

    /**
     * Create Carrier Configuration
     * Create Carrier Configuration
     * @param carrierId  (required)
     * @param carrierConfiguration  (optional)
     * @return CarrierConfiguration
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public CarrierConfiguration createConfiguration(String carrierId, CarrierConfiguration carrierConfiguration) throws ApiException {
        ApiResponse<CarrierConfiguration> localVarResp = createConfigurationWithHttpInfo(carrierId, carrierConfiguration);
        return localVarResp.getData();
    }

    /**
     * Create Carrier Configuration
     * Create Carrier Configuration
     * @param carrierId  (required)
     * @param carrierConfiguration  (optional)
     * @return ApiResponse&lt;CarrierConfiguration&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CarrierConfiguration> createConfigurationWithHttpInfo(String carrierId, CarrierConfiguration carrierConfiguration) throws ApiException {
        okhttp3.Call localVarCall = createConfigurationValidateBeforeCall(carrierId, carrierConfiguration, null);
        Type localVarReturnType = new TypeToken<CarrierConfiguration>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create Carrier Configuration (asynchronously)
     * Create Carrier Configuration
     * @param carrierId  (required)
     * @param carrierConfiguration  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createConfigurationAsync(String carrierId, CarrierConfiguration carrierConfiguration, final ApiCallback<CarrierConfiguration> _callback) throws ApiException {

        okhttp3.Call localVarCall = createConfigurationValidateBeforeCall(carrierId, carrierConfiguration, _callback);
        Type localVarReturnType = new TypeToken<CarrierConfiguration>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteConfiguration
     * @param carrierId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteConfigurationCall(String carrierId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/shipping/admin/carriers/{carrierId}"
            .replaceAll("\\{" + "carrierId" + "\\}", localVarApiClient.escapeString(carrierId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>(localHeaders);
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
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
    private okhttp3.Call deleteConfigurationValidateBeforeCall(String carrierId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'carrierId' is set
        if (carrierId == null) {
            throw new ApiException("Missing the required parameter 'carrierId' when calling deleteConfiguration(Async)");
        }
        

        okhttp3.Call localVarCall = deleteConfigurationCall(carrierId, _callback);
        return localVarCall;

    }

    /**
     * Delete an existing Carrier Configuration
     * Delete an existing Carrier Configuration
     * @param carrierId  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public void deleteConfiguration(String carrierId) throws ApiException {
        deleteConfigurationWithHttpInfo(carrierId);
    }

    /**
     * Delete an existing Carrier Configuration
     * Delete an existing Carrier Configuration
     * @param carrierId  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteConfigurationWithHttpInfo(String carrierId) throws ApiException {
        okhttp3.Call localVarCall = deleteConfigurationValidateBeforeCall(carrierId, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete an existing Carrier Configuration (asynchronously)
     * Delete an existing Carrier Configuration
     * @param carrierId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteConfigurationAsync(String carrierId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteConfigurationValidateBeforeCall(carrierId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for getConfiguration
     * @param carrierId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getConfigurationCall(String carrierId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/shipping/admin/carriers/{carrierId}"
            .replaceAll("\\{" + "carrierId" + "\\}", localVarApiClient.escapeString(carrierId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>(localHeaders);
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "text/json", "text/plain"
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
    private okhttp3.Call getConfigurationValidateBeforeCall(String carrierId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'carrierId' is set
        if (carrierId == null) {
            throw new ApiException("Missing the required parameter 'carrierId' when calling getConfiguration(Async)");
        }
        

        okhttp3.Call localVarCall = getConfigurationCall(carrierId, _callback);
        return localVarCall;

    }

    /**
     * Get Carrier Configuration (for this particular site)
     * Get Carrier Configuration (for this particular site)
     * @param carrierId  (required)
     * @return CarrierConfiguration
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public CarrierConfiguration getConfiguration(String carrierId) throws ApiException {
        ApiResponse<CarrierConfiguration> localVarResp = getConfigurationWithHttpInfo(carrierId);
        return localVarResp.getData();
    }

    /**
     * Get Carrier Configuration (for this particular site)
     * Get Carrier Configuration (for this particular site)
     * @param carrierId  (required)
     * @return ApiResponse&lt;CarrierConfiguration&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CarrierConfiguration> getConfigurationWithHttpInfo(String carrierId) throws ApiException {
        okhttp3.Call localVarCall = getConfigurationValidateBeforeCall(carrierId, null);
        Type localVarReturnType = new TypeToken<CarrierConfiguration>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Carrier Configuration (for this particular site) (asynchronously)
     * Get Carrier Configuration (for this particular site)
     * @param carrierId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getConfigurationAsync(String carrierId, final ApiCallback<CarrierConfiguration> _callback) throws ApiException {

        okhttp3.Call localVarCall = getConfigurationValidateBeforeCall(carrierId, _callback);
        Type localVarReturnType = new TypeToken<CarrierConfiguration>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getConfigurations
     * @param startIndex Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex&#x3D;3. The default value is 0. Optional. (optional, default to 0)
     * @param pageSize Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. Optional. (optional, default to 0)
     * @param sortBy The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. Optional. (optional)
     * @param filter A set of filter expressions representing the search parameters for a query: eq&#x3D;equals, ne&#x3D;not equals, gt&#x3D;greater than, lt &#x3D; less than or equals, gt &#x3D; greater than or equals, lt &#x3D; less than or equals, sw &#x3D; starts with, or cont &#x3D; contains. Optional. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getConfigurationsCall(Integer startIndex, Integer pageSize, String sortBy, String filter, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/shipping/admin/carriers";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>(localHeaders);
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (startIndex != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("startIndex", startIndex));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pageSize", pageSize));
        }

        if (sortBy != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sortBy", sortBy));
        }

        if (filter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter", filter));
        }

        final String[] localVarAccepts = {
            "application/json", "text/json", "text/plain"
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
    private okhttp3.Call getConfigurationsValidateBeforeCall(Integer startIndex, Integer pageSize, String sortBy, String filter, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getConfigurationsCall(startIndex, pageSize, sortBy, filter, _callback);
        return localVarCall;

    }

    /**
     * Retrieves a list of Carrier Configurations according to any specified filter criteria and sort options
     * 
     * @param startIndex Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex&#x3D;3. The default value is 0. Optional. (optional, default to 0)
     * @param pageSize Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. Optional. (optional, default to 0)
     * @param sortBy The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. Optional. (optional)
     * @param filter A set of filter expressions representing the search parameters for a query: eq&#x3D;equals, ne&#x3D;not equals, gt&#x3D;greater than, lt &#x3D; less than or equals, gt &#x3D; greater than or equals, lt &#x3D; less than or equals, sw &#x3D; starts with, or cont &#x3D; contains. Optional. (optional)
     * @return CarrierConfigurationCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public CarrierConfigurationCollection getConfigurations(Integer startIndex, Integer pageSize, String sortBy, String filter) throws ApiException {
        ApiResponse<CarrierConfigurationCollection> localVarResp = getConfigurationsWithHttpInfo(startIndex, pageSize, sortBy, filter);
        return localVarResp.getData();
    }

    /**
     * Retrieves a list of Carrier Configurations according to any specified filter criteria and sort options
     * 
     * @param startIndex Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex&#x3D;3. The default value is 0. Optional. (optional, default to 0)
     * @param pageSize Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. Optional. (optional, default to 0)
     * @param sortBy The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. Optional. (optional)
     * @param filter A set of filter expressions representing the search parameters for a query: eq&#x3D;equals, ne&#x3D;not equals, gt&#x3D;greater than, lt &#x3D; less than or equals, gt &#x3D; greater than or equals, lt &#x3D; less than or equals, sw &#x3D; starts with, or cont &#x3D; contains. Optional. (optional)
     * @return ApiResponse&lt;CarrierConfigurationCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CarrierConfigurationCollection> getConfigurationsWithHttpInfo(Integer startIndex, Integer pageSize, String sortBy, String filter) throws ApiException {
        okhttp3.Call localVarCall = getConfigurationsValidateBeforeCall(startIndex, pageSize, sortBy, filter, null);
        Type localVarReturnType = new TypeToken<CarrierConfigurationCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieves a list of Carrier Configurations according to any specified filter criteria and sort options (asynchronously)
     * 
     * @param startIndex Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex&#x3D;3. The default value is 0. Optional. (optional, default to 0)
     * @param pageSize Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. Optional. (optional, default to 0)
     * @param sortBy The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. Optional. (optional)
     * @param filter A set of filter expressions representing the search parameters for a query: eq&#x3D;equals, ne&#x3D;not equals, gt&#x3D;greater than, lt &#x3D; less than or equals, gt &#x3D; greater than or equals, lt &#x3D; less than or equals, sw &#x3D; starts with, or cont &#x3D; contains. Optional. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getConfigurationsAsync(Integer startIndex, Integer pageSize, String sortBy, String filter, final ApiCallback<CarrierConfigurationCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = getConfigurationsValidateBeforeCall(startIndex, pageSize, sortBy, filter, _callback);
        Type localVarReturnType = new TypeToken<CarrierConfigurationCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateConfiguration
     * @param carrierId  (required)
     * @param carrierConfiguration  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateConfigurationCall(String carrierId, CarrierConfiguration carrierConfiguration, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = carrierConfiguration;

        // create path and map variables
        String localVarPath = "/commerce/shipping/admin/carriers/{carrierId}"
            .replaceAll("\\{" + "carrierId" + "\\}", localVarApiClient.escapeString(carrierId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>(localHeaders);
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "text/json", "text/plain"
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
    private okhttp3.Call updateConfigurationValidateBeforeCall(String carrierId, CarrierConfiguration carrierConfiguration, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'carrierId' is set
        if (carrierId == null) {
            throw new ApiException("Missing the required parameter 'carrierId' when calling updateConfiguration(Async)");
        }
        

        okhttp3.Call localVarCall = updateConfigurationCall(carrierId, carrierConfiguration, _callback);
        return localVarCall;

    }

    /**
     * Update an existing Carrier Configuration
     * Update an existing Carrier Configuration
     * @param carrierId  (required)
     * @param carrierConfiguration  (optional)
     * @return CarrierConfiguration
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public CarrierConfiguration updateConfiguration(String carrierId, CarrierConfiguration carrierConfiguration) throws ApiException {
        ApiResponse<CarrierConfiguration> localVarResp = updateConfigurationWithHttpInfo(carrierId, carrierConfiguration);
        return localVarResp.getData();
    }

    /**
     * Update an existing Carrier Configuration
     * Update an existing Carrier Configuration
     * @param carrierId  (required)
     * @param carrierConfiguration  (optional)
     * @return ApiResponse&lt;CarrierConfiguration&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CarrierConfiguration> updateConfigurationWithHttpInfo(String carrierId, CarrierConfiguration carrierConfiguration) throws ApiException {
        okhttp3.Call localVarCall = updateConfigurationValidateBeforeCall(carrierId, carrierConfiguration, null);
        Type localVarReturnType = new TypeToken<CarrierConfiguration>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update an existing Carrier Configuration (asynchronously)
     * Update an existing Carrier Configuration
     * @param carrierId  (required)
     * @param carrierConfiguration  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateConfigurationAsync(String carrierId, CarrierConfiguration carrierConfiguration, final ApiCallback<CarrierConfiguration> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateConfigurationValidateBeforeCall(carrierId, carrierConfiguration, _callback);
        Type localVarReturnType = new TypeToken<CarrierConfiguration>(){}.getType();
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
        public CarrierConfigurationApi build() {
            return new CarrierConfigurationApi(this);
        }
    }
    public static Builder builder() {

        return new Builder();
    }
}
