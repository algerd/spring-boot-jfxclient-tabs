
package ru.javafx.jfxclient.example.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import org.springframework.context.annotation.Scope;
import ru.javafx.jfxclient.example.jfxintegrity.BaseFxmlController;
import ru.javafx.jfxclient.example.jfxintegrity.FXMLController;

@FXMLController
@Scope("prototype")
public class ArtistController extends BaseFxmlController implements Initializable {
    
    public ArtistController() {
        super();
        super.setTitle("Artist");
    }
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {       
    }
    
}
