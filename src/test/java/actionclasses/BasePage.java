package actionclasses;

import org.openqa.selenium.WebDriver;

public class BasePage {

    protected static WebDriver driver;

    public BasePage(WebDriver driver)
    {
        BasePage.driver = driver;
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    }
}
