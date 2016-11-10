
package ru.javafx.jfxclient.example.jfxintegrity;

import java.util.ResourceBundle;
import javafx.scene.Parent;

public interface Loadable {
    
    Parent loadView();
    
    Parent getView();
       
    // только для инклудных вьюх с @FXMLController(loadable = false)
    void setView(Parent view);
    
    ResourceBundle getResourceBundle();
    
}
