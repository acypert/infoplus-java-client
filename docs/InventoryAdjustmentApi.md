# InventoryAdjustmentApi

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addInventoryAdjustmentAudit**](InventoryAdjustmentApi.md#addInventoryAdjustmentAudit) | **PUT** /beta/inventoryAdjustment/{inventoryAdjustmentId}/audit/{inventoryAdjustmentAudit} | Add new audit for an inventoryAdjustment
[**addInventoryAdjustmentTag**](InventoryAdjustmentApi.md#addInventoryAdjustmentTag) | **PUT** /beta/inventoryAdjustment/{inventoryAdjustmentId}/tag/{inventoryAdjustmentTag} | Add new tags for an inventoryAdjustment.
[**deleteInventoryAdjustmentTag**](InventoryAdjustmentApi.md#deleteInventoryAdjustmentTag) | **DELETE** /beta/inventoryAdjustment/{inventoryAdjustmentId}/tag/{inventoryAdjustmentTag} | Delete a tag for an inventoryAdjustment.
[**getDuplicateInventoryAdjustmentById**](InventoryAdjustmentApi.md#getDuplicateInventoryAdjustmentById) | **GET** /beta/inventoryAdjustment/duplicate/{inventoryAdjustmentId} | Get a duplicated an inventoryAdjustment by id
[**getInventoryAdjustmentByFilter**](InventoryAdjustmentApi.md#getInventoryAdjustmentByFilter) | **GET** /beta/inventoryAdjustment/search | Search inventoryAdjustments by filter
[**getInventoryAdjustmentById**](InventoryAdjustmentApi.md#getInventoryAdjustmentById) | **GET** /beta/inventoryAdjustment/{inventoryAdjustmentId} | Get an inventoryAdjustment by id
[**getInventoryAdjustmentTags**](InventoryAdjustmentApi.md#getInventoryAdjustmentTags) | **GET** /beta/inventoryAdjustment/{inventoryAdjustmentId}/tag | Get the tags for an inventoryAdjustment.
[**updateInventoryAdjustmentCustomFields**](InventoryAdjustmentApi.md#updateInventoryAdjustmentCustomFields) | **PUT** /beta/inventoryAdjustment/customFields | Update an inventoryAdjustment custom fields


<a name="addInventoryAdjustmentAudit"></a>
# **addInventoryAdjustmentAudit**
> addInventoryAdjustmentAudit(inventoryAdjustmentId, inventoryAdjustmentAudit)

Add new audit for an inventoryAdjustment

Adds an audit to an existing inventoryAdjustment.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InventoryAdjustmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InventoryAdjustmentApi apiInstance = new InventoryAdjustmentApi();
Integer inventoryAdjustmentId = 56; // Integer | Id of the inventoryAdjustment to add an audit to
String inventoryAdjustmentAudit = "inventoryAdjustmentAudit_example"; // String | The audit to add
try {
    apiInstance.addInventoryAdjustmentAudit(inventoryAdjustmentId, inventoryAdjustmentAudit);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryAdjustmentApi#addInventoryAdjustmentAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inventoryAdjustmentId** | **Integer**| Id of the inventoryAdjustment to add an audit to |
 **inventoryAdjustmentAudit** | **String**| The audit to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addInventoryAdjustmentTag"></a>
# **addInventoryAdjustmentTag**
> addInventoryAdjustmentTag(inventoryAdjustmentId, inventoryAdjustmentTag)

Add new tags for an inventoryAdjustment.

Adds a tag to an existing inventoryAdjustment.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InventoryAdjustmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InventoryAdjustmentApi apiInstance = new InventoryAdjustmentApi();
Integer inventoryAdjustmentId = 56; // Integer | Id of the inventoryAdjustment to add a tag to
String inventoryAdjustmentTag = "inventoryAdjustmentTag_example"; // String | The tag to add
try {
    apiInstance.addInventoryAdjustmentTag(inventoryAdjustmentId, inventoryAdjustmentTag);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryAdjustmentApi#addInventoryAdjustmentTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inventoryAdjustmentId** | **Integer**| Id of the inventoryAdjustment to add a tag to |
 **inventoryAdjustmentTag** | **String**| The tag to add |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteInventoryAdjustmentTag"></a>
# **deleteInventoryAdjustmentTag**
> deleteInventoryAdjustmentTag(inventoryAdjustmentId, inventoryAdjustmentTag)

Delete a tag for an inventoryAdjustment.

Deletes an existing inventoryAdjustment tag using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InventoryAdjustmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InventoryAdjustmentApi apiInstance = new InventoryAdjustmentApi();
Integer inventoryAdjustmentId = 56; // Integer | Id of the inventoryAdjustment to remove tag from
String inventoryAdjustmentTag = "inventoryAdjustmentTag_example"; // String | The tag to delete
try {
    apiInstance.deleteInventoryAdjustmentTag(inventoryAdjustmentId, inventoryAdjustmentTag);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryAdjustmentApi#deleteInventoryAdjustmentTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inventoryAdjustmentId** | **Integer**| Id of the inventoryAdjustment to remove tag from |
 **inventoryAdjustmentTag** | **String**| The tag to delete |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDuplicateInventoryAdjustmentById"></a>
# **getDuplicateInventoryAdjustmentById**
> InventoryAdjustment getDuplicateInventoryAdjustmentById(inventoryAdjustmentId)

Get a duplicated an inventoryAdjustment by id

Returns a duplicated inventoryAdjustment identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InventoryAdjustmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InventoryAdjustmentApi apiInstance = new InventoryAdjustmentApi();
Integer inventoryAdjustmentId = 56; // Integer | Id of the inventoryAdjustment to be duplicated.
try {
    InventoryAdjustment result = apiInstance.getDuplicateInventoryAdjustmentById(inventoryAdjustmentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryAdjustmentApi#getDuplicateInventoryAdjustmentById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inventoryAdjustmentId** | **Integer**| Id of the inventoryAdjustment to be duplicated. |

### Return type

[**InventoryAdjustment**](InventoryAdjustment.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getInventoryAdjustmentByFilter"></a>
# **getInventoryAdjustmentByFilter**
> List&lt;InventoryAdjustment&gt; getInventoryAdjustmentByFilter(filter, page, limit, sort)

Search inventoryAdjustments by filter

Returns the list of inventoryAdjustments that match the given filter.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InventoryAdjustmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InventoryAdjustmentApi apiInstance = new InventoryAdjustmentApi();
String filter = "filter_example"; // String | Query string, used to filter results.
Integer page = 56; // Integer | Result page number.  Defaults to 1.
Integer limit = 56; // Integer | Maximum results per page.  Defaults to 20.  Max allowed value is 250.
String sort = "sort_example"; // String | Sort results by specified field.
try {
    List<InventoryAdjustment> result = apiInstance.getInventoryAdjustmentByFilter(filter, page, limit, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryAdjustmentApi#getInventoryAdjustmentByFilter");
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

[**List&lt;InventoryAdjustment&gt;**](InventoryAdjustment.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getInventoryAdjustmentById"></a>
# **getInventoryAdjustmentById**
> InventoryAdjustment getInventoryAdjustmentById(inventoryAdjustmentId)

Get an inventoryAdjustment by id

Returns the inventoryAdjustment identified by the specified id.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InventoryAdjustmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InventoryAdjustmentApi apiInstance = new InventoryAdjustmentApi();
Integer inventoryAdjustmentId = 56; // Integer | Id of the inventoryAdjustment to be returned.
try {
    InventoryAdjustment result = apiInstance.getInventoryAdjustmentById(inventoryAdjustmentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryAdjustmentApi#getInventoryAdjustmentById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inventoryAdjustmentId** | **Integer**| Id of the inventoryAdjustment to be returned. |

### Return type

[**InventoryAdjustment**](InventoryAdjustment.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getInventoryAdjustmentTags"></a>
# **getInventoryAdjustmentTags**
> getInventoryAdjustmentTags(inventoryAdjustmentId)

Get the tags for an inventoryAdjustment.

Get all existing inventoryAdjustment tags.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InventoryAdjustmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InventoryAdjustmentApi apiInstance = new InventoryAdjustmentApi();
Integer inventoryAdjustmentId = 56; // Integer | Id of the inventoryAdjustment to get tags for
try {
    apiInstance.getInventoryAdjustmentTags(inventoryAdjustmentId);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryAdjustmentApi#getInventoryAdjustmentTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inventoryAdjustmentId** | **Integer**| Id of the inventoryAdjustment to get tags for |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateInventoryAdjustmentCustomFields"></a>
# **updateInventoryAdjustmentCustomFields**
> updateInventoryAdjustmentCustomFields(body)

Update an inventoryAdjustment custom fields

Updates an existing inventoryAdjustment custom fields using the specified data.

### Example
```java
// Import classes:
//import com.infopluscommerce.ApiClient;
//import com.infopluscommerce.ApiException;
//import com.infopluscommerce.Configuration;
//import com.infopluscommerce.auth.*;
//import com.infopluscommerce.api.InventoryAdjustmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InventoryAdjustmentApi apiInstance = new InventoryAdjustmentApi();
InventoryAdjustment body = new InventoryAdjustment(); // InventoryAdjustment | InventoryAdjustment to be updated.
try {
    apiInstance.updateInventoryAdjustmentCustomFields(body);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryAdjustmentApi#updateInventoryAdjustmentCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InventoryAdjustment**](InventoryAdjustment.md)| InventoryAdjustment to be updated. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

