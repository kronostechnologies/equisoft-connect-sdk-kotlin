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
 * @param sourceDatabase 
 * @param sourceUser 
 * @param sourceDistributionList 
 * @param destinationDatabase 
 * @param destinationUser 
 * @param datagatewayAccessMappings 
 * @param transferOption 
 * @param type 
 */

data class MovementClientBaseUsingDistributionListMovementPayloadAllOf (

    @Json(name = "sourceDatabase")
    val sourceDatabase: kotlin.String? = null,

    @Json(name = "sourceUser")
    val sourceUser: kotlin.String? = null,

    @Json(name = "sourceDistributionList")
    val sourceDistributionList: kotlin.String? = null,

    @Json(name = "destinationDatabase")
    val destinationDatabase: kotlin.String? = null,

    @Json(name = "destinationUser")
    val destinationUser: kotlin.String? = null,

    @Json(name = "datagatewayAccessMappings")
    val datagatewayAccessMappings: kotlin.collections.Map<kotlin.String, kotlin.String>? = null,

    @Json(name = "transferOption")
    val transferOption: kotlin.String? = null,

    @Json(name = "type")
    val type: MovementClientBaseUsingDistributionListMovementPayloadAllOf.Type? = null

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

