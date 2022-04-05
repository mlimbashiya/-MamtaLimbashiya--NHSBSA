package PageObject;

import NHSBSA.LoadProp;
import NHSBSA.Utils;
import org.openqa.selenium.By;

public class JointUniversalCreditPage extends Utils {
    LoadProp loadProp = new LoadProp();
    By _clickYes = By.xpath("//input[@id='radio-yes']");

    public void universalCreditClaimSelection()
    {   //expected url
        String expectedURL = "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/universal-credit-claim";
        //verify url
        assertCurrentURL(expectedURL);
        //message
        System.out.println(loadProp.getProperty("universalCreditClaimMessage"));
        //click on yes
        clickOnElement(_clickYes);
    }
}
