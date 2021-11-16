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

import com.equisoft.connect.sdk.models.LegacyResponse
import com.equisoft.connect.sdk.models.LegacyfinanceGetLiabilitiesResponse
import com.equisoft.connect.sdk.models.LegacyfinancegetAccountStatementResponse

import com.equisoft.connect.sdk.infrastructure.ApiClient
import com.equisoft.connect.sdk.infrastructure.ClientException
import com.equisoft.connect.sdk.infrastructure.ClientError
import com.equisoft.connect.sdk.infrastructure.ServerException
import com.equisoft.connect.sdk.infrastructure.ServerError
import com.equisoft.connect.sdk.infrastructure.MultiValueMap
import com.equisoft.connect.sdk.infrastructure.RequestConfig
import com.equisoft.connect.sdk.infrastructure.RequestMethod
import com.equisoft.connect.sdk.infrastructure.ResponseType
import com.equisoft.connect.sdk.infrastructure.Success
import com.equisoft.connect.sdk.infrastructure.toMultiValue

class LegacyFinanceApi(
    basePath: kotlin.String = defaultBasePath,
    accessToken: String? = null
) : ApiClient(basePath, accessToken) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty("com.equisoft.connect.sdk.baseUrl", "http://localhost")
        }
    }

    /**
    * Get Account Statement information for a contact.
    * 
    * @param contactId Contact Id 
    * @param includeUnmanagedAssets Include unmagned assets, by default false (optional)
    * @return LegacyfinancegetAccountStatementResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getAccountStatement(contactId: kotlin.Int, includeUnmanagedAssets: kotlin.Boolean?) : LegacyfinancegetAccountStatementResponse {
        val localVariableConfig = getAccountStatementRequestConfig(contactId = contactId, includeUnmanagedAssets = includeUnmanagedAssets)

        val localVarResponse = request<Unit, LegacyfinancegetAccountStatementResponse>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as LegacyfinancegetAccountStatementResponse
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
    * To obtain the request config of the operation getAccountStatement
    *
    * @param contactId Contact Id 
    * @param includeUnmanagedAssets Include unmagned assets, by default false (optional)
    * @return RequestConfig
    */
    fun getAccountStatementRequestConfig(contactId: kotlin.Int, includeUnmanagedAssets: kotlin.Boolean?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                put("contact_id", listOf(contactId.toString()))
                if (includeUnmanagedAssets != null) {
                    put("include_unmanaged_assets", listOf(includeUnmanagedAssets.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/apps/api/kronos.finance.getAccountStatement",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Get Liabilities information for a contact.
    * 
    * @param contactId Contact Id 
    * @return LegacyfinanceGetLiabilitiesResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getLiabilities(contactId: kotlin.Int) : LegacyfinanceGetLiabilitiesResponse {
        val localVariableConfig = getLiabilitiesRequestConfig(contactId = contactId)

        val localVarResponse = request<Unit, LegacyfinanceGetLiabilitiesResponse>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as LegacyfinanceGetLiabilitiesResponse
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
    * To obtain the request config of the operation getLiabilities
    *
    * @param contactId Contact Id 
    * @return RequestConfig
    */
    fun getLiabilitiesRequestConfig(contactId: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                put("contact_id", listOf(contactId.toString()))
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/apps/api/kronos.finance.getLiabilities",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

}