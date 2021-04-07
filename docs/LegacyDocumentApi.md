# LegacyDocumentApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addDocument**](LegacyDocumentApi.md#addDocument) | **POST** /apps/api/kronos.document.add | Create a new document.
[**deleteDocument**](LegacyDocumentApi.md#deleteDocument) | **POST** /apps/api/kronos.document.delete | Delete a document and it&#39;s related files.
[**deleteDocumentFile**](LegacyDocumentApi.md#deleteDocumentFile) | **POST** /apps/api/kronos.document.deleteFile | Delete one file from a document
[**downloadDocumentFile**](LegacyDocumentApi.md#downloadDocumentFile) | **GET** /apps/api/kronos.document.downloadFile | Download a file. File data is encoded in base64.
[**getDocument**](LegacyDocumentApi.md#getDocument) | **GET** /apps/api/kronos.document.get | Get all data for a document record.
[**getDocumentList**](LegacyDocumentApi.md#getDocumentList) | **GET** /apps/api/kronos.document.getList | Get a list of all documents. This will return basic information about the document.
[**updateDocument**](LegacyDocumentApi.md#updateDocument) | **POST** /apps/api/kronos.document.update | Update a document.
[**uploadDocumentFile**](LegacyDocumentApi.md#uploadDocumentFile) | **POST** /apps/api/kronos.document.uploadFile | Upload a new file in a document


<a name="addDocument"></a>
# **addDocument**
> LegacyAddUpdateResponse addDocument(legacydocumentDocumentPayloadRequest)

Create a new document.

### Example
```kotlin
// Import classes:
//import equisoft/openapi.infrastructure.*
//import equisoft/openapi.models.*

val apiInstance = LegacyDocumentApi()
val legacydocumentDocumentPayloadRequest : LegacydocumentDocumentPayloadRequest =  // LegacydocumentDocumentPayloadRequest | 
try {
    val result : LegacyAddUpdateResponse = apiInstance.addDocument(legacydocumentDocumentPayloadRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LegacyDocumentApi#addDocument")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LegacyDocumentApi#addDocument")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **legacydocumentDocumentPayloadRequest** | [**LegacydocumentDocumentPayloadRequest**](LegacydocumentDocumentPayloadRequest.md)|  |

### Return type

[**LegacyAddUpdateResponse**](LegacyAddUpdateResponse.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDocument"></a>
# **deleteDocument**
> LegacyResponse deleteDocument(id)

Delete a document and it&#39;s related files.

### Example
```kotlin
// Import classes:
//import equisoft/openapi.infrastructure.*
//import equisoft/openapi.models.*

val apiInstance = LegacyDocumentApi()
val id : kotlin.String = id_example // kotlin.String | Document Id
try {
    val result : LegacyResponse = apiInstance.deleteDocument(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LegacyDocumentApi#deleteDocument")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LegacyDocumentApi#deleteDocument")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Document Id |

### Return type

[**LegacyResponse**](LegacyResponse.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteDocumentFile"></a>
# **deleteDocumentFile**
> LegacyResponse deleteDocumentFile(id)

Delete one file from a document

### Example
```kotlin
// Import classes:
//import equisoft/openapi.infrastructure.*
//import equisoft/openapi.models.*

val apiInstance = LegacyDocumentApi()
val id : kotlin.String = id_example // kotlin.String | Document File Id
try {
    val result : LegacyResponse = apiInstance.deleteDocumentFile(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LegacyDocumentApi#deleteDocumentFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LegacyDocumentApi#deleteDocumentFile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Document File Id |

### Return type

[**LegacyResponse**](LegacyResponse.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="downloadDocumentFile"></a>
# **downloadDocumentFile**
> LegacydocumentDownloadFileResponse downloadDocumentFile(id)

Download a file. File data is encoded in base64.

### Example
```kotlin
// Import classes:
//import equisoft/openapi.infrastructure.*
//import equisoft/openapi.models.*

val apiInstance = LegacyDocumentApi()
val id : kotlin.String = id_example // kotlin.String | Document File Id
try {
    val result : LegacydocumentDownloadFileResponse = apiInstance.downloadDocumentFile(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LegacyDocumentApi#downloadDocumentFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LegacyDocumentApi#downloadDocumentFile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Document File Id |

### Return type

[**LegacydocumentDownloadFileResponse**](LegacydocumentDownloadFileResponse.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDocument"></a>
# **getDocument**
> LegacydocumentGetResponse getDocument(id)

Get all data for a document record.

### Example
```kotlin
// Import classes:
//import equisoft/openapi.infrastructure.*
//import equisoft/openapi.models.*

val apiInstance = LegacyDocumentApi()
val id : kotlin.String = id_example // kotlin.String | Document Id
try {
    val result : LegacydocumentGetResponse = apiInstance.getDocument(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LegacyDocumentApi#getDocument")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LegacyDocumentApi#getDocument")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Document Id |

### Return type

[**LegacydocumentGetResponse**](LegacydocumentGetResponse.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDocumentList"></a>
# **getDocumentList**
> LegacydocumentGetListResponse getDocumentList()

Get a list of all documents. This will return basic information about the document.

Please note that a document is similar to a folder and may contain one or many files.

### Example
```kotlin
// Import classes:
//import equisoft/openapi.infrastructure.*
//import equisoft/openapi.models.*

val apiInstance = LegacyDocumentApi()
try {
    val result : LegacydocumentGetListResponse = apiInstance.getDocumentList()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LegacyDocumentApi#getDocumentList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LegacyDocumentApi#getDocumentList")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**LegacydocumentGetListResponse**](LegacydocumentGetListResponse.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateDocument"></a>
# **updateDocument**
> LegacyAddUpdateResponse updateDocument(legacydocumentDocumentPayloadRequest)

Update a document.

### Example
```kotlin
// Import classes:
//import equisoft/openapi.infrastructure.*
//import equisoft/openapi.models.*

val apiInstance = LegacyDocumentApi()
val legacydocumentDocumentPayloadRequest : LegacydocumentDocumentPayloadRequest =  // LegacydocumentDocumentPayloadRequest | 
try {
    val result : LegacyAddUpdateResponse = apiInstance.updateDocument(legacydocumentDocumentPayloadRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LegacyDocumentApi#updateDocument")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LegacyDocumentApi#updateDocument")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **legacydocumentDocumentPayloadRequest** | [**LegacydocumentDocumentPayloadRequest**](LegacydocumentDocumentPayloadRequest.md)|  |

### Return type

[**LegacyAddUpdateResponse**](LegacyAddUpdateResponse.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="uploadDocumentFile"></a>
# **uploadDocumentFile**
> LegacyAddUpdateResponse uploadDocumentFile(id, legacydocumentUploadDocumentFileRequest)

Upload a new file in a document

### Example
```kotlin
// Import classes:
//import equisoft/openapi.infrastructure.*
//import equisoft/openapi.models.*

val apiInstance = LegacyDocumentApi()
val id : kotlin.String = id_example // kotlin.String | Document File Id
val legacydocumentUploadDocumentFileRequest : LegacydocumentUploadDocumentFileRequest =  // LegacydocumentUploadDocumentFileRequest | 
try {
    val result : LegacyAddUpdateResponse = apiInstance.uploadDocumentFile(id, legacydocumentUploadDocumentFileRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LegacyDocumentApi#uploadDocumentFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LegacyDocumentApi#uploadDocumentFile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Document File Id |
 **legacydocumentUploadDocumentFileRequest** | [**LegacydocumentUploadDocumentFileRequest**](LegacydocumentUploadDocumentFileRequest.md)|  |

### Return type

[**LegacyAddUpdateResponse**](LegacyAddUpdateResponse.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

