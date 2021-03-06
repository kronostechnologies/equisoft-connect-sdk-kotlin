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
 * @param id id of the added item
 * @param externalKey External key assigned to the item
 * @param result Status of the Add or Update command (\"inserted\" | \"updated\")
 */

data class LegacyAddUpdateItem (

    /* id of the added item */
    @Json(name = "id")
    val id: kotlin.String? = null,

    /* External key assigned to the item */
    @Json(name = "externalKey")
    val externalKey: kotlin.String? = null,

    /* Status of the Add or Update command (\"inserted\" | \"updated\") */
    @Json(name = "result")
    val result: kotlin.String? = null

)

