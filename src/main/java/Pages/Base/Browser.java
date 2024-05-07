package Pages.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
    private static WebDriver driver ;
    private static String url = "https://demo.nopcommerce.com/";
    public static WebDriver setBrowser()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        return Browser.driver;
    }

    public static void quit()
    {
        driver.quit();
    }
}
