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
import com.infopluscommerce.model.Replenishment;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ReplenishmentApi
 */
@Ignore
public class ReplenishmentApiTest {

    private final ReplenishmentApi api = new ReplenishmentApi();

    
    /**
     * Add new audit for a replenishment
     *
     * Adds an audit to an existing replenishment.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addReplenishmentAuditTest() throws ApiException {
        Integer replenishmentId = null;
        String replenishmentAudit = null;
        api.addReplenishmentAudit(replenishmentId, replenishmentAudit);

        // TODO: test validations
    }
    
    /**
     * Add new tags for a replenishment.
     *
     * Adds a tag to an existing replenishment.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addReplenishmentTagTest() throws ApiException {
        Integer replenishmentId = null;
        String replenishmentTag = null;
        api.addReplenishmentTag(replenishmentId, replenishmentTag);

        // TODO: test validations
    }
    
    /**
     * Delete a tag for a replenishment.
     *
     * Deletes an existing replenishment tag using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteReplenishmentTagTest() throws ApiException {
        Integer replenishmentId = null;
        String replenishmentTag = null;
        api.deleteReplenishmentTag(replenishmentId, replenishmentTag);

        // TODO: test validations
    }
    
    /**
     * Get a duplicated a replenishment by id
     *
     * Returns a duplicated replenishment identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDuplicateReplenishmentByIdTest() throws ApiException {
        Integer replenishmentId = null;
        Replenishment response = api.getDuplicateReplenishmentById(replenishmentId);

        // TODO: test validations
    }
    
    /**
     * Search replenishments by filter
     *
     * Returns the list of replenishments that match the given filter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getReplenishmentByFilterTest() throws ApiException {
        String filter = null;
        Integer page = null;
        Integer limit = null;
        String sort = null;
        List<Replenishment> response = api.getReplenishmentByFilter(filter, page, limit, sort);

        // TODO: test validations
    }
    
    /**
     * Get a replenishment by id
     *
     * Returns the replenishment identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getReplenishmentByIdTest() throws ApiException {
        Integer replenishmentId = null;
        Replenishment response = api.getReplenishmentById(replenishmentId);

        // TODO: test validations
    }
    
    /**
     * Get the tags for a replenishment.
     *
     * Get all existing replenishment tags.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getReplenishmentTagsTest() throws ApiException {
        Integer replenishmentId = null;
        api.getReplenishmentTags(replenishmentId);

        // TODO: test validations
    }
    
    /**
     * Update a replenishment custom fields
     *
     * Updates an existing replenishment custom fields using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateReplenishmentCustomFieldsTest() throws ApiException {
        Replenishment body = null;
        api.updateReplenishmentCustomFields(body);

        // TODO: test validations
    }
    
}
