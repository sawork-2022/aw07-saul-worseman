/*
 * Carts
 * Carts
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.Order;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DeliveryApi
 */
@Ignore
public class DeliveryApiTest {

    private final DeliveryApi api = new DeliveryApi();

    
    /**
     * checkout my order according to my cartId
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listOrderByCartIdTest() throws ApiException {
        Long checkId = null;
        Order response = api.listOrderByCartId(checkId);

        // TODO: test validations
    }
    
}
