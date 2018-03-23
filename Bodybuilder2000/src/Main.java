
        import org.apache.jena.rdf.model.*;
        import org.apache.jena.sparql.vocabulary.FOAF;
        import org.apache.jena.vocabulary.RDFS;
        import org.apache.log4j.varia.NullAppender;
        import org.apache.jena.sparql.pfunction.library.seq;
        import org.apache.jena.*;


        public class Main {

        public static void main(String[] args) {

        String base = "http://ex.no";
        Model model = ModelFactory.createDefaultModel();
        InfModel inf = ModelFactory.createRDFSModel(model);

        Resource cade = model.createResource(base + "cade");
        Resource berkeley = model.createResource(base + "berkeley");
        Resource valencia = model.createResource(base + "valencia");


        Property hei = model.createProperty(base + "hei");
        Property bachelor = model.createProperty(base + "bachelor");
        Property masters = model.createProperty(base + "masters");
        Property expertise = model.createProperty(base + "expertise");
        Property person = model.createProperty(base + "person");


        model.add(person, RDFS.subPropertyOf, cade);
        model.add(bachelor, RDFS.subClassOf, hei);
        model.add(masters, RDFS.subPropertyOf, hei);


        model.createResource(base + "a").addProperty(masters, "HEI");



        Resource a = inf.getResource(base+"a");
            System.out.println("Statement: " + a.getProperty(hei));



    }
}