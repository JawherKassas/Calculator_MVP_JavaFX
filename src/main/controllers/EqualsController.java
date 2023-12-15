package main.controllers;

import javafx.collections.ObservableList;
import javafx.scene.control.TextField;
import java.math.BigDecimal;

public class EqualsController {

    private BigDecimal performOperation(BigDecimal operand1, BigDecimal operand2, String operator , TextField display) {
        OperatorsController operatorsController = new OperatorsController();
        return operatorsController.performeOperations(operand1,operand2,operator,display);
    }
    public void Equals (StringBuilder equation, ObservableList<String> historyList, TextField display){
        if (!equation.toString().isEmpty()) {
            String[] parts = equation.toString().split(" ");
            if (parts.length % 2 == 1) {
                BigDecimal result = new BigDecimal(parts[0]);

                for (int i = 1; i < parts.length; i += 2) {
                    String operator = parts[i];
                    BigDecimal operand = new BigDecimal(parts[i + 1]);
                    result = performOperation(result, operand, operator , display);
                }

                historyList.add(equation.toString());
                historyList.add("= " + result);
                equation.setLength(0);
                equation.append(result);
                display.setText(result.stripTrailingZeros().toPlainString());
            }
        }

    }
}
