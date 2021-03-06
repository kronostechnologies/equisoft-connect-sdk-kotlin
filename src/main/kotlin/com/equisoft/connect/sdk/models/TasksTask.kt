/**
 * Equisoft /connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: latest
 * 
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package com.equisoft.connect.sdk.models

import com.equisoft.connect.sdk.models.AccessRights
import com.equisoft.connect.sdk.models.FieldValue

import com.squareup.moshi.Json

/**
 * 
 *
 * @param id Unique numerical identifier.
 * @param subject Subject/Title of the Event.
 * @param isCompleted Is the task completed/done.
 * @param accessRights 
 * @param dueDate Date the task is expected to be done. As defined by full-date - RFC3339
 * @param initialDate Date the task was initially started. As defined by full-date - RFC3339
 * @param completedDate Date the task was completed / done. As defined by full-date - RFC3339
 * @param description Public description of the Event.
 * @param internalNotes Internal notes on the Event. Not synced on remote sources.
 * @param category 
 * @param subCategory Event sub category
 * @param priority Importance/Priority of an event or task. 5 is the most important.
 * @param visibility Confidentiality level of the Event (private or not). [NORMAL, PRIVATE]
 * @param creationTime Creation time. As defined by date-time - RFC3339
 * @param updateTime Date time of last modification. As defined by date-time - RFC3339
 * @param completionTime Completion time. As defined by date-time - RFC3339
 * @param contactIds IDs of the contacts linked to this Task
 */

data class TasksTask (

    /* Unique numerical identifier. */
    @Json(name = "id")
    val id: kotlin.String,

    /* Subject/Title of the Event. */
    @Json(name = "subject")
    val subject: kotlin.String,

    /* Is the task completed/done. */
    @Json(name = "isCompleted")
    val isCompleted: kotlin.Boolean,

    @Json(name = "accessRights")
    val accessRights: AccessRights,

    /* Date the task is expected to be done. As defined by full-date - RFC3339 */
    @Json(name = "dueDate")
    val dueDate: kotlin.String? = null,

    /* Date the task was initially started. As defined by full-date - RFC3339 */
    @Json(name = "initialDate")
    val initialDate: kotlin.String? = null,

    /* Date the task was completed / done. As defined by full-date - RFC3339 */
    @Json(name = "completedDate")
    val completedDate: kotlin.String? = null,

    /* Public description of the Event. */
    @Json(name = "description")
    val description: kotlin.String? = null,

    /* Internal notes on the Event. Not synced on remote sources. */
    @Json(name = "internalNotes")
    val internalNotes: kotlin.String? = null,

    @Json(name = "category")
    val category: FieldValue? = null,

    /* Event sub category */
    @Json(name = "subCategory")
    val subCategory: kotlin.Any? = null,

    /* Importance/Priority of an event or task. 5 is the most important. */
    @Json(name = "priority")
    val priority: kotlin.Int? = null,

    /* Confidentiality level of the Event (private or not). [NORMAL, PRIVATE] */
    @Json(name = "visibility")
    val visibility: kotlin.String? = null,

    /* Creation time. As defined by date-time - RFC3339 */
    @Json(name = "creationTime")
    val creationTime: java.time.OffsetDateTime? = null,

    /* Date time of last modification. As defined by date-time - RFC3339 */
    @Json(name = "updateTime")
    val updateTime: java.time.OffsetDateTime? = null,

    /* Completion time. As defined by date-time - RFC3339 */
    @Json(name = "completionTime")
    val completionTime: java.time.OffsetDateTime? = null,

    /* IDs of the contacts linked to this Task */
    @Json(name = "contactIds")
    val contactIds: kotlin.collections.List<kotlin.Int>? = null

)

