package PageObject;

import NHSBSA.LoadProp;
import NHSBSA.Utils;

public class ResultOfAgeUnder16 extends Utils {
    LoadProp loadProp = new LoadProp();

    public void resultPageWithInformation()
    {   //expected url
        String expectedURL = "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/result-under-16";
        //verify url
        assertCurrentURL(expectedURL);
        //message
        System.out.println(loadProp.getProperty("resultOfAgeUnder16"));
    }
}
