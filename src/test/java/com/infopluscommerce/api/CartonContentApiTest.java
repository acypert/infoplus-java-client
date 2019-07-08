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
import com.infopluscommerce.model.CartonContent;
import com.infopluscommerce.model.ModelApiResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CartonContentApi
 */
@Ignore
public class CartonContentApiTest {

    private final CartonContentApi api = new CartonContentApi();

    
    /**
     * Create a cartonContent
     *
     * Inserts a new cartonContent using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addCartonContentTest() throws ApiException {
        CartonContent body = null;
        CartonContent response = api.addCartonContent(body);

        // TODO: test validations
    }
    
    /**
     * Add new audit for a cartonContent
     *
     * Adds an audit to an existing cartonContent.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addCartonContentAuditTest() throws ApiException {
        Integer cartonContentId = null;
        String cartonContentAudit = null;
        api.addCartonContentAudit(cartonContentId, cartonContentAudit);

        // TODO: test validations
    }
    
    /**
     * Attach a file to a cartonContent
     *
     * Adds a file to an existing cartonContent.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addCartonContentFileTest() throws ApiException {
        Integer cartonContentId = null;
        String fileName = null;
        api.addCartonContentFile(cartonContentId, fileName);

        // TODO: test validations
    }
    
    /**
     * Add new tags for a cartonContent.
     *
     * Adds a tag to an existing cartonContent.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addCartonContentTagTest() throws ApiException {
        Integer cartonContentId = null;
        String cartonContentTag = null;
        api.addCartonContentTag(cartonContentId, cartonContentTag);

        // TODO: test validations
    }
    
    /**
     * Delete a cartonContent
     *
     * Deletes the cartonContent identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCartonContentTest() throws ApiException {
        Integer cartonContentId = null;
        api.deleteCartonContent(cartonContentId);

        // TODO: test validations
    }
    
    /**
     * Delete a tag for a cartonContent.
     *
     * Deletes an existing cartonContent tag using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCartonContentTagTest() throws ApiException {
        Integer cartonContentId = null;
        String cartonContentTag = null;
        api.deleteCartonContentTag(cartonContentId, cartonContentTag);

        // TODO: test validations
    }
    
    /**
     * Search cartonContents by filter
     *
     * Returns the list of cartonContents that match the given filter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCartonContentByFilterTest() throws ApiException {
        String filter = null;
        Integer page = null;
        Integer limit = null;
        String sort = null;
        List<CartonContent> response = api.getCartonContentByFilter(filter, page, limit, sort);

        // TODO: test validations
    }
    
    /**
     * Get a cartonContent by id
     *
     * Returns the cartonContent identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCartonContentByIdTest() throws ApiException {
        Integer cartonContentId = null;
        CartonContent response = api.getCartonContentById(cartonContentId);

        // TODO: test validations
    }
    
    /**
     * Get the tags for a cartonContent.
     *
     * Get all existing cartonContent tags.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCartonContentTagsTest() throws ApiException {
        Integer cartonContentId = null;
        api.getCartonContentTags(cartonContentId);

        // TODO: test validations
    }
    
    /**
     * Get a duplicated a cartonContent by id
     *
     * Returns a duplicated cartonContent identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDuplicateCartonContentByIdTest() throws ApiException {
        Integer cartonContentId = null;
        CartonContent response = api.getDuplicateCartonContentById(cartonContentId);

        // TODO: test validations
    }
    
    /**
     * Update a cartonContent
     *
     * Updates an existing cartonContent using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCartonContentTest() throws ApiException {
        CartonContent body = null;
        api.updateCartonContent(body);

        // TODO: test validations
    }
    
    /**
     * Update a cartonContent custom fields
     *
     * Updates an existing cartonContent custom fields using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCartonContentCustomFieldsTest() throws ApiException {
        CartonContent body = null;
        api.updateCartonContentCustomFields(body);

        // TODO: test validations
    }
    
}
