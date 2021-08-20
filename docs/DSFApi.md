# DSFApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDsfFinancialCenter**](DSFApi.md#createDsfFinancialCenter) | **POST** /crm/api/v1/dsf/financialCenters | 
[**deleteDsfFinancialCenter**](DSFApi.md#deleteDsfFinancialCenter) | **DELETE** /crm/api/v1/dsf/financialCenters/{financialCenterId} | 
[**getDsfFinancialCenters**](DSFApi.md#getDsfFinancialCenters) | **GET** /crm/api/v1/dsf/financialCenters/{financialCenterId} | 
[**listDsfFinancialCenters**](DSFApi.md#listDsfFinancialCenters) | **GET** /crm/api/v1/dsf/financialCenters | 
[**updateDsfFinancialCenter**](DSFApi.md#updateDsfFinancialCenter) | **POST** /crm/api/v1/dsf/financialCenters/{financialCenterId} | 


<a name="createDsfFinancialCenter"></a>
# **createDsfFinancialCenter**
> DsfCreateOrUpdateFinancialCenterResponse createDsfFinancialCenter(dsfFinancialCenterPayload)



### Example
```kotlin
// Import classes:
//import com.equisoft.connect.sdk.infrastructure.*
//import com.equisoft.connect.sdk.models.*

val apiInstance = DSFApi()
val dsfFinancialCenterPayload : DsfFinancialCenterPayload =  // DsfFinancialCenterPayload | 
try {
    val result : DsfCreateOrUpdateFinancialCenterResponse = apiInstance.createDsfFinancialCenter(dsfFinancialCenterPayload)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DSFApi#createDsfFinancialCenter")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DSFApi#createDsfFinancialCenter")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dsfFinancialCenterPayload** | [**DsfFinancialCenterPayload**](DsfFinancialCenterPayload.md)|  |

### Return type

[**DsfCreateOrUpdateFinancialCenterResponse**](DsfCreateOrUpdateFinancialCenterResponse.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDsfFinancialCenter"></a>
# **deleteDsfFinancialCenter**
> deleteDsfFinancialCenter(financialCenterId)



### Example
```kotlin
// Import classes:
//import com.equisoft.connect.sdk.infrastructure.*
//import com.equisoft.connect.sdk.models.*

val apiInstance = DSFApi()
val financialCenterId : kotlin.Int = 56 // kotlin.Int | 
try {
    apiInstance.deleteDsfFinancialCenter(financialCenterId)
} catch (e: ClientException) {
    println("4xx response calling DSFApi#deleteDsfFinancialCenter")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DSFApi#deleteDsfFinancialCenter")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financialCenterId** | **kotlin.Int**|  |

### Return type

null (empty response body)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDsfFinancialCenters"></a>
# **getDsfFinancialCenters**
> DsfFinancialCenter getDsfFinancialCenters(financialCenterId)



### Example
```kotlin
// Import classes:
//import com.equisoft.connect.sdk.infrastructure.*
//import com.equisoft.connect.sdk.models.*

val apiInstance = DSFApi()
val financialCenterId : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : DsfFinancialCenter = apiInstance.getDsfFinancialCenters(financialCenterId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DSFApi#getDsfFinancialCenters")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DSFApi#getDsfFinancialCenters")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financialCenterId** | **kotlin.Int**|  |

### Return type

[**DsfFinancialCenter**](DsfFinancialCenter.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDsfFinancialCenters"></a>
# **listDsfFinancialCenters**
> DsfListFinancialCenterResponse listDsfFinancialCenters()



### Example
```kotlin
// Import classes:
//import com.equisoft.connect.sdk.infrastructure.*
//import com.equisoft.connect.sdk.models.*

val apiInstance = DSFApi()
try {
    val result : DsfListFinancialCenterResponse = apiInstance.listDsfFinancialCenters()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DSFApi#listDsfFinancialCenters")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DSFApi#listDsfFinancialCenters")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**DsfListFinancialCenterResponse**](DsfListFinancialCenterResponse.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateDsfFinancialCenter"></a>
# **updateDsfFinancialCenter**
> DsfCreateOrUpdateFinancialCenterResponse updateDsfFinancialCenter(financialCenterId, dsfFinancialCenterPayload)



### Example
```kotlin
// Import classes:
//import com.equisoft.connect.sdk.infrastructure.*
//import com.equisoft.connect.sdk.models.*

val apiInstance = DSFApi()
val financialCenterId : kotlin.Int = 56 // kotlin.Int | 
val dsfFinancialCenterPayload : DsfFinancialCenterPayload =  // DsfFinancialCenterPayload | 
try {
    val result : DsfCreateOrUpdateFinancialCenterResponse = apiInstance.updateDsfFinancialCenter(financialCenterId, dsfFinancialCenterPayload)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DSFApi#updateDsfFinancialCenter")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DSFApi#updateDsfFinancialCenter")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financialCenterId** | **kotlin.Int**|  |
 **dsfFinancialCenterPayload** | [**DsfFinancialCenterPayload**](DsfFinancialCenterPayload.md)|  |

### Return type

[**DsfCreateOrUpdateFinancialCenterResponse**](DsfCreateOrUpdateFinancialCenterResponse.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

