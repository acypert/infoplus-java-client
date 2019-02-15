/*
 * Infoplus API
 * Infoplus API.
 *
 * OpenAPI spec version: beta
 * Contact: api@infopluscommerce.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.infopluscommerce.api;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.model.ModelApiResponse;
import com.infopluscommerce.model.ShoppingCartConnection;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ShoppingCartConnectionApi
 */
@Ignore
public class ShoppingCartConnectionApiTest {

    private final ShoppingCartConnectionApi api = new ShoppingCartConnectionApi();

    
    /**
     * Create a shoppingCartConnection
     *
     * Inserts a new shoppingCartConnection using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addShoppingCartConnectionTest() throws ApiException {
        ShoppingCartConnection body = null;
        ShoppingCartConnection response = api.addShoppingCartConnection(body);

        // TODO: test validations
    }
    
    /**
     * Add new audit for a shoppingCartConnection
     *
     * Adds an audit to an existing shoppingCartConnection.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addShoppingCartConnectionAuditTest() throws ApiException {
        Integer shoppingCartConnectionId = null;
        String shoppingCartConnectionAudit = null;
        api.addShoppingCartConnectionAudit(shoppingCartConnectionId, shoppingCartConnectionAudit);

        // TODO: test validations
    }
    
    /**
     * Add new tags for a shoppingCartConnection.
     *
     * Adds a tag to an existing shoppingCartConnection.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addShoppingCartConnectionTagTest() throws ApiException {
        Integer shoppingCartConnectionId = null;
        String shoppingCartConnectionTag = null;
        api.addShoppingCartConnectionTag(shoppingCartConnectionId, shoppingCartConnectionTag);

        // TODO: test validations
    }
    
    /**
     * Delete a shoppingCartConnection
     *
     * Deletes the shoppingCartConnection identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteShoppingCartConnectionTest() throws ApiException {
        Integer shoppingCartConnectionId = null;
        api.deleteShoppingCartConnection(shoppingCartConnectionId);

        // TODO: test validations
    }
    
    /**
     * Delete a tag for a shoppingCartConnection.
     *
     * Deletes an existing shoppingCartConnection tag using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteShoppingCartConnectionTagTest() throws ApiException {
        Integer shoppingCartConnectionId = null;
        String shoppingCartConnectionTag = null;
        api.deleteShoppingCartConnectionTag(shoppingCartConnectionId, shoppingCartConnectionTag);

        // TODO: test validations
    }
    
    /**
     * Get a duplicated a shoppingCartConnection by id
     *
     * Returns a duplicated shoppingCartConnection identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDuplicateShoppingCartConnectionByIdTest() throws ApiException {
        Integer shoppingCartConnectionId = null;
        ShoppingCartConnection response = api.getDuplicateShoppingCartConnectionById(shoppingCartConnectionId);

        // TODO: test validations
    }
    
    /**
     * Search shoppingCartConnections by filter
     *
     * Returns the list of shoppingCartConnections that match the given filter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getShoppingCartConnectionByFilterTest() throws ApiException {
        String filter = null;
        Integer page = null;
        Integer limit = null;
        String sort = null;
        List<ShoppingCartConnection> response = api.getShoppingCartConnectionByFilter(filter, page, limit, sort);

        // TODO: test validations
    }
    
    /**
     * Get a shoppingCartConnection by id
     *
     * Returns the shoppingCartConnection identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getShoppingCartConnectionByIdTest() throws ApiException {
        Integer shoppingCartConnectionId = null;
        ShoppingCartConnection response = api.getShoppingCartConnectionById(shoppingCartConnectionId);

        // TODO: test validations
    }
    
    /**
     * Get the tags for a shoppingCartConnection.
     *
     * Get all existing shoppingCartConnection tags.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getShoppingCartConnectionTagsTest() throws ApiException {
        Integer shoppingCartConnectionId = null;
        api.getShoppingCartConnectionTags(shoppingCartConnectionId);

        // TODO: test validations
    }
    
    /**
     * Update a shoppingCartConnection
     *
     * Updates an existing shoppingCartConnection using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateShoppingCartConnectionTest() throws ApiException {
        ShoppingCartConnection body = null;
        api.updateShoppingCartConnection(body);

        // TODO: test validations
    }
    
    /**
     * Update a shoppingCartConnection custom fields
     *
     * Updates an existing shoppingCartConnection custom fields using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateShoppingCartConnectionCustomFieldsTest() throws ApiException {
        ShoppingCartConnection body = null;
        api.updateShoppingCartConnectionCustomFields(body);

        // TODO: test validations
    }
    
}
