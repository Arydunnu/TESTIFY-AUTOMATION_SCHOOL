package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

    public class SeleniumBlog {
        public static void main(String[] args) {
            // Set the path to your ChromeDriver executable
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aridunnu\\Desktop\\Seleniumintro\\src\\chromedriver.exe");

            // Create a new instance of the ChromeDriver
            WebDriver driver = new ChromeDriver();

            // Navigate to https://selenium08.blogspot.com/
            driver.get("https://selenium08.blogspot.com/");

            // Search for "Demo dropdown" from the search field
            driver.findElement(By.xpath("//div[contains(text(),'Search')]")).click();
            driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]")).sendKeys("Demo dropdown");

            // Click on the search result for "Demo dropdown"
            WebElement searchResultLink = driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/label[1]/div[1]/*[1]"));
            searchResultLink.click();

            driver.findElement(By.cssSelector("body.container.feed-view.search-view.version-1-3-3.variant-rockpool_light:nth-child(2) div.all-container:nth-child(2) div.main_content_container.clearfix div.page div.page_body div.centered main.centered-bottom div.main.section div.widget.Blog div.blog-posts.hfeed.container article.post-outer-container div.post-outer div.post-content.container div.post-bottom div.byline.jump-link a.flat-button.ripple > div.splash-wrapper")).click();


            // Switch to the iframe containing the dropdown example
            driver.switchTo().frame("");
//
//            // Select Nigeria from the country list
//            WebElement countryDropdown = driver.findElement(By.id("countries"));
//            Select countrySelect = new Select(countryDropdown);
//            countrySelect.selectByVisibleText("Nigeria");
//
//            // Select January, February, and March from the months list
//            WebElement monthsDropdown = driver.findElement(By.id("months"));
//            Select monthsSelect = new Select(monthsDropdown);
//            monthsSelect.selectByVisibleText("January");
//            monthsSelect.selectByVisibleText("February");
//            monthsSelect.selectByVisibleText("March");
//
//            // Switch back to the default content
//            driver.switchTo().defaultContent();
//
//            // Close the browser
//            driver.quit();
        }
    }
