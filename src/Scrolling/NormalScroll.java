package Scrolling;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NormalScroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		//1 normal way 
//		JavascriptExecutor e= (JavascriptExecutor)driver;
//		e.executeScript("window.scrollBy(90,799)");
		 
		//2 specific position scroll
		
			WebElement mouse = driver .findElement(By.id("mousehover"));
			JavascriptExecutor e1=(JavascriptExecutor)driver;
			e1.executeScript("arguments[0].scrollIntoView(true)",mouse);
			
			
			
		
	}

}
