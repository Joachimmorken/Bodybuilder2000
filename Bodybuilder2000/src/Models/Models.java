package Models;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.util.FileManager;

import org.apache.jena.rdf.model.Model;

public class Models {

    private Model model = ModelFactory.createDefaultModel();
    public Model addToModel(String path) {
        FileManager.get().addLocatorClassLoader(Models.class.getClassLoader());
        model = FileManager.get().loadModel(path);
        return model;
    }
}