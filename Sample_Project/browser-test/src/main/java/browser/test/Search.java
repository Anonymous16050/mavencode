package browser.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Search {
    public static void main(String[] args) {
        // Automatically download & set up ChromeDriver
        WebDriverManager.chromedriver().setup();
        
        // Launch Chrome
        WebDriver driver = new ChromeDriver();
        
        // Open Google
        driver.get("https://www.google.com");
        
        // Find search box
        WebElement searchBox = driver.findElement(By.name("q"));
        
        // Type search query
        searchBox.sendKeys("Selenium WebDriver");
        
        // Submit search
        searchBox.submit();
        
        // Wait a bit to see results
        try { Thread.sleep(30000); } catch (InterruptedException e) { e.printStackTrace(); }
        
        // Close browser
        driver.quit();
    }
}


	
	


