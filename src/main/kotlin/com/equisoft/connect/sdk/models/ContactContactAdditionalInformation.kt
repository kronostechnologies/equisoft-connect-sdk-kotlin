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
 * @param isDeceased 
 * @param deceasedDate 
 * @param isSmoker 
 * @param smokerEndDate 
 * @param birthDate 
 */

data class ContactContactAdditionalInformation (

    @Json(name = "isDeceased")
    val isDeceased: kotlin.Boolean? = null,

    @Json(name = "deceasedDate")
    val deceasedDate: java.time.LocalDate? = null,

    @Json(name = "isSmoker")
    val isSmoker: kotlin.Boolean? = null,

    @Json(name = "smokerEndDate")
    val smokerEndDate: java.time.LocalDate? = null,

    @Json(name = "birthDate")
    val birthDate: java.time.LocalDate? = null

)
