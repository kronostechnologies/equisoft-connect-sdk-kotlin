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
import com.equisoft.connect.sdk.models.MovementDistributionList
import com.equisoft.connect.sdk.models.MovementUser

import com.squareup.moshi.Json

/**
 * 
 *
 * @param sourceDatabase 
 * @param sourceUser 
 * @param sourceDistributionList 
 * @param destinationDatabase 
 * @param destinationUser 
 * @param datagatewayAccessMappings 
 * @param transferOption 
 * @param type 
 */

data class MovementClientBaseUsingDistributionListMovementAllOf (

    @Json(name = "sourceDatabase")
    val sourceDatabase: MovementDatabase? = null,

    @Json(name = "sourceUser")
    val sourceUser: MovementUser? = null,

    @Json(name = "sourceDistributionList")
    val sourceDistributionList: MovementDistributionList? = null,

    @Json(name = "destinationDatabase")
    val destinationDatabase: MovementDatabase? = null,

    @Json(name = "destinationUser")
    val destinationUser: MovementUser? = null,

    @Json(name = "datagatewayAccessMappings")
    val datagatewayAccessMappings: kotlin.collections.Map<kotlin.String, kotlin.String>? = null,

    @Json(name = "transferOption")
    val transferOption: kotlin.String? = null,

    @Json(name = "type")
    val type: MovementClientBaseUsingDistributionListMovementAllOf.Type? = Type.CLIENTBASE_USING_DISTLIST

) {

    /**
     * 
     *
     * Values: CLIENTBASE_USING_DISTLIST
     */
    enum class Type(val value: kotlin.String) {
        @Json(name = "CLIENTBASE_USING_DISTLIST") CLIENTBASE_USING_DISTLIST("CLIENTBASE_USING_DISTLIST");
    }
}

