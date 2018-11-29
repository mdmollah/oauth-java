/*
 * SWIFT Cloud Gateway OAuth Token API
 * OAuth token operations for SWIFT Cloud Gateway
 */

package com.swift.oauth.auth;

import com.swift.oauth.Pair;

import java.util.Map;
import java.util.List;

public interface Authentication {
    /**
     * Apply authentication settings to header and query params.
     *
     * @param queryParams List of query parameters
     * @param headerParams Map of header parameters
     */
    void applyToParams(List<Pair> queryParams, Map<String, String> headerParams);
}
