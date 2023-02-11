package arquitectura.software.demo.api;

import arquitectura.software.demo.dto.RequestDto;
import arquitectura.software.demo.dto.ResponseDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import arquitectura.software.demo.bl.CurrencyBl;

import java.math.BigDecimal;
import java.util.Map;

@RestController
@RequestMapping("api/v1/currency")
public class CurrencyApi {

    private static Logger logger = LoggerFactory.getLogger(CurrencyApi.class);
    private CurrencyBl currencyBl;

    public CurrencyApi(CurrencyBl currencyBl) {
        this.currencyBl = currencyBl;
    }

    @GetMapping("/obtain")
    public ResponseEntity<ResponseDto<RequestDto>> obtain(@RequestParam String from, @RequestParam String to, @RequestParam BigDecimal amount) throws Exception {
        logger.info("Obtain currency from: " + from + " to: " + to + " amount: " + amount);
        RequestDto requestDto = currencyBl.obtain(from, to, amount);
        ResponseDto<RequestDto> responseDto = new ResponseDto<RequestDto>(requestDto, true, "Success");
        return ResponseEntity.ok(responseDto);
    }
}
