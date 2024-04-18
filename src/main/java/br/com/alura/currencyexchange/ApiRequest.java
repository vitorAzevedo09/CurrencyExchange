package br.com.alura.currencyexchange;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;

/**
 * ApiRequest
 */
public class ApiRequest {

  private String url = "";

  ApiRequest() {
    this.url = System.getProperty("apiUrl");
  }

  ApiRequest(String apiUrl) {
    this.url = apiUrl;
  }

  public CurrencyExchangeResponse getConversionCurrencyFromBaseToTarget(String baseCode, String targetCode) {

    HttpRequest request = buildRequest(baseCode, targetCode); // building the request

    try {
      HttpResponse<String> response = HttpClient.newHttpClient()
          .send(request, HttpResponse.BodyHandlers.ofString()); // sending the request

      Gson gson = new Gson(); // creating a new gson object

      return gson.fromJson(response.body(), CurrencyExchangeResponse.class); // returning the response body
    } catch (Exception e) {
      System.err.println("Error: " + e.getMessage());
      return null;
    }
  }

  private HttpRequest buildRequest(String baseCode, String targetCode) {
    String pair_url = String.format(url + "/pair/%s/%s", baseCode, targetCode); // building the url
    System.out.println(pair_url);

    return HttpRequest.newBuilder()
        .uri(URI.create(pair_url))
        .build(); // building the request object to send adding exchange api url
  }

}
