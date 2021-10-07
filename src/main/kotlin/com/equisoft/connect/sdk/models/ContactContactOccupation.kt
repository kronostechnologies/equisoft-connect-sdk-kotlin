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
package com.equisoft.connect.sdk.models


import com.squareup.moshi.Json

/**
 * 
 * @param id 
 * @param occupation 
 * @param employer 
 * @param startDate 
 * @param endDate 
 */

data class ContactContactOccupation (
    @Json(name = "id")
    val id: kotlin.Int? = null,
    @Json(name = "occupation")
    val occupation: kotlin.String? = null,
    @Json(name = "employer")
    val employer: kotlin.String? = null,
    @Json(name = "startDate")
    val startDate: java.time.LocalDate? = null,
    @Json(name = "endDate")
    val endDate: java.time.LocalDate? = null
)

