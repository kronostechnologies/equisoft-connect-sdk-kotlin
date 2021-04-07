# UsersApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCurrentUser**](UsersApi.md#getCurrentUser) | **GET** /crm/api/v1/users/me | Get informations about the current user
[**getUserContext**](UsersApi.md#getUserContext) | **GET** /crm/api/v1/context | Get user context metadata.


<a name="getCurrentUser"></a>
# **getCurrentUser**
> UsersUser getCurrentUser(acceptLanguage)

Get informations about the current user

### Example
```kotlin
// Import classes:
//import equisoft/openapi.infrastructure.*
//import equisoft/openapi.models.*

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

<a name="getUserContext"></a>
# **getUserContext**
> ContextuserContext getUserContext()

Get user context metadata.

### Example
```kotlin
// Import classes:
//import equisoft/openapi.infrastructure.*
//import equisoft/openapi.models.*

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

