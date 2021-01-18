package actionclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(linkText = "Sign in")
    private WebElement signInElement;
    public void clickSignIn()
    {
        signInElement.click();
    }

    @FindBy(id = "email")
    private WebElement emailElement;
    public void enterEmail(String email)
    {
        emailElement.sendKeys(email);
    }

    @FindBy(id = "passwd")
    private WebElement passwordElement;
    public void enterPassword(String password)
    {
        passwordElement.sendKeys(password);
    }

    @FindBy(id = "SubmitLogin")
    private WebElement signInButtonElement;
    public void clickOnSignIn()
    {
        signInButtonElement.click();
    }
}
