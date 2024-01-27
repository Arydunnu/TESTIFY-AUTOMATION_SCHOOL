package TestNg.example;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.testng.Assert;
        import org.testng.annotations.AfterClass;
        import org.testng.annotations.BeforeClass;
        import org.testng.annotations.Test;

public class InteractionsPage{

    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aridunnu\\Desktop\\Seleniumintro\\src\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demoqa.com");
    }

    @Test
    public void testInteractionsPageNavigation() {
        WebElement interactionsTile = driver.findElement(By.xpath("//div[text()='Interactions']"));
        interactionsTile.click();

        WebElement pageTitle = driver.findElement(By.className("main-header"));
        Assert.assertEquals(pageTitle.getText(), "Interactions");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
