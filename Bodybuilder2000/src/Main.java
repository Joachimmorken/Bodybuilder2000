import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashSet;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.apache.jena.ontology.OntModel;
import org.apache.jena.rdf.model.Model;
import org.json.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashSet<String> distinctMuscles = new HashSet<>();
		HashSet<String> equipment = new HashSet<>();
		
		JSONParser parser = new JSONParser();
		
		Reader reader;
		Object json;
		String jsonString = "";
		
		try {
			reader = new FileReader("C:/Users/fredr/Desktop/MuskelDatasett/216Prosjekt-master/Exercises.json");
			json = parser.parse(reader);
			String jsonS = (String) json.toString();
			jsonString = jsonString + jsonS;
			
		}
		catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		catch (IOException e2) {
			e2.printStackTrace();
		}
		catch (ParseException e3) {
			e3.printStackTrace();
		}
		
		ArrayList<String> muscleWorked = new ArrayList<>();
		ArrayList<String> level = new ArrayList<>();
		ArrayList<String> force = new ArrayList<>();
//		ArrayList<String> equipment = new ArrayList<>();
//		ArrayList<String> otherMuscles = new ArrayList<>();
		
		try {
			WalkJson.walk(jsonString, new WalkJson.FieldVisitor() {
			    @Override
			    public void visit(String path, String value ) {
			        if(path.contains("Main Muscle Worked")) {
			        	distinctMuscles.add(value);
//			            System.out.println(value);
			        }
			        if (path.contains("Equipment")) {
			        	equipment.add(value);
			        }
			    } 
			}); 
						
			ArrayList<String> temp = new ArrayList<>();
			temp.addAll(distinctMuscles);
			System.out.println(temp);
			Builder b = new Builder();
			Model m = b.addFileModel("C:/Users/fredr/eclipse-workspace/INFO216Lab1/src/MachinesAndExcercises.owl"); 
			System.out.println(m.getGraph());
			
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
