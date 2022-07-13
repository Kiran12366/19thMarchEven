package ExcelReading;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteUserIdTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		WebElement UN = driver.findElement(By.id("userid"));
		WebElement PWD = driver.findElement(By.id("password"));
		WebElement LoginButton = driver.findElement(By.xpath("//button[@type='submit']"));

		UN.sendKeys("ELR321");
		PWD.sendKeys("Dhana1111");
		LoginButton.click();
		Thread.sleep(1000);
		WebElement PIN = driver.findElement(By.id("pin"));
		PIN.sendKeys("982278");
		WebElement ContinueButton = driver.findElement(By.xpath("//button[@type='submit']"));
		ContinueButton.click();
		Thread.sleep(1000);
		WebElement uid = driver.findElement(By.xpath("//span[@class='user-id']"));

		Thread.sleep(1000);
		String ExceptedUserId = uid.getText();
		String ActualUserId = "ELR321";
		if (ExceptedUserId.equals(ActualUserId)) {
			System.out.println("User ID matching TC is PASSED");
		} else {
			System.out.println("User ID not matching TC is PASSED");
		}
		Thread.sleep(1000);
		uid.click();

		WebElement Logout = driver.findElement(By.xpath("//a[@target='_self']"));
		Logout.click();

	}

}
