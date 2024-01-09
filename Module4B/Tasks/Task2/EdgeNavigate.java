package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeNavigate {
    public static void main(String[] args) {
        // Set the path to your EdgeDriver executable
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Aridunnu\\Documents\\Projects\\Testify\\TAS\\TESTIFY-AUTOMATION_SCHOOL\\Module4B\\Seleniumintro\\src\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();

        // Navigate to Google
        driver.get("https://www.google.com");

        driver.manage().window().maximize();
    }
}
