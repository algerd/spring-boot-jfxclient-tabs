
package ru.javafx.jfxclient.example.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import ru.javafx.jfxclient.example.Main;
import ru.javafx.jfxclient.example.jfxintegrity.BaseFxmlController;
import ru.javafx.jfxclient.example.jfxintegrity.FXMLController;

@FXMLController
@Scope("prototype")
public class DialogController extends BaseFxmlController implements Initializable {
    
    @Autowired
    private Main main;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }

}
