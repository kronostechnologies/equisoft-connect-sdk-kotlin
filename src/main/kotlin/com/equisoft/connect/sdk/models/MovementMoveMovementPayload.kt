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

import com.equisoft.connect.sdk.models.MovementMoveMovementPayloadAllOf
import com.equisoft.connect.sdk.models.MovementMovementPayload

import com.squareup.moshi.Json

/**
 * 
 *
 * @param sourceDatabase 
 * @param destinationDatabase 
 * @param users 
 * @param type 
 * @param date 
 * @param now 
 */

data class MovementMoveMovementPayload (

    @Json(name = "sourceDatabase")
    val sourceDatabase: kotlin.String,

    @Json(name = "destinationDatabase")
    val destinationDatabase: kotlin.String,

    @Json(name = "users")
    val users: kotlin.collections.List<kotlin.String>,

    @Json(name = "type")
    val type: MovementMoveMovementPayload.Type = Type.MOVE,

    @Json(name = "date")
    override val date: kotlin.String? = null,

    @Json(name = "now")
    override val now: kotlin.Boolean? = null

) : MovementMovementPayload {

    /**
     * 
     *
     * Values: MOVE
     */
    enum class Type(val value: kotlin.String) {
        @Json(name = "MOVE") MOVE("MOVE");
    }
}

