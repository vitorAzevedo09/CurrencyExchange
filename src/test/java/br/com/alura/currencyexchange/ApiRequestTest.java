package br.com.alura.currencyexchange;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

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
    assertNotNull(response);
    assertEquals(response.base_code(), "USD");
    assertEquals(response.target_code(), "BRL");
  }
}
