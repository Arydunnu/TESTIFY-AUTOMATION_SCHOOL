package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleNavigate {
    public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\Aridunnu\\Documents\\Projects\\Testify\\TAS\\TESTIFY-AUTOMATION_SCHOOL\\Module4B\\Seleniumintro\\src\\chromedriver.exe");
//    Launch browser
    WebDriver driver = new ChromeDriver();
//    maximize browser
        driver.manage().window().maximize();
//  navigate to the url
    driver.get("https://www.smartr.me/application-ats/ac60a5b1-5e61-4b76-8b45-78003e51ad32");
    }
}