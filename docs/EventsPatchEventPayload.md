
# EventsPatchEventPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**subject** | **kotlin.String** | Subject/Title of the Event. |  [optional]
**start** | [**DateOrDateTime**](DateOrDateTime.md) |  |  [optional]
**end** | [**DateOrDateTime**](DateOrDateTime.md) |  |  [optional]
**allDay** | **kotlin.Boolean** | Indicate if the event is an all-day event or a timed event. |  [optional]
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



