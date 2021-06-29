# DatabasesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUser**](DatabasesApi.md#getUser) | **GET** /crm/api/v1/databases/{uuid}/users/{id} | 
[**listDatabases**](DatabasesApi.md#listDatabases) | **GET** /crm/api/v1/databases | 
[**listUsers**](DatabasesApi.md#listUsers) | **GET** /crm/api/v1/databases/{uuid}/users | 


<a name="getUser"></a>
# **getUser**
> UsersUser getUser(uuid, id)



### Example
```kotlin
// Import classes:
//import com.equisoft.connect.sdk.infrastructure.*
//import com.equisoft.connect.sdk.models.*

val apiInstance = DatabasesApi()
val uuid : kotlin.String = uuid_example // kotlin.String | 
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : UsersUser = apiInstance.getUser(uuid, id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DatabasesApi#getUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DatabasesApi#getUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **kotlin.String**|  |
 **id** | **kotlin.Int**|  |

### Return type

[**UsersUser**](UsersUser.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

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

<a name="listUsers"></a>
# **listUsers**
> UsersListUsersResponse listUsers(uuid)



### Example
```kotlin
// Import classes:
//import com.equisoft.connect.sdk.infrastructure.*
//import com.equisoft.connect.sdk.models.*

val apiInstance = DatabasesApi()
val uuid : kotlin.String = uuid_example // kotlin.String | 
try {
    val result : UsersListUsersResponse = apiInstance.listUsers(uuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DatabasesApi#listUsers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DatabasesApi#listUsers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **kotlin.String**|  |

### Return type

[**UsersListUsersResponse**](UsersListUsersResponse.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

