package sreenshot_topic;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class ScreenShot_DateTime {

	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Isha\\Downloads\\Isha-23 july velocity selenium tool\\chromedriver.exe\\" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(source);
		
		Calendar cal = Calendar.getInstance();
		Date time = cal.getTime();
		System.out.println(time);
		String timeStamp = time.toString().replace(":", "").replace(" ", "");
		System.out.println(timeStamp);
		File dest=new File("C:\\Users\\Isha\\Downloads\\Isha-23 july velocity selenium tool\\Screenshots\\test"+timeStamp+".png");
		FileHandler.copy(source, dest);
		
		
		
		
		
		
		
		
		
		
		

	}

}
