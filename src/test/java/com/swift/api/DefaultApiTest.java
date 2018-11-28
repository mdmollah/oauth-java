/*
 * SWIFT Cloud Gateway OAuth Token API
 * OAuth token operations for SWIFT Cloud Gateway
 *
 */


package com.swift.api;

import com.swift.ApiException;
import com.swift.model.AccessTokenError;
import com.swift.model.AccessTokenResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
@Ignore
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    
    /**
     * token grant or refresh request
     *
     * Implementation of the OAuth 2.0 password and refresh grant types (see RFC6749) 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAccessTokenTest() throws ApiException {
        String grantType = null;
        String username = null;
        String password = null;
        String refreshToken = null;
        String scope = null;
        List<AccessTokenResponse> response = api.getAccessToken(grantType, username, password, refreshToken, scope);

        // TODO: test validations
    }
    
    /**
     * token revoke request
     *
     * Implementation of the OAuth 2.0 revoke token (see RFC7009) 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void revokeAccessTokenTest() throws ApiException {
        String token = null;
        String tokenTypeHint = null;
        api.revokeAccessToken(token, tokenTypeHint);

        // TODO: test validations
    }
    
}
