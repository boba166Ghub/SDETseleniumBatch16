package HomeWork10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
How To Login Into Any Site If It Is Showing Any Authentication Pop-Up for
a Username And Password?
http://the-internet.herokuapp.com/basic_auth
String username = "admin";
 String password = "admin";
*/

public class Hw1 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");


    }


}
