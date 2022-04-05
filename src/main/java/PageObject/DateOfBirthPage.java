package PageObject;

import NHSBSA.LoadProp;
import NHSBSA.Utils;
import org.openqa.selenium.By;

public class DateOfBirthPage extends Utils {
    LoadProp loadProp = new LoadProp();
    By _dayOfBirth = By.cssSelector("#dob-day");
    By _monthOfBirth = By.cssSelector("#dob-month");
    By _yearOfBirth = By.cssSelector("#dob-year");
    By _clickOnNextButton = By.cssSelector("#next-button");

    public void dateOfBirth(String dateOfBirth)
    {
        //Create an arr to hold date of birth values
        String[] dobArr = dateOfBirth.split("-");

        //expected url
        String expectedURL = "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/date-of-birth";
        //verify url
        assertCurrentURL(expectedURL);
        //message
        System.out.println(loadProp.getProperty("dateOfBirthMessage"));
        //type day of birth
        enterText(_dayOfBirth,dobArr[0]);
        //type month of birth
        enterText(_monthOfBirth,dobArr[1]);
        //type year of birth
        enterText(_yearOfBirth,dobArr[2]);
    }
    public void clickOnNextButton()
    {
     clickOnElement(_clickOnNextButton);
    }
}
