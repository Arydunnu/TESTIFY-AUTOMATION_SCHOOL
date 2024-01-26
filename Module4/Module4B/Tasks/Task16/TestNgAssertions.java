package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

    public class TestNgAssertions {

        private WebDriver driver;

        @BeforeMethod
        public void setUp() {
            // Set up the WebDriver (Assuming you have ChromeDriver installed and available in your system PATH)
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aridunnu\\Desktop\\Seleniumintro\\src\\chromedriver.exe");
            driver = new ChromeDriver();
        }

        @Test
        public void verifyContactDetails() {
            // Navigate to the website
            driver.get("https://testifyltd.com/");

            // Locate the Our Contact column in the footer
            WebElement contactColumn = driver.findElement(By.xpath("//div[@class='container']//div[@class='col-md-3'][last()]"));

            // Extract and assert the details
            String email = contactColumn.findElement(By.xpath(".//p[contains(text(), 'EMAIL')]/following-sibling::p")).getText();
            String location = contactColumn.findElement(By.xpath(".//p[contains(text(), 'LOCATION')]/following-sibling::p")).getText();
            String phone = contactColumn.findElement(By.xpath(".//p[contains(text(), 'PHONE')]/following-sibling::p")).getText();

            Assert.assertEquals(email, "EMAIL: info@testifyltd.co.uk", "Incorrect Email");
            Assert.assertEquals(location, "LOCATION: Nigeria", "Incorrect Location");
            Assert.assertEquals(phone, "PHONE: (+234)904-882-0971", "Incorrect Phone");
        }

        @AfterMethod
        public void quitbrowser() {
            // Close the browser after the test
            if (driver != null) {
                driver.quit();
            }
        }
    }
