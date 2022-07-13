package listener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;


public class Listener implements ITestListener {
 @Override
 public void onTestSuccess(ITestResult result) {
	 Reporter.log("TC is passed successfully",true);
	 result.getName();
	 Reporter.log("Name of Test method completed suceess is"+result.getName(),true);
 }
 public void onTestFailed(ITestResult result) {
	 Reporter.log("TC is failed ",true);
	 result.getName();
	 Reporter.log("Name of Test method failed is"+result.getName(),true);
 }
 public void onTestSkipped(ITestResult result) {
	 Reporter.log("TC is skipped",true);
	 result.getName();
	 Reporter.log("Name of Test method skipped is"+result.getName(),true);
 }
}
