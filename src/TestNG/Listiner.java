package TestNG;



import java.io.IOException;

import org.testng.ITestListener;
import org.testng.Reporter;
import org.testng.ITestResult;

import Base.KiteAppBaseUsingProperties;
import UtilityClass.KiteAppUsingProperties;

public class Listiner extends KiteAppBaseUsingProperties implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		try {
			KiteAppUsingProperties.getScreenShot(driver, result.getName());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("TC is passed successfully", true);
		result.getName();
		Reporter.log("Name of Test method completed suceess is" + result.getName(), true);
	}
}