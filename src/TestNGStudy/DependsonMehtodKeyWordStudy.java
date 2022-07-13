package TestNGStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DependsonMehtodKeyWordStudy {
	@Test 
	public void validateUserName() {
		Reporter.log("username validation successfull",true);
	}
	@Test(dependsOnMethods = "validateUserName")
	public void validateDashBoard() throws InterruptedException {
		Reporter.log("dashboard validation successfull",true);
		Thread.sleep(1000);
	}
	@BeforeMethod
	public void loginKiteApp() {
		Reporter.log("loginkite  successfull",true);
	}
	
	@AfterMethod
	public void logoutKiteApp() {
		Reporter.log("logged out",true);
	}
	@BeforeClass
	public void launchBrower() {
		Reporter.log(" launching Brower successfull",true);
	}
	
	@AfterClass
	public void closeBrowser() {
		Reporter.log("close browser successfull",true);
	}






}
