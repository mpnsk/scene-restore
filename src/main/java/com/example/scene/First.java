package com.example.scene;

import com.example.HelloFX;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class First {
    public void changeScene(ActionEvent actionEvent) throws IOException {
        Stage stage = HelloFX.stage;
        HelloFX.lastScene = stage.getScene();
        Parent root = FXMLLoader.load(getClass().getResource("/com/example/scene/second.fxml"));
        stage.setScene(new Scene(root, 300, 300));
        stage.show();
    }
}
