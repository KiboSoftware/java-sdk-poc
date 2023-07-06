/*
 * Kibo Catalog Admin Services
 * OpenAPI Spec for Kibo Catalog Admin Services
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.catalogadministration.api;
import com.kibocommerce.sdk.common.*;

import com.kibocommerce.sdk.common.ApiCallback;
import com.kibocommerce.sdk.common.ApiClient;
import com.kibocommerce.sdk.common.ApiException;
import com.kibocommerce.sdk.common.ApiResponse;
import com.kibocommerce.sdk.common.Configuration;

import com.kibocommerce.sdk.common.Pair;
import com.kibocommerce.sdk.common.ProgressRequestBody;
import com.kibocommerce.sdk.common.ProgressResponseBody;

import com.kibocommerce.sdk.catalogadministration.ServerConfiguration;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.kibocommerce.sdk.catalogadministration.models.SearchRedirect;
import com.kibocommerce.sdk.catalogadministration.models.SearchRedirectCollection;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class SearchRedirectApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;
    private static String localServerBaseTemplate = ServerConfiguration.defaultServerTemplate;
    private Map<String, String> localHeaders = new HashMap<String, String>();

    public SearchRedirectApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SearchRedirectApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }
    public SearchRedirectApi(KiboConfiguration configuration) {
        this(configuration.getServerForTemplate(localServerBaseTemplate),
            configuration.getClient(),
            configuration.getHeaders()
        );
    }
    public SearchRedirectApi(String baseUrl, ApiClient apiClient, Map<String, String> headers) {
        this.localCustomBaseUrl = baseUrl;
        this.localVarApiClient = apiClient;
        this.localHeaders = headers;
    }
    public SearchRedirectApi(Builder builder) {
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
     * Build call for addSearchRedirect
     * @param fromSystemDefault  (optional, default to false)
     * @param searchRedirect  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addSearchRedirectCall(Boolean fromSystemDefault, SearchRedirect searchRedirect, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = searchRedirect;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/search/redirect";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>(localHeaders);
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (fromSystemDefault != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fromSystemDefault", fromSystemDefault));
        }

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
    private okhttp3.Call addSearchRedirectValidateBeforeCall(Boolean fromSystemDefault, SearchRedirect searchRedirect, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = addSearchRedirectCall(fromSystemDefault, searchRedirect, _callback);
        return localVarCall;

    }

    /**
     * Add search redirect
     * Adds a search redirect for a specific site.
     * @param fromSystemDefault  (optional, default to false)
     * @param searchRedirect  (optional)
     * @return SearchRedirect
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public SearchRedirect addSearchRedirect(Boolean fromSystemDefault, SearchRedirect searchRedirect) throws ApiException {
        ApiResponse<SearchRedirect> localVarResp = addSearchRedirectWithHttpInfo(fromSystemDefault, searchRedirect);
        return localVarResp.getData();
    }

    /**
     * Add search redirect
     * Adds a search redirect for a specific site.
     * @param fromSystemDefault  (optional, default to false)
     * @param searchRedirect  (optional)
     * @return ApiResponse&lt;SearchRedirect&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SearchRedirect> addSearchRedirectWithHttpInfo(Boolean fromSystemDefault, SearchRedirect searchRedirect) throws ApiException {
        okhttp3.Call localVarCall = addSearchRedirectValidateBeforeCall(fromSystemDefault, searchRedirect, null);
        Type localVarReturnType = new TypeToken<SearchRedirect>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Add search redirect (asynchronously)
     * Adds a search redirect for a specific site.
     * @param fromSystemDefault  (optional, default to false)
     * @param searchRedirect  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addSearchRedirectAsync(Boolean fromSystemDefault, SearchRedirect searchRedirect, final ApiCallback<SearchRedirect> _callback) throws ApiException {

        okhttp3.Call localVarCall = addSearchRedirectValidateBeforeCall(fromSystemDefault, searchRedirect, _callback);
        Type localVarReturnType = new TypeToken<SearchRedirect>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteSearchRedirect
     * @param redirectId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteSearchRedirectCall(String redirectId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/search/redirect/{redirectId}"
            .replaceAll("\\{" + "redirectId" + "\\}", localVarApiClient.escapeString(redirectId.toString()));

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
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteSearchRedirectValidateBeforeCall(String redirectId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'redirectId' is set
        if (redirectId == null) {
            throw new ApiException("Missing the required parameter 'redirectId' when calling deleteSearchRedirect(Async)");
        }
        

        okhttp3.Call localVarCall = deleteSearchRedirectCall(redirectId, _callback);
        return localVarCall;

    }

    /**
     * Delete search redirect
     * Deletes a specific redirect for a site.
     * @param redirectId  (required)
     * @return SearchRedirect
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public SearchRedirect deleteSearchRedirect(String redirectId) throws ApiException {
        ApiResponse<SearchRedirect> localVarResp = deleteSearchRedirectWithHttpInfo(redirectId);
        return localVarResp.getData();
    }

    /**
     * Delete search redirect
     * Deletes a specific redirect for a site.
     * @param redirectId  (required)
     * @return ApiResponse&lt;SearchRedirect&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SearchRedirect> deleteSearchRedirectWithHttpInfo(String redirectId) throws ApiException {
        okhttp3.Call localVarCall = deleteSearchRedirectValidateBeforeCall(redirectId, null);
        Type localVarReturnType = new TypeToken<SearchRedirect>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Delete search redirect (asynchronously)
     * Deletes a specific redirect for a site.
     * @param redirectId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteSearchRedirectAsync(String redirectId, final ApiCallback<SearchRedirect> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteSearchRedirectValidateBeforeCall(redirectId, _callback);
        Type localVarReturnType = new TypeToken<SearchRedirect>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getSearchRedirect
     * @param redirectId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getSearchRedirectCall(String redirectId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/search/redirect/{redirectId}"
            .replaceAll("\\{" + "redirectId" + "\\}", localVarApiClient.escapeString(redirectId.toString()));

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
    private okhttp3.Call getSearchRedirectValidateBeforeCall(String redirectId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'redirectId' is set
        if (redirectId == null) {
            throw new ApiException("Missing the required parameter 'redirectId' when calling getSearchRedirect(Async)");
        }
        

        okhttp3.Call localVarCall = getSearchRedirectCall(redirectId, _callback);
        return localVarCall;

    }

    /**
     * Get search redirect
     * Get search redirect by redirect id.
     * @param redirectId  (required)
     * @return SearchRedirect
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public SearchRedirect getSearchRedirect(String redirectId) throws ApiException {
        ApiResponse<SearchRedirect> localVarResp = getSearchRedirectWithHttpInfo(redirectId);
        return localVarResp.getData();
    }

    /**
     * Get search redirect
     * Get search redirect by redirect id.
     * @param redirectId  (required)
     * @return ApiResponse&lt;SearchRedirect&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SearchRedirect> getSearchRedirectWithHttpInfo(String redirectId) throws ApiException {
        okhttp3.Call localVarCall = getSearchRedirectValidateBeforeCall(redirectId, null);
        Type localVarReturnType = new TypeToken<SearchRedirect>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get search redirect (asynchronously)
     * Get search redirect by redirect id.
     * @param redirectId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getSearchRedirectAsync(String redirectId, final ApiCallback<SearchRedirect> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSearchRedirectValidateBeforeCall(redirectId, _callback);
        Type localVarReturnType = new TypeToken<SearchRedirect>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getSearchRedirects
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getSearchRedirectsCall(final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/catalog/admin/search/redirect";

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
    private okhttp3.Call getSearchRedirectsValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getSearchRedirectsCall(_callback);
        return localVarCall;

    }

    /**
     * Get search redirects
     * Get search redirect list.
     * @return SearchRedirectCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public SearchRedirectCollection getSearchRedirects() throws ApiException {
        ApiResponse<SearchRedirectCollection> localVarResp = getSearchRedirectsWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Get search redirects
     * Get search redirect list.
     * @return ApiResponse&lt;SearchRedirectCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SearchRedirectCollection> getSearchRedirectsWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getSearchRedirectsValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<SearchRedirectCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get search redirects (asynchronously)
     * Get search redirect list.
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getSearchRedirectsAsync(final ApiCallback<SearchRedirectCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSearchRedirectsValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<SearchRedirectCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateSearchRedirect
     * @param redirectId  (required)
     * @param searchRedirect  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateSearchRedirectCall(String redirectId, SearchRedirect searchRedirect, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = searchRedirect;

        // create path and map variables
        String localVarPath = "/commerce/catalog/admin/search/redirect/{redirectId}"
            .replaceAll("\\{" + "redirectId" + "\\}", localVarApiClient.escapeString(redirectId.toString()));

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
    private okhttp3.Call updateSearchRedirectValidateBeforeCall(String redirectId, SearchRedirect searchRedirect, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'redirectId' is set
        if (redirectId == null) {
            throw new ApiException("Missing the required parameter 'redirectId' when calling updateSearchRedirect(Async)");
        }
        

        okhttp3.Call localVarCall = updateSearchRedirectCall(redirectId, searchRedirect, _callback);
        return localVarCall;

    }

    /**
     * Update search redirect
     * Update a search redirect for a specific site.
     * @param redirectId  (required)
     * @param searchRedirect  (optional)
     * @return SearchRedirect
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public SearchRedirect updateSearchRedirect(String redirectId, SearchRedirect searchRedirect) throws ApiException {
        ApiResponse<SearchRedirect> localVarResp = updateSearchRedirectWithHttpInfo(redirectId, searchRedirect);
        return localVarResp.getData();
    }

    /**
     * Update search redirect
     * Update a search redirect for a specific site.
     * @param redirectId  (required)
     * @param searchRedirect  (optional)
     * @return ApiResponse&lt;SearchRedirect&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SearchRedirect> updateSearchRedirectWithHttpInfo(String redirectId, SearchRedirect searchRedirect) throws ApiException {
        okhttp3.Call localVarCall = updateSearchRedirectValidateBeforeCall(redirectId, searchRedirect, null);
        Type localVarReturnType = new TypeToken<SearchRedirect>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update search redirect (asynchronously)
     * Update a search redirect for a specific site.
     * @param redirectId  (required)
     * @param searchRedirect  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateSearchRedirectAsync(String redirectId, SearchRedirect searchRedirect, final ApiCallback<SearchRedirect> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateSearchRedirectValidateBeforeCall(redirectId, searchRedirect, _callback);
        Type localVarReturnType = new TypeToken<SearchRedirect>(){}.getType();
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
        public SearchRedirectApi build() {
            return new SearchRedirectApi(this);
        }
    }
    public static Builder builder() {

        return new Builder();
    }
}
