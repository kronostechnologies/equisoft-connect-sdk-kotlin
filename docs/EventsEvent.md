
# EventsEvent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** | Unique numerical identifier. | 
**subject** | **kotlin.String** | Subject/Title of the Event. | 
**start** | [**DateOrDateTime**](DateOrDateTime.md) |  | 
**end** | [**DateOrDateTime**](DateOrDateTime.md) |  | 
**allDay** | **kotlin.Boolean** | Indicate if the event is an all-day event or a timed event. | 
**isCompleted** | **kotlin.Boolean** | Is the event part of a completed/done calendar. | 
**type** | **kotlin.String** | Event type (CALL, LETTER, MEETING, VACATION, FILE, NOTE) | 
**calendarId** | **kotlin.Int** | ID of the calendar owning this Event. If owned by many users, calendarId will be - The primary ( or completed depending on state) calendar ID of the connected user if the user is the he is one of the owners. - Any primary ( or completed depending on state) completed calendar ID of one of the owners. | 
**accessRights** | [**AccessRights**](AccessRights.md) |  | 
**initialDate** | **kotlin.String** | Date the Event was initially scheduled. As defined by full-date - RFC3339 |  [optional]
**description** | **kotlin.String** | Public description of the Event. |  [optional]
**internalNotes** | **kotlin.String** | Internal notes on the Event. Not synced on remote sources. |  [optional]
**location** | **kotlin.String** | Location of the event in free-text form. |  [optional]
**category** | [**FieldValue**](FieldValue.md) |  |  [optional]
**subCategory** | [**FieldValue**](FieldValue.md) |  |  [optional]
**recurrenceRule** | **kotlin.String** | The recurrence rule for this event. The recurrence is a string conform to RFC 5545 (see RRULE http://tools.ietf.org/html/rfc5545#section-3.8.5.3). |  [optional]
**recurringEventId** | **kotlin.String** | For an instance of recurring event, ID of the master event. |  [optional]
**originalStartDate** | **kotlin.String** | For an instance of recurring event, original start date of the event according to the recurrence rule. |  [optional]
**priority** | **kotlin.Int** | Importance/Priority of an event or task. 5 is the most important. |  [optional]
**visibility** | **kotlin.String** | Confidentiality level of the Event (private or not). [NORMAL, PRIVATE] |  [optional]
**creationTime** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Creation time. As defined by date-time - RFC3339 |  [optional]
**updateTime** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date time of last modification. As defined by date-time - RFC3339 |  [optional]
**color** | **kotlin.String** | hex color of this event background |  [optional]
**textColor** | **kotlin.String** | hex text color of this event |  [optional]
**contactIds** | **kotlin.collections.List&lt;kotlin.Int&gt;** | IDs of the contacts linked to this Event |  [optional]



