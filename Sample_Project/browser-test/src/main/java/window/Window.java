package window;
	import java.util.Set;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import io.github.bonigarcia.wdm.WebDriverManager;
	public class Window{
		public static void main(String[] args) throws InterruptedException {
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
			Thread.sleep(3000);
			String parentwindowHandle = driver.getWindowHandle();
			System.out.println("parentwinow"+parentwindowHandle+driver.getTitle());
		    driver.findElement(By.id("newWindowBtn")).click();
		    Set<String> windowhandles = driver.getWindowHandles();
		    for (String windowhandle : windowhandles) {
		    	if(!windowhandle.equals(parentwindowHandle)) {
		    		driver.switchTo().window(windowhandle);
		    		driver.manage().window().maximize();
		    		driver.findElement(By.id("firstName")).sendKeys("rajkumar is going to hyderabad");
		    		Thread.sleep(3000);
		    		driver.close();
		    		
		    	}
		    	driver.switchTo().window(parentwindowHandle);
		    driver.findElement(By.id("name")).sendKeys("Sunny is good");	
		  
		    	//driver.switchTo().window(windowhandle);
		    	//System.out.println(windowhandle+driver.getTitle());
		    }
		    driver.quit();
		    
	

}
}