package Pages.SignUp;

import Pages.Base.Helper;
import io.qameta.allure.Allure;
import io.qameta.allure.model.Status;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.io.IOException;

public class SignUpScenarios {
    private  WebDriver driver;

    SignUpPage signUpPage ;

    public SignUpScenarios(WebDriver driver) throws IOException, ParseException {
            this.driver = driver;
    }

    public SignUpScenarios  verifyValidScenarioWithValidData() throws IOException, ParseException {
        signUpPage= new SignUpPage(driver);
        signUpPage.clickOnRegisterButton()
                .chooseYourGender()
                .enterYourFirstName("ValidUser","FirstName")
                .enterYourLastName("ValidUser","lastName")
                .selectYourDateOfBirth_D("ValidUser","day")
                .selectYourDateOfBirth_M("ValidUser","month")
                .selectYourDateOfBirth_Y("ValidUser","year")
                .enterYourEmail("ValidUser","Email")
                .enterCompanyName("ValidUser","companyName")
                .enterYourPassword("ValidUser","password")
                .enterConfirmPassword("ValidUser","confirm_password")
                .clickOnConfirmRegistrationButton();
        Helper.takeScreenShot(driver , "Successes registration");
        try {
            driver.findElement(By.xpath("//li[text() ='The specified email already exists']")).isDisplayed();
            Allure.step("create account not successes" , Status.FAILED);
            Assert.fail("The Email address already exist");
        }
        catch (Exception e)
        {
            Allure.step("Create Account Done");
            Assert.fail(e.getMessage());
        }
        return this;
    }

    public SignUpScenarios  verifyInvalidScenarioWithInvalidData() throws IOException, ParseException {
        signUpPage= new SignUpPage(driver);
        signUpPage.clickOnRegisterButton()
                .chooseYourGender()
                .enterYourFirstName("ValidUser","FirstName")
                .enterYourLastName("ValidUser","lastName")
                .selectYourDateOfBirth_D("ValidUser","day")
                .selectYourDateOfBirth_M("ValidUser","month")
                .selectYourDateOfBirth_Y("ValidUser","year")
                .enterYourEmail("InvalidUser","Email")
                .enterCompanyName("ValidUser","companyName")
                .enterYourPassword("InvalidUser","password")
                .enterConfirmPassword("InvalidUser","confirm_password")
                .clickOnConfirmRegistrationButton();
        Allure.step("Log the validation message : " + signUpPage.validationMessage(driver));
        return this;
    }
}
