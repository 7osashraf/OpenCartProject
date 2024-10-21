package Footer;

import Utility.FindingElements;
import org.openqa.selenium.WebElement;

public class FooterWebElements extends FindingElements {
    public WebElement GetFooterContainer(){return findElementByClassName("container"); }
    public WebElement GetOpenCartHyperLink(){return findElementBy("container"); }
}
