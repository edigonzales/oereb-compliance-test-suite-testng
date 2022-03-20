package ch.so.agi.oereb.cts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class App {
    
    public static void main(String[] args) {
        
        //sdi-health-check:
        // "Check"Config-Klasse

        
        String baseUrl = "https://prozessor-oereb.ur.ch/oereb/";
        String eastNorthCoord = "2690481.2,1195464.8";
        String gnssCoord = "46.90413,8.62621";
        
//        Map<String,String> params = new HashMap<String,String>();
//        params.put("baseUrl", "");
//        params.put("enCoord", "2690481.2,1195464.8");
//        params.put("gnssCoord", "46.90413,8.62621");
//        params.put("getEgridByEastNorthUrl", baseUrl + "getegrid/xml/?en=" + eastNorthCoord);
//        params.put("getEgridByGnssUrl", baseUrl + "getegrid/xml/?gnss=" + gnssCoord);
//        params.put("getEgridByEastNorthUrlWithGeometry", baseUrl + "getegrid/xml/?GEOMETRY=true&en=" + eastNorthCoord);
//        params.put("getEgridByGnssUrlWithGeometry", baseUrl + "getegrid/xml/?GEOMETRY=true&gnss=" + gnssCoord);

        XmlSuite suite = new XmlSuite();
        suite.setName("ÖREB Compliance Test Suite (V2.0)");
         
        {
            Map<String,String> params = new HashMap<String,String>();
            params.put("url", baseUrl + "getegrid/xml/?en=" + eastNorthCoord);
            XmlTest test = new XmlTest(suite);
            test.setName("GetEGRID ohne Geometrie (XML)");
            test.setParameters(params);
            List<XmlClass> classes = new ArrayList<XmlClass>();
            classes.add(new XmlClass("ch.so.agi.oereb.cts.test.xml.GetEGRIDNoParameters"));
            test.setXmlClasses(classes) ; 
        }
        
        {
            Map<String,String> params = new HashMap<String,String>();
            params.put("url", baseUrl + "getegrid/xml/?GEOMETRY=true&en=" + eastNorthCoord);
            XmlTest test = new XmlTest(suite);
            test.setName("GetEGRID mit Geometrie (XML)");
            test.setParameters(params);
            List<XmlClass> classes = new ArrayList<XmlClass>();
            classes.add(new XmlClass("ch.so.agi.oereb.cts.test.xml.GetEGRIDWithGeometry"));
            classes.add(new XmlClass("ch.so.agi.oereb.cts.test.xml.GetEGRIDFoo"));
            test.setXmlClasses(classes) ; 
        }

        List<XmlSuite> suites = new ArrayList<XmlSuite>();
        suites.add(suite);
        TestNG tng = new TestNG();
        tng.setXmlSuites(suites);
        
        //tng.setOutputDirectory("/Users/stefan/tmp/");

        tng.run();
        

       
        System.out.println("Hallo Welt.");

        
    }
}
