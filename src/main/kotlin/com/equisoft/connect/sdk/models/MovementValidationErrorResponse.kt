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

import com.equisoft.connect.sdk.models.MovementValidationError

import com.squareup.moshi.Json

/**
 * 
 *
 * @param errors 
 */

data class MovementValidationErrorResponse (

    @Json(name = "errors")
    val errors: kotlin.collections.Map<kotlin.String, MovementValidationError>? = null

)

