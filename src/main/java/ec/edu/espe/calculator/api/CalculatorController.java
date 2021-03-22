package ec.edu.espe.calculator.api;

import ec.edu.espe.calculator.service.CalculatorService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import java.math.BigDecimal;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/calculator")
@Slf4j
public class CalculatorController {

    private final CalculatorService service;

    public CalculatorController(CalculatorService service) {
        this.service = service;
    }

    @GetMapping("/add")
    @ApiOperation(value = "Suma de dos números", notes = "Se suma dos numeros y se devuelve su respuesta")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Numeros sumados"),
            @ApiResponse(code = 500, message = "Internal Server Error")
    })
    public ResponseEntity add(@RequestParam BigDecimal number1, @RequestParam BigDecimal number2) {
        try {
            return ResponseEntity.ok(this.service.add(number1, number2));
        } catch (Exception ex) {
            return ResponseEntity.badRequest().build();
        }
    }
    
    @GetMapping("/substract")
    @ApiOperation(value = "Resta de dos números", notes = "Se resta dos numeros y se devuelve su respuesta")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Numeros restados"),
            @ApiResponse(code = 500, message = "Internal Server Error")
    })
    public ResponseEntity substract(@RequestParam BigDecimal number1, @RequestParam BigDecimal number2) {
        try {
            return ResponseEntity.ok(this.service.substract(number1, number2));
        } catch (Exception ex) {
            return ResponseEntity.badRequest().build();
        }
    }
    
    @GetMapping("/multiply")
    @ApiOperation(value = "Multiplicacion de dos números",
            notes = "Se multiplica dos numeros y se devuelve su respuesta")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Numeros multiplicados"),
            @ApiResponse(code = 500, message = "Internal Server Error")
    })
    public ResponseEntity multiply(@RequestParam BigDecimal number1, @RequestParam BigDecimal number2) {
        try {
            return ResponseEntity.ok(this.service.multiply(number1, number2));
        } catch (Exception ex) {
            return ResponseEntity.badRequest().build();
        }
    }
    
    @GetMapping("/divide")
    @ApiOperation(value = "Divide de dos números", notes = "Se divide dos numeros y se devuelve su respuesta")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Numeros divididos"),
            @ApiResponse(code = 500, message = "Internal Server Error")
    })
    public ResponseEntity divide(@RequestParam BigDecimal number1, @RequestParam BigDecimal number2) {
        try {
            return ResponseEntity.ok(this.service.divide(number1, number2));
        } catch (Exception ex) {
            return ResponseEntity.badRequest().build();
        }
    }
}
