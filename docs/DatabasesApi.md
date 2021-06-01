# DatabasesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listDatabases**](DatabasesApi.md#listDatabases) | **GET** /crm/api/v1/databases | 


<a name="listDatabases"></a>
# **listDatabases**
> DatabasesListDatabasesResponse listDatabases(organizationUuid, databaseName)



### Example
```kotlin
// Import classes:
//import com.equisoft.connect.sdk.infrastructure.*
//import com.equisoft.connect.sdk.models.*

val apiInstance = DatabasesApi()
val organizationUuid : kotlin.String = organizationUuid_example // kotlin.String | 
val databaseName : kotlin.String = databaseName_example // kotlin.String | 
try {
    val result : DatabasesListDatabasesResponse = apiInstance.listDatabases(organizationUuid, databaseName)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DatabasesApi#listDatabases")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DatabasesApi#listDatabases")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationUuid** | **kotlin.String**|  | [optional]
 **databaseName** | **kotlin.String**|  | [optional]

### Return type

[**DatabasesListDatabasesResponse**](DatabasesListDatabasesResponse.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

