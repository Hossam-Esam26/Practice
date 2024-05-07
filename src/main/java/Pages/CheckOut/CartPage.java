package Pages.CheckOut;

import Pages.Base.ElementsActions;
import Pages.Base.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private WebDriver driver;

    //constructor
    public CartPage(WebDriver driver)
    {
        this.driver = driver;
    }

    //locator
    private By shoppingCartButton = By.className("cart-label");
    private By cartButton = By.className("cart-button");
    private By termsOfServiceCheckBox = By.xpath("//label[@for='termsofservice']");
    private By checkOutButton = By.className("checkout-button");

    //Actions

    public CartPage hoverOnShoppingCartButton()
    {
        Helper.waitForElement(driver , shoppingCartButton);
        ElementsActions.hover(driver , shoppingCartButton);
        return this;
    }

    public CartPage clickOnCartButton()
    {
        Helper.waitForElement(driver , cartButton);
        ElementsActions.clicker(driver , cartButton);
        return this;
    }

    public CartPage clickOnTermsOfServiceCheckBox()
    {
        Helper.waitForElement(driver , termsOfServiceCheckBox);
        ElementsActions.clicker(driver , termsOfServiceCheckBox);
        return this;
    }

    public CartPage clickOnCheckOutButton()
    {
        Helper.waitForElement(driver , checkOutButton);
        ElementsActions.clicker(driver , checkOutButton);
        return this;
    }
}
