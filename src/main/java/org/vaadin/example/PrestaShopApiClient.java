package org.vaadin.example; // Package della classe

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;
import java.util.stream.Collectors;

public class PrestaShopApiClient {

    private final String baseUrl; // URL base dell’API PrestaShop
    private final String apiKey;  // Chiave API per autenticazione

    // Costruttore: inizializza URL base e chiave API
    public PrestaShopApiClient(String baseUrl, String apiKey) {
        this.baseUrl = baseUrl;
        this.apiKey = apiKey;
    }

    // Esegue una richiesta GET per una risorsa   display completo
    public String get(String resource) throws IOException {
        String fullUrl = baseUrl + "/api/" + resource + "?display=full"; // Costruisce URL completo
        return getRaw(fullUrl); // Chiama metodo per effettuare richiesta HTTP e leggere risposta
    }

    // Esegue una GET per una risorsa specifica tramite ID (es. product/id)
    public String getById(String resource, String id) throws IOException {
        String fullUrl = baseUrl + "/api/" + resource + "/" + id; // URL specifico per risorsa ID
        return getRaw(fullUrl);
    }

    // Ottiene lo schema XML per una risorsa, indicando il tipo di schema (es. blank, synopsis)
    public String getSchema(String resource, String schemaType) throws IOException {
        String fullUrl = baseUrl + "/api/" + resource + "?schema=" + schemaType; // URL per schema
        return getRaw(fullUrl);
    }

    // Metodo interno che esegue una GET su un URL completo e ritorna la risposta come stringa
    public String getRaw(String fullUrl) throws IOException {
        System.out.println("➡️ Chiamata GET a: " + fullUrl);

        URL url = new URL(fullUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        String basicAuth = Base64.getEncoder().encodeToString((apiKey + ":").getBytes());
        connection.setRequestProperty("Authorization", "Basic " + basicAuth);
        connection.setRequestProperty("Accept", "application/xml");

        int responseCode = connection.getResponseCode();

        if (responseCode == 200) {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"))) {
                String response = reader.lines().collect(Collectors.joining("\n"));
                System.out.println("✅ Risposta XML:\n" + response);
                return response;
            }
        } else {
            System.err.println("❌ Errore HTTP " + responseCode + " durante GET su " + fullUrl);
            throw new IOException("Errore API PrestaShop: " + responseCode);
        }
    }

    // Prepara una connessione HTTP per metodi diversi da GET (POST, PUT, DELETE)
    public HttpURLConnection prepareConnection(String endpoint, String method, boolean doOutput) throws IOException {
        String url = baseUrl + "/api/" + endpoint; // Costruisce URL completo per l’endpoint
        HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection(); // Apre connessione
        connection.setRequestMethod(method); // Imposta metodo HTTP (POST, PUT, ecc)

        // Imposta header per autenticazione Basic (API key)
        connection.setRequestProperty("Authorization", "Basic " +
                Base64.getEncoder().encodeToString((apiKey + ":").getBytes()));
        connection.setRequestProperty("Content-Type", "application/xml; charset=UTF-8"); // Tipo contenuto XML

        connection.setDoOutput(doOutput); // Indica se ci sarà output (es. scrittura body POST/PUT)
        return connection; // Ritorna connessione pronta
    }

    // Getter per URL base
    public String getBaseUrl() {
        return baseUrl;
    }

    // Getter per chiave API
    public String getApiKey() {
        return apiKey;
    }
}
