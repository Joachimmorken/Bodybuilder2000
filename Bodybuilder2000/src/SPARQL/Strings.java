package SPARQL;

public class Strings {
    private static String ont = "PREFIX ont: <http://testserver123.no/Ontology.owl#>";
    private static String rdf = "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>";
    private static String rdfs = "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>";

    public String getUpperBodyMuscles() {
        return ont + "SELECT ?x WHERE { ?x ?z ont:Upper_body}";
    }

    public String getLowerBodyMuscles() {
        return ont + "SELECT ?x WHERE { ?x ?z ont:Lower_body}";
    }

//    public String getArmParts() {
//        return ont + "SELECT ?c WHERE { ?x ?z ont:Upper_body" +
//                "}";
//    }

    public String getShoulderExercises() {
        return ont + "SELECT ?x WHERE { ?x ont:Works ont:Shoulders}";
    }

    public String getChestExercises() {
        return ont + "SELECT ?x WHERE { ?x ont:Works ont:Chest}";
    }

    public String getBackExercises() {
        return ont + "SELECT ?x WHERE { ?x ont:Works ont:Back}";
    }

    public String getAbdominalsExercises() {
        return ont + "SELECT ?x WHERE { ?x ont:Works ont:Abdominals}";
    }

    public String getButtExercises() {
        return ont + "SELECT ?x WHERE { ?x ont:Works ont:Butt}";
    }

    public String getLegsExercises() {
        return rdf + ont + "SELECT * WHERE { ?x rdf:type ont:Legs . " +
                "?x ont:Worked_Out_With ?y . }";
    }



}
