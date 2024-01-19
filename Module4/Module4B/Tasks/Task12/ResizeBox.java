package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

    public class ResizeBox {
        public static void main(String[] args) throws InterruptedException {
            // Set the path to your ChromeDriver executable
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aridunnu\\Desktop\\Seleniumintro\\src\\chromedriver.exe");

            // Create a new instance of the ChromeDriver
            WebDriver driver = new ChromeDriver();
            driver.manage(). window().maximize();

            // Navigate to https://jqueryui.com/
            driver.get("https://jqueryui.com/");
            Thread.sleep(5000);

            // Click on the "resize" menu from the left pane
            driver.findElement(By.linkText("Resizable")).click();

            Thread.sleep(5000);
            // Switch to the iframe containing the example
            driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
            Thread.sleep(5000);

            // Locate the resizable box
            WebElement resizableBox = driver.findElement(By.cssSelector(".ui-resizable-handle"));
            Thread.sleep(5000);

            // Resize the box to be bigger
            Actions actions = new Actions(driver);
            actions.clickAndHold(resizableBox).moveByOffset(100, 100).release().perform();

            Thread.sleep(5000);
            driver.quit();
        }
    }
