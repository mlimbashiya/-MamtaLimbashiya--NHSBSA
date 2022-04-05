package PageObject;

import NHSBSA.LoadProp;
import NHSBSA.Utils;
import org.openqa.selenium.By;

public class HomePage extends Utils {
    LoadProp loadProp = new LoadProp();
    By _cookiesButton = By.cssSelector("button#nhsuk-cookie-banner__link_accept");
    By _clickOnStartNowButton = By.cssSelector("#next-button");
public void verifyURL()
{
    //expected url
    String expectedURL = "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start";
    //verify url
    assertCurrentURL(expectedURL);
    //message
    System.out.println(loadProp.getProperty("homePageMessage"));
    //cookies accepted
    clickOnElement(_cookiesButton);
}
public void clickOnStartNowButton()
{
    clickOnElement(_clickOnStartNowButton);
}
}
