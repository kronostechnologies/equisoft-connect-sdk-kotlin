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
 * @param nameFr French name
 * @param nameEn English name
 * @param network SFL|DFSI|DFSIN|VMD
 * @param code Code
 */

data class DsfFinancialCenterPayload (
    /* French name */
    @Json(name = "nameFr")
    val nameFr: kotlin.String,
    /* English name */
    @Json(name = "nameEn")
    val nameEn: kotlin.String,
    /* SFL|DFSI|DFSIN|VMD */
    @Json(name = "network")
    val network: kotlin.String,
    /* Code */
    @Json(name = "code")
    val code: kotlin.String? = null
)

