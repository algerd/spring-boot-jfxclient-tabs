
package ru.javafx.jfxclient.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RequestViewService {
    
    @Autowired
    private MainController mainController;
    @Autowired
    private ArtistController artistController;
    @Autowired
    private AlbumController albumController;
    
    public void artist() {
        mainController.show(artistController.getView());
    }
    
    public void album() {
        mainController.show(albumController.getView());
    }

}
