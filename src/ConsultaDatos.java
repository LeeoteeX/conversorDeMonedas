import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaDatos {
    public double consulta(String monedaOrigen, String monedaComparar){
        String key = "7f7bda4ce2874f21b1a40f3a";
        double convertido = 0;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/"+key+"/latest/"+monedaOrigen))
                .build();
        Gson gson = new Gson().newBuilder().setPrettyPrinting().create();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String json;
            json = response.body();
            TipoMonedas tipoMonedas = gson.fromJson(json,TipoMonedas.class);
            System.out.println(tipoMonedas);
            switch (monedaComparar){
                case "USD": convertido = tipoMonedas.USD();
                break;
                case "ARS": convertido = tipoMonedas.ARS();
                break;
                case "EUR": convertido = tipoMonedas.EUR();
                break;
                case "CLP": convertido = tipoMonedas.CLP();
                break;
                case "RSD": convertido = tipoMonedas.RSD();
                break;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return convertido;
    }
}
