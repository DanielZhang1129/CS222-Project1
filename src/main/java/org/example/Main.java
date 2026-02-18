package org.example;

import javafx.application.Application;

import javafx.scene.Scene;

import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        WelcomeController welcomeController = new WelcomeController(primaryStage);
        Scene scene = new Scene(welcomeController.getView(), 800, 600);
        scene.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.setTitle("Wiki Viewer");
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch();
    }
}