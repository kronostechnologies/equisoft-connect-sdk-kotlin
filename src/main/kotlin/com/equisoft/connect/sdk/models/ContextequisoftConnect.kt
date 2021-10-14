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

import com.equisoft.connect.sdk.models.ContextequisoftConnectUser
import com.equisoft.connect.sdk.models.Contextinstance
import com.equisoft.connect.sdk.models.Contextpreferences

import com.squareup.moshi.Json

/**
 * 
 *
 * @param profile $profile
 * @param appVersion $appVersion
 * @param instance 
 * @param user 
 * @param preferences 
 */

data class ContextequisoftConnect (

    /* $profile */
    @Json(name = "profile")
    val profile: kotlin.String,

    /* $appVersion */
    @Json(name = "appVersion")
    val appVersion: kotlin.String,

    @Json(name = "instance")
    val instance: Contextinstance,

    @Json(name = "user")
    val user: ContextequisoftConnectUser,

    @Json(name = "preferences")
    val preferences: Contextpreferences

)

