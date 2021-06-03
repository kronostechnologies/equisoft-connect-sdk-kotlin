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


import com.equisoft.connect.sdk.models.ErrorResponse
import com.equisoft.connect.sdk.models.LaserApplaserAppAnywhereError
import com.equisoft.connect.sdk.models.LaserApplaserAppAnywhereResponse

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

class IntegrationsApi(
    basePath: kotlin.String = defaultBasePath,
    accessToken: String? = null
) : ApiClient(
    basePath,
    accessToken
) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty("com.equisoft.connect.sdk.baseUrl", "http://localhost")
        }
    }

    /**
    * Download contact data for LaserApp Enterprise.
    * 
    * @param contactId  
    * @return void
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun downloadLaserAppEnterpriseContactData(contactId: kotlin.Int) : Unit {
        val localVariableConfig = downloadLaserAppEnterpriseContactDataRequestConfig(contactId = contactId)

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
    * To obtain the request config of the operation downloadLaserAppEnterpriseContactData
    *
    * @param contactId  
    * @return RequestConfig
    */
    fun downloadLaserAppEnterpriseContactDataRequestConfig(contactId: kotlin.Int) : RequestConfig {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        val localVariableConfig = RequestConfig(
            method = RequestMethod.GET,
            path = "/crm/api/app/integrations/laserapp/enterprise/{contactId}".replace("{"+"contactId"+"}", "$contactId"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

    /**
    * Redirect contact to LaserApp Anywhere.
    * 
    * @param contactId  
    * @return LaserApplaserAppAnywhereResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun redirectContactToLaserAppAnywhere(contactId: kotlin.Int) : LaserApplaserAppAnywhereResponse {
        val localVariableConfig = redirectContactToLaserAppAnywhereRequestConfig(contactId = contactId)

        val localVarResponse = request<LaserApplaserAppAnywhereResponse>(
            localVariableConfig
        )

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
    * To obtain the request config of the operation redirectContactToLaserAppAnywhere
    *
    * @param contactId  
    * @return RequestConfig
    */
    fun redirectContactToLaserAppAnywhereRequestConfig(contactId: kotlin.Int) : RequestConfig {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        val localVariableConfig = RequestConfig(
            method = RequestMethod.GET,
            path = "/crm/api/app/integrations/laserapp/anywhere/{contactId}".replace("{"+"contactId"+"}", "$contactId"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

}
