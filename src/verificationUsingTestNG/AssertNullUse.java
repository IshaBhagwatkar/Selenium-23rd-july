package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNullUse {
  @Test
  public void AssertNullTest() 
  {
	  
	  String a= null;
	  Assert.assertNull(a,"TC is failed if a is not null");
	  
	  
	  
	  
	  
  }
}
