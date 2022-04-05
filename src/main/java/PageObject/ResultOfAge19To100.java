package PageObject;

import NHSBSA.LoadProp;
import NHSBSA.Utils;

public class ResultOfAge19To100 extends Utils {
    LoadProp loadProp = new LoadProp();
    public void resultWithRelevantInformation()
    {   //expected url
        String expectedURL = "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/result-claiming-qualifying-universal-credit";
        //verify url
        assertCurrentURL(expectedURL);
        //message
        System.out.println(loadProp.getProperty("resultOfAge19To100"));
    }
}
