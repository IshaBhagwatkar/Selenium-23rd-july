package waitInSelenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class WaitCommonMethod 
{
	
	
	public static void WaitTest(WebDriver driver, int waitTime)
	
	{
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(waitTime));
		
	
		
	}
	
	
	
	
	

}
