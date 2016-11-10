
package ru.javafx.jfxclient.example.jfxintegrity;

import java.util.ResourceBundle;
import javafx.beans.property.StringProperty;
import javafx.scene.Parent;

public interface Loadable {
      
    Parent getView();
       
    // только для инклудных вьюх с @FXMLController(loadable = false)
    void setView(Parent view);
    
    ResourceBundle getResourceBundle();
    
    void setTitle(String title);     
    String getTitle();	
	StringProperty titleProperty();
    
}
