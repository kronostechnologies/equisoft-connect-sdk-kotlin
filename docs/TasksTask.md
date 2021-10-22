
# TasksTask

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** | Unique numerical identifier. | 
**subject** | **kotlin.String** | Subject/Title of the Event. | 
**isCompleted** | **kotlin.Boolean** | Is the task completed/done. | 
**accessRights** | [**AccessRights**](AccessRights.md) |  | 
**dueDate** | **kotlin.String** | Date the task is expected to be done. As defined by full-date - RFC3339 |  [optional]
**initialDate** | **kotlin.String** | Date the task was initially started. As defined by full-date - RFC3339 |  [optional]
**completedDate** | **kotlin.String** | Date the task was completed / done. As defined by full-date - RFC3339 |  [optional]
**description** | **kotlin.String** | Public description of the Event. |  [optional]
**internalNotes** | **kotlin.String** | Internal notes on the Event. Not synced on remote sources. |  [optional]
**category** | [**FieldValue**](FieldValue.md) |  |  [optional]
**subCategory** | [**kotlin.Any**](.md) | Event sub category |  [optional]
**priority** | **kotlin.Int** | Importance/Priority of an event or task. 5 is the most important. |  [optional]
**visibility** | **kotlin.String** | Confidentiality level of the Event (private or not). [NORMAL, PRIVATE] |  [optional]
**creationTime** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Creation time. As defined by date-time - RFC3339 |  [optional]
**updateTime** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date time of last modification. As defined by date-time - RFC3339 |  [optional]
**completionTime** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Completion time. As defined by date-time - RFC3339 |  [optional]
**contactIds** | **kotlin.collections.List&lt;kotlin.Int&gt;** | IDs of the contacts linked to this Task |  [optional]



