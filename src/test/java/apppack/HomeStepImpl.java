package apppack;

import actionclasses.HomePage;
import com.maxsoft.webdrivermanager.driver.DriverFactory;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import util.Driver;

public class HomeStepImpl{

    protected WebDriver driver;
    private HomePage homePg;

    @Step("Invoke the Driver to launch AutomationPractice")
    public void before() {
        Driver.setDriver(DriverFactory.CHROME);
        driver = Driver.getDriver();
        homePg = PageFactory.initElements(driver,HomePage.class);
    }

    @Step("Click on Sign in button")
    public void ClickTheSignInButton() {
        homePg.clickSignIn();
        }

    @Step("Enter Email <email>")
    public void EnterTheEmail(String email) {
        homePg.enterEmail(email);
    }

    @Step("Enter Password <password>")
    public void EnterThePassword(String password) {
        homePg.enterPassword(password);
    }

    @Step("Click Sign in")
    public void ClickOnSignInButton() {
        homePg.clickOnSignIn();
    }
}
