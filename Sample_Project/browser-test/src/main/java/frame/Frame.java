package frame;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
	public class Frame{
		public static void main(String[] args) throws InterruptedException {
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
			Thread.sleep(3000);
			driver.findElement(By.id("name")).sendKeys("im preapring for interview");
			driver.switchTo().frame("frm1");
			WebElement course1  = driver.findElement(By.id("course"));
			Select Course2 = new Select(course1);
			Course2.selectByIndex(1);
			driver.switchTo().defaultContent();
			driver.findElement(By.id("name")).sendKeys("why not i");
			driver.switchTo().frame("frm2");
			driver.findElement(By.id("firstName")).sendKeys("Raj");
			driver.switchTo().defaultContent();
			driver.switchTo().frame("frm1");
			Course2.selectByVisibleText("Python");
			driver.switchTo().defaultContent();
			driver.findElement(By.id("name")).sendKeys("sunny ");
			
			
			

			
			
			
			
		}
}
