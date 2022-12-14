package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotNullUse {
  @Test
  public void AssertNotNullTest() 
  {
	  
	  String a= "isha";
	  Assert.assertNotNull(a,"TC is failed if a is  null");
	  
	  
	  
	  
	  
  }
}
