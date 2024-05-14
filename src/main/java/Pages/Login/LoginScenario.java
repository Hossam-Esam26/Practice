package Pages.Login;

import io.qameta.allure.Allure;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.io.IOException;

public class LoginScenario {
    private WebDriver driver;

    LoginPage loginPage;
    //contractor
    public LoginScenario(WebDriver driver)
    {
        this.driver = driver;
    }

    public LoginScenario loginWithValidData() throws IOException, ParseException {
        try {
            loginPage = new LoginPage(driver);
            loginPage.clickOnLoginPage()
                    .enterTheEmailAddress("ValidUser","Email")
                    .enterPassword("ValidUser","password")
                    .clickOnLoginButton();
        }
        catch (Exception e)
        {
            Allure.step(e.getMessage());
            Assert.fail(e.getMessage());
        }
        return this;
    }


}
