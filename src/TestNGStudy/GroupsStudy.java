package TestNGStudy;

import org.testng.Reporter;

import org.testng.annotations.Test;

public class GroupsStudy {
	@Test (groups = "sanity")
	public void v() {
		Reporter.log("username validation successfull",true);
	}
	@Test (groups = "regression")
	public void z() {
		Reporter.log("dashboard validation successfull",true);
	}
	@Test (groups = "sanity")
	public void e() {
		Reporter.log("username validation successfull",true);
	}
	@Test (groups = "regression")
	public void a() {
		Reporter.log("username validation successfull",true);
	}
	


}