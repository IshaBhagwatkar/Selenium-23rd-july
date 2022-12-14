package softasserts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertequals 
{
	SoftAssert soft=new SoftAssert();
  @Test
  public void testing()
  {
	  String a="abc";
	  String b="abc";
	  String c="abc2";

	  soft.assertEquals(a,b,"A an B are not equal TC failed");
	  
	  soft.assertEquals(b,c,"B an C are not equal TC failed");
	  soft.assertAll();
	   
  }
}
