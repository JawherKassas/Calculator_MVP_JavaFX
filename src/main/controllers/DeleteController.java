package main.controllers;

import javafx.scene.control.TextField;

public class DeleteController {

    public void delete(StringBuilder equation, TextField display) {
        equation.deleteCharAt(equation.length() - 1);
        display.setText(equation.toString());
    }
}

