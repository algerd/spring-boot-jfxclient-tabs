package ru.javafx.jfxclient.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ru.javafx.jfxclient.example.controller.MainController;
import ru.javafx.jfxclient.example.jfxintegrity.BaseFxmlController;

@SpringBootApplication
public class Main extends Application {
    
    private ConfigurableApplicationContext springContext;
    private Stage primaryStage;
    
    @Override
    public void init() throws Exception {
        springContext = SpringApplication.run(Main.class);      
    }
    
    @Override
    public void start(Stage stage) throws Exception {  
        springContext.getBeanFactory().registerSingleton("primaryStage", stage);
        
        BaseFxmlController mainController = springContext.getBean(MainController.class);    
        Scene scene = new Scene(mainController.getView());  
        stage.titleProperty().bind(mainController.titleProperty());
        stage.setScene(scene);     
        stage.show();
    }

    @Override
    public void stop() throws Exception {
        super.stop();
        springContext.close();
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }

}
