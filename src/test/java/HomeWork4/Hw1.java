package HomeWork4;

/*
HW1:
goto   http://practice.syntaxtechs.net/basic-select-dropdown-demo.php
select , tuesday, thursday and friday one by one
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static Utils.CommonMethods.driver;
import static Utils.CommonMethods.openBrowserAndLaunchApplication;

public class Hw1 {
    public static void main(String[] args) throws InterruptedException {

        String url="http://practice.syntaxtechs.net/basic-select-dropdown-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);



        WebElement days = driver.findElement(By.cssSelector("select.form-control"));
        Select sel = new Select(days);
        sel.selectByValue("Tuesday");
        Thread.sleep(2000);
        sel.selectByValue("Thursday");
        Thread.sleep(2000);
        sel.selectByValue("Friday");
        Thread.sleep(2000);


    }

}
