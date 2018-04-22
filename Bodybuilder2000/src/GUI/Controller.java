package GUI;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class Controller {
    public BorderPane root;
    public TextField searchField;


    //  Searching   //
    public void search (ActionEvent event) {
        try {
            BorderPane pane = FXMLLoader.load(getClass().getResource("SearchResult.fxml"));
            root.getChildren().setAll(pane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
