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

import com.equisoft.connect.sdk.models.DateOrDateTime

import com.squareup.moshi.Json

/**
 * 
 *
 * @param subject Subject/Title of the Event.
 * @param start 
 * @param end 
 * @param allDay Indicate if the event is an all-day event or a timed event.
 * @param initialDate Date the Event was initially scheduled. As defined by full-date - RFC3339
 * @param description Public description of the Event.
 * @param internalNotes Internal notes on the Event. Not synced on remote sources.
 * @param location Location of the event in free-text form.
 * @param type Event type (CALL, LETTER, MEETING, VACATION, FILE, NOTE)
 * @param categoryId ID of the field value to use as category.
 * @param subCategoryId ID of the field value to use as sub-category.
 * @param priority Importance/Priority of an event or task. 5 is the most important.
 * @param visibility Confidentiality level of the Event (private or not). [NORMAL, PRIVATE]
 * @param contactIds Allow to link the event to one or many contacts.
 */

data class EventsPatchEventPayload (

    /* Subject/Title of the Event. */
    @Json(name = "subject")
    val subject: kotlin.String? = null,

    @Json(name = "start")
    val start: DateOrDateTime? = null,

    @Json(name = "end")
    val end: DateOrDateTime? = null,

    /* Indicate if the event is an all-day event or a timed event. */
    @Json(name = "allDay")
    val allDay: kotlin.Boolean? = null,

    /* Date the Event was initially scheduled. As defined by full-date - RFC3339 */
    @Json(name = "initialDate")
    val initialDate: kotlin.String? = null,

    /* Public description of the Event. */
    @Json(name = "description")
    val description: kotlin.String? = null,

    /* Internal notes on the Event. Not synced on remote sources. */
    @Json(name = "internalNotes")
    val internalNotes: kotlin.String? = null,

    /* Location of the event in free-text form. */
    @Json(name = "location")
    val location: kotlin.String? = null,

    /* Event type (CALL, LETTER, MEETING, VACATION, FILE, NOTE) */
    @Json(name = "type")
    val type: kotlin.String? = null,

    /* ID of the field value to use as category. */
    @Json(name = "categoryId")
    val categoryId: kotlin.Int? = null,

    /* ID of the field value to use as sub-category. */
    @Json(name = "subCategoryId")
    val subCategoryId: kotlin.Int? = null,

    /* Importance/Priority of an event or task. 5 is the most important. */
    @Json(name = "priority")
    val priority: kotlin.Int? = null,

    /* Confidentiality level of the Event (private or not). [NORMAL, PRIVATE] */
    @Json(name = "visibility")
    val visibility: kotlin.String? = null,

    /* Allow to link the event to one or many contacts. */
    @Json(name = "contactIds")
    val contactIds: kotlin.collections.List<kotlin.Int>? = null

)

