package org.example;

import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;

import javafx.stage.Stage;

public class SearchController {
    private VBox searchVBox = new VBox(50);
    private Stage Stage;

    public SearchController(Stage Stage) {
        this.Stage = Stage;
    }

    public Parent getView() {
        return searchVBox;
    }

//    Input input = new Input();
//    Output output = new Output();
//    Requester requester = new Requester();
//    RevisionParser parser = new RevisionParser();
//
//    try
//
//    {
//        String title = input.getUserInput();
//
//        String json = requester.fetchRecentRevisions(title);
//
//        output.printRedirect(parser.getRedirectTarget(json));
//
//        output.printRevisions(parser.parse(json));
//
//    } catch(
//    WikiException e)
//
//    {
//        output.printErrorMessage(e);
//    }

//    }

}
