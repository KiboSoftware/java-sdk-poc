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


import com.kibocommerce.sdk.shippingadmin.models.CarrierCredentialSet;
import com.kibocommerce.sdk.shippingadmin.models.CarrierCredentialSetCollection;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class CarrierCredentialSetApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;
    private static String localServerBaseTemplate = ServerConfiguration.defaultServerTemplate;
    private Map<String, String> localHeaders = new HashMap<String, String>();

    public CarrierCredentialSetApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CarrierCredentialSetApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }
    public CarrierCredentialSetApi(KiboConfiguration configuration) {
        this(configuration.getServerForTemplate(localServerBaseTemplate),
            configuration.getClient(),
            configuration.getHeaders()
        );
    }
    public CarrierCredentialSetApi(String baseUrl, ApiClient apiClient, Map<String, String> headers) {
        this.localCustomBaseUrl = baseUrl;
        this.localVarApiClient = apiClient;
        this.localHeaders = headers;
    }
    public CarrierCredentialSetApi(Builder builder) {
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
     * Build call for createCarrierCredentialSet
     * @param carrierId The carrier ID. (required)
     * @param carrierCredentialSet The carrier credential set data. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createCarrierCredentialSetCall(String carrierId, CarrierCredentialSet carrierCredentialSet, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = carrierCredentialSet;

        // create path and map variables
        String localVarPath = "/commerce/shipping/admin/carriers/credential-sets/{carrierId}"
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
    private okhttp3.Call createCarrierCredentialSetValidateBeforeCall(String carrierId, CarrierCredentialSet carrierCredentialSet, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'carrierId' is set
        if (carrierId == null) {
            throw new ApiException("Missing the required parameter 'carrierId' when calling createCarrierCredentialSet(Async)");
        }
        

        okhttp3.Call localVarCall = createCarrierCredentialSetCall(carrierId, carrierCredentialSet, _callback);
        return localVarCall;

    }

    /**
     * Creates a Mozu
     * hippingAdmin.Contracts.Carriers.CarrierCredentialSet.
     * @param carrierId The carrier ID. (required)
     * @param carrierCredentialSet The carrier credential set data. (optional)
     * @return CarrierCredentialSet
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public CarrierCredentialSet createCarrierCredentialSet(String carrierId, CarrierCredentialSet carrierCredentialSet) throws ApiException {
        ApiResponse<CarrierCredentialSet> localVarResp = createCarrierCredentialSetWithHttpInfo(carrierId, carrierCredentialSet);
        return localVarResp.getData();
    }

    /**
     * Creates a Mozu
     * hippingAdmin.Contracts.Carriers.CarrierCredentialSet.
     * @param carrierId The carrier ID. (required)
     * @param carrierCredentialSet The carrier credential set data. (optional)
     * @return ApiResponse&lt;CarrierCredentialSet&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CarrierCredentialSet> createCarrierCredentialSetWithHttpInfo(String carrierId, CarrierCredentialSet carrierCredentialSet) throws ApiException {
        okhttp3.Call localVarCall = createCarrierCredentialSetValidateBeforeCall(carrierId, carrierCredentialSet, null);
        Type localVarReturnType = new TypeToken<CarrierCredentialSet>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Creates a Mozu (asynchronously)
     * hippingAdmin.Contracts.Carriers.CarrierCredentialSet.
     * @param carrierId The carrier ID. (required)
     * @param carrierCredentialSet The carrier credential set data. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createCarrierCredentialSetAsync(String carrierId, CarrierCredentialSet carrierCredentialSet, final ApiCallback<CarrierCredentialSet> _callback) throws ApiException {

        okhttp3.Call localVarCall = createCarrierCredentialSetValidateBeforeCall(carrierId, carrierCredentialSet, _callback);
        Type localVarReturnType = new TypeToken<CarrierCredentialSet>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteCarrierCredentialSet
     * @param carrierId The carrier ID. (required)
     * @param code The carrier credential set code. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteCarrierCredentialSetCall(String carrierId, String code, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/shipping/admin/carriers/credential-sets/{carrierId}/{code}"
            .replaceAll("\\{" + "carrierId" + "\\}", localVarApiClient.escapeString(carrierId.toString()))
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()));

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
    private okhttp3.Call deleteCarrierCredentialSetValidateBeforeCall(String carrierId, String code, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'carrierId' is set
        if (carrierId == null) {
            throw new ApiException("Missing the required parameter 'carrierId' when calling deleteCarrierCredentialSet(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling deleteCarrierCredentialSet(Async)");
        }
        

        okhttp3.Call localVarCall = deleteCarrierCredentialSetCall(carrierId, code, _callback);
        return localVarCall;

    }

    /**
     * Deletes a Mozu
     * hippingAdmin.Contracts.Carriers.CarrierCredentialSet with the specified carrier and code.
     * @param carrierId The carrier ID. (required)
     * @param code The carrier credential set code. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public void deleteCarrierCredentialSet(String carrierId, String code) throws ApiException {
        deleteCarrierCredentialSetWithHttpInfo(carrierId, code);
    }

    /**
     * Deletes a Mozu
     * hippingAdmin.Contracts.Carriers.CarrierCredentialSet with the specified carrier and code.
     * @param carrierId The carrier ID. (required)
     * @param code The carrier credential set code. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteCarrierCredentialSetWithHttpInfo(String carrierId, String code) throws ApiException {
        okhttp3.Call localVarCall = deleteCarrierCredentialSetValidateBeforeCall(carrierId, code, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Deletes a Mozu (asynchronously)
     * hippingAdmin.Contracts.Carriers.CarrierCredentialSet with the specified carrier and code.
     * @param carrierId The carrier ID. (required)
     * @param code The carrier credential set code. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteCarrierCredentialSetAsync(String carrierId, String code, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteCarrierCredentialSetValidateBeforeCall(carrierId, code, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for getCarrierCredentialSet
     * @param carrierId The carrier ID. (required)
     * @param code The carrier credential set code. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCarrierCredentialSetCall(String carrierId, String code, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/shipping/admin/carriers/credential-sets/{carrierId}/{code}"
            .replaceAll("\\{" + "carrierId" + "\\}", localVarApiClient.escapeString(carrierId.toString()))
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()));

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
    private okhttp3.Call getCarrierCredentialSetValidateBeforeCall(String carrierId, String code, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'carrierId' is set
        if (carrierId == null) {
            throw new ApiException("Missing the required parameter 'carrierId' when calling getCarrierCredentialSet(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling getCarrierCredentialSet(Async)");
        }
        

        okhttp3.Call localVarCall = getCarrierCredentialSetCall(carrierId, code, _callback);
        return localVarCall;

    }

    /**
     * Returns a Mozu
     * hippingAdmin.Contracts.Carriers.CarrierCredentialSet with the specified carrier and code.
     * @param carrierId The carrier ID. (required)
     * @param code The carrier credential set code. (required)
     * @return CarrierCredentialSet
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public CarrierCredentialSet getCarrierCredentialSet(String carrierId, String code) throws ApiException {
        ApiResponse<CarrierCredentialSet> localVarResp = getCarrierCredentialSetWithHttpInfo(carrierId, code);
        return localVarResp.getData();
    }

    /**
     * Returns a Mozu
     * hippingAdmin.Contracts.Carriers.CarrierCredentialSet with the specified carrier and code.
     * @param carrierId The carrier ID. (required)
     * @param code The carrier credential set code. (required)
     * @return ApiResponse&lt;CarrierCredentialSet&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CarrierCredentialSet> getCarrierCredentialSetWithHttpInfo(String carrierId, String code) throws ApiException {
        okhttp3.Call localVarCall = getCarrierCredentialSetValidateBeforeCall(carrierId, code, null);
        Type localVarReturnType = new TypeToken<CarrierCredentialSet>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Returns a Mozu (asynchronously)
     * hippingAdmin.Contracts.Carriers.CarrierCredentialSet with the specified carrier and code.
     * @param carrierId The carrier ID. (required)
     * @param code The carrier credential set code. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCarrierCredentialSetAsync(String carrierId, String code, final ApiCallback<CarrierCredentialSet> _callback) throws ApiException {

        okhttp3.Call localVarCall = getCarrierCredentialSetValidateBeforeCall(carrierId, code, _callback);
        Type localVarReturnType = new TypeToken<CarrierCredentialSet>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getCarrierCredentialSets
     * @param startIndex The starting index. (optional)
     * @param pageSize The page size. (optional)
     * @param sortBy Any sorting filters. (optional)
     * @param filter Any query filters. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCarrierCredentialSetsCall(Integer startIndex, Integer pageSize, String sortBy, String filter, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/shipping/admin/carriers/credential-sets";

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
    private okhttp3.Call getCarrierCredentialSetsValidateBeforeCall(Integer startIndex, Integer pageSize, String sortBy, String filter, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getCarrierCredentialSetsCall(startIndex, pageSize, sortBy, filter, _callback);
        return localVarCall;

    }

    /**
     * Returns a &lt;see cref&#x3D;\&quot;T:Mozu
     * hippingAdmin.Contracts.Carriers.CarrierCredentialSetCollection\&quot;&gt;collection&lt;/see&gt; of &lt;see cref&#x3D;\&quot;T:Mozu.ShippingAdmin.Contracts.Carriers.CarrierCredentialSet\&quot;&gt;carrier credential sets&lt;/see&gt; with the specified filters and options.
     * @param startIndex The starting index. (optional)
     * @param pageSize The page size. (optional)
     * @param sortBy Any sorting filters. (optional)
     * @param filter Any query filters. (optional)
     * @return CarrierCredentialSetCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public CarrierCredentialSetCollection getCarrierCredentialSets(Integer startIndex, Integer pageSize, String sortBy, String filter) throws ApiException {
        ApiResponse<CarrierCredentialSetCollection> localVarResp = getCarrierCredentialSetsWithHttpInfo(startIndex, pageSize, sortBy, filter);
        return localVarResp.getData();
    }

    /**
     * Returns a &lt;see cref&#x3D;\&quot;T:Mozu
     * hippingAdmin.Contracts.Carriers.CarrierCredentialSetCollection\&quot;&gt;collection&lt;/see&gt; of &lt;see cref&#x3D;\&quot;T:Mozu.ShippingAdmin.Contracts.Carriers.CarrierCredentialSet\&quot;&gt;carrier credential sets&lt;/see&gt; with the specified filters and options.
     * @param startIndex The starting index. (optional)
     * @param pageSize The page size. (optional)
     * @param sortBy Any sorting filters. (optional)
     * @param filter Any query filters. (optional)
     * @return ApiResponse&lt;CarrierCredentialSetCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CarrierCredentialSetCollection> getCarrierCredentialSetsWithHttpInfo(Integer startIndex, Integer pageSize, String sortBy, String filter) throws ApiException {
        okhttp3.Call localVarCall = getCarrierCredentialSetsValidateBeforeCall(startIndex, pageSize, sortBy, filter, null);
        Type localVarReturnType = new TypeToken<CarrierCredentialSetCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Returns a &lt;see cref&#x3D;\&quot;T:Mozu (asynchronously)
     * hippingAdmin.Contracts.Carriers.CarrierCredentialSetCollection\&quot;&gt;collection&lt;/see&gt; of &lt;see cref&#x3D;\&quot;T:Mozu.ShippingAdmin.Contracts.Carriers.CarrierCredentialSet\&quot;&gt;carrier credential sets&lt;/see&gt; with the specified filters and options.
     * @param startIndex The starting index. (optional)
     * @param pageSize The page size. (optional)
     * @param sortBy Any sorting filters. (optional)
     * @param filter Any query filters. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCarrierCredentialSetsAsync(Integer startIndex, Integer pageSize, String sortBy, String filter, final ApiCallback<CarrierCredentialSetCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = getCarrierCredentialSetsValidateBeforeCall(startIndex, pageSize, sortBy, filter, _callback);
        Type localVarReturnType = new TypeToken<CarrierCredentialSetCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateCarrierCredentialSet
     * @param carrierId The carrier ID. (required)
     * @param code The carrier credential set code. (required)
     * @param carrierCredentialSet The carrier credential set data. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateCarrierCredentialSetCall(String carrierId, String code, CarrierCredentialSet carrierCredentialSet, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = carrierCredentialSet;

        // create path and map variables
        String localVarPath = "/commerce/shipping/admin/carriers/credential-sets/{carrierId}/{code}"
            .replaceAll("\\{" + "carrierId" + "\\}", localVarApiClient.escapeString(carrierId.toString()))
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()));

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
    private okhttp3.Call updateCarrierCredentialSetValidateBeforeCall(String carrierId, String code, CarrierCredentialSet carrierCredentialSet, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'carrierId' is set
        if (carrierId == null) {
            throw new ApiException("Missing the required parameter 'carrierId' when calling updateCarrierCredentialSet(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling updateCarrierCredentialSet(Async)");
        }
        

        okhttp3.Call localVarCall = updateCarrierCredentialSetCall(carrierId, code, carrierCredentialSet, _callback);
        return localVarCall;

    }

    /**
     * Updates a Mozu
     * hippingAdmin.Contracts.Carriers.CarrierCredentialSet with the specified carrier and code.
     * @param carrierId The carrier ID. (required)
     * @param code The carrier credential set code. (required)
     * @param carrierCredentialSet The carrier credential set data. (optional)
     * @return CarrierCredentialSet
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public CarrierCredentialSet updateCarrierCredentialSet(String carrierId, String code, CarrierCredentialSet carrierCredentialSet) throws ApiException {
        ApiResponse<CarrierCredentialSet> localVarResp = updateCarrierCredentialSetWithHttpInfo(carrierId, code, carrierCredentialSet);
        return localVarResp.getData();
    }

    /**
     * Updates a Mozu
     * hippingAdmin.Contracts.Carriers.CarrierCredentialSet with the specified carrier and code.
     * @param carrierId The carrier ID. (required)
     * @param code The carrier credential set code. (required)
     * @param carrierCredentialSet The carrier credential set data. (optional)
     * @return ApiResponse&lt;CarrierCredentialSet&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CarrierCredentialSet> updateCarrierCredentialSetWithHttpInfo(String carrierId, String code, CarrierCredentialSet carrierCredentialSet) throws ApiException {
        okhttp3.Call localVarCall = updateCarrierCredentialSetValidateBeforeCall(carrierId, code, carrierCredentialSet, null);
        Type localVarReturnType = new TypeToken<CarrierCredentialSet>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Updates a Mozu (asynchronously)
     * hippingAdmin.Contracts.Carriers.CarrierCredentialSet with the specified carrier and code.
     * @param carrierId The carrier ID. (required)
     * @param code The carrier credential set code. (required)
     * @param carrierCredentialSet The carrier credential set data. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateCarrierCredentialSetAsync(String carrierId, String code, CarrierCredentialSet carrierCredentialSet, final ApiCallback<CarrierCredentialSet> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateCarrierCredentialSetValidateBeforeCall(carrierId, code, carrierCredentialSet, _callback);
        Type localVarReturnType = new TypeToken<CarrierCredentialSet>(){}.getType();
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
        public CarrierCredentialSetApi build() {
            return new CarrierCredentialSetApi(this);
        }
    }
    public static Builder builder() {

        return new Builder();
    }
}
