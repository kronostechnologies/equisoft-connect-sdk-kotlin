
# TasksPatchTaskPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**subject** | **kotlin.String** | Subject/Title of the Event. |  [optional]
**dueDate** | **kotlin.String** | Date the task is expected to be done. As defined by full-date - RFC3339 |  [optional]
**initialDate** | **kotlin.String** | Date the task was initially started. As defined by full-date - RFC3339 |  [optional]
**completedDate** | **kotlin.String** | Date the task was completed / done. As defined by full-date - RFC3339 |  [optional]
**description** | **kotlin.String** | Public description of the Event. |  [optional]
**internalNotes** | **kotlin.String** | Internal notes on the Event. Not synced on remote sources. |  [optional]
**categoryId** | **kotlin.Int** | ID of the field value to use as category. |  [optional]
**subCategoryId** | **kotlin.Int** | ID of the field value to use as sub-category. |  [optional]
**priority** | **kotlin.Int** | Importance/Priority of an event or task. 5 is the most important. |  [optional]
**visibility** | **kotlin.String** | Confidentiality level of the Event (private or not). [NORMAL, PRIVATE] |  [optional]
**contactIds** | **kotlin.collections.List&lt;kotlin.Int&gt;** | Allow to link the task to one or many contacts. |  [optional]



