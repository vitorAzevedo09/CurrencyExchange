package br.com.alura.currencyexchange;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

/**
 * CurrencyExchanger
 */
public class CurrencyExchangerTest {

  @Test
  public void whenGetConversionRate_thenReturnRate() {

    CurrencyExchangeResponse mockResponse = buildResponseBody();
    ApiRequest apiRequest = Mockito.mock(ApiRequest.class);
    CurrencyExchanger currencyExchanger = new CurrencyExchanger(apiRequest);

    when(apiRequest.getConversionCurrencyFromBaseToTarget("USD", "BRL")).thenReturn(mockResponse);

    assertEquals(mockResponse.conversion_rate(),
        currencyExchanger.getConversionRate("USD", "BRL"));

  }

  private CurrencyExchangeResponse buildResponseBody() {

    return new CurrencyExchangeResponse("success", "documentation", "terms_of_use",
        BigInteger.ZERO, BigInteger.ZERO, "today", "today", "USD", "BRL", BigDecimal.ONE);
  }

}
