package CheckoutPage;

import org.openqa.selenium.WebElement;

public class CheckoutPageComp extends CheckoutPageWebElement{

    public void checkIfCheckoutPageOpened(){
        logger.debug("Verify if the checkout complete page is displayed.");

        String url = driver.getCurrentUrl();
        checkIfEqual(url, "https://demo.opencart.com/en-gb?route=checkout/checkout");

        // chcek page title
        WebElement checkoutPageTitle = getcheckoutPageTitle();
        checkIfNotNull(checkoutPageTitle, "Checkout page");
        CheckIfTextIsDiplayed(checkoutPageTitle, "Checkout");
    }

}
