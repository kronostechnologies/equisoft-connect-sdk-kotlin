# LegacyProvisioningApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOrganization**](LegacyProvisioningApi.md#getOrganization) | **GET** /apps/provisioning/kronos.provisioning.getOrganization | Get all informations about an organization.
[**getOrganizationList**](LegacyProvisioningApi.md#getOrganizationList) | **GET** /apps/provisioning/kronos.provisioning.getOrganizationList | List all organizations


<a name="getOrganization"></a>
# **getOrganization**
> LegacyprovisioningGetOrganizationResponse getOrganization(orgId)

Get all informations about an organization.

### Example
```kotlin
// Import classes:
//import equisoft/openapi.infrastructure.*
//import equisoft/openapi.models.*

val apiInstance = LegacyProvisioningApi()
val orgId : kotlin.String = orgId_example // kotlin.String | Organization Id
try {
    val result : LegacyprovisioningGetOrganizationResponse = apiInstance.getOrganization(orgId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LegacyProvisioningApi#getOrganization")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LegacyProvisioningApi#getOrganization")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgId** | **kotlin.String**| Organization Id |

### Return type

[**LegacyprovisioningGetOrganizationResponse**](LegacyprovisioningGetOrganizationResponse.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrganizationList"></a>
# **getOrganizationList**
> LegacyprovisioningGetOrganizationListResponse getOrganizationList()

List all organizations

### Example
```kotlin
// Import classes:
//import equisoft/openapi.infrastructure.*
//import equisoft/openapi.models.*

val apiInstance = LegacyProvisioningApi()
try {
    val result : LegacyprovisioningGetOrganizationListResponse = apiInstance.getOrganizationList()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LegacyProvisioningApi#getOrganizationList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LegacyProvisioningApi#getOrganizationList")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**LegacyprovisioningGetOrganizationListResponse**](LegacyprovisioningGetOrganizationListResponse.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

