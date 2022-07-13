package selenium_Work_Space;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_xpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.w3schools.com/howto/howto_make_a_website.asp");
		//driver.findElement(By.xpath("//a[@class='w3-left ws-btn']")).click();
		//driver.findElement(By.xpath("//a[@class='w3-btn w3-margin-bottom']")).click();
		//driver.findElement(By.xpath("a[title='Search W3Schools']")).click();
		//driver.findElement(By.xpath("//p[text()='At W3Schools you will find a complete reference for keywords and function:']"));
		//xpath by attribute
		driver.get("https://www.amazon.com/");
		
		
		
		
		
		
		
//		System.out.println("=======combination of webdriver method and webelement method========");
//		driver.get("https://www.amazon.com/registries?ref_=nav_cs_registry");
//		//driver.findElement(By.xpath("//span[text()='SAMSUNG']")).click();
//		driver.findElement(By.xpath("//input[@class='gr-text gr-text--sm gr-text--tertiary gr-find-stripe__name']")).sendKeys("kiran");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//button[@class='gr-btn gr-btn--rounded gr-text gr-find-stripe__cta gr-find-stripe__submit']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@class='gr-text gr-text--sm gr-text--tertiary gr-find-stripe__name']")).clear();
//		
		
		
		
	}

}
 