package CheckoutPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CheckoutPageComp extends CheckoutPageWebElement{

    public void checkIfCheckoutPageOpened(){
        logger.debug("Verify if the checkout complete page is displayed.");

        String url = driver.getCurrentUrl();
        checkIfEqual(url, "https://tutorialsninja.com/demo/index.php?route=checkout/checkout");

        // chcek page title
        WebElement checkoutPageTitle = getcheckoutPageTitle();
        checkIfNotNull(checkoutPageTitle, "Checkout page");
        CheckIfTextIsDiplayed(checkoutPageTitle, "Checkout");
    }

    public void checkIfCheckoutOptions(){
        logger.debug("Verify if the checkout options is displayed and can select guest user and continue.");

        List<WebElement> panels = getPanels();
        WebElement firstPanel = panels.get(0);

        CheckIfTextIsDiplayed(firstPanel, "Step 1: Checkout Options ");
        WebElement panelTitle = firstPanel.findElement(By.className("panel-title"));
        String titleText = panelTitle.getText();
        System.out.println(titleText);

        checkIfEqual(titleText, "Step 1: Checkout Options");

        WebElement guestCheckoutOption = driver.findElement(By.xpath("//input[@value='guest']"));
        guestCheckoutOption.click();

        WebElement continueBtn = getContinueBtn1();
        continueBtn.click();

    }

    public void validateBillingDetails() {
        logger.debug("check that we can fill the inputs sections in the step 2 in checkout page");

        WebElement billingDetailsForm = getBillingDetailsForm();
        explicitlyWaitForVisibility(billingDetailsForm);
        checkIfNotNull(billingDetailsForm, "Billing details form");

        fillAndVerifyField(getFirstNameField(), "Hos");
        fillAndVerifyField(getLastNameField(), "ashraf");
        fillAndVerifyField(getEmailField(), "hosashraf@gmail.com");
        fillAndVerifyField(getTelephoneField(), "0123456789");
        fillAndVerifyField(getAddress1Field(), "10 saad");
        fillAndVerifyField(getCityField(), "Alex");
        fillAndVerifyField(getPostcodeField(), "220755");

        selectAndVerifyField(getCountryField(),"Egypt");
        selectAndVerifyField(getZoneField(),"Al Buhayrah");

        WebElement stepTwoContinueBtn = getContinueBtn2();
        stepTwoContinueBtn.click();
    }


    public void checkIfSelectingCheckoutOptions(){
        WebElement guestCheckoutSelect = getGuestCheckoutSelect();
        guestCheckoutSelect.click();

        WebElement continueBtn = getContinueBtn1();
        continueBtn.click();
    }

//    public void checkIfSelectingPaymentMethod() {
//        WebElement paymentMethod = getPaymentMethodElement();
//        paymentMethod.click();
//        WebElement continueBtn = getPaymentContinueBtn();
//        continueBtn.click();
//    }


    public void helpFunc(){
        WebElement addToCartBtn = findElementById("button-cart");
        addToCartBtn.click();

        WebElement checkoutBtn = findElementByXPath("//*[@id=\"top-links\"]/ul/li[5]/a/span");
        checkoutBtn.click();
    }

    private void fillAndVerifyField(WebElement field, String value) {
        field.clear();
        field.sendKeys(value);
        String enteredValue = field.getAttribute("value");
        checkIfEqual(enteredValue, value);
    }

    private void selectAndVerifyField(WebElement dropdown, String value) {
        Select select = new Select(dropdown);
        select.selectByVisibleText(value);
        WebElement selectedOption = select.getFirstSelectedOption();
        String selectedValue = selectedOption.getText();
        checkIfEqual(selectedValue, value);
    }

}
