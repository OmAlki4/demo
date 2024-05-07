package com.example.demo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class Control2 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextArea text;

    @FXML
    void initialize() {
        assert text != null : "fx:id=\"text\" was not injected: check your FXML file 'window2.fxml'.";

    }

}
