package KiteUsingTestNGandPOM;

import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KiteTesClassUsingTestNG {
	WebDriver driver;
	KiteLoginPage login;
	KitePinPage pin;
	KiteHomePage home;
	Sheet sheet11;

	@Test
	public void ValidateUserId() {
		String Expecteduid = sheet11.getRow(0).getCell(0).getStringCellValue();
		String Actualuid = home.getActualUserId();
		Reporter.log("Validating UserName", true);

		Assert.assertEquals(Actualuid, Expecteduid, "Actual and Expected UN are not matching TC failed");
		Reporter.log("Actual and Expected UN are matching TC PASSED", true);
	}

	@BeforeMethod
	public void loginKiteApp() throws EncryptedDocumentException, IOException {

		String uid = sheet11.getRow(0).getCell(0).getStringCellValue();
		String pwd = sheet11.getRow(0).getCell(1).getStringCellValue();
		String pinn = sheet11.getRow(0).getCell(2).getStringCellValue();
		login.sendUserId(uid);
		login.sendUserPassword(pwd);
		login.clickOnLoginButton();
		Reporter.log("click on login button", true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		pin.sendPin(pinn);
		pin.clickOnContinueButton();
		Reporter.log("click on continue button");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

	}

	@AfterMethod
	public void LogOutKiteApp() throws InterruptedException {
		home.logout();
	}

	@BeforeClass
	public void LaunchBrowser() throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		Reporter.log("launching browser", true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		File f = new File("F:\\excel\\Account.xlsx");
		sheet11 = WorkbookFactory.create(f).getSheet("sheet1");
		login = new KiteLoginPage(driver);
		pin = new KitePinPage(driver);
		home = new KiteHomePage(driver);

	}

	@AfterClass
	public void CloseBrowser() throws InterruptedException {
		Thread.sleep(1000);
		Reporter.log("Closing browser", true);
		driver.close();

	}
}
