package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class configReaderTest {

    public static Properties readConfigData()
    {
        Properties prop = new Properties();
        File file = new File(System.getProperty("user.dir")+"\\src\\test\\java\\Config\\config.properties");
        try {
            FileInputStream fis = new FileInputStream(file);
            prop.load(fis);

        }
        catch (Throwable e)
        {
            e.printStackTrace();

        }
        return prop;
    }
}
