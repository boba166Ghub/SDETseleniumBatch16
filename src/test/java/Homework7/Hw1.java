package Homework7;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Hw1 extends CommonMethods {
    public static void main(String[] args) {

        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);


//    log into website
        WebElement userName = driver.findElement(By.xpath("//input[@name='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement userPassword = driver.findElement(By.xpath("//input[@name='txtPassword']"));
        userPassword.sendKeys("Hum@nhrm123");

        WebElement logInBtn = driver.findElement(By.xpath("//input[contains(@id, 'btn')]"));
        logInBtn.click();

//     click on the Pim
        WebElement pim = driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
        pim.click();

//     getting all ids of row
        List<WebElement> allId = driver.findElements(By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td[2]"));


//     getting the row number of 55804A
        for (int i = 0; i < allId.size(); i++) {
            String idText = allId.get(i).getText();
            if(idText.contains("55804A")){
                System.out.println("The row number of id 55804A : " + (i+1));
            }

        }


    }
}
