package logging;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Orange1 {
    public static void main(String[] args) throws InterruptedException {
        // Setup ChromeDriver automatically
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Maximize window
        driver.manage().window().maximize();

        // Open OrangeHRM login page
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // Wait for page to render (since you don’t want WebDriverWait)
        Thread.sleep(3000);

        // Enter credentials
        driver.findElement(By.name("username")).sendKeys("Admin");
        Thread.sleep(1000);
        driver.findElement(By.name("password")).sendKeys("admin123");
        Thread.sleep(1000);

        // Click login button
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        // Wait for dashboard to load
        Thread.sleep(3000);

        // Verify Dashboard is visible
        WebElement x = driver.findElement(By.xpath("//h6[text()='Dashboard']"));
        if (x.isDisplayed()) {
            System.out.println("✅ Login successful, Dashboard is displayed.");
        } else {
            System.out.println("❌ Login failed, Dashboard not found.");
        }

        // Close browser
        driver.quit();
    }
}

