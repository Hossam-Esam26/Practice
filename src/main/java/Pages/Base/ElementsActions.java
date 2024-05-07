package Pages.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ElementsActions {
    private WebDriver driver;

    //Actions

    public static void sendText(WebDriver driver , By locator ,String text )
    {
        driver.findElement(locator).sendKeys(text);
    }

    public static void clicker(WebDriver driver , By locator)
    {
        driver.findElement(locator).click();
    }

    public static void selector(WebDriver driver , By locator , String value)
    {
        WebElement element = driver.findElement(locator);
        Select select = new Select(element);
        select.selectByValue(value);
    }

    public static void hover (WebDriver driver , By locator)
    {
        WebElement element = driver.findElement(locator);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }

}
