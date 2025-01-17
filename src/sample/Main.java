package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("toolproto1.fxml"));
        primaryStage.setTitle("BotanikApp Datenbank Tool");
        primaryStage.setScene(new Scene(root, 900, 800));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
