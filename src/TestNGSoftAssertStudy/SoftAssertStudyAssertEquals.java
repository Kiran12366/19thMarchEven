package TestNGSoftAssertStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertStudyAssertEquals {
	SoftAssert soft = new SoftAssert();

	@Test
	public void TC1() {

		String s1 = "vctc";
		String s2 = "vctc";

		soft.assertEquals(s1, s2,"not matching TC failed");
		Reporter.log("matching TC pass",true);
		
		String s3 = "vCtc";
		String s4 = "vctc";
		// assertnotequals
		soft.assertNotEquals(s3, s4, "s3 and s4 are matching TC failed");
		Reporter.log("s1 and s2 are not equal tc pass", true);
		soft.assertAll();
		
	}
//	@Test
//	public void TC8() {
//		String s1 = "vCtc";
//		String s2 = "vctc";
//		// assertnotequals
//		s.assertNotEquals(s1, s2, "s1 and s2 are matching TC failed");
//		Reporter.log("s1 and s2 are not equal tc pass", true);
//	}

//	@Test
//	public void TC2() {
//		Boolean result = true;
//
//		// asserttrue
//		s.assertTrue(result, " result is false TC fail ");
//		Reporter.log("result is  true and tc is pass", true);
//	}
//
//	public void TC3() {
//		// assertfalse
//		Boolean result1 = false;
//		s.assertFalse(result1, "result is true TC fail ");
//		Reporter.log("result1 is true TC pass", true);
//	}
//
//	@Test
//	public void TC4() {
//		// null
//		String str = null;
//
//		s.assertNull(str, "str is null TC failed");
//		Reporter.log("str is null TC pass", true);
//	}
//
//	public void TC5() {
//		// notnull
//		String str1 = "REAL";
//		s.assertNotNull(str1, "str1  is null TC failed ");
//		Reporter.log("str1 is not null TC pass");
//
//	}
//
//	@Test
//	public void TC6() {
//		Reporter.log("assert fail check", true);
//		s.fail();
//		Reporter.log("assert is running", true);
//		s.assertAll();
//	}
	

}
