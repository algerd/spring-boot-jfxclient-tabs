package ru.javafx.jfxclient.example.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import org.springframework.beans.factory.annotation.Autowired;
import ru.javafx.jfxclient.example.jfxintegrity.BaseFxmlController;
import ru.javafx.jfxclient.example.jfxintegrity.FXMLController;

@FXMLController(loadable = false)
public class ExplorerController extends BaseFxmlController implements Initializable {
    
    @FXML
    private AnchorPane explorer;
    
    @Autowired
    private MainController parentController;
    
    @Autowired
    private RequestViewService requestViewService;

    @Override
    public void initialize(URL url, ResourceBundle rb) {  
        super.setView(explorer);
        System.out.println("ExplorerController: " + parentController);
    } 
    
    @FXML
    private void showArtists() {
        System.out.println("showArtists");
        requestViewService.artist();
    }
    
    @FXML
    private void showAlbums() {
        System.out.println("showAlbums"); 
        requestViewService.album();
    }
    
    @Override
    public String toString() {
        return "ExplorerController{" + '}';
    }
       
}
