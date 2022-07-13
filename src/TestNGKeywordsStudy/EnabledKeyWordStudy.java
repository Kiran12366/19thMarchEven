package TestNGKeywordsStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledKeyWordStudy {

	@Test 
	public void v() {
		Reporter.log("username validation successfull",true);
	}
	@Test (enabled = false)
	public void z() {
		Reporter.log("dashboard validation successfull",true);
	}
	@Test 
	public void e() {
		Reporter.log("username validation successfull",true);
	}
	@Test 
	public void a() {
		Reporter.log("username validation successfull",true);
	}
	

}
