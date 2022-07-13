package TestNG;


import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import Base.KiteAppBaseUsingProperties;
import POM.KiteHomePage;
import POM.KiteLoginPage;
import POM.KitePinPage;
import UtilityClass.KiteAppUsingProperties;
@Listeners (TestNG.Listiner.class)
public class ValidateKiteAppUsingProperties extends KiteAppBaseUsingProperties {
	KiteHomePage home;
	KiteLoginPage login;
	KitePinPage pin;
	String tcid;

	@BeforeClass
	public void launchBrower() throws IOException {
		OpenBrowser();

		home = new KiteHomePage(driver);
		login = new KiteLoginPage(driver);
		pin = new KitePinPage(driver);

	}

	@BeforeMethod
	public void KiteAppLogin() throws IOException {

		login.sendUserId(KiteAppUsingProperties.getDatafromPropertyfile("UN"));
		login.sendUserPassword(KiteAppUsingProperties.getDatafromPropertyfile("PWD"));
		login.clickOnLoginButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

		pin.sendPin(KiteAppUsingProperties.getDatafromPropertyfile("PIN"));
		pin.clickOnContinueButton();
		
	}

	@Test
	public void ValidateUserId() throws IOException {
		tcid ="202";
//		String actualuserid = home.getActualUserId();
//		String expecteduserid = KiteAppUsingProperties.getDatafromPropertyfile("UN");
//		Assert.assertEquals(actualuserid, expecteduserid,"failed both result are different");
//		Reporter.log("tc is pass....",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		Assert.fail();
	}

	@AfterMethod
	public void logoutFromKiteApp(ITestResult result) throws InterruptedException, IOException {
     if(result.getStatus()==ITestResult.FAILURE) {
    	 KiteAppUsingProperties.getScreenShot(driver, tcid);
     }
		home.logout();
	}

	@AfterClass
	public void closeKiteApp() {
		driver.close();
	}

}