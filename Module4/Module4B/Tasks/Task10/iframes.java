package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframes {
    public static void main(String[] args) throws InterruptedException {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Aridunnu\\Desktop\\Seleniumintro\\src\\chromedriver.exe");
//    Launch browser
        WebDriver driver = new ChromeDriver();
//    maximize browser
        driver.manage().window().maximize();
//  navigate to the url
        driver.navigate(). to("https://jqueryui.com/dialog/");

//        click on the dialog menu from the left pane
        driver.findElement(By.xpath("//a[contains(text(),'Dialog')]")).click();
        Thread.sleep(3000);
//      switch to the iframe dialog box displayed
        driver.switchTo().frame(driver.findElement(By.xpath("//body/div[@id='container']/div[@id='content-wrapper']/div[1]/div[1]/iframe[1]")));
        Thread.sleep(3000);
//      click the close icon on the displayed dialog box
        WebElement iframe = driver.findElement(By.cssSelector(".ui-dialog-titlebar-close"));
        Thread.sleep(3000);
                 iframe.click();

    }
}
