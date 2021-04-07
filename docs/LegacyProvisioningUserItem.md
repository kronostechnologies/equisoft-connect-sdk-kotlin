
# LegacyprovisioningUserItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orgId** | **kotlin.String** | User organization id |  [optional]
**uuid** | **kotlin.String** | User globaly unique identifier |  [optional]
**userId** | **kotlin.String** | User unique identifier |  [optional]
**displayName** | **kotlin.String** | User display name |  [optional]
**firstName** | **kotlin.String** | First name |  [optional]
**lastName** | **kotlin.String** | Last name |  [optional]
**initials** | **kotlin.String** | Initials |  [optional]
**email** | **kotlin.String** | Email address used for login |  [optional]
**role** | **kotlin.String** | User role. Accepts USER or ADMIN |  [optional]
**lang** | **kotlin.String** | User language. Organisation default lang will be used if not provided. Accepts FR or EN. |  [optional]
**concurrentAccess** | **kotlin.Int** | Number of allowed concurrent accesses with this user. Default 1. |  [optional]
**active** | **kotlin.String** | User is active or not (true or false) |  [optional]
**locked** | **kotlin.String** | User is locked or not (true or false) |  [optional]
**enableMobile** | **kotlin.String** | Enable Mobile version. Accepts true or false. Default false |  [optional]
**gender** | **kotlin.String** | Gender of this user. Accepts M or F. |  [optional]
**phoneWork** | **kotlin.String** | Work phone number of this user |  [optional]
**phoneWorkExtension** | **kotlin.String** | Extension of work phone number of this user. |  [optional]
**phoneHome** | **kotlin.String** | Home phone number of this user. |  [optional]
**phoneCell** | **kotlin.String** | Cellphone number of this user. |  [optional]
**phoneFax** | **kotlin.String** | Fax phone number of this user. |  [optional]
**address** | [**kotlin.collections.List&lt;LegacycontactAddress&gt;**](LegacycontactAddress.md) | Address of this user. |  [optional]
**groups** | [**kotlin.collections.List&lt;LegacyprovisioningGroupItem&gt;**](LegacyprovisioningGroupItem.md) | Groups the user is a member of. |  [optional]
**externalIdentifiers** | [**kotlin.collections.List&lt;LegacyprovisioningUserIdentifier&gt;**](LegacyprovisioningUserIdentifier.md) | List of identifier to uniquely identify the user. (Ex: Extranet2 or domain userId) |  [optional]
**allowDelegation** | **kotlin.String** | Allow the user to delegate access to his data Accepts true or false. |  [optional]
**deletable** | **kotlin.String** | Can the user be deleted Accepts true or false. |  [optional]



