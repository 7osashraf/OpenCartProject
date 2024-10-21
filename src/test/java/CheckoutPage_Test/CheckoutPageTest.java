package CheckoutPage_Test;

import CheckoutPage.CheckoutPageComp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class CheckoutPageTest extends CheckoutPageComp {

    @BeforeMethod(alwaysRun = true)
    public void openBrowser() throws Exception {
        SetupTheDriver();
//        WebElement button = driver.findElement(By.className("fa-solid fa-shopping-cart"));
//        button.click();

        //List<WebElement> buttons = driver.findElements(By.cssSelector("button i.fa-shopping-cart"));
        //WebElement button = driver.findElement(By.cssSelector("button i.fa-shopping-cart"));


        // Wait for the page to load completely
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(), 'iPhone')]")));


        WebElement iphoneAddToCart = driver.findElement(By.xpath("//h4/a[contains(text(), 'iPhone')]/ancestor::div[@class='product-thumb']//button[@title='Add to Cart']"));
        explicitlyWaitForClickability(iphoneAddToCart);

        Actions action = new Actions(driver);
        action.moveToElement(iphoneAddToCart).click().perform();


        Thread.sleep(2000);

        driver.navigate().to("https://demo.opencart.com/en-gb?route=checkout/checkout");

    }

    @AfterMethod(alwaysRun = true)
    public void closeBrowser() throws Exception {
        driver.quit();
    }

    @Test(priority = 1)
    public void checkCheckoutPageOpened() throws InterruptedException {
        Thread.sleep(5000);
        checkIfCheckoutPageOpened();

    }

}
