package br.com.alura.currencyexchange;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Transactions
 */
public record Transactions(BigDecimal amount,
    Currency baseCurrency,
    Currency targetCurrency,
    BigDecimal result,
    String date,
    LocalDateTime time) {
}
