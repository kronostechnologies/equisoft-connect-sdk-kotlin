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

import com.equisoft.connect.sdk.models.MovementCopyMovementAllOf
import com.equisoft.connect.sdk.models.MovementDatabase
import com.equisoft.connect.sdk.models.MovementMovement
import com.equisoft.connect.sdk.models.MovementUser
import com.equisoft.connect.sdk.models.MovementUserTuple

import com.squareup.moshi.Json

/**
 * 
 *
 * @param type 
 * @param sourceDatabase 
 * @param destinationDatabase 
 * @param userTuples 
 * @param id 
 * @param status 
 * @param availableAction 
 * @param scheduledDate 
 * @param processedDate 
 * @param addedDate 
 * @param addedBy 
 * @param cancelledDate 
 * @param cancelledBy 
 */

data class MovementCopyMovement (

    @Json(name = "type")
    val type: MovementCopyMovement.Type = Type.COPY,

    @Json(name = "sourceDatabase")
    val sourceDatabase: MovementDatabase,

    @Json(name = "destinationDatabase")
    val destinationDatabase: MovementDatabase,

    @Json(name = "userTuples")
    val userTuples: kotlin.collections.List<MovementUserTuple>,

    @Json(name = "id")
    override val id: kotlin.Int? = null,

    @Json(name = "status")
    override val status: kotlin.String? = null,

    @Json(name = "availableAction")
    override val availableAction: kotlin.String? = null,

    @Json(name = "scheduledDate")
    override val scheduledDate: kotlin.String? = null,

    @Json(name = "processedDate")
    override val processedDate: kotlin.String? = null,

    @Json(name = "addedDate")
    override val addedDate: kotlin.String? = null,

    @Json(name = "addedBy")
    override val addedBy: MovementUser? = null,

    @Json(name = "cancelledDate")
    override val cancelledDate: kotlin.String? = null,

    @Json(name = "cancelledBy")
    override val cancelledBy: MovementUser? = null

) : MovementMovement {

    /**
     * 
     *
     * Values: COPY
     */
    enum class Type(val value: kotlin.String) {
        @Json(name = "COPY") COPY("COPY");
    }
}

