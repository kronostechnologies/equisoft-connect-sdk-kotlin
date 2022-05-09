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

import com.equisoft.connect.sdk.models.MovementClientBaseUsingFileMovementPayloadAllOf
import com.equisoft.connect.sdk.models.MovementMovementPayload

import com.squareup.moshi.Json

/**
 * 
 *
 * @param sourceDatabase 
 * @param sourceUser 
 * @param destinationDatabase 
 * @param destinationUser 
 * @param type 
 * @param capsilFile 
 * @param univerisFile 
 * @param dataphileFile 
 * @param date 
 * @param now 
 */

data class MovementClientBaseUsingFileMovementPayload (

    @Json(name = "sourceDatabase")
    val sourceDatabase: kotlin.String,

    @Json(name = "sourceUser")
    val sourceUser: kotlin.String,

    @Json(name = "destinationDatabase")
    val destinationDatabase: kotlin.String,

    @Json(name = "destinationUser")
    val destinationUser: kotlin.String,

    @Json(name = "type")
    val type: MovementClientBaseUsingFileMovementPayload.Type = Type.CLIENTBASE_USING_FILE,

    @Json(name = "capsilFile")
    val capsilFile: kotlin.String? = null,

    @Json(name = "univerisFile")
    val univerisFile: kotlin.String? = null,

    @Json(name = "dataphileFile")
    val dataphileFile: kotlin.String? = null,

    @Json(name = "date")
    override val date: kotlin.String? = null,

    @Json(name = "now")
    override val now: kotlin.Boolean? = null

) : MovementMovementPayload {

    /**
     * 
     *
     * Values: CLIENTBASE_USING_FILE
     */
    enum class Type(val value: kotlin.String) {
        @Json(name = "CLIENTBASE_USING_FILE") CLIENTBASE_USING_FILE("CLIENTBASE_USING_FILE");
    }
}

