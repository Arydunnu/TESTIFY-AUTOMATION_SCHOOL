package TestNg.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WidgetsPage {

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
    public void testWidgetsPageNavigation() {
        WebElement widgetsTile = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[4]"));
        widgetsTile.click();

        WebElement pageTitle = driver.findElement(By.className("main-header"));
        Assert.assertEquals(pageTitle.getText(), "Widgets");
    }

    @AfterClass
    public void Quit() {

            driver.quit();

    }
}
