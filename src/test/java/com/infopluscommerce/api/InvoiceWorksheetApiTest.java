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
import com.infopluscommerce.model.InvoiceWorksheet;
import com.infopluscommerce.model.ModelApiResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InvoiceWorksheetApi
 */
@Ignore
public class InvoiceWorksheetApiTest {

    private final InvoiceWorksheetApi api = new InvoiceWorksheetApi();

    
    /**
     * Create an invoiceWorksheet
     *
     * Inserts a new invoiceWorksheet using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addInvoiceWorksheetTest() throws ApiException {
        InvoiceWorksheet body = null;
        InvoiceWorksheet response = api.addInvoiceWorksheet(body);

        // TODO: test validations
    }
    
    /**
     * Add new audit for an invoiceWorksheet
     *
     * Adds an audit to an existing invoiceWorksheet.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addInvoiceWorksheetAuditTest() throws ApiException {
        Integer invoiceWorksheetId = null;
        String invoiceWorksheetAudit = null;
        api.addInvoiceWorksheetAudit(invoiceWorksheetId, invoiceWorksheetAudit);

        // TODO: test validations
    }
    
    /**
     * Add new tags for an invoiceWorksheet.
     *
     * Adds a tag to an existing invoiceWorksheet.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addInvoiceWorksheetTagTest() throws ApiException {
        Integer invoiceWorksheetId = null;
        String invoiceWorksheetTag = null;
        api.addInvoiceWorksheetTag(invoiceWorksheetId, invoiceWorksheetTag);

        // TODO: test validations
    }
    
    /**
     * Delete an invoiceWorksheet
     *
     * Deletes the invoiceWorksheet identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteInvoiceWorksheetTest() throws ApiException {
        Integer invoiceWorksheetId = null;
        api.deleteInvoiceWorksheet(invoiceWorksheetId);

        // TODO: test validations
    }
    
    /**
     * Delete a tag for an invoiceWorksheet.
     *
     * Deletes an existing invoiceWorksheet tag using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteInvoiceWorksheetTagTest() throws ApiException {
        Integer invoiceWorksheetId = null;
        String invoiceWorksheetTag = null;
        api.deleteInvoiceWorksheetTag(invoiceWorksheetId, invoiceWorksheetTag);

        // TODO: test validations
    }
    
    /**
     * Get a duplicated an invoiceWorksheet by id
     *
     * Returns a duplicated invoiceWorksheet identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDuplicateInvoiceWorksheetByIdTest() throws ApiException {
        Integer invoiceWorksheetId = null;
        InvoiceWorksheet response = api.getDuplicateInvoiceWorksheetById(invoiceWorksheetId);

        // TODO: test validations
    }
    
    /**
     * Search invoiceWorksheets by filter
     *
     * Returns the list of invoiceWorksheets that match the given filter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInvoiceWorksheetByFilterTest() throws ApiException {
        String filter = null;
        Integer page = null;
        Integer limit = null;
        String sort = null;
        List<InvoiceWorksheet> response = api.getInvoiceWorksheetByFilter(filter, page, limit, sort);

        // TODO: test validations
    }
    
    /**
     * Get an invoiceWorksheet by id
     *
     * Returns the invoiceWorksheet identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInvoiceWorksheetByIdTest() throws ApiException {
        Integer invoiceWorksheetId = null;
        InvoiceWorksheet response = api.getInvoiceWorksheetById(invoiceWorksheetId);

        // TODO: test validations
    }
    
    /**
     * Get the tags for an invoiceWorksheet.
     *
     * Get all existing invoiceWorksheet tags.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInvoiceWorksheetTagsTest() throws ApiException {
        Integer invoiceWorksheetId = null;
        api.getInvoiceWorksheetTags(invoiceWorksheetId);

        // TODO: test validations
    }
    
    /**
     * Update an invoiceWorksheet
     *
     * Updates an existing invoiceWorksheet using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateInvoiceWorksheetTest() throws ApiException {
        InvoiceWorksheet body = null;
        api.updateInvoiceWorksheet(body);

        // TODO: test validations
    }
    
}
