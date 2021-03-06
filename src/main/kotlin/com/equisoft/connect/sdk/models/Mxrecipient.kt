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
 * @param id id
 * @param contactId contactId
 * @param email email
 * @param screenName screenName
 */

data class Mxrecipient (

    /* id */
    @Json(name = "id")
    val id: kotlin.String,

    /* contactId */
    @Json(name = "contactId")
    val contactId: kotlin.String,

    /* email */
    @Json(name = "email")
    val email: kotlin.String,

    /* screenName */
    @Json(name = "screenName")
    val screenName: kotlin.String

)

