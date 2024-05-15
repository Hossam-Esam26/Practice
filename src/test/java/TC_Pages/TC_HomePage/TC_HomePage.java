package TC_Pages.TC_HomePage;

import Pages.Base.Browser;
import Pages.HomePage.HomePage;
import io.qameta.allure.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Epic("nopcommerce")
@Feature("Home page")
public class TC_HomePage {
    private static  WebDriver driver;

    HomePage homePage;


    @BeforeTest
    public void openWebSite()
    {
        driver = Browser.setBrowser();
    }


    @Test (description = "Open the website home page")
    @Story("Open the home page")
    @Description("Open the website and check if this is the right website and take screenshot")
    public void homePage()
    {
        homePage = new HomePage(driver);
        homePage.checkWebSiteTitle()
                .takeScreenShot();
    }

    @Test (description = "Open the website home page")
    @Story("Open the home page")
    @Description("Open the website and check if this is the right website and take screenshot")
    public void homePaget()
    {
        homePage = new HomePage(driver);
        homePage.checkWebSiteTitle()
                .takeScreenShot();
    }

    @AfterMethod
    public void quit()
    {
        Browser.quit();
    }
}
