package NewsletterPage_Test;

import NewsletterPage.NewsletterPageComp;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class NewsletterPageCompTest extends NewsletterPageComp {

    @BeforeMethod(alwaysRun = true)
    public void openBrowser(ITestResult result) throws Exception {
        SetupTheDriver(result);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Test
    public void TestNewsletterPageOpened(){
        CheckNewsletterPageOpened();
    }

    @Test
    public void TestNewsletterSubscriptionTitleIsDisplayed(){
        CheckNewsletterPageOpened();
        CheckNewsletterSubscriptionTitleIsDisplayed();
    }

    @Test
    public void TestSubscriptionYesNoBtns(){
        CheckNewsletterPageOpened();
        CheckSubscriptionYesNoBtns();
    }

    @Test
    public void TestBackBtnIsClickable(){
        CheckNewsletterPageOpened();
        ClickBackBtn();
    }

    @Test
    public void TestContinueBtnIsClickable(){
        ClickContinueBtn();
    }

    @AfterMethod
    public void Close(ITestResult result) throws Exception {
        closeDriver(result);
    }
}
