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


import com.squareup.moshi.Json

/**
 * 
 * @param id Unique numerical identifier of the updated task.
 */

data class TasksPatchTaskResponse (
    /* Unique numerical identifier of the updated task. */
    @Json(name = "id")
    val id: kotlin.String
)

