package Pages.Base;

import io.qameta.allure.Allure;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

public  class Helper {
    private WebDriver driver ;


    //take screenshot
    public static void takeScreenShot(WebDriver driver ,String photoPath) throws IOException {
        // Take screenshot and save it as a file
        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        // Define the destination path for the screenshot
        String path = "D:/Related to me/Automation/Practice/ScreenShots/"+photoPath+".jpg";
        // Copy the screenshot file to the destination path
        FileUtils.copyFile(screenshotFile, new File(path));
        Allure.addAttachment("screenshot" , new FileInputStream(screenshotFile));

    }

    public static void waitForElement(WebDriver driver,By locator)
    {
        WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
