package Base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import UtilityClass.KiteAppUsingProperties;

public class KiteAppBaseUsingProperties   {
	public static WebDriver driver;

public void OpenBrowser() throws IOException {
	System.setProperty("webdriver.chrome.driver","F:\\selenium\\chromedriver.exe");
	driver=new ChromeDriver();
	//driver.get("https://kite.zerodha.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));
	driver.get(KiteAppUsingProperties.getDatafromPropertyfile("URL"));
}




}

