
# AccessTokenError

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**error** | [**ErrorEnum**](#ErrorEnum) | standard OAuth token grant error codes (see RFC 6749) | 
**errorDescription** | **String** | English description of the error | 


<a name="ErrorEnum"></a>
## Enum: ErrorEnum
Name | Value
---- | -----
INVALID_REQUEST | &quot;invalid_request&quot;
INVALID_CLIENT | &quot;invalid_client&quot;
INVALID_GRANT | &quot;invalid_grant&quot;
UNSUPPORTED_GRANT_TYPE | &quot;unsupported_grant_type&quot;
INVALID_SCOPE | &quot;invalid_scope&quot;
TEMPORARILY_UNAVAILABLE | &quot;temporarily_unavailable&quot;



