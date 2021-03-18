/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.calculator.exception;

public class OperatorException extends Exception {

     private final String operationName;
    
    public OperatorException(String message, String operationName) {
        super(message);
        this.operationName = operationName;
    }
    
    public OperatorException(String operationName, String message, Throwable cause) {
        super(message, cause);
        this.operationName = operationName;
    }

    public String getOperationName() {
        return operationName;
    }    
}
