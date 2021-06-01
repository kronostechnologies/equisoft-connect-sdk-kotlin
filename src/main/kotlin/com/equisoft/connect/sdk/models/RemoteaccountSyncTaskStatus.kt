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
 * @param uid UID of the sync job
 * @param status Status of the sync Job
 */

data class RemoteaccountSyncTaskStatus (
    /* UID of the sync job */
    @Json(name = "uid")
    val uid: kotlin.String? = null,
    /* Status of the sync Job */
    @Json(name = "status")
    val status: kotlin.String? = null
)

