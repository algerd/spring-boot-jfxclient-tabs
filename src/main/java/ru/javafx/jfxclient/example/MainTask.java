package ru.javafx.jfxclient.example;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import ru.javafx.jfxclient.example.controller.MainController;
import ru.javafx.jfxclient.example.jfxintegrity.BaseFxmlController;

//@SpringBootApplication
public class MainTask extends Application {
    
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private static String[] args;
    private ConfigurableApplicationContext springContext;  
            
    @Override
    public void start(Stage appStage) throws Exception {  
        Task<Object> worker = new Task<Object>() {
            @Override
            protected Object call() throws Exception {
                springContext = SpringApplication.run(MainTask.class, MainTask.args);
                return null;
            }
        };
        worker.run();  
        worker.setOnSucceeded(event -> show(MainController.class));
        worker.setOnFailed(event -> {
            try {
                this.logger.info("Application force stoped!");
                Alert ex = new Alert(Alert.AlertType.ERROR);
                ex.setTitle("ERROR");
                ex.setHeaderText("Application force stoped!");
                ex.setContentText("Application force stoped!");
                ex.show();
            } catch (Exception ex) {
                this.logger.error("Application force stoped!", ex);
            }
        });
    }
    
    @Bean()
    public Stage getStage() {
        Stage newStage = new Stage(StageStyle.DECORATED);
        return newStage;
    }
   
    private void show(Class<? extends BaseFxmlController> controllerClass) { 
        BaseFxmlController controller = springContext.getBean(controllerClass);
        Scene scene = new Scene(controller.getView());
        Stage primaryStage = springContext.getBean(Stage.class);
        primaryStage.titleProperty().bind(controller.titleProperty());
        primaryStage.setScene(scene);     
        primaryStage.show();
    }

    @Override
    public void stop() throws Exception {
        super.stop();
        Platform.exit();
        springContext.close();
    }
  
    public static void main(String[] args) {
        MainTask.args = args;
        launch(MainTask.class, args);
    }

}
