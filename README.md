# oauth java client [![Build Status](https://travis-ci.com/swiftinc/oauth-java.svg?branch=master)](https://travis-ci.com/swiftinc/oauth-java)


## Overview

The client classes are generated by swagger-codegen, we added unit tests, example tests and a helper class to help you consume the OAUTH API.

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
    <artifactId>oauth-sdk</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/oauth-sdk-1.0.0.jar

## Example for API Endpoints

All URIs are relative to *https://sandbox.swift.com/oauth2/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**getAccessToken**](docs/DefaultApi.md#getAccessToken) | **POST** /token | Obtain OAuth tokens needed to access APIs.
*DefaultApi* | [**revokeAccessToken**](docs/DefaultApi.md#revokeAccessToken) | **POST** /revoke | Dispose of tokens and invalidate access to APIs.


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

Hassan.MOLLAH@swift.com


