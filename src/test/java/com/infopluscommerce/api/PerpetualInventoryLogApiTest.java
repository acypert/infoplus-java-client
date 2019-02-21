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
import com.infopluscommerce.model.PerpetualInventoryLog;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PerpetualInventoryLogApi
 */
@Ignore
public class PerpetualInventoryLogApiTest {

    private final PerpetualInventoryLogApi api = new PerpetualInventoryLogApi();

    
    /**
     * Add new audit for a perpetualInventoryLog
     *
     * Adds an audit to an existing perpetualInventoryLog.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addPerpetualInventoryLogAuditTest() throws ApiException {
        Integer perpetualInventoryLogId = null;
        String perpetualInventoryLogAudit = null;
        api.addPerpetualInventoryLogAudit(perpetualInventoryLogId, perpetualInventoryLogAudit);

        // TODO: test validations
    }
    
    /**
     * Add new tags for a perpetualInventoryLog.
     *
     * Adds a tag to an existing perpetualInventoryLog.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addPerpetualInventoryLogTagTest() throws ApiException {
        Integer perpetualInventoryLogId = null;
        String perpetualInventoryLogTag = null;
        api.addPerpetualInventoryLogTag(perpetualInventoryLogId, perpetualInventoryLogTag);

        // TODO: test validations
    }
    
    /**
     * Delete a tag for a perpetualInventoryLog.
     *
     * Deletes an existing perpetualInventoryLog tag using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePerpetualInventoryLogTagTest() throws ApiException {
        Integer perpetualInventoryLogId = null;
        String perpetualInventoryLogTag = null;
        api.deletePerpetualInventoryLogTag(perpetualInventoryLogId, perpetualInventoryLogTag);

        // TODO: test validations
    }
    
    /**
     * Get a duplicated a perpetualInventoryLog by id
     *
     * Returns a duplicated perpetualInventoryLog identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDuplicatePerpetualInventoryLogByIdTest() throws ApiException {
        Integer perpetualInventoryLogId = null;
        PerpetualInventoryLog response = api.getDuplicatePerpetualInventoryLogById(perpetualInventoryLogId);

        // TODO: test validations
    }
    
    /**
     * Search perpetualInventoryLogs by filter
     *
     * Returns the list of perpetualInventoryLogs that match the given filter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPerpetualInventoryLogByFilterTest() throws ApiException {
        String filter = null;
        Integer page = null;
        Integer limit = null;
        String sort = null;
        List<PerpetualInventoryLog> response = api.getPerpetualInventoryLogByFilter(filter, page, limit, sort);

        // TODO: test validations
    }
    
    /**
     * Get a perpetualInventoryLog by id
     *
     * Returns the perpetualInventoryLog identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPerpetualInventoryLogByIdTest() throws ApiException {
        Integer perpetualInventoryLogId = null;
        PerpetualInventoryLog response = api.getPerpetualInventoryLogById(perpetualInventoryLogId);

        // TODO: test validations
    }
    
    /**
     * Get the tags for a perpetualInventoryLog.
     *
     * Get all existing perpetualInventoryLog tags.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPerpetualInventoryLogTagsTest() throws ApiException {
        Integer perpetualInventoryLogId = null;
        api.getPerpetualInventoryLogTags(perpetualInventoryLogId);

        // TODO: test validations
    }
    
}
