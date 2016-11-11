
package ru.javafx.jfxclient.example.controller;

import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import ru.javafx.jfxclient.example.jfxintegrity.BaseFxmlController;

@Service
public class RequestViewService {
    
    @Autowired
    private MainController mainController;
    
    @Autowired
    private ApplicationContext applicationContext;
        
    public void show(Class<? extends BaseFxmlController> controllerClass) {
        mainController.show(applicationContext.getBean(controllerClass));
    }
    
    public void show(Class<? extends BaseFxmlController> controllerClass, Modality modality) {       
        Stage stage = new Stage();           
        stage.initModality(modality);
        stage.initOwner(applicationContext.getBean("primaryStage", Stage.class));
        Scene scene = new Scene(applicationContext.getBean(controllerClass).getView()); 
        stage.setScene(scene);
        stage.showAndWait();
    }
    
    

}
