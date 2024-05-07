package Pages.CheckOut;

import Pages.Base.Helper;
import Pages.Login.LoginScenario;
import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CheckoutScenario {
    private WebDriver driver;
    CartPage cartPage;
    FormPage formPage;

    //constructor
    public CheckoutScenario (WebDriver driver)
    {
        this.driver = driver;
    }

    public CheckoutScenario checkOutAndCompleteTheOrder()
    {
        try {
            new LoginScenario(driver).loginWithValidData();
            cartPage = new CartPage(driver);
            cartPage.hoverOnShoppingCartButton()
                    .clickOnCartButton();
            Helper.takeScreenShot(driver , "Cart");
            cartPage.clickOnTermsOfServiceCheckBox()
                    .clickOnCheckOutButton();
            formPage = new FormPage(driver);
            formPage.selectCountry("formPage" ,"country")
                    .enterYourCity("formPage" ,"cityField")
                    .enterYourAddress("formPage" ,"addressField")
                    .enterYourPostalCode("formPage" ,"postalCodeField")
                    .enterYourPhoneNumber("formPage" ,"phoneNumberField");
            Helper.takeScreenShot(driver , "BillingAddress");
            formPage.clickOnBillingAddress_ContinueButton();
            Helper.takeScreenShot(driver , "ShippingMethod");
            formPage.clickOnShippingMethod_ContinueButton();
            Helper.takeScreenShot(driver , "PaymentMethod");
            formPage.clickOnPaymentMethod_ContinueButton();
            Helper.takeScreenShot(driver , "PaymentInformation");
            formPage.clickOnPaymentInformation_ContinueButton();
            Helper.takeScreenShot(driver , "ConfirmOrder");
            formPage.clickOnConfirmOrder_ContinueButton();
            try {
                By message = By.xpath("//div[@class='section order-completed']/div/strong");
                Helper.waitForElement(driver , message);
                driver.findElement(message).isDisplayed();
                Helper.takeScreenShot(driver , "OrderCompleted");
                Allure.step("Your order has been successfully processed!");
            }
            catch (Exception e)
            {
                Allure.step(e.getMessage());
                Assert.fail("Your order Not done");
            }

            formPage.clickOnOrderCompleted_ContinueButton();

        }
        catch (Exception e)
        {
            Allure.step(e.getMessage());
            Assert.fail("testcase failed");
        }
        return this;
    }
}
