package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class KiteBaseClass {
	
	protected WebDriver driver;
	public void openBrowser() {
	System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://kite.zerodha.com/");
	Reporter.log("launching browser", true);
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
}}
