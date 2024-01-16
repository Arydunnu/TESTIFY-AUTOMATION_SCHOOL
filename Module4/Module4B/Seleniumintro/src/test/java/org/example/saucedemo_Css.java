package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class saucedemo_Css {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Aridunnu\\Documents\\Projects\\Testify\\TAS\\TESTIFY-AUTOMATION_SCHOOL\\Module4B\\Seleniumintro\\src\\chromedriver.exe");
//    Launch browser
        WebDriver driver = new ChromeDriver();
//    maximize browser
        driver.manage().window().maximize();
//  navigate to the url
        driver.get("https://www.saucedemo.com/");

        // Login using username and password
         driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("input#login-button")).click();

        // Click on the "add to cart" button of any product
        driver.findElement(By.cssSelector("button#add-to-cart-sauce-labs-fleece-jacket")).click();

      // Click the cart icon on the top right
      driver.findElement(By.cssSelector("a.shopping_cart_link")).click();

      // Click on checkout

        driver.findElement(By.cssSelector("button#checkout")).click();

    }
}
