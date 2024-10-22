package MyAccountPage_Test;

import MyAccountPage.MyAccountPageComp;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyAccountPageCompTest extends MyAccountPageComp {
    @BeforeMethod
    public void OpenMyAccountPage() {

    }

    @Test(priority = 1)
    public void CheckIfMyAccountPageOpened(){
        CheckMyAccountPageOpened();
    }
}
