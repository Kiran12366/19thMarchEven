package selenium_Work_Space;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.utility.RandomString;

public class WebElements {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//		 driver.get("https://www.facebook.com/");
//		 driver.findElement(By.name("email")).sendKeys("Kiran Podey");
//		 Thread.sleep(1000);
//		 driver.findElement(By.id("pass")).sendKeys("968shahu");
//		 Thread.sleep(1000);
//		 driver.findElement(By.name("login")).click();
//		 
//		 driver.manage().window().maximize();
//		 driver.findElement(By.xpath("//a[@aria-label='Watch']")).click();
//		 		 
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		Thread.sleep(1000);
		driver.switchTo().frame("iframeResult");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='button']")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[@title='Change Theme']")).click();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		 WebElement menuButton = driver.findElement(By.id("menuButton"));
		 menuButton.click();
         Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Change Orientation']")).click();
		 
	File src	=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	System.out.println(src);
	File des=new File("F:\\Automation testing\\Screenshot\\w3school.png");
	FileHandler.copy(src, des);
	  String str= RandomString.make(4);
	File des1=new File("F:\\Automation testing\\Screenshot\\w3school"+str+".png");
	FileHandler.copy(src, des1);
	
	
	
		
		

	}

	
}
