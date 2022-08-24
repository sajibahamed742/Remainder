package com.example.remainder;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());


        stage.setTitle("Remainder");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        LocalDateTime ldateTime= new LocalDateTime();
        ldateTime.start();
        launch();
    }
}