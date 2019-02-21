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
import com.infopluscommerce.model.ItemSerial;
import com.infopluscommerce.model.ModelApiResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ItemSerialApi
 */
@Ignore
public class ItemSerialApiTest {

    private final ItemSerialApi api = new ItemSerialApi();

    
    /**
     * Create an itemSerial
     *
     * Inserts a new itemSerial using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addItemSerialTest() throws ApiException {
        ItemSerial body = null;
        ItemSerial response = api.addItemSerial(body);

        // TODO: test validations
    }
    
    /**
     * Add new audit for an itemSerial
     *
     * Adds an audit to an existing itemSerial.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addItemSerialAuditTest() throws ApiException {
        Integer itemSerialId = null;
        String itemSerialAudit = null;
        api.addItemSerialAudit(itemSerialId, itemSerialAudit);

        // TODO: test validations
    }
    
    /**
     * Add new tags for an itemSerial.
     *
     * Adds a tag to an existing itemSerial.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addItemSerialTagTest() throws ApiException {
        Integer itemSerialId = null;
        String itemSerialTag = null;
        api.addItemSerialTag(itemSerialId, itemSerialTag);

        // TODO: test validations
    }
    
    /**
     * Delete an itemSerial
     *
     * Deletes the itemSerial identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteItemSerialTest() throws ApiException {
        Integer itemSerialId = null;
        api.deleteItemSerial(itemSerialId);

        // TODO: test validations
    }
    
    /**
     * Delete a tag for an itemSerial.
     *
     * Deletes an existing itemSerial tag using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteItemSerialTagTest() throws ApiException {
        Integer itemSerialId = null;
        String itemSerialTag = null;
        api.deleteItemSerialTag(itemSerialId, itemSerialTag);

        // TODO: test validations
    }
    
    /**
     * Get a duplicated an itemSerial by id
     *
     * Returns a duplicated itemSerial identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDuplicateItemSerialByIdTest() throws ApiException {
        Integer itemSerialId = null;
        ItemSerial response = api.getDuplicateItemSerialById(itemSerialId);

        // TODO: test validations
    }
    
    /**
     * Search itemSerials by filter
     *
     * Returns the list of itemSerials that match the given filter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getItemSerialByFilterTest() throws ApiException {
        String filter = null;
        Integer page = null;
        Integer limit = null;
        String sort = null;
        List<ItemSerial> response = api.getItemSerialByFilter(filter, page, limit, sort);

        // TODO: test validations
    }
    
    /**
     * Get an itemSerial by id
     *
     * Returns the itemSerial identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getItemSerialByIdTest() throws ApiException {
        Integer itemSerialId = null;
        ItemSerial response = api.getItemSerialById(itemSerialId);

        // TODO: test validations
    }
    
    /**
     * Get the tags for an itemSerial.
     *
     * Get all existing itemSerial tags.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getItemSerialTagsTest() throws ApiException {
        Integer itemSerialId = null;
        api.getItemSerialTags(itemSerialId);

        // TODO: test validations
    }
    
    /**
     * Update an itemSerial
     *
     * Updates an existing itemSerial using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateItemSerialTest() throws ApiException {
        ItemSerial body = null;
        api.updateItemSerial(body);

        // TODO: test validations
    }
    
}
