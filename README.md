# equisoft/openapi - Kotlin client library for Equisoft /connect API

## Requires

* Kotlin 1.4.30
* Gradle 6.8.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*EventsApi* | [**archiveEventInternalNote**](docs/EventsApi.md#archiveeventinternalnote) | **POST** /crm/api/v1/events/{eventId}/notes/{noteId}/archive | Archive an internal note for and event.
*EventsApi* | [**createEvent**](docs/EventsApi.md#createevent) | **POST** /crm/api/v1/events | Create an event.
*EventsApi* | [**createEventInternalNote**](docs/EventsApi.md#createeventinternalnote) | **POST** /crm/api/v1/events/{eventId}/notes | Add an internal note to and event.
*EventsApi* | [**deleteEvent**](docs/EventsApi.md#deleteevent) | **DELETE** /crm/api/v1/events/{eventId} | Delete an event.
*EventsApi* | [**getCalendar**](docs/EventsApi.md#getcalendar) | **GET** /crm/api/v1/calendars/{calendarId} |  Get informations about a calendar or a default calendar.
*EventsApi* | [**getEvent**](docs/EventsApi.md#getevent) | **GET** /crm/api/v1/events/{eventId} | Return the detail of an event.
*EventsApi* | [**getEventInstances**](docs/EventsApi.md#geteventinstances) | **GET** /crm/api/v1/events/{eventId}/instances | Get a recurring event instances.
*EventsApi* | [**getEventInternalNoteList**](docs/EventsApi.md#geteventinternalnotelist) | **GET** /crm/api/v1/events/{eventId}/notes | Get the internal notes list for an event.
*EventsApi* | [**listCalendars**](docs/EventsApi.md#listcalendars) | **GET** /crm/api/v1/calendars | Get the list of available calendars.
*EventsApi* | [**listEvents**](docs/EventsApi.md#listevents) | **GET** /crm/api/v1/events | List or search events.
*EventsApi* | [**patchEvent**](docs/EventsApi.md#patchevent) | **PATCH** /crm/api/v1/events/{eventId} | Partially update an event.
*EventsApi* | [**patchEventInternalNote**](docs/EventsApi.md#patcheventinternalnote) | **PATCH** /crm/api/v1/events/{eventId}/notes/{noteId} | Add an internal note to and event.
*EventsApi* | [**restoreEventInternalNote**](docs/EventsApi.md#restoreeventinternalnote) | **POST** /crm/api/v1/events/{eventId}/notes/{noteId}/restore | Restore an archived internal note for an event.
*EventsApi* | [**transferEventToCompleted**](docs/EventsApi.md#transfereventtocompleted) | **POST** /crm/api/v1/events/{eventId}/transferToCompleted | Transfer an event to the completed/done calendar.
*GatewaysApi* | [**createEquisoftAnalyzeAccess**](docs/GatewaysApi.md#createequisoftanalyzeaccess) | **POST** /crm/api/v1/gateways/equisoftAnalyze/accesses | 
*GatewaysApi* | [**deleteEquisoftAnalyzeAccess**](docs/GatewaysApi.md#deleteequisoftanalyzeaccess) | **DELETE** /crm/api/v1/gateways/equisoftAnalyze/accesses/{accessId} | 
*GatewaysApi* | [**gatewayAdminLogin**](docs/GatewaysApi.md#gatewayadminlogin) | **POST** /crm/api/v1/gateways/credentials-validation/{gatewayName}/admin-credentials/login | 
*GatewaysApi* | [**gatewayCredentials**](docs/GatewaysApi.md#gatewaycredentials) | **GET** /crm/api/v1/gateways/credentials-validation/{gatewayId}/credentials/{status} | 
*GatewaysApi* | [**listAssetBookCredentials**](docs/GatewaysApi.md#listassetbookcredentials) | **GET** /crm/api/v1/gateways/assetbook/credentials | 
*GatewaysApi* | [**listEquisoftAnalyzeAccesses**](docs/GatewaysApi.md#listequisoftanalyzeaccesses) | **GET** /crm/api/v1/gateways/equisoftAnalyze/accesses | 
*GatewaysApi* | [**listGatewayConfigurations**](docs/GatewaysApi.md#listgatewayconfigurations) | **GET** /crm/api/v1/gateways/generic/{gatewayName}/configuration | 
*GatewaysApi* | [**listGenericCredentials**](docs/GatewaysApi.md#listgenericcredentials) | **GET** /crm/api/v1/gateways/generic/{gatewayName}/credentials | 
*GatewaysApi* | [**patchEquisoftAnalyzeAccess**](docs/GatewaysApi.md#patchequisoftanalyzeaccess) | **PATCH** /crm/api/v1/gateways/equisoftAnalyze/accesses/{accessId} | 
*LegacyDocumentApi* | [**addDocument**](docs/LegacyDocumentApi.md#adddocument) | **POST** /apps/api/kronos.document.add | Create a new document.
*LegacyDocumentApi* | [**deleteDocument**](docs/LegacyDocumentApi.md#deletedocument) | **POST** /apps/api/kronos.document.delete | Delete a document and it's related files.
*LegacyDocumentApi* | [**deleteDocumentFile**](docs/LegacyDocumentApi.md#deletedocumentfile) | **POST** /apps/api/kronos.document.deleteFile | Delete one file from a document
*LegacyDocumentApi* | [**downloadDocumentFile**](docs/LegacyDocumentApi.md#downloaddocumentfile) | **GET** /apps/api/kronos.document.downloadFile | Download a file. File data is encoded in base64.
*LegacyDocumentApi* | [**getDocument**](docs/LegacyDocumentApi.md#getdocument) | **GET** /apps/api/kronos.document.get | Get all data for a document record.
*LegacyDocumentApi* | [**getDocumentList**](docs/LegacyDocumentApi.md#getdocumentlist) | **GET** /apps/api/kronos.document.getList | Get a list of all documents. This will return basic information about the document.
*LegacyDocumentApi* | [**updateDocument**](docs/LegacyDocumentApi.md#updatedocument) | **POST** /apps/api/kronos.document.update | Update a document.
*LegacyDocumentApi* | [**uploadDocumentFile**](docs/LegacyDocumentApi.md#uploaddocumentfile) | **POST** /apps/api/kronos.document.uploadFile | Upload a new file in a document
*LegacyProvisioningApi* | [**getOrganization**](docs/LegacyProvisioningApi.md#getorganization) | **GET** /apps/provisioning/kronos.provisioning.getOrganization | Get all informations about an organization.
*LegacyProvisioningApi* | [**getOrganizationList**](docs/LegacyProvisioningApi.md#getorganizationlist) | **GET** /apps/provisioning/kronos.provisioning.getOrganizationList | List all organizations
*MovementApi* | [**addMovement**](docs/MovementApi.md#addmovement) | **POST** /crm/api/v1/movements | 
*MovementApi* | [**cancelMovement**](docs/MovementApi.md#cancelmovement) | **POST** /crm/api/v1/movements/{movementId}/cancel | 
*MovementApi* | [**deleteMovement**](docs/MovementApi.md#deletemovement) | **DELETE** /crm/api/v1/movements/{movementId} | 
*MovementApi* | [**getMovementStatus**](docs/MovementApi.md#getmovementstatus) | **GET** /crm/api/v1/movements/{movementId}/status | 
*MovementApi* | [**listMovements**](docs/MovementApi.md#listmovements) | **GET** /crm/api/v1/movements | 
*MxApi* | [**validateRecipients**](docs/MxApi.md#validaterecipients) | **POST** /crm/api/app/mail/validateRecipients | Validate recipients
*TasksApi* | [**archiveTaskInternalNote**](docs/TasksApi.md#archivetaskinternalnote) | **POST** /crm/api/v1/tasks/{taskId}/notes/{noteId}/archive | Archive an internal note for a task.
*TasksApi* | [**createTask**](docs/TasksApi.md#createtask) | **POST** /crm/api/v1/tasks | Create a task.
*TasksApi* | [**createTaskInternalNote**](docs/TasksApi.md#createtaskinternalnote) | **POST** /crm/api/v1/tasks/{taskId}/notes | Add an internal note to a task.
*TasksApi* | [**deleteTask**](docs/TasksApi.md#deletetask) | **DELETE** /crm/api/v1/tasks/{taskId} | Delete a task.
*TasksApi* | [**getTask**](docs/TasksApi.md#gettask) | **GET** /crm/api/v1/tasks/{taskId} | Return the detail of a task.
*TasksApi* | [**getTaskInternalNoteList**](docs/TasksApi.md#gettaskinternalnotelist) | **GET** /crm/api/v1/tasks/{taskId}/notes | Get the internal notes list for a task.
*TasksApi* | [**listTasks**](docs/TasksApi.md#listtasks) | **GET** /crm/api/v1/tasks | List or search tasks.
*TasksApi* | [**patchTask**](docs/TasksApi.md#patchtask) | **PATCH** /crm/api/v1/tasks/{taskId} | Partially update a task.
*TasksApi* | [**patchTaskInternalNote**](docs/TasksApi.md#patchtaskinternalnote) | **PATCH** /crm/api/v1/tasks/{taskId}/notes/{noteId} | Add an internal note to a task.
*TasksApi* | [**restoreTaskInternalNote**](docs/TasksApi.md#restoretaskinternalnote) | **POST** /crm/api/v1/tasks/{taskId}/notes/{noteId}/restore | Restore an archived internal note for a task.
*TasksApi* | [**transferTaskToCompleted**](docs/TasksApi.md#transfertasktocompleted) | **POST** /crm/api/v1/tasks/{taskId}/transferToCompleted | Transfer a task to completed/done.
*UsersApi* | [**getCurrentUser**](docs/UsersApi.md#getcurrentuser) | **GET** /crm/api/v1/users/me | Get informations about the current user
*UsersApi* | [**getUserContext**](docs/UsersApi.md#getusercontext) | **GET** /crm/api/v1/context | Get user context metadata.


<a name="documentation-for-models"></a>
## Documentation for Models

 - [equisoft/openapi.models.AccessRights](docs/AccessRights.md)
 - [equisoft/openapi.models.CalendarDefaultCalendarId](docs/CalendarDefaultCalendarId.md)
 - [equisoft/openapi.models.CalendarsCalendar](docs/CalendarsCalendar.md)
 - [equisoft/openapi.models.CalendarsListCalendarResponse](docs/CalendarsListCalendarResponse.md)
 - [equisoft/openapi.models.Contextactor](docs/Contextactor.md)
 - [equisoft/openapi.models.ContextequisoftConnect](docs/ContextequisoftConnect.md)
 - [equisoft/openapi.models.ContextequisoftConnectUser](docs/ContextequisoftConnectUser.md)
 - [equisoft/openapi.models.Contextinstance](docs/Contextinstance.md)
 - [equisoft/openapi.models.Contextpreferences](docs/Contextpreferences.md)
 - [equisoft/openapi.models.Contextuser](docs/Contextuser.md)
 - [equisoft/openapi.models.ContextuserContext](docs/ContextuserContext.md)
 - [equisoft/openapi.models.DateOrDateTime](docs/DateOrDateTime.md)
 - [equisoft/openapi.models.ErrorResponse](docs/ErrorResponse.md)
 - [equisoft/openapi.models.EventsCreateEventPayload](docs/EventsCreateEventPayload.md)
 - [equisoft/openapi.models.EventsCreateEventResponse](docs/EventsCreateEventResponse.md)
 - [equisoft/openapi.models.EventsEvent](docs/EventsEvent.md)
 - [equisoft/openapi.models.EventsEventType](docs/EventsEventType.md)
 - [equisoft/openapi.models.EventsGetEventInstancesResponse](docs/EventsGetEventInstancesResponse.md)
 - [equisoft/openapi.models.EventsListEventResponse](docs/EventsListEventResponse.md)
 - [equisoft/openapi.models.EventsOrderByType](docs/EventsOrderByType.md)
 - [equisoft/openapi.models.EventsPatchEventPayload](docs/EventsPatchEventPayload.md)
 - [equisoft/openapi.models.EventsPatchEventResponse](docs/EventsPatchEventResponse.md)
 - [equisoft/openapi.models.EventsTransferToCompletedResponse](docs/EventsTransferToCompletedResponse.md)
 - [equisoft/openapi.models.EventsVisibilityType](docs/EventsVisibilityType.md)
 - [equisoft/openapi.models.FieldValue](docs/FieldValue.md)
 - [equisoft/openapi.models.GatewaysAccessesEquisoftAnalyzeAccessAllOf](docs/GatewaysAccessesEquisoftAnalyzeAccessAllOf.md)
 - [equisoft/openapi.models.GatewaysCredentials](docs/GatewaysCredentials.md)
 - [equisoft/openapi.models.GatewaysCredentialsWithSsn](docs/GatewaysCredentialsWithSsn.md)
 - [equisoft/openapi.models.GatewaysCredentialsWithSsnAllOf](docs/GatewaysCredentialsWithSsnAllOf.md)
 - [equisoft/openapi.models.GatewaysGatewayName](docs/GatewaysGatewayName.md)
 - [equisoft/openapi.models.GatewaysGatewayType](docs/GatewaysGatewayType.md)
 - [equisoft/openapi.models.GatewaysListCredentialsResponse](docs/GatewaysListCredentialsResponse.md)
 - [equisoft/openapi.models.GatewaysaccessesAccess](docs/GatewaysaccessesAccess.md)
 - [equisoft/openapi.models.GatewaysaccessesAdminCredential](docs/GatewaysaccessesAdminCredential.md)
 - [equisoft/openapi.models.GatewaysaccessesAdminCredentialsResponse](docs/GatewaysaccessesAdminCredentialsResponse.md)
 - [equisoft/openapi.models.GatewaysaccessesCreateAccessResponse](docs/GatewaysaccessesCreateAccessResponse.md)
 - [equisoft/openapi.models.GatewaysaccessesCreateEquisoftAnalyzeAccessPayload](docs/GatewaysaccessesCreateEquisoftAnalyzeAccessPayload.md)
 - [equisoft/openapi.models.GatewaysaccessesEquisoftAnalyzeAccess](docs/GatewaysaccessesEquisoftAnalyzeAccess.md)
 - [equisoft/openapi.models.GatewaysaccessesListGatewayAccessesResponse](docs/GatewaysaccessesListGatewayAccessesResponse.md)
 - [equisoft/openapi.models.GatewaysaccessesPatchEquisoftAnalyzeAccessPayload](docs/GatewaysaccessesPatchEquisoftAnalyzeAccessPayload.md)
 - [equisoft/openapi.models.GatewaysaccessesUser](docs/GatewaysaccessesUser.md)
 - [equisoft/openapi.models.GatewaysaccessesvalidationCredentialDto](docs/GatewaysaccessesvalidationCredentialDto.md)
 - [equisoft/openapi.models.GatewaysaccessesvalidationCredentialsResponse](docs/GatewaysaccessesvalidationCredentialsResponse.md)
 - [equisoft/openapi.models.Handlersoauth2assetbookAssetBookTokenPostBody](docs/Handlersoauth2assetbookAssetBookTokenPostBody.md)
 - [equisoft/openapi.models.InternalNotesAuthor](docs/InternalNotesAuthor.md)
 - [equisoft/openapi.models.InternalNotesCreateNotePayload](docs/InternalNotesCreateNotePayload.md)
 - [equisoft/openapi.models.InternalNotesCreateNoteResponse](docs/InternalNotesCreateNoteResponse.md)
 - [equisoft/openapi.models.InternalNotesHistoryType](docs/InternalNotesHistoryType.md)
 - [equisoft/openapi.models.InternalNotesLegacyNote](docs/InternalNotesLegacyNote.md)
 - [equisoft/openapi.models.InternalNotesNote](docs/InternalNotesNote.md)
 - [equisoft/openapi.models.InternalNotesNoteList](docs/InternalNotesNoteList.md)
 - [equisoft/openapi.models.InternalNotesNoteRevision](docs/InternalNotesNoteRevision.md)
 - [equisoft/openapi.models.InternalNotesNoteRevisionType](docs/InternalNotesNoteRevisionType.md)
 - [equisoft/openapi.models.InternalNotesPatchNotePayload](docs/InternalNotesPatchNotePayload.md)
 - [equisoft/openapi.models.InternalNotesPatchNoteResponse](docs/InternalNotesPatchNoteResponse.md)
 - [equisoft/openapi.models.LegacyAddUpdateItem](docs/LegacyAddUpdateItem.md)
 - [equisoft/openapi.models.LegacyAddUpdateResponse](docs/LegacyAddUpdateResponse.md)
 - [equisoft/openapi.models.LegacyAddUpdateResponseAllOf](docs/LegacyAddUpdateResponseAllOf.md)
 - [equisoft/openapi.models.LegacyContactContactPayloadItemAllOf](docs/LegacyContactContactPayloadItemAllOf.md)
 - [equisoft/openapi.models.LegacyDocumentBase64FilePayloadItemAllOf](docs/LegacyDocumentBase64FilePayloadItemAllOf.md)
 - [equisoft/openapi.models.LegacyDocumentDownloadFileResponseAllOf](docs/LegacyDocumentDownloadFileResponseAllOf.md)
 - [equisoft/openapi.models.LegacyDocumentGetListResponseAllOf](docs/LegacyDocumentGetListResponseAllOf.md)
 - [equisoft/openapi.models.LegacyDocumentGetResponseAllOf](docs/LegacyDocumentGetResponseAllOf.md)
 - [equisoft/openapi.models.LegacyProvisioningGetOrganizationListResponseAllOf](docs/LegacyProvisioningGetOrganizationListResponseAllOf.md)
 - [equisoft/openapi.models.LegacyProvisioningGetOrganizationResponseAllOf](docs/LegacyProvisioningGetOrganizationResponseAllOf.md)
 - [equisoft/openapi.models.LegacyResponse](docs/LegacyResponse.md)
 - [equisoft/openapi.models.LegacyUser](docs/LegacyUser.md)
 - [equisoft/openapi.models.LegacycontactAddress](docs/LegacycontactAddress.md)
 - [equisoft/openapi.models.LegacycontactContact](docs/LegacycontactContact.md)
 - [equisoft/openapi.models.LegacycontactContactPayloadItem](docs/LegacycontactContactPayloadItem.md)
 - [equisoft/openapi.models.LegacydocumentBase64FilePayload](docs/LegacydocumentBase64FilePayload.md)
 - [equisoft/openapi.models.LegacydocumentBase64FilePayloadItem](docs/LegacydocumentBase64FilePayloadItem.md)
 - [equisoft/openapi.models.LegacydocumentDocument](docs/LegacydocumentDocument.md)
 - [equisoft/openapi.models.LegacydocumentDocumentListItem](docs/LegacydocumentDocumentListItem.md)
 - [equisoft/openapi.models.LegacydocumentDocumentPayload](docs/LegacydocumentDocumentPayload.md)
 - [equisoft/openapi.models.LegacydocumentDocumentPayloadItem](docs/LegacydocumentDocumentPayloadItem.md)
 - [equisoft/openapi.models.LegacydocumentDocumentPayloadRequest](docs/LegacydocumentDocumentPayloadRequest.md)
 - [equisoft/openapi.models.LegacydocumentDownloadFileResponse](docs/LegacydocumentDownloadFileResponse.md)
 - [equisoft/openapi.models.LegacydocumentFile](docs/LegacydocumentFile.md)
 - [equisoft/openapi.models.LegacydocumentGetListOptions](docs/LegacydocumentGetListOptions.md)
 - [equisoft/openapi.models.LegacydocumentGetListResponse](docs/LegacydocumentGetListResponse.md)
 - [equisoft/openapi.models.LegacydocumentGetResponse](docs/LegacydocumentGetResponse.md)
 - [equisoft/openapi.models.LegacydocumentUploadDocumentFileRequest](docs/LegacydocumentUploadDocumentFileRequest.md)
 - [equisoft/openapi.models.LegacyprovisioningGetOrganizationListResponse](docs/LegacyprovisioningGetOrganizationListResponse.md)
 - [equisoft/openapi.models.LegacyprovisioningGetOrganizationResponse](docs/LegacyprovisioningGetOrganizationResponse.md)
 - [equisoft/openapi.models.LegacyprovisioningGroupItem](docs/LegacyprovisioningGroupItem.md)
 - [equisoft/openapi.models.LegacyprovisioningOrganizationItem](docs/LegacyprovisioningOrganizationItem.md)
 - [equisoft/openapi.models.LegacyprovisioningUserIdentifier](docs/LegacyprovisioningUserIdentifier.md)
 - [equisoft/openapi.models.LegacyprovisioningUserItem](docs/LegacyprovisioningUserItem.md)
 - [equisoft/openapi.models.LegacyprovisioningUserPayload](docs/LegacyprovisioningUserPayload.md)
 - [equisoft/openapi.models.MovementAddMovementResponse](docs/MovementAddMovementResponse.md)
 - [equisoft/openapi.models.MovementClientBaseUsingDistributionListMovement](docs/MovementClientBaseUsingDistributionListMovement.md)
 - [equisoft/openapi.models.MovementClientBaseUsingDistributionListMovementAllOf](docs/MovementClientBaseUsingDistributionListMovementAllOf.md)
 - [equisoft/openapi.models.MovementClientBaseUsingDistributionListMovementPayload](docs/MovementClientBaseUsingDistributionListMovementPayload.md)
 - [equisoft/openapi.models.MovementClientBaseUsingDistributionListMovementPayloadAllOf](docs/MovementClientBaseUsingDistributionListMovementPayloadAllOf.md)
 - [equisoft/openapi.models.MovementClientBaseUsingFileMovement](docs/MovementClientBaseUsingFileMovement.md)
 - [equisoft/openapi.models.MovementClientBaseUsingFileMovementAllOf](docs/MovementClientBaseUsingFileMovementAllOf.md)
 - [equisoft/openapi.models.MovementClientBaseUsingFileMovementPayload](docs/MovementClientBaseUsingFileMovementPayload.md)
 - [equisoft/openapi.models.MovementClientBaseUsingFileMovementPayloadAllOf](docs/MovementClientBaseUsingFileMovementPayloadAllOf.md)
 - [equisoft/openapi.models.MovementCopyMovement](docs/MovementCopyMovement.md)
 - [equisoft/openapi.models.MovementCopyMovementAllOf](docs/MovementCopyMovementAllOf.md)
 - [equisoft/openapi.models.MovementCopyMovementPayload](docs/MovementCopyMovementPayload.md)
 - [equisoft/openapi.models.MovementCopyMovementPayloadAllOf](docs/MovementCopyMovementPayloadAllOf.md)
 - [equisoft/openapi.models.MovementDatabase](docs/MovementDatabase.md)
 - [equisoft/openapi.models.MovementDistributionList](docs/MovementDistributionList.md)
 - [equisoft/openapi.models.MovementGatewayAccessCode](docs/MovementGatewayAccessCode.md)
 - [equisoft/openapi.models.MovementGetStatusResponse](docs/MovementGetStatusResponse.md)
 - [equisoft/openapi.models.MovementListMovementResponse](docs/MovementListMovementResponse.md)
 - [equisoft/openapi.models.MovementMoveMovement](docs/MovementMoveMovement.md)
 - [equisoft/openapi.models.MovementMoveMovementAllOf](docs/MovementMoveMovementAllOf.md)
 - [equisoft/openapi.models.MovementMoveMovementPayload](docs/MovementMoveMovementPayload.md)
 - [equisoft/openapi.models.MovementMoveMovementPayloadAllOf](docs/MovementMoveMovementPayloadAllOf.md)
 - [equisoft/openapi.models.MovementMovement](docs/MovementMovement.md)
 - [equisoft/openapi.models.MovementMovementPayload](docs/MovementMovementPayload.md)
 - [equisoft/openapi.models.MovementMovementStatus](docs/MovementMovementStatus.md)
 - [equisoft/openapi.models.MovementMovementType](docs/MovementMovementType.md)
 - [equisoft/openapi.models.MovementReassignmentMovement](docs/MovementReassignmentMovement.md)
 - [equisoft/openapi.models.MovementReassignmentMovementAllOf](docs/MovementReassignmentMovementAllOf.md)
 - [equisoft/openapi.models.MovementReassignmentMovementPayload](docs/MovementReassignmentMovementPayload.md)
 - [equisoft/openapi.models.MovementReassignmentMovementPayloadAllOf](docs/MovementReassignmentMovementPayloadAllOf.md)
 - [equisoft/openapi.models.MovementTransferOption](docs/MovementTransferOption.md)
 - [equisoft/openapi.models.MovementUser](docs/MovementUser.md)
 - [equisoft/openapi.models.MovementUserTuple](docs/MovementUserTuple.md)
 - [equisoft/openapi.models.MovementUserTuplePayload](docs/MovementUserTuplePayload.md)
 - [equisoft/openapi.models.MovementValidationError](docs/MovementValidationError.md)
 - [equisoft/openapi.models.MovementValidationErrorResponse](docs/MovementValidationErrorResponse.md)
 - [equisoft/openapi.models.Mxrecipient](docs/Mxrecipient.md)
 - [equisoft/openapi.models.MxrecipientsPayload](docs/MxrecipientsPayload.md)
 - [equisoft/openapi.models.MxvalidateRecipientsResponse](docs/MxvalidateRecipientsResponse.md)
 - [equisoft/openapi.models.TasksCreateTaskPayload](docs/TasksCreateTaskPayload.md)
 - [equisoft/openapi.models.TasksCreateTaskResponse](docs/TasksCreateTaskResponse.md)
 - [equisoft/openapi.models.TasksDueDateFilter](docs/TasksDueDateFilter.md)
 - [equisoft/openapi.models.TasksListTaskResponse](docs/TasksListTaskResponse.md)
 - [equisoft/openapi.models.TasksOrderByType](docs/TasksOrderByType.md)
 - [equisoft/openapi.models.TasksPatchTaskPayload](docs/TasksPatchTaskPayload.md)
 - [equisoft/openapi.models.TasksPatchTaskResponse](docs/TasksPatchTaskResponse.md)
 - [equisoft/openapi.models.TasksTask](docs/TasksTask.md)
 - [equisoft/openapi.models.TasksTransferToCompletedResponse](docs/TasksTransferToCompletedResponse.md)
 - [equisoft/openapi.models.TasksVisibilityType](docs/TasksVisibilityType.md)
 - [equisoft/openapi.models.UsersUser](docs/UsersUser.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="OAuth2"></a>
### OAuth2

- **Type**: OAuth
- **Flow**: implicit
- **Authorization URL**: https://secure.kronos-web.com/oauth/authorize
- **Scopes**: 
  - crm:contact: Read/Write access on contacts
  - crm:event: Read/Write access on events
  - crm:task: Read/Write access on tasks
  - crm:document: Read/Write access on documents

