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

import com.equisoft.connect.sdk.models.LegacyAddUpdateItem

import com.squareup.moshi.Json

/**
 * 
 *
 * @param items List all items status for the Add or Update operation
 */

data class LegacyAddUpdateResponseAllOf (

    /* List all items status for the Add or Update operation */
    @Json(name = "items")
    val items: kotlin.collections.List<LegacyAddUpdateItem>? = null

)

