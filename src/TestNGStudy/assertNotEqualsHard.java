package TestNGStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class assertNotEqualsHard {
  @Test
 public void TC1() 
  
  {
  String ExpectedResult="VCTCPune";
  String ActualResult="VCTC";
  
  Assert.assertNotEquals(ExpectedResult, ActualResult,"result is  matching TC is failed");
  Reporter.log("tc is pass",true);
 
  }
}
