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
* Values: nORMAL,pRIVATE
*/

enum class TasksVisibilityType(val value: kotlin.String) {


    @Json(name = "NORMAL")
    nORMAL("NORMAL"),

    @Json(name = "PRIVATE")
    pRIVATE("PRIVATE");


    /**
    This override toString avoids using the enum var name and uses the actual api value instead.
    In cases the var name and value are different, the client would send incorrect enums to the server.
    **/
    override fun toString(): String {
        return value
    }
}

