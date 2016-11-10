
package ru.javafx.jfxclient.example;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class RunTabPaneDetacherDemo extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/TabPaneDetacherDemo.fxml"));

        Scene scene = new Scene(root);
        scene.getStylesheets().add("/styles/shichimifx.css");
        stage.setTitle("TabPaneDetacher Demo");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
