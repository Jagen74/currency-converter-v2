package com.aluracursos.conversor.modelos;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiClient {

    public CurrencyData conversion (String currBase, String currTarget, double amount){

        // Crea una variable de entorno con tu apiKey para mayor seguridad.
        String apiKey = System.getenv("API_KEY");

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/"
                + currBase + "/" + currTarget + "/" + amount);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), CurrencyData.class);
        } catch (Exception e) {
            throw new RuntimeException("Error en la conversión");
        }
    }
}