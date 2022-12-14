package testNGgrpoups;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testing4 {
  @Test(groups = {"un","funds"})
  public void A()
	 {
	 Reporter.log("A TC is running", true);
	 }
	@Test
	 public void C() throws InterruptedException
	 {
	 Reporter.log("C TC is running", true);
	 }
	@Test(groups="un")
	 public void D()
	 {
	 Reporter.log("D TC is running", true);
	 }
	@Test(groups="funds")
	 public void B()
	 {
	
	Reporter.log("B TC is running", true);
	 }
}
