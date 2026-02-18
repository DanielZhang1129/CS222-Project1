package org.example;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.Parent;
import javafx.stage.Stage;


public class WelcomeController {
    private Stage stage;
    private VBox root;

    public WelcomeController(Stage primaryStage) {
        this.stage = primaryStage;
        buildUI();
    }

    private void buildUI() {
        root = new VBox(50);
        root.getStyleClass().add("welcome-root");
        Label label = new Label("Welcome to Wiki Viewer");
        Text text = new Text("Fei Ye\nDaniel Zhang");
        text.getStyleClass().add("author-text");
        Button nextBtn = new Button("Next");

        nextBtn.setOnAction(e -> {
            SearchController searchController = new SearchController(stage);
            Scene searchScene = new Scene(searchController.getView(), 800, 600);
            stage.setScene(searchScene);
        });

        root.getChildren().addAll(label,text, nextBtn);
    }

    public VBox getView() {
        return root;
    }
}
