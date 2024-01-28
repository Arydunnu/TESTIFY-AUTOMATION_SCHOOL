package TestNg.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FormsPage {

    WebDriver driver = null;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aridunnu\\Desktop\\Seleniumintro\\src\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demoqa.com");

        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("window.scrollBy (0 , 500)");
    }

    @Test
    public void testFormsPageNavigation() {

       driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]")).click();

        WebElement pageTitle = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/span[1]/div[1]/div[1]"));
        Assert.assertEquals(pageTitle.getText(), "Forms");

        System.out.println("True");
    }

    @AfterClass
    public void Quit() {

            driver.quit();
    }
}

