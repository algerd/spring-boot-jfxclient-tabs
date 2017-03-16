
package ru.javafx.jfxclient.example.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javax.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import ru.javafx.jfxclient.example.jfxintegrity.BaseFxmlController;
import ru.javafx.jfxclient.example.jfxintegrity.FXMLController;

/*
    Artist.fxml не имеет ссылки на этот контроллер, потому что он prototype. 
    Поэтому isRefControllerInFxml = false
*/
@FXMLController(title = "Artist", isRefControllerInFxml = false)
@Scope("prototype")
public class ArtistController extends BaseFxmlController {
    
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @PostConstruct
    public void info() {
        logger.info("created ArtistController");
    }
        
    @Override
    public void initialize(URL location, ResourceBundle resources) {       
    }
    
}
