package br.com.alura.currencyexchange;

import java.math.BigDecimal;

class CurrencyExchanger {

  private ApiRequest apiRequest = new ApiRequest();

  CurrencyExchanger() {
  }

  CurrencyExchanger(ApiRequest apiRequest) {
    this.apiRequest = apiRequest;
  }

  public BigDecimal getConversionRate(String baseCode, String targetCode) {

    CurrencyExchangeResponse response = apiRequest
        .getConversionCurrencyFromBaseToTarget(baseCode, targetCode);

    return response.conversion_rate();

  }

  public BigDecimal convert(String baseCode, String targetCode, BigDecimal amount) {
    return amount.multiply(getConversionRate(baseCode, targetCode));
  }
}
