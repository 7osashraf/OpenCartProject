package Utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindingElements extends WaitUtils{

    public WebElement findElementById(String id) {WebElement elemnt = driver.findElement(By.id(id));
        return elemnt;}

    public WebElement findElementByClassName(String className) {WebElement elemnt = driver.findElement(By.className(className));
        return elemnt;}

    public WebElement findElementByTagName(String tagName) {WebElement elemnt = driver.findElement(By.tagName(tagName));
        return elemnt;}

    public WebElement findElementBycssSelector(String cssSelector) {WebElement elemnt = driver.findElement(By.cssSelector(cssSelector));
        return elemnt;}

    public WebElement findElementByLinkText(String linkText) {WebElement element = getDriver().findElement(By.linkText(linkText));
        return element;}

    public WebElement findElementByName(String name) {WebElement element = getDriver().findElement(By.name(name));
        return element;}

    public WebElement findElementByPartialLinkText(String partialLinkTxt) {WebElement element = getDriver().findElement(By.partialLinkText(partialLinkTxt));
        return element;}

    public WebElement findElementByXPath(String xPath) {WebElement elemnt = driver.findElement(By.xpath(xPath));
        return elemnt;}

    public List<WebElement> findElementsById(String Id) {
        List<WebElement> elements = driver.findElements(By.id(Id));
        return elements;
    }

    public List<WebElement> findElementsByClassName(String className) {
        List<WebElement> elements = driver.findElements(By.className(className));
        return elements;
    }

    public List<WebElement> findElementsByXpath(String Xpath) {
        List<WebElement> elements = driver.findElements(By.xpath(Xpath));
        return elements;
    }

    public List<WebElement> findElementsByTagName(String tagName) {
        List<WebElement> elements = driver.findElements(By.tagName(tagName));
        return elements;
    }

    public List<WebElement> findElementsBycssSelector(String cssSelector) {
        List<WebElement> element = getDriver().findElements(By.cssSelector(cssSelector));
        return element;
    }

    public List<WebElement> findElementsByLinkText(String linkText){
        List<WebElement> element = getDriver().findElements(By.linkText(linkText));
        return element;
    }

    public List<WebElement> findElementsByName(String name){
        List<WebElement> element = getDriver().findElements(By.name(name));
        return element;
    }

    public List<WebElement> findElementsByPartialLinkText(String partialLinkTxt){
        List<WebElement> element = getDriver().findElements(By.partialLinkText(partialLinkTxt));
        return element;
    }


}
