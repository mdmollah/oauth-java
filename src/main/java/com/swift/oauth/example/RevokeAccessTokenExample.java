package com.swift.oauth.example;

import com.swift.oauth.ApiClient;
import com.swift.oauth.ApiException;
import com.swift.oauth.Configuration;
import com.swift.oauth.api.DefaultApi;
import com.swift.oauth.auth.HttpBasicAuth;

public class RevokeAccessTokenExample {

	public static void main(String[] args) {
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

	}

}
