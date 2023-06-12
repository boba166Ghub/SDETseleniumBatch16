package Utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class CommonMethods {

    //create instance
    public static WebDriver driver; // Webdriver outside -instance method

    public static void openBrowserAndLaunchApplication(String URL, String browser) {

        switch (browser) {
            case "chrome":
                driver = new ChromeDriver();
                break;

            case "firefox":
                driver = new FirefoxDriver();
                break;
        }


        //navigate to url
        driver.get(URL);


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    public static void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }

    //method to send keys
    public static void sendText(String text, WebElement element) { // method to send keys
        element.clear();
        element.sendKeys(text);
    }

    public static void selectSingle(WebElement days, String monday) {
    }


    public static void takeScreenShot(String filename) {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File screenShot = ts.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenShot, new File("C:\\Users\\bdell\\OneDrive\\Desktop\\ScreenShots\\"+filename));

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}