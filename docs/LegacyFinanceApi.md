# LegacyFinanceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAccountStatement**](LegacyFinanceApi.md#getAccountStatement) | **GET** /apps/api/kronos.finance.getAccountStatement | Get Account Statement information for a contact.
[**getLiabilities**](LegacyFinanceApi.md#getLiabilities) | **GET** /apps/api/kronos.finance.getLiabilities | Get Liabilities information for a contact.


<a name="getAccountStatement"></a>
# **getAccountStatement**
> LegacyfinancegetAccountStatementResponse getAccountStatement(contactId, includeUnmanagedAssets)

Get Account Statement information for a contact.

### Example
```kotlin
// Import classes:
//import com.equisoft.connect.sdk.infrastructure.*
//import com.equisoft.connect.sdk.models.*

val apiInstance = LegacyFinanceApi()
val contactId : kotlin.Int = 56 // kotlin.Int | Contact Id
val includeUnmanagedAssets : kotlin.Boolean = true // kotlin.Boolean | Include unmagned assets, by default false
try {
    val result : LegacyfinancegetAccountStatementResponse = apiInstance.getAccountStatement(contactId, includeUnmanagedAssets)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LegacyFinanceApi#getAccountStatement")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LegacyFinanceApi#getAccountStatement")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contactId** | **kotlin.Int**| Contact Id |
 **includeUnmanagedAssets** | **kotlin.Boolean**| Include unmagned assets, by default false | [optional]

### Return type

[**LegacyfinancegetAccountStatementResponse**](LegacyfinancegetAccountStatementResponse.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLiabilities"></a>
# **getLiabilities**
> LegacyfinanceGetLiabilitiesResponse getLiabilities(contactId)

Get Liabilities information for a contact.

### Example
```kotlin
// Import classes:
//import com.equisoft.connect.sdk.infrastructure.*
//import com.equisoft.connect.sdk.models.*

val apiInstance = LegacyFinanceApi()
val contactId : kotlin.Int = 56 // kotlin.Int | Contact Id
try {
    val result : LegacyfinanceGetLiabilitiesResponse = apiInstance.getLiabilities(contactId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LegacyFinanceApi#getLiabilities")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LegacyFinanceApi#getLiabilities")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contactId** | **kotlin.Int**| Contact Id |

### Return type

[**LegacyfinanceGetLiabilitiesResponse**](LegacyfinanceGetLiabilitiesResponse.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

