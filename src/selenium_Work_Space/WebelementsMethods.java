package selenium_Work_Space;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementsMethods {
//click
	public static void main(String[] args) throws InterruptedException {
		// boolean flag =false;
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		boolean isfocused = true;
		driver.get("https://in.bookmyshow.com/explore/home/mumbai");
	 String str = driver.findElement(By.xpath("//div[text()='Sign in']")).getText();
// str.getText();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//label[@for='mobileNo']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[text()='Not Now']")).click();
//		Thread.sleep(3000);
//		WebElement mobileno = driver.findElement(By.xpath("//label[text()='Continue with mobile number']"));
//		System.out.println("is disabled" + mobileno.isDisplayed());
//
//		mobileno.click();
//		Thread.sleep(5000);
//		if (isfocused == true) {
//			Thread.sleep(10000);
//			driver.findElement(By.xpath("//input[@id='mobileNo']")).sendKeys("8830343872");
//			if (mobileno.isEnabled()) {
//				// System.out.println("Continue with mobile number is enabled");
//				Thread.sleep(2000);
//				driver.findElement(By.xpath("//button[text()='Continue']")).click();
//			} else {
//				Thread.sleep(10000);
//				driver.findElement(By.xpath("//input[@id='mobileNo']")).sendKeys("8830343872");
//				Thread.sleep(2000);
//				driver.findElement(By.xpath("//button[text()='Continue']")).click();
//			}
//		} else {
//			driver.findElement(By.xpath("//label[@for='mobileNo']")).click();
//
//		}

	}
	

}
