package ru.javafx.jfxclient.example;

import ru.javafx.jfxclient.example.jfxintegrity.BaseSpringBootJavaFxApplicationThread;
import javafx.scene.image.Image;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.javafx.jfxclient.example.controller.ArtistController;
import ru.javafx.jfxclient.example.controller.MainController;
import ru.javafx.jfxclient.example.controller.RequestViewService;

/*
Унаследованное от BaseSpringBootJavaFxApplicationThread создание Application класса с запуском приложения в одном потоке (Task<Object>).
(В BaseSpringBootJavaFxApplicationThread создан бин Stage).
Дополнительная логика для Stage вынесена в @Override метод show(), главный контроллер передаётся серез метод-лаунчер.
*/
//@SpringBootApplication
public class StarterThread extends BaseSpringBootJavaFxApplicationThread {
	
	public static void main(String[] args) {
		launchApp(StarterThread.class, MainController.class, args);
	}

    @Override
    public void show() {
        springContext.getBean(RequestViewService.class).show(ArtistController.class);
        primaryStage.getIcons().add(new Image("images/icon_root_layout.png"));        
    }
	
}
