package util;

import com.maxsoft.webdrivermanager.driver.DriverFactory;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    public static WebDriver driver;

    public static void setDriver(String browserName)
    {
        switch (browserName)
        {
            case DriverFactory.CHROME:
                driver = DriverFactory.getDriver(DriverFactory.CHROME);
                break;

            case DriverFactory.FIREFOX:
                driver = DriverFactory.getDriver(DriverFactory.FIREFOX);
                break;

            case DriverFactory.EDGE:
                driver = DriverFactory.getDriver(DriverFactory.EDGE);
                break;
        }
    }

    public static WebDriver getDriver()
    {
        return driver;
    }
}
