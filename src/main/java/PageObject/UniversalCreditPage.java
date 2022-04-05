package PageObject;

import NHSBSA.LoadProp;
import NHSBSA.Utils;
import org.openqa.selenium.By;

public class UniversalCreditPage extends Utils {
    LoadProp loadProp = new LoadProp();
    By _clickYesGetUniversalCredit = By.cssSelector("#yes-universal");

    public void universalCreditPaidSelection()
    {   //expected url
        String expectedURL = "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/paid-universal-credit";
        //verify url
        assertCurrentURL(expectedURL);
        //message
        System.out.println(loadProp.getProperty("universalCreditPaidMessage"));
        //click on yes
        clickOnElement(_clickYesGetUniversalCredit);
    }
}
