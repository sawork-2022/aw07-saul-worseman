/*
 * Products
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
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
import org.openapitools.client.model.Product;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductApi {
    private ApiClient localVarApiClient;

    public ProductApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ProductApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for showProductById
     * @param productId The id of the product to retrieve (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Expected response to a valid request </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call showProductByIdCall(Long productId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/products/{productId}"
            .replaceAll("\\{" + "productId" + "\\}", localVarApiClient.escapeString(productId.toString()));

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
    private okhttp3.Call showProductByIdValidateBeforeCall(Long productId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new ApiException("Missing the required parameter 'productId' when calling showProductById(Async)");
        }
        

        okhttp3.Call localVarCall = showProductByIdCall(productId, _callback);
        return localVarCall;

    }

    /**
     * Info for a specific product
     * 
     * @param productId The id of the product to retrieve (required)
     * @return Product
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Expected response to a valid request </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public Product showProductById(Long productId) throws ApiException {
        ApiResponse<Product> localVarResp = showProductByIdWithHttpInfo(productId);
        return localVarResp.getData();
    }

    /**
     * Info for a specific product
     * 
     * @param productId The id of the product to retrieve (required)
     * @return ApiResponse&lt;Product&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Expected response to a valid request </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Product> showProductByIdWithHttpInfo(Long productId) throws ApiException {
        okhttp3.Call localVarCall = showProductByIdValidateBeforeCall(productId, null);
        Type localVarReturnType = new TypeToken<Product>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Info for a specific product (asynchronously)
     * 
     * @param productId The id of the product to retrieve (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Expected response to a valid request </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call showProductByIdAsync(Long productId, final ApiCallback<Product> _callback) throws ApiException {

        okhttp3.Call localVarCall = showProductByIdValidateBeforeCall(productId, _callback);
        Type localVarReturnType = new TypeToken<Product>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
