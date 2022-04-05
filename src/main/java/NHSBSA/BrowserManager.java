package NHSBSA;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BrowserManager extends BasePage{
    //object for LoadProperty
    LoadProp loadProperty = new LoadProp();
    //variable for browser
    String browser = loadProperty.getProperty("browser");

    public void openBrowser()
    {
        if (browser.equalsIgnoreCase("chrome"))
        {   //chrome driver setup using WebDriverManager
            WebDriverManager.chromedriver().setup();
            //object for chromedriver
            driver = new ChromeDriver();
        }
        else if (browser.equalsIgnoreCase("firefox"))
        {   //firefox driver setup using WebDriverManager
            WebDriverManager.firefoxdriver().setup();
            //object for firefox driver
            driver = new FirefoxDriver();
        }
        else
        {   //print when incorrect browser name entered
            System.out.println(browser+ "is Incorrect browser, please enter a correct browser");
        }

        //maximize the browser window
        driver.manage().window().maximize();
        //open url
        driver.get(loadProperty.getProperty("url"));
        //apply implicitlyWait
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    public void closeBrowser()
    {
        driver.close();

    }
}
