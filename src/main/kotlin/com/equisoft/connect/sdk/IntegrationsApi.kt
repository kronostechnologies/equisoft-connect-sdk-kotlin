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

import com.equisoft.connect.sdk.models.ErrorResponse
import com.equisoft.connect.sdk.models.LaserApplaserAppAnywhereError
import com.equisoft.connect.sdk.models.LaserApplaserAppAnywhereResponse

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

class IntegrationsApi(
    basePath: kotlin.String = defaultBasePath,
    accessToken: String? = null,
    client: OkHttpClient = ApiClient.defaultClient
) : ApiClient(basePath, accessToken) {

    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "http://localhost")
        }
    }

    /**
     * Download contact data for LaserApp Enterprise.
     * 
     * @param contactId 
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun downloadLaserAppEnterpriseContactData(contactId: kotlin.Int) : Unit {
        val localVarResponse = downloadLaserAppEnterpriseContactDataWithHttpInfo(contactId = contactId)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> Unit
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
     * Download contact data for LaserApp Enterprise.
     * 
     * @param contactId 
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun downloadLaserAppEnterpriseContactDataWithHttpInfo(contactId: kotlin.Int) : ApiResponse<Unit?> {
        val localVariableConfig = downloadLaserAppEnterpriseContactDataRequestConfig(contactId = contactId)

        return request<Unit, Unit>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation downloadLaserAppEnterpriseContactData
     *
     * @param contactId 
     * @return RequestConfig
     */
    fun downloadLaserAppEnterpriseContactDataRequestConfig(contactId: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/crm/api/app/integrations/laserapp/enterprise/{contactId}".replace("{"+"contactId"+"}", "$contactId"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Redirect contact to LaserApp Anywhere.
     * 
     * @param contactId 
     * @return LaserApplaserAppAnywhereResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun redirectContactToLaserAppAnywhere(contactId: kotlin.Int) : LaserApplaserAppAnywhereResponse {
        val localVarResponse = redirectContactToLaserAppAnywhereWithHttpInfo(contactId = contactId)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as LaserApplaserAppAnywhereResponse
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
     * Redirect contact to LaserApp Anywhere.
     * 
     * @param contactId 
     * @return ApiResponse<LaserApplaserAppAnywhereResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun redirectContactToLaserAppAnywhereWithHttpInfo(contactId: kotlin.Int) : ApiResponse<LaserApplaserAppAnywhereResponse?> {
        val localVariableConfig = redirectContactToLaserAppAnywhereRequestConfig(contactId = contactId)

        return request<Unit, LaserApplaserAppAnywhereResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation redirectContactToLaserAppAnywhere
     *
     * @param contactId 
     * @return RequestConfig
     */
    fun redirectContactToLaserAppAnywhereRequestConfig(contactId: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/crm/api/app/integrations/laserapp/anywhere/{contactId}".replace("{"+"contactId"+"}", "$contactId"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

}
