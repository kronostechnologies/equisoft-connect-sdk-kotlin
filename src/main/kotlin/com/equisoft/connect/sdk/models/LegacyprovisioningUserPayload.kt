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

import com.equisoft.connect.sdk.models.LegacycontactAddress
import com.equisoft.connect.sdk.models.LegacyprovisioningUserIdentifier

import com.squareup.moshi.Json

/**
 * 
 *
 * @param firstName First name
 * @param lastName Last name
 * @param email Email address used for login
 * @param lang User language. Organisation default lang will be used if not provided. Accepts FR or EN.
 * @param role User role. Accepts USER or ADMIN
 * @param concurrentAccess Number of allowed concurrent accesses with this user. Default 1.
 * @param password User initial password. A random password will be set if none is specified and noPassword option is not used.
 * @param noPassword Disable password authentication. Accepts true or false. Default false
 * @param requirePasswordChange The user will be ask to define a new password on the first login Accepts true or false. Default true
 * @param enableMobile Enable Mobile version. Deprecated: the mobile is not enabled per user anymore. Accepts true or false. Default false
 * @param externalIdentifiers List of identifier to uniquely identify the user.
 * @param allowDelegation Allow the user to delegate access to his data Accepts true or false. Default false
 * @param gender Gender of this user. Accepts M or F.
 * @param phoneWork Work phone number of this user
 * @param phoneWorkExtension Extension of work phone number of this user.
 * @param phoneHome Home phone number of this user.
 * @param phoneCell Cellphone number of this user.
 * @param phoneFax Fax phone number of this user.
 * @param phoneMain The phone type to be the main phone number. Accepts fax, cell, home, work. Default work
 * @param address Address of this user.
 * @param noFNA Accepts true or false. Default false
 */

data class LegacyprovisioningUserPayload (

    /* First name */
    @Json(name = "firstName")
    val firstName: kotlin.String? = null,

    /* Last name */
    @Json(name = "lastName")
    val lastName: kotlin.String? = null,

    /* Email address used for login */
    @Json(name = "email")
    val email: kotlin.String? = null,

    /* User language. Organisation default lang will be used if not provided. Accepts FR or EN. */
    @Json(name = "lang")
    val lang: kotlin.String? = null,

    /* User role. Accepts USER or ADMIN */
    @Json(name = "role")
    val role: kotlin.String? = null,

    /* Number of allowed concurrent accesses with this user. Default 1. */
    @Json(name = "concurrentAccess")
    val concurrentAccess: kotlin.Int? = null,

    /* User initial password. A random password will be set if none is specified and noPassword option is not used. */
    @Json(name = "password")
    val password: kotlin.String? = null,

    /* Disable password authentication. Accepts true or false. Default false */
    @Json(name = "noPassword")
    val noPassword: kotlin.String? = null,

    /* The user will be ask to define a new password on the first login Accepts true or false. Default true */
    @Json(name = "requirePasswordChange")
    val requirePasswordChange: kotlin.String? = null,

    /* Enable Mobile version. Deprecated: the mobile is not enabled per user anymore. Accepts true or false. Default false */
    @Json(name = "enableMobile")
    val enableMobile: kotlin.String? = null,

    /* List of identifier to uniquely identify the user. */
    @Json(name = "externalIdentifiers")
    val externalIdentifiers: kotlin.collections.List<LegacyprovisioningUserIdentifier>? = null,

    /* Allow the user to delegate access to his data Accepts true or false. Default false */
    @Json(name = "allowDelegation")
    val allowDelegation: kotlin.String? = null,

    /* Gender of this user. Accepts M or F. */
    @Json(name = "gender")
    val gender: kotlin.String? = null,

    /* Work phone number of this user */
    @Json(name = "phoneWork")
    val phoneWork: kotlin.String? = null,

    /* Extension of work phone number of this user. */
    @Json(name = "phoneWorkExtension")
    val phoneWorkExtension: kotlin.String? = null,

    /* Home phone number of this user. */
    @Json(name = "phoneHome")
    val phoneHome: kotlin.String? = null,

    /* Cellphone number of this user. */
    @Json(name = "phoneCell")
    val phoneCell: kotlin.String? = null,

    /* Fax phone number of this user. */
    @Json(name = "phoneFax")
    val phoneFax: kotlin.String? = null,

    /* The phone type to be the main phone number. Accepts fax, cell, home, work. Default work */
    @Json(name = "phoneMain")
    val phoneMain: kotlin.String? = null,

    /* Address of this user. */
    @Json(name = "address")
    val address: kotlin.collections.List<LegacycontactAddress>? = null,

    /* Accepts true or false. Default false */
    @Json(name = "noFNA")
    val noFNA: kotlin.String? = null

)

