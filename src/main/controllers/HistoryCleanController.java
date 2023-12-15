package main.controllers;

import javafx.collections.ObservableList;
import javafx.scene.control.ListView;

public class HistoryCleanController {
    public void Hclean (ObservableList<String> historyList , ListView<String> display2){
        historyList.clear();
    }
}
