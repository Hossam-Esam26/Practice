package Pages.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browser {
    private static WebDriver driver ;
    private static String url = "https://demo.nopcommerce.com/";
    public static WebDriver setBrowser() {
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--headless=new");
        driver = new ChromeDriver(opt);
        driver.manage().window().maximize();
        driver.get(url);
        return Browser.driver;
    }

    public static void quit()
    {
        driver.quit();
    }
}
