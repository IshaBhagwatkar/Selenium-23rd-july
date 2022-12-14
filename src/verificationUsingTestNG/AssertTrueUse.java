package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrueUse {
  @Test
  public void AssertTrueTest() 
  {
	  
	  boolean a=true;
	  Assert.assertTrue(a,"TC is failed if a  false");
	  
	  
	  
	  
	  
  }
}
