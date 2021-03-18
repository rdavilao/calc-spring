/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.calculator.api;

import ec.edu.espe.calculator.service.CalculatorService;
import java.math.BigDecimal;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/api/calculator")
@Slf4j

public class CalculatorController {

    private final CalculatorService service;

    public CalculatorController(CalculatorService service) {
        this.service = service;
    }

    @GetMapping("/add")
    public ResponseEntity add(@RequestParam BigDecimal number1, @RequestParam BigDecimal number2) {
        try {
            return ResponseEntity.ok(this.service.add(number1, number2));
        } catch (Exception ex) {
            return ResponseEntity.badRequest().build();
        }
    }
    
    @GetMapping("/substract")
    public ResponseEntity substract(@RequestParam BigDecimal number1, @RequestParam BigDecimal number2) {
        try {
            return ResponseEntity.ok(this.service.substract(number1, number2));
        } catch (Exception ex) {
            return ResponseEntity.badRequest().build();
        }
    }
    
    @GetMapping("/multiply")
    public ResponseEntity multiply(@RequestParam BigDecimal number1, @RequestParam BigDecimal number2) {
        try {
            return ResponseEntity.ok(this.service.multiply(number1, number2));
        } catch (Exception ex) {
            return ResponseEntity.badRequest().build();
        }
    }
    
    @GetMapping("/divide")
    public ResponseEntity divide(@RequestParam BigDecimal number1, @RequestParam BigDecimal number2) {
        try {
            return ResponseEntity.ok(this.service.divide(number1, number2));
        } catch (Exception ex) {
            return ResponseEntity.badRequest().build();
        }
    }
}
