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
import com.infopluscommerce.model.OrderLine;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OrderLineApi
 */
@Ignore
public class OrderLineApiTest {

    private final OrderLineApi api = new OrderLineApi();

    
    /**
     * Add new audit for an orderLine
     *
     * Adds an audit to an existing orderLine.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addOrderLineAuditTest() throws ApiException {
        Integer orderLineId = null;
        String orderLineAudit = null;
        api.addOrderLineAudit(orderLineId, orderLineAudit);

        // TODO: test validations
    }
    
    /**
     * Add new tags for an orderLine.
     *
     * Adds a tag to an existing orderLine.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addOrderLineTagTest() throws ApiException {
        Integer orderLineId = null;
        String orderLineTag = null;
        api.addOrderLineTag(orderLineId, orderLineTag);

        // TODO: test validations
    }
    
    /**
     * Delete a tag for an orderLine.
     *
     * Deletes an existing orderLine tag using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteOrderLineTagTest() throws ApiException {
        Integer orderLineId = null;
        String orderLineTag = null;
        api.deleteOrderLineTag(orderLineId, orderLineTag);

        // TODO: test validations
    }
    
    /**
     * Get a duplicated an orderLine by id
     *
     * Returns a duplicated orderLine identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDuplicateOrderLineByIdTest() throws ApiException {
        Integer orderLineId = null;
        OrderLine response = api.getDuplicateOrderLineById(orderLineId);

        // TODO: test validations
    }
    
    /**
     * Search orderLines by filter
     *
     * Returns the list of orderLines that match the given filter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrderLineByFilterTest() throws ApiException {
        String filter = null;
        Integer page = null;
        Integer limit = null;
        String sort = null;
        List<OrderLine> response = api.getOrderLineByFilter(filter, page, limit, sort);

        // TODO: test validations
    }
    
    /**
     * Get an orderLine by id
     *
     * Returns the orderLine identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrderLineByIdTest() throws ApiException {
        Integer orderLineId = null;
        OrderLine response = api.getOrderLineById(orderLineId);

        // TODO: test validations
    }
    
    /**
     * Get the tags for an orderLine.
     *
     * Get all existing orderLine tags.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrderLineTagsTest() throws ApiException {
        Integer orderLineId = null;
        api.getOrderLineTags(orderLineId);

        // TODO: test validations
    }
    
    /**
     * Update an orderLine custom fields
     *
     * Updates an existing orderLine custom fields using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateOrderLineCustomFieldsTest() throws ApiException {
        OrderLine body = null;
        api.updateOrderLineCustomFields(body);

        // TODO: test validations
    }
    
}
