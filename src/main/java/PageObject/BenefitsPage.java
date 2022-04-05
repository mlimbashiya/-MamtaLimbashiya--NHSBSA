package PageObject;

import NHSBSA.LoadProp;
import NHSBSA.Utils;
import org.openqa.selenium.By;

public class BenefitsPage extends Utils {
    LoadProp loadProp = new LoadProp();
    By _clickYesOnBenefits = By.cssSelector("#radio-yes");

    public void BenefitsOrTaxCredits() {
        //expected url
        String expectedURL = "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/claim-benefits-tax-credits";
        //verify url
        assertCurrentURL(expectedURL);
        //message
        System.out.println(loadProp.getProperty("benefitOrTaxCreditMessage"));
        //click yes
        clickOnElement(_clickYesOnBenefits);
    }
}
