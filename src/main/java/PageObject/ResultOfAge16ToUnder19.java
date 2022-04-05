package PageObject;

import NHSBSA.LoadProp;
import NHSBSA.Utils;

public class ResultOfAge16ToUnder19 extends Utils {
    LoadProp loadProp = new LoadProp();

    public void resultOfInformation()
    {
        //expected url
        String expectedURL = "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/result-full-time-education";
        //verify url
        assertCurrentURL(expectedURL);
        //message
        System.out.println(loadProp.getProperty("resultOfAge16ToUnder19"));
    }
}
