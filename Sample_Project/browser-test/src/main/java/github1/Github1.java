package github1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Github1 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
		Thread.sleep(3000);
	    driver.findElement(By.id("login_field")).sendKeys("rajkumar");
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("password")).sendKeys("Sunny");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@value=\"Sign in\"]")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.className("class=\"octicon octicon-mark-github SessionsAuthHeader-module__avatarCoinGithub--IB40U\""));
		Thread.sleep(5000);
		driver.quit();
		
		
		
	}
	

}
