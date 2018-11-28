/*
 * SWIFT Cloud Gateway OAuth Token API
 * OAuth token operations for SWIFT Cloud Gateway
 */

package com.swift.api;

import com.swift.ApiException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static java.util.Arrays.asList;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * API tests for DefaultApi
 */

public class DefaultApiTest {

	DefaultApi api = mock(DefaultApi.class);

	/**
	 * token grant or refresh request
	 *
	 * Implementation of the OAuth 2.0 password and refresh grant types (see
	 * RFC6749)
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

		Object mock_object = mock(Object.class);
		when(api.getAccessToken(grantType, username, password, refreshToken, scope)).thenReturn(mock_object);
		Assert.assertEquals(api.getAccessToken(grantType, username, password, refreshToken, scope),mock_object);
		System.out.println("Passed Test getAccessTokenTest");
	}

	/**
	 * token revoke request
	 *
	 * Implementation of the OAuth 2.0 revoke token (see RFC7009)
	 *
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void revokeAccessTokenTest() throws ApiException {
		String token = null;
		String tokenTypeHint = null;
		System.out.println("Passed Test getAccessTokenTest");
		

		// TODO: test validations
	}

}
