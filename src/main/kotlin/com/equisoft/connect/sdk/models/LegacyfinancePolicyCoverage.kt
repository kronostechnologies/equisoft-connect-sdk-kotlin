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

import com.equisoft.connect.sdk.models.LegacyfinancePolicyCoverageInsured
import com.equisoft.connect.sdk.models.LegacyfinancePolicyCoverageOption

import com.squareup.moshi.Json

/**
 * 
 *
 * @param coverageType BASE or RIDER
 * @param product 
 * @param productType 
 * @param productSubType 
 * @param deathCapital 
 * @param issueDate 
 * @param annualPremium 
 * @param modalPremium 
 * @param annualizedPremium 
 * @param premiumMode 
 * @param surrenderValue 
 * @param accumulatedFund 
 * @param elimPeriodAcc 
 * @param elimPeriodSick 
 * @param benefitPeriod 
 * @param benefitAmount 
 * @param beneficiary 
 * @param insureds 
 * @param livesType 
 * @param coverageOptions 
 * @param isInsured 
 */

data class LegacyfinancePolicyCoverage (

    /* BASE or RIDER */
    @Json(name = "coverageType")
    val coverageType: kotlin.String? = null,

    @Json(name = "product")
    val product: kotlin.String? = null,

    @Json(name = "productType")
    val productType: kotlin.String? = null,

    @Json(name = "productSubType")
    val productSubType: kotlin.String? = null,

    @Json(name = "deathCapital")
    val deathCapital: kotlin.String? = null,

    @Json(name = "issueDate")
    val issueDate: kotlin.String? = null,

    @Json(name = "annualPremium")
    val annualPremium: kotlin.String? = null,

    @Json(name = "modalPremium")
    val modalPremium: kotlin.String? = null,

    @Json(name = "annualizedPremium")
    val annualizedPremium: kotlin.String? = null,

    @Json(name = "premiumMode")
    val premiumMode: kotlin.String? = null,

    @Json(name = "surrenderValue")
    val surrenderValue: kotlin.String? = null,

    @Json(name = "accumulatedFund")
    val accumulatedFund: kotlin.String? = null,

    @Json(name = "elimPeriodAcc")
    val elimPeriodAcc: kotlin.String? = null,

    @Json(name = "elimPeriodSick")
    val elimPeriodSick: kotlin.String? = null,

    @Json(name = "benefitPeriod")
    val benefitPeriod: kotlin.String? = null,

    @Json(name = "benefitAmount")
    val benefitAmount: kotlin.String? = null,

    @Json(name = "beneficiary")
    val beneficiary: kotlin.String? = null,

    @Json(name = "insureds")
    val insureds: kotlin.collections.List<LegacyfinancePolicyCoverageInsured>? = null,

    @Json(name = "livesType")
    val livesType: kotlin.String? = null,

    @Json(name = "coverageOptions")
    val coverageOptions: kotlin.collections.List<LegacyfinancePolicyCoverageOption>? = null,

    @Json(name = "isInsured")
    val isInsured: kotlin.String? = null

)

