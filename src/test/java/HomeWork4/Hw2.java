package HomeWork4;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static Utils.CommonMethods.openBrowserAndLaunchApplication;

/*
    hw2:
goto facebook.com
 click on create account
and select the your  date of birth using select class
     */
public class Hw2 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {

        String url="http://www.facebook.com";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']")).click();
        Thread.sleep(2000);
        WebElement month= driver.findElement(By.cssSelector("select[id='month']"));
        Select select1=new Select(month);
        select1.selectByValue("8");
        WebElement day= driver.findElement(By.cssSelector("select[id='day']"));
        Select select2= new Select(day);
        select2.selectByValue("1");
        WebElement year= driver.findElement(By.cssSelector("select[id='year']"));
        Select select3= new Select(year);
        select3.selectByValue("1981");
        Thread.sleep(2000);
        driver.quit();



    }
}
