package TestNGStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertEqualsMethodHard {
  @Test
  public void TC1() 
  
  {
  String ExpectedResult="VCTCPune";
  String ActualResult="VCTC";
  
  Assert.assertEquals(ExpectedResult, ActualResult,"result is not matching TC is failed");
  Reporter.log("tc is pass",true);
 
  }

}
