# IntegrationsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**downloadLaserAppEnterpriseContactData**](IntegrationsApi.md#downloadLaserAppEnterpriseContactData) | **GET** /crm/api/app/integrations/laserapp/enterprise/{contactId} | Download contact data for LaserApp Enterprise.
[**redirectContactToLaserAppAnywhere**](IntegrationsApi.md#redirectContactToLaserAppAnywhere) | **GET** /crm/api/app/integrations/laserapp/anywhere/{contactId} | Redirect contact to LaserApp Anywhere.


<a name="downloadLaserAppEnterpriseContactData"></a>
# **downloadLaserAppEnterpriseContactData**
> downloadLaserAppEnterpriseContactData(contactId)

Download contact data for LaserApp Enterprise.

### Example
```kotlin
// Import classes:
//import com.equisoft.connect.sdk.infrastructure.*
//import com.equisoft.connect.sdk.models.*

val apiInstance = IntegrationsApi()
val contactId : kotlin.Int = 56 // kotlin.Int | 
try {
    apiInstance.downloadLaserAppEnterpriseContactData(contactId)
} catch (e: ClientException) {
    println("4xx response calling IntegrationsApi#downloadLaserAppEnterpriseContactData")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IntegrationsApi#downloadLaserAppEnterpriseContactData")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contactId** | **kotlin.Int**|  |

### Return type

null (empty response body)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="redirectContactToLaserAppAnywhere"></a>
# **redirectContactToLaserAppAnywhere**
> LaserApplaserAppAnywhereResponse redirectContactToLaserAppAnywhere(contactId)

Redirect contact to LaserApp Anywhere.

### Example
```kotlin
// Import classes:
//import com.equisoft.connect.sdk.infrastructure.*
//import com.equisoft.connect.sdk.models.*

val apiInstance = IntegrationsApi()
val contactId : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : LaserApplaserAppAnywhereResponse = apiInstance.redirectContactToLaserAppAnywhere(contactId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IntegrationsApi#redirectContactToLaserAppAnywhere")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IntegrationsApi#redirectContactToLaserAppAnywhere")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contactId** | **kotlin.Int**|  |

### Return type

[**LaserApplaserAppAnywhereResponse**](LaserApplaserAppAnywhereResponse.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

