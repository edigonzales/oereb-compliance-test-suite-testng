package ch.so.agi.oereb.cts.test.xml;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class GetEGRIDWithGeometry  {
    protected int userID;       
    protected String loginName; 

    @Factory(dataProvider = "getUsersIdAndLogin")
    public GetEGRIDWithGeometry(int userID, String loginName) {
        this.userID = userID;
        this.loginName = loginName;
    }

    @Test
    public void gaga() {
        System.out.println(this.getClass().getName() + ": gaga");
        System.out.println(this.loginName);
    }

    @DataProvider
    public static Object[][] getUsersIdAndLogin(ITestContext context) {
        System.out.println(context.getAttributeNames());

        // ToDo Replace with exctraction from DB
        return new Object[][] {
            {1, "admin"},
            {5, "user"}
        };

    }

}
