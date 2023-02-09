package arquitectura.software.demo.bl;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.math.BigDecimal;


@Service
public class CurrencyBl {

    public static void obtain(String from, String to, BigDecimal amount) throws IOException {

        OkHttpClient client = new OkHttpClient().newBuilder().build();

        Request request = new Request.Builder()
                .url("https://api.apilayer.com/exchangerates_data/convert?to=USD&from=BOB&amount=1000")
                .addHeader("apikey", "bOv9VzwtvbtNuPhxLT3oZ5Xat8qE8ufB")
                .method("GET", null)
                .build();
        System.out.println("hola");
        Response response = client.newCall(request).execute();
        System.out.println(response.body().string());
    }

}
