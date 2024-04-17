package br.com.alura.currencyexchange;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * ApiRequestTest
 */
public class ApiRequestTest {

  private ApiRequest apiRequest;

  ApiRequestTest() {
    this.apiRequest = new ApiRequest();
  }

  @Test
  public void whenRequestURL_then200() {
    int statusCode = apiRequest.request();
    assertEquals(200, statusCode);
  }
}
