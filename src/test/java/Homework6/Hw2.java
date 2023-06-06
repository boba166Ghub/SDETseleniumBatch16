package Homework6;
/*
goto http://practice.syntaxtechs.net/dynamic-data-loading-demo.php
click on get new user
print the firstname of user
 */

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class Hw2 extends CommonMethods {
    public static void main(String[] args) {

        String url="http://practice.syntaxtechs.net/dynamic-data-loading-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebElement button = driver.findElement(By.xpath("//button[@id='save']"));
        button.click();
        WebElement firstName = driver.findElement(By.xpath("//p[contains(text(),'First Name :')]"));
        System.out.println(firstName.getText());


    }
}
