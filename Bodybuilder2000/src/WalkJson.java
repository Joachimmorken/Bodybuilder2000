import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.Map;

import org.json.*;


	public class WalkJson {
	    private static final String PATH_SEPARATOR = "/";

	    /**
	     * Offers the opportunity to examine fields in the JSON.
	     */
	    public static class FieldVisitor {
	        void visit(String path, String value){};
	        void visit(String path, Long value){};
	    }

	    /**
	     * Walks the JSON structure calling the visitor for every String field in the structure.
	     */
	    public static void walk(String jsonString, FieldVisitor visitor) throws ParseException {
	        walk(new JSONParser().parse(jsonString), "", visitor);
	    }

	    /**
	     * Discerns which type of object it is and dispatches to the correct method.
	     */
	    private static void walk(Object json, String path, FieldVisitor visitor) {
	        if (json instanceof JSONObject) {
	            walk((JSONObject) json, path, visitor);
	        } else if (json instanceof JSONArray) {
	            walk((JSONArray) json, path, visitor);
	        } else if (json instanceof String) {
	            visitor.visit(path, (String) json);
	        } else if (json instanceof Long) {
	            visitor.visit(path, (Long) json);
	        } else {
	            System.out.println("Unknown type "+json.getClass());
	        }
	    }

	    /**
	     * Walks all keys of a JSONObject.
	     */
	    private static void walk(JSONObject json, String path, FieldVisitor visitor) {
	        for (Object o : json.entrySet()) {
	            Map.Entry<String, Object> e = (Map.Entry<String, Object>) o;
	            // Visit every entry.
	            walk(e.getValue(), path + PATH_SEPARATOR + e.getKey(), visitor);
	        }
	    }

	    /**
	     * Walks all entries in a JSON array.
	     */
	    private static void walk(JSONArray json, String path, FieldVisitor visitor) {
	        for (int i = 0; i < json.size(); i++) {
	            // Visit every entry.
	            walk(json.get(i), path + PATH_SEPARATOR + i, visitor);
	        }
	    }
	}

