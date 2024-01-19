package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigate {
    public static void main(String[] args) throws InterruptedException {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Aridunnu\\Desktop\\Seleniumintro\\src\\chromedriver.exe");
//    Launch browser
        WebDriver driver = new ChromeDriver();
//    maximize browser
        driver.manage().window().maximize();
//  navigate to the url
        driver.navigate(). to("https://www.saucedemo.com/");

        // Login using username and password
        driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("input#login-button")).click();
        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(5000);
        WebElement loginButton = driver.findElement(By.id("login-button"));
        String loginButtonValue = loginButton.getAttribute("value");
        System.out.println("Login button VALUE attribute: " + loginButtonValue);
        driver.navigate().forward();
        Thread.sleep(5000);
        WebElement ItemClassName = driver.findElement(By.className("inventory_item_name"));
        String ItemName = ItemClassName.getText();
        System.out.println(ItemName);

    }
}
