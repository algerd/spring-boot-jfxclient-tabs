package ru.javafx.jfxclient.example.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.layout.StackPane;
import org.springframework.beans.factory.annotation.Autowired;
import ru.javafx.jfxclient.example.jfxintegrity.BaseFxmlController;
import ru.javafx.jfxclient.example.jfxintegrity.FXMLController;

@FXMLController(css = {"/styles/Styles.css"})
public class MainController extends BaseFxmlController implements Initializable {
      
    @Autowired
    private MenuController menuController;
    @Autowired
    private ExplorerController explorerController;
          
    @FXML
    private StackPane mainWindow;

    @Override
    public void initialize(URL location, ResourceBundle resources) {        
        System.out.println(menuController);
        System.out.println(explorerController);
    }
    
    public void show(Node view) {
        mainWindow.getChildren().clear();
        mainWindow.getChildren().add(view);
    }

    @Override
    public String toString() {
        return "MainController{" + '}';
    }
            
}
