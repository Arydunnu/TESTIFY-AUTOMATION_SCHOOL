package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

    public class TestNg {

        WebDriver driver = null;

        @BeforeMethod
        public void setUp() {
            // Set up the WebDriver (Assuming you have ChromeDriver installed and available in your system PATH)
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aridunnu\\Desktop\\Seleniumintro\\src\\chromedriver.exe");
            driver = new ChromeDriver();
        }

        @Test(priority = 1)
        public void googleSearchTest() throws InterruptedException {
            // Navigate to Google
            driver.get("https://www.google.com");
            Thread. sleep(5000);
            // Search for "testify" on Google
            WebElement searchBox = driver.findElement(By.name("q"));
            searchBox.sendKeys("testify");
            searchBox.submit();
        }

        @Test(priority = 2)
        public void mcdonaldsOrderNowButtonColorTest() throws InterruptedException {
            // Navigate to McDonald's website
            Thread. sleep(5000);
            driver.get("https://www.mcdonalds.com/us/en-us.html");

            // Find and print the color code of the "Order Now" button
            WebElement orderNowButton = driver.findElement(By.xpath("//a[contains(text(), 'Order Now')]"));
            String buttonColor = orderNowButton.getCssValue("background-color");
            System.out.println("Color Code of the 'Order Now' Button: " + buttonColor);
        }

        @AfterMethod
        public void quitbrowser() {
            // Close the browser after each test
            if (driver != null) {
                driver.quit();
            }
        }
    }
