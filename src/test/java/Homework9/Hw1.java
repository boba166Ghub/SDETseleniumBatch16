package Homework9;
/*
HW:
    create a method in Common methods for screen-shot
    it should take file name as a parameter.
 */

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class Hw1 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException, IOException {



      Thread.sleep(2000);
      takeScreenShot("Boba1222.jpg");

    }
}
