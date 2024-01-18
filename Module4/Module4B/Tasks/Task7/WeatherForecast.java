package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

        public class WeatherForecast {

            public static void main(String[] args) {
                // Set the path to the ChromeDriver executable
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aridunnu\\Desktop\\Seleniumintro\\src\\chromedriver.exe");

                // Initialize ChromeDriver
                WebDriver driver = new ChromeDriver();

                // Navigate to the website
                driver.get("https://worldweather.wmo.int/en/home.html");

                // Search for your city in the search field
                WebElement searchField = driver.findElement(By.id("q_search"));
                searchField.sendKeys("Lagos, Nigeria");
                driver.findElement(By.name("submit")).click();

                // Wait for the results to load
                try {
                    Thread.sleep(3000); // Adjust the sleep time as needed
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                // Print the days and weather descriptions
                WebElement weatherTable = driver.findElement(By.xpath("//div[@class='city_forecast_day_object]"));
                for (WebElement row : weatherTable.findElements(By.xpath("//div[@class='city_weekday_n_date']"))) {
                    WebElement dayCell = row.findElement(By.xpath(".//div[@class='city_weekday_n_date']"));
                    WebElement descriptionCell = row.findElement(By.xpath(".//div[@class='city_fc_desc fs0']"));

                    String day = dayCell.getText();
                    String description = descriptionCell.getText();

                    System.out.println("Day: " + day + ", Weather Description: " + description);
                }

                // Close the browser
                driver.quit();
            }
        }
