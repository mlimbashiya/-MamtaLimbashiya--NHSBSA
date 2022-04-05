package PageObject;

import NHSBSA.LoadProp;
import NHSBSA.Utils;
import org.openqa.selenium.By;

public class GPPracticeSelectionPage extends Utils {
    LoadProp loadProp = new LoadProp();
    By _clickOnYesRadioButton = By.id("radio-yes");
    By _clickOnNextButton = By.id("next-button");
    public void clickOnYesRadioButton()
    {//expected url
        String expectedURL = "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/gp-in-scotland-or-wales";
        //verify url
        assertCurrentURL(expectedURL);
        //message
        System.out.println(loadProp.getProperty("GPPracticeInScotlandAndWalesMessage"));
        //click on yes
        clickOnElement(_clickOnYesRadioButton);
    }
    public void clickOnNextButton()
    {
        clickOnElement(_clickOnNextButton);
    }
}
