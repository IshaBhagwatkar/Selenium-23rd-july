package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEqualsUse {
  @Test
  public void AssertEqualsTest() 
  {
	  
	  String a="abc";
	  String b="abcd";

	  Assert.assertEquals(a,b,"TC is failed if a and b are not equals");
	  
	  
	  
	  
	  
  }
}
