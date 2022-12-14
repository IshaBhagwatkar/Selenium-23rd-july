package crossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FireFoxTest {
  @Test
  public void firefox() throws InterruptedException 
  {
	  
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\Isha\\Downloads\\Isha-23 july velocity selenium tool\\geckodriver.exe");
	  WebDriver driver=new FirefoxDriver(); 
	  driver.manage().window().maximize();
	  driver.get("https://paytm.com/");
	  Thread.sleep(1000);
  }
}
