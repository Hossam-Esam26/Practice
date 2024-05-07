package TC_Pages.TC_Checkout;

import Pages.Base.Browser;
import Pages.Base.Helper;
import Pages.CheckOut.CheckoutScenario;
import io.qameta.allure.*;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

@Epic("nopcommerce")
@Feature("Order Checkout")
public class TC_OrderCheckOut {
    private WebDriver driver ;
    CheckoutScenario checkout;

    @BeforeMethod
    public void setBrowser()
    {
        driver = Browser.setBrowser();
        checkout = new CheckoutScenario(driver);
    }

    @Test
    @Story("View the cart and checkout the order")
    @Description("After the user add the product he will go to the cart and check out and enter his information to finish the order")
    @Severity(SeverityLevel.CRITICAL)
    public void checkOut()  {
        checkout.checkOutAndCompleteTheOrder();
    }

    @AfterMethod
    public void quit()
    {
        Browser.quit();
    }

}
