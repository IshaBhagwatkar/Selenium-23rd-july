package sreenshot_topic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshoteg1 {



	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Isha\\Downloads\\Isha-23 july velocity selenium tool\\chromedriver.exe\\" );
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
	
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String s=RandomString.make(3);
		
		File dest=new File("C:\\Users\\Isha\\Downloads\\Isha-23 july velocity selenium tool\\Screenshots\\test"+s+".png");
		
		FileHandler.copy(source, dest);
		
		
		
		
		
		
		
		
		
		
	}

}
