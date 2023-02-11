package arquitectura.software.demo.exceptions;

import arquitectura.software.demo.dto.ResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerExceptions {
    /**
     * Maneja la excepcion de tipo IllegalArgumentException
     * @param e
     * @return
     */
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<ResponseDto> zeroException(IllegalArgumentException e) {
        ResponseDto responseDto = new ResponseDto(null, false, e.getMessage());
        return ResponseEntity.badRequest().body(responseDto);
    }
}
