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

import com.equisoft.connect.sdk.models.ContactContactOccupation

import com.squareup.moshi.Json

/**
 * 
 *
 * @param id 
 * @param occupation 
 * @param employer 
 * @param startDate 
 * @param endDate 
 * @param annualIncome 
 */

data class ContactsContactCurrentOccupation (

    @Json(name = "id")
    val id: kotlin.Int? = null,

    @Json(name = "occupation")
    val occupation: kotlin.String? = null,

    @Json(name = "employer")
    val employer: kotlin.String? = null,

    @Json(name = "startDate")
    val startDate: java.time.LocalDate? = null,

    @Json(name = "endDate")
    val endDate: java.time.LocalDate? = null,

    @Json(name = "annualIncome")
    val annualIncome: kotlin.Float? = null

)

