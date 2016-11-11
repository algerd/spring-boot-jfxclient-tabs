
package ru.javafx.jfxclient.example.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import org.springframework.context.annotation.Scope;
import ru.javafx.jfxclient.example.jfxintegrity.BaseFxmlController;
import ru.javafx.jfxclient.example.jfxintegrity.FXMLController;

@FXMLController(title = "Album")
@Scope("prototype")
public class AlbumController extends BaseFxmlController implements Initializable {

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
        
}
