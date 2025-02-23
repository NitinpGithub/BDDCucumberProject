package Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverFactoryTest {

    static String seleniumHubUrl = "http://localhost:4444";
    static DesiredCapabilities dc;

    static WebDriver driver = null;
    public static WebDriver initilizeBrowser(String browserName) throws MalformedURLException {
//        dc = new DesiredCapabilities();
//        dc.setBrowserName("chrome");
//        driver = new RemoteWebDriver(new URL(seleniumHubUrl),dc);

        if(browserName.equals("chrome"))
        {
            driver = new ChromeDriver();
        }
        else if(browserName.equals("firefox"))
        {
            driver = new FirefoxDriver();
        }
        return driver;
    }

    public static WebDriver getDriver()
    {
        return driver;
    }
}
