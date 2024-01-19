package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

    public class ToolsQA {
        public static void main(String[] args) throws InterruptedException {
            // Set the path to your ChromeDriver executable
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aridunnu\\Desktop\\Seleniumintro\\src\\chromedriver.exe");

            // Create a new instance of the ChromeDriver
            WebDriver driver = new ChromeDriver();

            // Navigate to https://www.toolsqa.com/
            driver.get("https://www.toolsqa.com/");

                Thread .sleep(5000);
            // Click on the tutorial button on the top left corner of the page
            driver.findElement(By.xpath("//span[contains(text(),'Tutorials')]")).click();

        }
    }

