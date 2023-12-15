package main;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import main.controllers.*;


import java.math.BigDecimal;
import java.net.URL;
import java.util.ResourceBundle;

public class MainWindowController implements Initializable {

    public StringBuilder equation = new StringBuilder();
    public ObservableList<String> historyList = FXCollections.observableArrayList();
    @FXML
    public TextField display;

    @FXML
    public ListView<String> display2;

    @FXML
    public Button one, two, three, four, five, six, seven, eight, nine, zero;

    @FXML
    public Button plus, minus, multiply, divide, equals,racine;

    @FXML
    public Button clean,Delete,point,negatif;

    @FXML
    public Button hclean;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        display2.setItems(historyList);
    }


    @FXML
    private void handleButtonAction(ActionEvent event) {
        Button clickedButton = (Button) event.getSource();

        if (clickedButton == hclean) {
            HistoryCleanController historyCleanController = new HistoryCleanController();
            historyCleanController.Hclean(historyList,display2);
        }
        if (clickedButton == clean) {
            CleanController cleanController = new CleanController();
            cleanController.clean(equation,display);
        }
        else if (clickedButton == Delete) {
            if (equation.length() > 0) {
                DeleteController deleteController = new DeleteController();
                deleteController.delete(equation,display);
            }
        }
        else if (clickedButton == point) {
            PointController pointController = new PointController();
            pointController.Point(equation,display,point);
        }



        else if (clickedButton == one || clickedButton == two || clickedButton == three ||
                clickedButton == four || clickedButton == five || clickedButton == six ||
                clickedButton == seven || clickedButton == eight || clickedButton == nine ||
                clickedButton == zero) {

            ChiffresController chiffresController = new ChiffresController();
            chiffresController.Chiffre(display,equation,clickedButton);

        }

        else if (clickedButton == plus || clickedButton == minus ||
                clickedButton == multiply || clickedButton == divide) {
           OperatorsController operatorsController = new OperatorsController();
           operatorsController.Operators(equation,clickedButton,display);

        }

        else if (clickedButton == equals) {
            EqualsController equalsController = new EqualsController();
            equalsController.Equals( equation,  historyList, display);
        }

        else if (clickedButton == racine) {
            RacineController racineController = new RacineController();
            racineController.Racine(equation,historyList,display);
        }

        else if (clickedButton == negatif){
            AddNegatifController addNegatifController = new AddNegatifController();
            addNegatifController.AddNegatif(equation,display);
        }
    }


    public void init(Stage stage) {

    }
}