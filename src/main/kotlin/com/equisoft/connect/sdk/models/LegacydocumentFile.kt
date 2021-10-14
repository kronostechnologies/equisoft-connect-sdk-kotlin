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


import com.squareup.moshi.Json

/**
 * 
 *
 * @param id id of the file
 * @param fileName File name
 * @param mimeType Mime Type of the file
 * @param sizeBytes Size of the file(in bytes)
 */

data class LegacydocumentFile (

    /* id of the file */
    @Json(name = "id")
    val id: kotlin.String? = null,

    /* File name */
    @Json(name = "fileName")
    val fileName: kotlin.String? = null,

    /* Mime Type of the file */
    @Json(name = "mimeType")
    val mimeType: kotlin.String? = null,

    /* Size of the file(in bytes) */
    @Json(name = "sizeBytes")
    val sizeBytes: kotlin.String? = null

)

