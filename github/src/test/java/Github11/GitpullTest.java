package Github11;
		

	import org.junit.jupiter.api.Test;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import io.github.bonigarcia.wdm.WebDriverManager;

	import static org.junit.jupiter.api.Assertions.assertEquals;

	public class GitpullTest{
	    @Test
	    public void openGoogleTest() {
	        WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.google.com");

	        // Verify page title
	        assertEquals("Google", driver.getTitle());

	        driver.quit();
	    }
	}
