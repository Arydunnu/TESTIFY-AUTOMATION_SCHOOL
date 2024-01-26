package TestNg.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

    public class ElementsPage {

        private WebDriver driver;

        @BeforeClass
        public void setUp() {
            // Set up WebDriver (Assuming you have ChromeDriver installed)
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aridunnu\\Desktop\\Seleniumintro\\src\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://demoqa.com");
        }

        @Test
        public void testElementsPageNavigation() {
            // Click on the Elements tile
            WebElement elementsTile = driver.findElement(By.xpath("//div[text()='Elements']"));
            elementsTile.click();

            // Assert that you are on the Elements page
            WebElement pageTitle = driver.findElement(By.className("main-header"));
            Assert.assertEquals(pageTitle.getText(), "Elements");
        }

        @AfterClass
        public void tearDown() {
            // Close the browser
            if (driver != null) {
                driver.quit();
            }
        }
    }
