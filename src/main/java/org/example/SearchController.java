package org.example;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SearchController {
    private VBox searchVBox;
    private Stage Stage;

    public SearchController(Stage Stage) {
        this.Stage = Stage;
        buildUI();
    }

    private void buildUI() {
        searchVBox = new VBox(10);
        searchVBox.getStyleClass().add("searchVBox");
        Text text = new Text("Please enter the title: ");
        text.getStyleClass().add("search-title");
        TextField searchField = new TextField();
        TextArea textArea = new TextArea();
        Button searchButton = new Button("Search");

        Requester requester = new Requester();
        RevisionParser parser = new RevisionParser();
        Output output = new Output();

        searchButton.setOnAction(e -> {
            try {
                String title = searchField.getText();
                String json = requester.fetchRecentRevisions(title);
                String redirect = output.getRedirect(parser.getRedirectTarget(json));
                String formattedJson = output.getRevisions(parser.parse(json));
                textArea.setText(redirect + formattedJson);
            } catch (WikiException a) {
            }
        });
        searchVBox.getChildren().addAll(text, searchField, textArea, searchButton);
    }

    public Parent getView() {
        return searchVBox;
    }
}
