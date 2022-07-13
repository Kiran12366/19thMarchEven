package selenium_Work_Space;

//import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.io.FileHandler;

public class IframeTesting {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@target='packageFrame'][1]")).click();
////		// 1.name
//		driver.switchTo().frame("classFrame");
//		Thread.sleep(1000);
//		driver.findElement(By.linkText("org.openqa.selenium.bidi")).click();
//		Thread.sleep(1000);
//////		// 2.webelement
//		driver.switchTo().defaultContent();
//		WebElement iframe_title = driver.findElement(By.xpath("//iframe[@title='Package, class and interface descriptions']"));
//		Thread.sleep(5000);
//		driver.switchTo().frame(iframe_title);
//		Thread.sleep(2000);
//		driver.findElement(By.linkText("HasBiDi")).click();
//		Thread.sleep(2000);
		
//		driver.switchTo().defaultContent();
//	   Thread.sleep(2000);
//		driver.switchTo().frame("classFrame");
//		Thread.sleep(1000);
//		driver.findElement(By.linkText("org.openqa.selenium")).click();
//		
//		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver\r\n");
//		//3.id
//		driver.switchTo().frame("frame1");
//		driver.findElement(By.tagName("input")).sendKeys("hello");
		
	
		
		
		
	
	

		
	}
}