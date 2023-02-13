package arquitectura.software.demo.bl;

import arquitectura.software.demo.dto.CurrencyDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.math.BigDecimal;


@Service
public class CurrencyBl {
    public CurrencyDto obtain(String from, String to, BigDecimal amount) throws IOException {
    if(amount.compareTo(BigDecimal.ZERO) <= 0){
        throw new IllegalArgumentException("The change amount must be greater than 0 and not equal to 0");
    }
        OkHttpClient client = new OkHttpClient().newBuilder().build();

        Request request = new Request.Builder()
                .url("https://api.apilayer.com/exchangerates_data/convert?from=" + from + "&to=" + to + "&amount=" + amount)
                .addHeader("apikey", "bOv9VzwtvbtNuPhxLT3oZ5Xat8qE8ufB")
                //.method("GET", null)
                .build();
        Response response = client.newCall(request).execute();
        String result = response.body().string();

        //parsear la respuesta con jackson
        ObjectMapper mapper = new ObjectMapper();
        CurrencyDto currencyDto= mapper.readValue(result, CurrencyDto.class);
        return currencyDto;
    }
}
