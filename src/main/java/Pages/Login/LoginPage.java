package Pages.Login;

import Pages.Base.DataClass;
import Pages.Base.ElementsActions;
import Pages.Base.Helper;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class LoginPage {
    WebDriver driver;

    //contractor
    public LoginPage (WebDriver driver)
    {
        this.driver = driver;
    }

    //locators
    private By loginPage = By.xpath("//a[text() = 'Log in']");
    private By emailField = By.id("Email");
    private By password = By.id("Password");
    private By loginButton = By.className("login-button");

    //Actions

    public LoginPage clickOnLoginPage()
    {
        Helper.waitForElement(driver, loginPage);
        ElementsActions.clicker(driver, loginPage);
        return  this;
    }

    public LoginPage enterTheEmailAddress(String objectName , String fieldName) throws IOException, ParseException {
        Helper.waitForElement(driver , emailField);
        ElementsActions.sendText(driver , emailField , DataClass.jsonData(objectName , fieldName));
        return this;
    }

    public LoginPage enterPassword(String objectName , String fieldName) throws IOException, ParseException {
        Helper.waitForElement(driver , password);
        ElementsActions.sendText(driver , password , DataClass.jsonData(objectName , fieldName));
        return this;
    }

    public LoginPage clickOnLoginButton()
    {
        Helper.waitForElement(driver, loginButton);
        ElementsActions.clicker(driver, loginButton);
        return  this;
    }
}
