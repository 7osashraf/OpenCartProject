package LoginPage;


import org.openqa.selenium.WebElement;
import Utility.FindingElements;

public class LoginPageWebElements extends FindingElements {

    // Get Email field
    public WebElement GetEmail() {return findElementById("input-email");}

    // Get Password field
    public WebElement GetPassword() {return findElementById("input-password");}

    //  Get Login Button Container
    public WebElement GetLoginButton() {return findElementByXPath("//input[@value='Login']");}

}

