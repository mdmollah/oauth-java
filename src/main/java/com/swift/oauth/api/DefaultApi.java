/*
 * SWIFT Cloud Gateway OAuth Token API
 * OAuth token operations for SWIFT Cloud Gateway
 */

package com.swift.oauth.api;

import com.swift.oauth.ApiCallback;
import com.swift.oauth.ApiClient;
import com.swift.oauth.ApiException;
import com.swift.oauth.ApiResponse;
import com.swift.oauth.Configuration;
import com.swift.oauth.Pair;
import com.swift.oauth.ProgressRequestBody;
import com.swift.oauth.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;



import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultApi {
    private ApiClient apiClient;

    public DefaultApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DefaultApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getAccessToken
     * @param grantType set to &#39;password&#39; to get initial token, or &#39;refresh_token&#39; to refresh existing token (required)
     * @param username username of entity to authenticate (Required for granting token) (optional)
     * @param password authetnication credentials (Required for granting token) (optional)
     * @param refreshToken refresh token (Required for refreshing token) (optional)
     * @param scope optional space separated list of services and roles for which to grant token (do not include when refreshing token) (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAccessTokenCall(String grantType, String username, String password, String refreshToken, String scope, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/token";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (grantType != null)
        localVarFormParams.put("grant_type", grantType);
        if (username != null)
        localVarFormParams.put("username", username);
        if (password != null)
        localVarFormParams.put("password", password);
        if (refreshToken != null)
        localVarFormParams.put("refresh_token", refreshToken);
        if (scope != null)
        localVarFormParams.put("scope", scope);

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/x-www-form-urlencoded"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "clientAuth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getAccessTokenValidateBeforeCall(String grantType, String username, String password, String refreshToken, String scope, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'grantType' is set
        if (grantType == null) {
            throw new ApiException("Missing the required parameter 'grantType' when calling getAccessToken(Async)");
        }
        

        com.squareup.okhttp.Call call = getAccessTokenCall(grantType, username, password, refreshToken, scope, progressListener, progressRequestListener);
        return call;

    }

    /**
     * token grant or refresh request
     * Implementation of the OAuth 2.0 password and refresh grant types (see RFC6749) 
     * @param grantType set to &#39;password&#39; to get initial token, or &#39;refresh_token&#39; to refresh existing token (required)
     * @param username username of entity to authenticate (Required for granting token) (optional)
     * @param password authetnication credentials (Required for granting token) (optional)
     * @param refreshToken refresh token (Required for refreshing token) (optional)
     * @param scope optional space separated list of services and roles for which to grant token (do not include when refreshing token) (optional)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object getAccessToken(String grantType, String username, String password, String refreshToken, String scope) throws ApiException {
        ApiResponse<Object> resp = getAccessTokenWithHttpInfo(grantType, username, password, refreshToken, scope);
        return resp.getData();
    }

    /**
     * token grant or refresh request
     * Implementation of the OAuth 2.0 password and refresh grant types (see RFC6749) 
     * @param grantType set to &#39;password&#39; to get initial token, or &#39;refresh_token&#39; to refresh existing token (required)
     * @param username username of entity to authenticate (Required for granting token) (optional)
     * @param password authetnication credentials (Required for granting token) (optional)
     * @param refreshToken refresh token (Required for refreshing token) (optional)
     * @param scope optional space separated list of services and roles for which to grant token (do not include when refreshing token) (optional)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> getAccessTokenWithHttpInfo(String grantType, String username, String password, String refreshToken, String scope) throws ApiException {
        com.squareup.okhttp.Call call = getAccessTokenValidateBeforeCall(grantType, username, password, refreshToken, scope, null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * token grant or refresh request (asynchronously)
     * Implementation of the OAuth 2.0 password and refresh grant types (see RFC6749) 
     * @param grantType set to &#39;password&#39; to get initial token, or &#39;refresh_token&#39; to refresh existing token (required)
     * @param username username of entity to authenticate (Required for granting token) (optional)
     * @param password authetnication credentials (Required for granting token) (optional)
     * @param refreshToken refresh token (Required for refreshing token) (optional)
     * @param scope optional space separated list of services and roles for which to grant token (do not include when refreshing token) (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAccessTokenAsync(String grantType, String username, String password, String refreshToken, String scope, final ApiCallback<Object> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getAccessTokenValidateBeforeCall(grantType, username, password, refreshToken, scope, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for revokeAccessToken
     * @param token the token to revoke (may be access or refresh token) (required)
     * @param tokenTypeHint indicates type of token to revoke (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call revokeAccessTokenCall(String token, String tokenTypeHint, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/revoke";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (token != null)
        localVarFormParams.put("token", token);
        if (tokenTypeHint != null)
        localVarFormParams.put("token_type_hint", tokenTypeHint);

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/x-www-form-urlencoded"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "clientAuth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call revokeAccessTokenValidateBeforeCall(String token, String tokenTypeHint, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'token' is set
        if (token == null) {
            throw new ApiException("Missing the required parameter 'token' when calling revokeAccessToken(Async)");
        }
        

        com.squareup.okhttp.Call call = revokeAccessTokenCall(token, tokenTypeHint, progressListener, progressRequestListener);
        return call;

    }

    /**
     * token revoke request
     * Implementation of the OAuth 2.0 revoke token (see RFC7009) 
     * @param token the token to revoke (may be access or refresh token) (required)
     * @param tokenTypeHint indicates type of token to revoke (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void revokeAccessToken(String token, String tokenTypeHint) throws ApiException {
        revokeAccessTokenWithHttpInfo(token, tokenTypeHint);
    }

    /**
     * token revoke request
     * Implementation of the OAuth 2.0 revoke token (see RFC7009) 
     * @param token the token to revoke (may be access or refresh token) (required)
     * @param tokenTypeHint indicates type of token to revoke (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> revokeAccessTokenWithHttpInfo(String token, String tokenTypeHint) throws ApiException {
        com.squareup.okhttp.Call call = revokeAccessTokenValidateBeforeCall(token, tokenTypeHint, null, null);
        return apiClient.execute(call);
    }

    /**
     * token revoke request (asynchronously)
     * Implementation of the OAuth 2.0 revoke token (see RFC7009) 
     * @param token the token to revoke (may be access or refresh token) (required)
     * @param tokenTypeHint indicates type of token to revoke (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call revokeAccessTokenAsync(String token, String tokenTypeHint, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = revokeAccessTokenValidateBeforeCall(token, tokenTypeHint, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
