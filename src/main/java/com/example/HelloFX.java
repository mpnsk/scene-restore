package com.example;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.InputStream;

public class HelloFX extends Application {
    public static Stage stage;
    public static Scene lastScene;

    @Override
    public void start(Stage stage) throws IOException {
        HelloFX.stage = stage;
        Parent root = FXMLLoader.load(getClass().getResource("/com/example/scene/first.fxml"));
        stage.setScene(new Scene(root));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}