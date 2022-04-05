package PageObject;

import NHSBSA.LoadProp;
import NHSBSA.Utils;
import org.openqa.selenium.By;

public class FullTimeEducationPage extends Utils {
    LoadProp loadProp = new LoadProp();
    By _clickOnButton = By.id("label-yes");

    public void fullTimeEducation()
    {   //expected url
        String expectedURL = "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/full-time-education";
        //verify url
        assertCurrentURL(expectedURL);
        //message
        System.out.println(loadProp.getProperty("fullTimeEducationMessage"));
        //click yes
        clickOnElement(_clickOnButton);
    }
}
