# UsersApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCurrentUser**](UsersApi.md#getCurrentUser) | **GET** /crm/api/v1/users/me | Get informations about the current user
[**getUser**](UsersApi.md#getUser) | **POST** /crm/api/v1/databases/{uuid}/users/{id} | 
[**getUserContext**](UsersApi.md#getUserContext) | **GET** /crm/api/v1/context | Get user context metadata.
[**listUsers**](UsersApi.md#listUsers) | **POST** /crm/api/v1/databases/{uuid}/users | 


<a name="getCurrentUser"></a>
# **getCurrentUser**
> UsersUser getCurrentUser(acceptLanguage)

Get informations about the current user

### Example
```kotlin
// Import classes:
//import com.equisoft.connect.sdk.infrastructure.*
//import com.equisoft.connect.sdk.models.*

val apiInstance = UsersApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | Specify preferred language for returned data. Format is https://tools.ietf.org/html/rfc3282
try {
    val result : UsersUser = apiInstance.getCurrentUser(acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#getCurrentUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#getCurrentUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| Specify preferred language for returned data. Format is https://tools.ietf.org/html/rfc3282 | [optional]

### Return type

[**UsersUser**](UsersUser.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUser"></a>
# **getUser**
> UsersUser getUser(uuid, id)



### Example
```kotlin
// Import classes:
//import com.equisoft.connect.sdk.infrastructure.*
//import com.equisoft.connect.sdk.models.*

val apiInstance = UsersApi()
val uuid : kotlin.String = uuid_example // kotlin.String | 
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : UsersUser = apiInstance.getUser(uuid, id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#getUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#getUser")
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

<a name="getUserContext"></a>
# **getUserContext**
> ContextuserContext getUserContext()

Get user context metadata.

### Example
```kotlin
// Import classes:
//import com.equisoft.connect.sdk.infrastructure.*
//import com.equisoft.connect.sdk.models.*

val apiInstance = UsersApi()
try {
    val result : ContextuserContext = apiInstance.getUserContext()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#getUserContext")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#getUserContext")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ContextuserContext**](ContextuserContext.md)

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

val apiInstance = UsersApi()
val uuid : kotlin.String = uuid_example // kotlin.String | 
try {
    val result : UsersListUsersResponse = apiInstance.listUsers(uuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#listUsers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#listUsers")
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

