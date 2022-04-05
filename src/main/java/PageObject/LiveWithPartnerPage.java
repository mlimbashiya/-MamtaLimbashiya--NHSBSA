package PageObject;

import NHSBSA.LoadProp;
import NHSBSA.Utils;
import org.openqa.selenium.By;

public class LiveWithPartnerPage extends Utils {
    LoadProp loadProp = new LoadProp();
    By _clickOnYesButton = By.id("radio-yes");

    public void liveWithAPartner()
    {   //expected url
        String expectedURL = "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/partner";
        //verify url
        assertCurrentURL(expectedURL);
        //message
        System.out.println(loadProp.getProperty("partnerPageMessage"));
        //click on yes
        clickOnElement(_clickOnYesButton);
    }
}
