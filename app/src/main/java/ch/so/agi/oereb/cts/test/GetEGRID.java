package ch.so.agi.oereb.cts.test;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GetEGRID {

    @BeforeClass
    public void beforeClass(ITestContext context) {
        String value = context.getCurrentXmlTest().getParameter("baseUrl");
        System.err.println("webdriver.deviceName.iPhone = " + value);
    }

    @Test(description="GetEGRID-Antwort muss schemakonform sein.")
    @Parameters({"baseUrl"}) 
    public void schemaValidation(String baseUrl) {
        System.out.println("Inside testPrintMessage()");
        System.out.println(baseUrl);
        Assert.assertEquals("foo", "bar", "message, message, message");
    }
    
    @Test(alwaysRun = true, dependsOnMethods = {"schemaValidation"})
    public void givenValidEmail_whenLoggedIn_thenTrue() {
        Assert.assertEquals("bar", "bar");
    }


}
