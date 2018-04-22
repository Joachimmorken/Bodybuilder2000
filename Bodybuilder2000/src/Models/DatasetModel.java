package Models;

import org.apache.jena.query.Dataset;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.tdb.TDBFactory;

public class DatasetModel {
    private static Dataset dataset = TDBFactory.createDataset();

    public static Dataset addToDataset(Model model, String name) {
        dataset.addNamedModel(name, model);
        return dataset;
    }

    public static Dataset getDataset() {
        return dataset;
    }
}

