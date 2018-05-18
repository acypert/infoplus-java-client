# WarehouseApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addWarehouseAudit**](WarehouseApi.md#addWarehouseAudit) | **PUT** /beta/warehouse/{warehouseId}/audit/{warehouseAudit} | Add new audit for a warehouse
[**addWarehouseTag**](WarehouseApi.md#addWarehouseTag) | **PUT** /beta/warehouse/{warehouseId}/tag/{warehouseTag} | Add new tags for a warehouse.
[**deleteWarehouseTag**](WarehouseApi.md#deleteWarehouseTag) | **DELETE** /beta/warehouse/{warehouseId}/tag/{warehouseTag} | Delete a tag for a warehouse.
[**getDuplicateWarehouseById**](WarehouseApi.md#getDuplicateWarehouseById) | **GET** /beta/warehouse/duplicate/{warehouseId} | Get a duplicated a warehouse by id
[**getWarehouseByFilter**](WarehouseApi.md#getWarehouseByFilter) | **GET** /beta/warehouse/search | Search warehouses by filter
[**getWarehouseById**](WarehouseApi.md#getWarehouseById) | **GET** /beta/warehouse/{warehouseId} | Get a warehouse by id
[**getWarehouseTags**](WarehouseApi.md#getWarehouseTags) | **GET** /beta/warehouse/{warehouseId}/tag | Get the tags for a warehouse.
[**updateWarehouse**](WarehouseApi.md#updateWarehouse) | **PUT** /beta/warehouse | Update a warehouse
[**updateWarehouseCustomFields**](WarehouseApi.md#updateWarehouseCustomFields) | **PUT** /beta/warehouse/customFields | Update a warehouse custom fields


<a name="addWarehouseAudit"></a>
# **addWarehouseAudit**
> addWarehouseAudit(warehouseId, warehouseAudit)

Add new audit for a warehouse

Adds an audit to an existing warehouse.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WarehouseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WarehouseApi apiInstance = new WarehouseApi();
Integer warehouseId = 56; // Integer | Id of the warehouse to add an audit to
String warehouseAudit = "warehouseAudit_example"; // String | The audit to add
try {
    apiInstance.addWarehouseAudit(warehouseId, warehouseAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling WarehouseApi#addWarehouseAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **warehouseId** | **Integer**| Id of the warehouse to add an audit to |
 **warehouseAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addWarehouseTag"></a>
# **addWarehouseTag**
> addWarehouseTag(warehouseId, warehouseTag)

Add new tags for a warehouse.

Adds a tag to an existing warehouse.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WarehouseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WarehouseApi apiInstance = new WarehouseApi();
Integer warehouseId = 56; // Integer | Id of the warehouse to add a tag to
String warehouseTag = "warehouseTag_example"; // String | The tag to add
try {
    apiInstance.addWarehouseTag(warehouseId, warehouseTag);
} catch (ApiException e) {
    System.err.println("Exception when calling WarehouseApi#addWarehouseTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **warehouseId** | **Integer**| Id of the warehouse to add a tag to |
 **warehouseTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteWarehouseTag"></a>
# **deleteWarehouseTag**
> deleteWarehouseTag(warehouseId, warehouseTag)

Delete a tag for a warehouse.

Deletes an existing warehouse tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WarehouseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WarehouseApi apiInstance = new WarehouseApi();
Integer warehouseId = 56; // Integer | Id of the warehouse to remove tag from
String warehouseTag = "warehouseTag_example"; // String | The tag to delete
try {
    apiInstance.deleteWarehouseTag(warehouseId, warehouseTag);
} catch (ApiException e) {
    System.err.println("Exception when calling WarehouseApi#deleteWarehouseTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **warehouseId** | **Integer**| Id of the warehouse to remove tag from |
 **warehouseTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateWarehouseById"></a>
# **getDuplicateWarehouseById**
> Warehouse getDuplicateWarehouseById(warehouseId)

Get a duplicated a warehouse by id

Returns a duplicated warehouse identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WarehouseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WarehouseApi apiInstance = new WarehouseApi();
Integer warehouseId = 56; // Integer | Id of the warehouse to be duplicated.
try {
    Warehouse result = apiInstance.getDuplicateWarehouseById(warehouseId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WarehouseApi#getDuplicateWarehouseById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **warehouseId** | **Integer**| Id of the warehouse to be duplicated. |

### Return type

[**Warehouse**](Warehouse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWarehouseByFilter"></a>
# **getWarehouseByFilter**
> List&lt;Warehouse&gt; getWarehouseByFilter(filter, page, limit, sort)

Search warehouses by filter

Returns the list of warehouses that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WarehouseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WarehouseApi apiInstance = new WarehouseApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<Warehouse> result = apiInstance.getWarehouseByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WarehouseApi#getWarehouseByFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Query string, used to filter results. | [optional]
 **page** | **Integer**| Result page number.  Defaults to 1. | [optional]
 **limit** | **Integer**| Maximum results per page.  Defaults to 20.  Max allowed value is 250. | [optional]
 **sort** | **String**| Sort results by specified field. | [optional]

### Return type

[**List&lt;Warehouse&gt;**](Warehouse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWarehouseById"></a>
# **getWarehouseById**
> Warehouse getWarehouseById(warehouseId)

Get a warehouse by id

Returns the warehouse identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WarehouseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WarehouseApi apiInstance = new WarehouseApi();
Integer warehouseId = 56; // Integer | Id of the warehouse to be returned.
try {
    Warehouse result = apiInstance.getWarehouseById(warehouseId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WarehouseApi#getWarehouseById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **warehouseId** | **Integer**| Id of the warehouse to be returned. |

### Return type

[**Warehouse**](Warehouse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWarehouseTags"></a>
# **getWarehouseTags**
> getWarehouseTags(warehouseId)

Get the tags for a warehouse.

Get all existing warehouse tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WarehouseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WarehouseApi apiInstance = new WarehouseApi();
Integer warehouseId = 56; // Integer | Id of the warehouse to get tags for
try {
    apiInstance.getWarehouseTags(warehouseId);
} catch (ApiException e) {
    System.err.println("Exception when calling WarehouseApi#getWarehouseTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **warehouseId** | **Integer**| Id of the warehouse to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWarehouse"></a>
# **updateWarehouse**
> updateWarehouse(body)

Update a warehouse

Updates an existing warehouse using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WarehouseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WarehouseApi apiInstance = new WarehouseApi();
Warehouse body = new Warehouse(); // Warehouse | Warehouse to be updated.
try {
    apiInstance.updateWarehouse(body);
} catch (ApiException e) {
    System.err.println("Exception when calling WarehouseApi#updateWarehouse");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Warehouse**](Warehouse.md)| Warehouse to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateWarehouseCustomFields"></a>
# **updateWarehouseCustomFields**
> updateWarehouseCustomFields(body)

Update a warehouse custom fields

Updates an existing warehouse custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.WarehouseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WarehouseApi apiInstance = new WarehouseApi();
Warehouse body = new Warehouse(); // Warehouse | Warehouse to be updated.
try {
    apiInstance.updateWarehouseCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling WarehouseApi#updateWarehouseCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Warehouse**](Warehouse.md)| Warehouse to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json
