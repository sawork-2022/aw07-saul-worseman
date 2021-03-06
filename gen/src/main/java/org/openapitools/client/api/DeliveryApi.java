/*
 * Order
 * Order
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.Error;
import org.openapitools.client.model.Order;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DeliveryApi {
    private ApiClient localVarApiClient;

    public DeliveryApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DeliveryApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for listOrderByCartId
     * @param checkId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The Order </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listOrderByCartIdCall(Long checkId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/delivery/check/{checkId}"
            .replaceAll("\\{" + "checkId" + "\\}", localVarApiClient.escapeString(checkId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listOrderByCartIdValidateBeforeCall(Long checkId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'checkId' is set
        if (checkId == null) {
            throw new ApiException("Missing the required parameter 'checkId' when calling listOrderByCartId(Async)");
        }
        

        okhttp3.Call localVarCall = listOrderByCartIdCall(checkId, _callback);
        return localVarCall;

    }

    /**
     * checkout my order according to my cartId
     * 
     * @param checkId  (required)
     * @return Order
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The Order </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public Order listOrderByCartId(Long checkId) throws ApiException {
        ApiResponse<Order> localVarResp = listOrderByCartIdWithHttpInfo(checkId);
        return localVarResp.getData();
    }

    /**
     * checkout my order according to my cartId
     * 
     * @param checkId  (required)
     * @return ApiResponse&lt;Order&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The Order </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Order> listOrderByCartIdWithHttpInfo(Long checkId) throws ApiException {
        okhttp3.Call localVarCall = listOrderByCartIdValidateBeforeCall(checkId, null);
        Type localVarReturnType = new TypeToken<Order>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * checkout my order according to my cartId (asynchronously)
     * 
     * @param checkId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The Order </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listOrderByCartIdAsync(Long checkId, final ApiCallback<Order> _callback) throws ApiException {

        okhttp3.Call localVarCall = listOrderByCartIdValidateBeforeCall(checkId, _callback);
        Type localVarReturnType = new TypeToken<Order>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
