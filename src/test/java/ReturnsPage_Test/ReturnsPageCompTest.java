package ReturnsPage_Test;

import ReturnsPage.ReturnsPageComp;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class ReturnsPageCompTest extends ReturnsPageComp {

    @BeforeMethod(alwaysRun = true)
    public void openBrowser(ITestResult result) throws Exception {
        SetupTheDriver(result);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @AfterMethod
    public void Close(ITestResult result) throws Exception {
        closeDriver(result);
    }
}
