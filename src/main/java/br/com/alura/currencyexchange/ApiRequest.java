package br.com.alura.currencyexchange;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * ApiRequest
 */
public class ApiRequest {

  private String url = "";

  ApiRequest() {
    this.url = System.getProperty("apiUrl");
  }

  public int request() {
    System.out.println("Request URL: " + url);
    HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create(url))
        .build();
    try {
      HttpResponse<String> response = HttpClient.newHttpClient()
          .send(request, HttpResponse.BodyHandlers.ofString());
      return response.statusCode();
    } catch (Exception e) {
      System.err.println("Error: " + e.getMessage());
      return 0;
    }
  }

}
