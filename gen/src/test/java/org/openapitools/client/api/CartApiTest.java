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
import org.openapitools.client.model.Cart;
import org.openapitools.client.model.Error;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CartApi
 */
@Ignore
public class CartApiTest {

    private final CartApi api = new CartApi();

    
    /**
     * Add a product to cart
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addProductTest() throws ApiException {
        String productId = null;
        Cart response = api.addProduct(productId);

        // TODO: test validations
    }
    
    /**
     * Get cart
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCartTest() throws ApiException {
        Cart response = api.getCart();

        // TODO: test validations
    }
    
}
