# ContactsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getByUuid**](ContactsApi.md#getByUuid) | **GET** /crm/api/v1/contacts/{contactUuid} | Return the detail of a contact.


<a name="getByUuid"></a>
# **getByUuid**
> ContactsContact getByUuid(contactUuid, acceptLanguage)

Return the detail of a contact.

### Example
```kotlin
// Import classes:
//import com.equisoft.connect.sdk.infrastructure.*
//import com.equisoft.connect.sdk.models.*

val apiInstance = ContactsApi()
val contactUuid : kotlin.String = contactUuid_example // kotlin.String | Contact unique identifier.
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | Specify preferred language for returned data. Format is https://tools.ietf.org/html/rfc3282
try {
    val result : ContactsContact = apiInstance.getByUuid(contactUuid, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#getByUuid")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#getByUuid")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contactUuid** | **kotlin.String**| Contact unique identifier. |
 **acceptLanguage** | **kotlin.String**| Specify preferred language for returned data. Format is https://tools.ietf.org/html/rfc3282 | [optional]

### Return type

[**ContactsContact**](ContactsContact.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

