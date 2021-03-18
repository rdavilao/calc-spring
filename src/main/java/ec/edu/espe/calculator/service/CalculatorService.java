/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.calculator.service;

import ec.edu.espe.calculator.exception.OperatorException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service

public class CalculatorService {

    public BigDecimal add(BigDecimal number1, BigDecimal number2) throws OperatorException {        
        try {
            return new BigDecimal(number1.add(number2).toString());
        } catch (Exception e) {
            throw new OperatorException("add", "Falla en la suma, " + e);
        }
    }

    public BigDecimal substract(BigDecimal number1, BigDecimal number2) throws OperatorException {        
        try {
            return new BigDecimal(number1.subtract(number2).toString());
        } catch (Exception e) {
            throw new OperatorException("substract", "Falla en la resta, " + e);
        }
    }

    public BigDecimal multiply(BigDecimal number1, BigDecimal number2) throws OperatorException {
        try {
            return new BigDecimal(number1.multiply(number2).toString());
        } catch (Exception e) {
            throw new OperatorException("multiply", "Falla en la multiplicacion, " + e);
        }
    }

    public BigDecimal divide(BigDecimal number1, BigDecimal number2) throws OperatorException {
        try {
            return new BigDecimal(number1.divide(number2, 4, RoundingMode.CEILING).toString());
        } catch (Exception e) {
            throw new OperatorException("divide", "Falla en la división, " + e);
        }
    }
}
