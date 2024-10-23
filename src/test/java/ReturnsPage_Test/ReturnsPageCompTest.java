package ReturnsPage_Test;

import LoginPage_Test.LoginPageComp_Test;
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

        LoginPageComp_Test loginPageCompTest = new LoginPageComp_Test();
        loginPageCompTest.CheckIfUserLoggedinWithValidData();

        driver.navigate().to(getConfigValue("config","returnsUrl"));
    }

    @AfterMethod
    public void Close(ITestResult result) throws Exception {
        closeDriver(result);
    }
}
