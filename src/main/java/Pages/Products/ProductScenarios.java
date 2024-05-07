package Pages.Products;

import Pages.Base.Helper;
import Pages.Login.LoginScenario;
import io.qameta.allure.Allure;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.io.IOException;

public class ProductScenarios {
    private WebDriver driver;
    Computers computers;
    //constructor
    public ProductScenarios(WebDriver driver)
    {
        this.driver = driver;
    }

    public ProductScenarios addProductToTheCart() throws IOException, ParseException {

       try {
           Allure.step("the user will select all the desktop specifications and add to cart");
           new LoginScenario(driver).loginWithValidData();
           computers = new Computers(driver);
           computers.hoverOnComputerDropdown()
                   .clickOnDesktopCategory()
                   .clickOnDesktopComputer()
                   .selectYourProcessor()
                   .selectYourRam()
                   .chooseHardType()
                   .clickOnAddToCartButton();
       }
       catch (Exception e)
       {
           Allure.step(e.getMessage());
           Assert.fail("Testcase failed");
       }
        return this;
    }

    public ProductScenarios checkValidationMessage() throws IOException, ParseException {

        try {
            Allure.step("Check if the validation message display if the user not select any mandatory specifications");
            new LoginScenario(driver).loginWithValidData();
            computers = new Computers(driver);
            computers.hoverOnComputerDropdown()
                    .clickOnDesktopCategory()
                    .clickOnDesktopComputer()
                    .selectYourProcessor()
                    .chooseHardType()
                    .clickOnAddToCartButton();
            try {
                By message = By.className("error");
                Helper.waitForElement(driver , message);
                driver.findElement(message).isDisplayed();
                Allure.step("the validation message displayed");
                Helper.takeScreenShot(driver , "product validation message");
            }
            catch (Exception e)
            {
                Allure.step(e.getMessage());
                Assert.fail("The validation message not appeared");
            }
        }
        catch (Exception e)
        {
            Allure.step(e.getMessage());
            Assert.fail("Testcase failed");
        }
        return this;
    }
}
