package TC_Pages.TC_Product;

import Pages.Base.Browser;
import Pages.Products.ProductScenarios;
import io.qameta.allure.*;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

@Epic("nopcommerce")
@Feature("add Product to cart")
public class TC_SelectProduct {
    private WebDriver driver;
    ProductScenarios product;

    @BeforeMethod
    public void setBrowser()
    {
        driver = Browser.setBrowser();
        product = new ProductScenarios(driver);
    }

    @Test (description = "Valid scenario add product to cart" , priority = 1)
    @Story("Choose one category from the website and add it to the cart")
    @Description("the user will select all the desktop specifications and add to cart")
    @Severity(SeverityLevel.CRITICAL)
    public void validAddToCart() throws IOException, ParseException {
        product.addProductToTheCart();
    }

    @Test (description = "Invalid scenario add product to cart" , priority = 2)
    @Story("Choose one category from the website and add it to the cart")
    @Description("Check if the validation message display if the user not select any mandatory specifications")
    @Severity(SeverityLevel.CRITICAL)
    public void invalidAddToCart() throws IOException, ParseException {
        product.checkValidationMessage();
    }

    @AfterMethod
    public void quit()
    {
        Browser.quit();
    }

}
