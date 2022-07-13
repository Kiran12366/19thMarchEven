package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\\\selenium\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement sourceElement =driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement destinationElement = driver.findElement(By.xpath("(//div[@class='ui-widget-content'])[5]"));
		Actions act=new Actions(driver);
		Thread.sleep(1000);
		//1 method
		//act.dragAndDrop(sourceElement, destinationElement).perform();
		//2 method
		//act.moveToElement(sourceElement).clickAndHold().moveToElement(destinationElement).release().build().perform();
		//3 method
		act.dragAndDrop(sourceElement, destinationElement).perform();
		
	}

}
