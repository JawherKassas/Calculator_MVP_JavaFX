package main.controllers;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.math.BigDecimal;

public class OperatorsController {
    public void Operators (StringBuilder equation, Button clickedButton, TextField display){
        if (!equation.toString().isEmpty()) {
            equation.append(" ").append(clickedButton.getText()).append(" ");
            display.setText(equation.toString());
        }
    }

    public BigDecimal performeOperations(BigDecimal operand1, BigDecimal operand2, String operator , TextField display){
        switch (operator) {
            case "+":
                return operand1.add(operand2);
            case "-":
                return operand1.subtract(operand2);
            case "*":
                return operand1.multiply(operand2);
            case "/":
                if (!operand2.equals(BigDecimal.ZERO)) {
                    return operand1.divide(operand2, 10, BigDecimal.ROUND_HALF_UP);
                } else {
                    display.setText("ERROR");
                    return BigDecimal.ZERO;
                }
            default:
                return BigDecimal.ZERO;
        }
    }
}
