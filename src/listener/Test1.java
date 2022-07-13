package listener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners (listener.Listener.class)
public class Test1 {
  @Test
  public void MyMethod() {
	  Reporter.log("TC is passed successfully",true);
  }
  @Test
  public void Method1() {
	  Assert.fail();
	  
  }
  @Test (dependsOnMethods = {"Method1"})
  public void f() {
	  Reporter.log("TC is skipped",true);
  }
 
}
