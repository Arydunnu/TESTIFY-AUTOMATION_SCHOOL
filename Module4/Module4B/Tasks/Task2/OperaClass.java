package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class OperaClass {
    public static void main(String[] args) {
        // Set the path to your OperaDriver executable
        System.setProperty("webdriver.opera.driver", "C:\\Users\\Aridunnu\\Documents\\Projects\\Testify\\TAS\\TESTIFY-AUTOMATION_SCHOOL\\Module4B\\Seleniumintro\\src\\operadriver.exe");

        // Create a new instance of the OperaDriver
        WebDriver driver = new OperaDriver();

        // Navigate to Google
        driver.get("https://www.google.com");

        // Perform any interactions or tests here if needed

        // Close the browser
        driver.quit();
    }
}

