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

import com.equisoft.connect.sdk.models.InternalNotesLegacyNote
import com.equisoft.connect.sdk.models.InternalNotesNote

import com.squareup.moshi.Json

/**
 * 
 *
 * @param notes 
 * @param legacyNote 
 */

data class InternalNotesNoteList (

    @Json(name = "notes")
    val notes: kotlin.collections.List<InternalNotesNote>,

    @Json(name = "legacyNote")
    val legacyNote: InternalNotesLegacyNote? = null

)

