package NHSBSA;

import org.openqa.selenium.By;
import org.testng.Assert;

public class Utils extends BasePage{
    //click on element method
    public static void clickOnElement(By by)
    {
        driver.findElement(by).click();
    }
    //enter text method
    public static void enterText(By by, String text)
    {
        driver.findElement(by).sendKeys(text);
    }
    //url verification method
    public void assertCurrentURL(String url)
    {
        Assert.assertTrue(driver.getCurrentUrl().equals(url));
    }
}
