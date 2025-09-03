// package dropdown;

// import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.support.ui.Select;

// import java.util.List;

// import org.openqa.selenium.By;
// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.WebElement;

// import io.github.bonigarcia.wdm.WebDriverManager;

// public class DropdownTest {
// 	public static void main(String[] args) throws InterruptedException {
// 		WebDriverManager.chromedriver().setup();
// 		WebDriver driver= new ChromeDriver();
// 		driver.manage().window().maximize();
// 		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
// //		WebElement CourseName =driver.findElement(By.id("course"));
// //		Select CourseDropdown = new Select(CourseName);//Coursedropdown is just a variabl;e
// //		List<WebElement> options= CourseDropdown.getOptions();//options is a variable        //for printing all checkboxes in console
// //		for(WebElement storing : options) {   //storing is a variable
// //			System.out.println(storing.getText());
// //		}
// //		
// //		CourseDropdown.selectByIndex(1);
// //		Thread.sleep(3000);
// //		CourseDropdown.selectByValue("js");
// //		Thread.sleep(3000);
// //		CourseDropdown.selectByVisibleText("Dot Net");
// //		Thread.sleep(3000);
// //		
// //		WebElement x=CourseDropdown.getFirstSelectedOption();// to print single selected checkbox in console
// //		System.out.println("selected text:"+x.getText());
// //		
// 		WebElement idedropdown =driver.findElement(By.id("ide"));
// 		Select idedropdownvar = new Select(idedropdown);
// 		List<WebElement> option=idedropdownvar.getOptions();
// 		for (WebElement storing :option) {
// 			System.out.println(storing.getText());
// 		}
		
// 		idedropdownvar.selectByIndex(0);
// 		Thread.sleep(3000);
// 		idedropdownvar.selectByValue("ij");
// 		Thread.sleep(3000);
// 		idedropdownvar.selectByVisibleText("NetBeans");
// 		Thread.sleep(3000);
// 		idedropdownvar.deselectByIndex(3);
// 		Thread.sleep(3000);
// 		List<WebElement> selectedstoring =idedropdownvar.getAllSelectedOptions();
// 		for (WebElement storage:selectedstoring) {
// 			System.out.println("selectedstoring:"+storage.getText());
// 		}
		
// 	}

//}
package dropdown;

import org.junit.jupiter.api.Test; // JUnit 5
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

public class DropdownTest {

    @Test
    public void dropdownTestExample() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");

        WebElement idedropdown = driver.findElement(By.id("ide"));
        Select idedropdownvar = new Select(idedropdown);

        List<WebElement> option = idedropdownvar.getOptions();
        for (WebElement storing : option) {
            System.out.println(storing.getText());
        }

        idedropdownvar.selectByIndex(0);
        Thread.sleep(3000);
        idedropdownvar.selectByValue("ij");
        Thread.sleep(3000);
        idedropdownvar.selectByVisibleText("NetBeans");
        Thread.sleep(3000);

        idedropdownvar.deselectByIndex(3);
        Thread.sleep(3000);

        List<WebElement> selectedstoring = idedropdownvar.getAllSelectedOptions();
        for (WebElement storage : selectedstoring) {
            System.out.println("selectedstoring:" + storage.getText());
        }

        driver.quit();
    }
}

