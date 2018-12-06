# DefaultApi

All URIs are relative to *https://sandbox.swift.com/oauth2/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAccessToken**](DefaultApi.md#getAccessToken) | **POST** /token | Obtain OAuth tokens needed to access APIs.
[**revokeAccessToken**](DefaultApi.md#revokeAccessToken) | **POST** /revoke | Dispose of tokens and invalidate access to APIs.


<a name="getAccessToken"></a>
# **getAccessToken**
> AccessTokenResponse getAccessToken(grantType, username, password, refreshToken, scope)

Obtain OAuth tokens needed to access APIs.

The token endpoint is used to issue OAuth access tokens for the purpose of accessing SWIFT APIs. In addition, refresh tokens may be issued and subsequently exchanged for access tokens using this endpoint. See (RFC6749)for further information about the OAuth 2.0 standard. 

### Example
```java
// Import classes:
//import com.swift.oauth.oauth_sdk.ApiClient;
//import com.swift.oauth.oauth_sdk.ApiException;
//import com.swift.oauth.oauth_sdk.Configuration;
//import com.swift.oauth.oauth_sdk.auth.*;
//import com.swift.oauth.oauth_sdk.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: clientAuth
HttpBasicAuth clientAuth = (HttpBasicAuth) defaultClient.getAuthentication("clientAuth");
clientAuth.setUsername("YOUR USERNAME");
clientAuth.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
String grantType = "grantType_example"; // String | The authorization grant type. Values for grant_type are established as a part of the the OAuth 2.0 standard. The value for the grant type determines which of the following parameters are required.
String username = "username_example"; // String | The user name associated with the entity to authenticate. User credentials may be used to obtain an access token.
String password = "password_example"; // String | The password corresponding to the user name.
String refreshToken = "refreshToken_example"; // String | The refresh token issued earlier. Refresh tokens are credentials that can be used to obtain access tokens.
String scope = "scope_example"; // String | The value of the scope parameter is expressed as a list of space-delimited, case-sensitive strings. Scope values are defined by SWIFT and specific APIs identify the scope that is required to access them. Client applications are limited by scope during registration. If the value contains multiple space-delimited strings, their order does not matter, and each string adds an additional access range to the requested scope.
try {
    AccessTokenResponse result = apiInstance.getAccessToken(grantType, username, password, refreshToken, scope);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getAccessToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **grantType** | **String**| The authorization grant type. Values for grant_type are established as a part of the the OAuth 2.0 standard. The value for the grant type determines which of the following parameters are required. | [enum: password, refresh_token]
 **username** | **String**| The user name associated with the entity to authenticate. User credentials may be used to obtain an access token. | [optional]
 **password** | **String**| The password corresponding to the user name. | [optional]
 **refreshToken** | **String**| The refresh token issued earlier. Refresh tokens are credentials that can be used to obtain access tokens. | [optional]
 **scope** | **String**| The value of the scope parameter is expressed as a list of space-delimited, case-sensitive strings. Scope values are defined by SWIFT and specific APIs identify the scope that is required to access them. Client applications are limited by scope during registration. If the value contains multiple space-delimited strings, their order does not matter, and each string adds an additional access range to the requested scope. | [optional]

### Return type

[**AccessTokenResponse**](AccessTokenResponse.md)

### Authorization

[clientAuth](../README.md#clientAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="revokeAccessToken"></a>
# **revokeAccessToken**
> revokeAccessToken(token, tokenTypeHint)

Dispose of tokens and invalidate access to APIs.

The revoke API is used to dispose of OAuth tokens when use is no longer needed.  This will invalidate the token so that it can no longer be used to access APIs. It is strongly recommended that once an access token is no longer needed that the client application disposes it by using this API. See (RFC7009)for further information about the OAuth 2.0 standard. 

### Example
```java
// Import classes:
//import com.swift.oauth.oauth_sdk.ApiClient;
//import com.swift.oauth.oauth_sdk.ApiException;
//import com.swift.oauth.oauth_sdk.Configuration;
//import com.swift.oauth.oauth_sdk.auth.*;
//import com.swift.oauth.oauth_sdk.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: clientAuth
HttpBasicAuth clientAuth = (HttpBasicAuth) defaultClient.getAuthentication("clientAuth");
clientAuth.setUsername("YOUR USERNAME");
clientAuth.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
String token = "token_example"; // String | The access or refresh token to revoke.
String tokenTypeHint = "tokenTypeHint_example"; // String | The type of token being revoked.
try {
    apiInstance.revokeAccessToken(token, tokenTypeHint);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#revokeAccessToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| The access or refresh token to revoke. |
 **tokenTypeHint** | **String**| The type of token being revoked. | [optional] [enum: access_token, refresh_token]

### Return type

null (empty response body)

### Authorization

[clientAuth](../README.md#clientAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

