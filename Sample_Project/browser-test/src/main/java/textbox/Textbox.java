package textbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Textbox{
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
		Thread.sleep(3000);
		WebElement x =driver.findElement(By.id("login_field"));
		if(x.isDisplayed()) {
			if(x.isEnabled()) {
				x.sendKeys("Raj is good");
				String y = x.getAttribute("value");
				System.out.println(y);
				Thread.sleep(3000);
				x.clear();
				
				x.sendKeys("sunny issss very polite");
				Thread.sleep(3000);
				
			}
			else {
				System.err.println("failed");
				
			}
		}
		else {
			System.err.println("failed");
			
			
		}
		driver.quit();	
		}
}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//WebElement usernameTxt= driver.findElement(By.id("login_field"));
//		if(usernameTxt.isDisplayed()){
//			if(usernameTxt.isEnabled()) {
//				usernameTxt.sendKeys("Hyderabad");
//				String var =usernameTxt.getAttribute("value");
//				System.out.println(var);
//				
//				Thread.sleep(3000);
//			usernameTxt.clear();
//			usernameTxt.sendKeys("Rajkumar");
//				
//			}
//				
//			else {
//				System.err.println("Failed");
//				
//			
//		}
//		}
//		else{
//			System.err.println("Failed");
//			
//		}
//	
//		
//	}
//		
//	}
