package br.com.alura.currencyexchange;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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
    CurrencyExchangeResponse response = apiRequest.getConversionCurrencyFromBaseToTarget("USD", "BRL");
    assertNotEquals(response, null);
    assertEquals(response.base_code(), "USD");
    assertEquals(response.target_code(), "BRL");
  }
}
