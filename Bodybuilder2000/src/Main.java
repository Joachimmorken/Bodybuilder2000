import Models.Models;
import Models.DatasetModel;
import SPARQL.Querying;
import SPARQL.Strings;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    private static String getEverything = "PREFIX ont: <http://testserver123.no/Ontology.owl#>" +
                                           "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>" +
                                             "SELECT ?x WHERE {?x ont:Works ont:Abdominals}";

    private static Strings strings = new Strings();

	public static void main(String[] args) {
	    Models models = new Models();
	    Querying querying = new Querying();
	    DatasetModel.addToDataset(models.addToModel("ontologi.owl"), "Bodybuilder2000");
        querying.ontologyQuery(strings.getLegsExercises());
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
