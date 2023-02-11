package arquitectura.software.demo.bl;

import arquitectura.software.demo.dto.RequestDto;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.math.BigDecimal;


@Service
public class CurrencyBl {

    public RequestDto obtain(String from, String to, BigDecimal amount) throws IOException {

        OkHttpClient client = new OkHttpClient().newBuilder().build();

        Request request = new Request.Builder()
                .url("https://api.apilayer.com/exchangerates_data/convert?from=" + from + "&to=" + to + "&amount=" + amount)
                .addHeader("apikey", "bOv9VzwtvbtNuPhxLT3oZ5Xat8qE8ufB")
                .method("GET", null)
                .build();
        Response response = client.newCall(request).execute();
        System.out.println(response.body().string());
        return null;
    }

}
