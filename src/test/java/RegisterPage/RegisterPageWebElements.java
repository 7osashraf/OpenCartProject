package RegisterPage;

import Utility.FindingElements;
import org.openqa.selenium.WebElement;



public class RegisterPageWebElements extends FindingElements {

    // Get FirstName field
    public WebElement GetFirstName() {return findElementById("input-firstname");}

    // Get LastName field
    public WebElement GetLastName()  {return findElementById("input-lastname");}

    // Get Email field
    public WebElement GetEmail() {return findElementById("input-email");
    }

    // Get Telephone field
    public WebElement GetTelephone()  {return findElementById("input-telephone");}

    // Get Password field
    public WebElement GetPassword()  {return findElementById("input-password");}

    // Get Password Confirm field
    public WebElement GetPasswordConfirm()  {return findElementById("input-confirm");}

    //  Get Continue Button Container
    public WebElement GetContinueButton()  {return findElementByClassName("btn-primary");}
}
