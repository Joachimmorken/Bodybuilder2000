package SPARQL;

import Models.DatasetModel;
import org.apache.jena.query.*;
import org.apache.jena.rdf.model.Model;


public class Querying {

    public ResultSet ontologyQuery(String queryString) {
        Model model = DatasetModel.getDataset().getNamedModel("Bodybuilder2000");
        Query query = QueryFactory.create(queryString);

        try (QueryExecution queryExecution = QueryExecutionFactory.create(query, model)) {
            ResultSet resultSet = queryExecution.execSelect();
            resultSet = ResultSetFactory.copyResults(resultSet);
            ResultSetFormatter.out(resultSet); // Printer innholdet i resultsettet
            return resultSet;
        }
    }
}
