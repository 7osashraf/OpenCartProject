package ReturnsPage_Test;

import ReturnsPage.ReturnsPageComp;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class ReturnsPageCompTest extends ReturnsPageComp {

    @AfterMethod
    public void Close(ITestResult result) throws Exception {
        closeDriver(result);
    }
}
