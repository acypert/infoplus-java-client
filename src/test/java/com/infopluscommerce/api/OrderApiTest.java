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
import com.infopluscommerce.model.ApplyOrderWarehouseFulfillmentPlanInput;
import com.infopluscommerce.model.ApplyOrderWarehouseFulfillmentPlanOutput;
import java.math.BigDecimal;
import com.infopluscommerce.model.GetOrderWarehouseFulfillmentDataInput;
import com.infopluscommerce.model.GetOrderWarehouseFulfillmentDataOutput;
import com.infopluscommerce.model.ModelApiResponse;
import com.infopluscommerce.model.Order;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OrderApi
 */
@Ignore
public class OrderApiTest {

    private final OrderApi api = new OrderApi();

    
    /**
     * Create an order
     *
     * Inserts a new order using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addOrderTest() throws ApiException {
        Order body = null;
        Order response = api.addOrder(body);

        // TODO: test validations
    }
    
    /**
     * Add new audit for an order
     *
     * Adds an audit to an existing order.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addOrderAuditTest() throws ApiException {
        BigDecimal orderId = null;
        String orderAudit = null;
        api.addOrderAudit(orderId, orderAudit);

        // TODO: test validations
    }
    
    /**
     * Add new tags for an order.
     *
     * Adds a tag to an existing order.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addOrderTagTest() throws ApiException {
        BigDecimal orderId = null;
        String orderTag = null;
        api.addOrderTag(orderId, orderTag);

        // TODO: test validations
    }
    
    /**
     * Run the Apply Order Warehouse Fulfillment Plan method.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void applyOrderWarehouseFulfillmentPlanTest() throws ApiException {
        ApplyOrderWarehouseFulfillmentPlanInput body = null;
        ApplyOrderWarehouseFulfillmentPlanOutput response = api.applyOrderWarehouseFulfillmentPlan(body);

        // TODO: test validations
    }
    
    /**
     * Delete an order
     *
     * Deletes the order identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteOrderTest() throws ApiException {
        BigDecimal orderId = null;
        api.deleteOrder(orderId);

        // TODO: test validations
    }
    
    /**
     * Delete a tag for an order.
     *
     * Deletes an existing order tag using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteOrderTagTest() throws ApiException {
        BigDecimal orderId = null;
        String orderTag = null;
        api.deleteOrderTag(orderId, orderTag);

        // TODO: test validations
    }
    
    /**
     * Get a duplicated an order by id
     *
     * Returns a duplicated order identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDuplicateOrderByIdTest() throws ApiException {
        BigDecimal orderId = null;
        Order response = api.getDuplicateOrderById(orderId);

        // TODO: test validations
    }
    
    /**
     * Search orders by filter
     *
     * Returns the list of orders that match the given filter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrderByFilterTest() throws ApiException {
        String filter = null;
        Integer page = null;
        Integer limit = null;
        String sort = null;
        List<Order> response = api.getOrderByFilter(filter, page, limit, sort);

        // TODO: test validations
    }
    
    /**
     * Get an order by id
     *
     * Returns the order identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrderByIdTest() throws ApiException {
        BigDecimal orderId = null;
        Order response = api.getOrderById(orderId);

        // TODO: test validations
    }
    
    /**
     * Get the tags for an order.
     *
     * Get all existing order tags.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrderTagsTest() throws ApiException {
        BigDecimal orderId = null;
        api.getOrderTags(orderId);

        // TODO: test validations
    }
    
    /**
     * Run the Get Order Warehouse Fulfillment Plan method.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrderWarehouseFulfillmentDataTest() throws ApiException {
        GetOrderWarehouseFulfillmentDataInput body = null;
        GetOrderWarehouseFulfillmentDataOutput response = api.getOrderWarehouseFulfillmentData(body);

        // TODO: test validations
    }
    
    /**
     * Update an order
     *
     * Updates an existing order using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateOrderTest() throws ApiException {
        Order body = null;
        api.updateOrder(body);

        // TODO: test validations
    }
    
    /**
     * Update an order custom fields
     *
     * Updates an existing order custom fields using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateOrderCustomFieldsTest() throws ApiException {
        Order body = null;
        api.updateOrderCustomFields(body);

        // TODO: test validations
    }
    
}
