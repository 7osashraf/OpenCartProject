package ReturnsPage;

import org.openqa.selenium.WebElement;

public class ReturnsPageComp extends ReturnsPageWebElements {

    public void CheckReturnsPageOpened(){
        logger.debug("Check Returns page opened");
        // URL
        String url=driver.getCurrentUrl();
        checkIfEqual(url, "https://tutorialsninja.com/demo/index.php?route=account/return/add");
        //Container
        WebElement ReturnsContainer = GetReturnsContainer();
        checkIfNotNull(ReturnsContainer,"Returns Container");
        // Title
        WebElement ReturnsTitle = GetReturnsTitle();
        CheckIfTextIsDiplayed(ReturnsTitle, "Page Title");
        String Title = ReturnsTitle.getText();
        checkIfEqual(Title, "Product Returns");
        System.out.println("the Title of the page is : " +Title);

    }
}
