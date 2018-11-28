package com.swift.example;

import com.swift.ApiClient;
import com.swift.ApiException;
import com.swift.Configuration;
import com.swift.api.DefaultApi;
import com.swift.auth.HttpBasicAuth;

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
