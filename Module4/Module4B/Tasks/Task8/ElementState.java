package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class ElementState {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.msedge.driver","C:\\Users\\Aridunnu\\Desktop\\Seleniumintro\\src\\msedgedriver.exe");
//    Launch browser
        WebDriver driver = new EdgeDriver();
//    maximize browser
        driver.manage().window().maximize();
//  navigate to the url
        driver.get(" https://idorenyinankoh.github.io/loginPage/");

        // Login using username and password
        driver.findElement(By.cssSelector("input#firstName")).sendKeys("standard");
        driver.findElement(By.cssSelector("input#lastName")).sendKeys("sauce");
        driver.findElement(By.cssSelector("input#email")).sendKeys("sauce@gmail.com");
        driver.findElement(By.id("female")).click();
        driver.findElement(By.cssSelector("input#password")).sendKeys("saucestandard");
        driver.findElement(By.cssSelector("input#confirmPass")).sendKeys("saucestandard");
        driver.findElement(By.cssSelector("input#xpLevel")).sendKeys("I am great");
        driver.findElement(By.cssSelector("input#xpLevel")).click();
        Thread.sleep(5000);
        boolean state = driver.findElement(By.cssSelector("button#create")).isEnabled();
        System.out.println(state);
    }
}
