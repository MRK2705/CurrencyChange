package arquitectura.software.demo.api;

import arquitectura.software.demo.dto.CurrencyDto;
import arquitectura.software.demo.dto.ResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import arquitectura.software.demo.bl.CurrencyBl;

import java.math.BigDecimal;
@RestController
@RequestMapping("api/v1/currency")
public class CurrencyApi {
    private CurrencyBl currencyBl;

    public CurrencyApi(CurrencyBl currencyBl) {
        this.currencyBl = currencyBl;
    }

    @GetMapping("/obtain")
    public ResponseEntity<ResponseDto<CurrencyDto>> obtain(@RequestParam String from, @RequestParam String to, @RequestParam BigDecimal amount) throws Exception {
        CurrencyDto currencyDto = currencyBl.obtain(from, to, amount);
        ResponseDto<CurrencyDto> responseDto = new ResponseDto<CurrencyDto>(currencyDto, true, "Success");
        return ResponseEntity.ok(responseDto);
    }
}
