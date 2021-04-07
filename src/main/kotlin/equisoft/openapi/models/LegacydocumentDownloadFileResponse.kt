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

import equisoft/openapi.models.LegacyDocumentDownloadFileResponseAllOf
import equisoft/openapi.models.LegacyResponse
import equisoft/openapi.models.LegacydocumentBase64FilePayloadItem

import com.squareup.moshi.Json

/**
 * 
 * @param files Array of documents
 * @param stat Status of the request that has been made. Can be 'ok' or 'fail'
 * @param errorCode If the request has failed, this element will contain the error code related to the problem encountered.
 * @param errorMsg If the request has failed, this element will contain the error message related to the problem encountered.
 */

data class LegacydocumentDownloadFileResponse (
    /* Array of documents */
    @Json(name = "files")
    val files: kotlin.collections.List<LegacydocumentBase64FilePayloadItem>,
    /* Status of the request that has been made. Can be 'ok' or 'fail' */
    @Json(name = "stat")
    val stat: kotlin.String? = null,
    /* If the request has failed, this element will contain the error code related to the problem encountered. */
    @Json(name = "error_code")
    val errorCode: kotlin.String? = null,
    /* If the request has failed, this element will contain the error message related to the problem encountered. */
    @Json(name = "error_msg")
    val errorMsg: kotlin.String? = null
)

