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

import equisoft/openapi.models.MovementValidationError

import com.squareup.moshi.Json

/**
 * 
 * @param errors 
 */

data class MovementValidationErrorResponse (
    @Json(name = "errors")
    val errors: kotlin.collections.Map<kotlin.String, MovementValidationError>? = null
)

