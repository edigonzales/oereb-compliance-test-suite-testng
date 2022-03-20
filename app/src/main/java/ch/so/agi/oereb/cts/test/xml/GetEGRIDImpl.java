package ch.so.agi.oereb.cts.test.xml;

import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public abstract class GetEGRIDImpl {
    

    
    @BeforeClass
    public void beforeClass(ITestContext context) {
        String value = context.getCurrentXmlTest().getParameter("url");
        System.err.println("Fuuuubar" + value);
    }
    
    @Test
    public void schemaValidation() {
        System.out.println(this.getClass().getName() + ": schemaValidation");
    }
    



}
