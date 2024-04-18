package br.com.alura.currencyexchange;

public enum Currency {

  ARS("Argentine Peso", "ARS"),
  BOB("Bolivian Peso", "BOB"),
  BRL("Brazilian Real", "BRL"),
  CLP("Chilean Peso", "CLP"),
  COP("Colombian Peso", "COP"),
  USD("US Dollar", "USD");

  private String description;
  private String code;

  Currency(String description, String code) {
    this.description = description;
    this.code = code;
  }

  public String getDescription() {
    return description;
  }

  public String getCode() {
    return code;
  }

}
