package TestNGKeywordsStudy;

import org.testng.Reporter;

import org.testng.annotations.Test;

public class PriorityKeywordStudy {
	@Test (priority = -1)
	public void v() {
		Reporter.log("username validation successfull",true);
	}
	@Test (priority = 1)
	public void z() {
		Reporter.log("dashboard validation successfull",true);
	}
	@Test (priority = -2)
	public void e() {
		Reporter.log("username validation successfull",true);
	}
	@Test 
	public void a() {
		Reporter.log("username validation successfull",true);
	}
	


}
