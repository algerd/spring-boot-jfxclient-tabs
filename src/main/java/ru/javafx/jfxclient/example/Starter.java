package ru.javafx.jfxclient.example;

import ru.javafx.jfxclient.example.jfxintegrity.BaseJavaFxApplication;
import javafx.scene.image.Image;
import ru.javafx.jfxclient.example.controller.ArtistController;
import ru.javafx.jfxclient.example.controller.MainController;
import ru.javafx.jfxclient.example.controller.RequestViewService;

/*
Унаследованное от BaseJavaFxApplication создание Application класса с запуском приложения в FX-launcher потоке.
(В BaseJavaFxApplication бин Stage зарегистрирован в start() методе через springContext.getBeanFactory().registerSingleton())
Дополнительная логика для Stage вынесена в @Override метод show(), главный контроллер передаётся серез метод-лаунчер.
*/
//@SpringBootApplication
public class Starter extends BaseJavaFxApplication {
	
	public static void main(String[] args) {
		launchApp(Starter.class, MainController.class, args);
	}

    @Override
    public void show() {
        springContext.getBean(RequestViewService.class).show(ArtistController.class);
        primaryStage.getIcons().add(new Image("images/icon_root_layout.png"));        
    }
	
}
