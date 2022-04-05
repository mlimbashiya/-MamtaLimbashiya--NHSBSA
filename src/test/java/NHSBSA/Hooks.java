package NHSBSA;


import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Utils{
    //object for BrowserSelector class
    BrowserManager browserManager = new BrowserManager();

    @Before
    public void openBrowser()
    {   //open browser
        browserManager.openBrowser();
        //open url
       // driver.get("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start");
    }
    @After
    public void closeBrowser()
    {   //close browser
    browserManager.closeBrowser();
    }
}
