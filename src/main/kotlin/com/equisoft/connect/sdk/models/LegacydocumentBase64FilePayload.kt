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

import com.equisoft.connect.sdk.models.LegacydocumentBase64FilePayloadItem

import com.squareup.moshi.Json

/**
 * Payload needed by the kronos.document.uploadFile method {@example uploadFilePayload.xml} payload example
 *
 * @param files 
 */

data class LegacydocumentBase64FilePayload (

    @Json(name = "files")
    val files: kotlin.collections.List<LegacydocumentBase64FilePayloadItem>? = null

)

