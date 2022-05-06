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
 * @param id Unique Identifier
 * @param main If the address is the main address or not (true|false)
 * @param postal If the address is the postal address or not (true|false)
 * @param type Address type (HOME, OFFICE, HOME2, OTHER, Custom Type Label)
 * @param typeId Address type fieldValue id
 * @param line1 First line of address of the contact
 * @param line2 second line of address of the contact
 * @param city city of the contact
 * @param stateProvince state or province of the contact
 * @param country country of the contact
 * @param postalCode postalCode of the contact
 * @param civicNumber Industrielle Alliance Only
 * @param road Industrielle Alliance Only
 * @param extType Industrielle Alliance Only
 * @param extNumber Industrielle Alliance Only
 * @param notes 
 * @param locked address is locked or not (true or false)
 */

data class LegacycontactAddress (

    /* Unique Identifier */
    @Json(name = "id")
    val id: kotlin.Int? = null,

    /* If the address is the main address or not (true|false) */
    @Json(name = "main")
    val main: kotlin.String? = null,

    /* If the address is the postal address or not (true|false) */
    @Json(name = "postal")
    val postal: kotlin.String? = null,

    /* Address type (HOME, OFFICE, HOME2, OTHER, Custom Type Label) */
    @Json(name = "type")
    val type: kotlin.String? = null,

    /* Address type fieldValue id */
    @Json(name = "typeId")
    val typeId: kotlin.Int? = null,

    /* First line of address of the contact */
    @Json(name = "line1")
    val line1: kotlin.String? = null,

    /* second line of address of the contact */
    @Json(name = "line2")
    val line2: kotlin.String? = null,

    /* city of the contact */
    @Json(name = "city")
    val city: kotlin.String? = null,

    /* state or province of the contact */
    @Json(name = "stateProvince")
    val stateProvince: kotlin.String? = null,

    /* country of the contact */
    @Json(name = "country")
    val country: kotlin.String? = null,

    /* postalCode of the contact */
    @Json(name = "postalCode")
    val postalCode: kotlin.String? = null,

    /* Industrielle Alliance Only */
    @Json(name = "civicNumber")
    val civicNumber: kotlin.String? = null,

    /* Industrielle Alliance Only */
    @Json(name = "road")
    val road: kotlin.String? = null,

    /* Industrielle Alliance Only */
    @Json(name = "extType")
    val extType: kotlin.String? = null,

    /* Industrielle Alliance Only */
    @Json(name = "extNumber")
    val extNumber: kotlin.String? = null,

    @Json(name = "notes")
    val notes: kotlin.String? = null,

    /* address is locked or not (true or false) */
    @Json(name = "locked")
    val locked: kotlin.String? = null

)

