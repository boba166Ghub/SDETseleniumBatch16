package Homework6;
/*
HW3:
develop a function in common methods to select from dropdown(single select)


 */

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class Hw3 extends CommonMethods {
    public static void main(String[] args) {

        String url = "http://practice.syntaxtechs.net/dynamic-data-loading-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        WebElement newUserB = driver.findElement(By.xpath("//button[@id='save']"));
        newUserB.click();

        WebElement userFirstName = driver.findElement(By.xpath("//p[contains(text(), 'First Name')]"));
        System.out.println(userFirstName.getText());

    }




}
