package softasserts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertDrawback {
  @Test
  public void testing() 
  {
	  String a="abc1";
	  String b="null";
	  
	  
	  Assert.assertNotNull(b, "b is  null TC failed");
	  
	  Assert.assertEquals(a,b, "a and b are not equal TC is failed");
	  
	  
	  
	  
  }
}
