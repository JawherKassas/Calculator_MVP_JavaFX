package main.controllers;

import javafx.scene.control.TextField;
import javafx.scene.control.Button;


public class PointController {

    private boolean isLastCharOperator(StringBuilder equation) {
        if (equation.length() > 0) {
            char lastChar = equation.charAt(equation.length() - 1);
            return lastChar == '+' || lastChar == '-' || lastChar == '*' || lastChar == '/';
        }
        return false;
    }
    public void Point(StringBuilder equation, TextField display, Button point) {
        if (equation.length() == 0 || isLastCharOperator(equation)) {
            equation.append(".");
        }

        String[] parts = equation.toString().split(" ");
        String lastPart = parts[parts.length - 1];
        if (!lastPart.contains(".")) {
            equation.append(point.getText());
            display.setText(equation.toString());
        }
    }
}
