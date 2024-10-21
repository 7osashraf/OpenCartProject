package HomePage;

import org.openqa.selenium.WebElement;
import utility.FindingElements;

public class HomePageWebElements extends FindingElements {

    public WebElement GetProductContentContainer(){return findingElementByClassName("caption"); }
    public WebElement GetProductImage(){ return findingElementByClassName("image");}
    public WebElement GetProductName(){return findingElementByTagName("h4");}
    public WebElement GetAddToCartButton(){return findingElementByXpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[3]/button[1]");}
    public WebElement GetAddToWishListButton(){return findingElementByXpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[3]/button[2]");}
    public WebElement GetHeaderWishListIcon(){return findingElementByXpath("//*[@id=\"wishlist-total\"]");}
    public WebElement GetCompareThisProductButton(){return findingElementByXpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[3]/button[3]");}
    public WebElement GetHeaderCartIcon(){return findingElementByClassName("btn-inverse");}
    public WebElement GetAlert(){return findingElementByClassName("alert");}






}
