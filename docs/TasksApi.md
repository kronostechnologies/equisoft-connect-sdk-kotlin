# TasksApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**archiveTaskInternalNote**](TasksApi.md#archiveTaskInternalNote) | **POST** /crm/api/v1/tasks/{taskId}/notes/{noteId}/archive | Archive an internal note for a task.
[**createTask**](TasksApi.md#createTask) | **POST** /crm/api/v1/tasks | Create a task.
[**createTaskInternalNote**](TasksApi.md#createTaskInternalNote) | **POST** /crm/api/v1/tasks/{taskId}/notes | Add an internal note to a task.
[**deleteTask**](TasksApi.md#deleteTask) | **DELETE** /crm/api/v1/tasks/{taskId} | Delete a task.
[**getTask**](TasksApi.md#getTask) | **GET** /crm/api/v1/tasks/{taskId} | Return the detail of a task.
[**getTaskInternalNoteList**](TasksApi.md#getTaskInternalNoteList) | **GET** /crm/api/v1/tasks/{taskId}/notes | Get the internal notes list for a task.
[**listTasks**](TasksApi.md#listTasks) | **GET** /crm/api/v1/tasks | List or search tasks.
[**patchTask**](TasksApi.md#patchTask) | **PATCH** /crm/api/v1/tasks/{taskId} | Partially update a task.
[**patchTaskInternalNote**](TasksApi.md#patchTaskInternalNote) | **PATCH** /crm/api/v1/tasks/{taskId}/notes/{noteId} | Add an internal note to a task.
[**restoreTaskInternalNote**](TasksApi.md#restoreTaskInternalNote) | **POST** /crm/api/v1/tasks/{taskId}/notes/{noteId}/restore | Restore an archived internal note for a task.
[**transferTaskToCompleted**](TasksApi.md#transferTaskToCompleted) | **POST** /crm/api/v1/tasks/{taskId}/transferToCompleted | Transfer a task to completed/done.


<a name="archiveTaskInternalNote"></a>
# **archiveTaskInternalNote**
> kotlin.Any archiveTaskInternalNote(taskId, noteId, acceptLanguage)

Archive an internal note for a task.

### Example
```kotlin
// Import classes:
//import equisoft/openapi.infrastructure.*
//import equisoft/openapi.models.*

val apiInstance = TasksApi()
val taskId : kotlin.String = taskId_example // kotlin.String | Task unique identifier.
val noteId : kotlin.Int = 56 // kotlin.Int | Note unique identifier.
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | Specify preferred language for returned data. Format is https://tools.ietf.org/html/rfc3282
try {
    val result : kotlin.Any = apiInstance.archiveTaskInternalNote(taskId, noteId, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TasksApi#archiveTaskInternalNote")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TasksApi#archiveTaskInternalNote")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **kotlin.String**| Task unique identifier. |
 **noteId** | **kotlin.Int**| Note unique identifier. |
 **acceptLanguage** | **kotlin.String**| Specify preferred language for returned data. Format is https://tools.ietf.org/html/rfc3282 | [optional]

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createTask"></a>
# **createTask**
> TasksCreateTaskResponse createTask(tasksCreateTaskPayload, acceptLanguage)

Create a task.

### Example
```kotlin
// Import classes:
//import equisoft/openapi.infrastructure.*
//import equisoft/openapi.models.*

val apiInstance = TasksApi()
val tasksCreateTaskPayload : TasksCreateTaskPayload =  // TasksCreateTaskPayload | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | Specify preferred language for returned data. Format is https://tools.ietf.org/html/rfc3282
try {
    val result : TasksCreateTaskResponse = apiInstance.createTask(tasksCreateTaskPayload, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TasksApi#createTask")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TasksApi#createTask")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tasksCreateTaskPayload** | [**TasksCreateTaskPayload**](TasksCreateTaskPayload.md)|  |
 **acceptLanguage** | **kotlin.String**| Specify preferred language for returned data. Format is https://tools.ietf.org/html/rfc3282 | [optional]

### Return type

[**TasksCreateTaskResponse**](TasksCreateTaskResponse.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createTaskInternalNote"></a>
# **createTaskInternalNote**
> InternalNotesCreateNoteResponse createTaskInternalNote(taskId, internalNotesCreateNotePayload, acceptLanguage)

Add an internal note to a task.

### Example
```kotlin
// Import classes:
//import equisoft/openapi.infrastructure.*
//import equisoft/openapi.models.*

val apiInstance = TasksApi()
val taskId : kotlin.String = taskId_example // kotlin.String | Task unique identifier.
val internalNotesCreateNotePayload : InternalNotesCreateNotePayload =  // InternalNotesCreateNotePayload | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | Specify preferred language for returned data. Format is https://tools.ietf.org/html/rfc3282
try {
    val result : InternalNotesCreateNoteResponse = apiInstance.createTaskInternalNote(taskId, internalNotesCreateNotePayload, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TasksApi#createTaskInternalNote")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TasksApi#createTaskInternalNote")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **kotlin.String**| Task unique identifier. |
 **internalNotesCreateNotePayload** | [**InternalNotesCreateNotePayload**](InternalNotesCreateNotePayload.md)|  |
 **acceptLanguage** | **kotlin.String**| Specify preferred language for returned data. Format is https://tools.ietf.org/html/rfc3282 | [optional]

### Return type

[**InternalNotesCreateNoteResponse**](InternalNotesCreateNoteResponse.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTask"></a>
# **deleteTask**
> kotlin.Any deleteTask(taskId)

Delete a task.

### Example
```kotlin
// Import classes:
//import equisoft/openapi.infrastructure.*
//import equisoft/openapi.models.*

val apiInstance = TasksApi()
val taskId : kotlin.String = taskId_example // kotlin.String | 
try {
    val result : kotlin.Any = apiInstance.deleteTask(taskId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TasksApi#deleteTask")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TasksApi#deleteTask")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **kotlin.String**|  |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTask"></a>
# **getTask**
> TasksTask getTask(taskId, acceptLanguage)

Return the detail of a task.

### Example
```kotlin
// Import classes:
//import equisoft/openapi.infrastructure.*
//import equisoft/openapi.models.*

val apiInstance = TasksApi()
val taskId : kotlin.String = taskId_example // kotlin.String | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | Specify preferred language for returned data. Format is https://tools.ietf.org/html/rfc3282
try {
    val result : TasksTask = apiInstance.getTask(taskId, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TasksApi#getTask")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TasksApi#getTask")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **kotlin.String**|  |
 **acceptLanguage** | **kotlin.String**| Specify preferred language for returned data. Format is https://tools.ietf.org/html/rfc3282 | [optional]

### Return type

[**TasksTask**](TasksTask.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTaskInternalNoteList"></a>
# **getTaskInternalNoteList**
> InternalNotesNoteList getTaskInternalNoteList(taskId, history, acceptLanguage)

Get the internal notes list for a task.

### Example
```kotlin
// Import classes:
//import equisoft/openapi.infrastructure.*
//import equisoft/openapi.models.*

val apiInstance = TasksApi()
val taskId : kotlin.String = taskId_example // kotlin.String | 
val history : InternalNotesHistoryType =  // InternalNotesHistoryType | Query all revisions or not.
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | Specify preferred language for returned data. Format is https://tools.ietf.org/html/rfc3282
try {
    val result : InternalNotesNoteList = apiInstance.getTaskInternalNoteList(taskId, history, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TasksApi#getTaskInternalNoteList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TasksApi#getTaskInternalNoteList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **kotlin.String**|  |
 **history** | [**InternalNotesHistoryType**](.md)| Query all revisions or not. | [optional] [enum: full, latestOnly]
 **acceptLanguage** | **kotlin.String**| Specify preferred language for returned data. Format is https://tools.ietf.org/html/rfc3282 | [optional]

### Return type

[**InternalNotesNoteList**](InternalNotesNoteList.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listTasks"></a>
# **listTasks**
> TasksListTaskResponse listTasks(ownerId, contactIds, minDueDate, maxDueDate, isCompleted, dueDateFilter, orderBy, pageToken, maxResults, acceptLanguage)

List or search tasks.

### Example
```kotlin
// Import classes:
//import equisoft/openapi.infrastructure.*
//import equisoft/openapi.models.*

val apiInstance = TasksApi()
val ownerId : kotlin.String = ownerId_example // kotlin.String | Owner ID filter param.
val contactIds : kotlin.collections.List<kotlin.Int> =  // kotlin.collections.List<kotlin.Int> | Contact ID filter param. Many ids can be passed to this argument separated by coma. Ex: '?contactId=1,2,3'. Any of the given contacts will be returned in the result.
val minDueDate : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Minimum (inclusive) due date of the task.
val maxDueDate : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Maximum (exclusive) due date of the task.
val isCompleted : kotlin.Boolean = true // kotlin.Boolean | If true, include only completed tasks. If false, include only TODO tasks. If not set or null, include both.
val dueDateFilter : TasksDueDateFilter =  // TasksDueDateFilter | Include or exclude tasks with or without due date.
val orderBy : TasksOrderByType =  // TasksOrderByType | Specify the order of the results.
val pageToken : kotlin.String = MjUwMDszMDAK // kotlin.String | Token to specify which page to fetch.
val maxResults : kotlin.String = maxResults_example // kotlin.String | Maximum number of records for one result page.  If the query return more records, nextPageToken will be specified in the result to get the records of the next page. Defaults to 250 records. Can never be more than 2500 records.
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | Specify preferred language for returned data. Format is https://tools.ietf.org/html/rfc3282
try {
    val result : TasksListTaskResponse = apiInstance.listTasks(ownerId, contactIds, minDueDate, maxDueDate, isCompleted, dueDateFilter, orderBy, pageToken, maxResults, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TasksApi#listTasks")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TasksApi#listTasks")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ownerId** | **kotlin.String**| Owner ID filter param. | [optional]
 **contactIds** | [**kotlin.collections.List&lt;kotlin.Int&gt;**](kotlin.Int.md)| Contact ID filter param. Many ids can be passed to this argument separated by coma. Ex: &#39;?contactId&#x3D;1,2,3&#39;. Any of the given contacts will be returned in the result. | [optional]
 **minDueDate** | **java.time.LocalDate**| Minimum (inclusive) due date of the task. | [optional]
 **maxDueDate** | **java.time.LocalDate**| Maximum (exclusive) due date of the task. | [optional]
 **isCompleted** | **kotlin.Boolean**| If true, include only completed tasks. If false, include only TODO tasks. If not set or null, include both. | [optional]
 **dueDateFilter** | [**TasksDueDateFilter**](.md)| Include or exclude tasks with or without due date. | [optional] [enum: withDueDate, withoutDueDate]
 **orderBy** | [**TasksOrderByType**](.md)| Specify the order of the results. | [optional] [enum: dueDate, dueDateDesc, completedDate, completedDateDesc, updateTime, creationTime]
 **pageToken** | **kotlin.String**| Token to specify which page to fetch. | [optional]
 **maxResults** | **kotlin.String**| Maximum number of records for one result page.  If the query return more records, nextPageToken will be specified in the result to get the records of the next page. Defaults to 250 records. Can never be more than 2500 records. | [optional]
 **acceptLanguage** | **kotlin.String**| Specify preferred language for returned data. Format is https://tools.ietf.org/html/rfc3282 | [optional]

### Return type

[**TasksListTaskResponse**](TasksListTaskResponse.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="patchTask"></a>
# **patchTask**
> TasksPatchTaskResponse patchTask(taskId, tasksPatchTaskPayload, acceptLanguage)

Partially update a task.

### Example
```kotlin
// Import classes:
//import equisoft/openapi.infrastructure.*
//import equisoft/openapi.models.*

val apiInstance = TasksApi()
val taskId : kotlin.String = taskId_example // kotlin.String | Task unique identifier.
val tasksPatchTaskPayload : TasksPatchTaskPayload =  // TasksPatchTaskPayload | Event fields to update. The body of the patch request includes only the resource fields you want to modify. To delete a field, set it to null. Collections are always overridden if defined.
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | Specify preferred language for returned data. Format is https://tools.ietf.org/html/rfc3282
try {
    val result : TasksPatchTaskResponse = apiInstance.patchTask(taskId, tasksPatchTaskPayload, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TasksApi#patchTask")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TasksApi#patchTask")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **kotlin.String**| Task unique identifier. |
 **tasksPatchTaskPayload** | [**TasksPatchTaskPayload**](TasksPatchTaskPayload.md)| Event fields to update. The body of the patch request includes only the resource fields you want to modify. To delete a field, set it to null. Collections are always overridden if defined. |
 **acceptLanguage** | **kotlin.String**| Specify preferred language for returned data. Format is https://tools.ietf.org/html/rfc3282 | [optional]

### Return type

[**TasksPatchTaskResponse**](TasksPatchTaskResponse.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="patchTaskInternalNote"></a>
# **patchTaskInternalNote**
> InternalNotesPatchNoteResponse patchTaskInternalNote(taskId, noteId, internalNotesPatchNotePayload, acceptLanguage)

Add an internal note to a task.

### Example
```kotlin
// Import classes:
//import equisoft/openapi.infrastructure.*
//import equisoft/openapi.models.*

val apiInstance = TasksApi()
val taskId : kotlin.String = taskId_example // kotlin.String | Task unique identifier.
val noteId : kotlin.Int = 56 // kotlin.Int | Note unique identifier.
val internalNotesPatchNotePayload : InternalNotesPatchNotePayload =  // InternalNotesPatchNotePayload | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | Specify preferred language for returned data. Format is https://tools.ietf.org/html/rfc3282
try {
    val result : InternalNotesPatchNoteResponse = apiInstance.patchTaskInternalNote(taskId, noteId, internalNotesPatchNotePayload, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TasksApi#patchTaskInternalNote")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TasksApi#patchTaskInternalNote")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **kotlin.String**| Task unique identifier. |
 **noteId** | **kotlin.Int**| Note unique identifier. |
 **internalNotesPatchNotePayload** | [**InternalNotesPatchNotePayload**](InternalNotesPatchNotePayload.md)|  |
 **acceptLanguage** | **kotlin.String**| Specify preferred language for returned data. Format is https://tools.ietf.org/html/rfc3282 | [optional]

### Return type

[**InternalNotesPatchNoteResponse**](InternalNotesPatchNoteResponse.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="restoreTaskInternalNote"></a>
# **restoreTaskInternalNote**
> kotlin.Any restoreTaskInternalNote(taskId, noteId, acceptLanguage)

Restore an archived internal note for a task.

### Example
```kotlin
// Import classes:
//import equisoft/openapi.infrastructure.*
//import equisoft/openapi.models.*

val apiInstance = TasksApi()
val taskId : kotlin.String = taskId_example // kotlin.String | Task unique identifier.
val noteId : kotlin.Int = 56 // kotlin.Int | Note unique identifier.
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | Specify preferred language for returned data. Format is https://tools.ietf.org/html/rfc3282
try {
    val result : kotlin.Any = apiInstance.restoreTaskInternalNote(taskId, noteId, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TasksApi#restoreTaskInternalNote")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TasksApi#restoreTaskInternalNote")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **kotlin.String**| Task unique identifier. |
 **noteId** | **kotlin.Int**| Note unique identifier. |
 **acceptLanguage** | **kotlin.String**| Specify preferred language for returned data. Format is https://tools.ietf.org/html/rfc3282 | [optional]

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="transferTaskToCompleted"></a>
# **transferTaskToCompleted**
> TasksTransferToCompletedResponse transferTaskToCompleted(taskId)

Transfer a task to completed/done.

### Example
```kotlin
// Import classes:
//import equisoft/openapi.infrastructure.*
//import equisoft/openapi.models.*

val apiInstance = TasksApi()
val taskId : kotlin.String = taskId_example // kotlin.String | Task unique identifier.
try {
    val result : TasksTransferToCompletedResponse = apiInstance.transferTaskToCompleted(taskId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TasksApi#transferTaskToCompleted")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TasksApi#transferTaskToCompleted")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **kotlin.String**| Task unique identifier. |

### Return type

[**TasksTransferToCompletedResponse**](TasksTransferToCompletedResponse.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

