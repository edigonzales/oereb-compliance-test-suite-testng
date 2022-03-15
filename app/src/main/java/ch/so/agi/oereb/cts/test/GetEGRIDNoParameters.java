package ch.so.agi.oereb.cts.test;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * [{@code Test}] Submits a minimal GetFeature request (without a filter
 * asdfadf.
 *
 */
/**
 * Tests the response to a GetFeature request that returns a selection of
 * features matching specified criteria. The request must include one or more
 * stored query (wfs:StoredQuery) or ad hoc query (wfs:Query) expressions. An ad
 * hoc query element may contain projection clauses (wfs:PropertyName), a
 * selection clause (fes:Filter), or a sorting clause (fes:SortBy).
 * 
 * A successful response entity must include a schema reference (using the
 * xsi:schemaLocation attribute) that is sufficient to validate the response.
 * 
 * @see "Kapitel 2.4: xxx ddf , Seite 7"
 * @see "ISO 19142:2010, cl. 7.8:  Use of the schemaLocation attribute"
 * @see "ISO 19143:2010, Geographic information -- Filter encoding"
 */

@Test(groups = { "GetEGRID" })
public class GetEGRIDNoParameters {

    // Daten requesten
    @BeforeClass
    public void beforeClass(ITestContext context) {
        String value = context.getCurrentXmlTest().getParameter("baseUrl");
        System.err.println("webdriver.deviceName.iPhone = " + value);
    }

    /*
     * en, gnss, nbident+nummer, strasse etc.-> class name GetEGRIDByXXX?
     * BAsisklasse. Jede Variante erweitert dieses Klasse. Parameter ist die
     * vollständige Url. Oder doch was mit Dataprovider? Dieser müsste aber
     * konfiguierbar sein.
     * 
     * 
     * 
     * 1. Statuscode
     * 2. Schemakonformität
     * 3. nbident und egrid string.length
     * 
     * mit Parameter -> kann man extenden?
     * 4. geometry vorhanden? (wenn sie vorhanden ist, wird Konformität durch Schemaprüfung validiert).
     * 
     * Prüfung mit x/y ins Nirvana:
     * - Statuscode
     */
    
    
    
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

    
    public class TestBar {
        @Test
        public void testBar2() {
            int expected = 4;
            Assert.assertEquals(2 + 2, expected);
            System.out.println("testBar2");
        }

    }

}
