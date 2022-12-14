package sreenshot_topic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;



public class SS2 {

	public static void main(String[] args) throws InterruptedException, IOException 
	{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Isha\\Downloads\\Isha-23 july velocity selenium tool\\chromedriver.exe\\" );
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(1000);
		//Byte b=(byte)a;
		
	
		File source1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		System.out.println(source1);
		
	
		File destination=new File("C:\\Users\\Isha\\Downloads\\Isha-23 july velocity selenium tool\\Screenshots\\myScreenshot.jpg");
		
		FileHandler.copy(source1, destination);
		
		

	}

}
