package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class saucedemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Aridunnu\\Documents\\Projects\\Testify\\TAS\\TESTIFY-AUTOMATION_SCHOOL\\Module4B\\Seleniumintro\\src\\chromedriver.exe");
//    Launch browser
        WebDriver driver = new ChromeDriver();
//    maximize browser
        driver.manage().window().maximize();
//  navigate to the url
        driver.get("https://www.saucedemo.com/");
//       input the Username
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
//        Input the Password
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("secret_sauce");
//        Click the login Button
        driver.findElement(By.xpath("//input[@value='Login']")).click();
//        click the add to cart button
        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']")).click();
//        click on the cart icon
        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
//        Click on the check out
        driver.findElement(By.xpath("//button[@name='checkout']")).click();


    }
}
