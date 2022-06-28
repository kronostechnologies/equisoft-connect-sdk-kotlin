/**
 * Equisoft /connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: latest
 * 
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package com.equisoft.connect.sdk

import java.io.IOException
import okhttp3.OkHttpClient

import com.equisoft.connect.sdk.models.ContactsContact
import com.equisoft.connect.sdk.models.ErrorResponse

import com.squareup.moshi.Json

import com.equisoft.connect.sdk.infrastructure.ApiClient
import com.equisoft.connect.sdk.infrastructure.ApiResponse
import com.equisoft.connect.sdk.infrastructure.ClientException
import com.equisoft.connect.sdk.infrastructure.ClientError
import com.equisoft.connect.sdk.infrastructure.ServerException
import com.equisoft.connect.sdk.infrastructure.ServerError
import com.equisoft.connect.sdk.infrastructure.MultiValueMap
import com.equisoft.connect.sdk.infrastructure.PartConfig
import com.equisoft.connect.sdk.infrastructure.RequestConfig
import com.equisoft.connect.sdk.infrastructure.RequestMethod
import com.equisoft.connect.sdk.infrastructure.ResponseType
import com.equisoft.connect.sdk.infrastructure.Success
import com.equisoft.connect.sdk.infrastructure.toMultiValue

class ContactsApi(
    basePath: kotlin.String = defaultBasePath,
    accessToken: String? = null,
    client: OkHttpClient = ApiClient.defaultClient
) : ApiClient(basePath, accessToken, client) {

    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "http://localhost")
        }
    }

    /**
     * Return the detail of a contact.
     * 
     * @param contactUuid Contact unique identifier.
     * @param acceptLanguage Specify preferred language for returned data. Format is https://tools.ietf.org/html/rfc3282 (optional)
     * @return ContactsContact
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getByUuid(contactUuid: kotlin.String, acceptLanguage: kotlin.String? = null) : ContactsContact {
        val localVarResponse = getByUuidWithHttpInfo(contactUuid = contactUuid, acceptLanguage = acceptLanguage)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as ContactsContact
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Return the detail of a contact.
     * 
     * @param contactUuid Contact unique identifier.
     * @param acceptLanguage Specify preferred language for returned data. Format is https://tools.ietf.org/html/rfc3282 (optional)
     * @return ApiResponse<ContactsContact?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun getByUuidWithHttpInfo(contactUuid: kotlin.String, acceptLanguage: kotlin.String?) : ApiResponse<ContactsContact?> {
        val localVariableConfig = getByUuidRequestConfig(contactUuid = contactUuid, acceptLanguage = acceptLanguage)

        return request<Unit, ContactsContact>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getByUuid
     *
     * @param contactUuid Contact unique identifier.
     * @param acceptLanguage Specify preferred language for returned data. Format is https://tools.ietf.org/html/rfc3282 (optional)
     * @return RequestConfig
     */
    fun getByUuidRequestConfig(contactUuid: kotlin.String, acceptLanguage: kotlin.String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        acceptLanguage?.apply { localVariableHeaders["Accept-Language"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/crm/api/v1/contacts/{contactUuid}".replace("{"+"contactUuid"+"}", "$contactUuid"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

}
