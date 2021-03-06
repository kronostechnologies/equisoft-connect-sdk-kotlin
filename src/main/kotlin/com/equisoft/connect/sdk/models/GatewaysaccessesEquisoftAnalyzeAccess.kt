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

import com.equisoft.connect.sdk.models.GatewaysaccessesUser

import com.squareup.moshi.Json

/**
 * 
 *
 * @param id 
 * @param users 
 * @param clientKey 
 * @param version 
 */

data class GatewaysaccessesEquisoftAnalyzeAccess (

    @Json(name = "id")
    val id: kotlin.Int,

    @Json(name = "users")
    val users: kotlin.collections.List<GatewaysaccessesUser>,

    @Json(name = "clientKey")
    val clientKey: kotlin.String,

    @Json(name = "version")
    val version: GatewaysaccessesEquisoftAnalyzeAccess.Version = Version.NATIVE

) {

    /**
     * 
     *
     * Values: NATIVE,LEGACY
     */
    enum class Version(val value: kotlin.String) {
        @Json(name = "NATIVE") NATIVE("NATIVE"),
        @Json(name = "LEGACY") LEGACY("LEGACY");
    }
}

