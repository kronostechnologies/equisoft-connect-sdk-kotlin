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

import equisoft/openapi.models.LegacyDocumentBase64FilePayloadItemAllOf
import equisoft/openapi.models.LegacydocumentFile

import com.squareup.moshi.Json

/**
 * 
 * @param id id of the file
 * @param fileName File name
 * @param mimeType Mime Type of the file
 * @param sizeBytes Size of the file(in bytes)
 * @param externalKey The file external key
 * @param base64EncodedData file data encoded in base 64
 */

data class LegacydocumentBase64FilePayloadItem (
    /* id of the file */
    @Json(name = "id")
    val id: kotlin.String? = null,
    /* File name */
    @Json(name = "fileName")
    val fileName: kotlin.String? = null,
    /* Mime Type of the file */
    @Json(name = "mimeType")
    val mimeType: kotlin.String? = null,
    /* Size of the file(in bytes) */
    @Json(name = "sizeBytes")
    val sizeBytes: kotlin.String? = null,
    /* The file external key */
    @Json(name = "externalKey")
    val externalKey: kotlin.String? = null,
    /* file data encoded in base 64 */
    @Json(name = "base64EncodedData")
    val base64EncodedData: kotlin.String? = null
)

