
package ru.javafx.jfxclient.example.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TabPane;
import ru.javafx.jfxclient.example.utils.TabPaneDetacher;

public class TabPaneDetacherDemoController {

    @FXML
    private TabPane demoTabPane;
    
    @FXML
    public void initialize() {
        TabPaneDetacher.create().makeTabsDetachable(demoTabPane);
    }    
    
}
