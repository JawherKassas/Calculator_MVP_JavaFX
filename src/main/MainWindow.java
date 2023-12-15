package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class MainWindow extends Application {
    @Override
public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MainWindowInterface.fxml"));
        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Calculator");
        stage.show();
        Image image = new Image("/images/icon.png");
        stage.getIcons().add(image);
        ((MainWindowController)loader.getController()).init(stage);

    }
    public void run(){launch();}
}
