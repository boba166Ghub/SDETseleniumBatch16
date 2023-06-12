package Homework8;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Hw1 extends CommonMethods {
    public static void main(String[] args) {

        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url,browser);

        WebElement userName= driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement password=driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginBtn=driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginBtn.click();

        WebElement recruitmentBtn = driver.findElement(By.xpath("//b[normalize-space()='Recruitment']"));
        recruitmentBtn.click();

        WebElement calendarBtn = driver.findElement(By.xpath("(//img[@class='ui-datepicker-trigger'])[1]"));
        calendarBtn.click();

        WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select select = new Select(month);
        select.selectByValue("5");

        WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select select1 = new Select(year);
        select1.selectByValue("2023");

        List<WebElement> days = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr/td"));
        for (WebElement date : days) {
            String today = date.getText();
            if (today.equals("11")) {
                date.click();
            }
        }



    }
}