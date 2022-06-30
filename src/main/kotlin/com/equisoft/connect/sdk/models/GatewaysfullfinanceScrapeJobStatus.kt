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
 * Values: UNKNOWN,NEW,QUEUED,LOGIN,MFA,RUNNING,COMPLETED
 */

enum class GatewaysfullfinanceScrapeJobStatus(val value: kotlin.String) {

    @Json(name = "UNKNOWN")
    UNKNOWN("UNKNOWN"),

    @Json(name = "NEW")
    NEW("NEW"),

    @Json(name = "QUEUED")
    QUEUED("QUEUED"),

    @Json(name = "LOGIN")
    LOGIN("LOGIN"),

    @Json(name = "MFA")
    MFA("MFA"),

    @Json(name = "RUNNING")
    RUNNING("RUNNING"),

    @Json(name = "COMPLETED")
    COMPLETED("COMPLETED");

    /**
     * Override toString() to avoid using the enum variable name as the value, and instead use
     * the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different, and ensures that
     * the client sends the correct enum values to the server always.
     */
    override fun toString(): String = value

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null otherwise.
         */
        fun encode(data: Any?): kotlin.String? = if (data is GatewaysfullfinanceScrapeJobStatus) "$data" else null

        /**
         * Returns a valid [GatewaysfullfinanceScrapeJobStatus] for [data], null otherwise.
         */
        fun decode(data: Any?): GatewaysfullfinanceScrapeJobStatus? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

