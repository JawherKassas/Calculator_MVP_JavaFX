package main.controllers;

import javafx.scene.control.TextField;
import javafx.scene.control.Button;

public class ChiffresController {

    public void Chiffre (TextField display , StringBuilder equation,Button clickedButton){
        equation.append(clickedButton.getText());
        display.setText(equation.toString());
    }
}
