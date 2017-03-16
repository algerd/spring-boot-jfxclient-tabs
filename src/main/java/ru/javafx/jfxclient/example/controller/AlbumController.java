
package ru.javafx.jfxclient.example.controller;

import java.net.URL;
import java.util.ResourceBundle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.javafx.jfxclient.example.jfxintegrity.BaseFxmlController;
import ru.javafx.jfxclient.example.jfxintegrity.FXMLController;
import javax.annotation.PostConstruct;

// singleton
@FXMLController(title = "Album")
public class AlbumController extends BaseFxmlController {
    
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @PostConstruct
    public void info() {
        logger.info("created AlbumController");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
        
}
