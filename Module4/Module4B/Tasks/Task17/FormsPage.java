package TestNg.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
    }

    @Test
    public void testFormsPageNavigation() {

        WebElement formsTile = driver.findElement(By.cssSelector("div.body-height:nth-child(2) div.container.playgound-body div.row div.col-12.mt-4.col-md-3:nth-child(1) div.left-pannel div.accordion div.element-group:nth-child(2) span.group-header > div.header-wrapper"));
        formsTile.click();

        WebElement pageTitle = driver.findElement(By.className("main-header"));
        Assert.assertEquals(pageTitle.getText(), "Forms");
    }

    @AfterClass
    public void Quit() {

            driver.quit();
    }
}

