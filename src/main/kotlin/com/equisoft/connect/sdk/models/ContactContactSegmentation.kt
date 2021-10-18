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

package com.equisoft.connect.sdk.models

import com.equisoft.connect.sdk.models.FieldValue

import com.squareup.moshi.Json

/**
 * 
 *
 * @param categories Contact's categories which represents the contact's different classes
 * @param distributionLists Contact's distribution lists
 * @param hobbies Contact's hobbies
 * @param referredBy Contact's references
 * @param industries Contact's industries
 * @param segmentation1 
 * @param segmentation2 
 * @param segmentation3 
 * @param segmentation4 
 * @param segmentation5 
 * @param segmentation6 
 * @param territory 
 */

data class ContactContactSegmentation (

    /* Contact's categories which represents the contact's different classes */
    @Json(name = "categories")
    val categories: kotlin.collections.List<FieldValue>,

    /* Contact's distribution lists */
    @Json(name = "distributionLists")
    val distributionLists: kotlin.collections.List<FieldValue>,

    /* Contact's hobbies */
    @Json(name = "hobbies")
    val hobbies: kotlin.collections.List<FieldValue>,

    /* Contact's references */
    @Json(name = "referredBy")
    val referredBy: kotlin.collections.List<FieldValue>,

    /* Contact's industries */
    @Json(name = "industries")
    val industries: kotlin.collections.List<FieldValue>,

    @Json(name = "segmentation1")
    val segmentation1: FieldValue? = null,

    @Json(name = "segmentation2")
    val segmentation2: FieldValue? = null,

    @Json(name = "segmentation3")
    val segmentation3: FieldValue? = null,

    @Json(name = "segmentation4")
    val segmentation4: FieldValue? = null,

    @Json(name = "segmentation5")
    val segmentation5: FieldValue? = null,

    @Json(name = "segmentation6")
    val segmentation6: FieldValue? = null,

    @Json(name = "territory")
    val territory: FieldValue? = null

)
