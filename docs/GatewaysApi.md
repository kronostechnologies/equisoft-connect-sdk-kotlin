# GatewaysApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createEquisoftAnalyzeAccess**](GatewaysApi.md#createEquisoftAnalyzeAccess) | **POST** /crm/api/v1/gateways/equisoftAnalyze/accesses | 
[**deleteEquisoftAnalyzeAccess**](GatewaysApi.md#deleteEquisoftAnalyzeAccess) | **DELETE** /crm/api/v1/gateways/equisoftAnalyze/accesses/{accessId} | 
[**gatewayAdminLogin**](GatewaysApi.md#gatewayAdminLogin) | **POST** /crm/api/v1/gateways/credentials-validation/{gatewayName}/admin-credentials/login | 
[**listAssetBookCredentials**](GatewaysApi.md#listAssetBookCredentials) | **GET** /crm/api/v1/gateways/assetbook/credentials | 
[**listCredentials**](GatewaysApi.md#listCredentials) | **GET** /crm/api/v1/gateways/credentials-validation/{gatewayId}/credentials/{status} | 
[**listEquisoftAnalyzeAccesses**](GatewaysApi.md#listEquisoftAnalyzeAccesses) | **GET** /crm/api/v1/gateways/equisoftAnalyze/accesses | 
[**listGatewayConfigurations**](GatewaysApi.md#listGatewayConfigurations) | **GET** /crm/api/v1/gateways/generic/{gatewayName}/configuration | 
[**listGenericCredentials**](GatewaysApi.md#listGenericCredentials) | **GET** /crm/api/v1/gateways/generic/{gatewayName}/credentials | 
[**patchEquisoftAnalyzeAccess**](GatewaysApi.md#patchEquisoftAnalyzeAccess) | **PATCH** /crm/api/v1/gateways/equisoftAnalyze/accesses/{accessId} | 
[**updateCredentials**](GatewaysApi.md#updateCredentials) | **PUT** /crm/api/v1/gateways/credentials-validation/{gatewayId}/credentials/{status} | 


<a name="createEquisoftAnalyzeAccess"></a>
# **createEquisoftAnalyzeAccess**
> GatewaysaccessesCreateAccessResponse createEquisoftAnalyzeAccess(gatewaysaccessesCreateEquisoftAnalyzeAccessPayload)



Create a user access configuration for Equisoft/analyze gateway

### Example
```kotlin
// Import classes:
//import com.equisoft.connect.sdk.infrastructure.*
//import com.equisoft.connect.sdk.models.*

val apiInstance = GatewaysApi()
val gatewaysaccessesCreateEquisoftAnalyzeAccessPayload : GatewaysaccessesCreateEquisoftAnalyzeAccessPayload =  // GatewaysaccessesCreateEquisoftAnalyzeAccessPayload | 
try {
    val result : GatewaysaccessesCreateAccessResponse = apiInstance.createEquisoftAnalyzeAccess(gatewaysaccessesCreateEquisoftAnalyzeAccessPayload)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GatewaysApi#createEquisoftAnalyzeAccess")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GatewaysApi#createEquisoftAnalyzeAccess")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gatewaysaccessesCreateEquisoftAnalyzeAccessPayload** | [**GatewaysaccessesCreateEquisoftAnalyzeAccessPayload**](GatewaysaccessesCreateEquisoftAnalyzeAccessPayload.md)|  |

### Return type

[**GatewaysaccessesCreateAccessResponse**](GatewaysaccessesCreateAccessResponse.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteEquisoftAnalyzeAccess"></a>
# **deleteEquisoftAnalyzeAccess**
> deleteEquisoftAnalyzeAccess(accessId)



Delete user access configuration for given gateway

### Example
```kotlin
// Import classes:
//import com.equisoft.connect.sdk.infrastructure.*
//import com.equisoft.connect.sdk.models.*

val apiInstance = GatewaysApi()
val accessId : kotlin.Int = 56 // kotlin.Int | 
try {
    apiInstance.deleteEquisoftAnalyzeAccess(accessId)
} catch (e: ClientException) {
    println("4xx response calling GatewaysApi#deleteEquisoftAnalyzeAccess")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GatewaysApi#deleteEquisoftAnalyzeAccess")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessId** | **kotlin.Int**|  |

### Return type

null (empty response body)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gatewayAdminLogin"></a>
# **gatewayAdminLogin**
> AdminCredentialResponse gatewayAdminLogin(gatewayName, authorization, adminCredentialPayload)



### Example
```kotlin
// Import classes:
//import com.equisoft.connect.sdk.infrastructure.*
//import com.equisoft.connect.sdk.models.*

val apiInstance = GatewaysApi()
val gatewayName : kotlin.String = gatewayName_example // kotlin.String | 
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization header using the Bearer scheme
val adminCredentialPayload : AdminCredentialPayload =  // AdminCredentialPayload | 
try {
    val result : AdminCredentialResponse = apiInstance.gatewayAdminLogin(gatewayName, authorization, adminCredentialPayload)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GatewaysApi#gatewayAdminLogin")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GatewaysApi#gatewayAdminLogin")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gatewayName** | **kotlin.String**|  |
 **authorization** | **kotlin.String**| Authorization header using the Bearer scheme |
 **adminCredentialPayload** | [**AdminCredentialPayload**](AdminCredentialPayload.md)|  |

### Return type

[**AdminCredentialResponse**](AdminCredentialResponse.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listAssetBookCredentials"></a>
# **listAssetBookCredentials**
> GatewaysListCredentialsResponse listAssetBookCredentials()



### Example
```kotlin
// Import classes:
//import com.equisoft.connect.sdk.infrastructure.*
//import com.equisoft.connect.sdk.models.*

val apiInstance = GatewaysApi()
try {
    val result : GatewaysListCredentialsResponse = apiInstance.listAssetBookCredentials()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GatewaysApi#listAssetBookCredentials")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GatewaysApi#listAssetBookCredentials")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GatewaysListCredentialsResponse**](GatewaysListCredentialsResponse.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listCredentials"></a>
# **listCredentials**
> CredentialsResponse listCredentials(gatewayId, status, authorization)



### Example
```kotlin
// Import classes:
//import com.equisoft.connect.sdk.infrastructure.*
//import com.equisoft.connect.sdk.models.*

val apiInstance = GatewaysApi()
val gatewayId : kotlin.String = gatewayId_example // kotlin.String | 
val status : kotlin.String = status_example // kotlin.String | 
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization header using the Bearer scheme
try {
    val result : CredentialsResponse = apiInstance.listCredentials(gatewayId, status, authorization)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GatewaysApi#listCredentials")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GatewaysApi#listCredentials")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gatewayId** | **kotlin.String**|  |
 **status** | **kotlin.String**|  |
 **authorization** | **kotlin.String**| Authorization header using the Bearer scheme |

### Return type

[**CredentialsResponse**](CredentialsResponse.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listEquisoftAnalyzeAccesses"></a>
# **listEquisoftAnalyzeAccesses**
> GatewaysaccessesListGatewayAccessesResponse listEquisoftAnalyzeAccesses(userUuid)



List user accesses configuration for equisoft/analyze gateway

### Example
```kotlin
// Import classes:
//import com.equisoft.connect.sdk.infrastructure.*
//import com.equisoft.connect.sdk.models.*

val apiInstance = GatewaysApi()
val userUuid : kotlin.String = d2507338-78f2-4299-8bec-e82b1d242d4c // kotlin.String | 
try {
    val result : GatewaysaccessesListGatewayAccessesResponse = apiInstance.listEquisoftAnalyzeAccesses(userUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GatewaysApi#listEquisoftAnalyzeAccesses")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GatewaysApi#listEquisoftAnalyzeAccesses")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userUuid** | **kotlin.String**|  | [optional]

### Return type

[**GatewaysaccessesListGatewayAccessesResponse**](GatewaysaccessesListGatewayAccessesResponse.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listGatewayConfigurations"></a>
# **listGatewayConfigurations**
> listGatewayConfigurations(gatewayName)



### Example
```kotlin
// Import classes:
//import com.equisoft.connect.sdk.infrastructure.*
//import com.equisoft.connect.sdk.models.*

val apiInstance = GatewaysApi()
val gatewayName : kotlin.String = gatewayName_example // kotlin.String | 
try {
    apiInstance.listGatewayConfigurations(gatewayName)
} catch (e: ClientException) {
    println("4xx response calling GatewaysApi#listGatewayConfigurations")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GatewaysApi#listGatewayConfigurations")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gatewayName** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listGenericCredentials"></a>
# **listGenericCredentials**
> GatewaysListCredentialsResponse listGenericCredentials(gatewayName, includeSsn)



### Example
```kotlin
// Import classes:
//import com.equisoft.connect.sdk.infrastructure.*
//import com.equisoft.connect.sdk.models.*

val apiInstance = GatewaysApi()
val gatewayName : kotlin.String = gatewayName_example // kotlin.String | 
val includeSsn : kotlin.Boolean = true // kotlin.Boolean | Include the list of SSN for each credentials. Defaults to false
try {
    val result : GatewaysListCredentialsResponse = apiInstance.listGenericCredentials(gatewayName, includeSsn)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GatewaysApi#listGenericCredentials")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GatewaysApi#listGenericCredentials")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gatewayName** | **kotlin.String**|  |
 **includeSsn** | **kotlin.Boolean**| Include the list of SSN for each credentials. Defaults to false | [optional]

### Return type

[**GatewaysListCredentialsResponse**](GatewaysListCredentialsResponse.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="patchEquisoftAnalyzeAccess"></a>
# **patchEquisoftAnalyzeAccess**
> patchEquisoftAnalyzeAccess(accessId, gatewaysaccessesPatchEquisoftAnalyzeAccessPayload)



Update user access configuration for Equisoft/analyze gateway

### Example
```kotlin
// Import classes:
//import com.equisoft.connect.sdk.infrastructure.*
//import com.equisoft.connect.sdk.models.*

val apiInstance = GatewaysApi()
val accessId : kotlin.Int = 56 // kotlin.Int | 
val gatewaysaccessesPatchEquisoftAnalyzeAccessPayload : GatewaysaccessesPatchEquisoftAnalyzeAccessPayload =  // GatewaysaccessesPatchEquisoftAnalyzeAccessPayload | 
try {
    apiInstance.patchEquisoftAnalyzeAccess(accessId, gatewaysaccessesPatchEquisoftAnalyzeAccessPayload)
} catch (e: ClientException) {
    println("4xx response calling GatewaysApi#patchEquisoftAnalyzeAccess")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GatewaysApi#patchEquisoftAnalyzeAccess")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessId** | **kotlin.Int**|  |
 **gatewaysaccessesPatchEquisoftAnalyzeAccessPayload** | [**GatewaysaccessesPatchEquisoftAnalyzeAccessPayload**](GatewaysaccessesPatchEquisoftAnalyzeAccessPayload.md)|  |

### Return type

null (empty response body)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCredentials"></a>
# **updateCredentials**
> CredentialsResponse updateCredentials(gatewayId, status, authorization, credentialIds)



### Example
```kotlin
// Import classes:
//import com.equisoft.connect.sdk.infrastructure.*
//import com.equisoft.connect.sdk.models.*

val apiInstance = GatewaysApi()
val gatewayId : kotlin.String = gatewayId_example // kotlin.String | 
val status : kotlin.String = status_example // kotlin.String | 
val authorization : kotlin.String = authorization_example // kotlin.String | Authorization header using the Bearer scheme
val credentialIds : kotlin.collections.List<kotlin.Int> =  // kotlin.collections.List<kotlin.Int> | Many ids can be passed to this argument separated by coma. Ex: '?credentialIds=1,2,3'.
try {
    val result : CredentialsResponse = apiInstance.updateCredentials(gatewayId, status, authorization, credentialIds)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GatewaysApi#updateCredentials")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GatewaysApi#updateCredentials")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gatewayId** | **kotlin.String**|  |
 **status** | **kotlin.String**|  |
 **authorization** | **kotlin.String**| Authorization header using the Bearer scheme |
 **credentialIds** | [**kotlin.collections.List&lt;kotlin.Int&gt;**](kotlin.Int.md)| Many ids can be passed to this argument separated by coma. Ex: &#39;?credentialIds&#x3D;1,2,3&#39;. | [optional]

### Return type

[**CredentialsResponse**](CredentialsResponse.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

