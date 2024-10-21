package CheckoutPage;

import Utility.FindingElements;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckoutPageWebElement extends FindingElements {

    public WebElement getcheckoutPageTitle() {return findElementById("content");}
    public WebElement getGuestCheckoutSelect(){return findElementByXPath("/html/body/div[2]/div/div/div/div[1]/div[2]/div/div/div[1]/div[2]/label/input");}
    public WebElement getContinueBtn1(){return findElementById("button-account");}
    public WebElement getContinueBtn2(){return findElementById("button-guest");}
    public WebElement getBillingDetailsForm(){return findElementById("accordion");}
    public WebElement getFirstNameField(){return findElementById("input-payment-firstname");}
    public WebElement getLastNameField(){return findElementById("input-payment-lastname");}
    public WebElement getEmailField(){return findElementById("input-payment-email");}
    public WebElement getTelephoneField(){return findElementById("input-payment-telephone");}
    public WebElement getAddress1Field(){return findElementById("input-payment-address-1");}
    public WebElement getCityField(){return findElementById("input-payment-city");}
    public WebElement getPostcodeField(){return findElementById("input-payment-postcode");}
    public WebElement getCountryField(){return findElementById("input-payment-country");}
    public WebElement getZoneField(){return findElementById("input-payment-zone");}

    public List<WebElement> getPanels() {return findElementsByClassName("panel-default");}

}
