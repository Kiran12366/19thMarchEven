package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//by id, name, classname, link text ,partial link text ,css selector,xpathframe
		
		//1.id
		//driver.findElement(By.id("passContainer")).click();
		
		//2.name
		//driver.findElement(By.name("email")).click();
		
		//3.className
		//driver.findElement(By.className("_6lux")).click();
		
		//	4.linkedText -to identify link text is present in anchor tag 
		//driver.findElement(By.linkText("Forgotten password?")).click();
		
		//5.partial linktext Locating WebElements using partial link text is preferred when the link text is too long.
		//driver.findElement(By.partialLinkText("Forgotten ")).click();
		
		//6. Tagname
		//driver.findElement(By.tagName("a"));
		
		//7.css selector
		//css=(Html tag )(#) (value of the ID attribute)
		//WebElement css = driver.findElement(By.cssSelector("input#userpassword"));
		//driver.findElement(By.ByCssSelector("html#id"))
	}

}
