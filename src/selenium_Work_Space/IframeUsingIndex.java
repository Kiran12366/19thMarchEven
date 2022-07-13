package selenium_Work_Space;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeUsingIndex {

	public static void main(String[] args) throws InterruptedException {
		//4.index
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		 driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).click();
		 driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("(//a[@target='classFrame'])[3]")).click();
	}

}
