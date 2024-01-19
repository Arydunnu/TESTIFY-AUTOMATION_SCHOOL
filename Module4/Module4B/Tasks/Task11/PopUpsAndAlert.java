package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class PopUpsAndAlert {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.msedge.driver","C:\\Users\\Aridunnu\\Desktop\\Seleniumintro\\src\\msedgedriver.exe");
//    Launch browser
        WebDriver driver = new EdgeDriver();
//    maximize browser
        driver.manage().window().maximize();
//  navigate to the url
        driver.navigate().to("https://www.google.com/");

        // Login using username and password
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("testify ltd");

        Thread.sleep (3000);
        driver.findElement(By.xpath("//body[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[2]/div[4]/div[2]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[2]/div[1]/div[1]/span[1]")).click();
        Thread.sleep (3000);
        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("window.scrollBy (0 , 500)");

        driver.findElement(By.xpath("//body/div[@id='main']/div[@id='cnt']/div[@id='rcnt']/div[@id='center_col']/div[@id='res']/div[@id='search']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/a[1]/h3[1]")).click();

        scroll.executeScript("window.scrollBy (0 , 500)");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//span[contains(text(),'We ar')]"));
        System.out.println(driver.findElement(By.xpath("//span[contains(text(),'We ar')]")).getText());

//        driver.findElement(By.xpath("/html[1]/body[1]/div[5]/div[3]/div[1]/div[2]/div[1]/div[2]/main[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/span[2]"));
//
//        System.out.println(driver.findElement(By.xpath("//span[contains(text(),'We ar')]")).getText());

        driver.findElement(By.xpath("//span[contains(text(),'quality first products while creating impact throu')]"));
        System.out.println(driver.findElement(By.xpath("//span[contains(text(),'quality first products while creating impact throu')]")).getText());

    }
}
