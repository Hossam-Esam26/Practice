package Pages.HomePage;

import Pages.Base.Helper;
import io.qameta.allure.Allure;
import org.openqa.selenium.WebDriver;


public class HomePage {
    private final WebDriver driver;

    //contractor------
    public HomePage(WebDriver driver)
    {
        this.driver = driver;
    }

    //locators
    public HomePage checkWebSiteTitle()
    {
        Allure.step(driver.getTitle());
        return this;
    }

    public HomePage takeScreenShot()
    {
        try {
             Helper.takeScreenShot(driver,"Home page");
        } catch (Exception e) {
            System.out.println("Failed to take screenshot: " + e.getMessage());
        }
        return this;
    }
}
