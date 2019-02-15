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
import com.infopluscommerce.model.Alert;
import com.infopluscommerce.model.ModelApiResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AlertApi
 */
@Ignore
public class AlertApiTest {

    private final AlertApi api = new AlertApi();

    
    /**
     * Create an alert
     *
     * Inserts a new alert using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addAlertTest() throws ApiException {
        Alert body = null;
        Alert response = api.addAlert(body);

        // TODO: test validations
    }
    
    /**
     * Add new audit for an alert
     *
     * Adds an audit to an existing alert.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addAlertAuditTest() throws ApiException {
        Integer alertId = null;
        String alertAudit = null;
        api.addAlertAudit(alertId, alertAudit);

        // TODO: test validations
    }
    
    /**
     * Add new tags for an alert.
     *
     * Adds a tag to an existing alert.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addAlertTagTest() throws ApiException {
        Integer alertId = null;
        String alertTag = null;
        api.addAlertTag(alertId, alertTag);

        // TODO: test validations
    }
    
    /**
     * Delete a tag for an alert.
     *
     * Deletes an existing alert tag using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAlertTagTest() throws ApiException {
        Integer alertId = null;
        String alertTag = null;
        api.deleteAlertTag(alertId, alertTag);

        // TODO: test validations
    }
    
    /**
     * Search alerts by filter
     *
     * Returns the list of alerts that match the given filter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAlertByFilterTest() throws ApiException {
        String filter = null;
        Integer page = null;
        Integer limit = null;
        String sort = null;
        List<Alert> response = api.getAlertByFilter(filter, page, limit, sort);

        // TODO: test validations
    }
    
    /**
     * Get an alert by id
     *
     * Returns the alert identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAlertByIdTest() throws ApiException {
        Integer alertId = null;
        Alert response = api.getAlertById(alertId);

        // TODO: test validations
    }
    
    /**
     * Get the tags for an alert.
     *
     * Get all existing alert tags.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAlertTagsTest() throws ApiException {
        Integer alertId = null;
        api.getAlertTags(alertId);

        // TODO: test validations
    }
    
    /**
     * Get a duplicated an alert by id
     *
     * Returns a duplicated alert identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDuplicateAlertByIdTest() throws ApiException {
        Integer alertId = null;
        Alert response = api.getDuplicateAlertById(alertId);

        // TODO: test validations
    }
    
    /**
     * Update an alert custom fields
     *
     * Updates an existing alert custom fields using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAlertCustomFieldsTest() throws ApiException {
        Alert body = null;
        api.updateAlertCustomFields(body);

        // TODO: test validations
    }
    
}
