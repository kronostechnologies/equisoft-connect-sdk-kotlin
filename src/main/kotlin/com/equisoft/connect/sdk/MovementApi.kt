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
import com.equisoft.connect.sdk.models.MovementAddMovementResponse
import com.equisoft.connect.sdk.models.MovementGetStatusResponse
import com.equisoft.connect.sdk.models.MovementListMovementResponse
import com.equisoft.connect.sdk.models.MovementMovementPayload
import com.equisoft.connect.sdk.models.MovementValidationErrorResponse

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

class MovementApi(
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
     * 
     * 
     * @param movementMovementPayload 
     * @return MovementAddMovementResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun addMovement(movementMovementPayload: MovementMovementPayload) : MovementAddMovementResponse {
        val localVarResponse = addMovementWithHttpInfo(movementMovementPayload = movementMovementPayload)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as MovementAddMovementResponse
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
     * 
     * 
     * @param movementMovementPayload 
     * @return ApiResponse<MovementAddMovementResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun addMovementWithHttpInfo(movementMovementPayload: MovementMovementPayload) : ApiResponse<MovementAddMovementResponse?> {
        val localVariableConfig = addMovementRequestConfig(movementMovementPayload = movementMovementPayload)

        return request<MovementMovementPayload, MovementAddMovementResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation addMovement
     *
     * @param movementMovementPayload 
     * @return RequestConfig
     */
    fun addMovementRequestConfig(movementMovementPayload: MovementMovementPayload) : RequestConfig<MovementMovementPayload> {
        val localVariableBody = movementMovementPayload
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/crm/api/v1/movements",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * 
     * 
     * @param movementId 
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun cancelMovement(movementId: kotlin.Int) : Unit {
        val localVarResponse = cancelMovementWithHttpInfo(movementId = movementId)

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
     * 
     * 
     * @param movementId 
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun cancelMovementWithHttpInfo(movementId: kotlin.Int) : ApiResponse<Unit?> {
        val localVariableConfig = cancelMovementRequestConfig(movementId = movementId)

        return request<Unit, Unit>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation cancelMovement
     *
     * @param movementId 
     * @return RequestConfig
     */
    fun cancelMovementRequestConfig(movementId: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/crm/api/v1/movements/{movementId}/cancel".replace("{"+"movementId"+"}", "$movementId"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * 
     * 
     * @param movementId 
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun deleteMovement(movementId: kotlin.Int) : Unit {
        val localVarResponse = deleteMovementWithHttpInfo(movementId = movementId)

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
     * 
     * 
     * @param movementId 
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun deleteMovementWithHttpInfo(movementId: kotlin.Int) : ApiResponse<Unit?> {
        val localVariableConfig = deleteMovementRequestConfig(movementId = movementId)

        return request<Unit, Unit>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation deleteMovement
     *
     * @param movementId 
     * @return RequestConfig
     */
    fun deleteMovementRequestConfig(movementId: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/crm/api/v1/movements/{movementId}".replace("{"+"movementId"+"}", "$movementId"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * 
     * 
     * @param movementId 
     * @return MovementGetStatusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getMovementStatus(movementId: kotlin.Int) : MovementGetStatusResponse {
        val localVarResponse = getMovementStatusWithHttpInfo(movementId = movementId)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as MovementGetStatusResponse
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
     * 
     * 
     * @param movementId 
     * @return ApiResponse<MovementGetStatusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun getMovementStatusWithHttpInfo(movementId: kotlin.Int) : ApiResponse<MovementGetStatusResponse?> {
        val localVariableConfig = getMovementStatusRequestConfig(movementId = movementId)

        return request<Unit, MovementGetStatusResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getMovementStatus
     *
     * @param movementId 
     * @return RequestConfig
     */
    fun getMovementStatusRequestConfig(movementId: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/crm/api/v1/movements/{movementId}/status".replace("{"+"movementId"+"}", "$movementId"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * 
     * 
     * @return MovementListMovementResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun listMovements() : MovementListMovementResponse {
        val localVarResponse = listMovementsWithHttpInfo()

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as MovementListMovementResponse
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
     * 
     * 
     * @return ApiResponse<MovementListMovementResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun listMovementsWithHttpInfo() : ApiResponse<MovementListMovementResponse?> {
        val localVariableConfig = listMovementsRequestConfig()

        return request<Unit, MovementListMovementResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation listMovements
     *
     * @return RequestConfig
     */
    fun listMovementsRequestConfig() : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/crm/api/v1/movements",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

}
