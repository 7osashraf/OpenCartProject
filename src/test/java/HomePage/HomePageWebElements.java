package HomePage;

import org.openqa.selenium.WebElement;
import Utility.FindingElements;

public class HomePageWebElements extends FindingElements {

    public WebElement GetProductContentContainer(){return findElementByClassName("caption"); }
    public WebElement GetProductImage(){ return findElementByClassName("image");}
    public WebElement GetProductName(){return findElementByTagName("h4");}
    public WebElement GetAddToCartButton(){return findElementByXPath("//*[@id=\"content\"]/div[2]/div[1]/div/div[3]/button[1]");}
    public WebElement GetAddToWishListButton(){return findElementByXPath("//*[@id=\"content\"]/div[2]/div[1]/div/div[3]/button[2]");}
    public WebElement GetHeaderWishListIcon(){return findElementByXPath("//*[@id=\"wishlist-total\"]");}
    public WebElement GetCompareThisProductButton(){return findElementByXPath("//*[@id=\"content\"]/div[2]/div[1]/div/div[3]/button[3]");}
    public WebElement GetHeaderCartIcon(){return findElementByClassName("btn-inverse");}
    public WebElement GetAlert(){return findElementByClassName("alert");}
    public WebElement SliderImage(){return findElementByClassName("img-responsive");}








}
