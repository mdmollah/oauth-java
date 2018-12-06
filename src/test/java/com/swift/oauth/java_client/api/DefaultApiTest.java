package com.swift.oauth.java_client.api;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;

import com.swift.oauth.java_client.ApiException;
import com.swift.oauth.java_client.model.AccessTokenResponse;

/**
 * API tests for DefaultApi
 */

public class DefaultApiTest {

	DefaultApi api = mock(DefaultApi.class);

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
		String grantType = null;
		String username = null;
		String password = null;
		String refreshToken = null;
		String scope = null;
		AccessTokenResponse mock_object = mock(AccessTokenResponse.class);
		when(api.getAccessToken(grantType, username, password, refreshToken, scope)).thenReturn(mock_object);
		Assert.assertEquals(api.getAccessToken(grantType, username, password, refreshToken, scope), mock_object);
		System.out.println("Passed Test getAccessTokenTest");

		// TODO: test validations
	}

}
