package TestNg.example;

import org.example.PomTasskSauceDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PomTaskSauceDemo {
    WebDriver driver = null;
@Test
    public void main() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aridunnu\\Desktop\\Seleniumintro\\src\\chromedriver.exe");
//    Launch browser

        WebDriver driver = new ChromeDriver();
//    maximize browser
        driver.manage().window().maximize();
//  navigate to the url

    driver.get("https://www.saucedemo.com/");

    PomTasskSauceDemo Login = new PomTasskSauceDemo(driver);
    Login.getUsername().sendKeys("standard_user");
    Login.getPassword().sendKeys("secret_sauce");
    Login.getloginButton().click();
    Login.getitem1().click();
    Login.getitem2().click();
    Login.getcarticon().click();
    Login.getcheckoutbutton().click();
    Login.getfirstname().sendKeys("Aridunnu");
    Login.getlastname().sendKeys("Ary");
    Login.getPostalcode().sendKeys("32201");
    Login.getcontinuebutton().click();
    Login.getfinish().click();
    WebElement successmessage = driver.findElement(By.xpath("//h2[contains(text(),'Thank you for your order!')]"));
    Assert.assertEquals(successmessage.getText(), "Thank you for your ITEM!");








    }


////       input the Username
//    @Test
//    public void ProcessOfOrderingAnItem() {
//        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
////        Input the Password
//        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("secret_sauce");
////        Click the login Button
//        driver.findElement(By.xpath("//input[@value='Login']")).click();
////        click the add to cart button
//      WebElement item1 =driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
//                item1.click();
//        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']")).click();
////        click on the cart icon
//        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
////        Click on the check out
//        driver.findElement(By.xpath("//button[@name='checkout']")).click();
//        driver.findElement(By.id("first-name")).sendKeys("Aridunnu");
//        driver.findElement(By.id("last-name")).sendKeys("Ary");
//        driver.findElement(By.id("postal-code")).sendKeys("50502");
//        driver.findElement(By.id("continue")).click();
//        driver.findElement(By.id("finish")).click();
//
////        Assert.assertEquals(order, "item1", "Order correct");
////        Assert.assertEquals(location, "LOCATION: Nigeria", "Incorrect Location");
////        Assert.assertEquals(phone, "PHONE: (+234)904-882-0971", "Incorrect Phone");
//    }
//
////        WebElement success = driver.findElement(By.xpath("//h2[contains(text(),'Thank you for your order!')]"));
////        Assert.assertEquals(success .getText(), "Thank you for your order!");
//
//@AfterClass
//
//        public void quit() {
//
//            driver.quit();
//
//        }

        }
