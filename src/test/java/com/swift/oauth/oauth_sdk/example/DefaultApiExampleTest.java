package com.swift.oauth.oauth_sdk.example;

import org.junit.Ignore;
import org.junit.Test;

import com.swift.oauth.oauth_sdk.ApiClient;
import com.swift.oauth.oauth_sdk.ApiException;
import com.swift.oauth.oauth_sdk.Configuration;
import com.swift.oauth.oauth_sdk.auth.HttpBasicAuth;
import com.swift.oauth.oauth_sdk.api.DefaultApi;

/**
 * API tests for DefaultApi
 */
@Ignore
public class DefaultApiExampleTest {

	/**
	 * Obtain OAuth tokens needed to access APIs.
	 *
	 * The token endpoint is used to issue OAuth access tokens for the purpose of
	 * accessing SWIFT APIs. In addition, refresh tokens may be issued and
	 * subsequently exchanged for access tokens using this endpoint. See
	 * (RFC6749)for further information about the OAuth 2.0 standard.
	 *
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void getAccessTokenTest() throws ApiException {
		ApiClient defaultClient = Configuration.getDefaultApiClient();

		// Configure HTTP basic authorization: clientAuth
		HttpBasicAuth clientAuth = (HttpBasicAuth) defaultClient.getAuthentication("clientAuth");
		clientAuth.setUsername("YOUR USERNAME");
		clientAuth.setPassword("YOUR PASSWORD");

		DefaultApi apiInstance = new DefaultApi();
		String grantType = "grantType_example"; // String | set to 'password' to get initial token, or 'refresh_token'
												// to refresh existing token
		String username = "username_example"; // String | username of entity to authenticate (Required for granting
												// token)
		String password = "password_example"; // String | authetnication credentials (Required for granting token)
		String refreshToken = "refreshToken_example"; // String | refresh token (Required for refreshing token,for grant
														// token value is null)
		String scope = "scope_example"; // String | optional space separated list of services and roles for which to
										// grant token (do not include when refreshing token)
		try {
			Object result = apiInstance.getAccessToken(grantType, username, password, refreshToken, scope);
			System.out.println(result);
		} catch (ApiException e) {
			System.err.println("Exception when calling DefaultApi#getAccessToken");
			e.printStackTrace();
		}
	}

	/**
	 * Dispose of tokens and invalidate access to APIs.
	 *
	 * The revoke API is used to dispose of OAuth tokens when use is no longer
	 * needed. This will invalidate the token so that it can no longer be used to
	 * access APIs. It is strongly recommended that once an access token is no
	 * longer needed that the client application disposes it by using this API. See
	 * (RFC7009)for further information about the OAuth 2.0 standard.
	 *
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void revokeAccessTokenTest() throws ApiException {
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
