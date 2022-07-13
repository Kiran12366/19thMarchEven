package selenium_Work_Space;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowByGet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("https://skpatro.github.io/demo/links/");
////		String mainPageID = driver.getWindowHandle();
////		System.out.println(mainPageID);
//		driver.findElement(By.name("NewWindow")).click();
	Set<String> allPage = driver.getWindowHandles();
		
//		ArrayList<String> al = new ArrayList<String>(allPage);
//		driver.switchTo().window(al.get(1));
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
//		driver.findElement(By.id("the7-search")).sendKeys("java");
//		driver.close();
//		driver.switchTo().window(al.get(0));
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		String mainPageID = driver.getWindowHandle();      // id of main page
		System.out.println(mainPageID);
		System.out.println("================");
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(2000);
		Set<String> allpageIDs = driver.getWindowHandles();
		System.out.println(allpageIDs);
		 ArrayList<String> al= new ArrayList<String>(allpageIDs);
		 System.out.println(al.get(0));       // address of main page
		 System.out.println(al.get(1));    	// address of child1 browser
         Thread.sleep(1000);
         driver.switchTo().window(al.get(1));
         driver.manage().window().maximize();
		 Thread.sleep(1000);
		 driver.findElement(By.id("the7-search")).sendKeys("selenium");
		//driver.close();      //will close only current focused tab
		 //driver.quit();      // will close all tabs/pages opened by selenium
       driver.switchTo().window(al.get(0));


	}

}
