package br.com.alura.currencyexchange;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.net.http.HttpClient;

import org.junit.jupiter.api.Test;

/**
 * ApiRequestTest
 */
public class ApiRequestTest {

  public ApiRequest apiRequest;

  ApiRequestTest(ApiRequest apiRequest) {
    this.apiRequest = apiRequest;
  }

  @Test
  private void testApiRequest() {
    HttpClient client = apiRequest.request();
    assertEquals(HttpClient.class, client.getClass());
  }
}
