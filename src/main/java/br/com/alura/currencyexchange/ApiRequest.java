package br.com.alura.currencyexchange;

import java.net.http.HttpClient;

/**
 * ApiRequest
 */
public class ApiRequest {

  public HttpClient request() {
    return HttpClient.newHttpClient();
  }

}
