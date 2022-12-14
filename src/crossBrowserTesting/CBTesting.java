package crossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CBTesting {
	@Parameters("browserName")
	@Test
  public void browserTest(String bName) 
  {
		WebDriver driver=null;
		if(bName.equals("chrome"))
	  
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Isha\\Downloads\\Isha-23 july velocity selenium tool\\geckodriver.exe");
			 driver=new FirefoxDriver(); 
		}
	  
		else if(bName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Isha\\Downloads\\Isha-23 july velocity selenium tool\\geckodriver.exe");
			  driver=new FirefoxDriver(); 
		}
	  
		driver.manage().window().maximize();
		  driver.get("https://paytm.com/");
	  
	  
	  
	  
	  
	  
	  
  }
}
