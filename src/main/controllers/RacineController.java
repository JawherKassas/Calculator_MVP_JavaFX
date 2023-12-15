package main.controllers;

import javafx.collections.ObservableList;
import javafx.scene.control.TextField;

public class RacineController {
    public void Racine (StringBuilder equation, ObservableList<String> historyList, TextField display){
        try {
            double value = Double.parseDouble(equation.toString());
            double sqrtResult = Math.sqrt(value);
            historyList.add("√" + value + " = " + String.format("%.2f", sqrtResult));
            equation.setLength(0);
            equation.append(sqrtResult);
            display.setText(String.valueOf(String.format("%.2f", sqrtResult)));
        } catch (NumberFormatException e) {
            display.setText("ERROR");
        }
    }
}
