package CheckoutPage;

import Utility.FindingElements;
import org.openqa.selenium.WebElement;

public class CheckoutPageWebElement extends FindingElements {

    public WebElement getcheckoutPageTitle() {return findElementById("content");}
}
