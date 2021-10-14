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
 * @param id 
 * @param url 
 * @param isMain 
 */

data class ContactContactWebsite (

    @Json(name = "id")
    val id: kotlin.Int? = null,

    @Json(name = "url")
    val url: kotlin.String? = null,

    @Json(name = "isMain")
    val isMain: kotlin.Boolean? = null

)

