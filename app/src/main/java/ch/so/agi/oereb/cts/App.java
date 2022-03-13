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
        Map<String,String> params = new HashMap<String,String>();
        params.put("browserName", "Firefox");
        params.put("remoteUrl", "");
        params.put("domain", "http://www.google.com");

        
        
        XmlSuite suite = new XmlSuite();
        suite.setName("ÖREB Compliance Test Suite (V2.0)");
         
        XmlTest test = new XmlTest(suite);
        test.setName("XML");
        test.setParameters(params);
        List<XmlClass> classes = new ArrayList<XmlClass>();
        classes.add(new XmlClass("ch.so.agi.oereb.cts.test.GetEGRID"));
        test.setXmlClasses(classes) ;

        List<XmlSuite> suites = new ArrayList<XmlSuite>();
        suites.add(suite);
        TestNG tng = new TestNG();
        tng.setXmlSuites(suites);
        
        tng.setOutputDirectory("/Users/stefan/tmp/");

        tng.run();
        

       
        System.out.println("Hallo Welt.");

        
    }
}
