import java.io.File;
import java.util.ArrayList;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.ontology.OntModel;
import org.apache.jena.ontology.OntModelSpec;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.util.FileManager;

public class Builder {
//	File f = new File("C:/Users/fredr/Desktop/MuskelDatasett/Ontology/BodybuildingAppNonsense-master/MachinesAndExercises.owl");
//	OntModel m = ModelFactory.createOntologyModel();
	
	private Model model = ModelFactory.createDefaultModel();
	
	public Model addFileModel(String path) {
		FileManager.get().addLocatorClassLoader(Builder.class.getClassLoader());
		model = FileManager.get().loadModel(path);
		return model;
	}
	
//	public Builder(ArrayList<String> list) {
//			buildResource(list);
//	}
//	 
//	public void buildResource(ArrayList<String> list) {
//		for (String s : list) {
//			m.createResource(s);
//		}
//		System.out.println(m.getBaseModel());
//	}

}
