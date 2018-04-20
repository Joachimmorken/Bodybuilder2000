import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
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
		
		
		
		JSONParser parser = new JSONParser();
		
		Reader reader;
		Object json;
		String jsonString = "";
		String name = "";
		
		
		try {
			reader = new FileReader("C:/Users/fredr/Desktop/MuskelDatasett/216Prosjekt-master/Exerciseswithname.json");
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
		ArrayList<String> equipment = new ArrayList<>();
		ArrayList<String> excerciseName = new ArrayList<>();
		ArrayList<String> guide = new ArrayList<>();
		ArrayList<String> mechanics = new ArrayList<>();
		ArrayList<String> type = new ArrayList<>();
		ArrayList<String> otherMuscles = new ArrayList<>();
		
		
		try {
			WalkJson.walk(jsonString, new WalkJson.FieldVisitor() {
			    @Override
			    public void visit(String path, String value ) {
			        if(path.contains("Main Muscle Worked")) {
			        	muscleWorked.add(value);
			        }
			        if (path.contains("Equipment")) {
			        	equipment.add(value);
			        }
			        if (path.contains("Excercise")) {
			        	excerciseName.add(value);
			        }
			        if (path.contains("Force")) {
			        	force.add(value);
			        }
			        if (path.contains("Level")) {
			        	level.add(value);
			        }
			        if (path.contains("Mechanics Type")) {
			        	mechanics.add(value);
			        }
			        if (path.contains("Type") && !path.contains("Mechanics Type")) {
			        	type.add(value);
			        }
			        if (path.contains("Other Muscles")) {
			        	otherMuscles.add(value);
			        }
			    } 
			}); 
			
			String start = "[";
			String end = "]";
			String bef = "{";
			String after = "}";
			String temp = "";
			for (int i = 0; i < excerciseName.size(); i++) {
				temp = temp + ",\n" + bef +  "\n\"Name\": " +  "\"" + excerciseName.get(i) + "\",\n"
						+ "\"Main Muscle Worked\": " + "\"" + muscleWorked.get(i) + "\",\n"
						+ "\"Equipment\": " + "\"" + equipment.get(i) + "\",\n"
						+ "\"Force\": " + "\"" + force.get(i) + "\",\n" 
						+ "\"Level\": " + "\"" + level.get(i) + "\",\n"
						+ "\"Mechanics Type\": " + "\"" + mechanics.get(i) + "\",\n"
						+ "\"Type\": " + "\"" + type.get(i) + "\"";
							if (i < 614) {
								temp = temp + ",\n"
								+ "\"Other Muscles\": " + "\"" + otherMuscles.get(i) + "\"\n"
								+ after;
							}
							else {
								temp = temp + "\n" + after;
							}
			}	
			String finalObject = start + temp.substring(1) + end;
			System.out.println(finalObject);
			
			
			
//			System.out.println("---- " + excerciseName.get(100) + ":");
//			System.out.println("Muscle worked is: " + muscleWorked.get(100));
//			System.out.println("Equipment is: " + equipment.get(100));
//			System.out.println("Force is: " + force.get(100));
//			System.out.println("Level is: " + level.get(100));
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			Object myJson;
			Object result = null;
			

		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}

}
