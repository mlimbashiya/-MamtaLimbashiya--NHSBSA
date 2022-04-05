package PageObject;

import NHSBSA.LoadProp;
import NHSBSA.Utils;
import org.openqa.selenium.By;

public class CountryOfDentalPractice extends Utils {
    LoadProp loadProp = new LoadProp();
    By _clickOnWales = By.xpath("//input[@id='radio-wales']");
    By _clickOnNextButton = By.id("next-button");
    public void clickOnWalesAsDentalPracticeIn()
    {
        //expected url
        String expectedURL = "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/dental-practice-country";
        //verify url
        assertCurrentURL(expectedURL);
        //message
        System.out.println(loadProp.getProperty("CountryOfDentalPracticeMessage"));
        clickOnElement(_clickOnWales);
    }
    public void clickOnNextButton()
    {
        clickOnElement(_clickOnNextButton);
    }
}
