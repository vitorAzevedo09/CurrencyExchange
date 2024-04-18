package br.com.alura.currencyexchange;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    for (Currency currency : Currency.values()) {
      System.out.println(currency.getCode());
    }

    System.out.println("User input");

    String baseCode = scanner.nextLine();
    String targetCode = scanner.nextLine();
    BigDecimal amount = scanner.nextBigDecimal();

    ApiRequest apiRequest = new ApiRequest(args[0]);
    CurrencyExchanger currencyExchanger = new CurrencyExchanger(apiRequest);

    BigDecimal result = currencyExchanger.convert(baseCode, targetCode, amount);

    System.out.println(result);
    scanner.close();

  }
}
