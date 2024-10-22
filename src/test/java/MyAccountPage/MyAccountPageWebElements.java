package MyAccountPage;

import Utility.FindingElements;
import org.openqa.selenium.WebElement;

public class MyAccountPageWebElements extends FindingElements {

    public WebElement GetMyAccountTitle(){return findElementByXPath("//h2[text()='My Account']");}
    public WebElement GetEditYourAccountInformationBtn(){return findElementByXPath("//a[@href='https://tutorialsninja.com/demo/index.php?route=account/edit']");}
    public WebElement GetMyAccountTitle2(){return findElementByXPath("//a[text()='My Account']");}
}
