package com.example.scene;

import com.example.HelloFX;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Second {
    public void goBack(ActionEvent actionEvent) throws IOException {
        Stage stage = HelloFX.stage;
        stage.setScene(HelloFX.lastScene);
    }
}
