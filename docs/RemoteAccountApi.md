# RemoteAccountApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**synchronizeCalendars**](RemoteAccountApi.md#synchronizeCalendars) | **POST** /crm/api/agenda/account/calendarSync | Synchronize calendars with remote account
[**synchronizeTasks**](RemoteAccountApi.md#synchronizeTasks) | **POST** /crm/api/agenda/account/tasksSync | Synchronize tasks with remote account


<a name="synchronizeCalendars"></a>
# **synchronizeCalendars**
> RemoteaccountAccountSyncResponse synchronizeCalendars(dateTimeStart, dateTimeEnd, webuserCalendarIds, remoteFolderIds, webuserIds)

Synchronize calendars with remote account

### Example
```kotlin
// Import classes:
//import com.equisoft.connect.sdk.infrastructure.*
//import com.equisoft.connect.sdk.models.*

val apiInstance = RemoteAccountApi()
val dateTimeStart : kotlin.String = dateTimeStart_example // kotlin.String | 
val dateTimeEnd : kotlin.String = dateTimeEnd_example // kotlin.String | 
val webuserCalendarIds : kotlin.collections.List<kotlin.Int> = 56 // kotlin.collections.List<kotlin.Int> | 
val remoteFolderIds : kotlin.collections.List<kotlin.Int> = 56 // kotlin.collections.List<kotlin.Int> | 
val webuserIds : kotlin.collections.List<kotlin.Int> = 56 // kotlin.collections.List<kotlin.Int> | 
try {
    val result : RemoteaccountAccountSyncResponse = apiInstance.synchronizeCalendars(dateTimeStart, dateTimeEnd, webuserCalendarIds, remoteFolderIds, webuserIds)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RemoteAccountApi#synchronizeCalendars")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RemoteAccountApi#synchronizeCalendars")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dateTimeStart** | **kotlin.String**|  | [optional]
 **dateTimeEnd** | **kotlin.String**|  | [optional]
 **webuserCalendarIds** | [**kotlin.collections.List&lt;kotlin.Int&gt;**](kotlin.Int.md)|  | [optional]
 **remoteFolderIds** | [**kotlin.collections.List&lt;kotlin.Int&gt;**](kotlin.Int.md)|  | [optional]
 **webuserIds** | [**kotlin.collections.List&lt;kotlin.Int&gt;**](kotlin.Int.md)|  | [optional]

### Return type

[**RemoteaccountAccountSyncResponse**](RemoteaccountAccountSyncResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="synchronizeTasks"></a>
# **synchronizeTasks**
> RemoteaccountAccountSyncResponse synchronizeTasks(dateTimeStart, dateTimeEnd, webuserCalendarIds, remoteFolderIds, webuserIds)

Synchronize tasks with remote account

### Example
```kotlin
// Import classes:
//import com.equisoft.connect.sdk.infrastructure.*
//import com.equisoft.connect.sdk.models.*

val apiInstance = RemoteAccountApi()
val dateTimeStart : kotlin.String = dateTimeStart_example // kotlin.String | 
val dateTimeEnd : kotlin.String = dateTimeEnd_example // kotlin.String | 
val webuserCalendarIds : kotlin.collections.List<kotlin.Int> = 56 // kotlin.collections.List<kotlin.Int> | 
val remoteFolderIds : kotlin.collections.List<kotlin.Int> = 56 // kotlin.collections.List<kotlin.Int> | 
val webuserIds : kotlin.collections.List<kotlin.Int> = 56 // kotlin.collections.List<kotlin.Int> | 
try {
    val result : RemoteaccountAccountSyncResponse = apiInstance.synchronizeTasks(dateTimeStart, dateTimeEnd, webuserCalendarIds, remoteFolderIds, webuserIds)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RemoteAccountApi#synchronizeTasks")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RemoteAccountApi#synchronizeTasks")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dateTimeStart** | **kotlin.String**|  | [optional]
 **dateTimeEnd** | **kotlin.String**|  | [optional]
 **webuserCalendarIds** | [**kotlin.collections.List&lt;kotlin.Int&gt;**](kotlin.Int.md)|  | [optional]
 **remoteFolderIds** | [**kotlin.collections.List&lt;kotlin.Int&gt;**](kotlin.Int.md)|  | [optional]
 **webuserIds** | [**kotlin.collections.List&lt;kotlin.Int&gt;**](kotlin.Int.md)|  | [optional]

### Return type

[**RemoteaccountAccountSyncResponse**](RemoteaccountAccountSyncResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

