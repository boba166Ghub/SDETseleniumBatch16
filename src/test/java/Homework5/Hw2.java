package Homework5;
/*
goto https://chercher.tech/practice/frames

click on check box
then select bay cat from drop down
then enter text in text box (edited)
CherCherTech
 */

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Hw2 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {

        driver.switchTo().frame("frame1");
        WebElement frame3 = driver.findElement(By.xpath("//iframe[@id='frame3']"));
        driver.switchTo().frame(frame3);
        driver.findElement(By.id("a")).click();

        driver.switchTo().defaultContent();
        Thread.sleep(1000);
        driver.switchTo().frame(1);

        WebElement animal = driver.findElement(By.xpath("//b[text()='Animals :']"));
        System.out.println(animal.getText());

        WebElement dd = driver.findElement(By.xpath("//select[@id='animals']"));
        Select sel = new Select(dd);
        sel.selectByVisibleText("Baby Cat");
        Thread.sleep(1000);

        driver.switchTo().defaultContent();

        driver.switchTo().frame("frame1");
        WebElement textBox = driver.findElement(By.xpath("//input"));
        textBox.sendKeys("Test");

    }

}
