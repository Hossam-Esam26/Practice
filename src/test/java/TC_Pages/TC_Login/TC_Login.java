package TC_Pages.TC_Login;

import Pages.Base.Browser;
import Pages.Login.LoginScenario;
import io.qameta.allure.*;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

@Epic("nopcommerce")
@Feature("Login Page")
public class TC_Login {
    private WebDriver driver;
    LoginScenario login;

    @BeforeMethod
    public void setBrowser()
    {
        driver = Browser.setBrowser();
        login = new LoginScenario(driver);
    }

    @Test (description = "login with valid data")
    @Story("Login with exist account")
    @Description("after the user create account he will try to login with valid data")
    @Severity(SeverityLevel.CRITICAL)
    public void login() throws IOException, ParseException {
        login.loginWithValidData();
    }

    @AfterMethod
    public void quit()
    {
        Browser.quit();
    }

}
