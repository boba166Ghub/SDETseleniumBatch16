package HomeWork3;
/* Use CSS and Xpath to do this:
    Open Chrome browser
    Go to “http://practice.syntaxtechs.net/input-form-demo.php”
    Fill in the complete form
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw1 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/input-form-demo.php");
        driver.manage().window().maximize();

        driver.get("http://practice.syntaxtechs.net/input-form-demo.php");
        driver.findElement(By.cssSelector("input[name='first_name']")).sendKeys("Bob");
        driver.findElement(By.cssSelector("input[name='last_name']")).sendKeys("Jackson");
        driver.findElement(By.cssSelector("input[placeholder='E-Mail Address']")).sendKeys("Example@gmail.com");
        driver.findElement(By.cssSelector("input[name='phone']")).sendKeys("646-266-1111");
        driver.findElement(By.cssSelector("input[placeholder='Address']")).sendKeys("10 Main Street");
        driver.findElement(By.cssSelector("input[placeholder='city']")).sendKeys("West Palm Beach");
        driver.findElement(By.cssSelector("select[name='state']")).sendKeys("Florida");
        driver.findElement(By.cssSelector("input[name='zip']")).sendKeys("33409");
        driver.findElement(By.cssSelector("input[placeholder='Website or domain name']")).sendKeys("www.123Web.com");
        driver.findElement(By.cssSelector("input[value='yes']")).click();
        driver.findElement(By.cssSelector("textarea[name='comment']")).sendKeys("Test project");


    }
}
