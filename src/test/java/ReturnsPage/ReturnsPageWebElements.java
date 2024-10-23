package ReturnsPage;

import Utility.FindingElements;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class ReturnsPageWebElements extends FindingElements {

    public WebElement GetFirstName(){return findElementById("input-firstname");}
    public WebElement GetLastName(){return findElementById("input-lastname");}
    public WebElement GetEmail(){return findElementById("input-email");}
    public WebElement GetTelephone(){return findElementById("input-telephone");}
    public WebElement GetPassword(){return findElementById("input-password");}
    public WebElement GetReturnsContainer(){return findElementById("account-return");}
    public WebElement GetReturnsTitle(){return findElementByTagName("h1");}
   }
