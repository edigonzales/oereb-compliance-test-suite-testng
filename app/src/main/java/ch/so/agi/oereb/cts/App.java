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
        params.put("baseUrl", "https://prozessor-oereb.ur.ch/oereb/");
        params.put("enCoord", "2690481.2,1195464.8");
        params.put("gnssCoord", "46.90413,8.62621");
        params.put("gnssUrl", "https://prozessor-oereb.ur.ch/oereb/?gnss=46.90413,8.62621");
        params.put("enUrl", "https://prozessor-oereb.ur.ch/oereb/?gnss=46.90413,8.62621");
        params.put("enUrlWithParam", "https://prozessor-oereb.ur.ch/oereb/getegrid?gnss=46.90413,8.62621");

        
        
        XmlSuite suite = new XmlSuite();
        suite.setName("ÖREB Compliance Test Suite (V2.0)");
         
        XmlTest test = new XmlTest(suite);
        test.setName("XML");
        test.setParameters(params);
        List<XmlClass> classes = new ArrayList<XmlClass>();
        classes.add(new XmlClass("ch.so.agi.oereb.cts.test.GetEGRIDNoParameters"));
        test.setXmlClasses(classes) ;

        List<XmlSuite> suites = new ArrayList<XmlSuite>();
        suites.add(suite);
        TestNG tng = new TestNG();
        tng.setXmlSuites(suites);
        
        //tng.setOutputDirectory("/Users/stefan/tmp/");

        tng.run();
        

       
        System.out.println("Hallo Welt.");

        
    }
}
