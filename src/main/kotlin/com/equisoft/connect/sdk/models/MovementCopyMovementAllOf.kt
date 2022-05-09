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

import com.equisoft.connect.sdk.models.MovementDatabase
import com.equisoft.connect.sdk.models.MovementUserTuple

import com.squareup.moshi.Json

/**
 * 
 *
 * @param type 
 * @param sourceDatabase 
 * @param destinationDatabase 
 * @param userTuples 
 */

data class MovementCopyMovementAllOf (

    @Json(name = "type")
    val type: MovementCopyMovementAllOf.Type = Type.COPY,

    @Json(name = "sourceDatabase")
    val sourceDatabase: MovementDatabase,

    @Json(name = "destinationDatabase")
    val destinationDatabase: MovementDatabase,

    @Json(name = "userTuples")
    val userTuples: kotlin.collections.List<MovementUserTuple>

) {

    /**
     * 
     *
     * Values: COPY
     */
    enum class Type(val value: kotlin.String) {
        @Json(name = "COPY") COPY("COPY");
    }
}

