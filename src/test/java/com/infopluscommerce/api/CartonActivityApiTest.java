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
import com.infopluscommerce.model.CartonActivity;
import com.infopluscommerce.model.ModelApiResponse;
import com.infopluscommerce.model.RecordFile;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CartonActivityApi
 */
@Ignore
public class CartonActivityApiTest {

    private final CartonActivityApi api = new CartonActivityApi();

    
    /**
     * Create a cartonActivity
     *
     * Inserts a new cartonActivity using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addCartonActivityTest() throws ApiException {
        CartonActivity body = null;
        CartonActivity response = api.addCartonActivity(body);

        // TODO: test validations
    }
    
    /**
     * Add new audit for a cartonActivity
     *
     * Adds an audit to an existing cartonActivity.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addCartonActivityAuditTest() throws ApiException {
        Integer cartonActivityId = null;
        String cartonActivityAudit = null;
        api.addCartonActivityAudit(cartonActivityId, cartonActivityAudit);

        // TODO: test validations
    }
    
    /**
     * Attach a file to a cartonActivity
     *
     * Adds a file to an existing cartonActivity.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addCartonActivityFileTest() throws ApiException {
        Integer cartonActivityId = null;
        String fileName = null;
        api.addCartonActivityFile(cartonActivityId, fileName);

        // TODO: test validations
    }
    
    /**
     * Attach a file to a cartonActivity by URL.
     *
     * Adds a file to an existing cartonActivity by URL.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addCartonActivityFileByURLTest() throws ApiException {
        RecordFile body = null;
        Integer cartonActivityId = null;
        api.addCartonActivityFileByURL(body, cartonActivityId);

        // TODO: test validations
    }
    
    /**
     * Add new tags for a cartonActivity.
     *
     * Adds a tag to an existing cartonActivity.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addCartonActivityTagTest() throws ApiException {
        Integer cartonActivityId = null;
        String cartonActivityTag = null;
        api.addCartonActivityTag(cartonActivityId, cartonActivityTag);

        // TODO: test validations
    }
    
    /**
     * Delete a cartonActivity
     *
     * Deletes the cartonActivity identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCartonActivityTest() throws ApiException {
        Integer cartonActivityId = null;
        api.deleteCartonActivity(cartonActivityId);

        // TODO: test validations
    }
    
    /**
     * Delete a file for a cartonActivity.
     *
     * Deletes an existing cartonActivity file using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCartonActivityFileTest() throws ApiException {
        Integer cartonActivityId = null;
        Integer fileId = null;
        api.deleteCartonActivityFile(cartonActivityId, fileId);

        // TODO: test validations
    }
    
    /**
     * Delete a tag for a cartonActivity.
     *
     * Deletes an existing cartonActivity tag using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCartonActivityTagTest() throws ApiException {
        Integer cartonActivityId = null;
        String cartonActivityTag = null;
        api.deleteCartonActivityTag(cartonActivityId, cartonActivityTag);

        // TODO: test validations
    }
    
    /**
     * Search cartonActivitys by filter
     *
     * Returns the list of cartonActivitys that match the given filter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCartonActivityByFilterTest() throws ApiException {
        String filter = null;
        Integer page = null;
        Integer limit = null;
        String sort = null;
        List<CartonActivity> response = api.getCartonActivityByFilter(filter, page, limit, sort);

        // TODO: test validations
    }
    
    /**
     * Get a cartonActivity by id
     *
     * Returns the cartonActivity identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCartonActivityByIdTest() throws ApiException {
        Integer cartonActivityId = null;
        CartonActivity response = api.getCartonActivityById(cartonActivityId);

        // TODO: test validations
    }
    
    /**
     * Get the files for a cartonActivity.
     *
     * Get all existing cartonActivity files.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCartonActivityFilesTest() throws ApiException {
        Integer cartonActivityId = null;
        api.getCartonActivityFiles(cartonActivityId);

        // TODO: test validations
    }
    
    /**
     * Get the tags for a cartonActivity.
     *
     * Get all existing cartonActivity tags.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCartonActivityTagsTest() throws ApiException {
        Integer cartonActivityId = null;
        api.getCartonActivityTags(cartonActivityId);

        // TODO: test validations
    }
    
    /**
     * Get a duplicated a cartonActivity by id
     *
     * Returns a duplicated cartonActivity identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDuplicateCartonActivityByIdTest() throws ApiException {
        Integer cartonActivityId = null;
        CartonActivity response = api.getDuplicateCartonActivityById(cartonActivityId);

        // TODO: test validations
    }
    
    /**
     * Update a cartonActivity
     *
     * Updates an existing cartonActivity using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCartonActivityTest() throws ApiException {
        CartonActivity body = null;
        api.updateCartonActivity(body);

        // TODO: test validations
    }
    
}
