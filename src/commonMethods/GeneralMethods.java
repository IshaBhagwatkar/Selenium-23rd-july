package commonMethods;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class GeneralMethods 
{
	
	public static void scrollIntoView(WebDriver driver,WebElement element)
	{
		JavascriptExecutor	js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",element);
	}

	public static void takeScreenshot(WebDriver driver,String fileName) throws IOException, InterruptedException
	{
		Thread.sleep(1000);
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\Isha\\Downloads\\Isha-23 july velocity selenium tool\\Screenshots\\test"+fileName+".png");
		FileHandler.copy(src, dest);
	}
	
	public static void WaitTest(WebDriver driver, int waitTime)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(waitTime));
	}
	
}
