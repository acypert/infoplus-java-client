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
import com.infopluscommerce.model.BusinessTransaction;
import com.infopluscommerce.model.ModelApiResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BusinessTransactionApi
 */
@Ignore
public class BusinessTransactionApiTest {

    private final BusinessTransactionApi api = new BusinessTransactionApi();

    
    /**
     * Create a businessTransaction
     *
     * Inserts a new businessTransaction using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addBusinessTransactionTest() throws ApiException {
        BusinessTransaction body = null;
        BusinessTransaction response = api.addBusinessTransaction(body);

        // TODO: test validations
    }
    
    /**
     * Add new audit for a businessTransaction
     *
     * Adds an audit to an existing businessTransaction.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addBusinessTransactionAuditTest() throws ApiException {
        Integer businessTransactionId = null;
        String businessTransactionAudit = null;
        api.addBusinessTransactionAudit(businessTransactionId, businessTransactionAudit);

        // TODO: test validations
    }
    
    /**
     * Attach a file to a businessTransaction
     *
     * Adds a file to an existing businessTransaction.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addBusinessTransactionFileTest() throws ApiException {
        Integer businessTransactionId = null;
        String fileName = null;
        api.addBusinessTransactionFile(businessTransactionId, fileName);

        // TODO: test validations
    }
    
    /**
     * Add new tags for a businessTransaction.
     *
     * Adds a tag to an existing businessTransaction.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addBusinessTransactionTagTest() throws ApiException {
        Integer businessTransactionId = null;
        String businessTransactionTag = null;
        api.addBusinessTransactionTag(businessTransactionId, businessTransactionTag);

        // TODO: test validations
    }
    
    /**
     * Delete a tag for a businessTransaction.
     *
     * Deletes an existing businessTransaction tag using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteBusinessTransactionTagTest() throws ApiException {
        Integer businessTransactionId = null;
        String businessTransactionTag = null;
        api.deleteBusinessTransactionTag(businessTransactionId, businessTransactionTag);

        // TODO: test validations
    }
    
    /**
     * Search businessTransactions by filter
     *
     * Returns the list of businessTransactions that match the given filter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBusinessTransactionByFilterTest() throws ApiException {
        String filter = null;
        Integer page = null;
        Integer limit = null;
        String sort = null;
        List<BusinessTransaction> response = api.getBusinessTransactionByFilter(filter, page, limit, sort);

        // TODO: test validations
    }
    
    /**
     * Get a businessTransaction by id
     *
     * Returns the businessTransaction identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBusinessTransactionByIdTest() throws ApiException {
        Integer businessTransactionId = null;
        BusinessTransaction response = api.getBusinessTransactionById(businessTransactionId);

        // TODO: test validations
    }
    
    /**
     * Get the tags for a businessTransaction.
     *
     * Get all existing businessTransaction tags.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBusinessTransactionTagsTest() throws ApiException {
        Integer businessTransactionId = null;
        api.getBusinessTransactionTags(businessTransactionId);

        // TODO: test validations
    }
    
    /**
     * Get a duplicated a businessTransaction by id
     *
     * Returns a duplicated businessTransaction identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDuplicateBusinessTransactionByIdTest() throws ApiException {
        Integer businessTransactionId = null;
        BusinessTransaction response = api.getDuplicateBusinessTransactionById(businessTransactionId);

        // TODO: test validations
    }
    
    /**
     * Update a businessTransaction
     *
     * Updates an existing businessTransaction using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateBusinessTransactionTest() throws ApiException {
        BusinessTransaction body = null;
        api.updateBusinessTransaction(body);

        // TODO: test validations
    }
    
    /**
     * Update a businessTransaction custom fields
     *
     * Updates an existing businessTransaction custom fields using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateBusinessTransactionCustomFieldsTest() throws ApiException {
        BusinessTransaction body = null;
        api.updateBusinessTransactionCustomFields(body);

        // TODO: test validations
    }
    
}
