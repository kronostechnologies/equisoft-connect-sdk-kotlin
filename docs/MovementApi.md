# MovementApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addMovement**](MovementApi.md#addMovement) | **POST** /crm/api/v1/movements | 
[**cancelMovement**](MovementApi.md#cancelMovement) | **POST** /crm/api/v1/movements/{movementId}/cancel | 
[**deleteMovement**](MovementApi.md#deleteMovement) | **DELETE** /crm/api/v1/movements/{movementId} | 
[**getMovementStatus**](MovementApi.md#getMovementStatus) | **GET** /crm/api/v1/movements/{movementId}/status | 
[**listMovements**](MovementApi.md#listMovements) | **GET** /crm/api/v1/movements | 


<a name="addMovement"></a>
# **addMovement**
> MovementAddMovementResponse addMovement(movementMovementPayload)



### Example
```kotlin
// Import classes:
//import equisoft/openapi.infrastructure.*
//import equisoft/openapi.models.*

val apiInstance = MovementApi()
val movementMovementPayload : MovementMovementPayload =  // MovementMovementPayload | 
try {
    val result : MovementAddMovementResponse = apiInstance.addMovement(movementMovementPayload)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MovementApi#addMovement")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MovementApi#addMovement")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **movementMovementPayload** | [**MovementMovementPayload**](MovementMovementPayload.md)|  |

### Return type

[**MovementAddMovementResponse**](MovementAddMovementResponse.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cancelMovement"></a>
# **cancelMovement**
> kotlin.Any cancelMovement(movementId)



### Example
```kotlin
// Import classes:
//import equisoft/openapi.infrastructure.*
//import equisoft/openapi.models.*

val apiInstance = MovementApi()
val movementId : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.Any = apiInstance.cancelMovement(movementId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MovementApi#cancelMovement")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MovementApi#cancelMovement")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **movementId** | **kotlin.Int**|  |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteMovement"></a>
# **deleteMovement**
> kotlin.Any deleteMovement(movementId)



### Example
```kotlin
// Import classes:
//import equisoft/openapi.infrastructure.*
//import equisoft/openapi.models.*

val apiInstance = MovementApi()
val movementId : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.Any = apiInstance.deleteMovement(movementId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MovementApi#deleteMovement")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MovementApi#deleteMovement")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **movementId** | **kotlin.Int**|  |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMovementStatus"></a>
# **getMovementStatus**
> MovementGetStatusResponse getMovementStatus(movementId)



### Example
```kotlin
// Import classes:
//import equisoft/openapi.infrastructure.*
//import equisoft/openapi.models.*

val apiInstance = MovementApi()
val movementId : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : MovementGetStatusResponse = apiInstance.getMovementStatus(movementId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MovementApi#getMovementStatus")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MovementApi#getMovementStatus")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **movementId** | **kotlin.Int**|  |

### Return type

[**MovementGetStatusResponse**](MovementGetStatusResponse.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listMovements"></a>
# **listMovements**
> MovementListMovementResponse listMovements()



### Example
```kotlin
// Import classes:
//import equisoft/openapi.infrastructure.*
//import equisoft/openapi.models.*

val apiInstance = MovementApi()
try {
    val result : MovementListMovementResponse = apiInstance.listMovements()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MovementApi#listMovements")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MovementApi#listMovements")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**MovementListMovementResponse**](MovementListMovementResponse.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

