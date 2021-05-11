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

import com.equisoft.connect.sdk.models.LegacyprovisioningUserItem

import com.squareup.moshi.Json

/**
 * 
 * @param orgId Unique identifier for the organization
 * @param displayName Organization Name
 * @param status Organization status In creation, Active, Maintenance
 * @param diskUsageQuota Organization disk usage quota. Deprecated. Always empty.
 * @param lang Default language
 * @param mainPhone Organization main phone number
 * @param tollFree Organization tollFree phone number
 * @param fax Organization fax phone number
 * @param address Organization address first line
 * @param addressLine2 Organization address second line
 * @param addressCity Organization address city
 * @param addressState Organization address state/province
 * @param addressPostalCode Organization address postal code
 * @param addressCountry Organization address country
 * @param webSite Organization website url
 * @param isMultiUser Is the organization in single user mode or mutil user mode
 * @param fnaStatus Is FNA enabled for the organization
 * @param users Organization users
 */

data class LegacyprovisioningOrganizationItem (
    /* Unique identifier for the organization */
    @Json(name = "orgId")
    val orgId: kotlin.String? = null,
    /* Organization Name */
    @Json(name = "displayName")
    val displayName: kotlin.String? = null,
    /* Organization status In creation, Active, Maintenance */
    @Json(name = "status")
    val status: kotlin.String? = null,
    /* Organization disk usage quota. Deprecated. Always empty. */
    @Json(name = "diskUsageQuota")
    val diskUsageQuota: kotlin.String? = null,
    /* Default language */
    @Json(name = "lang")
    val lang: kotlin.String? = null,
    /* Organization main phone number */
    @Json(name = "mainPhone")
    val mainPhone: kotlin.String? = null,
    /* Organization tollFree phone number */
    @Json(name = "tollFree")
    val tollFree: kotlin.String? = null,
    /* Organization fax phone number */
    @Json(name = "fax")
    val fax: kotlin.String? = null,
    /* Organization address first line */
    @Json(name = "address")
    val address: kotlin.String? = null,
    /* Organization address second line */
    @Json(name = "addressLine2")
    val addressLine2: kotlin.String? = null,
    /* Organization address city */
    @Json(name = "addressCity")
    val addressCity: kotlin.String? = null,
    /* Organization address state/province */
    @Json(name = "addressState")
    val addressState: kotlin.String? = null,
    /* Organization address postal code */
    @Json(name = "addressPostalCode")
    val addressPostalCode: kotlin.String? = null,
    /* Organization address country */
    @Json(name = "addressCountry")
    val addressCountry: kotlin.String? = null,
    /* Organization website url */
    @Json(name = "webSite")
    val webSite: kotlin.String? = null,
    /* Is the organization in single user mode or mutil user mode */
    @Json(name = "isMultiUser")
    val isMultiUser: kotlin.String? = null,
    /* Is FNA enabled for the organization */
    @Json(name = "fnaStatus")
    val fnaStatus: kotlin.String? = null,
    /* Organization users */
    @Json(name = "users")
    val users: kotlin.collections.List<LegacyprovisioningUserItem>? = null
)

