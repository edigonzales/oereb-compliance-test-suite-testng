package ch.so.agi.oereb.cts.test;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GetEGRID {

    @BeforeClass
    public void beforeClass(ITestContext context) {
        String value = context.getCurrentXmlTest().getParameter("browserName");
        System.err.println("webdriver.deviceName.iPhone = " + value);
    }

    @Test(description="Schemavalidierung")
    @Parameters({"browserName"}) 
    public void schemaValidation(String browserName) {
        System.out.println("Inside testPrintMessage()");
        System.out.println(browserName);
        Assert.assertEquals("foo", "bar");
    }
    
    @Test(alwaysRun = true, dependsOnMethods = {"schemaValidation"})
    public void givenValidEmail_whenLoggedIn_thenTrue() {
        Assert.assertEquals("bar", "bar");
    }


}
