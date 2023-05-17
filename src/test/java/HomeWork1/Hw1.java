package HomeWork1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver =new ChromeDriver();

        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");

        driver.manage().window().maximize();

        driver.findElement(By.id("customer.firstName")).sendKeys("Bob");
        driver.findElement(By.id("customer.lastName")).sendKeys("Jackson");
        driver.findElement(By.id("customer.address.street")).sendKeys("123 Pine Street");
        driver.findElement(By.id("customer.address.city")).sendKeys("Miami");
        driver.findElement(By.id("customer.address.state")).sendKeys("FL");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("33015");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("561-123-2241");
        driver.findElement(By.name("customer.ssn")).sendKeys("112-23-1234");
        driver.findElement(By.name("customer.username")).sendKeys("bob123");
        driver.findElement(By.name("customer.password")).sendKeys("123bob!12");
        driver.findElement(By.name("repeatedPassword")).sendKeys("123bob!12");

        Thread.sleep(6000);
        driver.close();







    }
}
