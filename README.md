# com.equisoft.connect.sdk - Kotlin client library for Equisoft /connect API

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
*ContactsApi* | [**getByUuid**](docs/ContactsApi.md#getbyuuid) | **GET** /crm/api/v1/contacts/{contactUuid} | Return the detail of a contact.
*DSFApi* | [**createDsfFinancialCenter**](docs/DSFApi.md#createdsffinancialcenter) | **POST** /crm/api/v1/dsf/financialCenters | 
*DSFApi* | [**deleteDsfFinancialCenter**](docs/DSFApi.md#deletedsffinancialcenter) | **DELETE** /crm/api/v1/dsf/financialCenters/{financialCenterId} | 
*DSFApi* | [**getDsfFinancialCenters**](docs/DSFApi.md#getdsffinancialcenters) | **GET** /crm/api/v1/dsf/financialCenters/{financialCenterId} | 
*DSFApi* | [**listDsfFinancialCenters**](docs/DSFApi.md#listdsffinancialcenters) | **GET** /crm/api/v1/dsf/financialCenters | 
*DSFApi* | [**updateDsfFinancialCenter**](docs/DSFApi.md#updatedsffinancialcenter) | **POST** /crm/api/v1/dsf/financialCenters/{financialCenterId} | 
*DatabasesApi* | [**getUser**](docs/DatabasesApi.md#getuser) | **GET** /crm/api/v1/databases/{uuid}/users/{id} | 
*DatabasesApi* | [**listDatabases**](docs/DatabasesApi.md#listdatabases) | **GET** /crm/api/v1/databases | 
*DatabasesApi* | [**listUsers**](docs/DatabasesApi.md#listusers) | **GET** /crm/api/v1/databases/{uuid}/users | 
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
*GatewaysApi* | [**listAssetBookCredentials**](docs/GatewaysApi.md#listassetbookcredentials) | **GET** /crm/api/v1/gateways/assetbook/credentials | 
*GatewaysApi* | [**listCredentials**](docs/GatewaysApi.md#listcredentials) | **GET** /crm/api/v1/gateways/credentials-validation/{gatewayId}/credentials/{status} | 
*GatewaysApi* | [**listEquisoftAnalyzeAccesses**](docs/GatewaysApi.md#listequisoftanalyzeaccesses) | **GET** /crm/api/v1/gateways/equisoftAnalyze/accesses | 
*GatewaysApi* | [**listGatewayConfigurations**](docs/GatewaysApi.md#listgatewayconfigurations) | **GET** /crm/api/v1/gateways/generic/{gatewayName}/configuration | 
*GatewaysApi* | [**listGenericCredentials**](docs/GatewaysApi.md#listgenericcredentials) | **GET** /crm/api/v1/gateways/generic/{gatewayName}/credentials | 
*GatewaysApi* | [**patchEquisoftAnalyzeAccess**](docs/GatewaysApi.md#patchequisoftanalyzeaccess) | **PATCH** /crm/api/v1/gateways/equisoftAnalyze/accesses/{accessId} | 
*GatewaysApi* | [**updateCredentials**](docs/GatewaysApi.md#updatecredentials) | **PUT** /crm/api/v1/gateways/credentials-validation/{gatewayId}/credentials/{status} | 
*IntegrationsApi* | [**downloadLaserAppEnterpriseContactData**](docs/IntegrationsApi.md#downloadlaserappenterprisecontactdata) | **GET** /crm/api/app/integrations/laserapp/enterprise/{contactId} | Download contact data for LaserApp Enterprise.
*IntegrationsApi* | [**redirectContactToLaserAppAnywhere**](docs/IntegrationsApi.md#redirectcontacttolaserappanywhere) | **GET** /crm/api/app/integrations/laserapp/anywhere/{contactId} | Redirect contact to LaserApp Anywhere.
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
*RemoteAccountApi* | [**synchronizeCalendars**](docs/RemoteAccountApi.md#synchronizecalendars) | **POST** /crm/api/agenda/account/calendarSync | Synchronize calendars with remote account
*RemoteAccountApi* | [**synchronizeTasks**](docs/RemoteAccountApi.md#synchronizetasks) | **POST** /crm/api/agenda/account/tasksSync | Synchronize tasks with remote account
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

 - [com.equisoft.connect.sdk.models.AccessRights](docs/AccessRights.md)
 - [com.equisoft.connect.sdk.models.AdminCredentialPayload](docs/AdminCredentialPayload.md)
 - [com.equisoft.connect.sdk.models.AdminCredentialResponse](docs/AdminCredentialResponse.md)
 - [com.equisoft.connect.sdk.models.CalendarDefaultCalendarId](docs/CalendarDefaultCalendarId.md)
 - [com.equisoft.connect.sdk.models.CalendarsCalendar](docs/CalendarsCalendar.md)
 - [com.equisoft.connect.sdk.models.CalendarsListCalendarResponse](docs/CalendarsListCalendarResponse.md)
 - [com.equisoft.connect.sdk.models.ContactContactAdditionalInformation](docs/ContactContactAdditionalInformation.md)
 - [com.equisoft.connect.sdk.models.ContactContactAddress](docs/ContactContactAddress.md)
 - [com.equisoft.connect.sdk.models.ContactContactEmail](docs/ContactContactEmail.md)
 - [com.equisoft.connect.sdk.models.ContactContactIdentification](docs/ContactContactIdentification.md)
 - [com.equisoft.connect.sdk.models.ContactContactMaritalStatus](docs/ContactContactMaritalStatus.md)
 - [com.equisoft.connect.sdk.models.ContactContactOccupation](docs/ContactContactOccupation.md)
 - [com.equisoft.connect.sdk.models.ContactContactPhone](docs/ContactContactPhone.md)
 - [com.equisoft.connect.sdk.models.ContactContactSegmentation](docs/ContactContactSegmentation.md)
 - [com.equisoft.connect.sdk.models.ContactContactWebsite](docs/ContactContactWebsite.md)
 - [com.equisoft.connect.sdk.models.ContactsContact](docs/ContactsContact.md)
 - [com.equisoft.connect.sdk.models.Contextactor](docs/Contextactor.md)
 - [com.equisoft.connect.sdk.models.ContextequisoftConnect](docs/ContextequisoftConnect.md)
 - [com.equisoft.connect.sdk.models.ContextequisoftConnectUser](docs/ContextequisoftConnectUser.md)
 - [com.equisoft.connect.sdk.models.Contextinstance](docs/Contextinstance.md)
 - [com.equisoft.connect.sdk.models.Contextpreferences](docs/Contextpreferences.md)
 - [com.equisoft.connect.sdk.models.Contextuser](docs/Contextuser.md)
 - [com.equisoft.connect.sdk.models.ContextuserContext](docs/ContextuserContext.md)
 - [com.equisoft.connect.sdk.models.CredentialDto](docs/CredentialDto.md)
 - [com.equisoft.connect.sdk.models.CredentialsResponse](docs/CredentialsResponse.md)
 - [com.equisoft.connect.sdk.models.DatabasesDatabase](docs/DatabasesDatabase.md)
 - [com.equisoft.connect.sdk.models.DatabasesListDatabasesResponse](docs/DatabasesListDatabasesResponse.md)
 - [com.equisoft.connect.sdk.models.DateOrDateTime](docs/DateOrDateTime.md)
 - [com.equisoft.connect.sdk.models.DsfCreateOrUpdateFinancialCenterResponse](docs/DsfCreateOrUpdateFinancialCenterResponse.md)
 - [com.equisoft.connect.sdk.models.DsfFinancialCenter](docs/DsfFinancialCenter.md)
 - [com.equisoft.connect.sdk.models.DsfFinancialCenterPayload](docs/DsfFinancialCenterPayload.md)
 - [com.equisoft.connect.sdk.models.DsfListFinancialCenterResponse](docs/DsfListFinancialCenterResponse.md)
 - [com.equisoft.connect.sdk.models.ErrorResponse](docs/ErrorResponse.md)
 - [com.equisoft.connect.sdk.models.EventsCreateEventPayload](docs/EventsCreateEventPayload.md)
 - [com.equisoft.connect.sdk.models.EventsCreateEventResponse](docs/EventsCreateEventResponse.md)
 - [com.equisoft.connect.sdk.models.EventsEvent](docs/EventsEvent.md)
 - [com.equisoft.connect.sdk.models.EventsEventType](docs/EventsEventType.md)
 - [com.equisoft.connect.sdk.models.EventsGetEventInstancesResponse](docs/EventsGetEventInstancesResponse.md)
 - [com.equisoft.connect.sdk.models.EventsListEventResponse](docs/EventsListEventResponse.md)
 - [com.equisoft.connect.sdk.models.EventsOrderByType](docs/EventsOrderByType.md)
 - [com.equisoft.connect.sdk.models.EventsPatchEventPayload](docs/EventsPatchEventPayload.md)
 - [com.equisoft.connect.sdk.models.EventsPatchEventResponse](docs/EventsPatchEventResponse.md)
 - [com.equisoft.connect.sdk.models.EventsTransferToCompletedResponse](docs/EventsTransferToCompletedResponse.md)
 - [com.equisoft.connect.sdk.models.EventsVisibilityType](docs/EventsVisibilityType.md)
 - [com.equisoft.connect.sdk.models.FieldValue](docs/FieldValue.md)
 - [com.equisoft.connect.sdk.models.GatewaysAccessesEquisoftAnalyzeAccessAllOf](docs/GatewaysAccessesEquisoftAnalyzeAccessAllOf.md)
 - [com.equisoft.connect.sdk.models.GatewaysCredentials](docs/GatewaysCredentials.md)
 - [com.equisoft.connect.sdk.models.GatewaysCredentialsWithSsn](docs/GatewaysCredentialsWithSsn.md)
 - [com.equisoft.connect.sdk.models.GatewaysCredentialsWithSsnAllOf](docs/GatewaysCredentialsWithSsnAllOf.md)
 - [com.equisoft.connect.sdk.models.GatewaysGatewayName](docs/GatewaysGatewayName.md)
 - [com.equisoft.connect.sdk.models.GatewaysGatewayType](docs/GatewaysGatewayType.md)
 - [com.equisoft.connect.sdk.models.GatewaysListCredentialsResponse](docs/GatewaysListCredentialsResponse.md)
 - [com.equisoft.connect.sdk.models.GatewaysaccessesAccess](docs/GatewaysaccessesAccess.md)
 - [com.equisoft.connect.sdk.models.GatewaysaccessesCreateAccessResponse](docs/GatewaysaccessesCreateAccessResponse.md)
 - [com.equisoft.connect.sdk.models.GatewaysaccessesCreateEquisoftAnalyzeAccessPayload](docs/GatewaysaccessesCreateEquisoftAnalyzeAccessPayload.md)
 - [com.equisoft.connect.sdk.models.GatewaysaccessesEquisoftAnalyzeAccess](docs/GatewaysaccessesEquisoftAnalyzeAccess.md)
 - [com.equisoft.connect.sdk.models.GatewaysaccessesListGatewayAccessesResponse](docs/GatewaysaccessesListGatewayAccessesResponse.md)
 - [com.equisoft.connect.sdk.models.GatewaysaccessesPatchEquisoftAnalyzeAccessPayload](docs/GatewaysaccessesPatchEquisoftAnalyzeAccessPayload.md)
 - [com.equisoft.connect.sdk.models.GatewaysaccessesUser](docs/GatewaysaccessesUser.md)
 - [com.equisoft.connect.sdk.models.Handlersoauth2assetbookAssetBookTokenPostBody](docs/Handlersoauth2assetbookAssetBookTokenPostBody.md)
 - [com.equisoft.connect.sdk.models.InternalNotesAuthor](docs/InternalNotesAuthor.md)
 - [com.equisoft.connect.sdk.models.InternalNotesCreateNotePayload](docs/InternalNotesCreateNotePayload.md)
 - [com.equisoft.connect.sdk.models.InternalNotesCreateNoteResponse](docs/InternalNotesCreateNoteResponse.md)
 - [com.equisoft.connect.sdk.models.InternalNotesHistoryType](docs/InternalNotesHistoryType.md)
 - [com.equisoft.connect.sdk.models.InternalNotesLegacyNote](docs/InternalNotesLegacyNote.md)
 - [com.equisoft.connect.sdk.models.InternalNotesNote](docs/InternalNotesNote.md)
 - [com.equisoft.connect.sdk.models.InternalNotesNoteList](docs/InternalNotesNoteList.md)
 - [com.equisoft.connect.sdk.models.InternalNotesNoteRevision](docs/InternalNotesNoteRevision.md)
 - [com.equisoft.connect.sdk.models.InternalNotesNoteRevisionType](docs/InternalNotesNoteRevisionType.md)
 - [com.equisoft.connect.sdk.models.InternalNotesPatchNotePayload](docs/InternalNotesPatchNotePayload.md)
 - [com.equisoft.connect.sdk.models.InternalNotesPatchNoteResponse](docs/InternalNotesPatchNoteResponse.md)
 - [com.equisoft.connect.sdk.models.LaserApplaserAppAnywhereError](docs/LaserApplaserAppAnywhereError.md)
 - [com.equisoft.connect.sdk.models.LaserApplaserAppAnywhereResponse](docs/LaserApplaserAppAnywhereResponse.md)
 - [com.equisoft.connect.sdk.models.LegacyAddUpdateItem](docs/LegacyAddUpdateItem.md)
 - [com.equisoft.connect.sdk.models.LegacyAddUpdateResponse](docs/LegacyAddUpdateResponse.md)
 - [com.equisoft.connect.sdk.models.LegacyAddUpdateResponseAllOf](docs/LegacyAddUpdateResponseAllOf.md)
 - [com.equisoft.connect.sdk.models.LegacyContactContactPayloadItemAllOf](docs/LegacyContactContactPayloadItemAllOf.md)
 - [com.equisoft.connect.sdk.models.LegacyDocumentBase64FilePayloadItemAllOf](docs/LegacyDocumentBase64FilePayloadItemAllOf.md)
 - [com.equisoft.connect.sdk.models.LegacyDocumentDownloadFileResponseAllOf](docs/LegacyDocumentDownloadFileResponseAllOf.md)
 - [com.equisoft.connect.sdk.models.LegacyDocumentGetListResponseAllOf](docs/LegacyDocumentGetListResponseAllOf.md)
 - [com.equisoft.connect.sdk.models.LegacyDocumentGetResponseAllOf](docs/LegacyDocumentGetResponseAllOf.md)
 - [com.equisoft.connect.sdk.models.LegacyProvisioningGetOrganizationListResponseAllOf](docs/LegacyProvisioningGetOrganizationListResponseAllOf.md)
 - [com.equisoft.connect.sdk.models.LegacyProvisioningGetOrganizationResponseAllOf](docs/LegacyProvisioningGetOrganizationResponseAllOf.md)
 - [com.equisoft.connect.sdk.models.LegacyResponse](docs/LegacyResponse.md)
 - [com.equisoft.connect.sdk.models.LegacyUser](docs/LegacyUser.md)
 - [com.equisoft.connect.sdk.models.LegacycontactAddress](docs/LegacycontactAddress.md)
 - [com.equisoft.connect.sdk.models.LegacycontactContact](docs/LegacycontactContact.md)
 - [com.equisoft.connect.sdk.models.LegacycontactContactPayloadItem](docs/LegacycontactContactPayloadItem.md)
 - [com.equisoft.connect.sdk.models.LegacydocumentBase64FilePayload](docs/LegacydocumentBase64FilePayload.md)
 - [com.equisoft.connect.sdk.models.LegacydocumentBase64FilePayloadItem](docs/LegacydocumentBase64FilePayloadItem.md)
 - [com.equisoft.connect.sdk.models.LegacydocumentDocument](docs/LegacydocumentDocument.md)
 - [com.equisoft.connect.sdk.models.LegacydocumentDocumentListItem](docs/LegacydocumentDocumentListItem.md)
 - [com.equisoft.connect.sdk.models.LegacydocumentDocumentPayload](docs/LegacydocumentDocumentPayload.md)
 - [com.equisoft.connect.sdk.models.LegacydocumentDocumentPayloadItem](docs/LegacydocumentDocumentPayloadItem.md)
 - [com.equisoft.connect.sdk.models.LegacydocumentDocumentPayloadRequest](docs/LegacydocumentDocumentPayloadRequest.md)
 - [com.equisoft.connect.sdk.models.LegacydocumentDownloadFileResponse](docs/LegacydocumentDownloadFileResponse.md)
 - [com.equisoft.connect.sdk.models.LegacydocumentFile](docs/LegacydocumentFile.md)
 - [com.equisoft.connect.sdk.models.LegacydocumentGetListOptions](docs/LegacydocumentGetListOptions.md)
 - [com.equisoft.connect.sdk.models.LegacydocumentGetListResponse](docs/LegacydocumentGetListResponse.md)
 - [com.equisoft.connect.sdk.models.LegacydocumentGetResponse](docs/LegacydocumentGetResponse.md)
 - [com.equisoft.connect.sdk.models.LegacydocumentUploadDocumentFileRequest](docs/LegacydocumentUploadDocumentFileRequest.md)
 - [com.equisoft.connect.sdk.models.LegacyprovisioningGetOrganizationListResponse](docs/LegacyprovisioningGetOrganizationListResponse.md)
 - [com.equisoft.connect.sdk.models.LegacyprovisioningGetOrganizationResponse](docs/LegacyprovisioningGetOrganizationResponse.md)
 - [com.equisoft.connect.sdk.models.LegacyprovisioningGroupItem](docs/LegacyprovisioningGroupItem.md)
 - [com.equisoft.connect.sdk.models.LegacyprovisioningOrganizationItem](docs/LegacyprovisioningOrganizationItem.md)
 - [com.equisoft.connect.sdk.models.LegacyprovisioningUserIdentifier](docs/LegacyprovisioningUserIdentifier.md)
 - [com.equisoft.connect.sdk.models.LegacyprovisioningUserItem](docs/LegacyprovisioningUserItem.md)
 - [com.equisoft.connect.sdk.models.LegacyprovisioningUserPayload](docs/LegacyprovisioningUserPayload.md)
 - [com.equisoft.connect.sdk.models.MovementAddMovementResponse](docs/MovementAddMovementResponse.md)
 - [com.equisoft.connect.sdk.models.MovementClientBaseUsingDistributionListMovement](docs/MovementClientBaseUsingDistributionListMovement.md)
 - [com.equisoft.connect.sdk.models.MovementClientBaseUsingDistributionListMovementAllOf](docs/MovementClientBaseUsingDistributionListMovementAllOf.md)
 - [com.equisoft.connect.sdk.models.MovementClientBaseUsingDistributionListMovementPayload](docs/MovementClientBaseUsingDistributionListMovementPayload.md)
 - [com.equisoft.connect.sdk.models.MovementClientBaseUsingDistributionListMovementPayloadAllOf](docs/MovementClientBaseUsingDistributionListMovementPayloadAllOf.md)
 - [com.equisoft.connect.sdk.models.MovementClientBaseUsingFileMovement](docs/MovementClientBaseUsingFileMovement.md)
 - [com.equisoft.connect.sdk.models.MovementClientBaseUsingFileMovementAllOf](docs/MovementClientBaseUsingFileMovementAllOf.md)
 - [com.equisoft.connect.sdk.models.MovementClientBaseUsingFileMovementPayload](docs/MovementClientBaseUsingFileMovementPayload.md)
 - [com.equisoft.connect.sdk.models.MovementClientBaseUsingFileMovementPayloadAllOf](docs/MovementClientBaseUsingFileMovementPayloadAllOf.md)
 - [com.equisoft.connect.sdk.models.MovementCopyMovement](docs/MovementCopyMovement.md)
 - [com.equisoft.connect.sdk.models.MovementCopyMovementAllOf](docs/MovementCopyMovementAllOf.md)
 - [com.equisoft.connect.sdk.models.MovementCopyMovementPayload](docs/MovementCopyMovementPayload.md)
 - [com.equisoft.connect.sdk.models.MovementCopyMovementPayloadAllOf](docs/MovementCopyMovementPayloadAllOf.md)
 - [com.equisoft.connect.sdk.models.MovementDatabase](docs/MovementDatabase.md)
 - [com.equisoft.connect.sdk.models.MovementDistributionList](docs/MovementDistributionList.md)
 - [com.equisoft.connect.sdk.models.MovementGatewayAccessCode](docs/MovementGatewayAccessCode.md)
 - [com.equisoft.connect.sdk.models.MovementGetStatusResponse](docs/MovementGetStatusResponse.md)
 - [com.equisoft.connect.sdk.models.MovementListMovementResponse](docs/MovementListMovementResponse.md)
 - [com.equisoft.connect.sdk.models.MovementMoveMovement](docs/MovementMoveMovement.md)
 - [com.equisoft.connect.sdk.models.MovementMoveMovementAllOf](docs/MovementMoveMovementAllOf.md)
 - [com.equisoft.connect.sdk.models.MovementMoveMovementPayload](docs/MovementMoveMovementPayload.md)
 - [com.equisoft.connect.sdk.models.MovementMoveMovementPayloadAllOf](docs/MovementMoveMovementPayloadAllOf.md)
 - [com.equisoft.connect.sdk.models.MovementMovement](docs/MovementMovement.md)
 - [com.equisoft.connect.sdk.models.MovementMovementPayload](docs/MovementMovementPayload.md)
 - [com.equisoft.connect.sdk.models.MovementMovementStatus](docs/MovementMovementStatus.md)
 - [com.equisoft.connect.sdk.models.MovementMovementType](docs/MovementMovementType.md)
 - [com.equisoft.connect.sdk.models.MovementReassignmentMovement](docs/MovementReassignmentMovement.md)
 - [com.equisoft.connect.sdk.models.MovementReassignmentMovementAllOf](docs/MovementReassignmentMovementAllOf.md)
 - [com.equisoft.connect.sdk.models.MovementReassignmentMovementPayload](docs/MovementReassignmentMovementPayload.md)
 - [com.equisoft.connect.sdk.models.MovementReassignmentMovementPayloadAllOf](docs/MovementReassignmentMovementPayloadAllOf.md)
 - [com.equisoft.connect.sdk.models.MovementTransferOption](docs/MovementTransferOption.md)
 - [com.equisoft.connect.sdk.models.MovementUser](docs/MovementUser.md)
 - [com.equisoft.connect.sdk.models.MovementUserTuple](docs/MovementUserTuple.md)
 - [com.equisoft.connect.sdk.models.MovementUserTuplePayload](docs/MovementUserTuplePayload.md)
 - [com.equisoft.connect.sdk.models.MovementValidationError](docs/MovementValidationError.md)
 - [com.equisoft.connect.sdk.models.MovementValidationErrorResponse](docs/MovementValidationErrorResponse.md)
 - [com.equisoft.connect.sdk.models.Mxrecipient](docs/Mxrecipient.md)
 - [com.equisoft.connect.sdk.models.MxrecipientsPayload](docs/MxrecipientsPayload.md)
 - [com.equisoft.connect.sdk.models.MxvalidateRecipientsResponse](docs/MxvalidateRecipientsResponse.md)
 - [com.equisoft.connect.sdk.models.RemoteaccountAccountSyncResponse](docs/RemoteaccountAccountSyncResponse.md)
 - [com.equisoft.connect.sdk.models.RemoteaccountSyncStatus](docs/RemoteaccountSyncStatus.md)
 - [com.equisoft.connect.sdk.models.RemoteaccountSyncTaskStatus](docs/RemoteaccountSyncTaskStatus.md)
 - [com.equisoft.connect.sdk.models.TasksCreateTaskPayload](docs/TasksCreateTaskPayload.md)
 - [com.equisoft.connect.sdk.models.TasksCreateTaskResponse](docs/TasksCreateTaskResponse.md)
 - [com.equisoft.connect.sdk.models.TasksDueDateFilter](docs/TasksDueDateFilter.md)
 - [com.equisoft.connect.sdk.models.TasksListTaskResponse](docs/TasksListTaskResponse.md)
 - [com.equisoft.connect.sdk.models.TasksOrderByType](docs/TasksOrderByType.md)
 - [com.equisoft.connect.sdk.models.TasksPatchTaskPayload](docs/TasksPatchTaskPayload.md)
 - [com.equisoft.connect.sdk.models.TasksPatchTaskResponse](docs/TasksPatchTaskResponse.md)
 - [com.equisoft.connect.sdk.models.TasksTask](docs/TasksTask.md)
 - [com.equisoft.connect.sdk.models.TasksTransferToCompletedResponse](docs/TasksTransferToCompletedResponse.md)
 - [com.equisoft.connect.sdk.models.TasksVisibilityType](docs/TasksVisibilityType.md)
 - [com.equisoft.connect.sdk.models.Translation](docs/Translation.md)
 - [com.equisoft.connect.sdk.models.UsersListUsersResponse](docs/UsersListUsersResponse.md)
 - [com.equisoft.connect.sdk.models.UsersUser](docs/UsersUser.md)


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

