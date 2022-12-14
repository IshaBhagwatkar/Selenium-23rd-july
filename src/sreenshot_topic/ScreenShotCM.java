package sreenshot_topic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


public class ScreenShotCM 
{
	public static void takeScreenshot(WebDriver driver,String fileName) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		

		
		File dest=new File("C:\\Users\\Isha\\Downloads\\Isha-23 july velocity selenium tool\\Screenshots\\test"+fileName+".png");
		
		FileHandler.copy(src, dest);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
