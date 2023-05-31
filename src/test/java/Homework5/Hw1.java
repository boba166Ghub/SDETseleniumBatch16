package Homework5;
/*
http://practice.syntaxtechs.net/javascript-alert-box-demo.php
click on the last alert
send keys and accept it

Note: dont worry if the text u send doesnt appears up in the textbox
 */

import Utils.CommonMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Hw1 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {

        String url = "http://practice.syntaxtechs.net/javascript-alert-box-demo.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);


        WebElement alertBtn = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        alertBtn.click();
        Thread.sleep(2000);
        Alert confirmationAlert = driver.switchTo().alert();
        confirmationAlert.sendKeys("Bob!");
        Thread.sleep(2000);
        confirmationAlert.accept();
    }



}
