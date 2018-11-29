# oauth-java [![Build Status](https://travis-ci.com/swiftinc/oauth-java.svg?branch=master)](https://travis-ci.com/swiftinc/oauth-java)

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.swift.oauth</groupId>
    <artifactId>oauth-java</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.swift.oauth:oauth-java:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/oauth-java-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.swift.oauth.*;
import com.swift.oauth.auth.*;
import com.swift.oauth.model.*;
import com.swift.oauth.api.DefaultApi;

import java.io.File;
import java.util.*;

public class DefaultApiExample {

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
        String refreshToken = "refreshToken_example"; // String | refresh token (Required for refreshing token)
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

```

## Documentation for API Endpoints

All URIs are relative to *https://sandbox.swift.com/oauth2/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**getAccessToken**](docs/DefaultApi.md#getAccessToken) | **POST** /token | token grant or refresh request
*DefaultApi* | [**revokeAccessToken**](docs/DefaultApi.md#revokeAccessToken) | **POST** /revoke | token revoke request


## Documentation for Models

 - [AccessTokenError](docs/AccessTokenError.md)
 - [AccessTokenResponse](docs/AccessTokenResponse.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### clientAuth

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



