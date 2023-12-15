package main.controllers;

import javafx.scene.control.TextField;

public class CleanController {
    public void clean(StringBuilder equation, TextField display){
        equation.setLength(0);
        display.clear();
    }
}
