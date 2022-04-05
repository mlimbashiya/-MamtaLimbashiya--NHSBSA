package PageObject;

import NHSBSA.LoadProp;
import NHSBSA.Utils;
import org.openqa.selenium.By;

public class UniversalCreditTakeHomePage extends Utils {
    LoadProp loadProp = new LoadProp();
    By _clickYesInTakeHomePay = By.xpath("//input[@id='radio-yes']");

    public void takeHomeUniversalCreditPay()
    {   //expected url
        String url = "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/universal-credit-take-home-pay";
        //verify url
        assertCurrentURL(url);
        //message
        System.out.println(loadProp.getProperty("takeHomePayMessage"));
        //click on yes
        clickOnElement(_clickYesInTakeHomePay);

    }
}
