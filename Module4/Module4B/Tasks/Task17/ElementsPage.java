package TestNg.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

    public class ElementsPage {

         WebDriver driver = null ;

        @BeforeSuite
        public void setUp() {
            // Set up WebDriver
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aridunnu\\Desktop\\Seleniumintro\\src\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://demoqa.com");
        }

        @Test(groups = { })
        public void testElementsPageNavigation() {
            // Click on the Elements tile
            WebElement elementsTile = driver.findElement(By.cssSelector("div.body-height:nth-child(2) div.container.playgound-body div.row div.col-12.mt-4.col-md-3:nth-child(1) div.left-pannel div.accordion div.element-group:nth-child(2) span.group-header > div.header-wrapper"));
            elementsTile.click();

            // Assert that you are on the Elements page
            WebElement pageTitle = driver.findElement(By.className("main-header"));
            Assert.assertEquals(pageTitle.getText(), "Elements");
        }

        @AfterClass
        public void Quit() {
            // Close the browser
            if (driver != null) {
                driver.quit();
            }
        }
    }
