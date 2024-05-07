package Pages.Products;

import Pages.Base.ElementsActions;
import Pages.Base.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Computers {
    private WebDriver driver;

    //constructor
    public Computers(WebDriver driver)
    {
        this.driver = driver;
    }

    //locators
    private By computerDropDown = By.xpath("//div[@class = 'master-wrapper-page']/div[2]/ul[1]/li[1]/a[1]");
    private By desktopComputers = By.xpath("//div[@class = 'master-wrapper-page']/div[2]/ul[1]/li[1]/ul/li[1]");
    private By computer = By.xpath("//h2/a[text() = 'Build your own computer']");
    private By processor = By.xpath("//select[@id = 'product_attribute_1']");
    private By ram = By.xpath("//select[@id = 'product_attribute_2']");
    private By hardType = By.xpath("//dd/ul/li[2]/input[@name = 'product_attribute_3']");
    private By addToCartButton = By.xpath("//button [ text() ='Add to cart']");

    //Actions

    public Computers hoverOnComputerDropdown()
    {
        Helper.waitForElement(driver , computerDropDown);
        ElementsActions.hover(driver , computerDropDown);
        return this;
    }

    public Computers clickOnDesktopCategory()
    {
        Helper.waitForElement(driver, desktopComputers);
        ElementsActions.clicker(driver , desktopComputers);
        return this;
    }

    public Computers clickOnDesktopComputer()
    {
        Helper.waitForElement(driver, computer);
        ElementsActions.clicker(driver , computer);
        return this;
    }

    public Computers selectYourProcessor()
    {
        Helper.waitForElement(driver,processor);
        ElementsActions.selector(driver , processor,"1");
        return this;
    }

    public Computers selectYourRam()
    {
        Helper.waitForElement(driver,ram);
        ElementsActions.selector(driver , ram,"5");
        return this;
    }

    public Computers chooseHardType()
    {
        Helper.waitForElement(driver , hardType);
        ElementsActions.clicker(driver , hardType);
        return this;
    }

    public Computers clickOnAddToCartButton() {
        Helper.waitForElement(driver , addToCartButton);
        ElementsActions.clicker(driver , addToCartButton);
        return this;
    }
}
