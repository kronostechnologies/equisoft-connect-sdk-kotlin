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
import com.equisoft.connect.sdk.models.MovementUser

import com.squareup.moshi.Json

/**
 * 
 *
 * @param sourceDatabase 
 * @param destinationDatabase 
 * @param users 
 * @param type 
 */

data class MovementMoveMovementAllOf (

    @Json(name = "sourceDatabase")
    val sourceDatabase: MovementDatabase? = null,

    @Json(name = "destinationDatabase")
    val destinationDatabase: MovementDatabase? = null,

    @Json(name = "users")
    val users: kotlin.collections.List<MovementUser>? = null,

    @Json(name = "type")
    val type: MovementMoveMovementAllOf.Type? = Type.MOVE

) {

    /**
     * 
     *
     * Values: MOVE
     */
    enum class Type(val value: kotlin.String) {
        @Json(name = "MOVE") MOVE("MOVE");
    }
}

