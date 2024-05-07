package com.example.demo;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;

import com.Структуры.pac.PointOnLine;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.*;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button run;

    @FXML
    private TextField x1;

    @FXML
    private TextField x2;

    @FXML
    private TextField x3;

    @FXML
    private TextField y1;

    @FXML
    private TextField y2;

    @FXML
    private TextField y3;

    @FXML
    void initialize() {
        run.setOnAction(actionEvent -> {
            PointOnLine p1 = new PointOnLine(Float.parseFloat(x1.getText()), Float.parseFloat(y1.getText()));
            PointOnLine p2 = new PointOnLine(Float.parseFloat(x2.getText()), Float.parseFloat(y2.getText()));
            PointOnLine p3 = new PointOnLine(Float.parseFloat(x3.getText()), Float.parseFloat(y3.getText()));
            boolean answer = PointOnLine.onALine(p1,p2,p3);
            if (answer) {
                JOptionPane.showMessageDialog(null, "Данные точки лежат на одной прямой.");
            } else{
                JOptionPane.showMessageDialog(null, "Данные точки не лежат на одной прямой.");
            }
            x1.setText("");
            y1.setText("");
            x2.setText("");
            y2.setText("");
            x3.setText("");
            y3.setText("");
            System.out.println(answer);
        });
    }
}































//run.setOnAction(actionEvent -> {
//        run.getScene().getWindow().hide();
//        FXMLLoader loader = new FXMLLoader();
//        loader.setLocation(getClass().getResource("/com/example/demo/window2.fxml"));
//        System.out.println("chetko");
//        try {
//        loader.load();
//        } catch (IOException e) {
//        e.printStackTrace();
//        }
//
//        Parent root = loader.getRoot();
//
//        Stage stage = new Stage();
//        stage.setScene(new Scene(root));
//        stage.showAndWait();
//        });




