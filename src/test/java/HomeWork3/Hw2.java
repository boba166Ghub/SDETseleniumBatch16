package HomeWork3;
/*
HW2:
Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D
Enter valid username
Leave password field empty
Click on login button
Verify error message with text “Password cannot be empty” is displayed.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D");

        WebElement userName=driver.findElement(By.cssSelector("input[name='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement logInButton=driver.findElement(By.cssSelector("input[id='btnLogin']"));
        logInButton.click();
        Thread.sleep(2000);
        WebElement message=driver.findElement(By.xpath("//span[@id='spanMessage']"));
        String text= message.getText();
        System.out.println(text);



    }


}
