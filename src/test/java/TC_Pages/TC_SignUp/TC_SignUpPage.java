package TC_Pages.TC_SignUp;

import Pages.Base.Browser;
import Pages.SignUp.SignUpScenarios;
import io.qameta.allure.*;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

@Epic("nopcommerce")
@Feature("Register page")
public class TC_SignUpPage {
    private WebDriver driver;
    SignUpScenarios signUpPage;
    @BeforeMethod
    public void setClass() throws IOException, ParseException {
        driver = Browser.setBrowser();
        signUpPage = new SignUpScenarios(driver);
    }

    @Test(description = "Create account for new clint" , priority = 1)
    @Story("create account")
    @Description("User will open the register page and enter valid data to create account")
    public void createAccountWithValidData() throws IOException, ParseException {
        signUpPage.verifyValidScenarioWithValidData();
    }

    @Test(description = "Create account with invalid data" , priority = 2)
    @Story("create account")
    @Description("User will open the register page and enter invalid data and try to create account")
    @Severity(SeverityLevel.MINOR)
    public void createAccountWithInvalidData() throws IOException, ParseException {
        signUpPage.verifyInvalidScenarioWithInvalidData();
    }


    @AfterMethod
    public void quit()
    {
        Browser.quit();
    }
}
