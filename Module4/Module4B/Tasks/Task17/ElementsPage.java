package TestNg.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import javax.swing.text.Element;

import static org.testng.Assert.assertEquals;

public class ElementsPage {

         WebDriver driver = null ;

        @BeforeSuite
        public void setUp() throws InterruptedException {
            // Set up WebDriver
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aridunnu\\Desktop\\Seleniumintro\\src\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://demoqa.com");

            JavascriptExecutor scroll = (JavascriptExecutor) driver;
            scroll.executeScript("window.scrollBy (0 , 500)");
            Thread. sleep(3000);
        }

        @Test
        public void testElementsPageNavigation() throws InterruptedException {
            // Click on the Elements tile
           driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]")).click();

            JavascriptExecutor scroll = (JavascriptExecutor) driver;
            scroll.executeScript("window.scrollBy (0 , 500)");

            Thread.sleep(3000);

            // Assert that you are on the Elements page
            WebElement pageTitle = driver.findElement(By.className("header-text"));
            Assert.assertEquals(pageTitle.getText(), "Elements");

//            System.out.println(pageTitle);
        }


        @AfterClass
        public void Quit() {
            // Close the browser
            if (driver != null) {
                driver.quit();
            }
        }
    }
