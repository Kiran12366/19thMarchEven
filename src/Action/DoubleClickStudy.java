package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickStudy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\\\selenium\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Actions act=new Actions(driver);
		WebElement doubleclick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		//method 1
		//act.click(doubleclick).perform();
		//Thread.sleep(1000);
	//	act.moveToElement(doubleclick).doubleClick().build().perform();
		//method 2
	//act.moveToElement(doubleclick).doubleClick().build().perform();
		//method 3
		//act.doubleClick(doubleclick).perform();
		
		
	}
	

}
