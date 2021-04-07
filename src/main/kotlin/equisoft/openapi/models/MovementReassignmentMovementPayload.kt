/**
* Equisoft /connect API
* No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
*
* The version of the OpenAPI document: latest
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package equisoft/openapi.models

import equisoft/openapi.models.MovementMovementPayload
import equisoft/openapi.models.MovementReassignmentMovementPayloadAllOf

import com.squareup.moshi.Json

/**
 * 
 * @param type 
 * @param sourceDatabase 
 * @param sourceUser 
 * @param destinationUser 
 * @param accessCode 
 * @param date 
 * @param now 
 */

data class MovementReassignmentMovementPayload (
    @Json(name = "type")
    val type: MovementReassignmentMovementPayload.Type,
    @Json(name = "sourceDatabase")
    val sourceDatabase: kotlin.String,
    @Json(name = "sourceUser")
    val sourceUser: kotlin.String,
    @Json(name = "destinationUser")
    val destinationUser: kotlin.String,
    @Json(name = "accessCode")
    val accessCode: kotlin.String,
    @Json(name = "date")
    override val date: kotlin.String? = null,
    @Json(name = "now")
    override val now: kotlin.Boolean? = null
) : MovementMovementPayload {

    /**
     * 
     * Values: rEASSIGNMENT
     */
    enum class Type(val value: kotlin.String) {
        @Json(name = "REASSIGNMENT") rEASSIGNMENT("REASSIGNMENT");
    }
}

