package ch.so.agi.oereb.cts.test.xml;

import org.testng.annotations.Factory;

public class GetEGRIDFoo extends GetEGRIDWithGeometry {

    @Factory(dataProvider = "getUsersIdAndLogin")
    public GetEGRIDFoo(int userID, String loginName) {
        super(userID, loginName);
    }

}
