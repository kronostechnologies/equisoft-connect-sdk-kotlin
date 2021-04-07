
# EventsCreateEventPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**subject** | **kotlin.String** | Subject/Title of the Event. | 
**start** | [**DateOrDateTime**](DateOrDateTime.md) |  | 
**allDay** | **kotlin.Boolean** | Indicate if the event is an all-day event or a timed event. | 
**calendarId** | **kotlin.String** | Calendar the Event will be created for. A numerical ID returned by listCalendars. The string &#x60;primary&#x60; for the current connected user primary (&#39;TODO&#39;) calendar. The string &#x60;completed&#x60; for the current connected user completed (&#39;DONE&#39;) calendar. The &#x60;calendarId&#x60; parameter can&#39;t be used with the &#x60;ownerId&#x60; parameter. |  [optional]
**ownerIds** | **kotlin.collections.List&lt;kotlin.Int&gt;** | For local legacy events, &#x60;ownerIds&#x60; can be used instead of calendarId to create an Event for many user at once. Cannot be used with &#x60;calendarId&#x60;. Cannot be used for users with remote calendar (Exchange, Office365, Outlook.com). |  [optional]
**end** | [**DateOrDateTime**](DateOrDateTime.md) |  |  [optional]
**initialDate** | **kotlin.String** | Date the Event was initially scheduled. As defined by full-date - RFC3339 |  [optional]
**description** | **kotlin.String** | Public description of the Event. |  [optional]
**internalNotes** | **kotlin.String** | Internal notes on the Event. Not synced on remote sources. |  [optional]
**location** | **kotlin.String** | Location of the event in free-text form. |  [optional]
**type** | **kotlin.String** | Event type (CALL, LETTER, MEETING, VACATION, FILE, NOTE) |  [optional]
**categoryId** | **kotlin.Int** | ID of the field value to use as category. |  [optional]
**subCategoryId** | **kotlin.Int** | ID of the field value to use as sub-category. |  [optional]
**priority** | **kotlin.Int** | Importance/Priority of an event or task. 5 is the most important. |  [optional]
**visibility** | **kotlin.String** | Confidentiality level of the Event (private or not). [NORMAL, PRIVATE] |  [optional]
**contactIds** | **kotlin.collections.List&lt;kotlin.Int&gt;** | Allow to link the event to one or many contacts. |  [optional]



