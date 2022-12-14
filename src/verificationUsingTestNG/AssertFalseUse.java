package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertFalseUse {
  @Test
  public void AssertFalseTest() 
  {
	  
	  boolean a=true;
	  Assert.assertFalse(a,"TC is failed if a  true");
	  
	  
	  
	  
	  
  }
}
