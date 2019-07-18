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
import com.infopluscommerce.model.StandardBusinessDays;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StandardBusinessDaysApi
 */
@Ignore
public class StandardBusinessDaysApiTest {

    private final StandardBusinessDaysApi api = new StandardBusinessDaysApi();

    
    /**
     * Create a standardBusinessDays
     *
     * Inserts a new standardBusinessDays using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addStandardBusinessDaysTest() throws ApiException {
        StandardBusinessDays body = null;
        StandardBusinessDays response = api.addStandardBusinessDays(body);

        // TODO: test validations
    }
    
    /**
     * Add new audit for a standardBusinessDays
     *
     * Adds an audit to an existing standardBusinessDays.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addStandardBusinessDaysAuditTest() throws ApiException {
        Integer standardBusinessDaysId = null;
        String standardBusinessDaysAudit = null;
        api.addStandardBusinessDaysAudit(standardBusinessDaysId, standardBusinessDaysAudit);

        // TODO: test validations
    }
    
    /**
     * Attach a file to a standardBusinessDays
     *
     * Adds a file to an existing standardBusinessDays.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addStandardBusinessDaysFileTest() throws ApiException {
        Integer standardBusinessDaysId = null;
        String fileName = null;
        api.addStandardBusinessDaysFile(standardBusinessDaysId, fileName);

        // TODO: test validations
    }
    
    /**
     * Add new tags for a standardBusinessDays.
     *
     * Adds a tag to an existing standardBusinessDays.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addStandardBusinessDaysTagTest() throws ApiException {
        Integer standardBusinessDaysId = null;
        String standardBusinessDaysTag = null;
        api.addStandardBusinessDaysTag(standardBusinessDaysId, standardBusinessDaysTag);

        // TODO: test validations
    }
    
    /**
     * Delete a standardBusinessDays
     *
     * Deletes the standardBusinessDays identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteStandardBusinessDaysTest() throws ApiException {
        Integer standardBusinessDaysId = null;
        api.deleteStandardBusinessDays(standardBusinessDaysId);

        // TODO: test validations
    }
    
    /**
     * Delete a tag for a standardBusinessDays.
     *
     * Deletes an existing standardBusinessDays tag using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteStandardBusinessDaysTagTest() throws ApiException {
        Integer standardBusinessDaysId = null;
        String standardBusinessDaysTag = null;
        api.deleteStandardBusinessDaysTag(standardBusinessDaysId, standardBusinessDaysTag);

        // TODO: test validations
    }
    
    /**
     * Get a duplicated a standardBusinessDays by id
     *
     * Returns a duplicated standardBusinessDays identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDuplicateStandardBusinessDaysByIdTest() throws ApiException {
        Integer standardBusinessDaysId = null;
        StandardBusinessDays response = api.getDuplicateStandardBusinessDaysById(standardBusinessDaysId);

        // TODO: test validations
    }
    
    /**
     * Search standardBusinessDayses by filter
     *
     * Returns the list of standardBusinessDayses that match the given filter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStandardBusinessDaysByFilterTest() throws ApiException {
        String filter = null;
        Integer page = null;
        Integer limit = null;
        String sort = null;
        List<StandardBusinessDays> response = api.getStandardBusinessDaysByFilter(filter, page, limit, sort);

        // TODO: test validations
    }
    
    /**
     * Get a standardBusinessDays by id
     *
     * Returns the standardBusinessDays identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStandardBusinessDaysByIdTest() throws ApiException {
        Integer standardBusinessDaysId = null;
        StandardBusinessDays response = api.getStandardBusinessDaysById(standardBusinessDaysId);

        // TODO: test validations
    }
    
    /**
     * Get the tags for a standardBusinessDays.
     *
     * Get all existing standardBusinessDays tags.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStandardBusinessDaysTagsTest() throws ApiException {
        Integer standardBusinessDaysId = null;
        api.getStandardBusinessDaysTags(standardBusinessDaysId);

        // TODO: test validations
    }
    
    /**
     * Update a standardBusinessDays
     *
     * Updates an existing standardBusinessDays using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateStandardBusinessDaysTest() throws ApiException {
        StandardBusinessDays body = null;
        api.updateStandardBusinessDays(body);

        // TODO: test validations
    }
    
}