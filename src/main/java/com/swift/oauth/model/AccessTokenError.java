/*
 * SWIFT Cloud Gateway OAuth Token API
 * OAuth token operations for SWIFT Cloud Gateway
 */

package com.swift.oauth.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * AccessTokenError
 */
public class AccessTokenError {
  /**
   * standard OAuth token grant error codes (see RFC 6749)
   */
  @JsonAdapter(ErrorEnum.Adapter.class)
  public enum ErrorEnum {
    INVALID_REQUEST("invalid_request"),
    
    INVALID_CLIENT("invalid_client"),
    
    INVALID_GRANT("invalid_grant"),
    
    UNSUPPORTED_GRANT_TYPE("unsupported_grant_type"),
    
    INVALID_SCOPE("invalid_scope"),
    
    TEMPORARILY_UNAVAILABLE("temporarily_unavailable");

    private String value;

    ErrorEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ErrorEnum fromValue(String text) {
      for (ErrorEnum b : ErrorEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ErrorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ErrorEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ErrorEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ErrorEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("error")
  private ErrorEnum error = null;

  @SerializedName("error_description")
  private String errorDescription = null;

  public AccessTokenError error(ErrorEnum error) {
    this.error = error;
    return this;
  }

   /**
   * standard OAuth token grant error codes (see RFC 6749)
   * @return error
  **/
  @ApiModelProperty(example = "invalid_client", required = true, value = "standard OAuth token grant error codes (see RFC 6749)")
  public ErrorEnum getError() {
    return error;
  }

  public void setError(ErrorEnum error) {
    this.error = error;
  }

  public AccessTokenError errorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
    return this;
  }

   /**
   * English description of the error
   * @return errorDescription
  **/
  @ApiModelProperty(example = "Client application can't be authenticated", required = true, value = "English description of the error")
  public String getErrorDescription() {
    return errorDescription;
  }

  public void setErrorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessTokenError accessTokenError = (AccessTokenError) o;
    return Objects.equals(this.error, accessTokenError.error) &&
        Objects.equals(this.errorDescription, accessTokenError.errorDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, errorDescription);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessTokenError {\n");
    
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    errorDescription: ").append(toIndentedString(errorDescription)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

