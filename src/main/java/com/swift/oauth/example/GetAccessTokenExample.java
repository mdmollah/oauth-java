package com.swift.oauth.example;

import com.swift.oauth.ApiClient;
import com.swift.oauth.ApiException;
import com.swift.oauth.Configuration;
import com.swift.oauth.api.DefaultApi;
import com.swift.oauth.auth.HttpBasicAuth;

public class GetAccessTokenExample {

	public static void main(String[] args) {

	       ApiClient defaultClient = Configuration.getDefaultApiClient();
	        
	        // Configure HTTP basic authorization: clientAuth
	        HttpBasicAuth clientAuth = (HttpBasicAuth) defaultClient.getAuthentication("clientAuth");
	        clientAuth.setUsername("YOUR USERNAME");
	        clientAuth.setPassword("YOUR PASSWORD");

	        DefaultApi apiInstance = new DefaultApi();
	        String grantType = "grantType_example"; // String | set to 'password' to get initial token, or 'refresh_token' to refresh existing token
	        String username = "username_example"; // String | username of entity to authenticate (Required for granting token)
	        String password = "password_example"; // String | authetnication credentials (Required for granting token)
	        String refreshToken = "refreshToken_example"; // String | refresh token (Required for refreshing token,for grant token value is null)
	        String scope = "scope_example"; // String | optional space separated list of services and roles for which to grant token (do not include when refreshing token)
	        try {
	            Object result = apiInstance.getAccessToken(grantType, username, password, refreshToken, scope);
	            System.out.println(result);
	        } catch (ApiException e) {
	            System.err.println("Exception when calling DefaultApi#getAccessToken");
	            e.printStackTrace();
	        }
	}

}
