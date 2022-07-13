package KiteApp_POM_Study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KitePageTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		Kite_LoginPage login=new Kite_LoginPage(driver);
		login.SendUserName();
		login.SendPasWord();
		login.ClickOnLoginButton();
		Thread.sleep(1000);
		Kite_PinPage pin=new Kite_PinPage(driver);
		pin.SendPin();
		Thread.sleep(1000);
		pin.ClickOnContinueButton();
		Thread.sleep(1000);
		Kite_HomePage home=new Kite_HomePage(driver);
		home.ClickOnUserId();
		home.ClickOnLogOutButton();
		
		
	}

}
