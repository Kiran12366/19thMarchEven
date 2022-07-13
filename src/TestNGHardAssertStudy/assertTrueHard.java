package TestNGHardAssertStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class assertTrueHard {
 
  
	  @Test
	  public void myMethod()
	  {
	  boolean a = true;
	  boolean b = false;

	  // TC should pass if value is true
      //true
	  Assert.assertTrue(a,"TC is failed value is FALSE");
	  Reporter.log("TC is passed value is true",true);
	  
	  //false
	  Assert.assertFalse(b,"TC is failed value is FALSE");
	  Reporter.log("TC is passed value is false",true);
}
}