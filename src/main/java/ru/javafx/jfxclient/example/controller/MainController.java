package ru.javafx.jfxclient.example.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import org.springframework.beans.factory.annotation.Autowired;
import ru.javafx.jfxclient.example.jfxintegrity.BaseFxmlController;
import ru.javafx.jfxclient.example.jfxintegrity.FXMLController;
import ru.javafx.jfxclient.example.jfxintegrity.Loadable;
import ru.javafx.jfxclient.example.utils.TabPaneDetacher;

@FXMLController(css = {"/styles/Styles.css"})
public class MainController extends BaseFxmlController implements Initializable {
      
    @Autowired
    private MenuController menuController;
    @Autowired
    private ExplorerController explorerController;
          
    @FXML
    private TabPane tabPane;

    @Override
    public void initialize(URL location, ResourceBundle resources) {        
        System.out.println(menuController);
        System.out.println(explorerController);
        TabPaneDetacher.create().makeTabsDetachable(tabPane);
    }
    
    public void show(Loadable controller) {
        Tab tab = new Tab();
        tab.setClosable(true); 
        tab.textProperty().bind(controller.titleProperty());
        tab.setContent(controller.getView());     
        tabPane.getTabs().add(tab);       
    }

    @Override
    public String toString() {
        return "MainController{" + '}';
    }
            
}
