package HomeWork2;

/*
HW  (only use XPATH)
navigate to fb.com
click on create new account
fill up all the textboxes
close the popup
close the browser
Note : in order for ur code to work
u have to put Thread.sleep(2000) after clicking on Create new account
 */


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://facebook.com");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys("Bob");
        driver.findElement(By.xpath("//input[@aria-label='Last name']")).sendKeys("Jackson");
        driver.findElement(By.xpath("//input[@aria-label='Mobile number or email']")).sendKeys("BobJ123@gmail.com");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@aria-label='Re-enter email']")).sendKeys("BobJ123@gmail.com");
        driver.findElement(By.xpath("//input[@aria-label='New password']")).sendKeys("bob123321");
        driver.findElement(By.xpath("//select[@name='birthday_month']")).sendKeys("Aug");
        driver.findElement(By.xpath("//select[@name='birthday_day']")).sendKeys("15");
        driver.findElement(By.xpath("//select[@name='birthday_year']")).sendKeys("1981");

        driver.findElement(By.xpath("//label[text()='Male']")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//img[@src='https://static.xx.fbcdn.net/rsrc.php/v3/yO/r/zgulV2zGm8t.png']")).click();

        Thread.sleep(2000);

        driver.quit();
    }
}




