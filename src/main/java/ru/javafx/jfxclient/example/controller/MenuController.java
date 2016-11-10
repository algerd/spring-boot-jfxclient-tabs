package ru.javafx.jfxclient.example.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import org.springframework.beans.factory.annotation.Autowired;
import ru.javafx.jfxclient.example.jfxintegrity.BaseFxmlController;
import ru.javafx.jfxclient.example.jfxintegrity.FXMLController;

@FXMLController(loadable = false)
public class MenuController extends BaseFxmlController implements Initializable {
      
    @Autowired
    private MainController parentController;
    
    @Autowired
    private RequestViewService requestViewService;
    
    @FXML
    private AnchorPane menu;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        super.setView(menu);
        System.out.println("MenuController: " + parentController);
    } 
    
    @FXML
    private void showArtists() {
        System.out.println("showArtists");
        requestViewService.show(ArtistController.class);
    }
    
    @FXML
    private void showAlbums() {
        System.out.println("showAlbums");  
        requestViewService.show(AlbumController.class);
    }
        
    @FXML
    private void showDialog() {
        System.out.println("showDialog");  
        requestViewService.show(DialogController.class, Modality.WINDOW_MODAL);
    }

    @Override
    public String toString() {
        return "MenuController{" + '}';
    }
           
}
