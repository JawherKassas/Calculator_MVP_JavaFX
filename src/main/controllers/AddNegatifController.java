package main.controllers;

import javafx.scene.control.TextField;
import java.math.BigDecimal;

public class AddNegatifController {
    public void AddNegatif(StringBuilder equation, TextField display){
        if (equation.length() > 0) {
            char lastChar = equation.charAt(equation.length() - 1);
            if (Character.isDigit(lastChar)) {

                int lastIndex = equation.length() - 1;
                while (lastIndex >= 0 && Character.isDigit(equation.charAt(lastIndex))) {
                    lastIndex--;
                }
                lastIndex++;
                String currentNumber = equation.substring(lastIndex);
                BigDecimal negatedNumber = new BigDecimal(currentNumber).negate();
                equation.replace(lastIndex, equation.length(), negatedNumber.toPlainString());
                display.setText(equation.toString());
            }
        }
    }
}


