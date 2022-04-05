package PageObject;

import NHSBSA.LoadProp;
import NHSBSA.Utils;
import org.openqa.selenium.By;

public class CountryLiveSelectionPage extends Utils {
    LoadProp loadProp = new LoadProp();
    By _SelectRadioButton = By.id("radio-wales");
    By _clickOnNextButton = By.cssSelector("#next-button");

    public void clickOnRadioButton()
    {//expected url
        String expectedURL = "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/where-you-live";
        //verify url
        assertCurrentURL(expectedURL);
        //message
        System.out.println(loadProp.getProperty("countryResidentMessage"));
        //click on country
        clickOnElement(_SelectRadioButton);
    }
    public void clickOnNextButton()
    {
        clickOnElement(_clickOnNextButton);
    }

}
