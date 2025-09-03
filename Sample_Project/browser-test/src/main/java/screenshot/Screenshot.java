package screenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;

public class Screenshot {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		File file = driver.getScreenshotAs(OutputType.FILE);
		File destiny = new File("./screenshots/img4.jpg");
		FileUtils.copyFile(file, destiny);
		System.out.println("Successful");
		
		
//		byte[] bytearr= driver.getScreenshotAs(OutputType.BYTES);
//		File destiny = new File("./screenshots/img5.jpg");
//		FileOutputStream fos =new  FileOutputStream(destiny);
//		fos.write(bytearr);
//		fos.close();
//		System.out.println("Successful");
		
//		
		

		
		driver.quit();
	}
	

}
