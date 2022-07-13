package TestNG;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.KiteBaseClass;
import POM.KiteHomePage;
import POM.KiteLoginPage;
import POM.KitePinPage;
import UtilityClass.KiteAppUtilityClass;

public class ValidateKiteUserID extends KiteBaseClass {
	KiteLoginPage login;
	KitePinPage pin;
	KiteHomePage home;

	@BeforeClass
	public void launchBrowser() {
		openBrowser();
		login = new KiteLoginPage(driver);
		pin = new KitePinPage(driver);
		home = new KiteHomePage(driver);
	}

	@BeforeMethod
	public void LoginKiteApp() throws EncryptedDocumentException, IOException {
		login.sendUserId(KiteAppUtilityClass.ExcelSheet(0, 0));
		login.sendUserPassword(KiteAppUtilityClass.ExcelSheet(0, 1));
		login.clickOnLoginButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		pin.sendPin(KiteAppUtilityClass.ExcelSheet(0, 2));
		pin.clickOnContinueButton();
	}

	@Test
	public void ValidateUserId() throws EncryptedDocumentException, IOException {
		Assert.assertEquals(home.getActualUserId(), KiteAppUtilityClass.ExcelSheet(0, 0),
				"Actual and Expected are not matching TC is failed");

	}
	

	@AfterMethod
	public void logoutKiteApp() throws InterruptedException {
		home.logout();
	}
	@AfterClass
	public void closeBrowser() {
		driver.close();
	}

}
