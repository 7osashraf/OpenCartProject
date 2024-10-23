package MyAccountPage;

public class MyAccountPageComp extends MyAccountPageWebElements{

    public void CheckMyAccountPageOpened(){
        //URL
        String url=driver.getCurrentUrl();
        checkIfEqual(url,"https://tutorialsninja.com/demo/index.php?route=account/account");

        //Title
        String MyAccountTitle=GetMyAccountTitle().getText();
        checkIfEqual(MyAccountTitle,"My Account");
    }

}


