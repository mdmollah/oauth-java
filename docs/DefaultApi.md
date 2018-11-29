# DefaultApi

All URIs are relative to *https://sandbox.swift.com/oauth2/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAccessToken**](DefaultApi.md#getAccessToken) | **POST** /token | token grant or refresh request
[**revokeAccessToken**](DefaultApi.md#revokeAccessToken) | **POST** /revoke | token revoke request


<a name="getAccessToken"></a>
# **getAccessToken**
> Object getAccessToken(grantType, username, password, refreshToken, scope)

token grant or refresh request

Implementation of the OAuth 2.0 password and refresh grant types (see RFC6749) 

### Example
```java
// Import classes:
//import com.swift.oauth.ApiClient;
//import com.swift.oauth.ApiException;
//import com.swift.oauth.Configuration;
//import com.swift.oauth.auth.*;
//import com.swift.oauth.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: clientAuth
HttpBasicAuth clientAuth = (HttpBasicAuth) defaultClient.getAuthentication("clientAuth");
clientAuth.setUsername("YOUR USERNAME");
clientAuth.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
String grantType = "grantType_example"; // String | set to 'password' to get initial token, or 'refresh_token' to refresh existing token
String username = "username_example"; // String | username of entity to authenticate (Required for granting token)
String password = "password_example"; // String | authetnication credentials (Required for granting token)
String refreshToken = "refreshToken_example"; // String | refresh token (Required for refreshing token)
String scope = "scope_example"; // String | optional space separated list of services and roles for which to grant token (do not include when refreshing token)
try {
    Object result = apiInstance.getAccessToken(grantType, username, password, refreshToken, scope);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getAccessToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **grantType** | **String**| set to &#39;password&#39; to get initial token, or &#39;refresh_token&#39; to refresh existing token | [enum: password, refresh_token]
 **username** | **String**| username of entity to authenticate (Required for granting token) | [optional]
 **password** | **String**| authetnication credentials (Required for granting token) | [optional]
 **refreshToken** | **String**| refresh token (Required for refreshing token) | [optional]
 **scope** | **String**| optional space separated list of services and roles for which to grant token (do not include when refreshing token) | [optional]

### Return type

**Object**

### Authorization

[clientAuth](../README.md#clientAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="revokeAccessToken"></a>
# **revokeAccessToken**
> revokeAccessToken(token, tokenTypeHint)

token revoke request

Implementation of the OAuth 2.0 revoke token (see RFC7009) 

### Example
```java
// Import classes:
//import com.swift.oauth.ApiClient;
//import com.swift.oauth.ApiException;
//import com.swift.oauth.Configuration;
//import com.swift.oauth.auth.*;
//import com.swift.oauth.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: clientAuth
HttpBasicAuth clientAuth = (HttpBasicAuth) defaultClient.getAuthentication("clientAuth");
clientAuth.setUsername("YOUR USERNAME");
clientAuth.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
String token = "token_example"; // String | the token to revoke (may be access or refresh token)
String tokenTypeHint = "tokenTypeHint_example"; // String | indicates type of token to revoke
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
 **token** | **String**| the token to revoke (may be access or refresh token) |
 **tokenTypeHint** | **String**| indicates type of token to revoke | [optional] [enum: access_token, refresh_token]

### Return type

null (empty response body)

### Authorization

[clientAuth](../README.md#clientAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

