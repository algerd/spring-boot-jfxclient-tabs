
package ru.javafx.jfxclient.example.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javax.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import ru.javafx.jfxclient.example.jfxintegrity.BaseFxmlController;
import ru.javafx.jfxclient.example.jfxintegrity.FXMLController;

@FXMLController(isRefControllerInFxml = false)
@Scope("prototype")
public class DialogController extends BaseFxmlController {
    
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @PostConstruct
    public void info() {
        logger.info("created DialogController");
    }
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        setTitle("Dialog");
    }

}
