package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99SignIn {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Aridunnu\\Documents\\Projects\\Testify\\TAS\\TESTIFY-AUTOMATION_SCHOOL\\Module4B\\Seleniumintro\\src\\chromedriver.exe");
//    Launch browser
        WebDriver driver = new ChromeDriver();
//    maximize browser
        driver.manage().window().maximize();
//  navigate to the url
        driver.get("https://demo.guru99.com/");
        driver.findElement(By.linkText("Security Project")).click();

    try{
        Alert alert = driver.switchTo().alert();
        alert.accept();

    }
    catch(NoAlertPresentException ne){

        System.out.println("Alert not displayed");
        }

        driver.findElement(By.name("password")).sendKeys("Guru5000");
    }
}
