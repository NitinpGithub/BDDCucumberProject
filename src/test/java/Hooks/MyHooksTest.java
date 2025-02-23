package Hooks;

import Factory.DriverFactoryTest;
import Utils.configReaderTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class MyHooksTest
{

    WebDriver driver;


    @Before
    public void setup()  throws IOException
    {
        Properties prop = configReaderTest.readConfigData();
        DriverFactoryTest.initilizeBrowser(prop.getProperty("browser"));
        driver = DriverFactoryTest.getDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(prop.getProperty("url"));
    }
    @After
    public void tearDown()
    {
            driver.quit();
    }
}
