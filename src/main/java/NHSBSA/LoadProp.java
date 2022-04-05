package NHSBSA;

import java.io.FileInputStream;
import java.util.Properties;

public class LoadProp {
    static Properties prop;
    static FileInputStream input;
    static String fileLocation = "src/test/java/TestData/DataConfig.properties";

    public String getProperty(String keyName)
    {
        prop = new Properties();
        try
        {   input = new FileInputStream(fileLocation);
            prop.load(input);
            input.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return prop.getProperty(keyName);
    }
}
