package TestNGStudy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNullUseHard {
  @Test
  public  void Tc1(){
	  String s="hello";
	  String s2=null;
	  //null
	  Assert.assertNull(s2,"it is not null and tc  failed");
	  //notnull
	  Assert.assertNotNull(s, "it is null and tc  failed ");
  }
}
