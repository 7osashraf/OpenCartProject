package HomePage;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.apache.commons.math3.analysis.function.Add;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePageComp extends HomePageWebElements{

    public void CheckHomePageOpened() {
        logger.debug("check Home page opened");
        //check URL
        String url=driver.getCurrentUrl();
        checkIfEqual(url, "https://tutorialsninja.com/demo/");
    }


    public void CheckProductImage() {
        logger.debug("Check Product image");
        boolean ProductImage=GetProductImage().isDisplayed();
        System.out.println("product image "+ProductImage);
    }

    public void CheckProductNameColor(){
        logger.debug("Check Product name color");
        String Color=GetProductName().getCssValue("Color");
        System.out.println("Color is: "+Color);
    }

    public void CheckProductinfo() {
        logger.debug("Check product info");
        String ProductInfo=GetProductContentContainer().getText();
        System.out.println(ProductInfo);
    }

    public void ClickOnAddToCartButton() {
        logger.debug("Click Add to cart button");
        WebElement AddToCart=GetAddToCartButton();
        explicitlyWaitForVisibility(AddToCart);
        //move to add to cart btn
        Actions action =new Actions(driver);
        action.moveToElement(AddToCart).perform();
        //check if add to cart btn is enabled
        CheckIfButtonIsEnable(AddToCart,"Add To Cart Button");
        AddToCart.click();}

    public void CheckAlertOnCilickingOnAddTOCartBtn(){
        logger.debug("Check Add to cart button Alert");
        WebElement AddToCart=GetAddToCartButton();
        explicitlyWaitForVisibility(AddToCart);
        //Click on add to cart btn
        Actions action =new Actions(driver);
        action.moveToElement(AddToCart).perform();
        AddToCart.click();
        //check alert is appeared

        String alertText =GetAlert().getText();
//        Alert alert = driver.switchTo().alert();
//        explicitlyWaitForVisibility((WebElement) alert);
//        String alertText = alert.getText();
       System.out.println("Alert text: " + alertText);}

    public void CheckCartIconNumberUpdates() throws InterruptedException {
        logger.debug("Check Cart Icon Number Updates");
        WebElement AddToCart=GetAddToCartButton();
        explicitlyWaitForVisibility(AddToCart);
        //Click on add to cart btn
        Actions action =new Actions(driver);
        action.moveToElement(AddToCart).perform();
        AddToCart.click();
        //check cart icon number
        WebElement CartIcon=GetHeaderCartIcon();
        action.moveToElement(CartIcon).perform();
        Thread.sleep(1000);
        String CartNumber=GetHeaderCartIcon().getText();
        System.out.println(CartNumber);
        checkIfContain(CartNumber,"1");

    }

    public void ClickOnAddToWishListButton() {
        logger.debug("Click Add to Wish list button");
        WebElement AddToWishList = GetAddToWishListButton();
        explicitlyWaitForVisibility(AddToWishList);
        //move to add to wish list btn
        Actions action = new Actions(driver);
        action.moveToElement(AddToWishList).perform();
        //check if he btn is enabled
        CheckIfButtonIsEnable(AddToWishList, "Add To Wish List Button");
        AddToWishList.click();
    }

    public void CheckAlertOnCilickingOnAddToWishListBtn(){
        logger.debug("Check Wish list button Alert");

        WebElement AddToWishList = GetAddToWishListButton();
        explicitlyWaitForVisibility(AddToWishList);
        //Click on add to wish list btn
        Actions action = new Actions(driver);
        action.moveToElement(AddToWishList).perform();
        AddToWishList.click();
        //check alert appeared
        String alertText =GetAlert().getText();
//        Alert alert = driver.switchTo().alert();
//        explicitlyWaitForVisibility((WebElement) alert);
//        String alertText = alert.getText();
        System.out.println("Alert text: " + alertText);}

    public void CheckWishListIconNumberUpdates() throws InterruptedException {
        logger.debug("Check Wish List Icon Number Updates");

        WebElement AddToWishList = GetAddToWishListButton();
        explicitlyWaitForVisibility(AddToWishList);
        // Click on add to wish list btn
        Actions action = new Actions(driver);
        action.moveToElement(AddToWishList).perform();
        CheckIfButtonIsEnable(AddToWishList, "Add To Wish List Button");
        AddToWishList.click();
        //check wish list icon number
        WebElement WishListIcon=GetHeaderWishListIcon();
        Thread.sleep(1000);
        String WishListNumber=GetHeaderWishListIcon().getText();
        System.out.println(WishListNumber);
        checkIfContain(WishListNumber,"1");

    }

    public void ClickOnCompareThisProductButton(){
        //Check Compare this product button is clicked
        logger.debug("Click Compare this product button");
        WebElement CompareThisProduct=GetCompareThisProductButton();
        //move to add to Compare this product btn
        Actions action =new Actions(driver);
        action.moveToElement(CompareThisProduct).perform();
        //Check if Compare this product btn is enabled
        CheckIfButtonIsEnable(CompareThisProduct,"Compare This Product Button");
        CompareThisProduct.click();

    }
    public void CheckAlertOnCilickingOnCompareThisProductBtn(){
        logger.debug("Check Compare this product button Alert");

        //Check Compare this product button is clicked
        logger.debug("Click Compare this product button");

        WebElement CompareThisProduct=GetCompareThisProductButton();
        //move to add to Compare this product btn
        Actions action =new Actions(driver);
        action.moveToElement(CompareThisProduct).perform();
        //Click on Compare this product btn is enabled
        CompareThisProduct.click();
        //check alert appeared
        String alertText =GetAlert().getText();
//        Alert alert = driver.switchTo().alert();
//        explicitlyWaitForVisibility((WebElement) alert);
//        String alertText = alert.getText();
        System.out.println("Alert text: " + alertText);}



}
