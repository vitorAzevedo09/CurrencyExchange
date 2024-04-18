package br.com.alura.currencyexchange;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CurrencyTest {

  @Test
  public void WhenUSD_shouldReturnDescription() {
    assertEquals("USD", Currency.USD.getCode());
  }

  @Test
  public void whenBRL_shouldReturnDescription() {
    assertEquals("Brazilian Real", Currency.BRL.getDescription());
  }
}
