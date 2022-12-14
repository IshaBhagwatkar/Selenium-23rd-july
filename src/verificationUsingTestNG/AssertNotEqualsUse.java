package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotEqualsUse {
  @Test
  public void AssertNotEqualsTest() 
  {
	  
	  String a="PUNE";
	  String b="MUMBAI";

	  Assert.assertNotEquals(a,b,"TC is failed if a and b are  equals");
	  
	  
	  
	  
	  
  }
}
