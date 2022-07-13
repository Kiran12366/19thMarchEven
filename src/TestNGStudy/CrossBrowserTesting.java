package TestNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {

	@Parameters("browserName")

	@Test
	public void CT(String name) throws InterruptedException {
		WebDriver driver = null;
		if (name.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "F:\\selenium\\geckodriver.exe");
			driver = new FirefoxDriver();

		} else if (name.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		driver.get("https://vctcpune.com/selenium/practice.html");

		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();

	}
}
