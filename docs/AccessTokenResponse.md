
# AccessTokenResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessToken** | **String** | The issued access token. | 
**tokenType** | [**TokenTypeEnum**](#TokenTypeEnum) | The token type being requested. | 
**expiresIn** | **Integer** | The lifetime of the access token, in seconds. |  [optional]
**refreshToken** | **String** | The issued refresh token. | 
**refreshTokenExpiresIn** | **Integer** | The lifetime of the refresh token, in seconds. | 
**refreshCount** | **Integer** | The renewal count of the refresh token. | 


<a name="TokenTypeEnum"></a>
## Enum: TokenTypeEnum
Name | Value
---- | -----
BEARER | &quot;Bearer&quot;



