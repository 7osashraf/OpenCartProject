package LoginPage;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import Utility.FindingElements;

public class LoginPageWebElements extends FindingElements {

    // Get Email field
    public WebElement GetEmail() throws IOException {return findElementById("input-email");}

    // Get Password field
    public WebElement GetPassword() throws IOException {return findElementById("input-password");}

    //  Get Login Button Contianer
    public WebElement GetContinueButton() throws IOException {return findElementByClassName("btn-primary");}
}
