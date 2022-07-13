package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_Study {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\\\selenium\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Actions act = new Actions(driver);
		WebElement click = driver.findElement(By.xpath("//span[text()='right click me']"));
		// 1. method
		// act.moveToElement(rightClickButton).perform();// moved mouse to desired
		// location
//				 act.moveToElement(click).contextClick().build().perform();
//			 WebElement clickQuit = driver.findElement(By.xpath("//span[text()='Quit']"));
//			 act.moveToElement(clickQuit).contextClick().build().perform();

		// 2. method
		// act.contextClick(rightClickButton).perform();
		act.contextClick(click).perform();
		WebElement clickQuit = driver.findElement(By.xpath("//span[text()='Quit']"));
		act.contextClick(clickQuit).perform();

	}

}
