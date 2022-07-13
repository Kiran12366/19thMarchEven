package selenium_Work_Space;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CherCherTech {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
//		driver.switchTo().frame(0);
//		Thread.sleep(1000);
		driver.findElement(By.tagName("input")).sendKeys("xyz");
		Thread.sleep(1000);
		driver.switchTo().frame("frame3");
		Thread.sleep(1000);
		driver.findElement(By.id("a")).click();
//		Thread.sleep(1000);
//		driver.switchTo().defaultContent();
//		driver.switchTo().frame("frame2");
//		WebElement dropdown = driver.findElement(By.id("animals"));
//		Thread.sleep(1000);
//		Select s = new Select(dropdown);
//		Thread.sleep(1000);
//		s.selectByVisibleText("Big Baby Cat");
//		Thread.sleep(1000);
//		driver.switchTo().defaultContent();
//		Thread.sleep(1000);
//		WebElement Text = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']"));
//		System.out.println(Text.getText());
		// driver.quit();

	}

}
