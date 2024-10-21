package RegisterPage;

import Utility.FindingElements;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class RegisterPageWebElements extends FindingElements {

    // Get FirstName field
    public WebElement GetFirstName() throws IOException {return findElementById("input-firstname");}

    // Get LastName field
    public WebElement GetLastName() throws IOException {return findElementById("input-lastname");}

    // Get Email field
    public WebElement GetEmail() throws IOException {return findElementById("input-email");
    }

    // Get Telephone field
    public WebElement GetTelephone() throws IOException {return findElementById("input-telephone");}

    // Get Password field
    public WebElement GetPassword() throws IOException {return findElementById("input-password");}

    // Get Password Confirm field
    public WebElement GetPasswordConfirm() throws IOException {return findElementById("input-confirm");}

    //  Get Continue Button Container
    public WebElement GetContinueButton() throws IOException {return findElementByClassName("btn-primary");}
}
