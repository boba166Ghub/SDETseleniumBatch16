package Homework6;
/*
HW1:
goto  http://practice.syntaxtechs.net/dynamic-elements-loading.php
click on start
print the text  "welcome syntax technologies "on console (edited)

 */

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class  Hw1 extends CommonMethods {
    public static void main(String[] args) {

        String url="http://practice.syntaxtechs.net/dynamic-elements-loading.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebElement button=driver.findElement(By.xpath("//button[@id='startButton']"));
        button.click();

        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//h4[text()='Welcome Syntax Technologies']"),"Welcome Syntax Technologies"));
        WebElement element=driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        String text=element.getText();
        System.out.println(text);


    }
}
