import Models.Models;
import Models.DatasetModel;
import SPARQL.Querying;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    private static String getEverything = "PREFIX ont: <http://testserver123.no/Ontology.owl#>" +
    "SELECT ?exercise ?p ?o " +
    "WHERE {" +
    "?exercise ont:Works ?o ."  +
    "}";

	public static void main(String[] args) {
	    Models models = new Models();
	    Querying querying = new Querying();
	    DatasetModel.addToDataset(models.addToModel("ontologi.owl"), "Bodybuilder2000");
        querying.ontologyQuery(getEverything);
        launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
	    Parent root = FXMLLoader.load(getClass().getResource("/GUI/MainWindow.fxml"));
	    primaryStage.setTitle("Bodybuilder2000");
	    primaryStage.setScene(new Scene(root, 700, 550));
	    primaryStage.show();
}
}
