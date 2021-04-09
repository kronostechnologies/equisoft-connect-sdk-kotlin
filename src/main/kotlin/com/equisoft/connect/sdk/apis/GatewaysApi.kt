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
package com.equisoft.connect.sdk.apis

import com.equisoft.connect.sdk.models.AdminCredentialPayload
import com.equisoft.connect.sdk.models.AdminCredentialResponse
import com.equisoft.connect.sdk.models.CredentialsResponse
import com.equisoft.connect.sdk.models.ErrorResponse
import com.equisoft.connect.sdk.models.GatewaysListCredentialsResponse
import com.equisoft.connect.sdk.models.GatewaysaccessesCreateAccessResponse
import com.equisoft.connect.sdk.models.GatewaysaccessesCreateEquisoftAnalyzeAccessPayload
import com.equisoft.connect.sdk.models.GatewaysaccessesListGatewayAccessesResponse
import com.equisoft.connect.sdk.models.GatewaysaccessesPatchEquisoftAnalyzeAccessPayload

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

class GatewaysApi(basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty("com.equisoft.connect.sdk.baseUrl", "http://localhost")
        }
    }

    /**
    * 
    * Create a user access configuration for Equisoft/analyze gateway
    * @param gatewaysaccessesCreateEquisoftAnalyzeAccessPayload  
    * @return GatewaysaccessesCreateAccessResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun createEquisoftAnalyzeAccess(gatewaysaccessesCreateEquisoftAnalyzeAccessPayload: GatewaysaccessesCreateEquisoftAnalyzeAccessPayload) : GatewaysaccessesCreateAccessResponse {
        val localVariableConfig = createEquisoftAnalyzeAccessRequestConfig(gatewaysaccessesCreateEquisoftAnalyzeAccessPayload = gatewaysaccessesCreateEquisoftAnalyzeAccessPayload)

        val localVarResponse = request<GatewaysaccessesCreateAccessResponse>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as GatewaysaccessesCreateAccessResponse
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
    * To obtain the request config of the operation createEquisoftAnalyzeAccess
    *
    * @param gatewaysaccessesCreateEquisoftAnalyzeAccessPayload  
    * @return RequestConfig
    */
    fun createEquisoftAnalyzeAccessRequestConfig(gatewaysaccessesCreateEquisoftAnalyzeAccessPayload: GatewaysaccessesCreateEquisoftAnalyzeAccessPayload) : RequestConfig {
        val localVariableBody: kotlin.Any? = gatewaysaccessesCreateEquisoftAnalyzeAccessPayload
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.POST,
            path = "/crm/api/v1/gateways/equisoftAnalyze/accesses",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

    /**
    * 
    * Delete user access configuration for given gateway
    * @param accessId  
    * @return kotlin.Any
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun deleteEquisoftAnalyzeAccess(accessId: kotlin.Int) : kotlin.Any {
        val localVariableConfig = deleteEquisoftAnalyzeAccessRequestConfig(accessId = accessId)

        val localVarResponse = request<kotlin.Any>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.Any
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
    * To obtain the request config of the operation deleteEquisoftAnalyzeAccess
    *
    * @param accessId  
    * @return RequestConfig
    */
    fun deleteEquisoftAnalyzeAccessRequestConfig(accessId: kotlin.Int) : RequestConfig {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.DELETE,
            path = "/crm/api/v1/gateways/equisoftAnalyze/accesses/{accessId}".replace("{"+"accessId"+"}", "$accessId"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

    /**
    * 
    * 
    * @param gatewayName  
    * @param authorization Authorization header using the Bearer scheme 
    * @param adminCredentialPayload  
    * @return AdminCredentialResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun gatewayAdminLogin(gatewayName: kotlin.String, authorization: kotlin.String, adminCredentialPayload: AdminCredentialPayload) : AdminCredentialResponse {
        val localVariableConfig = gatewayAdminLoginRequestConfig(gatewayName = gatewayName, authorization = authorization, adminCredentialPayload = adminCredentialPayload)

        val localVarResponse = request<AdminCredentialResponse>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as AdminCredentialResponse
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
    * To obtain the request config of the operation gatewayAdminLogin
    *
    * @param gatewayName  
    * @param authorization Authorization header using the Bearer scheme 
    * @param adminCredentialPayload  
    * @return RequestConfig
    */
    fun gatewayAdminLoginRequestConfig(gatewayName: kotlin.String, authorization: kotlin.String, adminCredentialPayload: AdminCredentialPayload) : RequestConfig {
        val localVariableBody: kotlin.Any? = adminCredentialPayload
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        authorization?.apply { localVariableHeaders["Authorization"] = this.toString() }
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.POST,
            path = "/crm/api/v1/gateways/credentials-validation/{gatewayName}/admin-credentials/login".replace("{"+"gatewayName"+"}", "$gatewayName"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

    /**
    * 
    * 
    * @param gatewayId  
    * @param status  
    * @param authorization Authorization header using the Bearer scheme 
    * @return CredentialsResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun gatewayCredentials(gatewayId: kotlin.String, status: kotlin.String, authorization: kotlin.String) : CredentialsResponse {
        val localVariableConfig = gatewayCredentialsRequestConfig(gatewayId = gatewayId, status = status, authorization = authorization)

        val localVarResponse = request<CredentialsResponse>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as CredentialsResponse
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
    * To obtain the request config of the operation gatewayCredentials
    *
    * @param gatewayId  
    * @param status  
    * @param authorization Authorization header using the Bearer scheme 
    * @return RequestConfig
    */
    fun gatewayCredentialsRequestConfig(gatewayId: kotlin.String, status: kotlin.String, authorization: kotlin.String) : RequestConfig {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        authorization?.apply { localVariableHeaders["Authorization"] = this.toString() }
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.GET,
            path = "/crm/api/v1/gateways/credentials-validation/{gatewayId}/credentials/{status}".replace("{"+"gatewayId"+"}", "$gatewayId").replace("{"+"status"+"}", "$status"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

    /**
    * 
    * 
    * @return GatewaysListCredentialsResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun listAssetBookCredentials() : GatewaysListCredentialsResponse {
        val localVariableConfig = listAssetBookCredentialsRequestConfig()

        val localVarResponse = request<GatewaysListCredentialsResponse>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as GatewaysListCredentialsResponse
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
    * To obtain the request config of the operation listAssetBookCredentials
    *
    * @return RequestConfig
    */
    fun listAssetBookCredentialsRequestConfig() : RequestConfig {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.GET,
            path = "/crm/api/v1/gateways/assetbook/credentials",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

    /**
    * 
    * List user accesses configuration for equisoft/analyze gateway
    * @param userUuid  (optional)
    * @return GatewaysaccessesListGatewayAccessesResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun listEquisoftAnalyzeAccesses(userUuid: kotlin.String?) : GatewaysaccessesListGatewayAccessesResponse {
        val localVariableConfig = listEquisoftAnalyzeAccessesRequestConfig(userUuid = userUuid)

        val localVarResponse = request<GatewaysaccessesListGatewayAccessesResponse>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as GatewaysaccessesListGatewayAccessesResponse
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
    * To obtain the request config of the operation listEquisoftAnalyzeAccesses
    *
    * @param userUuid  (optional)
    * @return RequestConfig
    */
    fun listEquisoftAnalyzeAccessesRequestConfig(userUuid: kotlin.String?) : RequestConfig {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                if (userUuid != null) {
                    put("userUuid", listOf(userUuid.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.GET,
            path = "/crm/api/v1/gateways/equisoftAnalyze/accesses",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

    /**
    * 
    * 
    * @param gatewayName  
    * @return void
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun listGatewayConfigurations(gatewayName: kotlin.String) : Unit {
        val localVariableConfig = listGatewayConfigurationsRequestConfig(gatewayName = gatewayName)

        val localVarResponse = request<Any?>(
            localVariableConfig
        )

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
    * To obtain the request config of the operation listGatewayConfigurations
    *
    * @param gatewayName  
    * @return RequestConfig
    */
    fun listGatewayConfigurationsRequestConfig(gatewayName: kotlin.String) : RequestConfig {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.GET,
            path = "/crm/api/v1/gateways/generic/{gatewayName}/configuration".replace("{"+"gatewayName"+"}", "$gatewayName"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

    /**
    * 
    * 
    * @param gatewayName  
    * @param includeSsn Include the list of SSN for each credentials. Defaults to false (optional)
    * @return GatewaysListCredentialsResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun listGenericCredentials(gatewayName: kotlin.String, includeSsn: kotlin.Boolean?) : GatewaysListCredentialsResponse {
        val localVariableConfig = listGenericCredentialsRequestConfig(gatewayName = gatewayName, includeSsn = includeSsn)

        val localVarResponse = request<GatewaysListCredentialsResponse>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as GatewaysListCredentialsResponse
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
    * To obtain the request config of the operation listGenericCredentials
    *
    * @param gatewayName  
    * @param includeSsn Include the list of SSN for each credentials. Defaults to false (optional)
    * @return RequestConfig
    */
    fun listGenericCredentialsRequestConfig(gatewayName: kotlin.String, includeSsn: kotlin.Boolean?) : RequestConfig {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                if (includeSsn != null) {
                    put("includeSsn", listOf(includeSsn.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.GET,
            path = "/crm/api/v1/gateways/generic/{gatewayName}/credentials".replace("{"+"gatewayName"+"}", "$gatewayName"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

    /**
    * 
    * Update user access configuration for Equisoft/analyze gateway
    * @param accessId  
    * @param gatewaysaccessesPatchEquisoftAnalyzeAccessPayload  
    * @return kotlin.Any
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun patchEquisoftAnalyzeAccess(accessId: kotlin.Int, gatewaysaccessesPatchEquisoftAnalyzeAccessPayload: GatewaysaccessesPatchEquisoftAnalyzeAccessPayload) : kotlin.Any {
        val localVariableConfig = patchEquisoftAnalyzeAccessRequestConfig(accessId = accessId, gatewaysaccessesPatchEquisoftAnalyzeAccessPayload = gatewaysaccessesPatchEquisoftAnalyzeAccessPayload)

        val localVarResponse = request<kotlin.Any>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.Any
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
    * To obtain the request config of the operation patchEquisoftAnalyzeAccess
    *
    * @param accessId  
    * @param gatewaysaccessesPatchEquisoftAnalyzeAccessPayload  
    * @return RequestConfig
    */
    fun patchEquisoftAnalyzeAccessRequestConfig(accessId: kotlin.Int, gatewaysaccessesPatchEquisoftAnalyzeAccessPayload: GatewaysaccessesPatchEquisoftAnalyzeAccessPayload) : RequestConfig {
        val localVariableBody: kotlin.Any? = gatewaysaccessesPatchEquisoftAnalyzeAccessPayload
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.PATCH,
            path = "/crm/api/v1/gateways/equisoftAnalyze/accesses/{accessId}".replace("{"+"accessId"+"}", "$accessId"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

}
