# MxApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**validateRecipients**](MxApi.md#validateRecipients) | **POST** /crm/api/app/mail/validateRecipients | Validate recipients


<a name="validateRecipients"></a>
# **validateRecipients**
> MxvalidateRecipientsResponse validateRecipients(mxrecipientsPayload)

Validate recipients

### Example
```kotlin
// Import classes:
//import equisoft/openapi.infrastructure.*
//import equisoft/openapi.models.*

val apiInstance = MxApi()
val mxrecipientsPayload : MxrecipientsPayload =  // MxrecipientsPayload | 
try {
    val result : MxvalidateRecipientsResponse = apiInstance.validateRecipients(mxrecipientsPayload)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MxApi#validateRecipients")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MxApi#validateRecipients")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mxrecipientsPayload** | [**MxrecipientsPayload**](MxrecipientsPayload.md)|  |

### Return type

[**MxvalidateRecipientsResponse**](MxvalidateRecipientsResponse.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

