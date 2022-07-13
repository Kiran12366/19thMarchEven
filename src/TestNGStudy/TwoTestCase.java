package TestNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TwoTestCase {
  @Test
  public void kiteUserName() {
	  
	  System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://kite.zerodha.com/");
	  System.out.println("hello this is my new project it will be displayed on console");
	  Reporter.log("hello it will be displayed on report only");
	  Reporter.log("hello it will be displayed in report and console both",true);
  }
  
  @Test
  public void kitePinPage() {
	  Reporter.log("hello this is second test case ",true);
  }
  
  
}
