# EventsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**archiveEventInternalNote**](EventsApi.md#archiveEventInternalNote) | **POST** /crm/api/v1/events/{eventId}/notes/{noteId}/archive | Archive an internal note for and event.
[**createEvent**](EventsApi.md#createEvent) | **POST** /crm/api/v1/events | Create an event.
[**createEventInternalNote**](EventsApi.md#createEventInternalNote) | **POST** /crm/api/v1/events/{eventId}/notes | Add an internal note to and event.
[**deleteEvent**](EventsApi.md#deleteEvent) | **DELETE** /crm/api/v1/events/{eventId} | Delete an event.
[**getCalendar**](EventsApi.md#getCalendar) | **GET** /crm/api/v1/calendars/{calendarId} |  Get informations about a calendar or a default calendar.
[**getEvent**](EventsApi.md#getEvent) | **GET** /crm/api/v1/events/{eventId} | Return the detail of an event.
[**getEventInstances**](EventsApi.md#getEventInstances) | **GET** /crm/api/v1/events/{eventId}/instances | Get a recurring event instances.
[**getEventInternalNoteList**](EventsApi.md#getEventInternalNoteList) | **GET** /crm/api/v1/events/{eventId}/notes | Get the internal notes list for an event.
[**listCalendars**](EventsApi.md#listCalendars) | **GET** /crm/api/v1/calendars | Get the list of available calendars.
[**listEvents**](EventsApi.md#listEvents) | **GET** /crm/api/v1/events | List or search events.
[**patchEvent**](EventsApi.md#patchEvent) | **PATCH** /crm/api/v1/events/{eventId} | Partially update an event.
[**patchEventInternalNote**](EventsApi.md#patchEventInternalNote) | **PATCH** /crm/api/v1/events/{eventId}/notes/{noteId} | Add an internal note to and event.
[**restoreEventInternalNote**](EventsApi.md#restoreEventInternalNote) | **POST** /crm/api/v1/events/{eventId}/notes/{noteId}/restore | Restore an archived internal note for an event.
[**transferEventToCompleted**](EventsApi.md#transferEventToCompleted) | **POST** /crm/api/v1/events/{eventId}/transferToCompleted | Transfer an event to the completed/done calendar.


<a name="archiveEventInternalNote"></a>
# **archiveEventInternalNote**
> kotlin.Any archiveEventInternalNote(eventId, noteId, acceptLanguage)

Archive an internal note for and event.

### Example
```kotlin
// Import classes:
//import com.equisoft.connect.sdk.infrastructure.*
//import com.equisoft.connect.sdk.models.*

val apiInstance = EventsApi()
val eventId : kotlin.String = eventId_example // kotlin.String | Event unique identifier. For recurrence occurrence/exception, eventId is suffixed with the original start date of the occurrence. For example 999_20180101.
val noteId : kotlin.Int = 56 // kotlin.Int | Note unique identifier.
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | Specify preferred language for returned data. Format is https://tools.ietf.org/html/rfc3282
try {
    val result : kotlin.Any = apiInstance.archiveEventInternalNote(eventId, noteId, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventsApi#archiveEventInternalNote")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventsApi#archiveEventInternalNote")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventId** | **kotlin.String**| Event unique identifier. For recurrence occurrence/exception, eventId is suffixed with the original start date of the occurrence. For example 999_20180101. |
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

<a name="createEvent"></a>
# **createEvent**
> EventsCreateEventResponse createEvent(eventsCreateEventPayload, acceptLanguage)

Create an event.

### Example
```kotlin
// Import classes:
//import com.equisoft.connect.sdk.infrastructure.*
//import com.equisoft.connect.sdk.models.*

val apiInstance = EventsApi()
val eventsCreateEventPayload : EventsCreateEventPayload =  // EventsCreateEventPayload | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | Specify preferred language for returned data. Format is https://tools.ietf.org/html/rfc3282
try {
    val result : EventsCreateEventResponse = apiInstance.createEvent(eventsCreateEventPayload, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventsApi#createEvent")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventsApi#createEvent")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventsCreateEventPayload** | [**EventsCreateEventPayload**](EventsCreateEventPayload.md)|  |
 **acceptLanguage** | **kotlin.String**| Specify preferred language for returned data. Format is https://tools.ietf.org/html/rfc3282 | [optional]

### Return type

[**EventsCreateEventResponse**](EventsCreateEventResponse.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createEventInternalNote"></a>
# **createEventInternalNote**
> InternalNotesCreateNoteResponse createEventInternalNote(eventId, internalNotesCreateNotePayload, acceptLanguage)

Add an internal note to and event.

### Example
```kotlin
// Import classes:
//import com.equisoft.connect.sdk.infrastructure.*
//import com.equisoft.connect.sdk.models.*

val apiInstance = EventsApi()
val eventId : kotlin.String = eventId_example // kotlin.String | Event unique identifier. For recurrence occurrence/exception, eventId is suffixed with the original start date of the occurrence. For example 999_20180101.
val internalNotesCreateNotePayload : InternalNotesCreateNotePayload =  // InternalNotesCreateNotePayload | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | Specify preferred language for returned data. Format is https://tools.ietf.org/html/rfc3282
try {
    val result : InternalNotesCreateNoteResponse = apiInstance.createEventInternalNote(eventId, internalNotesCreateNotePayload, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventsApi#createEventInternalNote")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventsApi#createEventInternalNote")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventId** | **kotlin.String**| Event unique identifier. For recurrence occurrence/exception, eventId is suffixed with the original start date of the occurrence. For example 999_20180101. |
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

<a name="deleteEvent"></a>
# **deleteEvent**
> kotlin.Any deleteEvent(eventId)

Delete an event.

**Note:** To delete an instance of recurring event, use the master event id suffixed by the original start date of the occurrence.

### Example
```kotlin
// Import classes:
//import com.equisoft.connect.sdk.infrastructure.*
//import com.equisoft.connect.sdk.models.*

val apiInstance = EventsApi()
val eventId : kotlin.String = eventId_example // kotlin.String | Event unique identifier. For recurrence occurrence/exception, eventId is suffixed with the original start date of the occurrence. For example 999_20180101.
try {
    val result : kotlin.Any = apiInstance.deleteEvent(eventId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventsApi#deleteEvent")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventsApi#deleteEvent")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventId** | **kotlin.String**| Event unique identifier. For recurrence occurrence/exception, eventId is suffixed with the original start date of the occurrence. For example 999_20180101. |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCalendar"></a>
# **getCalendar**
> CalendarsCalendar getCalendar(calendarId, acceptLanguage)

 Get informations about a calendar or a default calendar.

### Example
```kotlin
// Import classes:
//import com.equisoft.connect.sdk.infrastructure.*
//import com.equisoft.connect.sdk.models.*

val apiInstance = EventsApi()
val calendarId : kotlin.String = calendarId_example // kotlin.String | Calendar ID filter param. An id returned by listCalendars. The string `primary` for the current connected user primary (TODO) calendar. The string `completed` for the current connected user completed (DONE) calendar.
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | Specify preferred language for returned data. Format is https://tools.ietf.org/html/rfc3282
try {
    val result : CalendarsCalendar = apiInstance.getCalendar(calendarId, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventsApi#getCalendar")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventsApi#getCalendar")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **calendarId** | **kotlin.String**| Calendar ID filter param. An id returned by listCalendars. The string &#x60;primary&#x60; for the current connected user primary (TODO) calendar. The string &#x60;completed&#x60; for the current connected user completed (DONE) calendar. |
 **acceptLanguage** | **kotlin.String**| Specify preferred language for returned data. Format is https://tools.ietf.org/html/rfc3282 | [optional]

### Return type

[**CalendarsCalendar**](CalendarsCalendar.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEvent"></a>
# **getEvent**
> EventsEvent getEvent(eventId, acceptLanguage)

Return the detail of an event.

### Example
```kotlin
// Import classes:
//import com.equisoft.connect.sdk.infrastructure.*
//import com.equisoft.connect.sdk.models.*

val apiInstance = EventsApi()
val eventId : kotlin.String = eventId_example // kotlin.String | Event unique identifier. For recurrence occurrence/exception, eventId is suffixed with the original start date of the occurrence. For example 999_20180101.
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | Specify preferred language for returned data. Format is https://tools.ietf.org/html/rfc3282
try {
    val result : EventsEvent = apiInstance.getEvent(eventId, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventsApi#getEvent")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventsApi#getEvent")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventId** | **kotlin.String**| Event unique identifier. For recurrence occurrence/exception, eventId is suffixed with the original start date of the occurrence. For example 999_20180101. |
 **acceptLanguage** | **kotlin.String**| Specify preferred language for returned data. Format is https://tools.ietf.org/html/rfc3282 | [optional]

### Return type

[**EventsEvent**](EventsEvent.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEventInstances"></a>
# **getEventInstances**
> EventsGetEventInstancesResponse getEventInstances(eventId, minTime, maxTime, pageToken, maxResults, acceptLanguage)

Get a recurring event instances.

### Example
```kotlin
// Import classes:
//import com.equisoft.connect.sdk.infrastructure.*
//import com.equisoft.connect.sdk.models.*

val apiInstance = EventsApi()
val eventId : kotlin.String = eventId_example // kotlin.String | Event unique identifier. For recurrence occurrence/exception, eventId is suffixed with the original start date of the occurrence. For example 999_20180101.
val minTime : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Minimum (inclusive) date and time of the event start time. As defined by date-time - RFC3339
val maxTime : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Maximum (exclusive) date and time of the event start time. As defined by date-time - RFC3339
val pageToken : kotlin.String = MjUwMDszMDAK // kotlin.String | Token to specify which page to fetch.
val maxResults : kotlin.String = maxResults_example // kotlin.String | Maximum number of records for one result page.  If the query return more records, nextPageToken will be specified in the result to get the records of the next page. Defaults to 250 records. Can never be more than 2500 records.
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | Specify preferred language for returned data. Format is https://tools.ietf.org/html/rfc3282
try {
    val result : EventsGetEventInstancesResponse = apiInstance.getEventInstances(eventId, minTime, maxTime, pageToken, maxResults, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventsApi#getEventInstances")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventsApi#getEventInstances")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventId** | **kotlin.String**| Event unique identifier. For recurrence occurrence/exception, eventId is suffixed with the original start date of the occurrence. For example 999_20180101. |
 **minTime** | **java.time.OffsetDateTime**| Minimum (inclusive) date and time of the event start time. As defined by date-time - RFC3339 | [optional]
 **maxTime** | **java.time.OffsetDateTime**| Maximum (exclusive) date and time of the event start time. As defined by date-time - RFC3339 | [optional]
 **pageToken** | **kotlin.String**| Token to specify which page to fetch. | [optional]
 **maxResults** | **kotlin.String**| Maximum number of records for one result page.  If the query return more records, nextPageToken will be specified in the result to get the records of the next page. Defaults to 250 records. Can never be more than 2500 records. | [optional]
 **acceptLanguage** | **kotlin.String**| Specify preferred language for returned data. Format is https://tools.ietf.org/html/rfc3282 | [optional]

### Return type

[**EventsGetEventInstancesResponse**](EventsGetEventInstancesResponse.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEventInternalNoteList"></a>
# **getEventInternalNoteList**
> InternalNotesNoteList getEventInternalNoteList(eventId, history, acceptLanguage)

Get the internal notes list for an event.

### Example
```kotlin
// Import classes:
//import com.equisoft.connect.sdk.infrastructure.*
//import com.equisoft.connect.sdk.models.*

val apiInstance = EventsApi()
val eventId : kotlin.String = eventId_example // kotlin.String | Event unique identifier. For recurrence occurrence/exception, eventId is suffixed with the original start date of the occurrence. For example 999_20180101.
val history : InternalNotesHistoryType =  // InternalNotesHistoryType | Query all revisions or not.
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | Specify preferred language for returned data. Format is https://tools.ietf.org/html/rfc3282
try {
    val result : InternalNotesNoteList = apiInstance.getEventInternalNoteList(eventId, history, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventsApi#getEventInternalNoteList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventsApi#getEventInternalNoteList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventId** | **kotlin.String**| Event unique identifier. For recurrence occurrence/exception, eventId is suffixed with the original start date of the occurrence. For example 999_20180101. |
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

<a name="listCalendars"></a>
# **listCalendars**
> CalendarsListCalendarResponse listCalendars(acceptLanguage)

Get the list of available calendars.

### Example
```kotlin
// Import classes:
//import com.equisoft.connect.sdk.infrastructure.*
//import com.equisoft.connect.sdk.models.*

val apiInstance = EventsApi()
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | Specify preferred language for returned data. Format is https://tools.ietf.org/html/rfc3282
try {
    val result : CalendarsListCalendarResponse = apiInstance.listCalendars(acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventsApi#listCalendars")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventsApi#listCalendars")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| Specify preferred language for returned data. Format is https://tools.ietf.org/html/rfc3282 | [optional]

### Return type

[**CalendarsListCalendarResponse**](CalendarsListCalendarResponse.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listEvents"></a>
# **listEvents**
> EventsListEventResponse listEvents(calendarId, ownerId, contactIds, minTime, maxTime, singleEvents, isCompleted, orderBy, pageToken, maxResults, acceptLanguage)

List or search events.

### Example
```kotlin
// Import classes:
//import com.equisoft.connect.sdk.infrastructure.*
//import com.equisoft.connect.sdk.models.*

val apiInstance = EventsApi()
val calendarId : kotlin.String = calendarId_example // kotlin.String | Calendar ID filter param. An id returned by listCalendars. The string `primary` for the current connected user primary (TODO) calendar. The string `completed` for the current connected user completed (DONE) calendar.
val ownerId : kotlin.String = ownerId_example // kotlin.String | Owner ID filter param.
val contactIds : kotlin.collections.List<kotlin.Int> =  // kotlin.collections.List<kotlin.Int> | Contact ID filter param. Many ids can be passed to this argument separated by coma. Ex: '?contactId=1,2,3'. Any of the given contacts will be returned in the result.
val minTime : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Minimum (inclusive) date and time of the event start time. As defined by date-time - RFC3339
val maxTime : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Maximum (exclusive) date and time of the event start time. As defined by date-time - RFC3339
val singleEvents : kotlin.Boolean = true // kotlin.Boolean | Expand recurring events into occurrences. When singleEvents is true, master recurrences are not returned in list.
val isCompleted : kotlin.Boolean = true // kotlin.Boolean | If true, include only completed events. If false, include only TODO event. If not set or null, include both.
val orderBy : EventsOrderByType =  // EventsOrderByType | Specify the order of the results. `startTime` may result in inconsistant sort when used without the `singleEvents` option.
val pageToken : kotlin.String = MjUwMDszMDAK // kotlin.String | Token to specify which page to fetch.
val maxResults : kotlin.String = maxResults_example // kotlin.String | Maximum number of records for one result page.  If the query return more records, nextPageToken will be specified in the result to get the records of the next page. Defaults to 250 records. Can never be more than 2500 records.
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | Specify preferred language for returned data. Format is https://tools.ietf.org/html/rfc3282
try {
    val result : EventsListEventResponse = apiInstance.listEvents(calendarId, ownerId, contactIds, minTime, maxTime, singleEvents, isCompleted, orderBy, pageToken, maxResults, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventsApi#listEvents")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventsApi#listEvents")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **calendarId** | **kotlin.String**| Calendar ID filter param. An id returned by listCalendars. The string &#x60;primary&#x60; for the current connected user primary (TODO) calendar. The string &#x60;completed&#x60; for the current connected user completed (DONE) calendar. | [optional]
 **ownerId** | **kotlin.String**| Owner ID filter param. | [optional]
 **contactIds** | [**kotlin.collections.List&lt;kotlin.Int&gt;**](kotlin.Int.md)| Contact ID filter param. Many ids can be passed to this argument separated by coma. Ex: &#39;?contactId&#x3D;1,2,3&#39;. Any of the given contacts will be returned in the result. | [optional]
 **minTime** | **java.time.OffsetDateTime**| Minimum (inclusive) date and time of the event start time. As defined by date-time - RFC3339 | [optional]
 **maxTime** | **java.time.OffsetDateTime**| Maximum (exclusive) date and time of the event start time. As defined by date-time - RFC3339 | [optional]
 **singleEvents** | **kotlin.Boolean**| Expand recurring events into occurrences. When singleEvents is true, master recurrences are not returned in list. | [optional]
 **isCompleted** | **kotlin.Boolean**| If true, include only completed events. If false, include only TODO event. If not set or null, include both. | [optional]
 **orderBy** | [**EventsOrderByType**](.md)| Specify the order of the results. &#x60;startTime&#x60; may result in inconsistant sort when used without the &#x60;singleEvents&#x60; option. | [optional] [enum: startTime, updateTime, creationTime]
 **pageToken** | **kotlin.String**| Token to specify which page to fetch. | [optional]
 **maxResults** | **kotlin.String**| Maximum number of records for one result page.  If the query return more records, nextPageToken will be specified in the result to get the records of the next page. Defaults to 250 records. Can never be more than 2500 records. | [optional]
 **acceptLanguage** | **kotlin.String**| Specify preferred language for returned data. Format is https://tools.ietf.org/html/rfc3282 | [optional]

### Return type

[**EventsListEventResponse**](EventsListEventResponse.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="patchEvent"></a>
# **patchEvent**
> EventsPatchEventResponse patchEvent(eventId, eventsPatchEventPayload, acceptLanguage)

Partially update an event.

**Note:** To update an instance of recurring event, use the master event id suffixed by the original start date of the occurrence.

### Example
```kotlin
// Import classes:
//import com.equisoft.connect.sdk.infrastructure.*
//import com.equisoft.connect.sdk.models.*

val apiInstance = EventsApi()
val eventId : kotlin.String = eventId_example // kotlin.String | Event unique identifier. For recurrence occurrence/exception, eventId is suffixed with the original start date of the occurrence. For example 999_20180101.
val eventsPatchEventPayload : EventsPatchEventPayload =  // EventsPatchEventPayload | Event fields to update. The body of the patch request includes only the resource fields you want to modify. To delete a field, set it to null. Collections are always overridden if defined.
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | Specify preferred language for returned data. Format is https://tools.ietf.org/html/rfc3282
try {
    val result : EventsPatchEventResponse = apiInstance.patchEvent(eventId, eventsPatchEventPayload, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventsApi#patchEvent")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventsApi#patchEvent")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventId** | **kotlin.String**| Event unique identifier. For recurrence occurrence/exception, eventId is suffixed with the original start date of the occurrence. For example 999_20180101. |
 **eventsPatchEventPayload** | [**EventsPatchEventPayload**](EventsPatchEventPayload.md)| Event fields to update. The body of the patch request includes only the resource fields you want to modify. To delete a field, set it to null. Collections are always overridden if defined. |
 **acceptLanguage** | **kotlin.String**| Specify preferred language for returned data. Format is https://tools.ietf.org/html/rfc3282 | [optional]

### Return type

[**EventsPatchEventResponse**](EventsPatchEventResponse.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="patchEventInternalNote"></a>
# **patchEventInternalNote**
> InternalNotesPatchNoteResponse patchEventInternalNote(eventId, noteId, internalNotesPatchNotePayload, acceptLanguage)

Add an internal note to and event.

### Example
```kotlin
// Import classes:
//import com.equisoft.connect.sdk.infrastructure.*
//import com.equisoft.connect.sdk.models.*

val apiInstance = EventsApi()
val eventId : kotlin.String = eventId_example // kotlin.String | Event unique identifier. For recurrence occurrence/exception, eventId is suffixed with the original start date of the occurrence. For example 999_20180101.
val noteId : kotlin.Int = 56 // kotlin.Int | Note unique identifier.
val internalNotesPatchNotePayload : InternalNotesPatchNotePayload =  // InternalNotesPatchNotePayload | 
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | Specify preferred language for returned data. Format is https://tools.ietf.org/html/rfc3282
try {
    val result : InternalNotesPatchNoteResponse = apiInstance.patchEventInternalNote(eventId, noteId, internalNotesPatchNotePayload, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventsApi#patchEventInternalNote")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventsApi#patchEventInternalNote")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventId** | **kotlin.String**| Event unique identifier. For recurrence occurrence/exception, eventId is suffixed with the original start date of the occurrence. For example 999_20180101. |
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

<a name="restoreEventInternalNote"></a>
# **restoreEventInternalNote**
> kotlin.Any restoreEventInternalNote(eventId, noteId, acceptLanguage)

Restore an archived internal note for an event.

### Example
```kotlin
// Import classes:
//import com.equisoft.connect.sdk.infrastructure.*
//import com.equisoft.connect.sdk.models.*

val apiInstance = EventsApi()
val eventId : kotlin.String = eventId_example // kotlin.String | Event unique identifier. For recurrence occurrence/exception, eventId is suffixed with the original start date of the occurrence. For example 999_20180101.
val noteId : kotlin.Int = 56 // kotlin.Int | Note unique identifier.
val acceptLanguage : kotlin.String = acceptLanguage_example // kotlin.String | Specify preferred language for returned data. Format is https://tools.ietf.org/html/rfc3282
try {
    val result : kotlin.Any = apiInstance.restoreEventInternalNote(eventId, noteId, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventsApi#restoreEventInternalNote")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventsApi#restoreEventInternalNote")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventId** | **kotlin.String**| Event unique identifier. For recurrence occurrence/exception, eventId is suffixed with the original start date of the occurrence. For example 999_20180101. |
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

<a name="transferEventToCompleted"></a>
# **transferEventToCompleted**
> EventsTransferToCompletedResponse transferEventToCompleted(eventId)

Transfer an event to the completed/done calendar.

### Example
```kotlin
// Import classes:
//import com.equisoft.connect.sdk.infrastructure.*
//import com.equisoft.connect.sdk.models.*

val apiInstance = EventsApi()
val eventId : kotlin.String = eventId_example // kotlin.String | Event unique identifier. For recurrence occurrence/exception, eventId is suffixed with the original start date of the occurrence. For example 999_20180101.
try {
    val result : EventsTransferToCompletedResponse = apiInstance.transferEventToCompleted(eventId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventsApi#transferEventToCompleted")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventsApi#transferEventToCompleted")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventId** | **kotlin.String**| Event unique identifier. For recurrence occurrence/exception, eventId is suffixed with the original start date of the occurrence. For example 999_20180101. |

### Return type

[**EventsTransferToCompletedResponse**](EventsTransferToCompletedResponse.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

