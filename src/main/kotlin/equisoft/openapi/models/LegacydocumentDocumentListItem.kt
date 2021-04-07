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

import equisoft/openapi.models.LegacydocumentFile

import com.squareup.moshi.Json

/**
 * 
 * @param id id of the document
 * @param files Files contained inside the document
 * @param type type of the document
 * @param subType subtype of the document
 * @param name name of the document
 */

data class LegacydocumentDocumentListItem (
    /* id of the document */
    @Json(name = "id")
    val id: kotlin.String? = null,
    /* Files contained inside the document */
    @Json(name = "files")
    val files: kotlin.collections.List<LegacydocumentFile>? = null,
    /* type of the document */
    @Json(name = "type")
    val type: kotlin.String? = null,
    /* subtype of the document */
    @Json(name = "subType")
    val subType: kotlin.String? = null,
    /* name of the document */
    @Json(name = "name")
    val name: kotlin.String? = null
)

