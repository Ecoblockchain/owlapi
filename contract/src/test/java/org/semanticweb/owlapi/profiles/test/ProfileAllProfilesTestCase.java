package org.semanticweb.owlapi.profiles.test;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@SuppressWarnings("javadoc")
@RunWith(Parameterized.class)
public class ProfileAllProfilesTestCase extends ProfileBase {

    private String premise;

    public ProfileAllProfilesTestCase(String premise) {
        this.premise = premise;
    }

    @Test
    public void testAllProfiles() {
        test(premise, true, true, true, true);
    }

    @Parameters
    public static List<String> getData() {
        return Arrays.asList(
        "<rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" xmlns:owl=\"http://www.w3.org/2002/07/owl#\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:ex=\"http://www.example.org#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><owl:Class rdf:about=\"http://www.example.org#c\"/></rdf:RDF>",
        "<rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" xmlns:owl=\"http://www.w3.org/2002/07/owl#\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:ex=\"http://www.example.org#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"><owl:ObjectProperty rdf:about=\"http://www.example.org#op\"/><owl:DatatypeProperty rdf:about=\"http://www.example.org#dp\"/></rdf:RDF>",
        "<rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\" xmlns:owl=\"http://www.w3.org/2002/07/owl#\"  xml:base=\"urn:test\"><owl:Ontology/><owl:Class rdf:about=\"urn:test#A\"/><owl:Class rdf:about=\"urn:test#B\"/></rdf:RDF>",
        "<rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" xmlns:owl=\"http://www.w3.org/2002/07/owl#\" xml:base=\"urn:test\"><owl:Class rdf:about=\"urn:test#a\" /></rdf:RDF>",
        "<rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\" xmlns:owl=\"http://www.w3.org/2002/07/owl#\"  xmlns:first=\"urn:test#\" xml:base=\"urn:test\"><rdf:Description><owl:backwardCompatibleWith><owl:Ontology rdf:about=\"http://www.example.org/\"/></owl:backwardCompatibleWith></rdf:Description></rdf:RDF>",
        "<rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\" xmlns:owl=\"http://www.w3.org/2002/07/owl#\"  xmlns:first=\"urn:test#\" xmlns:second=\"urn:test#\" xml:base=\"urn:test\"><owl:Ontology/><rdf:Description rdf:about=\"urn:test#a\"><owl:differentFrom rdf:resource=\"urn:test#b\"/></rdf:Description></rdf:RDF>",
        "<rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\" xmlns:owl=\"http://www.w3.org/2002/07/owl#\"  xml:base=\"urn:test\"><owl:Ontology/><owl:Class rdf:about=\"urn:test#Car\"><owl:equivalentClass><owl:Class rdf:about=\"urn:test#Automobile\"/></owl:equivalentClass></owl:Class></rdf:RDF>",
        "<rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\" xmlns:owl=\"http://www.w3.org/2002/07/owl#\"  xml:base=\"urn:test\"><owl:Ontology/><owl:Class rdf:about=\"urn:test#Car\"><rdfs:subClassOf><owl:Class rdf:about=\"urn:test#Automobile\"><rdfs:subClassOf rdf:resource=\"urn:test#Car\" /></owl:Class></rdfs:subClassOf></owl:Class></rdf:RDF>",
        "<rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\" xmlns:owl=\"http://www.w3.org/2002/07/owl#\"  xmlns:first=\"urn:test#\" xml:base=\"urn:test\"><owl:Ontology/><owl:Class rdf:about=\"urn:test#c1\"><owl:equivalentClass><owl:Class rdf:about=\"urn:test#c2\"/></owl:equivalentClass><first:annotate>description of c1</first:annotate></owl:Class><owl:AnnotationProperty rdf:about=\"urn:test#annotate\" /></rdf:RDF>",
        "<rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\" xmlns:owl=\"http://www.w3.org/2002/07/owl#\"  xmlns:first=\"urn:test#\" xml:base=\"urn:test\"><owl:Ontology/><owl:ObjectProperty rdf:about=\"urn:test#hasHead\"><owl:equivalentProperty><owl:ObjectProperty rdf:about=\"urn:test#hasLeader\"/></owl:equivalentProperty></owl:ObjectProperty></rdf:RDF>",
        "<rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\" xmlns:owl=\"http://www.w3.org/2002/07/owl#\"  xml:base=\"urn:test\"><owl:Ontology/><owl:ObjectProperty rdf:about=\"urn:test#hasHead\"><rdfs:subPropertyOf rdf:resource=\"urn:test#hasLeader\"/></owl:ObjectProperty><owl:ObjectProperty rdf:about=\"urn:test#hasLeader\"><rdfs:subPropertyOf rdf:resource=\"urn:test#hasHead\"/></owl:ObjectProperty></rdf:RDF>",
        "<rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" xmlns:owl=\"http://www.w3.org/2002/07/owl#\" xml:base=\"urn:test\"><owl:Ontology/><owl:AnnotationProperty rdf:about='http://purl.org/dc/elements/1.0/creator'/></rdf:RDF>",
        "<rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" xmlns:owl=\"http://www.w3.org/2002/07/owl#\" xmlns:first=\"urn:test#\" xml:base=\"urn:test\"><owl:Ontology/><owl:AnnotationProperty rdf:about=\"urn:test#ap\"/><owl:Class rdf:about=\"urn:test#A\"><first:ap><rdf:Description rdf:about=\"urn:test#B\"/></first:ap></owl:Class></rdf:RDF>",
        "<rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\" xmlns:owl=\"http://www.w3.org/2002/07/owl#\"  xml:base=\"urn:test\"><owl:Ontology /><owl:AnnotationProperty rdf:about=\"urn:test#ap\"><rdfs:range rdf:resource=\"http://www.w3.org/2001/XMLSchema#string\"/></owl:AnnotationProperty></rdf:RDF>",
        "<rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" xmlns:owl=\"http://www.w3.org/2002/07/owl#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\" xml:base=\"urn:test\"><owl:Ontology/><owl:Class rdf:about=\"urn:test#C1\"><rdfs:comment>An example class.</rdfs:comment><owl:equivalentClass><owl:Class rdf:about=\"urn:test#C2\"/></owl:equivalentClass></owl:Class></rdf:RDF>",
        "<rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" xmlns:owl=\"http://www.w3.org/2002/07/owl#\" xmlns:first=\"urn:test#\" xml:base=\"urn:test\"><owl:Ontology/><owl:ObjectProperty rdf:about=\"urn:test#p\" /></rdf:RDF>",
        "<rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\" xmlns:owl=\"http://www.w3.org/2002/07/owl#\"  xml:base=\"urn:test\"><owl:Ontology/><owl:ObjectProperty rdf:about=\"urn:test#prop\"><rdfs:range><owl:Class rdf:about=\"urn:test#A\"/></rdfs:range></owl:ObjectProperty></rdf:RDF>",
        "<rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" xmlns:owl=\"http://www.w3.org/2002/07/owl#\" xmlns:first=\"urn:test#\" xml:base=\"urn:test\"><owl:Ontology/><owl:ObjectProperty rdf:about=\"urn:test#p\" /></rdf:RDF>",
        "<rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" xmlns:owl=\"http://www.w3.org/2002/07/owl#\" xml:base=\"urn:test\"><owl:Ontology/><owl:Class rdf:about=\"urn:test#C1\"><owl:equivalentClass><owl:Class rdf:about=\"urn:test#C2\"/></owl:equivalentClass></owl:Class></rdf:RDF>",
        "<rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" xmlns:owl=\"http://www.w3.org/2002/07/owl#\" xmlns:first=\"urn:test#\" xml:base=\"urn:test\"><owl:Ontology/><owl:Class rdf:about=\"urn:test#A\"><first:ap><owl:Class rdf:about=\"urn:test#B\"/></first:ap></owl:Class><owl:AnnotationProperty rdf:about=\"urn:test#ap\"/></rdf:RDF>",
        "<rdf:RDF xml:base=\"http://example.org/\" xmlns=\"http://example.org/\" xmlns:owl=\"http://www.w3.org/2002/07/owl#\" xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"><owl:Ontology/><owl:ObjectProperty rdf:about=\"knows\" /><owl:NamedIndividual rdf:about=\"Peter\" /><owl:ReflexiveProperty rdf:about=\"knows\" /></rdf:RDF>",
        "Prefix( :=<http://example.org/> ) Ontology(\n Declaration( ObjectProperty( :knows ) ) Declaration( NamedIndividual( :Peter ) ) ReflexiveObjectProperty( :knows ))",
        "<rdf:RDF xml:base=\"http://example.org/\" xmlns=\"http://example.org/\" xmlns:owl=\"http://www.w3.org/2002/07/owl#\" xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"><owl:Ontology/><owl:ObjectProperty rdf:about=\"likes\" /><rdf:Description rdf:about=\"Peter\"><likes rdf:resource=\"Peter\" /></rdf:Description></rdf:RDF>",
        "Prefix( :=<http://example.org/> ) Ontology(\n Declaration( ObjectProperty( :likes ) ) ObjectPropertyAssertion( :likes :Peter :Peter ))",
        "<rdf:RDF xml:base=\"http://example.org/\" xmlns=\"http://example.org/\" xmlns:owl=\"http://www.w3.org/2002/07/owl#\" xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"><owl:Ontology/><owl:ObjectProperty rdf:about=\"fatherOf\" /><owl:Class rdf:about=\"Man\" /><rdf:Description rdf:about=\"Peter\"><fatherOf rdf:resource=\"Stewie\" /><fatherOf rdf:resource=\"Chris\" /></rdf:Description><Man rdf:about=\"Stewie\" /><Man rdf:about=\"Chris\" /><rdf:Description rdf:about=\"Stewie\"><owl:differentFrom rdf:resource=\"Chris\" /></rdf:Description></rdf:RDF>",
        "Prefix( :=<http://example.org/> ) Ontology( Declaration( ObjectProperty( :fatherOf ) ) Declaration( Class( :Man ) ) ObjectPropertyAssertion( :fatherOf :Peter :Stewie ) ObjectPropertyAssertion( :fatherOf :Peter :Chris ) ClassAssertion( :Man :Stewie ) ClassAssertion( :Man :Chris ) DifferentIndividuals( :Chris :Stewie ))");
    }
}
