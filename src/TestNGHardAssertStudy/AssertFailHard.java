package TestNGHardAssertStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertFailHard {
  @Test
  public void TC7() 
  
  {
 Reporter.log("Assert fail check", true);
 Assert.fail();
 Reporter.log("TC7 is running", true);
  }
  @Test
  public void test2()
  {
  Reporter.log("Hello", true); // output- Passed
  }

}
