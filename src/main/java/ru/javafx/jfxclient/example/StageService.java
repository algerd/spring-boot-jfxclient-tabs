
package ru.javafx.jfxclient.example;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import ru.javafx.jfxclient.example.jfxintegrity.BaseFxmlController;

@Service
//@Scope("prototype")
public class StageService {
        
    @Autowired
    private ApplicationContext applicationContext;

    public void show(Modality modality, Class<? extends BaseFxmlController> controllerClass) {       
        Stage stage = new Stage();           
        stage.initModality(modality);
        stage.initOwner(applicationContext.getBean("primaryStage", Stage.class));
        Scene scene = new Scene(applicationContext.getBean(controllerClass).getView()); 
        stage.setScene(scene);
        stage.showAndWait();
    }
}
