
# LegacyprovisioningUserPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**firstName** | **kotlin.String** | First name |  [optional]
**lastName** | **kotlin.String** | Last name |  [optional]
**email** | **kotlin.String** | Email address used for login |  [optional]
**lang** | **kotlin.String** | User language. Organisation default lang will be used if not provided. Accepts FR or EN. |  [optional]
**role** | **kotlin.String** | User role. Accepts USER or ADMIN |  [optional]
**concurrentAccess** | **kotlin.Int** | Number of allowed concurrent accesses with this user. Default 1. |  [optional]
**password** | **kotlin.String** | User initial password. A random password will be set if none is specified and noPassword option is not used. |  [optional]
**noPassword** | **kotlin.String** | Disable password authentication. Accepts true or false. Default false |  [optional]
**requirePasswordChange** | **kotlin.String** | The user will be ask to define a new password on the first login Accepts true or false. Default true |  [optional]
**enableMobile** | **kotlin.String** | Enable Mobile version. Deprecated: the mobile is not enabled per user anymore. Accepts true or false. Default false |  [optional]
**externalIdentifiers** | [**kotlin.collections.List&lt;LegacyprovisioningUserIdentifier&gt;**](LegacyprovisioningUserIdentifier.md) | List of identifier to uniquely identify the user. |  [optional]
**allowDelegation** | **kotlin.String** | Allow the user to delegate access to his data Accepts true or false. Default false |  [optional]
**gender** | **kotlin.String** | Gender of this user. Accepts M or F. |  [optional]
**phoneWork** | **kotlin.String** | Work phone number of this user |  [optional]
**phoneWorkExtension** | **kotlin.String** | Extension of work phone number of this user. |  [optional]
**phoneHome** | **kotlin.String** | Home phone number of this user. |  [optional]
**phoneCell** | **kotlin.String** | Cellphone number of this user. |  [optional]
**phoneFax** | **kotlin.String** | Fax phone number of this user. |  [optional]
**phoneMain** | **kotlin.String** | The phone type to be the main phone number. Accepts fax, cell, home, work. Default work |  [optional]
**address** | [**kotlin.collections.List&lt;LegacycontactAddress&gt;**](LegacycontactAddress.md) | Address of this user. |  [optional]
**noFNA** | **kotlin.String** | Accepts true or false. Default false |  [optional]



